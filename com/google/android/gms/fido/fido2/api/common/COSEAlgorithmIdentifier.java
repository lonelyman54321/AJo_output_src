/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.Algorithm;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.EC2Algorithm;
import com.google.android.gms.fido.fido2.api.common.RSAAlgorithm;
import com.google.android.gms.fido.fido2.api.common.zzp;

public class COSEAlgorithmIdentifier
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Algorithm zza;

    static {
        zzp zzp2 = new zzp();
        CREATOR = zzp2;
    }

    public COSEAlgorithmIdentifier(Algorithm algorithm) {
        this.zza = algorithm = (Algorithm)Preconditions.checkNotNull(algorithm);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static COSEAlgorithmIdentifier fromCoseValue(int n3) {
        void var4_7;
        Enum[] enumArray = RSAAlgorithm.LEGACY_RS1;
        int n4 = enumArray.getAlgoValue();
        if (n3 == n4) {
            RSAAlgorithm rSAAlgorithm = RSAAlgorithm.RS1;
            return new COSEAlgorithmIdentifier((Algorithm)var4_7);
        }
        enumArray = RSAAlgorithm.values();
        int n7 = enumArray.length;
        int n8 = 0;
        Enum enum_ = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            RSAAlgorithm rSAAlgorithm = enumArray[i3];
            int n10 = rSAAlgorithm.getAlgoValue();
            if (n10 != n3) continue;
            RSAAlgorithm rSAAlgorithm2 = rSAAlgorithm;
            return new COSEAlgorithmIdentifier((Algorithm)var4_7);
        }
        enumArray = EC2Algorithm.values();
        n7 = enumArray.length;
        while (n8 < n7) {
            enum_ = enumArray[n8];
            int n14 = ((EC2Algorithm)enum_).getAlgoValue();
            if (n14 == n3) {
                Enum enum_2 = enum_;
                return new COSEAlgorithmIdentifier((Algorithm)var4_7);
            }
            ++n8;
        }
        Object object = new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(n3);
        throw object;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        int n3;
        int n4 = object instanceof COSEAlgorithmIdentifier;
        if (n4 == 0) {
            return false;
        }
        object = (COSEAlgorithmIdentifier)object;
        Algorithm algorithm = this.zza;
        n4 = algorithm.getAlgoValue();
        return n4 == (n3 = (object = ((COSEAlgorithmIdentifier)object).zza).getAlgoValue());
    }

    public int hashCode() {
        Algorithm algorithm = this.zza;
        Object[] objectArray = new Object[]{algorithm};
        return Objects.hashCode(objectArray);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza.getAlgoValue();
        parcel.writeInt(n3);
    }
}

