/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzao;

public final class zzag
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        Object[] objectArray = null;
        int n7 = 0;
        Parcelable.Creator creator = null;
        Object[] objectArray2 = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        String string2 = null;
        String string3 = null;
        float f5 = 0.0f;
        int n8 = 0;
        boolean bl2 = false;
        int n10 = 0;
        int n14 = 0;
        block13: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block13;
                }
                case 12: {
                    n14 = SafeParcelReader.readInt(object, n4);
                    continue block13;
                }
                case 11: {
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue block13;
                }
                case 10: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block13;
                }
                case 9: {
                    n8 = SafeParcelReader.readInt(object, n4);
                    continue block13;
                }
                case 8: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block13;
                }
                case 7: {
                    f5 = SafeParcelReader.readFloat(object, n4);
                    continue block13;
                }
                case 6: {
                    string2 = SafeParcelReader.createString(object, n4);
                    continue block13;
                }
                case 5: {
                    creator = zzab.CREATOR;
                    object4 = objectArray = SafeParcelReader.createParcelable(object, n4, creator);
                    object4 = (zzab)objectArray;
                    continue block13;
                }
                case 4: {
                    creator = zzab.CREATOR;
                    object3 = objectArray = SafeParcelReader.createParcelable(object, n4, creator);
                    object3 = (zzab)objectArray;
                    continue block13;
                }
                case 3: {
                    creator = zzab.CREATOR;
                    object2 = objectArray = SafeParcelReader.createParcelable(object, n4, creator);
                    object2 = (zzab)objectArray;
                    continue block13;
                }
                case 2: 
            }
            creator = zzao.CREATOR;
            objectArray2 = objectArray = SafeParcelReader.createTypedArray(object, n4, creator);
            objectArray2 = (zzao[])objectArray;
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzah((zzao[])objectArray2, (zzab)object2, (zzab)object3, (zzab)object4, string2, f5, string3, n8, bl2, n10, n14);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzah[n3];
    }
}

