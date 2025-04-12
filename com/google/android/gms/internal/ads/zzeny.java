/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdta;
import com.google.android.gms.internal.ads.zzenw;
import com.google.android.gms.internal.ads.zzenx;
import com.google.android.gms.internal.ads.zzeoa;
import com.google.android.gms.internal.ads.zzeoc;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeny {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Executor zzf;
    private JSONObject zzg;

    public zzeny(Executor executor) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = hashMap = new HashMap();
        this.zzc = hashMap = new HashMap();
        this.zzd = hashMap = new HashMap();
        this.zze = hashMap = new HashMap();
        this.zzf = executor;
    }

    public static /* synthetic */ void zzd(zzeny zzeny2) {
        zzeny2.zzj();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzgbf zzh(String object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                HashMap hashMap;
                block5: {
                    try {
                        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                        if (bl3) return zzgbf.zzd();
                        hashMap = zzu.zzo();
                        hashMap = ((zzcby)((Object)hashMap)).zzi();
                        hashMap = hashMap.zzh();
                        bl3 = TextUtils.isEmpty((CharSequence)((Object)(hashMap = ((zzcbs)((Object)hashMap)).zzc())));
                        if (bl3) return zzgbf.zzd();
                        hashMap = zzbep.zzde;
                        Object object2 = zzba.zzc();
                        hashMap = ((zzben)object2).zza((zzbeg)((Object)hashMap));
                        hashMap = (String)((Object)hashMap);
                        bl3 = Pattern.matches((String)((Object)hashMap), (CharSequence)object);
                        object2 = zzbep.zzdf;
                        zzben zzben2 = zzba.zzc();
                        object2 = zzben2.zza((zzbeg)object2);
                        object2 = (String)object2;
                        bl2 = Pattern.matches((String)object2, (CharSequence)object);
                        if (!bl3) break block5;
                        object = this.zze;
                        hashMap = new HashMap(object);
                        return zzgbf.zzc(hashMap);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (!bl2) return zzgbf.zzd();
                object = this.zzd;
                hashMap = new HashMap(object);
                return zzgbf.zzc(hashMap);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final List zzi(JSONObject jSONObject, String string2) {
        synchronized (this) {
            Throwable throwable2;
            ArrayList<Object> arrayList;
            block7: {
                try {
                    Object object;
                    int n3;
                    arrayList = new ArrayList<Object>();
                    if (jSONObject == null) break block7;
                    String string3 = "data";
                    string3 = jSONObject.optJSONObject(string3);
                    string3 = zzeny.zzo((JSONObject)string3);
                    Object object2 = "rtb_adapters";
                    if ((jSONObject = jSONObject.optJSONArray((String)object2)) == null) break block7;
                    object2 = new Object();
                    int n4 = 0;
                    String string4 = null;
                    for (int i3 = 0; i3 < (n3 = jSONObject.length()); ++i3) {
                        object = "";
                        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = jSONObject.optString(i3, (String)object)));
                        if (bl2) continue;
                        ((ArrayList)object2).add(object);
                    }
                    int n7 = ((ArrayList)object2).size();
                    while (n4 < n7) {
                        string4 = (String)((ArrayList)object2).get(n4);
                        string4 = string4;
                        this.zzg(string4);
                        object = this.zza;
                        object = object.get(string4);
                        object = (zzeoa)object;
                        if (object != null) {
                            object = new zzeoa(string4, string2, (Bundle)string3);
                            arrayList.add(object);
                        }
                        ++n4;
                    }
                }
                catch (Throwable throwable2) {}
            }
            return arrayList;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzj() {
        synchronized (this) {
            Map map2 = this.zzb;
            map2.clear();
            map2 = this.zza;
            map2.clear();
            map2 = this.zze;
            map2.clear();
            map2 = this.zzd;
            map2.clear();
            this.zzm();
            this.zzn();
            this.zzk();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private final void zzk() {
        synchronized (this) {
            block12: {
                block11: {
                    block13: {
                        block8: {
                            block10: {
                                block9: {
                                    var1_1 = zzbgq.zzb;
                                    var1_1 = var1_1.zze();
                                    var1_1 = (Boolean)var1_1;
                                    var2_4 = var1_1.booleanValue();
                                    if (var2_4) break block11;
                                    var1_1 = zzbep.zzbN;
                                    var3_5 = zzba.zzc();
                                    var1_1 = var3_5.zza((zzbeg)var1_1);
                                    var2_4 = (var1_1 = (Boolean)var1_1).booleanValue();
                                    if (!var2_4) break block11;
                                    var1_1 = zzu.zzo();
                                    var1_1 = var1_1.zzi();
                                    var1_1 = var1_1.zzh();
                                    if ((var1_1 = var1_1.zzf()) == null) break block11;
                                    var3_5 = "adapter_settings";
                                    var1_1 = var1_1.getJSONArray((String)var3_5);
                                    var3_5 = null;
                                    var4_6 = 0;
lbl22:
                                    // 2 sources

                                    while (var4_6 < (var5_7 = var1_1.length())) {
                                        var6_8 = var1_1.getJSONObject(var4_6);
                                        var7_9 = "adapter_class_name";
                                        var7_9 = var6_8.optString(var7_9);
                                        var8_10 = "permission_set";
                                        var6_8 = var6_8.optJSONArray((String)var8_10);
                                        var9_11 = TextUtils.isEmpty((CharSequence)var7_9);
                                        if (var9_11 != 0) break block8;
                                        var10_12 = 0;
lbl31:
                                        // 2 sources

                                        while (var10_12 < (var9_11 = var6_8.length())) {
                                            var8_10 = var6_8.getJSONObject(var10_12);
                                            var11_13 = "enable_rendering";
                                            var12_14 = var8_10.optBoolean(var11_13, false);
                                            var11_13 = "collect_secure_signals";
                                            var13_15 = var8_10.optBoolean(var11_13, false);
                                            var11_13 = "collect_secure_signals_on_full_app";
                                            var14_16 = var8_10.optBoolean(var11_13, false);
                                            var11_13 = "platform";
                                            var15_17 = var8_10.optString(var11_13);
                                            var17_19 = new Bundle();
                                            var8_10 = var16_18;
                                            var11_13 = var7_9;
                                            var16_18 = new zzeoc(var7_9, var13_15, var12_14, var14_16, var17_19);
                                            var8_10 = "ADMOB";
                                            var9_11 = (int)var15_17.equals(var8_10);
                                            if (var9_11 == 0) break block9;
                                            var8_10 = this.zzd;
                                            var8_10.put(var7_9, var16_18);
                                            break block10;
                                        }
                                        break block8;
                                    }
                                    break block11;
                                    catch (Throwable var1_2) {
                                        break block12;
                                    }
                                    catch (JSONException var1_3) {
                                        break block13;
                                    }
                                }
                                var8_10 = "AD_MANAGER";
                                var9_11 = (int)var15_17.equals(var8_10);
                                if (var9_11 != 0) {
                                    var8_10 = this.zze;
                                    var8_10.put(var7_9, var16_18);
                                }
                            }
                            ++var10_12;
                            ** GOTO lbl31
                        }
                        ++var4_6;
                        ** GOTO lbl22
                    }
                    var3_5 = "Malformed config loading JSON.";
                    com.google.android.gms.ads.internal.util.zze.zzb((String)var3_5, var1_3);
                    return;
                }
                return;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzl(String arrayList, String string2, List list) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    Map map2;
                    block5: {
                        try {
                            boolean bl2 = TextUtils.isEmpty((CharSequence)((Object)arrayList));
                            if (bl2 || (bl2 = TextUtils.isEmpty((CharSequence)string2))) break block4;
                            map2 = this.zzc;
                            map2 = map2.get(arrayList);
                            if (map2 != null) break block5;
                            map2 = new Map();
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    Map map3 = this.zzc;
                    map3.put(arrayList, map2);
                    arrayList = map2.get(string2);
                    arrayList = arrayList;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(list);
                    map2.put(string2, arrayList);
                    return;
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
    private final void zzm() {
        synchronized (this) {
            block11: {
                int n3;
                String string2;
                block12: {
                    try {
                        Object object = zzu.zzo();
                        object = ((zzcby)object).zzi();
                        object = object.zzh();
                        object = ((zzcbs)object).zzf();
                        if (object == null) break block11;
                        string2 = "ad_unit_id_settings";
                        try {
                            string2 = object.optJSONArray(string2);
                            String string3 = "ad_unit_patterns";
                            object = object.optJSONObject(string3);
                            this.zzg = object;
                            if (string2 == null) break block11;
                            object = null;
                            string3 = null;
                            break block12;
                        }
                        catch (JSONException jSONException) {}
                        string2 = "Malformed config loading JSON.";
                        com.google.android.gms.ads.internal.util.zze.zzb(string2, jSONException);
                        return;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
                    JSONObject jSONObject = string2.getJSONObject(i3);
                    Object object = zzbep.zzkR;
                    Object object2 = zzba.zzc();
                    object = ((zzben)object2).zza((zzbeg)object);
                    boolean bl2 = (Boolean)(object = (Boolean)object);
                    if (bl2) {
                        object = "ad_unit_id";
                        object2 = "";
                        object = jSONObject.optString((String)object, (String)object2);
                        object2 = Locale.ROOT;
                        object = ((String)object).toLowerCase((Locale)object2);
                    } else {
                        object = "ad_unit_id";
                        object2 = "";
                        object = jSONObject.optString((String)object, (String)object2);
                    }
                    object2 = "format";
                    ArrayList arrayList = "";
                    object2 = jSONObject.optString((String)object2, (String)((Object)arrayList));
                    arrayList = new ArrayList();
                    String string4 = "mediation_config";
                    jSONObject = jSONObject.optJSONObject(string4);
                    if (jSONObject != null && (jSONObject = jSONObject.optJSONArray(string4 = "ad_networks")) != null) {
                        int n4;
                        string4 = null;
                        for (int i8 = 0; i8 < (n4 = jSONObject.length()); ++i8) {
                            Object object3 = jSONObject.getJSONObject(i8);
                            object3 = this.zzi((JSONObject)object3, (String)object2);
                            arrayList.addAll(object3);
                        }
                    }
                    this.zzl((String)object2, (String)object, arrayList);
                }
            }
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzn() {
        synchronized (this) {
            block6: {
                int n3;
                Object object;
                block7: {
                    Throwable throwable2;
                    block8: {
                        Object object2;
                        try {
                            object = zzbgq.zzg;
                            object = ((zzbfv)object).zze();
                            object = (Boolean)object;
                            boolean bl2 = (Boolean)object;
                            if (bl2) break block6;
                            object = zzbep.zzbM;
                            object2 = zzba.zzc();
                            object = ((zzben)object2).zza((zzbeg)object);
                            bl2 = (Boolean)(object = (Boolean)object);
                            if (!bl2) break block6;
                            object = zzu.zzo();
                            object = ((zzcby)object).zzi();
                            object = object.zzh();
                            if ((object = ((zzcbs)object).zzf()) == null) break block6;
                            object2 = "signal_adapters";
                            object = object.getJSONArray((String)object2);
                            object2 = null;
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        catch (JSONException jSONException) {}
                        object2 = "Malformed config loading JSON.";
                        com.google.android.gms.ads.internal.util.zze.zzb((String)object2, jSONException);
                        return;
                    }
                    throw throwable2;
                }
                for (int i3 = 0; i3 < (n3 = object.length()); ++i3) {
                    zzeoc zzeoc2;
                    Object object3 = object.getJSONObject(i3);
                    String string2 = "data";
                    string2 = object3.optJSONObject(string2);
                    Bundle bundle = zzeny.zzo((JSONObject)string2);
                    string2 = "adapter_class_name";
                    string2 = object3.optString(string2);
                    Object object4 = "render";
                    boolean bl3 = object3.optBoolean((String)object4, false);
                    object4 = "collect_signals";
                    boolean bl4 = object3.optBoolean((String)object4, false);
                    n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                    if (n3 != 0) continue;
                    object3 = this.zzb;
                    boolean bl5 = true;
                    object4 = zzeoc2;
                    zzeoc2 = new zzeoc(string2, bl4, bl3, bl5, bundle);
                    object3.put(string2, zzeoc2);
                }
            }
            return;
        }
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            boolean bl2;
            Iterator iterator = jSONObject.keys();
            while (bl2 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = jSONObject.optString(string2, "");
                bundle.putString(string2, string3);
            }
        }
        return bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zza(String object, String object2) {
        synchronized (this) {
            Object object3;
            Object object4;
            boolean bl2;
            HashMap<Object, Object> hashMap;
            try {
                object = this.zzb((String)object, (String)object2);
                object2 = this.zzh((String)object2);
                hashMap = new HashMap<Object, Object>();
                object = (zzgbf)object;
                object = ((zzgbf)object).zzh();
                object = object.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (bl2 = object.hasNext()) {
                zzeoc zzeoc2;
                object4 = object.next();
                object4 = (Map.Entry)object4;
                object3 = object4.getKey();
                boolean bl3 = ((zzgbf)object2).containsKey(object3 = (String)object3);
                if (!bl3) continue;
                Object object5 = ((zzgbf)object2).get(object3);
                object5 = (zzeoc)object5;
                object4 = object4.getValue();
                object4 = (List)object4;
                boolean bl4 = ((zzeoc)object5).zzb;
                boolean bl5 = ((zzeoc)object5).zzc;
                boolean bl6 = ((zzeoc)object5).zzd;
                if (object4 != null && !(bl3 = object4.isEmpty())) {
                    bl3 = false;
                    object5 = null;
                    object4 = object4.get(0);
                    object4 = (Bundle)object4;
                } else {
                    object4 = new Object();
                }
                object5 = zzeoc2;
                zzeoc2 = new zzeoc((String)object3, bl4, bl5, bl6, (Bundle)object4);
                hashMap.put(object3, zzeoc2);
            }
            object = ((zzgbf)object2).zzh();
            object = ((zzgbh)object).zze();
            boolean bl7;
            while (bl7 = object.hasNext()) {
                object2 = object.next();
                object2 = (Map.Entry)object2;
                object4 = object2.getKey();
                boolean bl8 = hashMap.containsKey(object4 = (String)object4);
                if (bl8) continue;
                object3 = object2.getValue();
                object3 = (zzeoc)object3;
                bl8 = ((zzeoc)object3).zzd;
                if (!bl8) continue;
                object2 = object2.getValue();
                object2 = (zzeoc)object2;
                hashMap.put(object4, object2);
            }
            return hashMap;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzb(String object, String object2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                try {
                    boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                    if (bl2 || (bl2 = TextUtils.isEmpty((CharSequence)object2))) break block9;
                    Object object3 = zzu.zzo();
                    object3 = ((zzcby)object3).zzi();
                    object3 = object3.zzh();
                    bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((zzcbs)object3).zzc()));
                    if (bl2) break block9;
                    object3 = this.zzc;
                    object3 = object3.get(object);
                    if ((object3 = (Map)object3) == null) break block9;
                    Object object4 = object3.get(object2);
                    if ((object4 = (List)object4) == null) {
                        object4 = this.zzg;
                        object = zzdta.zza(object4, (String)object2, object);
                        object2 = zzbep.zzkR;
                        object4 = zzba.zzc();
                        object2 = ((zzben)object4).zza((zzbeg)object2);
                        boolean bl3 = (Boolean)(object2 = (Boolean)object2);
                        if (bl3) {
                            object2 = Locale.ROOT;
                            object = ((String)object).toLowerCase((Locale)object2);
                        }
                        object4 = object = object3.get(object);
                        object4 = (List)object;
                    }
                    if (object4 == null) break block9;
                    object = new HashMap();
                    object2 = object4.iterator();
                    while (bl2 = object2.hasNext()) {
                        object3 = object2.next();
                        object3 = (zzeoa)object3;
                        object4 = ((zzeoa)object3).zza;
                        boolean bl4 = ((HashMap)object).containsKey(object4);
                        if (!bl4) {
                            ArrayList arrayList = new ArrayList();
                            ((HashMap)object).put(object4, arrayList);
                        }
                        object4 = ((HashMap)object).get(object4);
                        object4 = (List)object4;
                        object3 = ((zzeoa)object3).zzc;
                        object4.add((Object)object3);
                    }
                    return zzgbf.zzc((Map)object);
                }
                catch (Throwable throwable2) {}
            }
            return zzgbf.zzd();
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzc() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                try {
                    object = zzu.zzo();
                    object = ((zzcby)object).zzi();
                    object = object.zzh();
                    object = ((zzcbs)object).zzc();
                    boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                    if (bl2) {
                        return zzgbf.zzd();
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object = this.zzb;
                    return zzgbf.zzc((Map)object);
                }
            }
            throw throwable2;
        }
    }

    public final void zze() {
        Object object = zzu.zzo().zzi();
        zzenx zzenx2 = new zzenx(this);
        object.zzr(zzenx2);
        object = new zzenw(this);
        this.zzf.execute((Runnable)object);
    }

    public final /* synthetic */ void zzf() {
        zzenw zzenw2 = new zzenw(this);
        this.zzf.execute(zzenw2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Map map2;
                    boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                    if (!bl2 && !(bl2 = (map2 = this.zza).containsKey(string2))) {
                        map2 = this.zza;
                        Bundle bundle = new Bundle();
                        String string3 = "";
                        zzeoa zzeoa2 = new zzeoa(string2, string3, bundle);
                        map2.put(string2, zzeoa2);
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
}

