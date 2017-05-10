package br.com.crmob.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.crmob.dao.UsuarioService;

@EnableWebMvcSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/pessoas/form").permitAll()
			.antMatchers("/carrinho/**").permitAll()
			.antMatchers(HttpMethod.GET, "/pessoas").permitAll()
//			.hasRole("ADMIN")
			.antMatchers(HttpMethod.POST, "/pessoas").permitAll()
//			.hasRole("ADMIN")
			.antMatchers("/pessoas/**").permitAll()
			.antMatchers("/usuarios/**").permitAll()
			.antMatchers("/resources/**").permitAll()
			.antMatchers("/").permitAll()
//			.anyRequest().authenticated()
			.and().formLogin().loginPage("/login").permitAll()
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioService).passwordEncoder(new BCryptPasswordEncoder());
	}

}
