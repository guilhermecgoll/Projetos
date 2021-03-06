package br.com.crmob.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.crmob.dao.UsuarioService;

//@EnableWebMvcSecurity
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	CustomAuthenticationSuccessHandler sucessHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/pessoas/form").permitAll()
			.antMatchers("/carrinho/**").permitAll()
			.antMatchers("/configuracoes").hasRole("ADMIN")
			.antMatchers(HttpMethod.GET, "/pessoas").permitAll()
//			.hasRole("ADMIN")
			.antMatchers(HttpMethod.POST, "/pessoas").permitAll()
//			.hasRole("ADMIN")
			.antMatchers("/pessoas/**").permitAll()
			.antMatchers("/usuarios/**").permitAll()
			.antMatchers("/resources/**").permitAll()
			.antMatchers("/home/userHome").permitAll()//TODO mudar isso depois
			.antMatchers("/").permitAll()
			.anyRequest().authenticated()
			.and().formLogin().successHandler(sucessHandler).loginPage("/login").permitAll()
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioService).passwordEncoder(new BCryptPasswordEncoder());
	}

}
