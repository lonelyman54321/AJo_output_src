/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdta {
    public static String zza(JSONObject jSONObject, String string2, String string3) {
        String string4 = "";
        if (jSONObject != null && (jSONObject = jSONObject.optJSONArray(string3)) != null) {
            int n3;
            string3 = null;
            for (int i3 = 0; i3 < (n3 = jSONObject.length()); ++i3) {
                JSONObject jSONObject2 = jSONObject.optJSONObject(i3);
                if (jSONObject2 == null) continue;
                JSONArray jSONArray = jSONObject2.optJSONArray("including");
                JSONArray jSONArray2 = jSONObject2.optJSONArray("excluding");
                boolean bl2 = zzdta.zzb(jSONArray, string2);
                if (!bl2 || (bl2 = zzdta.zzb(jSONArray2, string2))) continue;
                return jSONObject2.optString("effective_ad_unit_id", string4);
            }
        }
        return string4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean zzb(JSONArray jSONArray, String string2) {
        if (jSONArray != null && string2 != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
                PatternSyntaxException patternSyntaxException2;
                Object object;
                Object object2;
                block6: {
                    Object object3;
                    block5: {
                        block4: {
                            object3 = jSONArray.optString(i3);
                            try {
                                object2 = zzbep.zzkS;
                                object = zzba.zzc();
                                object2 = ((zzben)object).zza((zzbeg)object2);
                                object2 = (Boolean)object2;
                                int n4 = ((Boolean)object2).booleanValue();
                                if (n4 == 0) break block4;
                                n4 = 2;
                                object3 = Pattern.compile((String)object3, n4);
                                break block5;
                            }
                            catch (PatternSyntaxException patternSyntaxException2) {
                                break block6;
                            }
                        }
                        object3 = Pattern.compile((String)object3);
                    }
                    object3 = ((Pattern)object3).matcher(string2);
                    n3 = (int)(((Matcher)object3).lookingAt() ? 1 : 0);
                    if (n3 == 0) continue;
                    return true;
                }
                object2 = "RtbAdapterMap.hasAtleastOneRegexMatch";
                object = zzu.zzo();
                ((zzcby)object).zzw(patternSyntaxException2, (String)object2);
            }
        }
        return false;
    }
}

