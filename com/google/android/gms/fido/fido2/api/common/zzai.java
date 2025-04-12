/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.zzaj;
import java.util.Arrays;

public final class zzai
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final byte[][] zza;

    static {
        zzaj zzaj2 = new zzaj();
        CREATOR = zzaj2;
    }

    public zzai(byte[][] byArray) {
        int n3;
        int n4 = 1;
        int n7 = byArray != null ? 1 : 0;
        Preconditions.checkArgument(n7 != 0);
        n7 = byArray.length & n4 ^ n4;
        n7 = n4 != n7 ? 0 : 1;
        Preconditions.checkArgument(n7 != 0);
        for (n7 = 0; n7 < (n3 = byArray.length); n7 += 2) {
            int n8;
            byte[] byArray2;
            if (n7 == 0 || (byArray2 = byArray[n7]) != null) {
                n3 = 1;
            } else {
                n3 = 0;
                byArray2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
            n3 = n7 + 1;
            byte[] byArray3 = byArray[n3];
            if (byArray3 != null) {
                n8 = 1;
            } else {
                n8 = 0;
                byArray3 = null;
            }
            Preconditions.checkArgument(n8 != 0);
            byArray2 = byArray[n3];
            n3 = byArray2.length;
            n8 = 32;
            if (n3 == n8 || n3 == (n8 = 64)) {
                n3 = 1;
            } else {
                n3 = 0;
                byArray2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
        }
        this.zza = byArray;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzai;
        if (!bl2) {
            return false;
        }
        object = (zzai)object;
        byte[][] byArray = this.zza;
        object = ((zzai)object).zza;
        return Arrays.deepEquals((Object[])byArray, (Object[])object);
    }

    public final int hashCode() {
        int n3 = 1;
        byte[][] byArray = this.zza;
        int n4 = byArray.length;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            byte[] byArray2 = byArray[i3];
            Object[] objectArray = new Object[n3];
            objectArray[0] = byArray2;
            int n8 = Objects.hashCode(objectArray);
            n7 ^= n8;
        }
        return n7;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        byte[][] byArray = this.zza;
        SafeParcelWriter.writeByteArrayArray(parcel, 1, byArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

