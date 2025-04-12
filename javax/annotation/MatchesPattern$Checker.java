/*
 * Decompiled with CFR 0.152.
 */
package javax.annotation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.MatchesPattern;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public class MatchesPattern$Checker
implements TypeQualifierValidator {
    public When forConstantValue(MatchesPattern object, Object object2) {
        String string2 = object.value();
        int n3 = object.flags();
        object = Pattern.compile(string2, n3);
        n3 = (int)(((Matcher)(object = ((Pattern)object).matcher((CharSequence)(object2 = (String)object2)))).matches() ? 1 : 0);
        if (n3 != 0) {
            return When.ALWAYS;
        }
        return When.NEVER;
    }
}

