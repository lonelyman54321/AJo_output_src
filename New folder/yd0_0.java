/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import java.util.Map;

/*
 * Renamed from yd0
 */
public final class yd0_0
implements Runnable {
    public final /* synthetic */ CrashlyticsCore a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Map c;

    public /* synthetic */ yd0_0(CrashlyticsCore crashlyticsCore, Throwable throwable, Map map2) {
        this.a = crashlyticsCore;
        this.b = throwable;
        this.c = map2;
    }

    public final void run() {
        Throwable throwable = this.b;
        Map map2 = this.c;
        CrashlyticsCore.i(this.a, throwable, map2);
    }
}

