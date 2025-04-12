/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import kotlin.jvm.internal.Intrinsics;

public final class tw
implements uj2_1 {
    public final i a;
    public final kotlinx.coroutines.i b;

    public tw(i i3, kotlinx.coroutines.i i8) {
        this.a = i3;
        this.b = i8;
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    public final void a() {
        this.a.c(this);
    }

    public final void onDestroy(mu1_1 mu1_12) {
        this.b.d(null);
    }

    public final /* synthetic */ void onStart(mu1_1 mu1_12) {
        im0.c(mu1_12);
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final /* synthetic */ void p(mu1_1 mu1_12) {
        im0.b(mu1_12);
    }

    public final void start() {
        this.a.a(this);
    }

    public final /* synthetic */ void u() {
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }
}

