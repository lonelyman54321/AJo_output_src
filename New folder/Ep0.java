/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.perf.config.DeviceCacheManager;

public final class Ep0
implements Runnable {
    public final /* synthetic */ DeviceCacheManager a;
    public final /* synthetic */ Context b;

    public /* synthetic */ Ep0(DeviceCacheManager deviceCacheManager, Context context) {
        this.a = deviceCacheManager;
        this.b = context;
    }

    public final void run() {
        DeviceCacheManager deviceCacheManager = this.a;
        Context context = this.b;
        DeviceCacheManager.a(deviceCacheManager, context);
    }
}

