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
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzao;

public final class zzar
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        Object[] objectArray = null;
        int n7 = 0;
        Parcelable.Creator creator = null;
        Object[] objectArray2 = null;
        Object object2 = null;
        Object object3 = null;
        String string2 = null;
        String string3 = null;
        float f5 = 0.0f;
        boolean bl2 = false;
        block9: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block9;
                }
                case 8: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block9;
                }
                case 7: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block9;
                }
                case 6: {
                    f5 = SafeParcelReader.readFloat(object, n4);
                    continue block9;
                }
                case 5: {
                    string2 = SafeParcelReader.createString(object, n4);
                    continue block9;
                }
                case 4: {
                    creator = zzab.CREATOR;
                    object3 = objectArray = SafeParcelReader.createParcelable(object, n4, creator);
                    object3 = (zzab)objectArray;
                    continue block9;
                }
                case 3: {
                    creator = zzab.CREATOR;
                    object2 = objectArray = SafeParcelReader.createParcelable(object, n4, creator);
                    object2 = (zzab)objectArray;
                    continue block9;
                }
                case 2: 
            }
            creator = zzal.CREATOR;
            objectArray2 = objectArray = SafeParcelReader.createTypedArray(object, n4, creator);
            objectArray2 = (zzal[])objectArray;
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzao((zzal[])objectArray2, (zzab)object2, (zzab)object3, string2, f5, string3, bl2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzao[n3];
    }
}

