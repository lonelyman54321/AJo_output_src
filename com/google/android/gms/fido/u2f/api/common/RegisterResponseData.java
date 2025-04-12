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
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.zzi;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisterResponseData
extends ResponseData {
    public static final Parcelable.Creator CREATOR;
    private final byte[] zza;
    private final ProtocolVersion zzb;
    private final String zzc;

    static {
        zzi zzi2 = new zzi();
        CREATOR = zzi2;
    }

    public RegisterResponseData(byte[] object) {
        object = (byte[])Preconditions.checkNotNull(object);
        this.zza = object;
        object = (Object)ProtocolVersion.V1;
        this.zzb = (ProtocolVersion)((Object)object);
        this.zzc = null;
    }

    public RegisterResponseData(byte[] object, ProtocolVersion protocolVersion, String string2) {
        boolean bl2;
        object = (byte[])Preconditions.checkNotNull(object);
        this.zza = object;
        object = (Object)((ProtocolVersion)((Object)Preconditions.checkNotNull((Object)protocolVersion)));
        this.zzb = (ProtocolVersion)((Object)object);
        object = (Object)ProtocolVersion.UNKNOWN;
        boolean bl3 = false;
        if (protocolVersion != object) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2);
        object = (Object)ProtocolVersion.V1;
        if (protocolVersion == object) {
            if (string2 == null) {
                bl3 = true;
            }
            Preconditions.checkArgument(bl3);
            this.zzc = null;
            return;
        }
        object = (String)Preconditions.checkNotNull(string2);
        this.zzc = (String)object;
    }

    public RegisterResponseData(byte[] object, String object2, String string2) {
        this.zza = object;
        try {
            object = (Object)ProtocolVersion.fromString((String)object2);
        }
        catch (ProtocolVersion$UnsupportedProtocolException protocolVersion$UnsupportedProtocolException) {
            object2 = new IllegalArgumentException(protocolVersion$UnsupportedProtocolException);
            throw object2;
        }
        this.zzb = (ProtocolVersion)((Object)object);
        this.zzc = string2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof RegisterResponseData;
        if (!bl3) {
            return false;
        }
        object = (RegisterResponseData)object;
        Object object2 = this.zzb;
        Object object3 = ((RegisterResponseData)object).zzb;
        bl3 = Objects.equal(object2, object3);
        return bl3 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.zza), (byte[])(object3 = (Object)((RegisterResponseData)object).zza))) && (bl2 = Objects.equal(object2 = this.zzc, object = ((RegisterResponseData)object).zzc));
    }

    public String getClientDataString() {
        return this.zzc;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzb;
    }

    public byte[] getRegisterData() {
        return this.zza;
    }

    public int getVersionCode() {
        int n3;
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        protocolVersion = this.zzb;
        int n4 = protocolVersion.ordinal();
        if (n4 != (n3 = 1) && n4 != (n3 = 2)) {
            return -1;
        }
        return n3;
    }

    public int hashCode() {
        ProtocolVersion protocolVersion = this.zzb;
        Integer n3 = Arrays.hashCode(this.zza);
        String string2 = this.zzc;
        Object[] objectArray = new Object[]{protocolVersion, n3, string2};
        return Objects.hashCode(objectArray);
    }

    public JSONObject toJsonObject() {
        JSONException jSONException2;
        Object object;
        block13: {
            JSONObject jSONObject;
            block12: {
                try {
                    jSONObject = new JSONObject();
                    object = "registrationData";
                }
                catch (JSONException jSONException2) {}
                Object object2 = this.zza;
                int n3 = 11;
                object2 = Base64.encodeToString((byte[])object2, (int)n3);
                jSONObject.put((String)object, object2);
                object = "version";
                object2 = (Object)this.zzb;
                object2 = ((ProtocolVersion)((Object)object2)).toString();
                jSONObject.put((String)object, object2);
                object = this.zzc;
                if (object == null) break block12;
                object2 = "clientData";
                object = ((String)object).getBytes();
                object = Base64.encodeToString((byte[])object, (int)n3);
                jSONObject.put((String)object2, object);
                break block13;
            }
            return jSONObject;
        }
        object = new RuntimeException(jSONException2);
        throw object;
    }

    public String toString() {
        zzaj zzaj2 = zzak.zza(this);
        Object object = this.zzb;
        zzaj2.zzb("protocolVersion", object);
        Object object2 = zzbf.zzd();
        object = this.zza;
        int n3 = ((ProtocolVersion)object).length;
        object2 = ((zzbf)object2).zze((byte[])object, 0, n3);
        object = "registerData";
        zzaj2.zzb((String)object, object2);
        object2 = this.zzc;
        if (object2 != null) {
            object = "clientDataString";
            zzaj2.zzb((String)object, object2);
        }
        return zzaj2.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getRegisterData();
        SafeParcelWriter.writeByteArray(parcel, 2, object, false);
        object = this.zzb.toString();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        String string2 = this.getClientDataString();
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

