/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Build$VERSION
 *  android.preference.PreferenceManager
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxm;
import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzdxw;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdyh;
import com.google.android.gms.internal.ads.zzdyl;
import com.google.android.gms.internal.ads.zzdyx;
import com.google.android.gms.internal.ads.zzdzb;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdya
implements zzdzb,
zzdxl {
    private final zzdyl zza;
    private final zzdzc zzb;
    private final zzdxm zzc;
    private final zzdxv zzd;
    private final zzdxk zze;
    private final zzdyx zzf;
    private final zzdyh zzg;
    private final zzdyh zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private final Map zzl;
    private final Map zzm;
    private final Map zzn;
    private String zzo;
    private JSONObject zzp;
    private long zzq;
    private zzdxw zzr;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private zzdxz zzv;
    private long zzw;
    private String zzx;

    public zzdya(zzdyl object, zzdzc zzdzc2, zzdxm zzdxm2, Context context, VersionInfoParcel versionInfoParcel, zzdxv zzdxv2, zzdyx zzdyx2, zzdyh zzdyh2, zzdyh zzdyh3, String string2) {
        Object object2;
        this.zzl = object2 = new Object();
        this.zzm = object2 = new Object();
        this.zzn = object2 = new Object();
        this.zzo = "{}";
        this.zzq = Long.MAX_VALUE;
        object2 = zzdxw.zza;
        this.zzr = object2;
        object2 = zzdxz.zza;
        this.zzv = object2;
        this.zzw = 0L;
        this.zzx = "";
        this.zza = object;
        this.zzb = zzdzc2;
        this.zzc = zzdxm2;
        this.zze = object = new zzdxk(context);
        this.zzi = object = versionInfoParcel.afmaVersion;
        this.zzk = string2;
        this.zzd = zzdxv2;
        this.zzf = zzdyx2;
        this.zzg = zzdyh2;
        this.zzh = zzdyh3;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzu.zzs().zzg(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzA(String object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                        if (!bl2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                try {
                    long l2;
                    JSONObject jSONObject = new JSONObject(object);
                    object = "isTestMode";
                    String string2 = null;
                    boolean bl3 = jSONObject.optBoolean(object, false);
                    this.zzx(bl3, false);
                    object = "gesture";
                    Object object2 = "NONE";
                    object = jSONObject.optString(object, (String)object2);
                    object2 = zzdxw.class;
                    object = Enum.valueOf(object2, object);
                    object = (zzdxw)((Object)object);
                    this.zzw((zzdxw)((Object)object), false);
                    object = "networkExtras";
                    string2 = "{}";
                    this.zzo = object = jSONObject.optString(object, string2);
                    object = "networkExtrasExpirationSecs";
                    long l3 = Long.MAX_VALUE;
                    this.zzq = l2 = jSONObject.optLong(object, l3);
                    return;
                }
                catch (JSONException jSONException) {
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
    private final JSONObject zzt() {
        synchronized (this) {
            Iterator iterator;
            JSONObject jSONObject;
            try {
                jSONObject = new JSONObject();
                iterator = this.zzl;
                iterator = iterator.entrySet();
                iterator = iterator.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            boolean bl2;
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                Object object = iterator.next();
                object = (Map.Entry)object;
                JSONArray jSONArray = new JSONArray();
                Object object2 = object.getValue();
                object2 = (List)object2;
                object2 = object2.iterator();
                while (bl3 = object2.hasNext()) {
                    Object object3 = object2.next();
                    boolean bl4 = ((zzdxo)(object3 = (zzdxo)object3)).zzg();
                    if (!bl4) continue;
                    object3 = ((zzdxo)object3).zzd();
                    jSONArray.put(object3);
                }
                int n3 = jSONArray.length();
                if (n3 <= 0) continue;
                object = object.getKey();
                object = (String)object;
                jSONObject.put(object, (Object)jSONArray);
            }
            return jSONObject;
        }
    }

    private final void zzu() {
        Object object;
        boolean bl2;
        this.zzu = bl2 = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        List<String> list = zzbep.zzjx;
        CharSequence charSequence = (CharSequence)zzba.zzc().zza((zzbeg)((Object)list));
        boolean bl3 = TextUtils.isEmpty((CharSequence)charSequence);
        Object object2 = ",";
        if (!bl3) {
            charSequence = PreferenceManager.getDefaultSharedPreferences((Context)this.zzj);
            list = Arrays.asList(((String)zzba.zzc().zza((zzbeg)((Object)list))).split((String)object2));
            object = this.zzg;
            ((zzdyh)object).zzb((SharedPreferences)charSequence, list);
        }
        list = zzbep.zzjy;
        charSequence = (CharSequence)zzba.zzc().zza((zzbeg)((Object)list));
        bl3 = TextUtils.isEmpty((CharSequence)charSequence);
        if (!bl3) {
            charSequence = this.zzj.getSharedPreferences("admob", 0);
            object = zzba.zzc();
            list = Arrays.asList(((String)((zzben)object).zza((zzbeg)((Object)list))).split((String)object2));
            object2 = this.zzh;
            ((zzdyh)object2).zzb((SharedPreferences)charSequence, list);
        }
        list = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzn();
        this.zzA((String)((Object)list));
        list = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzo();
        this.zzx = list;
    }

    private final void zzv() {
        zzg zzg2 = com.google.android.gms.ads.internal.zzu.zzo().zzi();
        String string2 = this.zzd();
        zzg2.zzG(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzw(zzdxw zzdxw2, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    block7: {
                        try {
                            zzdxw zzdxw3 = this.zzr;
                            if (zzdxw3 != zzdxw2) break block7;
                            break block8;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    boolean bl3 = this.zzq();
                    if (bl3) {
                        this.zzy();
                    }
                    this.zzr = zzdxw2;
                    boolean bl4 = this.zzq();
                    if (bl4) {
                        this.zzz();
                    }
                    if (bl2) {
                        this.zzv();
                        return;
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
    private final void zzx(boolean bl2, boolean bl3) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    block8: {
                        block6: {
                            try {
                                boolean bl4 = this.zzs;
                                if (bl4 == bl2) break block5;
                                this.zzs = bl2;
                                if (!bl2) break block6;
                                Object object = zzbep.zzjj;
                                zzben zzben2 = zzba.zzc();
                                object = zzben2.zza((zzbeg)object);
                                bl2 = (Boolean)(object = (Boolean)object);
                                if (bl2 && (bl2 = ((zzay)(object = com.google.android.gms.ads.internal.zzu.zzs())).zzl())) break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                            this.zzz();
                            break block8;
                        }
                        if (!(bl2 = this.zzq())) {
                            this.zzy();
                        }
                    }
                    if (bl3) {
                        this.zzv();
                        return;
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
    private final void zzy() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block4: {
                    block5: {
                        try {
                            object = zzdxw.zza;
                            object = this.zzr;
                            int n3 = ((Enum)object).ordinal();
                            int n4 = 1;
                            if (n3 == n4) break block4;
                            n4 = 2;
                            if (n3 == n4) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return;
                    }
                    object = this.zzc;
                    ((zzdxm)object).zzb();
                    return;
                }
                object = this.zzb;
                ((zzdzc)object).zzb();
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
    private final void zzz() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block4: {
                    block5: {
                        try {
                            object = zzdxw.zza;
                            object = this.zzr;
                            int n3 = ((Enum)object).ordinal();
                            int n4 = 1;
                            if (n3 == n4) break block4;
                            n4 = 2;
                            if (n3 == n4) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return;
                    }
                    object = this.zzc;
                    ((zzdxm)object).zzc();
                    return;
                }
                object = this.zzb;
                ((zzdzc)object).zzc();
                return;
            }
            throw throwable2;
        }
    }

    public final zzdxw zza() {
        return this.zzr;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzb(String object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                zzccn zzccn2;
                block5: {
                    boolean bl2;
                    Map map2;
                    block4: {
                        try {
                            zzccn2 = new zzccn();
                            map2 = this.zzm;
                            bl2 = map2.containsKey(object);
                            if (!bl2) break block4;
                            map2 = this.zzm;
                            object = map2.get(object);
                            object = (zzdxo)object;
                            zzccn2.zzc(object);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    map2 = this.zzn;
                    bl2 = map2.containsKey(object);
                    if (!bl2) {
                        map2 = this.zzn;
                        ArrayList arrayList = new ArrayList();
                        map2.put(object, arrayList);
                    }
                    map2 = this.zzn;
                    object = map2.get(object);
                    object = (List)object;
                    object.add(zzccn2);
                }
                return zzccn2;
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
    public final String zzc() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    boolean bl2;
                    Object object;
                    Object object2;
                    try {
                        object2 = zzbep.zziU;
                        object = zzba.zzc();
                        object2 = ((zzben)object).zza((zzbeg)object2);
                        object2 = (Boolean)object2;
                        bl2 = (Boolean)object2;
                        if (!bl2) return "";
                        bl2 = this.zzq();
                        if (!bl2) break block5;
                        long l2 = this.zzq;
                        Clock clock = com.google.android.gms.ads.internal.zzu.zzB();
                        long l3 = clock.currentTimeMillis();
                        long l4 = 1000L;
                        long l7 = l2 - (l3 /= l4);
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 < 0) {
                            this.zzo = object2 = "{}";
                            this.zzq = l2 = Long.MAX_VALUE;
                            return "";
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    object2 = this.zzo;
                    object = "{}";
                    bl2 = ((String)object2).equals(object);
                    if (bl2) return "";
                    return this.zzo;
                }
                return "";
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
    public final String zzd() {
        synchronized (this) {
            try {
                Object object = new JSONObject();
                String string2 = "isTestMode";
                try {
                    boolean bl2 = this.zzs;
                    object.put(string2, bl2);
                    string2 = "gesture";
                    Object object2 = this.zzr;
                    object.put(string2, object2);
                    long l2 = this.zzq;
                    Clock clock = com.google.android.gms.ads.internal.zzu.zzB();
                    long l3 = clock.currentTimeMillis();
                    long l4 = 1000L;
                    long l7 = l2 - (l3 /= l4);
                    long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (l8 <= 0) return object.toString();
                    string2 = "networkExtras";
                    object2 = this.zzo;
                    object.put(string2, object2);
                    string2 = "networkExtrasExpirationSecs";
                    long l12 = this.zzq;
                    object.put(string2, l12);
                    return object.toString();
                }
                catch (JSONException jSONException) {}
                return object.toString();
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zze() {
        Object object = "Server data: ";
        Object object2 = "afma-sdk-a-v";
        synchronized (this) {
            Throwable throwable2;
            block14: {
                JSONObject jSONObject;
                block16: {
                    JSONException jSONException2;
                    Object object3;
                    block15: {
                        boolean bl2;
                        String string2;
                        block17: {
                            jSONObject = new JSONObject();
                            object3 = "platform";
                            string2 = "ANDROID";
                            jSONObject.put((String)object3, (Object)string2);
                            object3 = this.zzk;
                            bl2 = TextUtils.isEmpty((CharSequence)object3);
                            if (bl2) break block17;
                            object3 = "sdkVersion";
                            string2 = this.zzk;
                            StringBuilder stringBuilder = new StringBuilder((String)object2);
                            stringBuilder.append(string2);
                            object2 = stringBuilder.toString();
                            jSONObject.put((String)object3, object2);
                            break block17;
                            catch (Throwable throwable2) {
                                break block14;
                            }
                            catch (JSONException jSONException2) {
                                break block15;
                            }
                        }
                        object2 = "internalSdkVersion";
                        object3 = this.zzi;
                        jSONObject.put((String)object2, object3);
                        object2 = "osVersion";
                        object3 = Build.VERSION.RELEASE;
                        jSONObject.put((String)object2, object3);
                        object2 = "adapters";
                        object3 = this.zzd;
                        object3 = ((zzdxv)object3).zza();
                        jSONObject.put((String)object2, object3);
                        object2 = zzbep.zzju;
                        object3 = zzba.zzc();
                        object2 = ((zzben)object3).zza((zzbeg)object2);
                        object2 = (Boolean)object2;
                        int n3 = ((Boolean)object2).booleanValue();
                        if (n3) {
                            object2 = com.google.android.gms.ads.internal.zzu.zzo();
                            bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((zzcby)object2).zzn()));
                            if (!bl2) {
                                object3 = "plugin";
                                jSONObject.put((String)object3, object2);
                            }
                        }
                        long l2 = this.zzq;
                        object2 = com.google.android.gms.ads.internal.zzu.zzB();
                        long l3 = object2.currentTimeMillis();
                        long l4 = 1000L;
                        long l7 = l2 - (l3 /= l4);
                        n3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (n3 < 0) {
                            this.zzo = object2 = "{}";
                        }
                        object2 = "networkExtras";
                        object3 = this.zzo;
                        jSONObject.put((String)object2, object3);
                        object2 = "adSlots";
                        object3 = this.zzt();
                        jSONObject.put((String)object2, object3);
                        object2 = "appInfo";
                        object3 = this.zze;
                        object3 = ((zzdxk)object3).zza();
                        jSONObject.put((String)object2, object3);
                        object2 = com.google.android.gms.ads.internal.zzu.zzo();
                        object2 = ((zzcby)object2).zzi();
                        object2 = object2.zzh();
                        object2 = ((zzcbs)object2).zzc();
                        bl2 = TextUtils.isEmpty((CharSequence)object2);
                        if (!bl2) {
                            object3 = "cld";
                            string2 = new JSONObject((String)object2);
                            jSONObject.put((String)object3, (Object)string2);
                        }
                        object2 = zzbep.zzjk;
                        object3 = zzba.zzc();
                        object2 = ((zzben)object3).zza((zzbeg)object2);
                        n3 = (int)(((Boolean)(object2 = (Boolean)object2)).booleanValue() ? 1 : 0);
                        if (n3 && (object2 = this.zzp) != null) {
                            object2 = object2.toString();
                            object3 = new StringBuilder((String)object);
                            ((StringBuilder)object3).append((String)object2);
                            object = ((StringBuilder)object3).toString();
                            com.google.android.gms.ads.internal.util.client.zzm.zze((String)object);
                            object = "serverData";
                            object2 = this.zzp;
                            jSONObject.put((String)object, object2);
                        }
                        object = zzbep.zzjj;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        boolean bl3 = (Boolean)(object = (Boolean)object);
                        if (bl3) {
                            object = "openAction";
                            object2 = this.zzv;
                            jSONObject.put((String)object, object2);
                            object = "gesture";
                            object2 = this.zzr;
                            jSONObject.put((String)object, object2);
                        }
                        object = "isGamRegisteredTestDevice";
                        object2 = com.google.android.gms.ads.internal.zzu.zzs();
                        n3 = (int)(((zzay)object2).zzl() ? 1 : 0);
                        jSONObject.put((String)object, n3 != 0);
                        object = "isSimulator";
                        com.google.android.gms.ads.internal.zzu.zzp();
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        n3 = com.google.android.gms.ads.internal.util.client.zzf.zzs();
                        jSONObject.put((String)object, n3 != 0);
                        object = zzbep.zzjw;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        object = (Boolean)object;
                        bl3 = (Boolean)object;
                        if (bl3) {
                            object = "uiStorage";
                            object3 = this.zzx;
                            object2 = new JSONObject((String)object3);
                            jSONObject.put((String)object, object2);
                        }
                        object = zzbep.zzjy;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        bl3 = TextUtils.isEmpty((CharSequence)(object = (CharSequence)object));
                        if (!bl3) {
                            object = "gmaDisk";
                            object2 = this.zzh;
                            object2 = ((zzdyh)object2).zza();
                            jSONObject.put((String)object, object2);
                        }
                        object = zzbep.zzjx;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        bl3 = TextUtils.isEmpty((CharSequence)(object = (CharSequence)object));
                        if (!bl3) {
                            object = "userDisk";
                            object2 = this.zzg;
                            object2 = ((zzdyh)object2).zza();
                            jSONObject.put((String)object, object2);
                        }
                        break block16;
                    }
                    object2 = "Inspector.toJson";
                    object3 = com.google.android.gms.ads.internal.zzu.zzo();
                    ((zzcby)object3).zzv(jSONException2, (String)object2);
                    object2 = "Ad inspector encountered an error";
                    com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object2, jSONException2);
                }
                return jSONObject;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(String object, zzdxo zzdxo2) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block9: {
                    int n3;
                    int n4;
                    Object object2;
                    Object object3;
                    try {
                        object3 = zzbep.zziU;
                        object2 = zzba.zzc();
                        object3 = ((zzben)object2).zza((zzbeg)object3);
                        object3 = (Boolean)object3;
                        n4 = ((Boolean)object3).booleanValue();
                        if (n4 == 0 || (n4 = this.zzq()) == 0) break block9;
                        n4 = this.zzt;
                        object2 = zzbep.zziW;
                        zzben zzben2 = zzba.zzc();
                        object2 = zzben2.zza((zzbeg)object2);
                        n3 = (Integer)(object2 = (Integer)object2);
                        if (n4 >= n3) {
                            object = "Maximum number of ad requests stored reached. Dropping the current request.";
                            com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    object3 = this.zzl;
                    n4 = (int)(object3.containsKey(object) ? 1 : 0);
                    if (n4 == 0) {
                        object3 = this.zzl;
                        object2 = new ArrayList();
                        object3.put(object, object2);
                    }
                    this.zzt = n4 = this.zzt + 1;
                    object3 = this.zzl;
                    object = object3.get(object);
                    object = (List)object;
                    object.add(zzdxo2);
                    object = zzbep.zzjs;
                    object3 = zzba.zzc();
                    object = ((zzben)object3).zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (bl2) {
                        object = zzdxo2.zzc();
                        object3 = this.zzm;
                        object3.put(object, zzdxo2);
                        object3 = this.zzn;
                        n4 = (int)(object3.containsKey(object) ? 1 : 0);
                        if (n4 != 0) {
                            object3 = this.zzn;
                            object = object3.get(object);
                            object = (List)object;
                            object3 = object.iterator();
                            while (true) {
                                if ((n3 = (int)(object3.hasNext() ? 1 : 0)) == 0) {
                                    object.clear();
                                    return;
                                }
                                object2 = object3.next();
                                object2 = (zzccn)object2;
                                ((zzccn)object2).zzc(zzdxo2);
                            }
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
    public final void zzg() {
        Object object = zzbep.zziU;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        object = zzbep.zzjj;
        zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2 && (bl2 = (object = com.google.android.gms.ads.internal.zzu.zzo().zzi()).zzR())) {
            this.zzu();
            return;
        }
        object = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzn();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) return;
        try {
            zzben2 = new JSONObject((String)object);
            object = "isTestMode";
            bl2 = zzben2.optBoolean((String)object, false);
            if (!bl2) return;
            this.zzu();
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zzh(zzda var1_1, zzdxz var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 45->55)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(String string2, long l2) {
        synchronized (this) {
            this.zzo = string2;
            this.zzq = l2;
            this.zzv();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(String object) {
        synchronized (this) {
            this.zzx = object;
            object = com.google.android.gms.ads.internal.zzu.zzo();
            object = ((zzcby)object).zzi();
            String string2 = this.zzx;
            object.zzH(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(long l2) {
        synchronized (this) {
            long l3;
            this.zzw = l3 = this.zzw + l2;
            return;
        }
    }

    public final void zzl(boolean bl2) {
        block6: {
            block7: {
                block5: {
                    boolean bl3 = this.zzu;
                    if (bl3) break block5;
                    if (!bl2) break block6;
                    this.zzu();
                    break block7;
                }
                if (!bl2) break block6;
            }
            bl2 = this.zzs;
            if (!bl2) {
                this.zzz();
                return;
            }
        }
        if (!(bl2 = this.zzq())) {
            this.zzy();
        }
    }

    public final void zzm(zzdxw zzdxw2) {
        this.zzw(zzdxw2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(JSONObject jSONObject) {
        synchronized (this) {
            this.zzp = jSONObject;
            return;
        }
    }

    public final void zzo(boolean bl2) {
        boolean bl3 = this.zzu;
        if (!bl3 && bl2) {
            this.zzu();
        }
        this.zzx(bl2, true);
    }

    public final boolean zzp() {
        JSONObject jSONObject = this.zzp;
        return jSONObject != null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzq() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = zzbep.zzjj;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (!bl2) return this.zzs;
                    bl2 = this.zzs;
                    if (bl2) return true;
                    object = com.google.android.gms.ads.internal.zzu.zzs();
                    bl2 = ((zzay)object).zzl();
                    if (!bl2) return false;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzr() {
        synchronized (this) {
            return this.zzs;
        }
    }

    public final boolean zzs() {
        long l2 = this.zzw;
        Object object = zzbep.zzjp;
        zzben zzben2 = zzba.zzc();
        object = (Long)zzben2.zza((zzbeg)object);
        long l3 = (Long)object;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object2 < 0;
    }
}

