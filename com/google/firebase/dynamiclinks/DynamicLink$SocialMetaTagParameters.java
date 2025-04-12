/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$1;

public final class DynamicLink$SocialMetaTagParameters {
    public static final String KEY_SOCIAL_DESCRIPTION = "sd";
    public static final String KEY_SOCIAL_IMAGE_LINK = "si";
    public static final String KEY_SOCIAL_TITLE = "st";
    final Bundle parameters;

    private DynamicLink$SocialMetaTagParameters(Bundle bundle) {
        this.parameters = bundle;
    }

    public /* synthetic */ DynamicLink$SocialMetaTagParameters(Bundle bundle, DynamicLink$1 dynamicLink$1) {
        this(bundle);
    }
}

