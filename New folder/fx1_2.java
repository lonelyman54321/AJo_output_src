/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Renamed from fx1
 */
public final class fx1_2
implements Runnable {
    public final /* synthetic */ LogSessioniserExp a;
    public final /* synthetic */ ConcurrentHashMap b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fx1_2(LogSessioniserExp logSessioniserExp, ConcurrentHashMap concurrentHashMap, boolean bl2) {
        this.a = logSessioniserExp;
        this.b = concurrentHashMap;
        this.c = bl2;
    }

    public final void run() {
        ConcurrentHashMap concurrentHashMap = this.b;
        boolean bl2 = this.c;
        LogSessioniserExp.b(this.a, concurrentHashMap, bl2);
    }
}

