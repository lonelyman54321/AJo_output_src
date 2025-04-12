/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzs
extends zzbz {
    public static final Parcelable.Creator CREATOR;
    private static final Jp zzb;
    final int zza;
    private List zzc;
    private List zzd;
    private List zze;
    private List zzf;
    private List zzg;

    static {
        Object object = new zzt();
        CREATOR = object;
        zzb = object = new Jp();
        String string2 = "registered";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forStrings(string2, 2);
        ((a53)object).put(string2, fastJsonResponse$Field);
        string2 = "in_progress";
        fastJsonResponse$Field = FastJsonResponse$Field.forStrings(string2, 3);
        ((a53)object).put(string2, fastJsonResponse$Field);
        string2 = "success";
        fastJsonResponse$Field = FastJsonResponse$Field.forStrings(string2, 4);
        ((a53)object).put(string2, fastJsonResponse$Field);
        string2 = "failed";
        fastJsonResponse$Field = FastJsonResponse$Field.forStrings(string2, 5);
        ((a53)object).put(string2, fastJsonResponse$Field);
        string2 = "escrowed";
        fastJsonResponse$Field = FastJsonResponse$Field.forStrings(string2, 6);
        ((a53)object).put(string2, fastJsonResponse$Field);
    }

    public zzs() {
        this.zza = 1;
    }

    public zzs(int n3, List list, List list2, List list3, List list4, List list5) {
        this.zza = n3;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }

    public final Map getFieldMappings() {
        return zzb;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        switch (n3) {
            default: {
                object = hj0_0.a(((FastJsonResponse$Field)object).getSafeParcelableFieldId(), "Unknown SafeParcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            case 6: {
                return this.zzg;
            }
            case 5: {
                return this.zzf;
            }
            case 4: {
                return this.zze;
            }
            case 3: {
                return this.zzd;
            }
            case 2: {
                return this.zzc;
            }
            case 1: 
        }
        return this.zza;
    }

    public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    public final void setStringsInternal(FastJsonResponse$Field object, String object2, ArrayList objectArray) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 2)) {
            n3 = 3;
            if (n4 != n3) {
                n3 = 4;
                if (n4 != n3) {
                    n3 = 5;
                    if (n4 != n3) {
                        n3 = 6;
                        if (n4 == n3) {
                            this.zzg = objectArray;
                            return;
                        }
                        object = n4;
                        objectArray = new Object[]{object};
                        object = String.format("Field with id=%d is not known to be a string list.", objectArray);
                        object2 = new IllegalArgumentException((String)object);
                        throw object2;
                    }
                    this.zzf = objectArray;
                    return;
                }
                this.zze = objectArray;
                return;
            }
            this.zzd = objectArray;
            return;
        }
        this.zzc = objectArray;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        List list = this.zzc;
        SafeParcelWriter.writeStringList(parcel, 2, list, false);
        List list2 = this.zzd;
        SafeParcelWriter.writeStringList(parcel, 3, list2, false);
        list2 = this.zze;
        SafeParcelWriter.writeStringList(parcel, 4, list2, false);
        list2 = this.zzf;
        SafeParcelWriter.writeStringList(parcel, 5, list2, false);
        list2 = this.zzg;
        SafeParcelWriter.writeStringList(parcel, 6, list2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

