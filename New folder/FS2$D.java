/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$D
extends Lambda
implements Function1 {
    public static final FS2$D c;

    static {
        FS2$D fS2$D;
        c = fS2$D = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        int n3 = (Integer)object;
        Jj3 jj3 = new Jj3(n3);
        return jj3;
    }
}

