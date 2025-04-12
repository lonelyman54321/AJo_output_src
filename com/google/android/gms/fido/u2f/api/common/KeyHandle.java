/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException;
import com.google.android.gms.fido.u2f.api.common.zze;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class KeyHandle
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final byte[] zzb;
    private final ProtocolVersion zzc;
    private final List zzd;

    static {
        zze zze2 = new zze();
        CREATOR = zze2;
    }

    public KeyHandle(int n3, byte[] object, String string2, List list) {
        ProtocolVersion protocolVersion;
        this.zza = n3;
        this.zzb = object;
        try {
            protocolVersion = ProtocolVersion.fromString(string2);
        }
        catch (ProtocolVersion$UnsupportedProtocolException protocolVersion$UnsupportedProtocolException) {
            object = new IllegalArgumentException;
            super(protocolVersion$UnsupportedProtocolException);
            throw object;
        }
        this.zzc = protocolVersion;
        this.zzd = list;
    }

    public KeyHandle(byte[] byArray, ProtocolVersion protocolVersion, List list) {
        this.zza = 1;
        this.zzb = byArray;
        this.zzc = protocolVersion;
        this.zzd = list;
    }

    public static KeyHandle parseFromJson(JSONObject object) {
        String string2;
        Object object2 = "version";
        boolean bl2 = object.has(object2);
        List list = null;
        object2 = bl2 ? object.getString(object2) : null;
        try {
            object2 = ProtocolVersion.fromString(object2);
        }
        catch (ProtocolVersion$UnsupportedProtocolException protocolVersion$UnsupportedProtocolException) {
            String string3 = ((Object)protocolVersion$UnsupportedProtocolException).toString();
            object2 = new JSONException(string3);
            throw object2;
        }
        Object object3 = object.getString("keyHandle");
        int n3 = 8;
        try {
            object3 = Base64.decode((String)object3, (int)n3);
            string2 = "transports";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string4 = ((Object)illegalArgumentException).toString();
            object2 = new JSONException(string4);
            throw object2;
        }
        boolean bl3 = object.has(string2);
        if (bl3) {
            object = object.getJSONArray(string2);
            list = Transport.parseTransports((JSONArray)object);
        }
        object = new KeyHandle((byte[])object3, (ProtocolVersion)((Object)object2), list);
        return object;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof KeyHandle;
        if (!bl4) {
            return false;
        }
        object = (KeyHandle)object;
        Object object2 = this.zzb;
        Object object3 = ((KeyHandle)object).zzb;
        bl4 = Arrays.equals(object2, object3);
        if (!bl4) {
            return false;
        }
        object2 = (Object)this.zzc;
        object3 = (Object)((KeyHandle)object).zzc;
        bl4 = object2.equals(object3);
        if (!bl4) {
            return false;
        }
        object2 = this.zzd;
        if (object2 == null && (object3 = (Object)((KeyHandle)object).zzd) == null) {
            return bl3;
        }
        if (object2 != null && (object3 = (Object)((KeyHandle)object).zzd) != null && (bl4 = object2.containsAll((Collection<?>)object3)) && (bl2 = (object = ((KeyHandle)object).zzd).containsAll((Collection<?>)(object2 = this.zzd)))) {
            return bl3;
        }
        return false;
    }

    public byte[] getBytes() {
        return this.zzb;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.zzc;
    }

    public List getTransports() {
        return this.zzd;
    }

    public int getVersionCode() {
        return this.zza;
    }

    public int hashCode() {
        Integer n3 = Arrays.hashCode(this.zzb);
        ProtocolVersion protocolVersion = this.zzc;
        List list = this.zzd;
        Object[] objectArray = new Object[]{n3, protocolVersion, list};
        return Objects.hashCode(objectArray);
    }

    public JSONObject toJson() {
        return this.zza();
    }

    public String toString() {
        Object object = this.zzd;
        object = object == null ? "null" : object.toString();
        String string2 = Base64Utils.encode(this.zzb);
        ProtocolVersion protocolVersion = this.zzc;
        StringBuilder stringBuilder = new StringBuilder("{keyHandle: ");
        stringBuilder.append(string2);
        stringBuilder.append(", version: ");
        stringBuilder.append((Object)protocolVersion);
        stringBuilder.append(", transports: ");
        return h30_0.a(stringBuilder, (String)object, "}");
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getVersionCode();
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Object object = this.getBytes();
        SafeParcelWriter.writeByteArray(parcel, 2, object, false);
        object = this.zzc.toString();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        List list = this.getTransports();
        SafeParcelWriter.writeTypedList(parcel, 4, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zza() {
        JSONException jSONException2;
        block6: {
            int n3;
            Object object;
            Object object2;
            JSONObject jSONObject;
            block5: {
                jSONObject = new JSONObject();
                try {
                    object2 = this.zzb;
                    if (object2 == null) break block5;
                    object = "keyHandle";
                    n3 = 11;
                    object2 = Base64.encodeToString((byte[])object2, (int)n3);
                    jSONObject.put((String)object, object2);
                }
                catch (JSONException jSONException2) {
                    break block6;
                }
            }
            if ((object2 = (Object)((Object)this.zzc)) != null) {
                object = "version";
                object2 = object2.toString();
                jSONObject.put((String)object, object2);
            }
            if ((object2 = (Object)this.zzd) != null) {
                object2 = new JSONArray;
                object2();
                object = this.zzd;
                object = object.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Object object3 = object.next();
                    object3 = (Transport)object3;
                    object3 = ((Transport)object3).toString();
                    object2.put(object3);
                }
                object = "transports";
                jSONObject.put((String)object, object2);
            }
            return jSONObject;
        }
        RuntimeException runtimeException = new RuntimeException(jSONException2);
        throw runtimeException;
    }
}

