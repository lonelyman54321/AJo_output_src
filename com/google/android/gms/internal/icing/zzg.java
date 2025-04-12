/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzh;
import com.google.android.gms.internal.icing.zzk;
import com.google.android.gms.internal.icing.zzq;
import java.util.Arrays;
import java.util.BitSet;

public final class zzg
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final zzk[] zza;
    public final String zzb;
    public final boolean zzc;
    public final Account zzd;

    static {
        zzh zzh2 = new zzh();
        CREATOR = zzh2;
    }

    public zzg(String object, boolean n3, Account object2, zzk ... object3) {
        this((zzk[])object3, (String)object, n3 != 0, (Account)object2);
        if (object3 != null) {
            int n4;
            n3 = zzq.zza.length;
            object = new BitSet(10);
            String string2 = null;
            for (n3 = 0; n3 < (n4 = ((zzk[])object3).length); ++n3) {
                object2 = object3[n3];
                n4 = object2.zzd;
                int n7 = -1;
                if (n4 == n7) continue;
                n7 = (int)(((BitSet)object).get(n4) ? 1 : 0);
                if (n7 != 0) {
                    string2 = String.valueOf(zzq.zza(n4));
                    n4 = string2.length();
                    object3 = "Duplicate global search section type ";
                    string2 = n4 != 0 ? ((String)object3).concat(string2) : new String((String)object3);
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                ((BitSet)object).set(n4);
            }
        }
    }

    public zzg(zzk[] zzkArray, String string2, boolean bl2, Account account) {
        this.zza = zzkArray;
        this.zzb = string2;
        this.zzc = bl2;
        this.zzd = account;
    }

    public final boolean equals(Object objectArray) {
        boolean bl2 = objectArray instanceof zzg;
        if (bl2) {
            boolean bl3;
            boolean bl4;
            objectArray = (zzg)objectArray;
            Object object = this.zzb;
            Object object2 = objectArray.zzb;
            bl2 = Objects.equal(object, object2);
            if (bl2 && (bl2 = Objects.equal(object = Boolean.valueOf(this.zzc), object2 = Boolean.valueOf(bl4 = objectArray.zzc))) && (bl2 = Objects.equal(object = this.zzd, object2 = objectArray.zzd)) && (bl3 = Arrays.equals(object = this.zza, objectArray = objectArray.zza))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zzb;
        Boolean bl2 = this.zzc;
        Account account = this.zzd;
        Integer n3 = Arrays.hashCode(this.zza);
        Object[] objectArray = new Object[]{string2, bl2, account, n3};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Parcelable[] parcelableArray = this.zza;
        SafeParcelWriter.writeTypedArray(parcel, 1, parcelableArray, n3, false);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        boolean bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        string2 = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)string2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

