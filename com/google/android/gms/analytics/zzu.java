/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.analytics.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbw;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzem;
import com.google.android.gms.internal.gtm.zzff;
import java.util.HashMap;
import java.util.Map;

final class zzu
implements Runnable {
    final /* synthetic */ Map zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ String zzg;
    final /* synthetic */ Tracker zzh;

    public zzu(Tracker tracker, Map map2, boolean bl2, String string2, long l2, boolean bl3, boolean bl4, String string3) {
        this.zza = map2;
        this.zzb = bl2;
        this.zzc = string2;
        this.zzd = l2;
        this.zze = bl3;
        this.zzf = bl4;
        this.zzg = string3;
        this.zzh = tracker;
    }

    public final void run() {
        long l2;
        Object object;
        long l3;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        zzu zzu2 = this;
        Object object6 = Tracker.zza(this.zzh);
        boolean bl2 = ((zzv)object6).zzf();
        if (bl2) {
            object6 = this.zza;
            object5 = "sc";
            object4 = "start";
            object6.put(object5, object4);
        }
        object6 = zzu2.zza;
        object5 = zzu2.zzh.zzp();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        object5 = ((zza)object5).zzb().zzi().zzb();
        object4 = "cid";
        if (object5 != null && (object3 = TextUtils.isEmpty((CharSequence)(object2 = (CharSequence)object6.get(object4))))) {
            object6.put(object4, object5);
        }
        object6 = zzu2.zza;
        object5 = "sf";
        if ((object6 = (String)object6.get(object5)) != null) {
            double d2;
            try {
                d2 = Double.parseDouble((String)object6);
            }
            catch (NumberFormatException numberFormatException) {
                l3 = 4636737291354636288L;
                d2 = 100.0;
            }
            object2 = (String)zzu2.zza.get(object4);
            object3 = zzff.zzj(d2, (String)object2);
            if (object3) {
                object4 = zzu2.zzh;
                object6 = d2;
                ((zzbq)object4).zzF("Sampling enabled. Hit sampled out. sample rate", object6);
                return;
            }
        }
        object6 = zzu2.zzh;
        boolean bl3 = zzu2.zzb;
        object6 = Tracker.zzb((Tracker)object6);
        object2 = "1";
        boolean bl4 = true;
        String string2 = "ate";
        String string3 = "adid";
        if (bl3) {
            object5 = zzu2.zza;
            boolean bl5 = ((zzbh)object6).zzb();
            boolean bl6 = object5.containsKey(string2);
            if (!bl6) {
                object = bl4 != bl5 ? "0" : object2;
                object5.put(string2, object);
            }
            object5 = zzu2.zza;
            object6 = ((zzbh)object6).zza();
            zzff.zzg((Map)object5, string3, (String)object6);
        } else {
            zzu2.zza.remove(string2);
            object6 = zzu2.zza;
            object6.remove(string3);
        }
        object6 = Tracker.zzf(zzu2.zzh).zza();
        object5 = zzu2.zza;
        string2 = ((zzau)object6).zzf();
        object = "an";
        zzff.zzg((Map)object5, (String)object, string2);
        object5 = zzu2.zza;
        string2 = ((zzau)object6).zzg();
        String string4 = "av";
        zzff.zzg((Map)object5, string4, string2);
        object5 = zzu2.zza;
        string2 = ((zzau)object6).zzd();
        String string5 = "aid";
        zzff.zzg((Map)object5, string5, string2);
        object5 = zzu2.zza;
        object6 = ((zzau)object6).zze();
        string2 = "aiid";
        zzff.zzg((Map)object5, string2, (String)object6);
        zzu2.zza.put("v", object2);
        object6 = zzu2.zza;
        object2 = zzbs.zzb;
        object6.put("_v", object2);
        object6 = zzu2.zza;
        object5 = Tracker.zzg(zzu2.zzh).zza().zzd();
        zzff.zzg((Map)object6, "ul", (String)object5);
        object6 = zzu2.zza;
        object5 = Tracker.zzh(zzu2.zzh).zzb();
        object2 = "sr";
        zzff.zzg((Map)object6, (String)object2, (String)object5);
        object6 = zzu2.zzc;
        object5 = "transaction";
        bl2 = ((String)object6).equals(object5);
        if (!(bl2 || (bl2 = ((String)(object6 = zzu2.zzc)).equals(object5 = "item")) || (bl2 = ((zzem)(object6 = Tracker.zzi(zzu2.zzh))).zza()))) {
            object6 = zzu2.zzh;
            object5 = zzu2.zza;
            Tracker.zzj((Tracker)object6).zzc((Map)object5, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        object6 = zzu2.zza;
        object5 = "ht";
        l3 = zzff.zza((String)(object6 = (String)object6.get(object5)));
        long l4 = l3 - (l2 = 0L);
        object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (!object3) {
            l3 = zzu2.zzd;
        }
        long l7 = l3;
        bl2 = zzu2.zze;
        if (bl2) {
            Tracker tracker = zzu2.zzh;
            Map map2 = zzu2.zza;
            bl2 = zzu2.zzf;
            object5 = new zzek(tracker, map2, l3, bl2);
            Tracker.zzk(zzu2.zzh).zzM("Dry run enabled. Would have sent hit", object5);
            return;
        }
        object6 = zzu2.zza.get(object4);
        HashMap hashMap = object6;
        hashMap = (String)object6;
        object6 = new HashMap();
        object5 = zzu2.zza;
        zzff.zzh(object6, "uid", (Map)object5);
        object5 = zzu2.zza;
        zzff.zzh(object6, (String)object, (Map)object5);
        object5 = zzu2.zza;
        zzff.zzh(object6, string5, (Map)object5);
        object5 = zzu2.zza;
        zzff.zzh(object6, string4, (Map)object5);
        object5 = zzu2.zza;
        zzff.zzh(object6, string2, (Map)object5);
        Preconditions.checkNotNull(hashMap);
        object5 = zzu2.zzg;
        object4 = zzu2.zza;
        boolean bl7 = TextUtils.isEmpty((CharSequence)((CharSequence)object4.get(string3))) ^ true;
        object2 = new zzbw(0L, (String)((Object)hashMap), (String)object5, bl7, 0L, (Map)object6);
        l3 = Tracker.zzc(zzu2.zzh).zza((zzbw)object2);
        object4 = zzu2.zza;
        object6 = String.valueOf(l3);
        object4.put("_s", object6);
        Tracker tracker = zzu2.zzh;
        Map map3 = zzu2.zza;
        bl2 = zzu2.zzf;
        object5 = new zzek(tracker, map3, l7, bl2);
        Tracker.zze(zzu2.zzh).zzh((zzek)object5);
    }
}

