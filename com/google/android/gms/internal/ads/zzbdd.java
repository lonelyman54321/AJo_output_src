/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzccn;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public final class zzbdd
implements Runnable {
    public final /* synthetic */ zzbdg zza;
    public final /* synthetic */ zzbcx zzb;
    public final /* synthetic */ zzbcy zzc;
    public final /* synthetic */ zzccn zzd;

    public /* synthetic */ zzbdd(zzbdg zzbdg2, zzbcx zzbcx2, zzbcy zzbcy2, zzccn zzccn2) {
        this.zza = zzbdg2;
        this.zzb = zzbcx2;
        this.zzc = zzbcy2;
        this.zzd = zzccn2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        void var2_5;
        zzccn zzccn2;
        zzbdg zzbdg2;
        block7: {
            Object object;
            Object object2;
            Object object3;
            block8: {
                block6: {
                    zzbdg2 = this.zza;
                    object3 = this.zzb;
                    zzccn2 = this.zzd;
                    try {
                        object2 = ((zzbcx)object3).zzq();
                        boolean bl2 = ((zzbcx)object3).zzp();
                        object = this.zzc;
                        if (!bl2) break block6;
                    }
                    catch (RemoteException remoteException) {
                        break block7;
                    }
                    catch (IOException iOException) {
                        break block7;
                    }
                    object3 = ((zzbda)object2).zzg((zzbcy)object);
                    break block8;
                }
                object3 = ((zzbda)object2).zzf((zzbcy)object);
            }
            boolean bl3 = ((zzbcv)object3).zze();
            if (!bl3) {
                object2 = "No entry contents.";
                object3 = new RuntimeException((String)object2);
                zzccn2.zzd((Throwable)object3);
                object3 = zzbdg2.zzc;
                zzbdi.zze((zzbdi)object3);
                return;
            }
            object = ((zzbcv)object3).zzc();
            int n3 = 1;
            object2 = new zzbdf(zzbdg2, (InputStream)object, n3);
            int n4 = ((PushbackInputStream)object2).read();
            if (n4 != (n3 = -1)) {
                ((PushbackInputStream)object2).unread(n4);
                n4 = (int)(((zzbcv)object3).zzd() ? 1 : 0);
                n3 = (int)(((zzbcv)object3).zzg() ? 1 : 0);
                long l2 = ((zzbcv)object3).zza();
                boolean bl4 = ((zzbcv)object3).zzf();
                object3 = zzbdk.zzb((InputStream)object2, n4 != 0, n3 != 0, l2, bl4);
                zzccn2.zzc(object3);
                return;
            }
            object2 = "Unable to read from cache.";
            object3 = new IOException((String)object2);
            throw object3;
        }
        zzm.zzh("Unable to obtain a cache service instance.", (Throwable)var2_5);
        zzccn2.zzd((Throwable)var2_5);
        zzbdi.zze(zzbdg2.zzc);
    }
}

