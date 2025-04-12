/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

final class zad {
    public final Uri zaa;

    public zad(Uri uri) {
        this.zaa = uri;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zad;
        if (!bl2) {
            return false;
        }
        object = ((zad)object).zaa;
        Uri uri = this.zaa;
        return Objects.equal(object, uri);
    }

    public final int hashCode() {
        Uri uri = this.zaa;
        Object[] objectArray = new Object[]{uri};
        return Objects.hashCode(objectArray);
    }
}

