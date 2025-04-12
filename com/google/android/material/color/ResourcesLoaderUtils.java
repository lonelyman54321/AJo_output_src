/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.loader.ResourcesLoader
 */
package com.google.android.material.color;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import com.google.android.material.color.ColorResourcesLoaderCreator;
import java.util.Map;

final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map map2) {
        if ((map2 = ColorResourcesLoaderCreator.create(context, map2)) != null) {
            context = context.getResources();
            boolean bl2 = true;
            ResourcesLoader[] resourcesLoaderArray = new ResourcesLoader[bl2];
            resourcesLoaderArray[0] = map2;
            al2_1.a((Resources)context, resourcesLoaderArray);
            return bl2;
        }
        return false;
    }

    public static boolean isColorResource(int n3) {
        int n4 = 28;
        n3 = n4 <= n3 && n3 <= (n4 = 31) ? 1 : 0;
        return n3 != 0;
    }
}

