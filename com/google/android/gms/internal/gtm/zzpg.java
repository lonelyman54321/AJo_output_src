/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzoy;
import com.google.android.gms.internal.gtm.zzoz;
import com.google.android.gms.internal.gtm.zzpf;
import com.google.android.gms.internal.gtm.zzpi;
import com.google.android.gms.internal.gtm.zzpk;
import com.google.android.gms.internal.gtm.zzpl;
import com.google.android.gms.internal.gtm.zzpx;
import com.google.android.gms.internal.gtm.zzpy;
import com.google.android.gms.internal.gtm.zzqb;
import com.google.android.gms.internal.gtm.zzqe;
import com.google.android.gms.internal.gtm.zzqh;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzpg
implements zzpf {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzpl zza(byte[] object) {
        Object object2 = "macros";
        if (object == null) {
            object = new zzoy("Cannot parse a null byte[]");
            throw object;
        }
        int n3 = ((Object)object).length;
        if (n3 == 0) {
            object = new zzoy("Cannot parse a 0 length byte[]");
            throw object;
        }
        Object object3 = new String((byte[])object);
        Object object4 = new JSONObject((String)object3);
        object3 = "resource";
        object3 = object4.get((String)object3);
        boolean bl2 = object3 instanceof JSONObject;
        if (bl2) {
            int n4;
            int n7;
            object3 = (JSONObject)object3;
            object4 = new zzpx();
            Object object5 = "version";
            object5 = object3.optString((String)object5);
            ((zzpx)object4).zzc((String)object5);
            object5 = object3.getJSONArray((String)object2);
            Object object6 = new ArrayList();
            Object object7 = null;
            for (int i3 = 0; i3 < (n7 = object5.length()); ++i3) {
                JSONObject jSONObject = object5.getJSONObject(i3);
                String string2 = "instance_name";
                String string3 = jSONObject.getString(string2);
                ((ArrayList)object6).add(string3);
            }
            object5 = "tags";
            object5 = object3.getJSONArray((String)object5);
            object5 = zzoz.zzd((JSONArray)object5, object6);
            object7 = "predicates";
            object7 = object3.getJSONArray((String)object7);
            object7 = zzoz.zzd((JSONArray)object7, object6);
            object2 = object3.getJSONArray((String)object2);
            object2 = zzoz.zzd((JSONArray)object2, object6);
            object2 = object2.iterator();
            while ((n4 = object2.hasNext()) != 0) {
                object6 = object2.next();
                object6 = (zzqb)object6;
                ((zzpx)object4).zza((zzqb)object6);
            }
            object2 = "rules";
            object2 = object3.getJSONArray((String)object2);
            n3 = 0;
            object3 = null;
            while (true) {
                if (n3 >= (n4 = object2.length())) {
                    zzpy zzpy2 = ((zzpx)object4).zzd();
                    object2 = "The container was successfully parsed from the resource";
                    zzhi.zzd((String)object2);
                    object = zzpi.zzb.zza((byte[])object);
                    object3 = Status.RESULT_SUCCESS;
                    Object object8 = object4;
                    object4 = new zzpk(null, null, zzpy2, 0L);
                    object = ((zzpl)object).zzc();
                    return new zzpl((Status)object3, 0, (zzpk)object4, (zzqh)object);
                }
                object6 = object2.getJSONArray(n3);
                object6 = zzoz.zzb((JSONArray)object6, (List)object5, (List)object7);
                ((zzpx)object4).zzb((zzqe)object6);
                ++n3;
            }
        }
        try {
            object2 = "Resource map not found";
            object = new zzoy((String)object2);
            throw object;
        }
        catch (JSONException jSONException) {
            object = new zzoy("The resource data is corrupted. The container cannot be extracted from the JSON data");
            throw object;
        }
        catch (zzoy zzoy2) {}
        object = new zzoy("The resource data is invalid. The container cannot be extracted from the JSON data");
        throw object;
    }
}

