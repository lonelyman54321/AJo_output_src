/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;

public final class zzf
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        ExperimentTokens[] experimentTokensArray = null;
        int n7 = 1;
        Object object2 = null;
        byte[] byArray = null;
        int[] nArray = null;
        String[] stringArray = null;
        int[] nArray2 = null;
        byte[][] byArray2 = null;
        ExperimentTokens[] experimentTokensArray2 = null;
        boolean bl2 = true;
        block10: while ((n4 = object.dataPosition()) < n3) {
            Parcelable.Creator creator;
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block10;
                }
                case 9: {
                    creator = ExperimentTokens.CREATOR;
                    experimentTokensArray2 = experimentTokensArray = SafeParcelReader.createTypedArray(object, n4, creator);
                    experimentTokensArray2 = experimentTokensArray;
                    continue block10;
                }
                case 8: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block10;
                }
                case 7: {
                    byArray2 = SafeParcelReader.createByteArrayArray(object, n4);
                    continue block10;
                }
                case 6: {
                    nArray2 = SafeParcelReader.createIntArray(object, n4);
                    continue block10;
                }
                case 5: {
                    stringArray = SafeParcelReader.createStringArray(object, n4);
                    continue block10;
                }
                case 4: {
                    nArray = SafeParcelReader.createIntArray(object, n4);
                    continue block10;
                }
                case 3: {
                    byArray = SafeParcelReader.createByteArray(object, n4);
                    continue block10;
                }
                case 2: 
            }
            creator = zzr.CREATOR;
            object2 = experimentTokensArray = SafeParcelReader.createParcelable(object, n4, creator);
            object2 = (zzr)experimentTokensArray;
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zze((zzr)object2, byArray, nArray, stringArray, nArray2, byArray2, bl2, experimentTokensArray2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zze[n3];
    }
}

