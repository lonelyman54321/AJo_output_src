/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.affise.attribution.session.CurrentActiveActivityCountProviderImpl;
import com.affise.attribution.utils.ActivityLifecycleCallback;

/*
 * Renamed from bf0
 */
public final class bf0_2
implements ActivityLifecycleCallback {
    public final /* synthetic */ CurrentActiveActivityCountProviderImpl a;

    public /* synthetic */ bf0_2(CurrentActiveActivityCountProviderImpl currentActiveActivityCountProviderImpl) {
        this.a = currentActiveActivityCountProviderImpl;
    }

    public final void handle(Activity activity) {
        CurrentActiveActivityCountProviderImpl.a(this.a, activity);
    }
}

