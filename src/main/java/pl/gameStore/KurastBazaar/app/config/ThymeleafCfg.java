package pl.gameStore.KurastBazaar.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafCfg extends WebMvcConfigurerAdapter {

    /**
     * ***********ClassLoaderTemplateResolver templateResolver()*******************
     * W metodzie templateResolverktorej definiujemy nasze szablony.
     * templateResolver.setCacheable(false); linijka ta mówi czy mamy cache'owac dane.
     * templateResolver.setSuffix(".html"); rozszerzenie dla templatek
     */
    @Bean
    @Description("Thymeleaf templates resolver serving HTML 5")
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setCacheable(false);
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }


    /**
     * Metoda ta tlumaczy atrybuty Thymeleafa na zrodla strony internetowej.
     *
     * @return
     */
    @Bean
    @Description("Thymeleaf templates engine with Spring integration")
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    @Bean
    @Description("Thymeleaf view resolver")
    public ViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }

    /******addViewControllers**************
     Jezeli jest "/" to przekieruj na "/rune"
     Jezeli jest /rune/costam_costam to przekieruj na "/rune"
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/rune");
    }
}
