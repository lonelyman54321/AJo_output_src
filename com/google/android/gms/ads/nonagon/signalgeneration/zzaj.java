/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  android.view.View
 *  android.webkit.WebView
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzad;
import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzag;
import com.google.android.gms.ads.nonagon.signalgeneration.zzah;
import com.google.android.gms.ads.nonagon.signalgeneration.zzai;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzao;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.ads.nonagon.signalgeneration.zzr;
import com.google.android.gms.ads.nonagon.signalgeneration.zzs;
import com.google.android.gms.ads.nonagon.signalgeneration.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzw;
import com.google.android.gms.ads.nonagon.signalgeneration.zzx;
import com.google.android.gms.ads.nonagon.signalgeneration.zzy;
import com.google.android.gms.ads.nonagon.signalgeneration.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfgz;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class zzaj
extends zzcbf {
    protected static final List zza;
    protected static final List zzb;
    protected static final List zzc;
    protected static final List zzd;
    public static final /* synthetic */ int zze;
    private final String zzA;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final AtomicBoolean zzF;
    private final AtomicBoolean zzG;
    private final AtomicInteger zzH;
    private final zzbfq zzI;
    private final zze zzJ;
    private final zzcjd zzf;
    private Context zzg;
    private final zzaxd zzh;
    private final zzfhs zzi;
    private final zzfin zzj;
    private final zzgge zzk;
    private final ScheduledExecutorService zzl;
    private zzbwe zzm;
    private Point zzn;
    private Point zzo;
    private final zzdvh zzp;
    private final zzfoe zzq;
    private final boolean zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final String zzv;
    private final String zzw;
    private final AtomicInteger zzx;
    private final VersionInfoParcel zzy;
    private String zzz;

    static {
        ArrayList<String> arrayList;
        List<String> list = Arrays.asList("/aclk", "/pcs/click", "/dbm/clk");
        zza = arrayList = new ArrayList<String>(list);
        list = ".doubleclick.net";
        String string2 = ".googleadservices.com";
        List<String> list2 = Arrays.asList(list, string2);
        zzb = arrayList = new ArrayList<String>(list2);
        list2 = Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad");
        zzc = arrayList = new ArrayList<String>(list2);
        list = Arrays.asList(list, string2, ".googlesyndication.com");
        zzd = arrayList = new ArrayList<String>(list);
    }

    /*
     * Enabled aggressive block sorting
     */
    public zzaj(zzcjd object, Context object2, zzaxd zzaxd2, zzfin zzfin2, zzgge zzgge2, ScheduledExecutorService scheduledExecutorService, zzdvh zzdvh2, zzfoe zzfoe2, VersionInfoParcel versionInfoParcel, zzbfq zzbfq2, zzfhs zzfhs2, zze zze2) {
        boolean bl2;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicInteger atomicInteger2;
        Point point;
        Point point2;
        this.zzn = point2 = new Point();
        this.zzo = point = new Point();
        this.zzx = atomicInteger2 = new AtomicInteger(0);
        this.zzF = atomicBoolean2 = new AtomicBoolean(false);
        this.zzG = atomicBoolean = new AtomicBoolean(false);
        this.zzH = atomicInteger = new AtomicInteger(0);
        this.zzf = object;
        this.zzg = object2;
        this.zzh = zzaxd2;
        this.zzi = zzfhs2;
        this.zzj = zzfin2;
        this.zzk = zzgge2;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdvh2;
        this.zzq = zzfoe2;
        this.zzy = versionInfoParcel;
        this.zzI = zzbfq2;
        object = zzbep.zzhu;
        this.zzr = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzht;
        this.zzs = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzhw;
        this.zzt = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzhy;
        this.zzu = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzhx;
        this.zzv = object = (String)zzba.zzc().zza((zzbeg)object);
        object = zzbep.zzhz;
        this.zzw = object = (String)zzba.zzc().zza((zzbeg)object);
        object = zzbep.zzhA;
        this.zzA = object = (String)zzba.zzc().zza((zzbeg)object);
        this.zzJ = zze2;
        object = zzbep.zzhB;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzhC;
            this.zzB = object = zzaj.zzaa((String)zzba.zzc().zza((zzbeg)object));
            object = zzbep.zzhD;
            this.zzC = object = zzaj.zzaa((String)zzba.zzc().zza((zzbeg)object));
            object = zzbep.zzhE;
            this.zzD = object = zzaj.zzaa((String)zzba.zzc().zza((zzbeg)object));
            object = zzbep.zzhF;
            object2 = zzba.zzc();
            object = zzaj.zzaa((String)((zzben)object2).zza((zzbeg)object));
        } else {
            this.zzB = object = zza;
            this.zzC = object = zzb;
            this.zzD = object = zzc;
            object = zzd;
        }
        this.zzE = object;
    }

    public static /* bridge */ /* synthetic */ String zzA(zzaj zzaj2) {
        return zzaj2.zzv;
    }

    public static /* bridge */ /* synthetic */ AtomicBoolean zzD(zzaj zzaj2) {
        return zzaj2.zzG;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzE(zzaj zzaj2) {
        return zzaj2.zzH;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzF(zzaj zzaj2) {
        return zzaj2.zzx;
    }

    public static /* bridge */ /* synthetic */ void zzG(zzaj zzaj2, String string2) {
        zzaj2.zzz = string2;
    }

    public static /* bridge */ /* synthetic */ void zzH(zzaj object, List object2) {
        boolean bl2;
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            Uri uri = (Uri)object2.next();
            bl2 = ((zzaj)object).zzO(uri);
            if (!bl2) continue;
            object = ((zzaj)object).zzx;
            ((AtomicInteger)object).getAndIncrement();
            break;
        }
    }

    public static /* bridge */ /* synthetic */ void zzI(zzaj zzaj2) {
        zzaj2.zzT();
    }

    public static /* bridge */ /* synthetic */ boolean zzK(zzaj zzaj2) {
        return zzaj2.zzu;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzaj zzaj2) {
        return zzaj2.zzt;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzaj zzaj2) {
        return zzaj2.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzaj zzaj2) {
        return zzaj2.zzr;
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            String string3 = "nas";
            uri = zzaj.zzZ(uri, string3, string2);
        }
        return uri;
    }

    private final zzr zzR(Context object, String object2, String string2, zzq object3, zzl object4, Bundle bundle) {
        int n3;
        zzcyt zzcyt2;
        Object object5;
        zzfhm zzfhm2;
        block14: {
            int n4;
            int n7;
            int n8;
            int n10;
            block15: {
                zzfhm2 = new zzfhm();
                String string3 = "REWARDED";
                boolean bl2 = string3.equals(string2);
                String string4 = "REWARDED_INTERSTITIAL";
                n10 = 3;
                n8 = 2;
                if (bl2) {
                    object5 = zzfhm2.zzp();
                    ((zzfgz)object5).zza(n8);
                } else {
                    bl2 = string4.equals(string2);
                    if (bl2) {
                        object5 = zzfhm2.zzp();
                        ((zzfgz)object5).zza(n10);
                    }
                }
                object5 = this.zzf.zzp();
                zzcyt2 = new zzcyt();
                zzcyt2.zze((Context)object);
                if (object2 == null) {
                    object2 = "adUnitId";
                }
                zzfhm2.zzt((String)object2);
                if (object4 == null) {
                    object2 = new zzm();
                    object4 = ((zzm)object2).zza();
                }
                zzfhm2.zzH((zzl)object4);
                n3 = 1;
                if (object3 != null) break block14;
                n7 = string2.hashCode();
                n4 = 4;
                switch (n7) {
                    default: {
                        break;
                    }
                    case 1951953708: {
                        object3 = "BANNER";
                        n7 = (int)(string2.equals(object3) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 0;
                        object3 = null;
                        break block15;
                    }
                    case 1854800829: {
                        n7 = (int)(string2.equals(string4) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 2;
                        break block15;
                    }
                    case 543046670: {
                        n7 = (int)(string2.equals(string3) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 1;
                        break block15;
                    }
                    case -428325382: {
                        object3 = "APP_OPEN_AD";
                        n7 = (int)(string2.equals(object3) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 4;
                        break block15;
                    }
                    case -1999289321: {
                        object3 = "NATIVE";
                        n7 = (int)(string2.equals(object3) ? 1 : 0);
                        if (n7 == 0) break;
                        n7 = 3;
                        break block15;
                    }
                }
                n7 = -1;
            }
            if (n7 != 0) {
                object3 = n7 != n3 && n7 != n8 ? (n7 != n10 ? (n7 != n4 ? new zzq() : com.google.android.gms.ads.internal.client.zzq.zzb()) : com.google.android.gms.ads.internal.client.zzq.zzc()) : com.google.android.gms.ads.internal.client.zzq.zzd();
            } else {
                object4 = AdSize.BANNER;
                object3 = new zzq((Context)object, (AdSize)object4);
            }
        }
        zzfhm2.zzs((zzq)object3);
        zzfhm2.zzz(n3 != 0);
        zzfhm2.zzA(bundle);
        object = zzfhm2.zzJ();
        zzcyt2.zzi((zzfho)object);
        object = zzcyt2.zzj();
        object5.zza((zzcyv)object);
        object = new zzam();
        ((zzam)object).zza(string2);
        object2 = new zzao((zzam)object, null);
        object5.zzb((zzao)object2);
        new zzdfa();
        return object5.zzc();
    }

    private final ListenableFuture zzS(String object) {
        Object object2 = new zzdqs[1];
        Object object3 = this.zzj.zza();
        Object object4 = new zzu(this, (zzdqs[])object2, (String)object);
        object = this.zzk;
        object = zzgft.zzn((ListenableFuture)object3, object4, (Executor)object);
        object3 = new zzv(this, (zzdqs[])object2);
        object2 = this.zzk;
        object.addListener((Runnable)object3, (Executor)object2);
        object = zzgfk.zzu((ListenableFuture)object);
        object2 = zzbep.zzhL;
        long l2 = ((Integer)zzba.zzc().zza((zzbeg)object2)).intValue();
        object4 = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.zzl;
        object = (zzgfk)zzgft.zzo((ListenableFuture)object, l2, (TimeUnit)((Object)object4), scheduledExecutorService);
        object2 = new zzab();
        object3 = this.zzk;
        object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, (Executor)object3);
        object2 = new zzac();
        object3 = this.zzk;
        return zzgft.zze((ListenableFuture)object, Exception.class, (zzfxu)object2, (Executor)object3);
    }

    private final void zzT() {
        Object object;
        Object object2 = (Boolean)zzbgp.zza.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            this.zzJ.zzb();
            return;
        }
        object2 = zzbep.zzlb;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2) {
            object2 = new zzs(this);
            object3 = zzcci.zza;
            object2 = zzgft.zzk((zzgez)object2, (Executor)object3);
        } else {
            object = this.zzg;
            String string2 = AdFormat.BANNER.name();
            Bundle bundle = new Bundle();
            object3 = this;
            object2 = this.zzR((Context)object, null, string2, null, null, bundle).zzb();
        }
        object3 = new zzai(this);
        object = this.zzf.zzB();
        zzgft.zzr((ListenableFuture)object2, (zzgfp)object3, (Executor)object);
    }

    private final void zzU() {
        Object object = zzbep.zzjB;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzbep.zzjE;
            zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            bl2 = (Boolean)object;
            if (!bl2) {
                boolean bl3;
                object = zzbep.zzjI;
                zzben2 = zzba.zzc();
                object = (Boolean)zzben2.zza((zzbeg)object);
                bl2 = (Boolean)object;
                if (!bl2 || !(bl2 = ((AtomicBoolean)(object = this.zzF)).getAndSet(bl3 = true))) {
                    this.zzT();
                }
            }
        }
    }

    private final void zzV(List object, IObjectWrapper object2, zzbvv object3, boolean bl2) {
        Object object4;
        boolean bl3;
        Object object5 = zzbep.zzhK;
        Object object6 = zzba.zzc();
        object5 = (Boolean)((zzben)object6).zza((zzbeg)object5);
        int n3 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
        if (n3 == 0) {
            object = "The updating URL feature is not enabled.";
            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
            try {
                object3.zze((String)object);
                return;
            }
            catch (RemoteException remoteException) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", remoteException);
                return;
            }
        }
        object5 = object.iterator();
        int n4 = 0;
        object6 = null;
        while (bl3 = object5.hasNext()) {
            object4 = (Uri)object5.next();
            bl3 = this.zzO((Uri)object4);
            if (!bl3) continue;
            ++n4;
        }
        n3 = 1;
        if (n4 > n3) {
            object5 = String.valueOf(object);
            object6 = "Multiple google urls found: ";
            object5 = ((String)object6).concat((String)object5);
            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object5);
        }
        object5 = new ArrayList();
        object = object.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object7;
            object6 = (Uri)object.next();
            bl3 = this.zzO((Uri)object6);
            if (!bl3) {
                object4 = String.valueOf(object6);
                object7 = "Not a Google URL: ";
                object4 = ((String)object7).concat((String)object4);
                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object4);
                object6 = zzgft.zzh(object6);
            } else {
                object4 = this.zzk;
                object7 = new zzw(this, (Uri)object6, (IObjectWrapper)object2);
                object6 = object4.zzb((Callable)object7);
                bl3 = this.zzY();
                if (bl3) {
                    object4 = new zzx(this);
                    object7 = this.zzk;
                    object6 = zzgft.zzn((ListenableFuture)object6, (zzgfa)object4, (Executor)object7);
                } else {
                    object4 = "Asset view map is empty.";
                    com.google.android.gms.ads.internal.util.client.zzm.zzi((String)object4);
                }
            }
            ((ArrayList)object5).add(object6);
        }
        object = zzgft.zzd((Iterable)object5);
        object2 = new zzah(this, (zzbvv)object3, bl2);
        object3 = this.zzf.zzB();
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
    }

    private final void zzW(List object, IObjectWrapper object2, zzbvv object3, boolean bl2) {
        Object object4 = zzbep.zzhK;
        Object object5 = zzba.zzc();
        object4 = (Boolean)((zzben)object5).zza((zzbeg)object4);
        boolean bl3 = (Boolean)object4;
        if (!bl3) {
            object = "The updating URL feature is not enabled.";
            try {
                object3.zze((String)object);
                return;
            }
            catch (RemoteException remoteException) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", remoteException);
                return;
            }
        }
        object4 = this.zzk;
        object5 = new zzad(this, (List)object, (IObjectWrapper)object2);
        object = object4.zzb((Callable)object5);
        boolean bl4 = this.zzY();
        if (bl4) {
            object2 = new zzae(this);
            object4 = this.zzk;
            object = zzgft.zzn((ListenableFuture)object, (zzgfa)object2, (Executor)object4);
        } else {
            object2 = "Asset view map is empty.";
            com.google.android.gms.ads.internal.util.client.zzm.zzi((String)object2);
        }
        object2 = new zzag(this, (zzbvv)object3, bl2);
        object3 = this.zzf.zzB();
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
    }

    private static boolean zzX(Uri object, List object2, List list) {
        String string2 = object.getHost();
        object = object.getPath();
        if (string2 != null && object != null) {
            boolean bl2;
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                boolean bl3;
                Object object3 = (String)object2.next();
                bl2 = ((String)object).contains((CharSequence)object3);
                if (!bl2) continue;
                object3 = list.iterator();
                while (bl3 = object3.hasNext()) {
                    String string3 = (String)object3.next();
                    bl3 = string2.endsWith(string3);
                    if (!bl3) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        boolean bl2;
        Object object = this.zzm;
        return object != null && (object = ((zzbwe)object).zzb) != null && !(bl2 = object.isEmpty());
    }

    private static final Uri zzZ(Uri object, String string2, String string3) {
        int n3;
        String string4;
        String string5 = object.toString();
        int n4 = string5.indexOf(string4 = "&adurl=");
        if (n4 == (n3 = -1)) {
            string4 = "?adurl=";
            n4 = string5.indexOf(string4);
        }
        if (n4 != n3) {
            String string6 = string5.substring(0, ++n4);
            object = new StringBuilder(string6);
            X50.a((StringBuilder)object, string2, "=", string3, "&");
            string2 = string5.substring(n4);
            ((StringBuilder)object).append(string2);
            return Uri.parse((String)((StringBuilder)object).toString());
        }
        return object.buildUpon().appendQueryParameter(string2, string3).build();
    }

    private static final List zzaa(String stringArray) {
        stringArray = TextUtils.split((String)stringArray, (String)",");
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : stringArray) {
            boolean bl2 = zzfyv.zzd(string2);
            if (bl2) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ Context zzc(zzaj zzaj2) {
        return zzaj2.zzg;
    }

    public static /* bridge */ /* synthetic */ Uri zzd(zzaj zzaj2, Uri uri, String string2, String string3) {
        return zzaj.zzZ(uri, string2, "1");
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzo(zzaj zzaj2) {
        return zzaj2.zzy;
    }

    public static /* bridge */ /* synthetic */ zzdvh zzp(zzaj zzaj2) {
        return zzaj2.zzp;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ zzfmn zzr(ListenableFuture object, zzcbk object2) {
        ExecutionException executionException2;
        Object object3;
        Object object4;
        block3: {
            boolean bl2 = zzfmq.zza();
            object4 = null;
            if (!bl2) return object4;
            object3 = (Boolean)zzbgd.zze.zze();
            bl2 = (Boolean)object3;
            if (!bl2) {
                return object4;
            }
            try {
                object = zzgft.zzp((Future)object);
                object = (zzr)object;
                object = ((zzr)object).zza();
                Object object5 = ((zzcbk)object2).zzb;
                object5 = Collections.singletonList(object5);
                object3 = new ArrayList(object5);
                ((zzfmn)object).zze((ArrayList)object3);
                object3 = ((zzcbk)object2).zzd;
                object3 = object3 == null ? "" : ((zzl)object3).zzp;
            }
            catch (ExecutionException executionException2) {
                break block3;
            }
            ((zzfmn)object).zzb((String)object3);
            object2 = ((zzcbk)object2).zzd;
            object2 = ((zzl)object2).zzm;
            ((zzfmn)object).zzg((Bundle)object2);
            return object;
        }
        object2 = "SignalGeneratorImpl.getConfiguredCriticalUserJourney";
        object3 = com.google.android.gms.ads.internal.zzu.zzo();
        ((zzcby)object3).zzw(executionException2, (String)object2);
        return object4;
    }

    public static /* bridge */ /* synthetic */ zzfoe zzs(zzaj zzaj2) {
        return zzaj2.zzq;
    }

    public static /* synthetic */ ListenableFuture zzt(zzaj object, Uri uri) {
        ListenableFuture listenableFuture = ((zzaj)object).zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals");
        zzy zzy2 = new zzy((zzaj)object, uri);
        object = ((zzaj)object).zzk;
        return zzgft.zzm(listenableFuture, zzy2, (Executor)object);
    }

    public static /* bridge */ /* synthetic */ String zzx(zzaj zzaj2) {
        return zzaj2.zzA;
    }

    public static /* bridge */ /* synthetic */ String zzy(zzaj zzaj2) {
        return zzaj2.zzw;
    }

    public static /* bridge */ /* synthetic */ String zzz(zzaj zzaj2) {
        return zzaj2.zzz;
    }

    public final /* synthetic */ ArrayList zzB(List object, String string2) {
        boolean bl2;
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Uri uri = (Uri)object.next();
            boolean bl3 = this.zzP(uri);
            if (bl3 && !(bl3 = TextUtils.isEmpty((CharSequence)string2))) {
                String string3 = "nas";
                uri = zzaj.zzZ(uri, string3, string2);
                arrayList.add(uri);
                continue;
            }
            arrayList.add(uri);
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List object, IObjectWrapper object2) {
        String string2;
        boolean bl2;
        Context context;
        Object object3 = this.zzh.zzc();
        if (object3 != null) {
            object3 = this.zzh.zzc();
            context = this.zzg;
            object2 = (View)ObjectWrapper.unwrap((IObjectWrapper)object2);
            bl2 = false;
            string2 = null;
            object2 = object3.zzh(context, (View)object2, null);
        } else {
            object2 = "";
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl3) {
            boolean bl4;
            object3 = new Object();
            object = object.iterator();
            while (bl4 = object.hasNext()) {
                context = (Uri)object.next();
                bl2 = this.zzP((Uri)context);
                if (!bl2) {
                    string2 = String.valueOf(context);
                    String string3 = "Not a Google URL: ";
                    string2 = string3.concat(string2);
                    com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
                    ((ArrayList)object3).add(context);
                    continue;
                }
                string2 = "ms";
                context = zzaj.zzZ((Uri)context, string2, (String)object2);
                ((ArrayList)object3).add(context);
            }
            boolean bl5 = ((ArrayList)object3).isEmpty();
            if (!bl5) {
                return object3;
            }
            object = new Exception("Empty impression URLs result.");
            throw object;
        }
        object = new Exception("Failed to get view signals.");
        throw object;
    }

    public final /* synthetic */ void zzJ(zzdqs[] object) {
        zzfin zzfin2 = null;
        if ((object = object[0]) != null) {
            zzfin2 = this.zzj;
            object = zzgft.zzh(object);
            zzfin2.zzb((ListenableFuture)object);
        }
    }

    public final boolean zzO(Uri uri) {
        List list = this.zzB;
        List list2 = this.zzC;
        return zzaj.zzX(uri, list, list2);
    }

    public final boolean zzP(Uri uri) {
        List list = this.zzD;
        List list2 = this.zzE;
        return zzaj.zzX(uri, list, list2);
    }

    public final IObjectWrapper zze(IObjectWrapper object, IObjectWrapper object2, String string2, IObjectWrapper object3) {
        Object object4 = zzbep.zzjL;
        zzben zzben2 = zzba.zzc();
        object4 = (Boolean)zzben2.zza((zzbeg)object4);
        boolean bl2 = (Boolean)object4;
        if (!bl2) {
            return ObjectWrapper.wrap(null);
        }
        object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object);
        object2 = (Wf0)ObjectWrapper.unwrap((IObjectWrapper)object2);
        object3 = (Uf0)ObjectWrapper.unwrap((IObjectWrapper)object3);
        object4 = this.zzI;
        ((zzbfq)object4).zzg((Context)object, (Wf0)object2, string2, (Uf0)object3);
        object = (Boolean)zzbgp.zza.zze();
        boolean bl3 = (Boolean)object;
        if (bl3) {
            object = this.zzJ;
            ((zze)object).zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzf(IObjectWrapper var1_1, zzcbk var2_2, zzcbd var3_3) {
        var4_4 /* !! */  = new Bundle();
        var5_5 = zzbep.zzcd;
        var6_6 = zzba.zzc();
        var5_5 = (Boolean)var6_6.zza((zzbeg)var5_5);
        var7_7 = var5_5.booleanValue();
        if (var7_7) {
            var5_5 = zzdul.zza.zza();
            var8_8 = var2_2.zzd.zzz;
            var4_4 /* !! */ .putLong((String)var5_5, var8_8);
            var5_5 = zzdul.zzb.zza();
            var6_6 = com.google.android.gms.ads.internal.zzu.zzB();
            var8_8 = var6_6.currentTimeMillis();
            var4_4 /* !! */ .putLong((String)var5_5, var8_8);
        }
        var5_5 = (Context)ObjectWrapper.unwrap(var1_1);
        this.zzg = var5_5;
        var6_6 = zzfmu.zzN;
        var10_9 = zzfmb.zza((Context)var5_5, (zzfmu)var6_6);
        var10_9.zzj();
        var5_5 = var2_2.zzb;
        var6_6 = "UNKNOWN";
        var7_7 = var6_6.equals(var5_5);
        if (!var7_7) ** GOTO lbl-1000
        var5_5 = new ArrayList();
        var6_6 = zzbep.zzhJ;
        var11_10 = (String)zzba.zzc().zza((zzbeg)var6_6);
        var12_11 = var11_10.isEmpty();
        if (!var12_11) {
            var5_5 = (String)zzba.zzc().zza((zzbeg)var6_6);
            var6_6 = ",";
            var5_5 = Arrays.asList(var5_5.split((String)var6_6));
        }
        if (var7_7 = var5_5.contains(var6_6 = com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(var2_2.zzd))) {
            var6_6 = "Unknown format is no longer supported.";
            var5_5 = new IllegalArgumentException((String)var6_6);
            var5_5 = zzgft.zzg((Throwable)var5_5);
            var11_10 = new IllegalArgumentException((String)var6_6);
            var6_6 = zzgft.zzg((Throwable)var11_10);
            var11_10 = var5_5;
            var4_4 /* !! */  = var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = zzbep.zzlb;
            var6_6 = zzba.zzc();
            var5_5 = (Boolean)var6_6.zza((zzbeg)var5_5);
            var7_7 = var5_5.booleanValue();
            if (var7_7) {
                var5_5 = zzcci.zza;
                var6_6 = new zzz(this, var2_2, var4_4 /* !! */ );
                var6_6 = var5_5.zzb((Callable)var6_6);
                var11_10 = new zzaa();
                var5_5 = zzgft.zzn((ListenableFuture)var6_6, (zzgfa)var11_10, (Executor)var5_5);
lbl51:
                // 2 sources

                while (true) {
                    var4_4 /* !! */  = var5_5;
                    var11_10 = var6_6;
                    break;
                }
            } else {
                var6_6 = this.zzg;
                var11_10 = var2_2.zza;
                var13_12 = var2_2.zzb;
                var14_13 = var2_2.zzc;
                var15_14 = var2_2.zzd;
                var5_5 = this;
                var5_5 = this.zzR((Context)var6_6, (String)var11_10, (String)var13_12, (zzq)var14_13, (zzl)var15_14, var4_4 /* !! */ );
                var6_6 = zzgft.zzh(var5_5);
                var5_5 = var5_5.zzb();
                ** continue;
            }
        }
        var5_5 = var16_15;
        var6_6 = this;
        var13_12 = var2_2;
        var14_13 = var3_3;
        var15_14 = var10_9;
        var16_15 = new zzaf(this, (ListenableFuture)var11_10, var2_2, var3_3, var10_9);
        var5_5 = this.zzf.zzB();
        zzgft.zzr((ListenableFuture)var4_4 /* !! */ , var16_15, (Executor)var5_5);
    }

    public final void zzg(zzbwe zzbwe2) {
        this.zzm = zzbwe2;
        this.zzj.zzc(1);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        this.zzV(list, iObjectWrapper, zzbvv2, true);
    }

    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        this.zzW(list, iObjectWrapper, zzbvv2, true);
    }

    public final void zzj(IObjectWrapper object) {
        Object object2 = zzbep.zzjA;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            TaggingLibraryJsInterface taggingLibraryJsInterface;
            object2 = zzbep.zzhI;
            object3 = (Boolean)zzba.zzc().zza((zzbeg)object2);
            boolean bl3 = (Boolean)object3;
            if (!bl3) {
                this.zzU();
            }
            if ((object = (WebView)ObjectWrapper.unwrap((IObjectWrapper)object)) == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            zzaxd zzaxd2 = this.zzh;
            zzdvh zzdvh2 = this.zzp;
            zzfoe zzfoe2 = this.zzq;
            zzfhs zzfhs2 = this.zzi;
            zze zze2 = this.zzJ;
            object3 = taggingLibraryJsInterface;
            taggingLibraryJsInterface = new TaggingLibraryJsInterface((WebView)object, zzaxd2, zzdvh2, zzfoe2, zzfhs2, zze2);
            object.addJavascriptInterface((Object)taggingLibraryJsInterface, "gmaSdk");
            object = zzbep.zzjK;
            object3 = zzba.zzc();
            object = (Boolean)((zzben)object3).zza((zzbeg)object);
            boolean bl4 = (Boolean)object;
            if (bl4) {
                object = com.google.android.gms.ads.internal.zzu.zzo();
                ((zzcby)object).zzs();
            }
            if (bl4 = ((Boolean)(object = (Boolean)zzba.zzc().zza((zzbeg)object2))).booleanValue()) {
                this.zzU();
            }
        }
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        float f5;
        Object object = zzbep.zzhK;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (!n3) {
            return;
        }
        iObjectWrapper = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper);
        object = this.zzm;
        if (object == null) {
            boolean bl2 = false;
            f5 = 0.0f;
            object = null;
        } else {
            object = ((zzbwe)object).zza;
        }
        object = zzbz.zza((MotionEvent)iObjectWrapper, (View)object);
        this.zzn = object;
        int n4 = iObjectWrapper.getAction();
        if (n4 == 0) {
            object = this.zzn;
            this.zzo = object;
        }
        iObjectWrapper = MotionEvent.obtain((MotionEvent)iObjectWrapper);
        object = this.zzn;
        float f6 = ((Point)object).x;
        f5 = ((Point)object).y;
        iObjectWrapper.setLocation(f6, f5);
        this.zzh.zzd((MotionEvent)iObjectWrapper);
        iObjectWrapper.recycle();
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        this.zzV(list, iObjectWrapper, zzbvv2, false);
    }

    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvv2) {
        this.zzW(list, iObjectWrapper, zzbvv2, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ Uri zzn(Uri object, IObjectWrapper object2) {
        block4: {
            zzaxe zzaxe22;
            block5: {
                Object object3;
                block3: {
                    try {
                        object3 = zzbep.zzlW;
                        zzben zzben2 = zzba.zzc();
                        object3 = zzben2.zza((zzbeg)object3);
                        object3 = (Boolean)object3;
                        boolean bl2 = (Boolean)object3;
                        zzben2 = null;
                        if (!bl2 || (object3 = this.zzi) == null) break block3;
                        Context context = this.zzg;
                        object2 = ObjectWrapper.unwrap((IObjectWrapper)object2);
                        object2 = (View)object2;
                        object = ((zzfhs)object3).zza((Uri)object, context, (View)object2, null);
                        break block4;
                    }
                    catch (zzaxe zzaxe22) {
                        break block5;
                    }
                }
                object3 = this.zzh;
                Context context = this.zzg;
                object2 = ObjectWrapper.unwrap((IObjectWrapper)object2);
                object2 = (View)object2;
                object = ((zzaxd)object3).zza((Uri)object, context, (View)object2, null);
                break block4;
            }
            String string2 = "";
            com.google.android.gms.ads.internal.util.client.zzm.zzk(string2, zzaxe22);
        }
        object2 = object.getQueryParameter("ms");
        if (object2 != null) {
            return object;
        }
        object = new Exception("Failed to append spam signals to click url.");
        throw object;
    }

    public final /* synthetic */ zzr zzq(zzcbk zzcbk2, Bundle bundle) {
        Context context = this.zzg;
        String string2 = zzcbk2.zza;
        String string3 = zzcbk2.zzb;
        zzq zzq2 = zzcbk2.zzc;
        zzl zzl2 = zzcbk2.zzd;
        return this.zzR(context, string2, string3, zzq2, zzl2, bundle);
    }

    public final /* synthetic */ ListenableFuture zzu() {
        Context context = this.zzg;
        String string2 = AdFormat.BANNER.name();
        Bundle bundle = new Bundle();
        return this.zzR(context, null, string2, null, null, bundle).zzb();
    }

    public final /* synthetic */ ListenableFuture zzv(zzdqs[] object, String string2, zzdqs zzdqs2) {
        object[0] = zzdqs2;
        object = this.zzg;
        Object object2 = this.zzm;
        Map map2 = ((zzbwe)object2).zzb;
        object2 = ((zzbwe)object2).zza;
        object = zzbz.zzd((Context)object, map2, map2, (View)object2, null);
        object2 = this.zzg;
        map2 = this.zzm.zza;
        object2 = zzbz.zzg((Context)object2, (View)map2);
        map2 = zzbz.zzf(this.zzm.zza);
        Context context = this.zzg;
        View view = this.zzm.zza;
        context = zzbz.zze(context, view);
        view = new JSONObject();
        String string3 = "asset_view_signal";
        view.put(string3, object);
        view.put("ad_view_signal", object2);
        view.put("scroll_view_signal", (Object)map2);
        view.put("lock_screen_signal", (Object)context);
        object = "google.afma.nativeAds.getPublisherCustomRenderedClickSignals";
        boolean bl2 = ((String)object).equals(string2);
        if (bl2) {
            object = this.zzg;
            object2 = this.zzo;
            map2 = this.zzn;
            object = zzbz.zzc(null, (Context)object, (Point)object2, (Point)map2);
            object2 = "click_signal";
            view.put((String)object2, object);
        }
        return zzdqs2.zzg(string2, (JSONObject)view);
    }

    public final /* synthetic */ ListenableFuture zzw(ArrayList object) {
        ListenableFuture listenableFuture = this.zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals");
        zzt zzt2 = new zzt(this, (List)object);
        object = this.zzk;
        return zzgft.zzm(listenableFuture, zzt2, (Executor)object);
    }
}

