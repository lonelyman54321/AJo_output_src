/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ResponseInfo {
    private final zzdn zza;
    private final List zzb;
    private AdapterResponseInfo zzc;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ResponseInfo(zzdn object) {
        block6: {
            this.zza = object;
            Object object2 = new ArrayList();
            this.zzb = object2;
            if (object != null) {
                boolean bl2;
                try {
                    object = object.zzj();
                    if (object == null) break block6;
                    object = object.iterator();
                }
                catch (RemoteException remoteException) {
                    object2 = "Could not forward getAdapterResponseInfo to ResponseInfo.";
                    zzm.zzh((String)object2, remoteException);
                }
                while (bl2 = object.hasNext()) {
                    object2 = AdapterResponseInfo.zza((zzu)object.next());
                    if (object2 == null) continue;
                    List list = this.zzb;
                    list.add(object2);
                }
            }
        }
        object = this.zza;
        if (object == null) return;
        try {
            object = object.zzf();
            if (object == null) return;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", remoteException);
            return;
        }
        this.zzc = object = AdapterResponseInfo.zza((zzu)object);
    }

    public static ResponseInfo zza(zzdn zzdn2) {
        if (zzdn2 != null) {
            ResponseInfo responseInfo = new ResponseInfo(zzdn2);
            return responseInfo;
        }
        return null;
    }

    public static ResponseInfo zzb(zzdn zzdn2) {
        ResponseInfo responseInfo = new ResponseInfo(zzdn2);
        return responseInfo;
    }

    public List getAdapterResponses() {
        return this.zzb;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public String getMediationAdapterClassName() {
        block3: {
            zzdn zzdn2 = this.zza;
            if (zzdn2 == null) break block3;
            try {
                return zzdn2.zzg();
            }
            catch (RemoteException remoteException) {
                String string2 = "Could not forward getMediationAdapterClassName to ResponseInfo.";
                zzm.zzh(string2, remoteException);
            }
        }
        return null;
    }

    public Bundle getResponseExtras() {
        zzdn zzdn2;
        block3: {
            zzdn2 = this.zza;
            if (zzdn2 == null) break block3;
            try {
                return zzdn2.zze();
            }
            catch (RemoteException remoteException) {
                String string2 = "Could not forward getResponseExtras to ResponseInfo.";
                zzm.zzh(string2, remoteException);
            }
        }
        zzdn2 = new Bundle();
        return zzdn2;
    }

    public String getResponseId() {
        block3: {
            zzdn zzdn2 = this.zza;
            if (zzdn2 == null) break block3;
            try {
                return zzdn2.zzi();
            }
            catch (RemoteException remoteException) {
                String string2 = "Could not forward getResponseId to ResponseInfo.";
                zzm.zzh(string2, remoteException);
            }
        }
        return null;
    }

    public String toString() {
        Object object = this.zzd();
        int n3 = 2;
        try {
            object = object.toString(n3);
        }
        catch (JSONException jSONException) {
            object = "Error forming toString output.";
        }
        return object;
    }

    public final zzdn zzc() {
        return this.zza;
    }

    public final JSONObject zzd() {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        Object object = this.getResponseId();
        Object object2 = "null";
        String string2 = "Response ID";
        if (object == null) {
            jSONObject.put(string2, object2);
        } else {
            jSONObject.put(string2, object);
        }
        object = this.getMediationAdapterClassName();
        string2 = "Mediation Adapter Class Name";
        if (object == null) {
            jSONObject.put(string2, object2);
        } else {
            jSONObject.put(string2, object);
        }
        object = new JSONArray();
        object2 = this.zzb.iterator();
        while (bl2 = object2.hasNext()) {
            string2 = ((AdapterResponseInfo)object2.next()).zzb();
            object.put((Object)string2);
        }
        object2 = "Adapter Responses";
        jSONObject.put((String)object2, object);
        object = this.zzc;
        if (object != null) {
            object2 = "Loaded Adapter Response";
            object = ((AdapterResponseInfo)object).zzb();
            jSONObject.put((String)object2, object);
        }
        if ((object = this.getResponseExtras()) != null) {
            object = zzay.zzb().zzi((Bundle)object);
            object2 = "Response Extras";
            jSONObject.put((String)object2, object);
        }
        return jSONObject;
    }
}

