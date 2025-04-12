/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccu;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

final class zzbph
implements Runnable {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzboo zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbpt zze;

    public zzbph(zzbpt zzbpt2, zzbps zzbps2, zzboo zzboo2, ArrayList arrayList, long l2) {
        this.zza = zzbps2;
        this.zzb = zzboo2;
        this.zzc = arrayList;
        this.zzd = l2;
        this.zze = zzbpt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        String string2;
        block9: {
            Object object;
            string2 = "Could not finish the full JS engine loading in ";
            String string3 = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ";
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
            Object object2 = zzbpt.zzf(this.zze);
            // MONITORENTER : object2
            Object object3 = "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired";
            com.google.android.gms.ads.internal.util.zze.zza((String)object3);
            object3 = this.zza;
            int n3 = ((zzccu)object3).zze();
            int n4 = -1;
            if (n3 == n4 || (n3 = ((zzccu)(object3 = this.zza)).zze()) == (n4 = 1)) break block9;
            object3 = zzbep.zzhO;
            Object object4 = zzba.zzc();
            object3 = ((zzben)object4).zza((zzbeg)object3);
            n3 = (int)(((Boolean)(object3 = (Boolean)object3)).booleanValue() ? 1 : 0);
            if (n3 != 0) {
                object3 = this.zza;
                object = "Unable to fully load JS engine.";
                object4 = new TimeoutException((String)object);
                object = "SdkJavascriptFactory.loadJavascriptEngine.Runnable";
                ((zzccu)object3).zzh((Throwable)object4, (String)object);
            } else {
                object3 = this.zza;
                ((zzccu)object3).zzg();
            }
            object3 = zzcci.zze;
            object4 = this.zzb;
            Objects.requireNonNull(object4);
            object = new zzbpg((zzboo)object4);
            object3.execute((Runnable)object);
            object3 = zzbep.zzd;
            object4 = zzba.zzc();
            object3 = ((zzben)object4).zza((zzbeg)object3);
            object3 = String.valueOf(object3);
            object4 = this.zza;
            n4 = ((zzccu)object4).zze();
            object = this.zze;
            int n7 = zzbpt.zza((zzbpt)object);
            Object object5 = this.zzc;
            boolean bl2 = ((ArrayList)object5).isEmpty();
            if (bl2) {
                string3 = ". Still waiting for the engine to be loaded";
            } else {
                object5 = this.zzc;
                object5 = ((ArrayList)object5).get(0);
                object5 = String.valueOf(object5);
                string3 = string3.concat((String)object5);
            }
            object5 = zzu.zzB();
            long l2 = object5.currentTimeMillis();
            long l3 = this.zzd;
            l2 -= l3;
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object3);
            string2 = " ms. JS engine session reference status(fullLoadTimeout) is ";
            stringBuilder.append(string2);
            stringBuilder.append(n4);
            string2 = ". Update status(fullLoadTimeout) is ";
            stringBuilder.append(string2);
            stringBuilder.append(n7);
            stringBuilder.append(string3);
            string2 = " ms. Total latency(fullLoadTimeout) is ";
            stringBuilder.append(string2);
            stringBuilder.append(l2);
            string2 = " ms at timeout. Rejecting.";
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            com.google.android.gms.ads.internal.util.zze.zza(string2);
            // MONITOREXIT : object2
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
            return;
        }
        string2 = "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled";
        com.google.android.gms.ads.internal.util.zze.zza(string2);
        // MONITOREXIT : object2
    }
}

