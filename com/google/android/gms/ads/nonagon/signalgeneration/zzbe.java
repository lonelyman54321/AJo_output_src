/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbd;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgp;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

final class zzbe
extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzbe(TaggingLibraryJsInterface taggingLibraryJsInterface, String string2) {
        this.zza = string2;
        this.zzb = taggingLibraryJsInterface;
    }

    public final void onFailure(String string2) {
        long l2;
        Object[] objectArray;
        Object object = String.valueOf(string2);
        zzm.zzj("Failed to generate query info for the tagging library, error: ".concat((String)object));
        object = Locale.getDefault();
        Object object2 = this.zza;
        zzbfv zzbfv2 = zzbgp.zza;
        Object object3 = (Boolean)zzbfv2.zze();
        boolean bl2 = (Boolean)object3;
        if (bl2) {
            object3 = zzbep.zzjR;
            objectArray = zzba.zzc();
            object3 = (Long)objectArray.zza((zzbeg)object3);
            l2 = (Long)object3;
        } else {
            l2 = 0L;
        }
        object3 = l2;
        int n3 = 3;
        objectArray = new Object[n3];
        objectArray[0] = object2;
        int n4 = 1;
        objectArray[n4] = string2;
        int n7 = 2;
        objectArray[n7] = object3;
        string2 = String.format((Locale)object, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objectArray);
        object = (Boolean)zzbfv2.zze();
        boolean bl3 = (Boolean)object;
        if (bl3) {
            try {
                object = this.zzb;
            }
            catch (RuntimeException runtimeException) {
                zzu.zzo().zzv(runtimeException, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
                return;
            }
            object = TaggingLibraryJsInterface.zzb((TaggingLibraryJsInterface)object);
            object2 = new zzbc(this, string2);
            object.execute((Runnable)object2);
            return;
        }
        TaggingLibraryJsInterface.zza(this.zzb).evaluateJavascript(string2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSuccess(QueryInfo object) {
        Object object2;
        boolean bl2;
        block9: {
            Object[] objectArray;
            Object object3;
            boolean bl3;
            Object object4;
            Object object5;
            bl2 = false;
            object2 = null;
            int n3 = 1;
            Object object6 = ((QueryInfo)object).getQuery();
            long l2 = 0L;
            try {
                long l3;
                object5 = new JSONObject();
                object4 = "paw_id";
                Object[] objectArray2 = this.zza;
                object5.put((String)object4, (Object)objectArray2);
                object4 = "signal";
                object5.put((String)object4, object6);
                object6 = "sdk_ttl_ms";
                object4 = zzbgp.zza;
                object4 = ((zzbfv)object4).zze();
                object4 = (Boolean)object4;
                bl3 = (Boolean)object4;
                if (bl3) {
                    object4 = zzbep.zzjR;
                    objectArray2 = zzba.zzc();
                    object4 = objectArray2.zza((zzbeg)object4);
                    object4 = (Long)object4;
                    l3 = (Long)object4;
                } else {
                    l3 = l2;
                }
                object5.put((String)object6, l3);
                object6 = Locale.getDefault();
                object4 = "window.postMessage(%1$s, '*');";
                objectArray2 = new Object[n3];
                objectArray2[0] = object5;
                object = String.format((Locale)object6, (String)object4, objectArray2);
                break block9;
            }
            catch (JSONException jSONException) {}
            object6 = this.zza;
            object5 = Locale.getDefault();
            object = ((QueryInfo)object).getQuery();
            object4 = (Boolean)zzbgp.zza.zze();
            bl3 = (Boolean)object4;
            if (bl3) {
                object3 = zzbep.zzjR;
                objectArray = zzba.zzc();
                object3 = (Long)objectArray.zza((zzbeg)object3);
                l2 = (Long)object3;
            }
            object3 = l2;
            int n4 = 3;
            objectArray = new Object[n4];
            objectArray[0] = object6;
            objectArray[n3] = object;
            int n7 = 2;
            objectArray[n7] = object3;
            object = String.format((Locale)object5, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objectArray);
        }
        object2 = (Boolean)zzbgp.zza.zze();
        bl2 = (Boolean)object2;
        if (!bl2) {
            TaggingLibraryJsInterface.zza(this.zzb).evaluateJavascript((String)object, null);
            return;
        }
        try {
            object2 = this.zzb;
            object2 = TaggingLibraryJsInterface.zzb((TaggingLibraryJsInterface)object2);
            zzbd zzbd2 = new zzbd(this, (String)object);
            object2.execute(zzbd2);
            return;
        }
        catch (RuntimeException runtimeException) {
            zzu.zzo().zzv(runtimeException, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            return;
        }
    }
}

