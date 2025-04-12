/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;

/*
 * Renamed from Ic0
 */
public final class ic0_0
extends CountDownTimer {
    public long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jc0_0 c;

    public ic0_0(jc0_0 jc0_02, long l2, long l3, String string2) {
        this.c = jc0_02;
        this.b = string2;
        super(l2, 1000L);
        this.a = l3;
    }

    public final void onFinish() {
        this.c.Oa("");
    }

    public final void onTick(long l2) {
        this.a = l2 = this.a - 1000L;
        CharSequence charSequence = new StringBuilder();
        String string2 = this.b;
        charSequence.append(string2);
        charSequence.append(" ");
        string2 = hv3_0.b0(this.a);
        charSequence.append(string2);
        charSequence.append(" Hrs");
        charSequence = charSequence.toString();
        this.c.Oa((String)charSequence);
    }
}

