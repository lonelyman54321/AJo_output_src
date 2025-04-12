/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$h
 */
public final class fs2$h_0
extends Lambda
implements Function1 {
    public static final fs2$h_0 c;

    static {
        fs2$h_0 fs2$h_0;
        c = fs2$h_0 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        float f5 = ((Float)object).floatValue();
        Rw rw = new Rw(f5);
        return rw;
    }
}

