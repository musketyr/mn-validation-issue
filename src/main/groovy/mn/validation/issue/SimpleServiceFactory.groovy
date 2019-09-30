package mn.validation.issue

import groovy.transform.CompileStatic
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory

import javax.inject.Singleton

@Factory
@CompileStatic
class SimpleServiceFactory {

    @Bean
    @Singleton
    SimpleService simpleService() {
        return new DefaultSimpleService()
    }

}
