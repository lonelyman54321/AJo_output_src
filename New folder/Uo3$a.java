/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class Uo3$a
extends Uo3 {
    public final i0_0 a;

    public Uo3$a(cp3_0 cp3_02) {
        Intrinsics.checkNotNullParameter(cp3_02, "mTopicsManager");
        this.a = cp3_02;
    }

    public ListenableFuture b(mZ0 mZ02) {
        Intrinsics.checkNotNullParameter(mZ02, "request");
        Object object = ir0_2.a;
        object = d.a(bg1_1.a);
        Uo3$a$a uo3$a$a = new Uo3$a$a(this, mZ02, null);
        return w90.a(Ae3.a((i90_0)object, null, uo3$a$a, 3));
    }
}

