/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
import android.app.Activity;
import android.view.View;
import com.affise.attribution.metrics.MetricsManagerImpl;
import com.affise.attribution.utils.ActivityClickCallback;

/*
 * Renamed from UO1
 */
public final class uo1_0
implements ActivityClickCallback {
    public final /* synthetic */ MetricsManagerImpl a;

    public /* synthetic */ uo1_0(MetricsManagerImpl metricsManagerImpl) {
        this.a = metricsManagerImpl;
    }

    public final void handle(Activity activity, View view) {
        MetricsManagerImpl.a(this.a, activity, view);
    }
}

