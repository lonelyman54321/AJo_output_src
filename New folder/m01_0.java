/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import in.juspay.hypersdk.safe.Godel;

/*
 * Renamed from m01
 */
public final class m01_0
implements Runnable {
    public final /* synthetic */ Godel a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public /* synthetic */ m01_0(Godel godel, Activity activity, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.a = godel;
        this.b = activity;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = string7;
    }

    public final void run() {
        String string2 = this.g;
        String string3 = this.h;
        Godel godel = this.a;
        Activity activity = this.b;
        String string4 = this.c;
        String string5 = this.d;
        String string6 = this.e;
        String string7 = this.f;
        Godel.b(godel, activity, string4, string5, string6, string7, string2, string3);
    }
}

