/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbpy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcoq;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzedb;
import com.google.android.gms.internal.ads.zzedc;
import com.google.android.gms.internal.ads.zzedd;
import com.google.android.gms.internal.ads.zzede;
import com.google.android.gms.internal.ads.zzedf;
import com.google.android.gms.internal.ads.zzedg;
import com.google.android.gms.internal.ads.zzedh;
import com.google.android.gms.internal.ads.zzedi;
import com.google.android.gms.internal.ads.zzedj;
import com.google.android.gms.internal.ads.zzedk;
import com.google.android.gms.internal.ads.zzedl;
import com.google.android.gms.internal.ads.zzedm;
import com.google.android.gms.internal.ads.zzedn;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzeee;
import com.google.android.gms.internal.ads.zzeef;
import com.google.android.gms.internal.ads.zzeeg;
import com.google.android.gms.internal.ads.zzeeh;
import com.google.android.gms.internal.ads.zzeei;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzeyv;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmi;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzedq
extends zzbxc {
    private final Context zza;
    private final zzgge zzb;
    private final zzeei zzc;
    private final zzcoq zzd;
    private final ArrayDeque zze;
    private final zzfmq zzf;
    private final zzbyd zzg;
    private final zzeef zzh;

    public zzedq(Context context, zzgge zzgge2, zzbyd zzbyd2, zzcoq zzcoq2, zzeei zzeei2, ArrayDeque arrayDeque, zzeef zzeef2, zzfmq zzfmq2) {
        zzbep.zza(context);
        this.zza = context;
        this.zzb = zzgge2;
        this.zzg = zzbyd2;
        this.zzc = zzeei2;
        this.zzd = zzcoq2;
        this.zze = arrayDeque;
        this.zzh = zzeef2;
        this.zzf = zzfmq2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzedn zzk(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object = this.zze;
                    object = ((ArrayDeque)object).iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (zzedn)object2;
                        String string3 = ((zzedn)object2).zzc;
                        boolean bl3 = string3.equals(string2);
                        if (!bl3) continue;
                        object.remove();
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzflt zzflt2, zzbqh object, zzfmn zzfmn2, zzfmc zzfmc2) {
        Object object2 = zzbqe.zza;
        zzedi zzedi2 = new zzedi();
        object = ((zzbqh)object).zza("AFMA_getAdDictionary", (zzbqa)object2, zzedi2);
        zzfmm.zze(listenableFuture, zzfmc2);
        object2 = zzfln.zzg;
        listenableFuture = zzflt2.zzb(object2, listenableFuture).zzf((zzgfa)object).zza();
        zzfmm.zzd(listenableFuture, zzfmn2, zzfmc2);
        return listenableFuture;
    }

    private static ListenableFuture zzm(zzbxu object, zzflt zzflt2, zzeyv object2) {
        zzedc zzedc2 = new zzedc((zzeyv)object2, (zzbxu)object);
        object2 = new zzedd();
        zzfln zzfln2 = zzfln.zze;
        object = zzgft.zzh(((zzbxu)object).zza);
        return zzflt2.zzb((Object)zzfln2, (ListenableFuture)object).zzf(zzedc2).zze((zzfkw)object2).zza();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzn(zzedn zzedn2) {
        synchronized (this) {
            this.zzo();
            ArrayDeque arrayDeque = this.zze;
            arrayDeque.addLast(zzedn2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzo() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayDeque arrayDeque;
                    int n3;
                    Object object = zzbgr.zzc;
                    object = ((zzbfv)object).zze();
                    object = (Long)object;
                    int n4 = ((Long)object).intValue();
                    while ((n3 = (arrayDeque = this.zze).size()) >= n4) {
                        arrayDeque = this.zze;
                        arrayDeque.removeFirst();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbxn object, zzbxu zzbxu2) {
        Object object2 = new zzedj(this);
        zzgge zzgge2 = zzcci.zza;
        listenableFuture = zzgft.zzn(listenableFuture, (zzgfa)object2, zzgge2);
        object2 = new zzedm(this, (zzbxn)object, zzbxu2);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
    }

    public final ListenableFuture zzb(zzbxu object, int n3) {
        Object object2 = (Boolean)zzbgr.zza.zze();
        int n4 = object2.booleanValue();
        if (n4 == 0) {
            object = new Exception("Split request is disabled.");
            return zzgft.zzg((Throwable)object);
        }
        object2 = ((zzbxu)object).zzi;
        if (object2 == null) {
            object = new Exception("Pool configuration missing from request.");
            return zzgft.zzg((Throwable)object);
        }
        int n7 = object2.zzc;
        if (n7 != 0 && (n4 = object2.zzd) != 0) {
            object2 = this.zza;
            Object object3 = this.zzf;
            Object object4 = zzu.zzf();
            Object object5 = VersionInfoParcel.forPackage();
            object2 = object4.zzb((Context)object2, (VersionInfoParcel)object5, (zzfmq)object3);
            Object object6 = this.zzd.zzr((zzbxu)object, n3);
            object3 = ((zzeyv)object6).zzc();
            ListenableFuture listenableFuture = zzedq.zzm((zzbxu)object, (zzflt)object3, (zzeyv)object6);
            object6 = ((zzeyv)object6).zzd();
            object4 = this.zza;
            object5 = zzfmu.zzp;
            zzfmc zzfmc2 = zzfmb.zza((Context)object4, (zzfmu)object5);
            ListenableFuture listenableFuture2 = zzedq.zzl(listenableFuture, (zzflt)object3, (zzbqh)object2, (zzfmn)object6, zzfmc2);
            object6 = zzfln.zzz;
            object2 = new ListenableFuture[]{listenableFuture, listenableFuture2};
            object6 = ((zzfll)object3).zza(object6, (ListenableFuture)object2);
            object4 = object2;
            object5 = this;
            object2 = new zzedg(this, listenableFuture2, listenableFuture, (zzbxu)object, zzfmc2);
            return ((zzflb)object6).zza((Callable)object2).zza();
        }
        object = new Exception("Caching is disabled.");
        return zzgft.zzg((Throwable)object);
    }

    public final ListenableFuture zzc(zzbxu zzbxu2, int n3) {
        Object object;
        int n4;
        zzedq zzedq2 = this;
        Object object2 = zzbxu2;
        int n7 = n3;
        int n8 = 0;
        Callable callable = null;
        int n10 = 2;
        Object object3 = zzu.zzf();
        Object object4 = this.zza;
        Object object5 = VersionInfoParcel.forPackage();
        Object object6 = this.zzf;
        object3 = ((zzbpy)object3).zzb((Context)object4, (VersionInfoParcel)object5, (zzfmq)object6);
        object4 = this.zzd.zzr(zzbxu2, n3);
        object5 = zzedp.zza;
        object6 = zzbqe.zzb;
        Object object7 = "google.afma.response.normalize";
        object5 = ((zzbqh)object3).zza((String)object7, (zzbqa)object5, (zzbpz)object6);
        object6 = (Boolean)zzbgr.zza.zze();
        boolean bl2 = (Boolean)object6;
        if (!bl2) {
            object6 = zzbxu2.zzj;
            n4 = 0;
            object7 = null;
            if (object6 != null && !(bl2 = ((String)object6).isEmpty())) {
                object6 = "Request contained a PoolKey but split request is disabled.";
                com.google.android.gms.ads.internal.util.zze.zza((String)object6);
            }
        } else {
            object6 = zzbxu2.zzh;
            object7 = this.zzk((String)object6);
            if (object7 == null) {
                object6 = "Request contained a PoolKey but no matching parameters were found.";
                com.google.android.gms.ads.internal.util.zze.zza((String)object6);
            }
        }
        if (object7 == null) {
            object6 = zzedq2.zza;
            object = zzfmu.zzp;
            object6 = zzfmb.zza((Context)object6, (zzfmu)object);
        } else {
            object6 = ((zzedn)object7).zze;
        }
        object = object4.zzd();
        Object object8 = ((zzbxu)object2).zza.getStringArrayList("ad_types");
        ((zzfmn)object).zze((ArrayList)object8);
        Object object9 = ((zzbxu)object2).zzg;
        object8 = new zzeeh((String)object9, (zzfmn)object, (zzfmc)object6);
        object9 = zzedq2.zza;
        Object object10 = ((zzbxu)object2).zzb.afmaVersion;
        zzbyd zzbyd2 = zzedq2.zzg;
        Object object11 = new zzeee((Context)object9, (String)object10, zzbyd2, n7);
        Object object12 = object4.zzc();
        object9 = zzedq2.zza;
        object10 = zzfmu.zzs;
        object9 = zzfmb.zza((Context)object9, (zzfmu)object10);
        if (object7 == null) {
            object4 = zzedq.zzm((zzbxu)object2, (zzflt)object12, (zzeyv)object4);
            object3 = zzedq.zzl((ListenableFuture)object4, (zzflt)object12, (zzbqh)object3, (zzfmn)object, (zzfmc)object6);
            object6 = zzedq2.zza;
            object7 = zzfmu.zzq;
            object6 = zzfmb.zza((Context)object6, (zzfmu)object7);
            object7 = zzfln.zzi;
            object10 = new ListenableFuture[n10];
            object10[0] = object3;
            int n14 = 1;
            object10[n14] = object4;
            object7 = ((zzfll)object12).zza(object7, (ListenableFuture)object10);
            object10 = new zzede((ListenableFuture)object3, (zzbxu)object2, (ListenableFuture)object4);
            object7 = ((zzflb)object7).zza((Callable)object10).zze((zzfkw)object8);
            object8 = new zzfmi((zzfmc)object6);
            object11 = ((zzflk)object7).zze((zzfkw)object8).zze((zzfkw)object11).zza();
            zzfmm.zzb((ListenableFuture)object11, (zzfmn)object, (zzfmc)object6);
            zzfmm.zze((ListenableFuture)object11, (zzfmc)object9);
            object6 = zzfln.zzk;
            n4 = 3;
            object7 = new ListenableFuture[n4];
            object7[0] = object4;
            n8 = 1;
            object7[n8] = object3;
            object7[n10] = object11;
            object12 = ((zzfll)object12).zza(object6, (ListenableFuture[])object7);
            callable = new zzedf((zzbxu)object2, (ListenableFuture)object11, (ListenableFuture)object4, (ListenableFuture)object3);
            object2 = ((zzflb)object12).zza(callable).zzf((zzgfa)object5).zza();
        } else {
            object3 = ((zzedn)object7).zzb;
            object4 = ((zzedn)object7).zza;
            object2 = new zzeeg((JSONObject)object3, (zzbxx)object4);
            object3 = zzedq2.zza;
            object4 = zzfmu.zzq;
            object3 = zzfmb.zza((Context)object3, (zzfmu)object4);
            object4 = zzfln.zzi;
            object2 = zzgft.zzh(object2);
            object2 = ((zzfll)object12).zzb(object4, (ListenableFuture)object2).zze((zzfkw)object8);
            object4 = new zzfmi((zzfmc)object3);
            object2 = ((zzflk)object2).zze((zzfkw)object4).zze((zzfkw)object11).zza();
            zzfmm.zzb((ListenableFuture)object2, (zzfmn)object, (zzfmc)object3);
            object11 = zzgft.zzh(object7);
            zzfmm.zze((ListenableFuture)object2, (zzfmc)object9);
            object3 = zzfln.zzk;
            ListenableFuture[] listenableFutureArray = new ListenableFuture[n10];
            listenableFutureArray[0] = object2;
            n8 = 1;
            listenableFutureArray[n8] = object11;
            object12 = ((zzfll)object12).zza(object3, listenableFutureArray);
            callable = new zzedb((ListenableFuture)object2, (ListenableFuture)object11);
            object2 = ((zzflb)object12).zza(callable).zzf((zzgfa)object5).zza();
        }
        zzfmm.zzb((ListenableFuture)object2, (zzfmn)object, (zzfmc)object9);
        return object2;
    }

    public final ListenableFuture zzd(zzbxu object, int n3) {
        Object object2 = zzu.zzf();
        Object object3 = this.zza;
        Object object4 = VersionInfoParcel.forPackage();
        Object object5 = this.zzf;
        object2 = ((zzbpy)object2).zzb((Context)object3, (VersionInfoParcel)object4, (zzfmq)object5);
        object3 = (Boolean)zzbgw.zza.zze();
        boolean bl2 = (Boolean)object3;
        if (!bl2) {
            object = new Exception("Signal collection disabled.");
            return zzgft.zzg((Throwable)object);
        }
        Object object6 = this.zzd.zzr((zzbxu)object, n3);
        object3 = ((zzeyv)object6).zza();
        object4 = zzbqe.zza;
        object5 = zzbqe.zzb;
        object2 = ((zzbqh)object2).zza("google.afma.request.getSignals", (zzbqa)object4, (zzbpz)object5);
        object4 = this.zza;
        object5 = zzfmu.zzN;
        object4 = zzfmb.zza((Context)object4, (zzfmu)object5);
        object5 = ((zzeyv)object6).zzc();
        Object object7 = zzfln.zzl;
        ListenableFuture listenableFuture = zzgft.zzh(((zzbxu)object).zza);
        object5 = ((zzfll)object5).zzb(object7, listenableFuture);
        object7 = new zzfmi((zzfmc)object4);
        object5 = ((zzflk)object5).zze((zzfkw)object7);
        object7 = new zzedk((zzexz)object3, (zzbxu)object);
        object3 = ((zzflk)object5).zzf((zzgfa)object7);
        object5 = zzfln.zzm;
        object2 = ((zzflk)object3).zzb(object5).zzf((zzgfa)object2).zza();
        object6 = ((zzeyv)object6).zzd();
        object3 = ((zzbxu)object).zza;
        object5 = "ad_types";
        object3 = object3.getStringArrayList((String)object5);
        ((zzfmn)object6).zze((ArrayList)object3);
        object = ((zzbxu)object).zza;
        object3 = "extras";
        object = object.getBundle((String)object3);
        ((zzfmn)object6).zzg((Bundle)object);
        zzfmm.zzc((ListenableFuture)object2, (zzfmn)object6, (zzfmc)object4);
        object = (Boolean)zzbgk.zzg.zze();
        boolean bl3 = (Boolean)object;
        if (bl3) {
            object = this.zzc;
            Objects.requireNonNull(object);
            object6 = new zzedh((zzeei)object);
            object = this.zzb;
            object2.addListener((Runnable)object6, (Executor)object);
        }
        return object2;
    }

    public final void zze(zzbxu zzbxu2, zzbxn zzbxn2) {
        int n3 = Binder.getCallingUid();
        ListenableFuture listenableFuture = this.zzb(zzbxu2, n3);
        this.zzp(listenableFuture, zzbxn2, zzbxu2);
    }

    public final void zzf(zzbxu zzbxu2, zzbxn zzbxn2) {
        Object object = zzbep.zzcd;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3 && (object = zzbxu2.zzm) != null) {
            object2 = zzdul.zze.zza();
            Clock clock = zzu.zzB();
            long l2 = clock.currentTimeMillis();
            object.putLong((String)object2, l2);
        }
        int n4 = Binder.getCallingUid();
        object = this.zzd(zzbxu2, n4);
        this.zzp((ListenableFuture)object, zzbxn2, zzbxu2);
    }

    public final void zzg(zzbxu object, zzbxn object2) {
        Object object3 = zzbep.zzcd;
        Object object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        boolean n3 = (Boolean)object3;
        if (n3 && (object3 = ((zzbxu)object).zzm) != null) {
            object4 = zzdul.zze.zza();
            Clock clock = zzu.zzB();
            long l2 = clock.currentTimeMillis();
            object3.putLong((String)object4, l2);
        }
        int n4 = Binder.getCallingUid();
        object3 = this.zzc((zzbxu)object, n4);
        this.zzp((ListenableFuture)object3, (zzbxn)object2, (zzbxu)object);
        object = (Boolean)zzbgk.zze.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzc;
            Objects.requireNonNull(object);
            object2 = new zzedh((zzeei)object);
            object = this.zzb;
            object3.addListener((Runnable)object2, (Executor)object);
        }
    }

    public final void zzh(String object, zzbxn zzbxn2) {
        object = this.zzi((String)object);
        this.zzp((ListenableFuture)object, zzbxn2, null);
    }

    public final ListenableFuture zzi(String object) {
        Object object2 = (Boolean)zzbgr.zza.zze();
        boolean bl2 = (Boolean)object2;
        if (!bl2) {
            object = new Exception("Split request is disabled.");
            return zzgft.zzg((Throwable)object);
        }
        object2 = new zzedl(this);
        zzedn zzedn2 = this.zzk((String)object);
        if (zzedn2 == null) {
            object = String.valueOf(object);
            object = "URL to be removed not found for cache key: ".concat((String)object);
            object2 = new Exception((String)object);
            return zzgft.zzg((Throwable)object2);
        }
        return zzgft.zzh(object2);
    }

    public final /* synthetic */ InputStream zzj(ListenableFuture object, ListenableFuture object2, zzbxu zzbxu2, zzfmc zzfmc2) {
        String string2 = ((zzbxx)object.get()).zze();
        object2 = object2.get();
        ListenableFuture listenableFuture = object2;
        listenableFuture = (JSONObject)object2;
        String string3 = zzbxu2.zzh;
        Object object3 = object = object.get();
        object3 = (zzbxx)object;
        object2 = new zzedn((zzbxx)object3, (JSONObject)listenableFuture, string3, string2, zzfmc2);
        this.zzn((zzedn)object2);
        object2 = zzfxs.zzc;
        object2 = string2.getBytes((Charset)object2);
        object = new ByteArrayInputStream((byte[])object2);
        return object;
    }
}

