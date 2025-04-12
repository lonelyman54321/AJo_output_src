/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdls;
import com.google.android.gms.internal.ads.zzehg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public final class zzdlt {
    private int zza;
    private zzdq zzb;
    private zzbho zzc;
    private View zzd;
    private List zze;
    private List zzf;
    private zzel zzg;
    private Bundle zzh;
    private zzchd zzi;
    private zzchd zzj;
    private zzchd zzk;
    private zzehg zzl;
    private ListenableFuture zzm;
    private zzccn zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbhv zzs;
    private zzbhv zzt;
    private String zzu;
    private final a53 zzv;
    private final a53 zzw;
    private float zzx;
    private String zzy;

    public zzdlt() {
        Object object = new a53();
        this.zzv = object;
        object = new a53();
        this.zzw = object;
        this.zzf = object = Collections.emptyList();
    }

    public static zzdlt zzag(zzbrq object) {
        Object object2;
        zzdlt zzdlt2 = null;
        try {
            object2 = object.zzg();
        }
        catch (RemoteException remoteException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from app install ad mapper", remoteException);
            return null;
        }
        object2 = zzdlt.zzak((zzdq)object2, null);
        zzbho zzbho2 = object.zzh();
        Object object3 = object.zzj();
        object3 = zzdlt.zzam((IObjectWrapper)object3);
        object3 = (View)object3;
        String string2 = object.zzo();
        List list = object.zzr();
        String string3 = object.zzm();
        Bundle bundle = object.zzf();
        String string4 = object.zzn();
        Object object4 = object.zzk();
        object4 = zzdlt.zzam((IObjectWrapper)object4);
        object4 = (View)object4;
        IObjectWrapper iObjectWrapper = object.zzl();
        String string5 = object.zzq();
        String string6 = object.zzp();
        double d2 = object.zze();
        zzbhv zzbhv2 = object.zzi();
        zzdlt2 = new zzdlt();
        object = zzbhv2;
        int n3 = 2;
        zzdlt2.zza = n3;
        zzdlt2.zzb = object2;
        zzdlt2.zzc = zzbho2;
        zzdlt2.zzd = object3;
        object2 = "headline";
        zzdlt2.zzZ((String)object2, string2);
        zzdlt2.zze = list;
        object2 = "body";
        zzdlt2.zzZ((String)object2, string3);
        zzdlt2.zzh = bundle;
        object2 = "call_to_action";
        zzdlt2.zzZ((String)object2, string4);
        zzdlt2.zzo = object4;
        zzdlt2.zzq = iObjectWrapper;
        object2 = "store";
        zzdlt2.zzZ((String)object2, string5);
        object2 = "price";
        zzdlt2.zzZ((String)object2, string6);
        zzdlt2.zzr = d2;
        object2 = zzbhv2;
        zzdlt2.zzs = zzbhv2;
        return zzdlt2;
    }

    public static zzdlt zzah(zzbrr object) {
        Object object2;
        try {
            object2 = object.zzf();
        }
        catch (RemoteException remoteException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from content ad mapper", remoteException);
            return null;
        }
        object2 = zzdlt.zzak((zzdq)object2, null);
        zzbho zzbho2 = object.zzg();
        Object object3 = object.zzi();
        object3 = zzdlt.zzam((IObjectWrapper)object3);
        object3 = (View)object3;
        String string2 = object.zzo();
        List list = object.zzp();
        String string3 = object.zzm();
        Bundle bundle = object.zze();
        String string4 = object.zzn();
        Object object4 = object.zzj();
        object4 = zzdlt.zzam((IObjectWrapper)object4);
        object4 = (View)object4;
        IObjectWrapper iObjectWrapper = object.zzk();
        String string5 = object.zzl();
        object = object.zzh();
        zzdlt zzdlt2 = new zzdlt();
        int n3 = 1;
        zzdlt2.zza = n3;
        zzdlt2.zzb = object2;
        zzdlt2.zzc = zzbho2;
        zzdlt2.zzd = object3;
        object2 = "headline";
        zzdlt2.zzZ((String)object2, string2);
        zzdlt2.zze = list;
        object2 = "body";
        zzdlt2.zzZ((String)object2, string3);
        zzdlt2.zzh = bundle;
        object2 = "call_to_action";
        zzdlt2.zzZ((String)object2, string4);
        zzdlt2.zzo = object4;
        zzdlt2.zzq = iObjectWrapper;
        object2 = "advertiser";
        zzdlt2.zzZ((String)object2, string5);
        zzdlt2.zzt = object;
        return zzdlt2;
    }

    public static zzdlt zzai(zzbrq zzbrq2) {
        Object object;
        try {
            object = zzbrq2.zzg();
        }
        catch (RemoteException remoteException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from app install ad mapper", remoteException);
            return null;
        }
        zzdls zzdls2 = zzdlt.zzak((zzdq)object, null);
        zzbho zzbho2 = zzbrq2.zzh();
        object = zzbrq2.zzj();
        Object object2 = object = zzdlt.zzam((IObjectWrapper)object);
        object2 = (View)object;
        String string2 = zzbrq2.zzo();
        List list = zzbrq2.zzr();
        String string3 = zzbrq2.zzm();
        Bundle bundle = zzbrq2.zzf();
        String string4 = zzbrq2.zzn();
        object = zzbrq2.zzk();
        Object object3 = object = zzdlt.zzam((IObjectWrapper)object);
        object3 = (View)object;
        IObjectWrapper iObjectWrapper = zzbrq2.zzl();
        String string5 = zzbrq2.zzq();
        String string6 = zzbrq2.zzp();
        double d2 = zzbrq2.zze();
        zzbhv zzbhv2 = zzbrq2.zzi();
        return zzdlt.zzal(zzdls2, zzbho2, (View)object2, string2, list, string3, bundle, string4, (View)object3, iObjectWrapper, string5, string6, d2, zzbhv2, null, 0.0f);
    }

    public static zzdlt zzaj(zzbrr zzbrr2) {
        Object object;
        try {
            object = zzbrr2.zzf();
        }
        catch (RemoteException remoteException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from content ad mapper", remoteException);
            return null;
        }
        zzdls zzdls2 = zzdlt.zzak((zzdq)object, null);
        zzbho zzbho2 = zzbrr2.zzg();
        object = zzbrr2.zzi();
        Object object2 = object = zzdlt.zzam((IObjectWrapper)object);
        object2 = (View)object;
        String string2 = zzbrr2.zzo();
        List list = zzbrr2.zzp();
        String string3 = zzbrr2.zzm();
        Bundle bundle = zzbrr2.zze();
        String string4 = zzbrr2.zzn();
        object = zzbrr2.zzj();
        Object object3 = object = zzdlt.zzam((IObjectWrapper)object);
        object3 = (View)object;
        IObjectWrapper iObjectWrapper = zzbrr2.zzk();
        zzbhv zzbhv2 = zzbrr2.zzh();
        String string5 = zzbrr2.zzl();
        double d2 = -1.0;
        return zzdlt.zzal(zzdls2, zzbho2, (View)object2, string2, list, string3, bundle, string4, (View)object3, iObjectWrapper, null, null, d2, zzbhv2, string5, 0.0f);
    }

    private static zzdls zzak(zzdq zzdq2, zzbru zzbru2) {
        if (zzdq2 == null) {
            return null;
        }
        zzdls zzdls2 = new zzdls(zzdq2, zzbru2);
        return zzdls2;
    }

    private static zzdlt zzal(zzdq zzdq2, zzbho zzbho2, View view, String string2, List list, String string3, Bundle bundle, String string4, View view2, IObjectWrapper iObjectWrapper, String string5, String string6, double d2, zzbhv zzbhv2, String string7, float f5) {
        zzdlt zzdlt2 = new zzdlt();
        zzdlt2.zza = 6;
        zzdlt2.zzb = zzdq2;
        zzdlt2.zzc = zzbho2;
        zzdlt2.zzd = view;
        zzdlt2.zzZ("headline", string2);
        zzdlt2.zze = list;
        zzdlt2.zzZ("body", string3);
        zzdlt2.zzh = bundle;
        zzdlt2.zzZ("call_to_action", string4);
        zzdlt2.zzo = view2;
        zzdlt2.zzq = iObjectWrapper;
        zzdlt2.zzZ("store", string5);
        zzdlt2.zzZ("price", string6);
        zzdlt2.zzr = d2;
        zzdlt2.zzs = zzbhv2;
        zzdlt2.zzZ("advertiser", string7);
        zzdlt2.zzR(f5);
        return zzdlt2;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdlt zzt(zzbru zzbru2) {
        zzdq zzdq2;
        try {
            zzdq2 = zzbru2.zzj();
        }
        catch (RemoteException remoteException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from unified ad mapper", remoteException);
            return null;
        }
        zzdq2 = zzdlt.zzak(zzdq2, zzbru2);
        zzbho zzbho2 = zzbru2.zzk();
        Object object = zzbru2.zzm();
        object = zzdlt.zzam((IObjectWrapper)object);
        object = (View)object;
        String string2 = zzbru2.zzs();
        List list = zzbru2.zzv();
        String string3 = zzbru2.zzq();
        Bundle bundle = zzbru2.zzi();
        String string4 = zzbru2.zzr();
        Object object2 = zzbru2.zzn();
        object2 = zzdlt.zzam((IObjectWrapper)object2);
        object2 = (View)object2;
        IObjectWrapper iObjectWrapper = zzbru2.zzo();
        String string5 = zzbru2.zzu();
        String string6 = zzbru2.zzt();
        double d2 = zzbru2.zze();
        zzbhv zzbhv2 = zzbru2.zzl();
        String string7 = zzbru2.zzp();
        float f5 = zzbru2.zzf();
        return zzdlt.zzal(zzdq2, zzbho2, (View)object, string2, list, string3, bundle, string4, (View)object2, iObjectWrapper, string5, string6, d2, zzbhv2, string7, f5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzA() {
        synchronized (this) {
            return this.zzu;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzB() {
        synchronized (this) {
            String string2 = "headline";
            return this.zzF(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzC() {
        synchronized (this) {
            return this.zzy;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzD() {
        synchronized (this) {
            String string2 = "price";
            return this.zzF(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzE() {
        synchronized (this) {
            String string2 = "store";
            return this.zzF(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzF(String object) {
        synchronized (this) {
            a53 a532 = this.zzw;
            object = a532.get(object);
            return (String)object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzG() {
        synchronized (this) {
            return this.zze;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzH() {
        synchronized (this) {
            return this.zzf;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzI() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                block7: {
                    try {
                        object = this.zzi;
                        if (object == null) break block7;
                        object.destroy();
                        this.zzi = null;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if ((object = this.zzj) != null) {
                    object.destroy();
                    this.zzj = null;
                }
                if ((object = this.zzk) != null) {
                    object.destroy();
                    this.zzk = null;
                }
                if ((object = this.zzm) != null) {
                    object.cancel(false);
                    this.zzm = null;
                }
                if ((object = this.zzn) != null) {
                    ((zzccn)object).cancel(false);
                    this.zzn = null;
                }
                this.zzl = null;
                object = this.zzv;
                ((a53)object).clear();
                object = this.zzw;
                ((a53)object).clear();
                this.zzb = null;
                this.zzc = null;
                this.zzd = null;
                this.zze = null;
                this.zzh = null;
                this.zzo = null;
                this.zzp = null;
                this.zzq = null;
                this.zzs = null;
                this.zzt = null;
                this.zzu = null;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzJ(zzbho zzbho2) {
        synchronized (this) {
            this.zzc = zzbho2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzK(String string2) {
        synchronized (this) {
            this.zzu = string2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzL(zzel zzel2) {
        synchronized (this) {
            this.zzg = zzel2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzM(zzbhv zzbhv2) {
        synchronized (this) {
            this.zzs = zzbhv2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzN(String string2, zzbhi object) {
        synchronized (this) {
            Throwable throwable2;
            if (object == null) {
                try {
                    object = this.zzv;
                    ((a53)object).remove(string2);
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                a53 a532 = this.zzv;
                a532.put(string2, object);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzO(zzchd zzchd2) {
        synchronized (this) {
            this.zzj = zzchd2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzP(List list) {
        synchronized (this) {
            this.zze = list;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzQ(zzbhv zzbhv2) {
        synchronized (this) {
            this.zzt = zzbhv2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzR(float f5) {
        synchronized (this) {
            this.zzx = f5;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzS(List list) {
        synchronized (this) {
            this.zzf = list;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzT(zzchd zzchd2) {
        synchronized (this) {
            this.zzk = zzchd2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzU(ListenableFuture listenableFuture) {
        synchronized (this) {
            this.zzm = listenableFuture;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzV(String string2) {
        synchronized (this) {
            this.zzy = string2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzW(zzehg zzehg2) {
        synchronized (this) {
            this.zzl = zzehg2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzX(zzccn zzccn2) {
        synchronized (this) {
            this.zzn = zzccn2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzY(double d2) {
        synchronized (this) {
            this.zzr = d2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzZ(String string2, String object) {
        synchronized (this) {
            Throwable throwable2;
            if (object == null) {
                try {
                    object = this.zzw;
                    ((a53)object).remove(string2);
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                a53 a532 = this.zzw;
                a532.put(string2, object);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final double zza() {
        synchronized (this) {
            return this.zzr;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaa(int n3) {
        synchronized (this) {
            this.zza = n3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzab(zzdq zzdq2) {
        synchronized (this) {
            this.zzb = zzdq2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzac(View view) {
        synchronized (this) {
            this.zzo = view;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzad(zzchd zzchd2) {
        synchronized (this) {
            this.zzi = zzchd2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzae(View view) {
        synchronized (this) {
            this.zzp = view;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaf() {
        synchronized (this) {
            zzchd zzchd2 = this.zzj;
            return zzchd2 != null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zzb() {
        synchronized (this) {
            return this.zzx;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzc() {
        synchronized (this) {
            return this.zza;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle zzd() {
        synchronized (this) {
            try {
                Bundle bundle = this.zzh;
                if (bundle != null) return this.zzh;
                this.zzh = bundle = new Bundle();
                return this.zzh;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View zze() {
        synchronized (this) {
            return this.zzd;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View zzf() {
        synchronized (this) {
            return this.zzo;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View zzg() {
        synchronized (this) {
            return this.zzp;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a53 zzh() {
        synchronized (this) {
            return this.zzv;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a53 zzi() {
        synchronized (this) {
            return this.zzw;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdq zzj() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzel zzk() {
        synchronized (this) {
            return this.zzg;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbho zzl() {
        synchronized (this) {
            return this.zzc;
        }
    }

    public final zzbhv zzm() {
        boolean bl2;
        boolean bl3;
        List list = this.zze;
        if (list != null && !(bl3 = list.isEmpty()) && (bl2 = (list = this.zze.get(0)) instanceof IBinder)) {
            return zzbhu.zzg((IBinder)list);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbhv zzn() {
        synchronized (this) {
            return this.zzs;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbhv zzo() {
        synchronized (this) {
            return this.zzt;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzccn zzp() {
        synchronized (this) {
            return this.zzn;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzchd zzq() {
        synchronized (this) {
            return this.zzj;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzchd zzr() {
        synchronized (this) {
            return this.zzk;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzchd zzs() {
        synchronized (this) {
            return this.zzi;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzehg zzu() {
        synchronized (this) {
            return this.zzl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IObjectWrapper zzv() {
        synchronized (this) {
            return this.zzq;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzw() {
        synchronized (this) {
            return this.zzm;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzx() {
        synchronized (this) {
            String string2 = "advertiser";
            return this.zzF(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzy() {
        synchronized (this) {
            String string2 = "body";
            return this.zzF(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzz() {
        synchronized (this) {
            String string2 = "call_to_action";
            return this.zzF(string2);
        }
    }
}

