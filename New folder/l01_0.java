/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import in.juspay.hypersdk.safe.Godel;

/*
 * Renamed from l01
 */
public final class l01_0
implements Runnable {
    public final /* synthetic */ Godel a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ l01_0(Godel godel, Activity activity, String string2, String string3, String string4) {
        this.a = godel;
        this.b = activity;
        this.c = string2;
        this.d = string3;
        this.e = string4;
    }

    public final void run() {
        String string2 = this.d;
        String string3 = this.e;
        Godel godel = this.a;
        Activity activity = this.b;
        String string4 = this.c;
        Godel.a(godel, activity, string4, string2, string3);
    }
}

