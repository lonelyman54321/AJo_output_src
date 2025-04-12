/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzcsf;
import com.google.android.gms.internal.ads.zzcsh;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzdhk;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzhkj;
import java.util.concurrent.Executor;

final class zzcsi
extends zzcsf {
    private final Context zzc;
    private final View zzd;
    private final zzchd zze;
    private final zzfgu zzf;
    private final zzcun zzg;
    private final zzdme zzh;
    private final zzdhk zzi;
    private final zzhkj zzj;
    private final Executor zzk;
    private zzq zzl;

    public zzcsi(zzcuo zzcuo2, Context context, zzfgu zzfgu2, View view, zzchd zzchd2, zzcun zzcun2, zzdme zzdme2, zzdhk zzdhk2, zzhkj zzhkj2, Executor executor) {
        super(zzcuo2);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzchd2;
        this.zzf = zzfgu2;
        this.zzg = zzcun2;
        this.zzh = zzdme2;
        this.zzi = zzdhk2;
        this.zzj = zzhkj2;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcsi object) {
        Object object2 = ((zzcsi)object).zzh;
        Object object3 = ((zzdme)object2).zze();
        if (object3 == null) {
            return;
        }
        try {
            object2 = ((zzdme)object2).zze();
        }
        catch (RemoteException remoteException) {
            zzm.zzh("RemoteException when notifyAdLoad is called", remoteException);
            return;
        }
        object3 = ((zzcsi)object).zzj;
        object3 = object3.zzb();
        object3 = (zzbu)object3;
        object = ((zzcsi)object).zzc;
        object = ObjectWrapper.wrap(object);
        object2.zze((zzbu)object3, (IObjectWrapper)object);
    }

    public final int zza() {
        Object object = zzbep.zzhU;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            bl2 = ((zzfgt)object).zzah;
            if (bl2) {
                object = zzbep.zzhV;
                zzben2 = zzba.zzc();
                object = (Boolean)zzben2.zza((zzbeg)object);
                bl2 = (Boolean)object;
                if (!bl2) {
                    return 0;
                }
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzc() {
        return this.zzd;
    }

    public final zzdq zzd() {
        zzcun zzcun2;
        try {
            zzcun2 = this.zzg;
        }
        catch (zzfhv zzfhv2) {
            return null;
        }
        return zzcun2.zza();
    }

    public final zzfgu zze() {
        block3: {
            Object object = this.zzl;
            if (object != null) {
                return zzfhu.zzb((zzq)object);
            }
            object = this.zzb;
            boolean bl2 = object.zzad;
            if (bl2) {
                Object object2;
                object = object.zza.iterator();
                while (bl2 = object.hasNext()) {
                    String string2;
                    object2 = (String)object.next();
                    if (object2 == null || !(bl2 = ((String)object2).contains(string2 = "FirstParty"))) continue;
                    break block3;
                }
                object = this.zzd;
                int n3 = object.getWidth();
                int n4 = object.getHeight();
                object2 = new zzfgu(n3, n4, false);
                return object2;
            }
        }
        return (zzfgu)this.zzb.zzs.get(0);
    }

    public final zzfgu zzf() {
        return this.zzf;
    }

    public final void zzg() {
        this.zzi.zza();
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq2) {
        zzchd zzchd2;
        if (viewGroup != null && (zzchd2 = this.zze) != null) {
            zzcix zzcix2 = zzcix.zzc(zzq2);
            zzchd2.zzaj(zzcix2);
            int n3 = zzq2.zzc;
            viewGroup.setMinimumHeight(n3);
            n3 = zzq2.zzf;
            viewGroup.setMinimumWidth(n3);
            this.zzl = zzq2;
        }
    }

    public final void zzj() {
        zzcsh zzcsh2 = new zzcsh(this);
        this.zzk.execute(zzcsh2);
        super.zzj();
    }
}

