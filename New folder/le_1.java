/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;

/*
 * Renamed from le
 */
public final class le_1
implements AnalyticsEventLogger {
    public final /* synthetic */ AnalyticsDeferredProxy a;

    public /* synthetic */ le_1(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.a = analyticsDeferredProxy;
    }

    public final void logEvent(String string2, Bundle bundle) {
        AnalyticsDeferredProxy.b(this.a, string2, bundle);
    }
}

