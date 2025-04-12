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
import com.google.android.gms.internal.plus.zzr$zze;
import java.util.HashSet;

public final class zzz
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
        String string8 = null;
        int n7 = 0;
        boolean bl2 = false;
        int n8 = 0;
        block12: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            int n10 = SafeParcelReader.getFieldId(n4);
            switch (n10) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block12;
                }
                case 10: {
                    n8 = SafeParcelReader.readInt(object, n4);
                    n4 = 10;
                    break;
                }
                case 9: {
                    string8 = SafeParcelReader.createString(object, n4);
                    n4 = 9;
                    break;
                }
                case 8: {
                    string7 = SafeParcelReader.createString(object, n4);
                    n4 = 8;
                    break;
                }
                case 7: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
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
            Integer n14 = n4;
            hashSet.add(n14);
        }
        n4 = object.dataPosition();
        if (n4 == n3) {
            zzr$zze zzr$zze;
            zzr$zze zzr$zze2 = zzr$zze;
            return new zzr$zze(hashSet, n7, string2, string3, string4, string5, string6, bl2, string7, string8, n8);
        }
        String string9 = tk3_2.a(37, n3, "Overread allowed size end=");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string9, (Parcel)object);
        throw safeParcelReader$ParseException;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr$zze[n3];
    }
}

