/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.phenotype.ExperimentTokens;

public final class zzh
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        String string2 = null;
        byte[] byArray = null;
        byte[][] byArray2 = null;
        byte[][] byArray3 = null;
        byte[][] byArray4 = null;
        byte[][] byArray5 = null;
        int[] nArray = null;
        byte[][] byArray6 = null;
        block10: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            int n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block10;
                }
                case 9: {
                    byArray6 = SafeParcelReader.createByteArrayArray(object, n4);
                    continue block10;
                }
                case 8: {
                    nArray = SafeParcelReader.createIntArray(object, n4);
                    continue block10;
                }
                case 7: {
                    byArray5 = SafeParcelReader.createByteArrayArray(object, n4);
                    continue block10;
                }
                case 6: {
                    byArray4 = SafeParcelReader.createByteArrayArray(object, n4);
                    continue block10;
                }
                case 5: {
                    byArray3 = SafeParcelReader.createByteArrayArray(object, n4);
                    continue block10;
                }
                case 4: {
                    byArray2 = SafeParcelReader.createByteArrayArray(object, n4);
                    continue block10;
                }
                case 3: {
                    byArray = SafeParcelReader.createByteArray(object, n4);
                    continue block10;
                }
                case 2: 
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new ExperimentTokens(string2, byArray, byArray2, byArray3, byArray4, byArray5, nArray, byArray6);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new ExperimentTokens[n3];
    }
}

