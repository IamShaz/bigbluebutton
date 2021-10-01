package org.bigbluebutton.api.model.constraint;

import org.bigbluebutton.api.model.validator.GetChecksumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = GetChecksumValidator.class)
@Target(TYPE)
@Retention(RUNTIME)
public @interface GetChecksumConstraint {

    String message() default "checksumError-Checksums do not match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
