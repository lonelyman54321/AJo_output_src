/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzpm;

public final class zzaj
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        Parcelable parcelable = null;
        long l2 = 0L;
        String string2 = null;
        String string3 = null;
        Parcelable parcelable2 = null;
        String string4 = null;
        Parcelable parcelable3 = null;
        Parcelable parcelable4 = null;
        Parcelable parcelable5 = null;
        long l3 = l2;
        long l4 = l2;
        long l7 = l2;
        boolean bl2 = false;
        block13: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            int n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block13;
                }
                case 12: {
                    Parcelable.Creator creator = zzbl.CREATOR;
                    parcelable5 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                    parcelable5 = (zzbl)parcelable;
                    continue block13;
                }
                case 11: {
                    l7 = SafeParcelReader.readLong(object, n4);
                    continue block13;
                }
                case 10: {
                    Parcelable.Creator creator = zzbl.CREATOR;
                    parcelable4 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                    parcelable4 = (zzbl)parcelable;
                    continue block13;
                }
                case 9: {
                    l4 = SafeParcelReader.readLong(object, n4);
                    continue block13;
                }
                case 8: {
                    Parcelable.Creator creator = zzbl.CREATOR;
                    parcelable3 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                    parcelable3 = (zzbl)parcelable;
                    continue block13;
                }
                case 7: {
                    string4 = SafeParcelReader.createString(object, n4);
                    continue block13;
                }
                case 6: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block13;
                }
                case 5: {
                    l3 = SafeParcelReader.readLong(object, n4);
                    continue block13;
                }
                case 4: {
                    Parcelable.Creator creator = zzpm.CREATOR;
                    parcelable2 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                    parcelable2 = (zzpm)parcelable;
                    continue block13;
                }
                case 3: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block13;
                }
                case 2: 
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzag(string2, string3, (zzpm)parcelable2, l3, bl2, string4, (zzbl)parcelable3, l4, (zzbl)parcelable4, l7, (zzbl)parcelable5);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzag[n3];
    }
}

