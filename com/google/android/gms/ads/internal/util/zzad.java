/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.Bundle
 *  android.preference.PreferenceManager
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfvg;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyt;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzad {
    public static Bundle zza(Context context, String string2, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences((Context)context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzad.zzb(context, string2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bundle zzb(Context context, String string2) {
        void var3_7;
        block19: {
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                try {
                    JSONArray jSONArray = new JSONArray(string2);
                    break block19;
                }
                catch (JSONException jSONException) {
                    String string3 = "JSON parsing error";
                    zzm.zzf(string3, jSONException);
                }
            }
            bl2 = false;
            Object var3_5 = null;
        }
        if (var3_7 == null) {
            return Bundle.EMPTY;
        }
        string2 = new Bundle();
        int n3 = 0;
        while (true) {
            block22: {
                Object object;
                String string4;
                int n4;
                block23: {
                    float f5;
                    block25: {
                        block24: {
                            int n7;
                            int n8;
                            Object object2;
                            block20: {
                                block21: {
                                    if (n3 >= (n4 = var3_7.length())) {
                                        return string2;
                                    }
                                    JSONObject jSONObject = var3_7.optJSONObject(n3);
                                    string4 = jSONObject.optString("bk");
                                    object = jSONObject.optString("sk");
                                    object2 = "type";
                                    n4 = jSONObject.optInt((String)object2, -1);
                                    n8 = 2;
                                    n7 = 1;
                                    if (n4 == 0) break block21;
                                    if (n4 != n7) {
                                        if (n4 != n8) {
                                            n4 = 0;
                                            f5 = 0.0f;
                                            jSONObject = null;
                                            break block20;
                                        } else {
                                            n4 = 3;
                                            f5 = 4.2E-45f;
                                        }
                                        break block20;
                                    } else {
                                        n4 = 2;
                                        f5 = 2.8E-45f;
                                    }
                                    break block20;
                                }
                                n4 = 1;
                                f5 = Float.MIN_VALUE;
                            }
                            int n10 = TextUtils.isEmpty((CharSequence)string4);
                            if (n10 != 0 || (n10 = TextUtils.isEmpty((CharSequence)object)) != 0 || n4 == 0) break block22;
                            zzfyt zzfyt2 = zzfyt.zzc(zzfxr.zzc('/'));
                            object = zzfyt2.zzf((CharSequence)object);
                            n10 = object.size();
                            if (n10 > n8 || (n8 = (int)(object.isEmpty() ? 1 : 0)) != 0) {
                                object = null;
                            } else {
                                n8 = object.size();
                                if (n8 == n7) {
                                    object2 = PreferenceManager.getDefaultSharedPreferences((Context)context);
                                    object = (String)object.get(0);
                                } else {
                                    object2 = (String)object.get(0);
                                    object2 = context.getSharedPreferences((String)object2, 0);
                                    object = (String)object.get(n7);
                                }
                                object2 = object2.getAll();
                                object = object2.get(object);
                            }
                            if (object == null) break block22;
                            if ((n4 += -1) == 0) break block23;
                            if (n4 == n7) break block24;
                            n4 = object instanceof Boolean;
                            if (n4 != 0) {
                                object = (Boolean)object;
                                n4 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                                string2.putBoolean(string4, n4 != 0);
                            }
                            break block22;
                        }
                        n4 = object instanceof Integer;
                        if (n4 == 0) break block25;
                        object = (Integer)object;
                        n4 = (Integer)object;
                        string2.putInt(string4, n4);
                        break block22;
                    }
                    n4 = object instanceof Long;
                    if (n4 != 0) {
                        object = (Long)object;
                        long l2 = (Long)object;
                        string2.putLong(string4, l2);
                        break block22;
                    } else {
                        n4 = object instanceof Float;
                        if (n4 != 0) {
                            object = (Float)object;
                            f5 = ((Float)object).floatValue();
                            string2.putFloat(string4, f5);
                        }
                    }
                    break block22;
                }
                n4 = object instanceof String;
                if (n4 != 0) {
                    object = (String)object;
                    string2.putString(string4, (String)object);
                }
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzc(Context object) {
        IOException iOException2;
        block5: {
            boolean bl2;
            zzben zzben2;
            Object object2;
            block4: {
                object2 = zzbep.zzgs;
                zzben2 = zzba.zzc();
                object2 = (Boolean)zzben2.zza((zzbeg)object2);
                bl2 = (Boolean)object2;
                if (bl2 && object != null) {
                    object2 = "OfflineUpload.db";
                    object.deleteDatabase((String)object2);
                }
                try {
                    object2 = zzfvg.zzj((Context)object);
                    object = zzfvh.zzi((Context)object);
                    ((zzfvg)object2).zzk();
                    ((zzfvg)object2).zzl();
                    ((zzfvh)object).zzj();
                    object2 = zzbep.zzcX;
                    zzben2 = zzba.zzc();
                    object2 = zzben2.zza((zzbeg)object2);
                    object2 = (Boolean)object2;
                    bl2 = (Boolean)object2;
                    if (!bl2) break block4;
                    ((zzfvh)object).zzk();
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            object2 = zzbep.zzcY;
            zzben2 = zzba.zzc();
            object2 = zzben2.zza((zzbeg)object2);
            bl2 = (Boolean)(object2 = (Boolean)object2);
            if (bl2) {
                ((zzfvh)object).zzl();
            }
            return;
        }
        zzu.zzo().zzw(iOException2, "clearStorageOnIdlessMode");
    }
}

