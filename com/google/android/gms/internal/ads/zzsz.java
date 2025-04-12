/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaFormat
 *  android.os.HandlerThread
 *  android.os.Trace
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzfyw;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzsx;
import com.google.android.gms.internal.ads.zzsy;
import com.google.android.gms.internal.ads.zztb;
import com.google.android.gms.internal.ads.zztf;
import com.google.android.gms.internal.ads.zztk;
import com.google.android.gms.internal.ads.zztl;
import com.google.android.gms.internal.ads.zztn;
import com.google.android.gms.internal.ads.zzum;

public final class zzsz
implements zztl {
    private final zzfyw zzb;
    private final zzfyw zzc;
    private boolean zzd;

    public zzsz(int n3) {
        zzsx zzsx2 = new zzsx(n3);
        zzsy zzsy2 = new zzsy(n3);
        this.zzb = zzsx2;
        this.zzc = zzsy2;
        this.zzd = true;
    }

    public static /* synthetic */ HandlerThread zza(int n3) {
        String string2 = zztb.zzd(n3);
        HandlerThread handlerThread = new HandlerThread(string2);
        return handlerThread;
    }

    public static /* synthetic */ HandlerThread zzb(int n3) {
        String string2 = zztb.zze(n3);
        HandlerThread handlerThread = new HandlerThread(string2);
        return handlerThread;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zztb zzc(zztk zztk2) {
        void var1_5;
        zztb zztb2;
        String string2;
        block7: {
            int n3;
            Object object;
            block9: {
                Object object2;
                block8: {
                    string2 = "createCodec:";
                    object = zztk2.zza.zza;
                    zztb2 = null;
                    try {
                        object2 = new StringBuilder(string2);
                        ((StringBuilder)object2).append((String)object);
                        string2 = ((StringBuilder)object2).toString();
                        Trace.beginSection((String)string2);
                        string2 = MediaCodec.createByCodecName((String)object);
                    }
                    catch (Exception exception) {
                        string2 = null;
                        break block7;
                    }
                    try {
                        boolean bl2 = this.zzd;
                        if (!bl2) break block8;
                        object = zztk2.zzc;
                        n3 = zzgd.zza;
                        int n4 = 34;
                        if (n3 < n4 || n3 < (n4 = 35) && !(bl2 = zzcg.zzh((String)(object = ((zzan)object).zzn)))) break block8;
                    }
                    catch (Exception exception) {
                        break block7;
                    }
                    object = new zzum((MediaCodec)string2);
                    n3 = 4;
                    break block9;
                }
                object2 = this.zzc;
                object2 = (zzsy)object2;
                n3 = ((zzsy)object2).zza;
                object2 = zzsz.zzb(n3);
                object = new zztf((MediaCodec)string2, (HandlerThread)object2);
                n3 = 0;
                object2 = null;
            }
            zzfyw zzfyw2 = this.zzb;
            zzfyw2 = (zzsx)zzfyw2;
            int n7 = ((zzsx)zzfyw2).zza;
            zzfyw2 = zzsz.zza(n7);
            zztb zztb3 = new zztb((MediaCodec)string2, (HandlerThread)zzfyw2, (zztn)object, null);
            try {
                Trace.endSection();
                object = zztk2.zzb;
                zztk2 = zztk2.zzd;
                zztb.zzh(zztb3, (MediaFormat)object, (Surface)zztk2, null, n3);
                return zztb3;
            }
            catch (Exception exception) {
                zztb2 = zztb3;
            }
        }
        if (zztb2 == null) {
            if (string2 == null) throw var1_5;
            string2.release();
            throw var1_5;
        }
        zztb2.zzl();
        throw var1_5;
    }

    public final void zze(boolean bl2) {
        this.zzd = true;
    }
}

