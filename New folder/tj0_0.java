/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;

/*
 * Renamed from tj0
 */
public final class tj0_0
implements Runnable {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;

    public /* synthetic */ tj0_0(dr0_0 dr0_02, Activity activity, String string2) {
        this.a = dr0_02;
        this.b = activity;
        this.c = string2;
    }

    public final void run() {
        this.a.getClass();
        fq0_2 fq0_22 = dr0_0.w(this.b);
        String string2 = this.c;
        int n3 = 1;
        fq0_2.Ya(fq0_22, null, n3 != 0, string2, n3);
    }
}

