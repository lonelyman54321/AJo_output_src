/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Pair
 *  android.webkit.WebView
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zza;
import com.google.android.gms.ads.nonagon.signalgeneration.zzb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdvh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zze {
    private final Map zza;
    private final Map zzb;
    private final Context zzc;
    private final zzdvh zzd;
    private final ExecutorService zze;

    public zze(Context context, zzdvh zzdvh2, ExecutorService executorService) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
        this.zzc = context;
        this.zzd = zzdvh2;
        this.zze = executorService;
    }

    private final void zzh(boolean bl2) {
        Object object = this.zzb;
        Object object2 = bl2;
        boolean bl3 = object.containsKey(object2);
        if (!bl3) {
            object = this.zzb;
            ArrayList arrayList = new ArrayList();
            object.put(object2, arrayList);
            object = this.zze;
            object2 = new zzc(this, bl2);
            object.submit((Runnable)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzi(zzg zzg2, Pair pair, boolean bl2) {
        boolean bl3;
        Object object;
        Pair pair2 = pair;
        int n3 = 1;
        int n4 = 6;
        zzg2.zzd();
        Object object2 = zzg2.zzb();
        if (object2 != null) {
            object = (QueryInfoGenerationCallback)pair.first;
            ((QueryInfoGenerationCallback)object).onSuccess((QueryInfo)object2);
        } else {
            object2 = (QueryInfoGenerationCallback)pair.first;
            object = zzg2.zzc();
            ((QueryInfoGenerationCallback)object2).onFailure((String)object);
        }
        object2 = this;
        object = this.zzd;
        Pair pair3 = new Pair((Object)"se", (Object)"query_g");
        String string2 = AdFormat.BANNER.name();
        Pair pair4 = new Pair((Object)"ad_format", (Object)string2);
        String string3 = Integer.toString(n4);
        string2 = new Pair((Object)"rtype", (Object)string3);
        string3 = new Pair((Object)"scar", (Object)"true");
        long l2 = zzu.zzB().currentTimeMillis();
        long l3 = (Long)pair2.second;
        String string4 = Long.toString(l2 -= l3);
        Pair pair5 = new Pair((Object)"lat_ms", (Object)string4);
        string4 = Boolean.toString(bl2);
        pair2 = new Pair((Object)"sgpc_h", (Object)string4);
        Pair[] pairArray = zzg2.zzb();
        if (pairArray != null) {
            bl3 = true;
        } else {
            bl3 = false;
            pairArray = null;
        }
        pairArray = Boolean.toString(bl3);
        string4 = new Pair((Object)"sgpc_rs", (Object)pairArray);
        pairArray = new Pair[7];
        pairArray[0] = pair3;
        pairArray[n3] = pair4;
        pairArray[2] = string2;
        pairArray[3] = string3;
        pairArray[4] = pair5;
        pairArray[5] = pair2;
        pairArray[n4] = string4;
        zzp.zzd((zzdvh)object, null, "sgpcr", pairArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzj(boolean bl2, boolean bl3) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                int n3;
                int n4;
                Object object;
                Object object2;
                Object object3;
                try {
                    object3 = new Bundle();
                    object2 = "query_info_type";
                    object = "requester_type_6";
                    object3.putString((String)object2, (String)object);
                    object2 = "accept_3p_cookie";
                    object3.putBoolean((String)object2, bl2);
                    object2 = this.zza;
                    object = bl2;
                    object2 = object2.get(object);
                    object2 = (zzg)object2;
                    n4 = 0;
                    if (!bl3 || object2 == null) {
                        n3 = 0;
                    } else {
                        bl3 = ((zzg)object2).zza();
                        n3 = n4 = bl3 + 1;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                Object object4 = this.zza;
                object4 = object4.get(object);
                object4 = (zzg)object4;
                if (object4 == null) {
                    bl3 = false;
                    object4 = null;
                } else {
                    bl3 = ((zzg)object4).zzf();
                    object4 = bl3;
                }
                Object object5 = object4;
                zzdvh zzdvh2 = this.zzd;
                object2 = object4;
                object = this;
                n4 = (int)(bl2 ? 1 : 0);
                object4 = new zzf(this, bl2, n3, (Boolean)object5, zzdvh2);
                Object object6 = new AdRequest$Builder();
                object2 = AdMobAdapter.class;
                object6 = ((AbstractAdRequestBuilder)object6).addNetworkExtrasBundle((Class)object2, (Bundle)object3);
                object6 = ((AdRequest$Builder)object6).build();
                object3 = zzbep.zzlb;
                object2 = zzba.zzc();
                object3 = ((zzben)object2).zza((zzbeg)object3);
                object3 = (Boolean)object3;
                boolean bl4 = (Boolean)object3;
                if (!bl4) {
                    object3 = this.zzc;
                    object2 = AdFormat.BANNER;
                    QueryInfo.generate((Context)object3, (AdFormat)((Object)object2), (AdRequest)object6, (QueryInfoGenerationCallback)object4);
                    return;
                }
                object3 = this.zze;
                object2 = new zzd(this, (AdRequest)object6, (zzf)object4);
                object3.submit(object2);
                return;
            }
            throw throwable2;
        }
    }

    public final /* synthetic */ Object zza(AdRequest adRequest, zzf zzf2) {
        Context context = this.zzc;
        AdFormat adFormat = AdFormat.BANNER;
        QueryInfo.generate(context, adFormat, adRequest, zzf2);
        return Boolean.TRUE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            boolean bl2 = true;
            this.zzh(bl2);
            bl2 = false;
            Object var2_2 = null;
            this.zzh(false);
            return;
        }
    }

    public final /* synthetic */ void zzc(boolean bl2) {
        this.zzj(bl2, false);
    }

    public final /* synthetic */ void zzd(boolean bl2, boolean bl3) {
        this.zzj(bl2, bl3);
    }

    public final /* synthetic */ void zze(Object list, Pair pair) {
        Object object;
        boolean bl2 = list instanceof WebView;
        boolean bl3 = false;
        Map map2 = null;
        if (bl2) {
            object = this.zzc;
            zzab zzab2 = zzu.zzq();
            object = zzab2.zza((Context)object);
            if (object != null) {
                list = (WebView)list;
                bl3 = object.acceptThirdPartyCookies((WebView)list);
            }
        }
        list = this.zza;
        object = bl3;
        list = (zzg)list.get(object);
        if (list != null && !(bl3 = ((zzg)((Object)list)).zze())) {
            this.zzi((zzg)((Object)list), pair, true);
            return;
        }
        list = (List)this.zzb.get(object);
        if (list == null) {
            list = new List<Object>();
            map2 = this.zzb;
            map2.put(object, list);
        }
        list.add(pair);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(boolean bl2, zzg zzg2) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                ArrayList arrayList;
                boolean bl3;
                Boolean bl4;
                Object object;
                block9: {
                    try {
                        object = this.zza;
                        bl4 = bl2;
                        object = object.get(bl4);
                        object = (zzg)object;
                        if (object != null && !(bl3 = ((zzg)object).zze()) && (object = ((zzg)object).zzb()) != null && (object = zzg2.zzb()) == null) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    object = this.zza;
                    object.put(bl4, zzg2);
                }
                if ((object = zzg2.zzb()) != null) {
                    object = zzbep.zzjS;
                    arrayList = zzba.zzc();
                    object = ((zzben)((Object)arrayList)).zza((zzbeg)object);
                    object = (Integer)object;
                } else {
                    object = zzbep.zzjT;
                    arrayList = zzba.zzc();
                    object = ((zzben)((Object)arrayList)).zza((zzbeg)object);
                    object = (Integer)object;
                }
                int n3 = (Integer)object;
                arrayList = zzg2.zzb();
                if (arrayList == null) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    arrayList = null;
                }
                ScheduledExecutorService scheduledExecutorService = zzcci.zzd;
                zzb zzb2 = new zzb(this, bl2, bl3);
                long l2 = n3;
                Object object2 = TimeUnit.SECONDS;
                scheduledExecutorService.schedule(zzb2, l2, (TimeUnit)((Object)object2));
                object2 = this.zzb;
                object2 = object2.get(bl4);
                object2 = (List)object2;
                object = this.zzb;
                arrayList = new ArrayList();
                object.put(bl4, arrayList);
                if (object2 != null) {
                    object2 = object2.iterator();
                    while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object = object2.next();
                        object = (Pair)object;
                        this.zzi(zzg2, (Pair)object, false);
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
    public final void zzg(Object object, QueryInfoGenerationCallback object2) {
        synchronized (this) {
            Object object3 = zzu.zzB();
            long l2 = object3.currentTimeMillis();
            object3 = l2;
            Pair pair = new Pair(object2, object3);
            object2 = zzcci.zze;
            object3 = new zza(this, object, pair);
            object2.execute((Runnable)object3);
            return;
        }
    }
}

