/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
import android.app.Activity;
import android.view.View;
import com.affise.attribution.events.autoCatchingClick.AutoCatchingClickProvider;
import com.affise.attribution.utils.ActivityClickCallback;

/*
 * Renamed from Xr
 */
public final class xr_0
implements ActivityClickCallback {
    public final /* synthetic */ AutoCatchingClickProvider a;

    public /* synthetic */ xr_0(AutoCatchingClickProvider autoCatchingClickProvider) {
        this.a = autoCatchingClickProvider;
    }

    public final void handle(Activity activity, View view) {
        AutoCatchingClickProvider.a(this.a, activity, view);
    }
}

