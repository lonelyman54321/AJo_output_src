/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

public final class d82$c
implements n,
al_0 {
    public final i a;
    public final W72 b;
    public d82$d c;
    public final /* synthetic */ d82_0 d;

    public d82$c(d82_0 d82_02, i i3, W72 w72) {
        Intrinsics.checkNotNullParameter(i3, "lifecycle");
        Intrinsics.checkNotNullParameter(w72, "onBackPressedCallback");
        this.d = d82_02;
        this.a = i3;
        this.b = w72;
        i3.a(this);
    }

    public final void cancel() {
        this.a.c(this);
        this.b.removeCancellable(this);
        d82$d d82$d = this.c;
        if (d82$d != null) {
            d82$d.cancel();
        }
        this.c = null;
    }

    public final void k(mu1_1 object, i$a object2) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "event");
        object = i$a.ON_START;
        if (object2 == object) {
            object = this.d;
            object2 = this.b;
            object = ((d82_0)object).b((W72)object2);
            this.c = object;
        } else {
            object = i$a.ON_STOP;
            if (object2 == object) {
                object = this.c;
                if (object != null) {
                    ((d82$d)object).cancel();
                }
            } else {
                object = i$a.ON_DESTROY;
                if (object2 == object) {
                    this.cancel();
                }
            }
        }
    }
}

