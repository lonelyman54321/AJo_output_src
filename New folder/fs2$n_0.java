/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$n
 */
public final class fs2$n_0
extends Lambda
implements Function1 {
    public static final fs2$n_0 c;

    static {
        fs2$n_0 fs2$n_0;
        c = fs2$n_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
        int n3 = (Integer)object;
        tv0_0 tv0_02 = new tv0_0(n3);
        return tv0_02;
    }
}

