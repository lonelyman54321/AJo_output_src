/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/*
 * Renamed from zd0
 */
public final class zd0_0
implements Runnable {
    public final /* synthetic */ CrashlyticsCore a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ zd0_0(CrashlyticsCore crashlyticsCore, long l2, String string2) {
        this.a = crashlyticsCore;
        this.b = l2;
        this.c = string2;
    }

    public final void run() {
        long l2 = this.b;
        String string2 = this.c;
        CrashlyticsCore.e(this.a, l2, string2);
    }
}

