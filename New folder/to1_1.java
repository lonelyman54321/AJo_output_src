/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.affise.attribution.metrics.MetricsManagerImpl;
import com.affise.attribution.utils.ActivityLifecycleCallback;

/*
 * Renamed from TO1
 */
public final class to1_1
implements ActivityLifecycleCallback {
    public final /* synthetic */ MetricsManagerImpl a;

    public /* synthetic */ to1_1(MetricsManagerImpl metricsManagerImpl) {
        this.a = metricsManagerImpl;
    }

    public final void handle(Activity activity) {
        MetricsManagerImpl.b(this.a, activity);
    }
}

