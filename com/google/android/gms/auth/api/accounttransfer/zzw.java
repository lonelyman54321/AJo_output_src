/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class zzw
extends zzbz {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private String zzd;
    private int zze;
    private byte[] zzf;
    private PendingIntent zzg;
    private DeviceMetaData zzh;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzc = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "accountType";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 2);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "status";
        fastJsonResponse$Field = FastJsonResponse$Field.forInteger(string2, 3);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "transferBytes";
        fastJsonResponse$Field = FastJsonResponse$Field.forBase64(string2, 4);
        hashMap.put(string2, fastJsonResponse$Field);
    }

    public zzw() {
        Np np = new Np(3);
        this.zza = np;
        this.zzb = 1;
    }

    public zzw(Set set, int n3, String string2, int n4, byte[] byArray, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.zza = set;
        this.zzb = n3;
        this.zzd = string2;
        this.zze = n4;
        this.zzf = byArray;
        this.zzg = pendingIntent;
        this.zzh = deviceMetaData;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzc;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 == n3) {
                        return this.zzf;
                    }
                    object = hj0_0.a(((FastJsonResponse$Field)object).getSafeParcelableFieldId(), "Unknown SafeParcelable id=");
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
                return this.zze;
            }
            return this.zzd;
        }
        return this.zzb;
    }

    public final boolean isFieldSet(FastJsonResponse$Field object) {
        Set set = this.zza;
        object = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        return set.contains(object);
    }

    public final void setDecodedBytesInternal(FastJsonResponse$Field object, String object2, byte[] byArray) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 4)) {
            this.zzf = byArray;
            object2 = this.zza;
            object = n4;
            object2.add(object);
            return;
        }
        object = Gj0.b(n4, "Field with id=", " is not known to be an byte array.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n7 == (n4 = 3)) {
            this.zze = n3;
            object2 = this.zza;
            object = n7;
            object2.add(object);
            return;
        }
        object = Gj0.b(n7, "Field with id=", " is not known to be an int.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void setStringInternal(FastJsonResponse$Field object, String object2, String objectArray) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 2)) {
            this.zzd = objectArray;
            object2 = this.zza;
            object = n4;
            object2.add(object);
            return;
        }
        object = n4;
        objectArray = new Object[]{object};
        object = String.format("Field with id=%d is not known to be a string.", objectArray);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2;
        Object object;
        int n4;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object2 = this.zza;
        boolean bl3 = true;
        Integer n8 = (int)(bl3 ? 1 : 0);
        int n10 = object2.contains(n8);
        if (n10 != 0) {
            n10 = this.zzb;
            SafeParcelWriter.writeInt(parcel, (int)(bl3 ? 1 : 0), n10);
        }
        if ((n4 = object2.contains(object = Integer.valueOf(n10 = 2))) != 0) {
            object = this.zzd;
            SafeParcelWriter.writeString(parcel, n10, (String)object, bl3);
        }
        if ((n4 = object2.contains(object = Integer.valueOf(n10 = 3))) != 0) {
            n4 = this.zze;
            SafeParcelWriter.writeInt(parcel, n10, n4);
        }
        if ((n4 = (int)(object2.contains(object = Integer.valueOf(n10 = 4)) ? 1 : 0)) != 0) {
            object = this.zzf;
            SafeParcelWriter.writeByteArray(parcel, n10, (byte[])object, bl3);
        }
        if ((n4 = (int)(object2.contains(object = Integer.valueOf(n10 = 5)) ? 1 : 0)) != 0) {
            object = this.zzg;
            SafeParcelWriter.writeParcelable(parcel, n10, (Parcelable)object, n3, bl3);
        }
        if (bl2 = object2.contains(object = Integer.valueOf(n10 = 6))) {
            object2 = this.zzh;
            SafeParcelWriter.writeParcelable(parcel, n10, (Parcelable)object2, n3, bl3);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

