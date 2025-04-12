/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 */
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

public final class Mg
implements ComponentCallbacks2 {
    public final /* synthetic */ LK2 a;

    public Mg(LK2 lK2) {
        this.a = lK2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.a.a();
    }

    public final void onLowMemory() {
        this.a.a();
    }

    public final void onTrimMemory(int n3) {
        this.a.a();
    }
}

