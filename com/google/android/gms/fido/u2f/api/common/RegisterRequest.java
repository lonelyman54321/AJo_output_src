/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
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
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException;
import com.google.android.gms.fido.u2f.api.common.zzg;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisterRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;
    private final int zza;
    private final ProtocolVersion zzb;
    private final byte[] zzc;
    private final String zzd;

    static {
        zzg zzg2 = new zzg();
        CREATOR = zzg2;
    }

    public RegisterRequest(int n3, String object, byte[] byArray, String string2) {
        ProtocolVersion protocolVersion;
        this.zza = n3;
        try {
            protocolVersion = ProtocolVersion.fromString((String)object);
        }
        catch (ProtocolVersion$UnsupportedProtocolException protocolVersion$UnsupportedProtocolException) {
            object = new IllegalArgumentException(protocolVersion$UnsupportedProtocolException);
            throw object;
        }
        this.zzb = protocolVersion;
        this.zzc = byArray;
        this.zzd = string2;
    }

    public RegisterRequest(ProtocolVersion object, byte[] byArray, String string2) {
        Object object2;
        boolean bl2 = true;
        this.zza = bl2;
        this.zzb = object2 = (ProtocolVersion)((Object)Preconditions.checkNotNull(object));
        object2 = (byte[])Preconditions.checkNotNull(byArray);
        this.zzc = (byte[])object2;
        object2 = ProtocolVersion.V1;
        if (object == object2) {
            int n3 = byArray.length;
            int n4 = 65;
            if (n3 != n4) {
                bl2 = false;
            }
            object = "invalid challengeValue length for V1";
            Preconditions.checkArgument(bl2, object);
        }
        this.zzd = string2;
    }

    public static RegisterRequest parseFromJson(JSONObject object) {
        String string2;
        Object object2 = "version";
        boolean bl2 = object.has(object2);
        String string3 = null;
        object2 = bl2 ? object.getString(object2) : null;
        try {
            object2 = ProtocolVersion.fromString(object2);
        }
        catch (ProtocolVersion$UnsupportedProtocolException protocolVersion$UnsupportedProtocolException) {
            String string4 = ((Object)protocolVersion$UnsupportedProtocolException).toString();
            object2 = new JSONException(string4);
            throw object2;
        }
        Object object3 = object.getString("challenge");
        int n3 = 8;
        try {
            object3 = Base64.decode((String)object3, (int)n3);
            string2 = "appId";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string5 = ((Object)illegalArgumentException).toString();
            object2 = new JSONException(string5);
            throw object2;
        }
        boolean bl3 = object.has(string2);
        if (bl3) {
            string3 = object.getString(string2);
        }
        try {
            object = new RegisterRequest((ProtocolVersion)((Object)object2), (byte[])object3, string3);
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string6 = illegalArgumentException.getMessage();
            object2 = new JSONException(string6);
            throw object2;
        }
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof RegisterRequest;
        if (!bl4) {
            return false;
        }
        object = (RegisterRequest)object;
        Object object2 = this.zzc;
        Object object3 = ((RegisterRequest)object).zzc;
        bl4 = Arrays.equals(object2, object3);
        if (!bl4) {
            return false;
        }
        object2 = (Object)this.zzb;
        object3 = (Object)((RegisterRequest)object).zzb;
        if (object2 != object3) {
            return false;
        }
        object2 = this.zzd;
        if (object2 == null ? (object = ((RegisterRequest)object).zzd) != null : !(bl2 = object2.equals(object = ((RegisterRequest)object).zzd))) {
            return false;
        }
        return bl3;
    }

    public String getAppId() {
        return this.zzd;
    }

    public byte[] getChallengeValue() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        byte[] byArray = this.zzc;
        int n3 = Arrays.hashCode(byArray) + 31;
        int n4 = ((Object)((Object)this.zzb)).hashCode();
        n3 = n3 * 31 + n4;
        String string2 = this.zzd;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        return n3 * 31 + n4;
    }

    public JSONObject toJson() {
        JSONException jSONException2;
        Object object;
        block9: {
            JSONObject jSONObject;
            block8: {
                Object object2;
                jSONObject = new JSONObject();
                object = "version";
                try {
                    object2 = this.zzb;
                }
                catch (JSONException jSONException2) {}
                object2 = object2.toString();
                jSONObject.put((String)object, object2);
                object = "challenge";
                object2 = this.zzc;
                int n3 = 11;
                object2 = Base64.encodeToString((byte[])object2, (int)n3);
                jSONObject.put((String)object, object2);
                object = this.zzd;
                if (object == null) break block8;
                object2 = "appId";
                jSONObject.put((String)object2, object);
                break block9;
            }
            return jSONObject;
        }
        object = new RuntimeException(jSONException2);
        throw object;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getVersionCode();
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zzb.toString();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.getChallengeValue();
        SafeParcelWriter.writeByteArray(parcel, 3, object, false);
        object = this.getAppId();
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

