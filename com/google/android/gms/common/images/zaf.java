/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 */
package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager$OnImageLoadedListener;
import com.google.android.gms.common.images.zad;
import com.google.android.gms.common.images.zag;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zaf
extends zag {
    private final WeakReference zac;

    public zaf(ImageManager$OnImageLoadedListener imageManager$OnImageLoadedListener, Uri object) {
        super((Uri)object, 0);
        Asserts.checkNotNull(imageManager$OnImageLoadedListener);
        super(imageManager$OnImageLoadedListener);
        this.zac = object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zaf;
        if (!bl4) {
            return false;
        }
        object = (zaf)object;
        Object object2 = (ImageManager$OnImageLoadedListener)this.zac.get();
        ImageManager$OnImageLoadedListener imageManager$OnImageLoadedListener = (ImageManager$OnImageLoadedListener)((zaf)object).zac.get();
        if (imageManager$OnImageLoadedListener != null && object2 != null && (bl4 = Objects.equal(imageManager$OnImageLoadedListener, object2)) && (bl2 = Objects.equal(object = ((zag)object).zaa, object2 = this.zaa))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        zad zad2 = this.zaa;
        Object[] objectArray = new Object[]{zad2};
        return Objects.hashCode(objectArray);
    }

    public final void zaa(Drawable drawable2, boolean bl2, boolean bl3, boolean bl4) {
        ImageManager$OnImageLoadedListener imageManager$OnImageLoadedListener;
        if (!bl3 && (imageManager$OnImageLoadedListener = (ImageManager$OnImageLoadedListener)this.zac.get()) != null) {
            Uri uri = this.zaa.zaa;
            imageManager$OnImageLoadedListener.onImageLoaded(uri, drawable2, bl4);
        }
    }
}

