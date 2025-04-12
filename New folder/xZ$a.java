/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class xZ$a
extends Lambda
implements Function2 {
    public static final xZ$a c;

    static {
        xZ$a xZ$a;
        c = xZ$a = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (LP1$b)object2;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = object2.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(", ");
            stringBuilder.append(object2);
            object = stringBuilder.toString();
        }
        return object;
    }
}

