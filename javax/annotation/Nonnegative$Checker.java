/*
 * Decompiled with CFR 0.152.
 */
package javax.annotation;

import javax.annotation.Nonnegative;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public class Nonnegative$Checker
implements TypeQualifierValidator {
    public When forConstantValue(Nonnegative nonnegative, Object object) {
        block5: {
            block6: {
                int n3;
                block8: {
                    block7: {
                        block4: {
                            n3 = object instanceof Number;
                            if (n3 == 0) {
                                return When.NEVER;
                            }
                            n3 = (object = (Number)object) instanceof Long;
                            if (n3 == 0) break block4;
                            long l2 = ((Number)object).longValue();
                            long l3 = 0L;
                            double d2 = 0.0;
                            Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                            if (object2 >= 0) break block5;
                            break block6;
                        }
                        n3 = object instanceof Double;
                        if (n3 == 0) break block7;
                        double d5 = ((Number)object).doubleValue();
                        long l4 = 0L;
                        double d7 = 0.0;
                        double d9 = d5 - d7;
                        Object object3 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                        if (object3 >= 0) break block5;
                        break block6;
                    }
                    n3 = object instanceof Float;
                    if (n3 == 0) break block8;
                    float f5 = ((Number)object).floatValue();
                    object = null;
                    float f6 = f5 - 0.0f;
                    n3 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
                    if (n3 >= 0) break block5;
                    break block6;
                }
                n3 = ((Number)object).intValue();
                if (n3 >= 0) break block5;
            }
            return When.NEVER;
        }
        return When.ALWAYS;
    }
}

