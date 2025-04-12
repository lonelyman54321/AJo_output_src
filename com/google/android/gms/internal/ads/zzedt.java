/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzeed;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzedt
implements zzgfa {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        String string2;
        Object object4;
        block5: {
            object = (zzeed)object;
            object4 = new JSONObject();
            string2 = "response";
            try {
                int n3 = ((zzeed)object).zza;
                object4.put(string2, n3);
                string2 = new JSONObject();
                object3 = ((zzeed)object).zzb;
                object3 = object3.keySet();
                object3 = object3.iterator();
                break block5;
            }
            catch (JSONException jSONException) {}
            object2 = String.valueOf(jSONException.getMessage());
            zzm.zzj("Error converting response to JSONObject: ".concat((String)object2));
            String string3 = String.valueOf(jSONException.getCause());
            string3 = "Parsing HTTP Response: ".concat(string3);
            object2 = new JSONException(string3);
            throw object2;
        }
        while (bl2 = object3.hasNext()) {
            boolean bl3;
            Object object5 = object3.next();
            if ((object5 = (String)object5) == null) continue;
            Iterator iterator = ((zzeed)object).zzb;
            iterator = iterator.get(object5);
            iterator = (List)((Object)iterator);
            JSONArray jSONArray = new JSONArray();
            iterator = iterator.iterator();
            while (bl3 = iterator.hasNext()) {
                Object object6 = iterator.next();
                if ((object6 = (String)object6) == null) continue;
                jSONArray.put(object6);
            }
            string2.put(object5, (Object)jSONArray);
        }
        object3 = "headers";
        object4.put((String)object3, (Object)string2);
        string2 = ((zzeed)object).zzc;
        if (string2 != null) {
            object3 = "body";
            object4.put((String)object3, (Object)string2);
        }
        string2 = "latency";
        long l2 = ((zzeed)object).zzd;
        object4.put(string2, l2);
        object = object4.toString();
        object4 = StandardCharsets.UTF_8;
        object = ((String)object).getBytes((Charset)object4);
        object2 = new ByteArrayInputStream((byte[])object);
        return zzgft.zzh(object2);
    }
}

