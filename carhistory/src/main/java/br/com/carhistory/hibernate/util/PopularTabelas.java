package br.com.carhistory.hibernate.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

public class PopularTabelas {
	
	private static final Logger LOGGER = Logger.getLogger(PopularTabelas.class);
	
	private File[] loadScripts(){
		File arquivos[] = null;
		
		final File file = new File(getClass().getResource("/br/com/carhistory/hibernate/scripts").getFile());
		if (file.exists()){
			arquivos = file.listFiles();
		}
		
		return arquivos;
	}
	
	@Transactional
	public static void main(final String[] args) throws Exception {
		final EntityManager manager = DaoFactory.entityManagerFactoryInstance().createEntityManager();
		
		final PopularTabelas pt = new PopularTabelas();
		final File[] arquivos = pt.loadScripts();
		if (arquivos != null) {
			String linha = new String();
			final StringBuilder stb = new StringBuilder();
			for (final File file : arquivos) {
				final FileReader fr = new FileReader(file);
				final BufferedReader bfr = new BufferedReader(fr);
				while ((linha = bfr.readLine()) != null){
					stb.append(linha);
				}
				bfr.close();
				
				final String[] statements = stb.toString().split(";");
				for (final String string : statements) {
					manager.getTransaction().begin();
					try {
						final Query q = manager.createNativeQuery(string.trim());
						final int affectedRows = q.executeUpdate();
						LOGGER.info(affectedRows + " - Linhas afetadas");
						manager.getTransaction().commit();
					} catch (final Exception e) {
						manager.getTransaction().rollback();
						LOGGER.error("Erro ao executar o Script ["+string.trim()+"]", e);
					}
				}
			}
			manager.close();
			System.exit(0);
		}
		
		
	}

}
