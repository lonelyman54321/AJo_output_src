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
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzo
extends zzbz {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private ArrayList zzd;
    private int zze;
    private zzs zzf;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzc = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "authenticatorData";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forConcreteTypeArray(string2, 2, zzu.class);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "progress";
        fastJsonResponse$Field = FastJsonResponse$Field.forConcreteType(string2, 4, zzs.class);
        hashMap.put(string2, fastJsonResponse$Field);
    }

    public zzo() {
        HashSet hashSet;
        int n3 = 1;
        this.zza = hashSet = new HashSet(n3);
        this.zzb = n3;
    }

    public zzo(Set set, int n3, ArrayList arrayList, int n4, zzs zzs2) {
        this.zza = set;
        this.zzb = n3;
        this.zzd = arrayList;
        this.zze = n4;
        this.zzf = zzs2;
    }

    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field object, String objectArray, ArrayList object2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 2)) {
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
        object = String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void addConcreteTypeInternal(FastJsonResponse$Field object, String object2, FastJsonResponse object3) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 4)) {
            object3 = (zzs)object3;
            this.zzf = object3;
            object2 = this.zza;
            object = n4;
            object2.add(object);
            return;
        }
        object = n4;
        object3 = object3.getClass().getCanonicalName();
        Object[] objectArray = new Object[]{object, object3};
        object = String.format("Field with id=%d is not a known custom type. Found %s", objectArray);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
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
                n3 = 4;
                if (n4 == n3) {
                    return this.zzf;
                }
                object = hj0_0.a(((FastJsonResponse$Field)object).getSafeParcelableFieldId(), "Unknown SafeParcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
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

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2;
        Serializable serializable;
        int n4;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zza;
        boolean bl3 = true;
        Integer n8 = (int)(bl3 ? 1 : 0);
        int n10 = object.contains(n8);
        if (n10 != 0) {
            n10 = this.zzb;
            SafeParcelWriter.writeInt(parcel, (int)(bl3 ? 1 : 0), n10);
        }
        if ((n4 = object.contains(serializable = Integer.valueOf(n10 = 2))) != 0) {
            serializable = this.zzd;
            SafeParcelWriter.writeTypedList(parcel, n10, (List)((Object)serializable), bl3);
        }
        if ((n4 = object.contains(serializable = Integer.valueOf(n10 = 3))) != 0) {
            n4 = this.zze;
            SafeParcelWriter.writeInt(parcel, n10, n4);
        }
        if (bl2 = object.contains(serializable = Integer.valueOf(n10 = 4))) {
            object = this.zzf;
            SafeParcelWriter.writeParcelable(parcel, n10, (Parcelable)object, n3, bl3);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

