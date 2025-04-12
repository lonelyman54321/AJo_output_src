/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ft1$b
extends Lambda
implements Function1 {
    public static final ft1$b c;

    static {
        ft1$b ft1$b;
        c = ft1$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        int n3 = ((Number)object.get(0)).intValue();
        int n4 = ((Number)object.get(1)).intValue();
        ft1_2 ft1_22 = new ft1_2(n3, n4);
        return ft1_22;
    }
}

