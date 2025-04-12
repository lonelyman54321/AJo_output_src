/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzchd;
import org.json.JSONException;
import org.json.JSONObject;

public class zzbuj {
    private final zzchd zza;
    private final String zzb;

    public zzbuj(zzchd zzchd2, String string2) {
        this.zza = zzchd2;
        this.zzb = string2;
    }

    public final void zzg(int n3, int n4, int n7, int n8) {
        String string2;
        Object object;
        try {
            object = new JSONObject();
            string2 = "x";
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error occurred while dispatching default position.", jSONException);
            return;
        }
        JSONObject jSONObject = object.put(string2, n3);
        object = "y";
        jSONObject = jSONObject.put((String)object, n4);
        Object object2 = "width";
        jSONObject = jSONObject.put((String)object2, n7);
        object2 = "height";
        jSONObject = jSONObject.put((String)object2, n8);
        object2 = this.zza;
        String string3 = "onDefaultPositionReceived";
        object2.zze(string3, jSONObject);
    }

    public final void zzh(String string2) {
        JSONException jSONException2;
        block9: {
            block8: {
                String string3;
                Object object;
                try {
                    object = new JSONObject();
                    string3 = "message";
                }
                catch (JSONException jSONException2) {}
                string2 = object.put(string3, (Object)string2);
                object = "action";
                string3 = this.zzb;
                string2 = string2.put((String)object, (Object)string3);
                object = this.zza;
                if (object == null) break block8;
                string3 = "onError";
                object.zze(string3, (JSONObject)string2);
                return;
                break block9;
            }
            return;
        }
        zzm.zzh("Error occurred while dispatching error event.", jSONException2);
    }

    public final void zzi(String string2) {
        String string3;
        Object object;
        try {
            object = new JSONObject();
            string3 = "js";
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error occurred while dispatching ready Event.", jSONException);
            return;
        }
        string2 = object.put(string3, (Object)string2);
        object = this.zza;
        string3 = "onReadyEventReceived";
        object.zze(string3, (JSONObject)string2);
    }

    public final void zzj(int n3, int n4, int n7, int n8, float f5, int n10) {
        String string2;
        Object object;
        try {
            object = new JSONObject();
            string2 = "width";
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error occurred while obtaining screen information.", jSONException);
            return;
        }
        JSONObject jSONObject = object.put(string2, n3);
        object = "height";
        jSONObject = jSONObject.put((String)object, n4);
        Object object2 = "maxSizeWidth";
        jSONObject = jSONObject.put((String)object2, n7);
        object2 = "maxSizeHeight";
        jSONObject = jSONObject.put((String)object2, n8);
        object2 = "density";
        double d2 = f5;
        jSONObject = jSONObject.put((String)object2, d2);
        object2 = "rotation";
        jSONObject = jSONObject.put((String)object2, n10);
        object2 = this.zza;
        String string3 = "onScreenInfoChanged";
        object2.zze(string3, jSONObject);
    }

    public final void zzk(int n3, int n4, int n7, int n8) {
        String string2;
        Object object;
        try {
            object = new JSONObject();
            string2 = "x";
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error occurred while dispatching size change.", jSONException);
            return;
        }
        JSONObject jSONObject = object.put(string2, n3);
        object = "y";
        jSONObject = jSONObject.put((String)object, n4);
        Object object2 = "width";
        jSONObject = jSONObject.put((String)object2, n7);
        object2 = "height";
        jSONObject = jSONObject.put((String)object2, n8);
        object2 = this.zza;
        String string3 = "onSizeChanged";
        object2.zze(string3, jSONObject);
    }

    public final void zzl(String string2) {
        String string3;
        Object object;
        try {
            object = new JSONObject();
            string3 = "state";
        }
        catch (JSONException jSONException) {
            zzm.zzh("Error occurred while dispatching state change.", jSONException);
            return;
        }
        string2 = object.put(string3, (Object)string2);
        object = this.zza;
        string3 = "onStateChanged";
        object.zze(string3, (JSONObject)string2);
    }
}

