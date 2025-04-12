/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.res.Configuration
 */
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.window.layout.SidecarCompat;
import androidx.window.layout.SidecarCompat$b;
import kotlin.jvm.internal.Intrinsics;

public final class A43
implements ComponentCallbacks {
    public final /* synthetic */ SidecarCompat a;
    public final /* synthetic */ Activity b;

    public A43(SidecarCompat sidecarCompat, Activity activity) {
        this.a = sidecarCompat;
        this.b = activity;
    }

    public final void onConfigurationChanged(Configuration object) {
        Intrinsics.checkNotNullParameter(object, "newConfig");
        object = this.a;
        SidecarCompat$b sidecarCompat$b = ((SidecarCompat)object).e;
        if (sidecarCompat$b != null) {
            Activity activity = this.b;
            object = ((SidecarCompat)object).g(activity);
            sidecarCompat$b.a(activity, (gH3)object);
        }
    }

    public final void onLowMemory() {
    }
}

