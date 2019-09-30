package mn.validation.issue

import groovy.transform.CompileStatic

@CompileStatic
class DefaultSimpleService implements SimpleService {

    @Override
    Long parseLong(@NumberString CharSequence sequence) {
        return sequence ?  Long.valueOf(sequence.toString(), 10) : 0L
    }
}
