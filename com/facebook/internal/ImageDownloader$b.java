/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.facebook.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class ImageDownloader$b {
    public final Uri a;
    public final Object b;

    public ImageDownloader$b(Uri uri, Object object) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(object, "tag");
        this.a = uri;
        this.b = object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = false;
        if (object != null && (bl2 = object instanceof ImageDownloader$b)) {
            object = (ImageDownloader$b)object;
            Object object2 = ((ImageDownloader$b)object).a;
            Uri uri = this.a;
            if (object2 == uri && (object = ((ImageDownloader$b)object).b) == (object2 = this.b)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = (this.a.hashCode() + 1073) * 37;
        return this.b.hashCode() + n3;
    }
}

