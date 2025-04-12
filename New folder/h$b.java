/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class h$b
implements jm0_1 {
    public final /* synthetic */ bl_2 a;

    public h$b(bl_2 bl_22) {
        this.a = bl_22;
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    public final void onDestroy(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void onStart(mu1_1 object) {
        object = tl2_2.b;
        object = Unit.a;
        this.a.resumeWith(object);
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final /* synthetic */ void p(mu1_1 mu1_12) {
        im0.b(mu1_12);
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }
}

