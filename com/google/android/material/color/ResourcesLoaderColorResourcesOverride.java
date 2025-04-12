/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.view.ContextThemeWrapper
 */
package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$style;
import com.google.android.material.color.ColorResourcesOverride;
import com.google.android.material.color.ResourcesLoaderColorResourcesOverride$1;
import com.google.android.material.color.ResourcesLoaderColorResourcesOverride$ResourcesLoaderColorResourcesOverrideSingleton;
import com.google.android.material.color.ResourcesLoaderUtils;
import com.google.android.material.color.ThemeUtils;
import java.util.Map;

class ResourcesLoaderColorResourcesOverride
implements ColorResourcesOverride {
    private ResourcesLoaderColorResourcesOverride() {
    }

    public /* synthetic */ ResourcesLoaderColorResourcesOverride(ResourcesLoaderColorResourcesOverride$1 resourcesLoaderColorResourcesOverride$1) {
        this();
    }

    public static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverride$ResourcesLoaderColorResourcesOverrideSingleton.access$000();
    }

    public boolean applyIfPossible(Context context, Map map2) {
        int n3 = ResourcesLoaderUtils.addResourcesLoaderToContext(context, map2);
        if (n3 != 0) {
            n3 = R$style.ThemeOverlay_Material3_PersonalizedColors;
            ThemeUtils.applyThemeOverlay(context, n3);
            return true;
        }
        return false;
    }

    public Context wrapContextIfPossible(Context context, Map map2) {
        int n3 = R$style.ThemeOverlay_Material3_PersonalizedColors;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
        Configuration configuration = new Configuration();
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        boolean bl2 = ResourcesLoaderUtils.addResourcesLoaderToContext((Context)contextThemeWrapper, map2);
        if (bl2) {
            context = contextThemeWrapper;
        }
        return context;
    }
}

