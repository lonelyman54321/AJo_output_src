/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

public abstract class zzeku
implements zzehl {
    private static Bundle zzd(Bundle bundle) {
        Bundle bundle2;
        bundle = bundle == null ? new Bundle() : (bundle2 = new Bundle(bundle));
        return bundle;
    }

    public final ListenableFuture zza(zzfhf zzfhf2, zzfgt zzfgt2) {
        Object object;
        boolean bl2;
        Object object2 = zzfhf2;
        Object object3 = zzfgt2;
        Object object4 = zzfgt2.zzw.optString("pubid", "");
        Object object5 = zzfhf2.zza.zza;
        Object object6 = new zzfhm();
        ((zzfhm)object6).zzq((zzfho)object5);
        ((zzfhm)object6).zzt((String)object4);
        object4 = zzeku.zzd(((zzfho)object5).zzd.zzm);
        Object object7 = "com.google.ads.mediation.admob.AdMobAdapter";
        Bundle bundle = zzeku.zzd(object4.getBundle((String)object7));
        int n3 = 1;
        bundle.putInt("gw", n3);
        Object object8 = zzfgt2.zzw;
        Object object9 = "mad_hac";
        int n4 = 0;
        object8 = object8.optString((String)object9, null);
        if (object8 != null) {
            bundle.putString((String)object9, (String)object8);
        }
        object8 = ((zzfgt)object3).zzw;
        object9 = "adJson";
        if ((object8 = object8.optString((String)object9, null)) != null) {
            object9 = "_ad";
            bundle.putString((String)object9, (String)object8);
        }
        bundle.putBoolean("_noRefresh", n3 != 0);
        object8 = ((zzfgt)object3).zzE.keys();
        while (bl2 = object8.hasNext()) {
            object9 = (String)object8.next();
            object = ((zzfgt)object3).zzE.optString((String)object9, null);
            if (object9 == null) continue;
            bundle.putString((String)object9, (String)object);
        }
        object4.putBundle((String)object7, bundle);
        object5 = ((zzfho)object5).zzd;
        Bundle bundle2 = ((zzl)object5).zzn;
        List list = ((zzl)object5).zzo;
        String string2 = ((zzl)object5).zzp;
        String string3 = ((zzl)object5).zzq;
        n4 = ((zzl)object5).zzd;
        boolean bl3 = ((zzl)object5).zzr;
        object = ((zzl)object5).zze;
        zzc zzc2 = ((zzl)object5).zzs;
        boolean bl4 = ((zzl)object5).zzf;
        int n7 = ((zzl)object5).zzt;
        int n8 = ((zzl)object5).zzg;
        String string4 = ((zzl)object5).zzu;
        boolean bl5 = ((zzl)object5).zzh;
        List list2 = ((zzl)object5).zzv;
        String string5 = ((zzl)object5).zzi;
        int bl6 = ((zzl)object5).zzw;
        object7 = object9;
        zzfh zzfh2 = ((zzl)object5).zzj;
        object8 = ((zzl)object5).zzx;
        int n10 = ((zzl)object5).zza;
        Location location = ((zzl)object5).zzk;
        n3 = ((zzl)object5).zzy;
        long l2 = ((zzl)object5).zzb;
        object3 = object9;
        object2 = ((zzl)object5).zzl;
        long l3 = ((zzl)object5).zzz;
        object2 = object9 = new zzl(n10, l2, bundle, n4, (List)object, bl4, n8, bl5, string5, zzfh2, location, (String)object2, (Bundle)object4, bundle2, list, string2, string3, bl3, zzc2, n7, string4, list2, bl6, (String)object8, n3, l3);
        ((zzfhm)object6).zzH((zzl)object9);
        object2 = ((zzfhm)object6).zzJ();
        object3 = new Bundle();
        object4 = zzfhf2;
        object5 = zzfhf2.zzb.zzb;
        object6 = new Bundle();
        object8 = ((zzfgw)object5).zza;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("nofill_urls", object7);
        n10 = ((zzfgw)object5).zzc;
        object6.putInt("refresh_interval", n10);
        object5 = ((zzfgw)object5).zzb;
        object6.putString("gws_query_id", (String)object5);
        object3.putBundle("parent_common_config", (Bundle)object6);
        object5 = zzfhf2.zza.zza;
        object6 = new Bundle();
        object5 = ((zzfho)object5).zzf;
        object6.putString("initial_ad_unit_id", (String)object5);
        object5 = zzfgt2;
        object7 = zzfgt2.zzx;
        object6.putString("allocation_id", (String)object7);
        object7 = zzfgt2.zzG;
        object6.putString("ad_source_name", (String)object7);
        object8 = zzfgt2.zzc;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("click_urls", object7);
        object8 = zzfgt2.zzd;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("imp_urls", object7);
        object8 = zzfgt2.zzq;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("manual_tracking_urls", object7);
        object8 = zzfgt2.zzn;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("fill_urls", object7);
        object8 = zzfgt2.zzh;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("video_start_urls", object7);
        object8 = zzfgt2.zzi;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("video_reward_urls", object7);
        object8 = zzfgt2.zzj;
        object7 = new ArrayList(object8);
        object6.putStringArrayList("video_complete_urls", object7);
        object7 = zzfgt2.zzk;
        object6.putString("transaction_id", (String)object7);
        object7 = zzfgt2.zzl;
        object6.putString("valid_from_timestamp", (String)object7);
        boolean bl7 = zzfgt2.zzQ;
        object6.putBoolean("is_closable_area_disabled", bl7);
        object7 = zzfgt2.zzap;
        object8 = "recursive_server_response_data";
        object6.putString((String)object8, (String)object7);
        object7 = zzfgt2.zzm;
        if (object7 != null) {
            object7 = new Bundle();
            n10 = zzfgt2.zzm.zzb;
            object7.putInt("rb_amount", n10);
            object8 = zzfgt2.zzm.zza;
            object7.putString("rb_type", (String)object8);
            n10 = 1;
            object8 = new Bundle[n10];
            n3 = 0;
            location = null;
            object8[0] = object7;
            object7 = "rewards";
            object6.putParcelableArray((String)object7, (Parcelable[])object8);
        }
        object3.putBundle("parent_ad_config", (Bundle)object6);
        object6 = this;
        return this.zzc((zzfho)object2, (Bundle)object3, (zzfgt)object5, (zzfhf)object4);
    }

    public final boolean zzb(zzfhf object, zzfgt object2) {
        object = ((zzfgt)object2).zzw;
        object2 = "pubid";
        String string2 = "";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = object.optString((String)object2, string2)));
        return !bl2;
    }

    public abstract ListenableFuture zzc(zzfho var1, Bundle var2, zzfgt var3, zzfhf var4);
}

