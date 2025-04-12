/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.media.AudioManager
 *  android.os.PowerManager
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbaj;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzcqz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcqw
implements zzbqa {
    private final Context zza;
    private final zzbaj zzb;
    private final PowerManager zzc;

    public zzcqw(Context context, zzbaj zzbaj2) {
        this.zza = context;
        this.zzb = zzbaj2;
        context = (PowerManager)context.getSystemService("power");
        this.zzc = context;
    }

    public final JSONObject zza(zzcqz object) {
        block13: {
            JSONObject jSONObject;
            JSONArray jSONArray;
            block12: {
                boolean bl2;
                int n3;
                float f5;
                Object object2;
                block11: {
                    jSONArray = new JSONArray();
                    jSONObject = new JSONObject();
                    object2 = object.zzf;
                    if (object2 != null) break block11;
                    object = new JSONObject();
                    break block12;
                }
                Object object3 = this.zzb.zzd();
                if (object3 == null) break block13;
                boolean bl3 = ((zzbam)object2).zza;
                JSONObject jSONObject2 = new JSONObject();
                Object object4 = this.zzb.zzb();
                object4 = jSONObject2.put("afmaVersion", object4);
                Object object5 = this.zzb.zzd();
                object4 = object4.put("activeViewJSON", object5);
                long l2 = object.zzd;
                object4 = object4.put("timestamp", l2);
                object5 = this.zzb.zza();
                object4 = object4.put("adFormat", object5);
                object5 = this.zzb.zzc();
                object4 = object4.put("hashCode", object5);
                int n32 = 0;
                object4 = object4.put("isMraid", false).put("isStopped", false);
                boolean bl4 = object.zzb;
                object4 = object4.put("isPaused", bl4);
                boolean bl5 = this.zzb.zze();
                object4 = object4.put("isNative", bl5);
                boolean bl6 = this.zzc.isInteractive();
                object4 = object4.put("isScreenOn", bl6);
                boolean bl7 = zzu.zzr().zze();
                String string2 = "appMuted";
                object4 = object4.put(string2, bl7);
                double d2 = zzu.zzr().zza();
                object4 = object4.put("appVolume", d2);
                float f6 = zzac.zzb(this.zza.getApplicationContext());
                d2 = f6;
                String string3 = "deviceVolume";
                object4.put(string3, d2);
                object4 = zzbep.zzfQ;
                object5 = zzba.zzc();
                object4 = (Boolean)((zzben)object5).zza((zzbeg)object4);
                boolean bl8 = (Boolean)object4;
                if (bl8) {
                    object4 = this.zza.getApplicationContext();
                    object5 = "audio";
                    if ((object4 = (AudioManager)object4.getSystemService((String)object5)) == null) {
                        boolean bl9 = false;
                        f5 = 0.0f;
                        object4 = null;
                    } else {
                        int n4 = object4.getMode();
                        object4 = n4;
                    }
                    if (object4 != null) {
                        object5 = "audioMode";
                        jSONObject2.put((String)object5, object4);
                    }
                }
                object4 = new Rect();
                object5 = ((WindowManager)this.zza.getSystemService("window")).getDefaultDisplay();
                ((Rect)object4).right = n32 = object5.getWidth();
                ((Rect)object4).bottom = n3 = object5.getHeight();
                object4 = this.zza.getResources().getDisplayMetrics();
                int n7 = ((zzbam)object2).zzb;
                object3 = jSONObject2.put("windowVisibility", n7).put("isAttachedToWindow", bl3);
                object5 = new JSONObject();
                n32 = ((zzbam)object2).zzc.top;
                string3 = "top";
                object5 = object5.put(string3, n32);
                n32 = ((zzbam)object2).zzc.bottom;
                String string4 = "bottom";
                object5 = object5.put(string4, n32);
                n32 = ((zzbam)object2).zzc.left;
                String string5 = "left";
                object5 = object5.put(string5, n32);
                n32 = ((zzbam)object2).zzc.right;
                String string6 = "right";
                object5 = object5.put(string6, n32);
                object3 = object3.put("viewBox", object5);
                object5 = new JSONObject();
                n32 = ((zzbam)object2).zzd.top;
                object5 = object5.put(string3, n32);
                n32 = ((zzbam)object2).zzd.bottom;
                object5 = object5.put(string4, n32);
                n32 = ((zzbam)object2).zzd.left;
                object5 = object5.put(string5, n32);
                n32 = ((zzbam)object2).zzd.right;
                object5 = object5.put(string6, n32);
                object3 = object3.put("adBox", object5);
                object5 = new JSONObject();
                n32 = ((zzbam)object2).zze.top;
                object5 = object5.put(string3, n32);
                n32 = ((zzbam)object2).zze.bottom;
                object5 = object5.put(string4, n32);
                n32 = ((zzbam)object2).zze.left;
                object5 = object5.put(string5, n32);
                n32 = ((zzbam)object2).zze.right;
                object5 = object5.put(string6, n32);
                object3 = object3.put("globalVisibleBox", object5);
                boolean bl10 = ((zzbam)object2).zzf;
                object3 = object3.put("globalVisibleBoxVisible", bl10);
                object5 = new JSONObject();
                n32 = ((zzbam)object2).zzg.top;
                object5 = object5.put(string3, n32);
                n32 = ((zzbam)object2).zzg.bottom;
                object5 = object5.put(string4, n32);
                n32 = ((zzbam)object2).zzg.left;
                object5 = object5.put(string5, n32);
                n32 = ((zzbam)object2).zzg.right;
                object5 = object5.put(string6, n32);
                object3 = object3.put("localVisibleBox", object5);
                boolean bl11 = ((zzbam)object2).zzh;
                object3 = object3.put("localVisibleBoxVisible", bl11);
                object5 = new JSONObject();
                n32 = ((zzbam)object2).zzi.top;
                object5 = object5.put(string3, n32);
                n32 = ((zzbam)object2).zzi.bottom;
                object5 = object5.put(string4, n32);
                n32 = ((zzbam)object2).zzi.left;
                object5 = object5.put(string5, n32);
                n32 = ((zzbam)object2).zzi.right;
                object5 = object5.put(string6, n32);
                object3 = object3.put("hitBox", object5);
                f5 = ((DisplayMetrics)object4).density;
                double d5 = f5;
                string2 = "screenDensity";
                object3.put(string2, d5);
                bl3 = object.zza;
                jSONObject2.put("isVisible", bl3);
                object3 = zzbep.zzbq;
                object4 = zzba.zzc();
                object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
                bl3 = (Boolean)object3;
                if (bl3) {
                    object3 = new JSONArray();
                    object2 = ((zzbam)object2).zzk;
                    if (object2 != null) {
                        int n8;
                        object2 = object2.iterator();
                        while ((n8 = object2.hasNext()) != 0) {
                            object4 = (Rect)object2.next();
                            object5 = new JSONObject();
                            n32 = ((Rect)object4).top;
                            object5 = object5.put(string3, n32);
                            n32 = ((Rect)object4).bottom;
                            object5 = object5.put(string4, n32);
                            n32 = ((Rect)object4).left;
                            object5 = object5.put(string5, n32);
                            n8 = ((Rect)object4).right;
                            object4 = object5.put(string6, n8);
                            object3.put(object4);
                        }
                    }
                    object2 = "scrollableContainerBoxes";
                    jSONObject2.put((String)object2, object3);
                }
                if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = object.zze)))) {
                    object = "doneReasonCode";
                    object2 = "u";
                    jSONObject2.put((String)object, object2);
                }
                object = jSONObject2;
            }
            jSONArray.put(object);
            jSONObject.put("units", (Object)jSONArray);
            return jSONObject;
        }
        object = new JSONException("Active view Info cannot be null.");
        throw object;
    }
}

