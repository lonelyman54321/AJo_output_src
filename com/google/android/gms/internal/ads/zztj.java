/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCodec
 *  android.media.MediaFormat
 *  android.os.Trace
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzsz;
import com.google.android.gms.internal.ads.zztk;
import com.google.android.gms.internal.ads.zztl;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zzul;
import java.io.IOException;

public final class zztj
implements zztl {
    private final Context zzb;

    public zztj() {
        this.zzb = null;
    }

    public zztj(Context context) {
        this.zzb = context;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zztm zzd(zztk object) {
        void var1_4;
        Object object2;
        block7: {
            String string2;
            int n3;
            Object object3;
            int n4 = zzgd.zza;
            int n7 = 23;
            if (n4 >= n7 && (n4 >= (n7 = 31) || (object3 = this.zzb) != null && n4 >= (n3 = 28) && (n4 = (int)((object2 = object3.getPackageManager()).hasSystemFeature((String)(object3 = "com.amazon.hardware.tv_screen")) ? 1 : 0)) != 0)) {
                n4 = zzcg.zzb(((zztk)object).zzc.zzn);
                object3 = zzgd.zzC(n4);
                object3 = "Creating an asynchronous MediaCodec adapter for track type ".concat((String)object3);
                zzfk.zze("DMCodecAdapterFactory", (String)object3);
                object3 = new zzsz(n4);
                ((zzsz)object3).zze(true);
                return ((zzsz)object3).zzc((zztk)object);
            }
            n4 = 0;
            object2 = null;
            try {
                object3 = ((zztk)object).zza;
                object3 = ((zztp)object3).zza;
                string2 = "createCodec:";
                string2 = string2.concat((String)object3);
                Trace.beginSection((String)string2);
                object3 = MediaCodec.createByCodecName((String)object3);
                Trace.endSection();
                string2 = "configureCodec";
            }
            catch (RuntimeException runtimeException) {
                break block7;
            }
            catch (IOException iOException) {
                // empty catch block
                break block7;
            }
            try {
                Trace.beginSection((String)string2);
                string2 = ((zztk)object).zzb;
                object = ((zztk)object).zzd;
                object3.configure((MediaFormat)string2, (Surface)object, null, 0);
                Trace.endSection();
                object = "startCodec";
                Trace.beginSection((String)object);
                object3.start();
                Trace.endSection();
                return new zzul((MediaCodec)object3, null);
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            object2 = object3;
        }
        if (object2 == null) throw var1_4;
        object2.release();
        throw var1_4;
    }
}

