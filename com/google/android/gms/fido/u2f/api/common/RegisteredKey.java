/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.zzj;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisteredKey
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String zza;
    private final KeyHandle zzb;
    private final String zzc;

    static {
        zzj zzj2 = new zzj();
        CREATOR = zzj2;
    }

    public RegisteredKey(KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    public RegisteredKey(KeyHandle keyHandle, String string2, String string3) {
        this.zzb = keyHandle = (KeyHandle)Preconditions.checkNotNull(keyHandle);
        this.zza = string2;
        this.zzc = string3;
    }

    public static RegisteredKey parseFromJson(JSONObject object) {
        String string2 = "challenge";
        boolean bl2 = object.has(string2);
        String string3 = null;
        string2 = bl2 ? object.getString(string2) : null;
        KeyHandle keyHandle = KeyHandle.parseFromJson(object);
        String string4 = "appId";
        boolean bl3 = object.has(string4);
        if (bl3) {
            string3 = object.getString(string4);
        }
        object = new RegisteredKey(keyHandle, string2, string3);
        return object;
    }

    public boolean equals(Object object) {
        boolean bl2;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof RegisteredKey;
        if (!bl4) {
            return false;
        }
        object = (RegisteredKey)object;
        Object object3 = this.zza;
        if (object3 == null) {
            object3 = ((RegisteredKey)object).zza;
            if (object3 != null) {
                return false;
            }
        } else {
            object2 = ((RegisteredKey)object).zza;
            bl4 = ((String)object3).equals(object2);
            if (!bl4) {
                return false;
            }
        }
        object3 = this.zzb;
        object2 = ((RegisteredKey)object).zzb;
        bl4 = ((KeyHandle)object3).equals(object2);
        if (!bl4) {
            return false;
        }
        object3 = this.zzc;
        if (object3 == null ? (object = ((RegisteredKey)object).zzc) != null : !(bl2 = ((String)object3).equals(object = ((RegisteredKey)object).zzc))) {
            return false;
        }
        return bl3;
    }

    public String getAppId() {
        return this.zzc;
    }

    public String getChallengeValue() {
        return this.zza;
    }

    public KeyHandle getKeyHandle() {
        return this.zzb;
    }

    public int hashCode() {
        int n3;
        String string2 = this.zza;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        KeyHandle keyHandle = this.zzb;
        n3 = (n3 + 31) * 31;
        int n7 = keyHandle.hashCode() + n3;
        string2 = this.zzc;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n7 * 31 + n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJson() {
        JSONException jSONException2;
        block5: {
            boolean bl2;
            Object object;
            Object object2;
            JSONObject jSONObject;
            block4: {
                jSONObject = new JSONObject();
                try {
                    object2 = this.zza;
                    if (object2 == null) break block4;
                    object = "challenge";
                    jSONObject.put((String)object, object2);
                }
                catch (JSONException jSONException2) {
                    break block5;
                }
            }
            object2 = this.zzb;
            object2 = ((KeyHandle)object2).zza();
            object = object2.keys();
            while (bl2 = object.hasNext()) {
                Object object3 = object.next();
                object3 = (String)object3;
                Object object4 = object2.get(object3);
                jSONObject.put(object3, object4);
            }
            object2 = this.zzc;
            if (object2 != null) {
                object = "appId";
                jSONObject.put((String)object, object2);
            }
            return jSONObject;
        }
        RuntimeException runtimeException = new RuntimeException(jSONException2);
        throw runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        JSONException jSONException2;
        Object object;
        block7: {
            Object object2;
            JSONObject jSONObject;
            block6: {
                try {
                    jSONObject = new JSONObject();
                    object = "keyHandle";
                    object2 = this.zzb;
                    object2 = ((KeyHandle)object2).getBytes();
                    int n3 = 11;
                    object2 = Base64.encodeToString((byte[])object2, (int)n3);
                    jSONObject.put((String)object, object2);
                    object = this.zzb;
                    object = ((KeyHandle)object).getProtocolVersion();
                    object2 = ProtocolVersion.UNKNOWN;
                    if (object == object2) break block6;
                    object = "version";
                }
                catch (JSONException jSONException2) {
                    break block7;
                }
                object2 = this.zzb;
                object2 = ((KeyHandle)object2).getProtocolVersion();
                object2 = ((ProtocolVersion)((Object)object2)).toString();
                jSONObject.put((String)object, object2);
            }
            object = this.zzb;
            if ((object = ((KeyHandle)object).getTransports()) != null) {
                object = "transports";
                object2 = this.zzb;
                object2 = ((KeyHandle)object2).getTransports();
                object2 = object2.toString();
                jSONObject.put((String)object, object2);
            }
            if ((object = this.zza) != null) {
                object2 = "challenge";
                jSONObject.put((String)object2, object);
            }
            if ((object = this.zzc) != null) {
                object2 = "appId";
                jSONObject.put((String)object2, object);
            }
            return jSONObject.toString();
        }
        object = new RuntimeException(jSONException2);
        throw object;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getKeyHandle();
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        object = this.getChallengeValue();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.getAppId();
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

