/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal$OnCancelListener
 */
import android.os.CancellationSignal;

public final class o31
implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ Sk3 a;

    public /* synthetic */ o31(Sk3 sk3) {
        this.a = sk3;
    }

    public final void onCancel() {
        Object object = this.a;
        if (object != null) {
            Vt1 vt1 = ((Sk3)object).d;
            if (vt1 != null) {
                long l2 = mm3.b;
                vt1.f(l2);
            }
            object = ((Sk3)object).d;
            if (object != null) {
                long l3 = mm3.b;
                ((Vt1)object).g(l3);
            }
        }
    }
}

