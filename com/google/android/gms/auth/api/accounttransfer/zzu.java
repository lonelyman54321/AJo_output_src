/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzu
extends zzbz {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private zzw zzd;
    private String zze;
    private String zzf;
    private String zzg;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzc = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "authenticatorInfo";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forConcreteType(string2, 2, zzw.class);
        hashMap.put(string2, fastJsonResponse$Field);
        String string3 = "signature";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string3, 3);
        hashMap.put(string3, fastJsonResponse$Field);
        string3 = "package";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string3, 4);
        hashMap.put(string3, fastJsonResponse$Field);
    }

    public zzu() {
        HashSet hashSet;
        this.zza = hashSet = new HashSet(3);
        this.zzb = 1;
    }

    public zzu(Set set, int n3, zzw zzw2, String string2, String string3, String string4) {
        this.zza = set;
        this.zzb = n3;
        this.zzd = zzw2;
        this.zze = string2;
        this.zzf = string3;
        this.zzg = string4;
    }

    public final void addConcreteTypeInternal(FastJsonResponse$Field object, String objectArray, FastJsonResponse object2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 2)) {
            object2 = (zzw)object2;
            this.zzd = object2;
            objectArray = this.zza;
            object = n4;
            objectArray.add(object);
            return;
        }
        object = n4;
        object2 = object2.getClass().getCanonicalName();
        objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        object = String.format("Field with id=%d is not a known custom type. Found %s", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
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

    /*
     * Enabled aggressive block sorting
     */
    public final void setStringInternal(FastJsonResponse$Field object, String object2, String objectArray) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 3)) {
            n3 = 4;
            if (n4 != n3) {
                object = n4;
                objectArray = new Object[]{object};
                object = String.format("Field with id=%d is not known to be a string.", objectArray);
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.zzf = objectArray;
        } else {
            this.zze = objectArray;
        }
        object2 = this.zza;
        object = n4;
        object2.add(object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2;
        Object object;
        boolean bl3;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object2 = this.zza;
        boolean bl4 = true;
        Object object3 = (int)(bl4 ? 1 : 0);
        int n7 = object2.contains(object3);
        if (n7 != 0) {
            n7 = this.zzb;
            SafeParcelWriter.writeInt(parcel, (int)(bl4 ? 1 : 0), n7);
        }
        if (bl3 = object2.contains(object = Integer.valueOf(n7 = 2))) {
            object = this.zzd;
            SafeParcelWriter.writeParcelable(parcel, n7, (Parcelable)object, n3, bl4);
        }
        if ((n7 = (int)(object2.contains(object3 = Integer.valueOf(n3 = 3)) ? 1 : 0)) != 0) {
            object3 = this.zze;
            SafeParcelWriter.writeString(parcel, n3, (String)object3, bl4);
        }
        if ((n7 = (int)(object2.contains(object3 = Integer.valueOf(n3 = 4)) ? 1 : 0)) != 0) {
            object3 = this.zzf;
            SafeParcelWriter.writeString(parcel, n3, (String)object3, bl4);
        }
        if (bl2 = object2.contains(object3 = Integer.valueOf(n3 = 5))) {
            object2 = this.zzg;
            SafeParcelWriter.writeString(parcel, n3, (String)object2, bl4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

