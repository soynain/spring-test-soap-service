package com.springsoappractice.springsoappractice.WebServiceConfig;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter{
	
	/*So we start by creating a servlet instance for the requests,
	 * so every request for the webservice is enpoints
	 * starting with /ws
	 */
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(org.springframework.context.ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}


	/*The name of the bean is the name of the extension after the /ws
	 * endpoint, so for getting the wdsl schema you just
	 * have to browse to ${your url}/ws/usuario.wdsl
	 * the target namespace doesnt affect in anything, make sure
	 * to choose a good name for the port and set the location
	 * uri
	*/
	@Bean(name="usuario")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UsuariosPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://webspring.io/gs-prod");
		wsdl11Definition.setSchema(countriesSchema);
		return wsdl11Definition;
	}

	/*Here we are reading the .xsd file schema */
	@Bean
	public XsdSchema countriesSchema() {
		return new SimpleXsdSchema(new ClassPathResource("usuario.xsd"));
	}
}
