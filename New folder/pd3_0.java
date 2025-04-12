/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

/*
 * Renamed from PD3
 */
public final class pd3_0
implements uj2_1 {
    public final ce1_0 a;
    public final pe1_0 b;
    public final nd3_0 c;
    public final i d;
    public final kotlinx.coroutines.i e;

    public pd3_0(ce1_0 ce1_02, pe1_0 pe1_02, nd3_0 nd3_02, i i3, kotlinx.coroutines.i i8) {
        this.a = ce1_02;
        this.b = pe1_02;
        this.c = nd3_02;
        this.d = i3;
        this.e = i8;
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    public final /* synthetic */ void a() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDestroy(mu1_1 object) {
        object = m.c(this.c.getView());
        synchronized (object) {
            Object object2 = ((RD3)object).c;
            if (object2 != null) {
                object2.d(null);
            }
            object2 = e01_0.a;
            c c2 = ir0_2.a;
            c2 = bg1_1.a;
            c2 = ((d21_0)c2).N0();
            qd3_0 qd3_02 = new qd3_0((RD3)object, null);
            int n3 = 2;
            ((RD3)object).c = object2 = Ae3.d((i90_0)object2, c2, null, qd3_02, n3);
            ((RD3)object).b = null;
            return;
        }
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
        Object object;
        Object object2 = this.d;
        ((i)object2).a(this);
        Object object3 = this.c;
        boolean bl2 = object3 instanceof lu1;
        if (bl2) {
            object = object3;
            object = (lu1)object3;
            ((i)object2).c((lu1)object);
            ((i)object2).a((lu1)object);
        }
        object2 = m.c(object3.getView());
        object3 = ((RD3)object2).d;
        if (object3 != null) {
            bl2 = false;
            kotlinx.coroutines.i i3 = ((pd3_0)object3).e;
            i3.d(null);
            object = ((pd3_0)object3).c;
            boolean bl3 = object instanceof lu1;
            i i8 = ((pd3_0)object3).d;
            if (bl3) {
                object = (lu1)object;
                i8.c((lu1)object);
            }
            i8.c((lu1)object3);
        }
        ((RD3)object2).d = this;
    }

    public final void u() {
        Object object = this.c;
        Object object2 = object.getView();
        boolean bl2 = object2.isAttachedToWindow();
        if (bl2) {
            return;
        }
        object = m.c(object.getView());
        object2 = ((RD3)object).d;
        if (object2 != null) {
            kotlinx.coroutines.i i3 = object2.e;
            i3.d(null);
            Object object3 = object2.c;
            boolean bl3 = object3 instanceof lu1;
            i i8 = object2.d;
            if (bl3) {
                object3 = (lu1)object3;
                i8.c((lu1)object3);
            }
            i8.c((lu1)object2);
        }
        ((RD3)object).d = this;
        object = new CancellationException("'ViewTarget.view' must be attached to a window.");
        throw object;
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }
}

