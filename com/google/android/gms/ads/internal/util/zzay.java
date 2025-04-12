/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzav;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzfuv;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzay {
    protected String zza;
    private final Object zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;
    private zzdya zzg;

    public zzay() {
        Object object;
        this.zzb = object = new Object();
        this.zzc = object = "";
        this.zzd = object;
        this.zze = false;
        this.zzf = false;
        this.zza = object;
    }

    public static final String zzo(Context object, String string2, String object2) {
        block14: {
            TimeoutException timeoutException2;
            Object object3;
            boolean bl2;
            block13: {
                InterruptedException interruptedException2;
                block12: {
                    Object object4 = new HashMap();
                    object2 = zzu.zzp().zzc((Context)object, (String)object2);
                    ((HashMap)object4).put("User-Agent", object2);
                    object2 = new zzbq((Context)object);
                    object = ((zzbq)object2).zzb(0, string2, (Map)object4, null);
                    bl2 = true;
                    object4 = zzbep.zzeL;
                    object3 = zzba.zzc();
                    object4 = ((zzben)object3).zza((zzbeg)object4);
                    object4 = (Integer)object4;
                    int n3 = (Integer)object4;
                    long l2 = n3;
                    object4 = TimeUnit.MILLISECONDS;
                    object4 = object.get(l2, (TimeUnit)((Object)object4));
                    try {
                        return (String)object4;
                    }
                    catch (Exception exception) {
                    }
                    catch (InterruptedException interruptedException2) {
                        break block12;
                    }
                    catch (TimeoutException timeoutException2) {
                        break block13;
                    }
                    string2 = String.valueOf(string2);
                    object2 = "Error retrieving a response from: ";
                    string2 = ((String)object2).concat(string2);
                    zzm.zzh(string2, exception);
                    break block14;
                }
                string2 = String.valueOf(string2);
                object3 = "Interrupted while retrieving a response from: ";
                string2 = ((String)object3).concat(string2);
                zzm.zzh(string2, interruptedException2);
                object.cancel(bl2);
                break block14;
            }
            string2 = String.valueOf(string2);
            object3 = "Timeout while retrieving a response from: ";
            string2 = ((String)object3).concat(string2);
            zzm.zzh(string2, timeoutException2);
            object.cancel(bl2);
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Uri zzp(Context var1_1, String var2_4, String var3_5, String var4_6) {
        var2_4 = Uri.parse((String)var2_4).buildUpon();
        var5_7 = this.zzb;
        synchronized (var5_7) {
            var6_8 = this.zzc;
            var7_9 = TextUtils.isEmpty((CharSequence)var6_8);
            if (!var7_9) ** GOTO lbl47
            zzu.zzp();
            var6_8 = "debug_signals_id.txt";
            var6_8 = var1_1.openFileInput((String)var6_8);
            var9_11 = true;
            var6_8 = IOUtils.readInputStreamFully((InputStream)var6_8, var9_11);
            var10_12 = "UTF-8";
            var8_10 = new String((byte[])var6_8, var10_12);
            ** GOTO lbl24
            {
                catch (Throwable var1_2) {
                    ** break block10
                }
                catch (IOException v0) {}
                var6_8 = "Error reading from internal storage.";
                {
                    zzm.zze((String)var6_8);
                    var8_10 = "";
lbl24:
                    // 2 sources

                    this.zzc = var8_10;
                    var7_9 = TextUtils.isEmpty((CharSequence)var8_10);
                    if (var7_9) {
                        zzu.zzp();
                        var6_8 = UUID.randomUUID();
                        this.zzc = var6_8 = var6_8.toString();
                        zzu.zzp();
                        var6_8 = this.zzc;
                        var8_10 = "debug_signals_id.txt";
                        var9_11 = false;
                        var10_12 = null;
                        try {
                            var1_1 = var1_1.openFileOutput(var8_10, 0);
                            var8_10 = "UTF-8";
                            var6_8 = var6_8.getBytes(var8_10);
                            var1_1.write((byte[])var6_8);
                            var1_1.close();
                        }
                        catch (Exception var1_3) {
                            var6_8 = "Error writing to file in internal storage.";
                            zzm.zzh((String)var6_8, var1_3);
                        }
                    }
lbl47:
                    // 5 sources

                    var1_1 = this.zzc;
                }
            }
        }
        var2_4.appendQueryParameter("linkedDeviceId", (String)var1_1);
        var2_4.appendQueryParameter("adSlotPath", var3_5);
        var2_4.appendQueryParameter("afmaVersion", var4_6);
        return var2_4.build();
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }

    public final zzdya zza() {
        return this.zzg;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzd;
        }
    }

    public final void zzc(Context object) {
        Object object2 = zzbep.zzjj;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && (object2 = this.zzg) != null) {
            object3 = new zzav(this, (Context)object);
            object = zzdxz.zzd;
            ((zzdya)object2).zzh((zzda)object3, (zzdxz)((Object)object));
        }
    }

    public final void zzd(Context context, String string2, String string3) {
        zzu.zzp();
        Object object = zzbep.zzeH;
        object = (String)zzba.zzc().zza((zzbeg)object);
        string2 = this.zzp(context, (String)object, string2, string3);
        zzt.zzU(context, (Uri)string2);
    }

    public final void zze(Context context, String string2, String string3, String string4) {
        Object object = zzbep.zzeK;
        object = (String)zzba.zzc().zza((zzbeg)object);
        string4 = this.zzp(context, (String)object, string4, string2).buildUpon();
        string4.appendQueryParameter("debugData", string3);
        zzu.zzp();
        string3 = string4.build().toString();
        zzt.zzL(context, string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(boolean bl2) {
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.zzf = bl2;
                        Object object2 = zzbep.zzjj;
                        zzben zzben2 = zzba.zzc();
                        object2 = zzben2.zza((zzbeg)object2);
                        object2 = (Boolean)object2;
                        boolean bl3 = (Boolean)object2;
                        if (!bl3) break block3;
                        object2 = zzu.zzo();
                        object2 = ((zzcby)object2).zzi();
                        object2.zzC(bl2);
                        object2 = this.zzg;
                        if (object2 == null) break block3;
                        ((zzdya)object2).zzl(bl2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzg(zzdya zzdya2) {
        this.zzg = zzdya2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(boolean bl2) {
        Object object = this.zzb;
        synchronized (object) {
            this.zze = bl2;
            return;
        }
    }

    public final void zzi(Context context, String string2, boolean bl2, boolean bl3) {
        boolean bl4 = context instanceof Activity;
        if (!bl4) {
            zzm.zzi("Can not create dialog without Activity Context");
            return;
        }
        zzfuv zzfuv2 = zzt.zza;
        zzax zzax2 = new zzax(this, context, string2, bl2, bl3);
        zzfuv2.post(zzax2);
    }

    public final boolean zzj(Context object, String string2, String object2) {
        Object object3 = zzbep.zzeJ;
        zzben zzben2 = zzba.zzc();
        object3 = (String)zzben2.zza((zzbeg)object3);
        object3 = this.zzp((Context)object, (String)object3, string2, (String)object2).toString();
        object = zzay.zzo((Context)object, (String)object3, (String)object2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = false;
        object3 = null;
        if (bl2) {
            zzm.zze("Not linked for debug signals.");
            return false;
        }
        object = ((String)object).trim();
        try {
            object2 = new JSONObject((String)object);
            object = "debug_mode";
        }
        catch (JSONException jSONException) {
            zzm.zzk("Fail to get debug mode response json.", jSONException);
            return false;
        }
        object = object2.optString((String)object);
        boolean bl4 = "1".equals(object);
        this.zzf(bl4);
        object2 = zzbep.zzjj;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzu.zzo().zzi();
            bl3 = true;
            if (bl3 != bl4) {
                string2 = "";
            }
            object2.zzB(string2);
        }
        return bl4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzk(Context object, String object2, String object3) {
        JSONException jSONException2;
        block10: {
            boolean bl2;
            block8: {
                Object object4;
                Object object5 = zzbep.zzeI;
                Object object6 = zzba.zzc();
                object5 = (String)((zzben)object6).zza((zzbeg)object5);
                object5 = this.zzp((Context)object, (String)object5, (String)object2, (String)object3).toString();
                object = zzay.zzo((Context)object, (String)object5, (String)object3);
                boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                object5 = null;
                if (bl3) {
                    zzm.zze("Not linked for in app preview.");
                    return false;
                }
                object = ((String)object).trim();
                try {
                    object3 = new JSONObject((String)object);
                    object = "gct";
                    object = object3.optString((String)object);
                    object6 = "status";
                    object3 = object3.optString((String)object6);
                    this.zza = object3;
                    object3 = zzbep.zzjj;
                    object6 = zzba.zzc();
                    object3 = ((zzben)object6).zza((zzbeg)object3);
                    object3 = (Boolean)object3;
                    bl3 = (Boolean)object3;
                    bl2 = true;
                    if (!bl3) break block8;
                    object3 = "0";
                    object4 = this.zza;
                    bl3 = ((String)object3).equals(object4);
                    if (bl3 || (bl3 = ((String)(object3 = "2")).equals(object4 = this.zza))) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object3 = null;
                    }
                }
                catch (JSONException jSONException2) {
                    break block10;
                }
                this.zzf(bl3);
                object4 = zzu.zzo();
                object4 = ((zzcby)object4).zzi();
                if (!bl3) {
                    object2 = "";
                }
                object4.zzB((String)object2);
            }
            object2 = this.zzb;
            synchronized (object2) {
                this.zzd = object;
                return bl2;
            }
        }
        zzm.zzk("Fail to get in app preview response json.", jSONException2);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzl() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzf;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzm() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zze;
        }
    }

    public final boolean zzn(Context context, String string2, String string3, String string4) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2 && (bl2 = this.zzm())) {
            zzm.zze("Sending troubleshooting signals to the server.");
            this.zze(context, string2, string3, string4);
            return true;
        }
        return false;
    }
}

