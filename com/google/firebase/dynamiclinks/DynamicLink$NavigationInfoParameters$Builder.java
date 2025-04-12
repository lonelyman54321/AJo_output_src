/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$NavigationInfoParameters;

public final class DynamicLink$NavigationInfoParameters$Builder {
    private final Bundle parameters;

    public DynamicLink$NavigationInfoParameters$Builder() {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
    }

    public DynamicLink$NavigationInfoParameters build() {
        Bundle bundle = this.parameters;
        DynamicLink$NavigationInfoParameters dynamicLink$NavigationInfoParameters = new DynamicLink$NavigationInfoParameters(bundle, null);
        return dynamicLink$NavigationInfoParameters;
    }

    public boolean getForcedRedirectEnabled() {
        int n3;
        Bundle bundle = this.parameters;
        String string2 = "efr";
        int n4 = bundle.getInt(string2);
        if (n4 != (n3 = 1)) {
            n3 = 0;
            string2 = null;
        }
        return n3 != 0;
    }

    public DynamicLink$NavigationInfoParameters$Builder setForcedRedirectEnabled(boolean bl2) {
        this.parameters.putInt("efr", (int)(bl2 ? 1 : 0));
        return this;
    }
}

