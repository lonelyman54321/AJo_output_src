/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.material.color;

import android.os.Build;
import com.google.android.material.color.ColorResourcesOverride;
import com.google.android.material.color.ResourcesLoaderColorResourcesOverride;

public final class a {
    public static ColorResourcesOverride a() {
        int n3 = 30;
        int n4 = Build.VERSION.SDK_INT;
        if (n3 <= n4 && n4 <= (n3 = 33)) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        n3 = 34;
        if (n4 >= n3) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }
}

