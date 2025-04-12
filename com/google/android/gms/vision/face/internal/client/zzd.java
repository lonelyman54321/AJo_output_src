/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;

public final class zzd
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        Object[] objectArray = null;
        int n7 = 0;
        Parcelable.Creator creator = null;
        Object[] objectArray2 = null;
        Object[] objectArray3 = null;
        int n8 = 0;
        int n10 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = -1.0f;
        block17: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block17;
                }
                case 15: {
                    f18 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 14: {
                    f14 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 13: {
                    creator = zza.CREATOR;
                    objectArray3 = objectArray = SafeParcelReader.createTypedArray(object, n4, creator);
                    objectArray3 = (zza[])objectArray;
                    continue block17;
                }
                case 12: {
                    f17 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 11: {
                    f16 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 10: {
                    f15 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 9: {
                    creator = LandmarkParcel.CREATOR;
                    objectArray2 = objectArray = SafeParcelReader.createTypedArray(object, n4, creator);
                    objectArray2 = (LandmarkParcel[])objectArray;
                    continue block17;
                }
                case 8: {
                    f12 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 7: {
                    f11 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 6: {
                    f8 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 5: {
                    f7 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 4: {
                    f6 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 3: {
                    f5 = SafeParcelReader.readFloat(object, n4);
                    continue block17;
                }
                case 2: {
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue block17;
                }
                case 1: 
            }
            n8 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new FaceParcel(n8, n10, f5, f6, f7, f8, f11, f12, f14, (LandmarkParcel[])objectArray2, f15, f16, f17, (zza[])objectArray3, f18);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new FaceParcel[n3];
    }
}

