/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.View
 */
import android.os.CountDownTimer;
import android.view.View;

public final class s9
extends CountDownTimer {
    public final /* synthetic */ q9_0 a;

    public s9(q9_0 q9_02, long l2) {
        this.a = q9_02;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object = h40_0.a;
        boolean bl2 = h40_0.A();
        if (bl2) {
            object = q9_0.Companion;
            object = this.a;
            ((q9_0)object).Db();
            object = ((q9_0)object).b1;
            if (object != null) {
                ai0_2.i((View)object);
            }
        }
    }

    public final void onTick(long l2) {
    }
}

