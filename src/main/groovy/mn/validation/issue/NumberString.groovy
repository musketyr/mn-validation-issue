package mn.validation.issue

import groovy.transform.CompileStatic

import javax.validation.Constraint
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@CompileStatic
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = [])
@interface NumberString {

    String message() default "Value {{validatedValue}} contains non-numeric characters"

}