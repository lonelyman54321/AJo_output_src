/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/*
 * Renamed from xd0
 */
public final class xd0_0
implements Runnable {
    public final /* synthetic */ CrashlyticsCore a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ xd0_0(CrashlyticsCore crashlyticsCore, String string2, String string3) {
        this.a = crashlyticsCore;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        String string2 = this.b;
        String string3 = this.c;
        CrashlyticsCore.k(this.a, string2, string3);
    }
}

