/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdoe;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzdof {
    private final zzbq zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdof(zzbq zzbq2, Clock clock, Executor executor) {
        this.zza = zzbq2;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] object, BitmapFactory.Options object2) {
        Object object3 = this.zzb;
        long l2 = object3.elapsedRealtime();
        int n3 = ((byte[])object).length;
        boolean bl2 = false;
        object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3, (BitmapFactory.Options)object2);
        object2 = this.zzb;
        long l3 = object2.elapsedRealtime();
        if (object != null) {
            Object object4;
            l3 -= l2;
            int n4 = object.getWidth();
            int n7 = object.getHeight();
            int n8 = object.getAllocationByteCount();
            Object object5 = Looper.getMainLooper().getThread();
            if (object5 == (object4 = Thread.currentThread())) {
                bl2 = true;
            }
            object5 = "Decoded image w: ";
            object4 = " h:";
            String string2 = " bytes: ";
            object2 = fQ2.a((String)object5, (String)object4, string2, n4, n7);
            ((StringBuilder)object2).append(n8);
            ((StringBuilder)object2).append(" time: ");
            ((StringBuilder)object2).append(l3);
            object3 = " on ui thread: ";
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(bl2);
            object2 = ((StringBuilder)object2).toString();
            zze.zza((String)object2);
        }
        return object;
    }

    public final /* synthetic */ Bitmap zza(double d2, boolean bl2, zzara object) {
        Object object2;
        int n3;
        byte[] byArray;
        byArray = byArray.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        double d5 = 160.0;
        options.inDensity = n3 = (int)(d2 *= d5);
        if (!bl2) {
            object2 = Bitmap.Config.RGB_565;
            options.inPreferredConfig = object2;
        }
        object2 = zzbep.zzgp;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
            options.inJustDecodeBounds = n3;
            this.zzc(byArray, options);
            zzben2 = null;
            options.inJustDecodeBounds = false;
            int n4 = options.outWidth;
            int n7 = options.outHeight;
            if ((n4 *= n7) > 0) {
                Object object3 = zzbep.zzgq;
                zzben zzben3 = zzba.zzc();
                object3 = (Integer)zzben3.zza((zzbeg)object3);
                int n8 = (Integer)object3;
                n4 = Integer.numberOfLeadingZeros((n4 + -1) / n8);
                n4 = (33 - n4) / 2;
                options.inSampleSize = n3 <<= n4;
            }
        }
        return this.zzc(byArray, options);
    }

    public final ListenableFuture zzb(String object, double d2, boolean bl2) {
        object = this.zza.zza((String)object);
        zzdoe zzdoe2 = new zzdoe(this, d2, bl2);
        Executor executor = this.zzc;
        return zzgft.zzm((ListenableFuture)object, zzdoe2, executor);
    }
}

