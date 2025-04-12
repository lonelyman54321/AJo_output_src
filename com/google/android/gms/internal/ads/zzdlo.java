/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.webkit.WebView
 *  android.widget.ImageView$ScaleType
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbap;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzdle;
import com.google.android.gms.internal.ads.zzdlf;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdlh;
import com.google.android.gms.internal.ads.zzdli;
import com.google.android.gms.internal.ads.zzdlj;
import com.google.android.gms.internal.ads.zzdlk;
import com.google.android.gms.internal.ads.zzdll;
import com.google.android.gms.internal.ads.zzdlm;
import com.google.android.gms.internal.ads.zzdln;
import com.google.android.gms.internal.ads.zzdlq;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdly;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzdmt;
import com.google.android.gms.internal.ads.zzdnp;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzehd;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzepf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzhkj;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdlo
extends zzcup {
    public static final zzgbc zzc = zzgbc.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbap zzA;
    private final Executor zzd;
    private final zzdlt zze;
    private final zzdmb zzf;
    private final zzdmt zzg;
    private final zzdly zzh;
    private final zzdme zzi;
    private final zzhkj zzj;
    private final zzhkj zzk;
    private final zzhkj zzl;
    private final zzhkj zzm;
    private final zzhkj zzn;
    private zzdnp zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzcaq zzs;
    private final zzaxd zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdlq zzw;
    private final zzepf zzx;
    private final Map zzy;
    private final List zzz;

    public zzdlo(zzcuo zzcuo2, Executor executor, zzdlt zzdlt2, zzdmb zzdmb2, zzdmt zzdmt2, zzdly zzdly2, zzdme zzdme2, zzhkj zzhkj2, zzhkj zzhkj3, zzhkj zzhkj4, zzhkj zzhkj5, zzhkj zzhkj6, zzcaq zzcaq2, zzaxd zzaxd2, VersionInfoParcel versionInfoParcel, Context context, zzdlq zzdlq2, zzepf zzepf2, zzbap zzbap2) {
        super(zzcuo2);
        Object object = executor;
        this.zzd = executor;
        object = zzdlt2;
        this.zze = zzdlt2;
        object = zzdmb2;
        this.zzf = zzdmb2;
        object = zzdmt2;
        this.zzg = zzdmt2;
        object = zzdly2;
        this.zzh = zzdly2;
        object = zzdme2;
        this.zzi = zzdme2;
        object = zzhkj2;
        this.zzj = zzhkj2;
        object = zzhkj3;
        this.zzk = zzhkj3;
        object = zzhkj4;
        this.zzl = zzhkj4;
        object = zzhkj5;
        this.zzm = zzhkj5;
        object = zzhkj6;
        this.zzn = zzhkj6;
        object = zzcaq2;
        this.zzs = zzcaq2;
        object = zzaxd2;
        this.zzt = zzaxd2;
        object = versionInfoParcel;
        this.zzu = versionInfoParcel;
        object = context;
        this.zzv = context;
        object = zzdlq2;
        this.zzw = zzdlq2;
        object = zzepf2;
        this.zzx = zzepf2;
        object = new HashMap();
        this.zzy = object;
        super();
        this.zzz = object;
        object = zzbap2;
        this.zzA = zzbap2;
    }

    public static boolean zzX(View object) {
        boolean bl2;
        Object object2 = zzbep.zzkE;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        boolean bl4 = true;
        if (bl3) {
            Object object3;
            com.google.android.gms.ads.internal.zzu.zzp();
            long l2 = com.google.android.gms.ads.internal.util.zzt.zzw((View)object);
            bl3 = object.isShown();
            if (bl3 && (object3 = object.getGlobalVisibleRect((Rect)(object2 = new Rect()), null)) != 0) {
                object = zzbep.zzkF;
                object2 = zzba.zzc();
                object = (Integer)((zzben)object2).zza((zzbeg)object);
                long l3 = ((Integer)object).intValue();
                long l4 = l2 - l3;
                object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 >= 0) {
                    return bl4;
                }
            }
            return false;
        }
        bl3 = object.isShown();
        if (bl3 && (bl2 = object.getGlobalVisibleRect((Rect)(object2 = new Rect()), null))) {
            return bl4;
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ImageView.ScaleType zzZ() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                try {
                    object = this.zzo;
                    if (object == null) {
                        object = "Ad should be associated with an ad view before calling getMediaviewScaleType()";
                        com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if ((object = object.zzj()) == null) return zzdmt.zza;
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                return (ImageView.ScaleType)object;
            }
            throw throwable2;
        }
    }

    private final void zzaa(String object, boolean bl2) {
        object = zzbep.zzfi;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        bl2 = true;
        String string2 = "Google";
        if (bl3) {
            object = this.zze.zzw();
            if (object == null) {
                return;
            }
            zzdlm zzdlm2 = new zzdlm(this, string2, bl2);
            object2 = this.zzd;
            zzgft.zzr((ListenableFuture)object, zzdlm2, (Executor)object2);
            return;
        }
        this.zzf(string2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzab(View view, Map map2, Map map3) {
        synchronized (this) {
            boolean bl2;
            zzdmt zzdmt2 = this.zzg;
            Object object = this.zzo;
            zzdmt2.zzd((zzdnp)object);
            zzdmt2 = this.zzZ();
            object = this.zzf;
            object.zzq(view, map2, map3, (ImageView.ScaleType)zzdmt2);
            this.zzq = bl2 = true;
            return;
        }
    }

    private final void zzac(View view, zzehg object) {
        Object object2 = this.zze.zzr();
        zzdly zzdly2 = this.zzh;
        boolean bl2 = zzdly2.zzd();
        if (bl2 && object != null && object2 != null && view != null) {
            object2 = com.google.android.gms.ads.internal.zzu.zzA();
            object = ((zzehg)object).zza();
            object2.zzj((zzfoj)object, view);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzad(zzdnp object) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block8: {
                    Object object2;
                    Map map2;
                    Object object3;
                    Object object4;
                    Object object5;
                    boolean bl2;
                    block9: {
                        try {
                            bl2 = this.zzp;
                            if (bl2) break block8;
                            this.zzo = object;
                            object5 = this.zzg;
                            ((zzdmt)object5).zze((zzdnp)object);
                            object4 = this.zzf;
                            object3 = object.zzf();
                            map2 = object.zzm();
                            object2 = object.zzn();
                            object4.zzy((View)object3, map2, (Map)object2, (View.OnTouchListener)object, (View.OnClickListener)object);
                            object5 = zzbep.zzcD;
                            object4 = zzba.zzc();
                            object5 = ((zzben)object4).zza((zzbeg)object5);
                            object5 = (Boolean)object5;
                            bl2 = (Boolean)object5;
                            if (!bl2) break block9;
                            object5 = this.zzt;
                            if ((object5 = ((zzaxd)object5).zzc()) == null) break block9;
                            object4 = object.zzf();
                            object5.zzo((View)object4);
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    object5 = zzbep.zzbL;
                    object4 = zzba.zzc();
                    object5 = ((zzben)object4).zza((zzbeg)object5);
                    bl2 = (Boolean)(object5 = (Boolean)object5);
                    if (bl2) {
                        object5 = this.zzb;
                        boolean bl3 = ((zzfgt)object5).zzal;
                        if (bl3) {
                            object5 = ((zzfgt)object5).zzak;
                            if ((object5 = object5.keys()) != null) {
                                while (bl3 = object5.hasNext()) {
                                    object4 = object5.next();
                                    object4 = (String)object4;
                                    object3 = this.zzo;
                                    object3 = object3.zzl();
                                    object3 = object3.get(object4);
                                    object3 = (WeakReference)object3;
                                    map2 = this.zzy;
                                    object2 = Boolean.FALSE;
                                    map2.put(object4, object2);
                                    if (object3 == null) continue;
                                    object3 = ((Reference)object3).get();
                                    if (object3 == null) continue;
                                    map2 = this.zzv;
                                    object2 = new zzbao((Context)map2, (View)object3);
                                    object3 = this.zzz;
                                    object3.add(object2);
                                    object3 = new zzdll(this, (String)object4);
                                    ((zzbao)object2).zzc((zzban)object3);
                                }
                            }
                        }
                    }
                    if ((object5 = object.zzi()) != null) {
                        object = object.zzi();
                        object5 = this.zzs;
                        ((zzbao)object).zzc((zzban)object5);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private final void zzae(zzdnp object) {
        Object object2 = this.zzf;
        View view = object.zzf();
        Map map2 = object.zzl();
        object2.zzz(view, map2);
        object2 = object.zzh();
        if (object2 != null) {
            object2 = object.zzh();
            view = null;
            object2.setClickable(false);
            object2 = object.zzh();
            object2.removeAllViews();
        }
        if ((object2 = object.zzi()) != null) {
            object = object.zzi();
            object2 = this.zzs;
            ((zzbao)object).zze((zzban)object2);
        }
        this.zzo = null;
    }

    public static /* bridge */ /* synthetic */ zzdlt zzd(zzdlo zzdlo2) {
        return zzdlo2.zze;
    }

    public static /* bridge */ /* synthetic */ zzdnp zze(zzdlo zzdlo2) {
        return zzdlo2.zzo;
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzdlo zzdlo2) {
        return zzdlo2.zzy;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzs(zzdlo object) {
        RemoteException remoteException2;
        block13: {
            boolean bl2;
            String string2;
            Object object2;
            block9: {
                block10: {
                    block11: {
                        block12: {
                            try {
                                object2 = ((zzdlo)object).zze;
                                boolean bl3 = ((zzdlt)object2).zzc();
                                string2 = "Google";
                                bl2 = true;
                                if (bl3 == bl2) break block9;
                                boolean bl4 = 2 != 0;
                                if (bl3 == bl4) break block10;
                                bl4 = 3 != 0;
                                if (bl3 == bl4) break block11;
                                boolean bl5 = 6 != 0;
                                if (bl3 == bl5) break block12;
                                bl5 = 7 != 0;
                                if (bl3 != bl5) {
                                    object = "Wrong native template id!";
                                    com.google.android.gms.ads.internal.util.client.zzm.zzg((String)object);
                                    return;
                                }
                            }
                            catch (RemoteException remoteException2) {
                                break block13;
                            }
                            object2 = ((zzdlo)object).zzi;
                            zzboi zzboi2 = ((zzdme)object2).zzg();
                            if (zzboi2 == null) return;
                            object2 = ((zzdme)object2).zzg();
                            object = ((zzdlo)object).zzm;
                            object = object.zzb();
                            object = (zzboc)object;
                            object2.zzg((zzboc)object);
                            return;
                        }
                        object2 = ((zzdlo)object).zzi;
                        if ((object2 = ((zzdme)object2).zzf()) == null) return;
                        super.zzaa(string2, bl2);
                        object2 = ((zzdlo)object).zzi;
                        object2 = ((zzdme)object2).zzf();
                        object = ((zzdlo)object).zzl;
                        object = object.zzb();
                        object = (zzbjs)object;
                        object2.zze((zzbjs)object);
                        return;
                    }
                    Object object3 = ((zzdlo)object).zzi;
                    object2 = ((zzdlt)object2).zzA();
                    if ((object2 = ((zzdme)object3).zzd((String)object2)) == null) return;
                    object2 = ((zzdlo)object).zze;
                    if ((object2 = ((zzdlt)object2).zzs()) != null) {
                        ((zzdlo)object).zzf(string2, bl2);
                    }
                    object2 = ((zzdlo)object).zzi;
                    object3 = ((zzdlo)object).zze;
                    object3 = ((zzdlt)object3).zzA();
                    object2 = ((zzdme)object2).zzd((String)object3);
                    object = ((zzdlo)object).zzn;
                    object = object.zzb();
                    object = (zzbip)object;
                    object2.zze((zzbip)object);
                    return;
                }
                object2 = ((zzdlo)object).zzi;
                if ((object2 = ((zzdme)object2).zza()) == null) return;
                ((zzdlo)object).zzaa(string2, bl2);
                object2 = ((zzdlo)object).zzi;
                object2 = ((zzdme)object2).zza();
                object = ((zzdlo)object).zzk;
                object = object.zzb();
                object = (zzbik)object;
                object2.zze((zzbik)object);
                return;
            }
            object2 = ((zzdlo)object).zzi;
            if ((object2 = ((zzdme)object2).zzb()) == null) return;
            ((zzdlo)object).zzaa(string2, bl2);
            object2 = ((zzdlo)object).zzi;
            object2 = ((zzdme)object2).zzb();
            object = ((zzdlo)object).zzj;
            object = object.zzb();
            object = (zzbim)object;
            object2.zze((zzbim)object);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", remoteException2);
    }

    public static /* bridge */ /* synthetic */ void zzt(zzdlo zzdlo2, View view, zzehg zzehg2) {
        zzdlo2.zzac(view, zzehg2);
    }

    public final /* synthetic */ void zzA(zzdnp zzdnp2) {
        this.zzae(zzdnp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzB(View view, Map map2, Map map3, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block7: {
                    Object object;
                    boolean bl3;
                    block8: {
                        try {
                            boolean bl4;
                            bl3 = this.zzq;
                            if (bl3) break block7;
                            object = zzbep.zzbL;
                            Object object2 = zzba.zzc();
                            object = ((zzben)object2).zza((zzbeg)object);
                            bl3 = (Boolean)(object = (Boolean)object);
                            if (!bl3) break block8;
                            object = this.zzb;
                            bl3 = ((zzfgt)object).zzal;
                            if (!bl3) break block8;
                            object = this.zzy;
                            object = object.keySet();
                            object = object.iterator();
                            while (bl4 = object.hasNext()) {
                                object2 = object.next();
                                object2 = (String)object2;
                                Map map4 = this.zzy;
                                object2 = map4.get(object2);
                                bl4 = (Boolean)(object2 = (Boolean)object2);
                                if (bl4) continue;
                                break block7;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    if (bl2) {
                        this.zzab(view, map2, map3);
                        return;
                    }
                    Object object3 = zzbep.zzdS;
                    object = zzba.zzc();
                    object3 = ((zzben)object).zza((zzbeg)object3);
                    bl2 = (Boolean)(object3 = (Boolean)object3);
                    if (bl2 && map2 != null) {
                        object3 = map2.entrySet();
                        object3 = object3.iterator();
                        while (bl3 = object3.hasNext()) {
                            object = object3.next();
                            object = (Map.Entry)object;
                            object = object.getValue();
                            object = (WeakReference)object;
                            object = ((Reference)object).get();
                            if ((object = (View)object) == null || !(bl3 = zzdlo.zzX((View)object))) continue;
                            this.zzab(view, map2, map3);
                            return;
                        }
                    }
                }
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
    public final void zzC(zzcw zzcw2) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzj(zzcw2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzD(View object, View object2, Map object3, Map map2, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdmt zzdmt2 = this.zzg;
                    zzdnp zzdnp2 = this.zzo;
                    zzdmt2.zzc(zzdnp2);
                    ImageView.ScaleType scaleType = this.zzZ();
                    zzdmb zzdmb2 = this.zzf;
                    zzdmb2.zzk((View)object, (View)object2, (Map)object3, map2, bl2, scaleType);
                    boolean bl3 = this.zzr;
                    if (bl3 && (object2 = ((zzdlt)(object = this.zze)).zzs()) != null) {
                        object = ((zzdlt)object).zzs();
                        object2 = new Jp();
                        object3 = "onSdkAdUserInteractionClick";
                        object.zzd((String)object3, (Map)object2);
                        return;
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzE(View object, int n3) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                Object object2;
                Object object3;
                block6: {
                    try {
                        object3 = zzbep.zzlA;
                        object2 = zzba.zzc();
                        object3 = ((zzben)object2).zza((zzbeg)object3);
                        object3 = (Boolean)object3;
                        bl2 = (Boolean)object3;
                        if (bl2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                object3 = this.zzo;
                if (object3 == null) {
                    object = "Ad should be associated with an ad view before calling performClickForCustomGesture()";
                    com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                    return;
                }
                object2 = this.zzd;
                bl2 = object3 instanceof zzdmn;
                {
                    zzdli zzdli2 = new zzdli(this, (View)object, bl2, n3);
                    object2.execute(zzdli2);
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzF(String string2) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzl(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzG(Bundle bundle) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzm(bundle);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzH() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    object = this.zzo;
                    if (object == null) {
                        object = "Ad should be associated with an ad view before calling recordCustomClickGesture()";
                        com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Executor executor = this.zzd;
                boolean bl2 = object instanceof zzdmn;
                {
                    zzdlk zzdlk2 = new zzdlk(this, bl2);
                    executor.execute(zzdlk2);
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzI() {
        synchronized (this) {
            boolean bl2 = this.zzq;
            if (bl2) {
                return;
            }
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzr();
            return;
        }
    }

    public final void zzJ(View object) {
        Object object2 = zzbep.zzfi;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zze.zzp();
            if (object2 == null) {
                return;
            }
            object3 = new zzdln(this, (View)object);
            object = this.zzd;
            zzgft.zzr((ListenableFuture)object2, (zzgfp)object3, (Executor)object);
            return;
        }
        object2 = this.zze.zzu();
        this.zzac((View)object, (zzehg)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzK(View view, MotionEvent motionEvent, View view2) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzs(view, motionEvent, view2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzL(Bundle bundle) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzt(bundle);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzM(View view) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzu(view);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzN() {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzv();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzO(zzcs zzcs2) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzw(zzcs2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzP(zzdg zzdg2) {
        synchronized (this) {
            zzepf zzepf2 = this.zzx;
            zzepf2.zza(zzdg2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzQ(zzbjp zzbjp2) {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzx(zzbjp2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzR(zzdnp zzdnp2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Object object = zzbep.zzbJ;
                    Object object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (bl2) {
                        object = com.google.android.gms.ads.internal.util.zzt.zza;
                        object2 = new zzdle(this, zzdnp2);
                        object.post((Runnable)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.zzad(zzdnp2);
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
    public final void zzS(zzdnp zzdnp2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Object object = zzbep.zzbJ;
                    Object object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (bl2) {
                        object = com.google.android.gms.ads.internal.util.zzt.zza;
                        object2 = new zzdlf(this, zzdnp2);
                        object.post((Runnable)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.zzae(zzdnp2);
                return;
            }
            throw throwable2;
        }
    }

    public final boolean zzT() {
        return this.zzh.zze();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzU() {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            return zzdmb2.zzA();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzV() {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            return zzdmb2.zzB();
        }
    }

    public final boolean zzW() {
        return this.zzh.zzd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzY(Bundle bundle) {
        synchronized (this) {
            boolean bl2;
            boolean bl3 = this.zzq;
            if (bl3) {
                return true;
            }
            zzdmb zzdmb2 = this.zzf;
            this.zzq = bl2 = zzdmb2.zzC(bundle);
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            return zzdmb2.zza();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            boolean bl2;
            this.zzp = bl2 = true;
            zzdlj zzdlj2 = new zzdlj(this);
            Executor executor = this.zzd;
            executor.execute(zzdlj2);
            super.zzb();
            return;
        }
    }

    public final zzdlq zzc() {
        return this.zzw;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzehg zzf(String string2, boolean bl2) {
        Object object;
        Object object2;
        String string3;
        Object object3;
        int n3;
        zzdlo zzdlo2 = this;
        Object object4 = this.zzh;
        int n4 = ((zzdly)object4).zzd();
        Object object5 = null;
        if (n4 == 0) return null;
        n4 = TextUtils.isEmpty((CharSequence)string2);
        if (n4 != 0) {
            return null;
        }
        object4 = this.zze;
        Object object6 = ((zzdlt)object4).zzr();
        object4 = ((zzdlt)object4).zzs();
        if (object6 == null && object4 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        int n7 = 0;
        Object object7 = null;
        int n8 = 1;
        if (object6 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        int n10 = object4 != null ? 1 : 0;
        Object object8 = zzbep.zzfg;
        Object object9 = zzba.zzc();
        object8 = (Boolean)((zzben)object9).zza((zzbeg)object8);
        int n14 = ((Boolean)object8).booleanValue();
        if (n14 != 0) {
            zzdlo2.zzh.zza();
            object3 = zzdlo2.zzh.zza();
            n3 = ((zzfhr)object3).zzc();
            n10 = n3 + -1;
            if (n10 != 0) {
                if (n10 != n8) {
                    object4 = n3 != n8 ? (n3 != (n4 = 2) ? "UNKNOWN" : "DISPLAY") : "VIDEO";
                    object6 = new StringBuilder("Unknown omid media type: ");
                    ((StringBuilder)object6).append((String)object4);
                    ((StringBuilder)object6).append(". Not initializing Omid.");
                    com.google.android.gms.ads.internal.util.client.zzm.zzj(((StringBuilder)object6).toString());
                    return null;
                }
                if (object6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                n7 = 1;
                n10 = 0;
            } else {
                if (object4 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                n10 = 1;
            }
        } else {
            n7 = n3;
        }
        if (n7 != 0) {
            string3 = null;
        } else {
            string3 = "javascript";
            object6 = object4;
        }
        object6.zzG();
        object7 = zzdlo2.zzv;
        object3 = com.google.android.gms.ads.internal.zzu.zzA();
        n7 = (int)(object3.zzl((Context)object7) ? 1 : 0);
        if (n7 == 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        object7 = zzdlo2.zzu;
        n3 = object7.buddyApkVersion;
        n7 = object7.clientJarVersion;
        object8 = new StringBuilder();
        ((StringBuilder)object8).append(n3);
        object3 = ".";
        ((StringBuilder)object8).append((String)object3);
        ((StringBuilder)object8).append(n7);
        object9 = ((StringBuilder)object8).toString();
        if (n10 != 0) {
            object7 = zzehc.zzc;
            object3 = zzehd.zzb;
            object2 = object7;
            object = object3;
        } else {
            object7 = zzdlo2.zze;
            object3 = zzehc.zzb;
            n7 = object7.zzc();
            object7 = n7 == (n14 = 3) ? zzehd.zzd : zzehd.zzc;
            object = object7;
            object2 = object3;
        }
        object8 = com.google.android.gms.ads.internal.zzu.zzA();
        WebView webView = object6.zzG();
        object7 = zzdlo2.zzb.zzam;
        String string4 = "";
        String string5 = "javascript";
        object7 = object8.zzb((String)object9, webView, string4, string5, string3, string2, (zzehd)((Object)object), (zzehc)((Object)object2), (String)object7);
        if (object7 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        object5 = zzdlo2.zze;
        ((zzdlt)object5).zzW((zzehg)object7);
        object6.zzat((zzehg)object7);
        if (n10 != 0) {
            object5 = object7.zza();
            object4 = object4.zzF();
            object3 = com.google.android.gms.ads.internal.zzu.zzA();
            object3.zzj((zzfoj)object5, (View)object4);
            zzdlo2.zzr = n8;
        }
        if (!bl2) return object7;
        object4 = com.google.android.gms.ads.internal.zzu.zzA();
        object5 = object7.zza();
        object4.zzk((zzfoj)object5);
        object4 = new Jp();
        object5 = "onSdkLoaded";
        object6.zzd((String)object5, (Map)object4);
        return object7;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zzi(View view, Map map2, Map map3) {
        synchronized (this) {
            ImageView.ScaleType scaleType = this.zzZ();
            zzdmb zzdmb2 = this.zzf;
            return zzdmb2.zze(view, map2, map3, scaleType);
        }
    }

    public final void zzj() {
        Object object = new zzdlg(this);
        Object object2 = this.zzd;
        object2.execute((Runnable)object);
        object = this.zze;
        int n3 = ((zzdlt)object).zzc();
        int n4 = 7;
        if (n3 != n4) {
            object = this.zzd;
            object2 = this.zzf;
            Objects.requireNonNull(object2);
            zzdlh zzdlh2 = new zzdlh((zzdmb)object2);
            object.execute(zzdlh2);
        }
        super.zzj();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zzk(View view, Map map2, Map map3) {
        synchronized (this) {
            ImageView.ScaleType scaleType = this.zzZ();
            zzdmb zzdmb2 = this.zzf;
            return zzdmb2.zzf(view, map2, map3, scaleType);
        }
    }

    public final void zzu(View view) {
        Object object = this.zze.zzu();
        Object object2 = this.zzh;
        boolean bl2 = ((zzdly)object2).zzd();
        if (bl2 && object != null && view != null) {
            object2 = com.google.android.gms.ads.internal.zzu.zzA();
            object = ((zzehg)object).zza();
            object2.zzg((zzfoj)object, view);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv() {
        synchronized (this) {
            zzdmb zzdmb2 = this.zzf;
            zzdmb2.zzh();
            return;
        }
    }

    public final /* synthetic */ void zzw() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    public final /* synthetic */ void zzx(View view, boolean bl2, int n3) {
        View view2 = this.zzo.zzf();
        Map map2 = this.zzo.zzl();
        Map map3 = this.zzo.zzm();
        ImageView.ScaleType scaleType = this.zzZ();
        this.zzf.zzo(view, view2, map2, map3, bl2, scaleType, n3);
    }

    public final /* synthetic */ void zzy(boolean bl2) {
        View view = this.zzo.zzf();
        Map map2 = this.zzo.zzl();
        Map map3 = this.zzo.zzm();
        ImageView.ScaleType scaleType = this.zzZ();
        this.zzf.zzo(null, view, map2, map3, bl2, scaleType, 0);
    }

    public final /* synthetic */ void zzz(zzdnp zzdnp2) {
        this.zzad(zzdnp2);
    }
}

