/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.firebase.dynamiclinks;

import android.net.Uri;
import java.util.List;

public interface ShortDynamicLink {
    public Uri getPreviewLink();

    public Uri getShortLink();

    public List getWarnings();
}

