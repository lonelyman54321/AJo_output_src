/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType;
import org.json.JSONException;
import org.json.JSONObject;

public class ClientData {
    public static final String KEY_CHALLENGE = "challenge";
    public static final String KEY_CID_PUBKEY = "cid_pubkey";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_TYPE = "typ";
    public static final String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";
    public static final String TYPE_GET_ASSERTION = "navigator.id.getAssertion";
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final ChannelIdValue zzd;

    public ClientData(String object, String string2, String string3, ChannelIdValue channelIdValue) {
        object = (String)Preconditions.checkNotNull(object);
        this.zza = object;
        object = (String)Preconditions.checkNotNull(string2);
        this.zzb = object;
        object = (String)Preconditions.checkNotNull(string3);
        this.zzc = object;
        this.zzd = object = (ChannelIdValue)Preconditions.checkNotNull(channelIdValue);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof ClientData;
        if (!bl4) {
            return false;
        }
        object = (ClientData)object;
        Object object2 = this.zza;
        String string2 = ((ClientData)object).zza;
        bl4 = ((String)object2).equals(string2);
        if (bl4 && (bl4 = ((String)(object2 = this.zzb)).equals(string2 = ((ClientData)object).zzb)) && (bl4 = ((String)(object2 = this.zzc)).equals(string2 = ((ClientData)object).zzc)) && (bl2 = ((ChannelIdValue)(object2 = this.zzd)).equals(object = ((ClientData)object).zzd))) {
            return bl3;
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.zza.hashCode() + 31;
        int n4 = this.zzb.hashCode();
        n3 = n3 * 31 + n4;
        n4 = this.zzc.hashCode();
        n3 = n3 * 31 + n4;
        n4 = this.zzd.hashCode();
        return n3 * 31 + n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toJsonString() {
        JSONException jSONException2;
        Object object;
        block4: {
            String string2;
            JSONObject jSONObject = new JSONObject();
            object = KEY_TYPE;
            try {
                String string3 = this.zza;
                jSONObject.put((String)object, (Object)string3);
                object = KEY_CHALLENGE;
                string3 = this.zzb;
                jSONObject.put((String)object, (Object)string3);
                object = KEY_ORIGIN;
                string3 = this.zzc;
                jSONObject.put((String)object, (Object)string3);
                object = ChannelIdValue$ChannelIdValueType.ABSENT;
                object = this.zzd;
                object = ((ChannelIdValue)object).getType();
                int n3 = ((Enum)object).ordinal();
                int n4 = 1;
                string2 = KEY_CID_PUBKEY;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        return jSONObject.toString();
                    }
                    object = this.zzd;
                    object = ((ChannelIdValue)object).getObjectValue();
                    jSONObject.put(string2, object);
                    return jSONObject.toString();
                }
            }
            catch (JSONException jSONException2) {
                break block4;
            }
            object = this.zzd;
            object = ((ChannelIdValue)object).getStringValue();
            jSONObject.put(string2, object);
            return jSONObject.toString();
        }
        object = new RuntimeException(jSONException2);
        throw object;
    }
}

