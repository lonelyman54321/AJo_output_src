/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.plus.zzr$zzd;
import java.util.HashSet;

public final class zzy
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n4 = 0;
        Object var5_6 = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        int n7 = 0;
        block9: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n4);
            switch (n8) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block9;
                }
                case 7: {
                    string7 = SafeParcelReader.createString(object, n4);
                    n4 = 7;
                    break;
                }
                case 6: {
                    string6 = SafeParcelReader.createString(object, n4);
                    n4 = 6;
                    break;
                }
                case 5: {
                    string5 = SafeParcelReader.createString(object, n4);
                    n4 = 5;
                    break;
                }
                case 4: {
                    string4 = SafeParcelReader.createString(object, n4);
                    n4 = 4;
                    break;
                }
                case 3: {
                    string3 = SafeParcelReader.createString(object, n4);
                    n4 = 3;
                    break;
                }
                case 2: {
                    string2 = SafeParcelReader.createString(object, n4);
                    n4 = 2;
                    break;
                }
                case 1: {
                    n7 = SafeParcelReader.readInt(object, n4);
                    n4 = 1;
                }
            }
            Integer n10 = n4;
            hashSet.add(n10);
        }
        n4 = object.dataPosition();
        if (n4 == n3) {
            zzr$zzd zzr$zzd;
            zzr$zzd zzr$zzd2 = zzr$zzd;
            return new zzr$zzd(hashSet, n7, string2, string3, string4, string5, string6, string7);
        }
        String string8 = tk3_2.a(37, n3, "Overread allowed size end=");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string8, (Parcel)object);
        throw safeParcelReader$ParseException;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr$zzd[n3];
    }
}

