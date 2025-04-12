/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.utils.ActivityLifecycleCallback;

/*
 * Renamed from Aj0
 */
public final class aj0_0
implements ActivityLifecycleCallback {
    public final /* synthetic */ DeeplinkManagerImpl a;

    public /* synthetic */ aj0_0(DeeplinkManagerImpl deeplinkManagerImpl) {
        this.a = deeplinkManagerImpl;
    }

    public final void handle(Activity activity) {
        DeeplinkManagerImpl.a(this.a, activity);
    }
}

