/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from mn1
 */
public final class mn1_1
implements Runnable {
    public final /* synthetic */ JuspayServices a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ SdkTracker c;

    public /* synthetic */ mn1_1(JuspayServices juspayServices, Context context, SdkTracker sdkTracker) {
        this.a = juspayServices;
        this.b = context;
        this.c = sdkTracker;
    }

    public final void run() {
        Context context = this.b;
        SdkTracker sdkTracker = this.c;
        JuspayServices.h(this.a, context, sdkTracker);
    }
}

