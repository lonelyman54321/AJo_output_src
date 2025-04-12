/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzdom
implements zzfxu {
    public final /* synthetic */ String zza;
    public final /* synthetic */ double zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdom(String string2, double d2, int n3, int n4) {
        this.zza = string2;
        this.zzb = d2;
        this.zzc = n3;
        this.zzd = n4;
    }

    public final Object apply(Object object) {
        zzbhi zzbhi2;
        object = (Bitmap)object;
        Object object2 = Resources.getSystem();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(object2, (Bitmap)object);
        Uri uri = Uri.parse((String)this.zza);
        double d2 = this.zzb;
        int n3 = this.zzc;
        int n4 = this.zzd;
        object2 = zzbhi2;
        zzbhi2 = new zzbhi((Drawable)bitmapDrawable, uri, d2, n3, n4);
        return zzbhi2;
    }
}

