package pe.edu.cibertec.DSWII_CL1SOAP_AbelPerez.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
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
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "year")
    public DefaultWsdl11Definition paisWsdl11Definition(XsdSchema yearSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("YearPort");
        wsdl11Definition.setLocationUri("/ws/year");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(yearSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema yearSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/Año.xsd"));
    }

    @Bean(name = "calificacion")
    public DefaultWsdl11Definition calificacionWsdl11Definition(XsdSchema calificacionSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CalificacionPort");
        wsdl11Definition.setLocationUri("/ws/calificacion");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(calificacionSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema calificacionSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/Calificacion.xsd"));
    }

    @Bean(name = "perfecto")
    public DefaultWsdl11Definition perfectoWsdl11Definition(XsdSchema perfectoSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PerfectoPort");
        wsdl11Definition.setLocationUri("/ws/perfecto");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(perfectoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema perfectoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/Perfecto.xsd"));
    }

    @Bean(name = "controlAlcoholemia")
    public DefaultWsdl11Definition controlAlcoholemiaWsdl11Definition(XsdSchema controlAlcoholemiaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ControlAlcoholemiaPort");
        wsdl11Definition.setLocationUri("/ws/controlAlcoholemia");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(controlAlcoholemiaSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema controlAlcoholemiaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/ControlAlcoholemia.xsd"));
    }


}
