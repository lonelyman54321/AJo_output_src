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
import com.google.android.gms.vision.face.internal.client.zzf;

public final class zze
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        int n7 = -1082130432;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        float f5 = -1.0f;
        block8: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block8;
                }
                case 7: {
                    f5 = SafeParcelReader.readFloat(object, n4);
                    continue block8;
                }
                case 6: {
                    bl3 = SafeParcelReader.readBoolean(object, n4);
                    continue block8;
                }
                case 5: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block8;
                }
                case 4: {
                    n14 = SafeParcelReader.readInt(object, n4);
                    continue block8;
                }
                case 3: {
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue block8;
                }
                case 2: 
            }
            n8 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzf(n8, n10, n14, bl2, bl3, f5);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzf[n3];
    }
}

