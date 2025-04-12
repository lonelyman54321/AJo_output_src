/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.clearcut.zzr;

public final class zzs
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        int n7 = 0;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        int n8 = 0;
        int n10 = 0;
        boolean bl2 = true;
        boolean bl3 = false;
        int n14 = 0;
        block11: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block11;
                }
                case 10: {
                    n14 = SafeParcelReader.readInt(object, n4);
                    continue block11;
                }
                case 9: {
                    bl3 = SafeParcelReader.readBoolean(object, n4);
                    continue block11;
                }
                case 8: {
                    string5 = SafeParcelReader.createString(object, n4);
                    continue block11;
                }
                case 7: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block11;
                }
                case 6: {
                    string4 = SafeParcelReader.createString(object, n4);
                    continue block11;
                }
                case 5: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block11;
                }
                case 4: {
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue block11;
                }
                case 3: {
                    n8 = SafeParcelReader.readInt(object, n4);
                    continue block11;
                }
                case 2: 
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzr(string2, n8, n10, string3, string4, bl2, string5, bl3, n14);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr[n3];
    }
}

