package mn.validation.issue

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory

import javax.inject.Singleton
import javax.validation.ConstraintValidator

@Factory
class NumberStringValidatorFactory {

    @Bean
    @Singleton
    ConstraintValidator<NumberString, CharSequence> numberStringValidator() {
        return  { CharSequence value, annotationMetadata, context ->
            value == null || value.toString().matches(/\d*/)
        }
    }

}
