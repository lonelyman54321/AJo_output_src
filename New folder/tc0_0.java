/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;

/*
 * Renamed from Tc0
 */
public final class tc0_0
extends CountDownTimer {
    public long a;
    public final /* synthetic */ sc0_2 b;
    public final /* synthetic */ String c;

    public tc0_0(long l2, sc0_2 sc0_22, String string2) {
        this.b = sc0_22;
        this.c = string2;
        super(l2, 1000L);
        this.a = l2;
    }

    public final void onFinish() {
        this.b.Sa("");
    }

    public final void onTick(long l2) {
        l2 = this.a;
        long l3 = 1000;
        this.a = l2 -= l3;
        String string2 = hv3_0.b0(l2);
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.c;
        stringBuilder.append(string3);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        stringBuilder.append(" Hrs");
        string2 = stringBuilder.toString();
        this.b.Sa(string2);
    }
}

