/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class KR1$a
extends Lambda
implements Function1 {
    public static final KR1$a c;

    static {
        KR1$a kR1$a;
        c = kR1$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "entry");
        StringBuilder stringBuilder = new StringBuilder("  ");
        String string2 = ((my2$a)object.getKey()).a;
        stringBuilder.append(string2);
        stringBuilder.append(" = ");
        object = object.getValue();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

