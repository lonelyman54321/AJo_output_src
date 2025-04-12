/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$1;

public final class DynamicLink$NavigationInfoParameters {
    public static final String KEY_FORCED_REDIRECT = "efr";
    final Bundle parameters;

    private DynamicLink$NavigationInfoParameters(Bundle bundle) {
        this.parameters = bundle;
    }

    public /* synthetic */ DynamicLink$NavigationInfoParameters(Bundle bundle, DynamicLink$1 dynamicLink$1) {
        this(bundle);
    }
}

