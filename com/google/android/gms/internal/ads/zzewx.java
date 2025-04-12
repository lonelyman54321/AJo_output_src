/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  org.json.JSONArray
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzenu;
import com.google.android.gms.internal.ads.zzeny;
import com.google.android.gms.internal.ads.zzeob;
import com.google.android.gms.internal.ads.zzeoc;
import com.google.android.gms.internal.ads.zzewr;
import com.google.android.gms.internal.ads.zzews;
import com.google.android.gms.internal.ads.zzewt;
import com.google.android.gms.internal.ads.zzewu;
import com.google.android.gms.internal.ads.zzewv;
import com.google.android.gms.internal.ads.zzeww;
import com.google.android.gms.internal.ads.zzewy;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public final class zzewx
implements zzexw {
    final String zza;
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final zzeny zzd;
    private final Context zze;
    private final zzfho zzf;
    private final zzenu zzg;
    private final zzdst zzh;
    private final zzdxh zzi;

    public zzewx(zzgge zzgge2, ScheduledExecutorService scheduledExecutorService, String string2, zzeny zzeny2, Context context, zzfho zzfho2, zzenu zzenu2, zzdst zzdst2, zzdxh zzdxh2) {
        this.zzb = zzgge2;
        this.zzc = scheduledExecutorService;
        this.zza = string2;
        this.zzd = zzeny2;
        this.zze = context;
        this.zzf = zzfho2;
        this.zzg = zzenu2;
        this.zzh = zzdst2;
        this.zzi = zzdxh2;
    }

    public static /* synthetic */ ListenableFuture zzc(zzewx object) {
        Object object2 = zzbep.zzkR;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = ((zzewx)object).zzf.zzf;
            object3 = Locale.ROOT;
            object2 = ((String)object2).toLowerCase((Locale)object3);
        } else {
            object2 = ((zzewx)object).zzf.zzf;
        }
        object3 = zzbep.zzbE;
        ArrayList<Object> arrayList = zzba.zzc();
        object3 = (Boolean)((zzben)((Object)arrayList)).zza((zzbeg)object3);
        boolean bl3 = (Boolean)object3;
        object3 = bl3 ? ((zzewx)object).zzi.zzg() : new Bundle();
        arrayList = new ArrayList<Object>();
        Object object4 = zzbep.zzbN;
        Object object5 = zzba.zzc();
        object4 = (Boolean)((zzben)object5).zza((zzbeg)object4);
        boolean bl4 = (Boolean)object4;
        if (!bl4) {
            object4 = ((zzewx)object).zzd;
            object5 = ((zzewx)object).zza;
            object2 = ((zzgbf)((zzeny)object4).zzb((String)object5, (String)object2)).zzh().iterator();
            while (bl4 = object2.hasNext()) {
                object4 = (Map.Entry)object2.next();
                Object object6 = object5 = object4.getKey();
                object6 = (String)object5;
                Object object7 = object4 = object4.getValue();
                object7 = (List)object4;
                Bundle bundle = super.zzf((String)object6);
                boolean bl5 = true;
                boolean bl6 = true;
                object4 = super.zzg((String)object6, (List)object7, bundle, bl5, bl6);
                arrayList.add(object4);
            }
            object2 = ((zzewx)object).zzd.zzc();
            ((zzewx)object).zzi(arrayList, (Map)object2);
        } else {
            object4 = ((zzewx)object).zzd;
            object5 = ((zzewx)object).zza;
            object2 = ((zzeny)object4).zza((String)object5, (String)object2);
            ((zzewx)object).zzi(arrayList, (Map)object2);
        }
        object2 = zzgft.zzb(arrayList);
        object4 = new zzews(arrayList, (Bundle)object3);
        object = ((zzewx)object).zzb;
        return ((zzgfs)object2).zza((Callable)object4, (Executor)object);
    }

    private final Bundle zzf(String string2) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(string2);
        }
        return null;
    }

    private final zzgfk zzg(String object, List object2, Bundle object3, boolean bl2, boolean bl3) {
        zzewu zzewu2;
        Object object4 = zzewu2;
        zzewu2 = new zzewu(this, (String)object, (List)object2, (Bundle)object3, bl2, bl3);
        object2 = this.zzb;
        object2 = zzgfk.zzu(zzgft.zzk(zzewu2, (Executor)object2));
        object3 = zzbep.zzbA;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        boolean bl4 = (Boolean)object3;
        if (!bl4) {
            object3 = zzbep.zzbt;
            zzben2 = zzba.zzc();
            object3 = (Long)zzben2.zza((zzbeg)object3);
            long l2 = (Long)object3;
            ScheduledExecutorService scheduledExecutorService = this.zzc;
            object4 = TimeUnit.MILLISECONDS;
            object2 = (zzgfk)zzgft.zzo((ListenableFuture)object2, l2, (TimeUnit)((Object)object4), scheduledExecutorService);
        }
        object3 = new zzewv((String)object);
        object = this.zzb;
        return (zzgfk)zzgft.zze((ListenableFuture)object2, Throwable.class, (zzfxu)object3, (Executor)object);
    }

    private final void zzh(zzbte zzbte2, Bundle bundle, List list, zzeob zzeob2) {
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(this.zze);
        List list2 = list = list.get(0);
        list2 = (Bundle)list;
        String string2 = this.zza;
        zzq zzq2 = this.zzf.zze;
        zzbte2.zzh(iObjectWrapper, string2, bundle, (Bundle)list2, zzq2, zzeob2);
    }

    private final void zzi(List list, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzeoc)((Map.Entry)object.next()).getValue();
            String string2 = ((zzeoc)object2).zza;
            Bundle bundle = this.zzf(string2);
            List<Bundle> list2 = Collections.singletonList(((zzeoc)object2).zze);
            boolean bl3 = ((zzeoc)object2).zzb;
            boolean bl4 = ((zzeoc)object2).zzc;
            object2 = this.zzg(string2, list2, bundle, bl3, bl4);
            list.add(object2);
        }
    }

    public final int zza() {
        return 32;
    }

    public final ListenableFuture zzb() {
        Object object;
        Object object2 = this.zzf;
        boolean bl2 = ((zzfho)object2).zzr;
        if (bl2) {
            object2 = zzp.zzb(zzp.zzc(((zzfho)object2).zzd));
            object = zzbep.zzbG;
            object = (String)zzba.zzc().zza((zzbeg)object);
            String string2 = ",";
            boolean bl3 = (object = Arrays.asList(object.split(string2))).contains(object2);
            if (!bl3) {
                object = new JSONArray();
                object = object.toString();
                string2 = new Bundle();
                object2 = new zzewy((String)object, (Bundle)string2);
                return zzgft.zzh(object2);
            }
        }
        object2 = new zzewr(this);
        object = this.zzb;
        return zzgft.zzk((zzgez)object2, (Executor)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final /* synthetic */ ListenableFuture zzd(String var1_1, List var2_2, Bundle var3_3, boolean var4_4, boolean var5_5) {
        var6_6 = new zzccn();
        var7_7 = null;
        if (!var5_5) ** GOTO lbl-1000
        var8_8 = zzbep.zzbF;
        var9_10 = zzba.zzc();
        var8_8 = (Boolean)var9_10.zza((zzbeg)var8_8);
        var5_5 = var8_8.booleanValue();
        if (!var5_5) {
            this.zzg.zzb((String)var1_1);
            var8_8 = this.zzg.zza((String)var1_1);
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = this.zzh;
            try {
                var8_8 = var8_8.zzb((String)var1_1);
            }
            catch (RemoteException var8_9) {
                var9_10 = "Couldn't create RTB adapter : ";
                com.google.android.gms.ads.internal.util.zze.zzb((String)var9_10, var8_9);
                var5_5 = false;
                var8_8 = null;
            }
        }
        if (var8_8 != null) ** GOTO lbl31
        var2_2 = zzbep.zzbv;
        var3_3 = zzba.zzc();
        var2_2 = (Boolean)var3_3.zza((zzbeg)var2_2);
        var10_11 = var2_2.booleanValue();
        if (var10_11) {
            zzeob.zzb((String)var1_1, var6_6);
        } else {
            throw null;
lbl31:
            // 1 sources

            var12_13 = zzu.zzB().elapsedRealtime();
            var7_7 = var11_12;
            var9_10 = var1_1;
            var14_14 = var8_8;
            var15_15 /* !! */  = var6_6;
            var11_12 = new zzeob((String)var1_1, (zzbte)var8_8, var6_6, var12_13);
            var1_1 = zzbep.zzbA;
            var7_7 = zzba.zzc();
            var1_1 = (Boolean)var7_7.zza((zzbeg)var1_1);
            var16_16 = var1_1.booleanValue();
            if (var16_16) {
                var1_1 = this.zzc;
                var7_7 = new zzeww((zzeob)var11_12);
                var9_10 = zzbep.zzbt;
                var14_14 = zzba.zzc();
                var9_10 = (Long)var14_14.zza((zzbeg)var9_10);
                var17_17 = var9_10.longValue();
                var15_15 /* !! */  = TimeUnit.MILLISECONDS;
                var1_1.schedule((Runnable)var7_7, var17_17, (TimeUnit)var15_15 /* !! */ );
            }
            if (var4_4) {
                var1_1 = zzbep.zzbH;
                var19_18 = zzba.zzc();
                var1_1 = (Boolean)var19_18.zza((zzbeg)var1_1);
                var16_16 = var1_1.booleanValue();
                if (var16_16) {
                    var1_1 = this.zzb;
                    var7_7 = var19_18;
                    var9_10 = this;
                    var14_14 = var8_8;
                    var15_15 /* !! */  = var3_3;
                    var20_19 = var11_12;
                    var11_12 = var6_6;
                    var19_18 = new zzewt(this, (zzbte)var8_8, (Bundle)var3_3, (List)var2_2, var20_19, var6_6);
                    var1_1.zza((Runnable)var19_18);
                } else {
                    this.zzh((zzbte)var8_8, (Bundle)var3_3, (List)var2_2, (zzeob)var11_12);
                }
            } else {
                var11_12.zzd();
            }
        }
        return var6_6;
    }

    public final /* synthetic */ void zze(zzbte zzbte2, Bundle bundle, List list, zzeob zzeob2, zzccn zzccn2) {
        try {
            this.zzh(zzbte2, bundle, list, zzeob2);
            return;
        }
        catch (RemoteException remoteException) {
            zzccn2.zzd(remoteException);
            return;
        }
    }
}

