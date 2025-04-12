/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.widget.ImageView
 */
package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.images.zag;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;

public final class zae
extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int n3) {
        WeakReference<ImageView> weakReference;
        Uri uri = Uri.EMPTY;
        super(uri, n3);
        Asserts.checkNotNull(imageView);
        this.zac = weakReference = new WeakReference<ImageView>(imageView);
    }

    public zae(ImageView imageView, Uri object) {
        super((Uri)object, 0);
        Asserts.checkNotNull(imageView);
        super(imageView);
        this.zac = object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zae;
        if (!bl4) {
            return false;
        }
        object = (zae)object;
        ImageView imageView = (ImageView)this.zac.get();
        object = (ImageView)((zae)object).zac.get();
        if (object != null && imageView != null && (bl2 = Objects.equal(object, imageView))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final void zaa(Drawable drawable2, boolean bl2, boolean bl3, boolean bl4) {
        ImageView imageView = (ImageView)this.zac.get();
        if (imageView != null) {
            if (!bl3 && !bl4 && (bl4 = imageView instanceof zal)) {
                imageView = (zal)imageView;
                throw null;
            }
            bl4 = false;
            if (!bl3 && !bl2) {
                bl4 = true;
            }
            if (bl4) {
                Drawable drawable3 = imageView.getDrawable();
                if (drawable3 != null) {
                    bl3 = drawable3 instanceof zak;
                    if (bl3) {
                        drawable3 = ((zak)drawable3).zaa();
                    }
                } else {
                    bl2 = false;
                    drawable3 = null;
                }
                zak zak2 = new zak(drawable3, drawable2);
                drawable2 = zak2;
            }
            imageView.setImageDrawable(drawable2);
            bl2 = imageView instanceof zal;
            if (!bl2) {
                if (drawable2 != null && bl4) {
                    ((zak)drawable2).zab(250);
                    return;
                }
            } else {
                imageView = (zal)imageView;
                throw null;
            }
        }
    }
}

