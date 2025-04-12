/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzehj;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzeyj;
import com.google.android.gms.internal.ads.zzeyk;
import com.google.android.gms.internal.ads.zzeyl;
import com.google.android.gms.internal.ads.zzeyo;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzeym
implements zzexw {
    private final zzg zza;
    private final Context zzb;
    private final zzgge zzc;
    private final ScheduledExecutorService zzd;
    private final zzehj zze;
    private final zzfho zzf;
    private final VersionInfoParcel zzg;

    public zzeym(zzg zzg2, Context context, zzgge zzgge2, ScheduledExecutorService scheduledExecutorService, zzehj zzehj2, zzfho zzfho2, VersionInfoParcel versionInfoParcel) {
        this.zza = zzg2;
        this.zzb = context;
        this.zzc = zzgge2;
        this.zzd = scheduledExecutorService;
        this.zze = zzehj2;
        this.zzf = zzfho2;
        this.zzg = versionInfoParcel;
    }

    public final int zza() {
        return 56;
    }

    public final ListenableFuture zzb() {
        Object object;
        block12: {
            Object object2;
            int n3;
            Object object3;
            block14: {
                boolean bl2;
                block13: {
                    boolean bl3;
                    object = zzbep.zzkt;
                    object3 = zzba.zzc();
                    object = (Boolean)((zzben)object3).zza((zzbeg)object);
                    boolean n4 = (Boolean)object;
                    if (!n4 || !(bl3 = (object = this.zza).zzT())) break block12;
                    object = zzbep.zzkx;
                    object3 = zzba.zzc();
                    object = (Boolean)((zzben)object3).zza((zzbeg)object);
                    boolean bl4 = (Boolean)object;
                    if (!bl4) break block13;
                    object = this.zzf;
                    object3 = RequestConfiguration$PublisherPrivacyPersonalizationState.DISABLED;
                    n3 = ((RequestConfiguration$PublisherPrivacyPersonalizationState)((Object)object3)).getValue();
                    object = ((zzfho)object).zzd;
                    int n7 = ((zzl)object).zzy;
                    if (n7 == n3) break block12;
                }
                object = this.zzg;
                int n8 = ((VersionInfoParcel)object).clientJarVersion;
                object3 = zzbep.zzkr;
                object2 = zzba.zzc();
                object3 = (Integer)((zzben)object2).zza((zzbeg)object3);
                n3 = (Integer)object3;
                if (n8 < n3) break block12;
                int n10 = Build.VERSION.SDK_INT;
                object3 = zzbep.zzks;
                object2 = zzba.zzc();
                object3 = (Integer)((zzben)object2).zza((zzbeg)object3);
                n3 = (Integer)object3;
                if (n10 < n3) break block12;
                object = zzbep.zzkp;
                object3 = zzba.zzc();
                object = (Boolean)((zzben)object3).zza((zzbeg)object);
                boolean bl5 = (Boolean)object;
                if (!bl5) break block14;
                object = zzbep.zzkq;
                object3 = zzba.zzc();
                object = (String)((zzben)object3).zza((zzbeg)object);
                n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n3 != 0 || !(bl2 = (object = Arrays.asList(((String)object).split(","))).contains(object3 = this.zzb.getPackageName()))) break block12;
            }
            object = this.zze;
            n3 = 0;
            object3 = null;
            object = ((zzehj)object).zza(false);
            object3 = zzbep.zzkv;
            object2 = zzba.zzc();
            object3 = ((zzben)object2).zza((zzbeg)object3);
            object3 = (Integer)object3;
            n3 = (Integer)object3;
            long l2 = n3;
            Object object4 = TimeUnit.MILLISECONDS;
            Object object5 = this.zzd;
            try {
                object = zzgft.zzo((ListenableFuture)object, l2, object4, object5);
            }
            catch (Exception exception) {
                object = zzgft.zzg(exception);
            }
            object = zzgfk.zzu((ListenableFuture)object);
            object3 = new zzeyk();
            object2 = this.zzc;
            object = zzgft.zzn((ListenableFuture)object, (zzgfa)object3, (Executor)object2);
            object3 = new zzeyl(this);
            object2 = this.zzc;
            object = zzgft.zzf((ListenableFuture)object, Throwable.class, (zzgfa)object3, (Executor)object2);
            object3 = zzbep.zzkv;
            l2 = ((Integer)zzba.zzc().zza((zzbeg)object3)).intValue();
            object4 = this.zzd;
            object5 = TimeUnit.MILLISECONDS;
            return zzgft.zzo((ListenableFuture)object, l2, (TimeUnit)((Object)object5), (ScheduledExecutorService)object4);
        }
        object = new zzeyo("", -1, null);
        return zzgft.zzh(object);
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable object) {
        zzeyj zzeyj2 = new zzeyj((Throwable)object);
        this.zzc.zza(zzeyj2);
        int n3 = object instanceof SecurityException;
        String string2 = "";
        if (n3 != 0) {
            n3 = 2;
            object = new zzeyo(string2, n3, null);
        } else {
            n3 = object instanceof IllegalStateException;
            if (n3 != 0) {
                n3 = 3;
                object = new zzeyo(string2, n3, null);
            } else {
                n3 = object instanceof IllegalArgumentException;
                if (n3 != 0) {
                    n3 = 4;
                    object = new zzeyo(string2, n3, null);
                } else {
                    boolean bl2 = object instanceof TimeoutException;
                    if (bl2) {
                        n3 = 5;
                        object = new zzeyo(string2, n3, null);
                    } else {
                        n3 = 0;
                        zzeyj2 = null;
                        object = new zzeyo(string2, 0, null);
                    }
                }
            }
        }
        return zzgft.zzh(object);
    }
}

