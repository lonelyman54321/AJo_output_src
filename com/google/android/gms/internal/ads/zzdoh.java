/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdoj;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdoh
implements Callable {
    public final /* synthetic */ zzdoj zza;
    public final /* synthetic */ zzfhf zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdoh(zzdoj zzdoj2, zzfhf zzfhf2, zzfgt zzfgt2, JSONObject jSONObject) {
        this.zza = zzdoj2;
        this.zzb = zzfhf2;
        this.zzc = zzfgt2;
        this.zzd = jSONObject;
    }

    public final Object call() {
        Object object;
        Object object2 = new zzdlt();
        Object object3 = this.zzd;
        int n3 = object3.optInt("template_id", -1);
        ((zzdlt)object2).zzaa(n3);
        Object object4 = object3.optString("custom_template_id");
        ((zzdlt)object2).zzK((String)object4);
        object4 = object3.optJSONObject("omid_settings");
        if (object4 != null) {
            object = "omid_partner_name";
            object4 = object4.optString((String)object);
        } else {
            n3 = 0;
            object4 = null;
        }
        object = this.zzb;
        ((zzdlt)object2).zzV((String)object4);
        object4 = ((zzfhf)object).zza.zza;
        object = Integer.toString(((zzdlt)object2).zzc());
        Object object5 = ((zzfho)object4).zzg;
        boolean n4 = ((ArrayList)object5).contains(object);
        int n7 = 1;
        if (n4) {
            int n8;
            int n10 = ((zzdlt)object2).zzc();
            if (n10 == (n8 = 3)) {
                object = ((zzdlt)object2).zzA();
                if (object != null) {
                    object4 = ((zzfho)object4).zzh;
                    object = ((zzdlt)object2).zzA();
                    n3 = (int)(((ArrayList)object4).contains(object) ? 1 : 0);
                    if (n3 == 0) {
                        object2 = new zzelj(n7, "Unexpected custom template id in the response.");
                        throw object2;
                    }
                } else {
                    object2 = new zzelj(n7, "No custom template id for custom template ad response.");
                    throw object2;
                }
            }
            object4 = this.zzc;
            double d2 = -1.0;
            double d5 = object3.optDouble("rating", d2);
            ((zzdlt)object2).zzY(d5);
            object = "headline";
            object5 = object3.optString((String)object, null);
            n3 = (int)(((zzfgt)object4).zzN ? 1 : 0);
            if (n3 != 0) {
                zzu.zzp();
                object4 = zzt.zzy();
                String string2 = " : ";
                object5 = n1.a((String)object4, string2, (String)object5);
            }
            ((zzdlt)object2).zzZ((String)object, (String)object5);
            object4 = "body";
            object = object3.optString((String)object4, null);
            ((zzdlt)object2).zzZ((String)object4, (String)object);
            object4 = "call_to_action";
            object = object3.optString((String)object4, null);
            ((zzdlt)object2).zzZ((String)object4, (String)object);
            object4 = "store";
            object = object3.optString((String)object4, null);
            ((zzdlt)object2).zzZ((String)object4, (String)object);
            object4 = "price";
            object = object3.optString((String)object4, null);
            ((zzdlt)object2).zzZ((String)object4, (String)object);
            object4 = "advertiser";
            object3 = object3.optString((String)object4, null);
            ((zzdlt)object2).zzZ((String)object4, (String)object3);
            return object2;
        }
        object2 = hj0_0.a(((zzdlt)object2).zzc(), "Invalid template ID: ");
        object3 = new zzelj(n7, (String)object2);
        throw object3;
    }
}

