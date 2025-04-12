/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;

public final class Cn2$a
extends CountDownTimer {
    public final /* synthetic */ cn2_1 a;

    public Cn2$a(cn2_1 cn2_12, long l2, long l3) {
        this.a = cn2_12;
        super(l2, l3);
    }

    public final void onFinish() {
        cn2_1 cn2_12 = this.a;
        dn2_1 dn2_12 = cn2_12.b;
        if (dn2_12 != null) {
            ka0_0 ka0_02 = cn2_12.c;
            dn2_12.W9(ka0_02);
        }
        cn2_12.dismissAllowingStateLoss();
    }

    public final void onTick(long l2) {
    }
}

