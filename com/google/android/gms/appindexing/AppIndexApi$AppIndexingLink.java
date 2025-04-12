/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.View
 */
package com.google.android.gms.appindexing;

import android.net.Uri;
import android.view.View;

public final class AppIndexApi$AppIndexingLink {
    public final Uri appIndexingUrl;
    public final int viewId;
    public final Uri webUrl;

    public AppIndexApi$AppIndexingLink(Uri uri, Uri uri2, View view) {
        int n3;
        this.appIndexingUrl = uri;
        this.webUrl = uri2;
        this.viewId = n3 = view.getId();
    }

    public AppIndexApi$AppIndexingLink(Uri uri, View view) {
        this(uri, null, view);
    }
}

