/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.view.Display
 *  android.view.WindowManager
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzfpz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfpy {
    static float zza;
    private static WindowManager zzb;
    private static final String[] zzc;

    static {
        zzc = new String[]{"x", "y", "width", "height"};
        zza = Resources.getSystem().getDisplayMetrics().density;
    }

    public static JSONObject zza(int n3, int n4, int n7, int n8) {
        JSONObject jSONObject = new JSONObject();
        String string2 = "x";
        float f5 = n3;
        float f6 = zza;
        double d2 = f5 /= f6;
        jSONObject.put(string2, d2);
        String string3 = "y";
        float f7 = n4;
        float f8 = zza;
        double d5 = f7 /= f8;
        jSONObject.put(string3, d5);
        string3 = "width";
        f7 = n7;
        float f11 = zza;
        double d7 = f7 /= f11;
        jSONObject.put(string3, d7);
        string3 = "height";
        f7 = n8;
        f11 = zza;
        d7 = f7 /= f11;
        try {
            jSONObject.put(string3, d7);
        }
        catch (JSONException jSONException) {
            String string4 = "Error with creating viewStateObject";
            zzfpz.zza(string4, (Exception)((Object)jSONException));
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String string2) {
        String string3 = "adSessionId";
        try {
            jSONObject.put(string3, (Object)string2);
            return;
        }
        catch (JSONException jSONException) {
            zzfpz.zza("Error with setting ad session id", (Exception)((Object)jSONException));
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArray;
        block7: {
            String string2 = "childViews";
            try {
                jSONArray = jSONObject.optJSONArray(string2);
                if (jSONArray != null) break block7;
            }
            catch (JSONException jSONException) {
                return;
            }
            jSONArray = new JSONArray();
            jSONObject.put(string2, (Object)jSONArray);
        }
        jSONArray.put((Object)jSONObject2);
    }

    public static void zzd(Context context) {
        if (context != null) {
            float f5;
            zza = f5 = context.getResources().getDisplayMetrics().density;
            String string2 = "window";
            context = (WindowManager)context.getSystemService(string2);
            zzb = context;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void zze(JSONObject jSONObject, String string2, Object object) {
        void var0_3;
        try {
            jSONObject.put(string2, object);
            return;
        }
        catch (JSONException jSONException) {
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        object = new StringBuilder("JSONException during JSONObject.put for name [");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("]");
        zzfpz.zza(((StringBuilder)object).toString(), (Exception)var0_3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void zzf(JSONObject jSONObject) {
        String string2;
        float f5;
        float f6;
        WindowManager windowManager = zzb;
        if (windowManager != null) {
            windowManager = new Point(0, 0);
            Display display = zzb.getDefaultDisplay();
            display.getRealSize((Point)windowManager);
            int n3 = windowManager.x;
            f6 = n3;
            float f7 = zza;
            f6 /= f7;
            int n4 = windowManager.y;
            f5 = (float)n4 / f7;
        } else {
            boolean bl2 = false;
            f6 = 0.0f;
            Object var2_3 = null;
            boolean bl3 = false;
            f5 = 0.0f;
            windowManager = null;
        }
        String string3 = "width";
        double d2 = f6;
        try {
            jSONObject.put(string3, d2);
            string2 = "height";
        }
        catch (JSONException jSONException) {
            return;
        }
        double d5 = f5;
        jSONObject.put(string2, d5);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        block17: {
            boolean bl2 = true;
            if (jSONObject == null && jSONObject2 == null) {
                return bl2;
            }
            if (jSONObject != null && jSONObject2 != null) {
                Object object;
                int n3;
                int n4;
                Object object2 = zzc;
                String string2 = null;
                for (n4 = 0; n4 < (n3 = 4); ++n4) {
                    double d2;
                    object = object2[n4];
                    double d5 = jSONObject.optDouble((String)object);
                    double d7 = d5 - (d2 = jSONObject2.optDouble((String)object));
                    n3 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
                    if (n3 == 0) {
                        continue;
                    }
                    break block17;
                }
                object2 = "adSessionId";
                string2 = "";
                object = jSONObject.optString((String)object2, string2);
                boolean n7 = ((String)object).equals(object2 = jSONObject2.optString((String)object2, string2));
                if (n7) {
                    object2 = "noOutputDevice";
                    n3 = (int)(jSONObject.optBoolean((String)object2) ? 1 : 0);
                    object = n3 != 0;
                    boolean bl3 = ((Boolean)object).equals(object2 = Boolean.valueOf(jSONObject2.optBoolean((String)object2)));
                    if (bl3) {
                        object2 = "hasWindowFocus";
                        n3 = jSONObject.optBoolean((String)object2);
                        object = n3 != 0;
                        boolean bl4 = ((Boolean)object).equals(object2 = Boolean.valueOf(jSONObject2.optBoolean((String)object2)));
                        if (bl4) {
                            object2 = "isFriendlyObstructionFor";
                            object = jSONObject.optJSONArray((String)object2);
                            object2 = jSONObject2.optJSONArray((String)object2);
                            if (object != null || object2 != null) {
                                int n8 = zzfpy.zzh((JSONArray)object, object2);
                                if (n8 != 0) {
                                    int n10;
                                    for (n8 = 0; n8 < (n10 = object.length()); ++n8) {
                                        String string3;
                                        String string4 = object.optString(n8, string2);
                                        n10 = (int)(string4.equals(string3 = object2.optString(n8, string2)) ? 1 : 0);
                                        if (n10 != 0) {
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            } else {
                                object2 = "childViews";
                                jSONObject = jSONObject.optJSONArray((String)object2);
                                jSONObject2 = jSONObject2.optJSONArray((String)object2);
                                if (jSONObject != null || jSONObject2 != null) {
                                    boolean bl5 = zzfpy.zzh((JSONArray)jSONObject, (JSONArray)jSONObject2);
                                    if (bl5) {
                                        void var12_15;
                                        boolean bl6 = false;
                                        object2 = null;
                                        while (var12_15 < (n4 = jSONObject.length())) {
                                            string2 = jSONObject.optJSONObject((int)var12_15);
                                            n4 = (int)(zzfpy.zzg((JSONObject)string2, (JSONObject)(object = jSONObject2.optJSONObject((int)var12_15))) ? 1 : 0);
                                            if (n4 != 0) {
                                                ++var12_15;
                                                continue;
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    return bl2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (jSONArray == null && jSONArray2 == null) {
            return bl2;
        }
        if (jSONArray != null && jSONArray2 != null && (n4 = jSONArray.length()) == (n3 = jSONArray2.length())) {
            return bl2;
        }
        return false;
    }
}

