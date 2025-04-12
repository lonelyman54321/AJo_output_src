/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;

public final class DynamicLink {
    private final Bundle builderParameters;

    public DynamicLink(Bundle bundle) {
        this.builderParameters = bundle;
    }

    public Uri getUri() {
        return FirebaseDynamicLinksImpl.createDynamicLink(this.builderParameters);
    }
}

