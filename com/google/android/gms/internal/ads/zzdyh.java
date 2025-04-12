/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzcby;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyh
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final JSONObject zza;
    private List zzb;

    public zzdyh() {
        JSONObject jSONObject;
        this.zza = jSONObject = new JSONObject();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSharedPreferenceChanged(SharedPreferences object, String string2) {
        JSONException jSONException2;
        Object object2;
        block4: {
            if (string2 == null) {
                return;
            }
            object2 = this.zzb;
            boolean bl2 = object2.contains(string2);
            if (!bl2) return;
            try {
                object = object.getAll();
                object = object.get(string2);
                if (object == null) {
                    object = this.zza;
                    object.remove(string2);
                    return;
                }
            }
            catch (JSONException jSONException2) {
                break block4;
            }
            object2 = this.zza;
            object2.put(string2, object);
            return;
        }
        string2 = "InspectorSharedPreferenceCollector.onSharedPreferenceChanged";
        object2 = zzu.zzo();
        ((zzcby)object2).zzv(jSONException2, string2);
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb(SharedPreferences sharedPreferences2, List object) {
        boolean bl2;
        this.zzb = object;
        sharedPreferences2.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            this.onSharedPreferenceChanged(sharedPreferences2, string2);
        }
    }
}

