/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.WebView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfog;
import com.google.android.gms.internal.ads.zzfou;
import com.google.android.gms.internal.ads.zzfpz;
import org.json.JSONException;
import org.json.JSONObject;

final class zzfot
implements BF3$a {
    final /* synthetic */ zzfou zza;

    public zzfot(zzfou zzfou2) {
        this.zza = zzfou2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPostMessage(WebView object, uf3_1 object2, Uri object3, boolean bl2, pk1_0 pk1_02) {
        int n3;
        int n4 = ((uf3_1)object2).b;
        if (n4 == 0) {
            JSONException jSONException2;
            block5: {
                object = ((uf3_1)object2).a;
                try {
                    object2 = new JSONObject((String)object);
                    object = "method";
                    object = object2.getString((String)object);
                    object3 = "data";
                    object2 = object2.getJSONObject((String)object3);
                    object3 = "adSessionId";
                    object2 = object2.getString((String)object3);
                    object3 = "startSession";
                    boolean bl3 = ((String)object).equals(object3);
                    if (bl3) {
                        object = this.zza;
                        zzfou.zzd((zzfou)object, (String)object2);
                        return;
                    }
                    object3 = "finishSession";
                    n4 = (int)(((String)object).equals(object3) ? 1 : 0);
                    if (n4 == 0) {
                        object = zzfog.zza;
                        object.getClass();
                        return;
                    }
                }
                catch (JSONException jSONException2) {
                    break block5;
                }
                object = this.zza;
                zzfou.zzb((zzfou)object, (String)object2);
                return;
            }
            zzfpz.zza("Error parsing JS message in JavaScriptSessionService.", (Exception)((Object)jSONException2));
            return;
        }
        object3 = new StringBuilder("Wrong data accessor type detected. ");
        String string2 = "String";
        object = n4 != 0 ? (n4 != (n3 = 1) ? "Unknown" : "ArrayBuffer") : string2;
        object = BW0.b((StringBuilder)object3, (String)object, " expected, but got ", string2);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

