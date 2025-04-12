/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class qr1$b
extends Lambda
implements Function1 {
    public static final qr1$b c;

    static {
        qr1$b qr1$b;
        c = qr1$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        int n3 = ((Number)object.get(0)).intValue();
        int n4 = ((Number)object.get(1)).intValue();
        qr1_0 qr1_02 = new qr1_0(n3, n4);
        return qr1_02;
    }
}

