/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.zad;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

public abstract class zag {
    final zad zaa;
    protected int zab = 0;

    public zag(Uri uri, int n3) {
        zad zad2;
        this.zaa = zad2 = new zad(uri);
        this.zab = n3;
    }

    public abstract void zaa(Drawable var1, boolean var2, boolean var3, boolean var4);

    public final void zab(Context object, zam zam2, boolean bl2) {
        int n3 = this.zab;
        object = n3 != 0 ? object.getResources().getDrawable(n3) : null;
        this.zaa((Drawable)object, bl2, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean bl2) {
        Asserts.checkNotNull(bitmap);
        context = context.getResources();
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources)context, bitmap);
        this.zaa((Drawable)bitmapDrawable, false, false, true);
    }
}

