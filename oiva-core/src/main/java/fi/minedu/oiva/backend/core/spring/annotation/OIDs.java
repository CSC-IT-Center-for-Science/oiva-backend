package fi.minedu.oiva.backend.core.spring.annotation;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface OIDs {
    String ADMINISTRATOR = "ADMINISTRATOR";
    String[] value();
}
