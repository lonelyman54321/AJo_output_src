/*
 * Decompiled with CFR 0.152.
 */
package javax.annotation;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public class Nonnull$Checker
implements TypeQualifierValidator {
    public When forConstantValue(Nonnull nonnull, Object object) {
        if (object == null) {
            return When.NEVER;
        }
        return When.ALWAYS;
    }
}

