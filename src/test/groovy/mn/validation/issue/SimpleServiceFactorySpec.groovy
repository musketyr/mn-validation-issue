package mn.validation.issue

import io.micronaut.context.ApplicationContext
import spock.lang.Specification

class SimpleServiceFactorySpec extends Specification {

    void 'only one service is present'() {
        expect:
            ApplicationContext.run().getBeansOfType(SimpleService).size() == 1
    }

}
