/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Looper
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnk;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbnm
implements zzaqx {
    private volatile zzbmz zza;
    private final Context zzb;

    public zzbnm(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ zzbmz zzb(zzbnm zzbnm2) {
        return zzbnm2.zza;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbnm zzbnm2) {
        zzbmz zzbmz2 = zzbnm2.zza;
        if (zzbmz2 == null) {
            return;
        }
        zzbnm2.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final zzara zza(zzare object) {
        Object object2;
        Object object3;
        int n3;
        Object object4 = "ms";
        Object object5 = "Http assets remote cache took ";
        String[] stringArray = zzbna.CREATOR;
        stringArray = object.zzl();
        int n4 = stringArray.size();
        String[] stringArray2 = new String[n4];
        Object object6 = new String[n4];
        stringArray = stringArray.entrySet().iterator();
        int n7 = 0;
        int n8 = 0;
        Object object7 = null;
        while ((n3 = stringArray.hasNext()) != 0) {
            object3 = (Map.Entry)stringArray.next();
            object2 = (String)object3.getKey();
            stringArray2[n8] = object2;
            object6[n8] = object3 = (String)object3.getValue();
            ++n8;
        }
        object = object.zzk();
        stringArray = new zzbna((String)object, stringArray2, (String[])object6);
        long l2 = zzu.zzB().elapsedRealtime();
        object = null;
        object7 = new zzccn();
        object3 = new zzbnk(this, (zzccn)object7);
        object2 = new zzbnl(this, (zzccn)object7);
        Object object8 = this.zzb;
        zzbx zzbx2 = zzu.zzt();
        zzbx2 = zzbx2.zzb();
        Object object9 = new zzbmz((Context)object8, (Looper)zzbx2, (BaseGmsClient$BaseConnectionCallbacks)object3, (BaseGmsClient$BaseOnConnectionFailedListener)object2);
        this.zza = object9;
        object3 = this.zza;
        ((BaseGmsClient)object3).checkAvailabilityAndConnect();
        object3 = new zzbni(this, (zzbna)stringArray);
        stringArray = zzcci.zza;
        object7 = zzgft.zzn((ListenableFuture)object7, (zzgfa)object3, (Executor)stringArray);
        object3 = zzbep.zzey;
        object2 = zzba.zzc();
        object3 = ((zzben)object2).zza((zzbeg)object3);
        object3 = (Integer)object3;
        n3 = (Integer)object3;
        long l3 = n3;
        object9 = TimeUnit.MILLISECONDS;
        object8 = zzcci.zzd;
        object7 = zzgft.zzo((ListenableFuture)object7, l3, (TimeUnit)((Object)object9), (ScheduledExecutorService)object8);
        object3 = new zzbnj(this);
        object7.addListener((Runnable)object3, (Executor)stringArray);
        stringArray = object7.get();
        try {
            stringArray = (ParcelFileDescriptor)stringArray;
        }
        catch (Throwable throwable) {
            long l4 = zzu.zzB().elapsedRealtime() - l2;
            stringArray = new StringBuilder((String)object5);
            stringArray.append(l4);
            stringArray.append((String)object4);
            zze.zza(stringArray.toString());
            throw throwable;
        }
        catch (InterruptedException | ExecutionException exception) {
            long l7 = zzu.zzB().elapsedRealtime() - l2;
            stringArray = new StringBuilder((String)object5);
            stringArray.append(l7);
            stringArray.append((String)object4);
            zze.zza(stringArray.toString());
            return null;
        }
        object7 = zzu.zzB();
        long l8 = object7.elapsedRealtime() - l2;
        object6 = new StringBuilder((String)object5);
        ((StringBuilder)object6).append(l8);
        ((StringBuilder)object6).append((String)object4);
        zze.zza(((StringBuilder)object6).toString());
        object4 = new zzbxs((ParcelFileDescriptor)stringArray);
        object5 = zzbnc.CREATOR;
        object4 = (zzbnc)((zzbxs)object4).zza((Parcelable.Creator)object5);
        if (object4 == null) {
            return null;
        }
        int n10 = ((zzbnc)object4).zza;
        if (n10 == 0) {
            object5 = ((zzbnc)object4).zze;
            n10 = ((String[])object5).length;
            stringArray = ((zzbnc)object4).zzf;
            int n14 = stringArray.length;
            if (n10 == n14) {
                object9 = new HashMap();
                while (n7 < (n10 = ((String[])(object = ((zzbnc)object4).zze)).length)) {
                    object = object[n7];
                    object5 = ((zzbnc)object4).zzf[n7];
                    ((HashMap)object9).put(object, object5);
                    ++n7;
                }
                n3 = ((zzbnc)object4).zzc;
                object2 = ((zzbnc)object4).zzd;
                boolean bl2 = ((zzbnc)object4).zzg;
                long l12 = ((zzbnc)object4).zzh;
                object7 = object;
                object = new zzara(n3, (byte[])object2, (Map)object9, bl2, l12);
            }
            return object;
        }
        object = ((zzbnc)object4).zzb;
        object4 = new zzarn((String)object);
        throw object4;
    }
}

