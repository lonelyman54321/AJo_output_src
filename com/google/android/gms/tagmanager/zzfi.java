/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 */
package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.google.android.gms.tagmanager.TagManager;

final class zzfi
implements ComponentCallbacks2 {
    final /* synthetic */ TagManager zza;

    public zzfi(TagManager tagManager) {
        this.zza = tagManager;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n3) {
        int n4 = 20;
        if (n3 == n4) {
            TagManager tagManager = this.zza;
            tagManager.dispatch();
        }
    }
}

