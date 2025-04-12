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
import com.google.android.gms.internal.plus.zzr$zzb$zzb;
import java.util.HashSet;

public final class zzw
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
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        while ((n4 = object.dataPosition()) < n3) {
            int n14;
            block7: {
                block8: {
                    n4 = SafeParcelReader.readHeader(object);
                    int n15 = SafeParcelReader.getFieldId(n4);
                    if (n15 == (n14 = 1)) break block8;
                    n14 = 2;
                    if (n15 != n14) {
                        n14 = 3;
                        if (n15 != n14) {
                            n14 = 4;
                            if (n15 != n14) {
                                SafeParcelReader.skipUnknownField(object, n4);
                                continue;
                            }
                            n10 = SafeParcelReader.readInt(object, n4);
                            break block7;
                        } else {
                            string2 = SafeParcelReader.createString(object, n4);
                        }
                        break block7;
                    } else {
                        n8 = SafeParcelReader.readInt(object, n4);
                    }
                    break block7;
                }
                n7 = SafeParcelReader.readInt(object, n4);
            }
            Integer n16 = n14;
            hashSet.add(n16);
        }
        n4 = object.dataPosition();
        if (n4 == n3) {
            zzr$zzb$zzb zzr$zzb$zzb;
            zzr$zzb$zzb zzr$zzb$zzb2 = zzr$zzb$zzb;
            return new zzr$zzb$zzb(hashSet, n7, n8, string2, n10);
        }
        String string3 = tk3_2.a(37, n3, "Overread allowed size end=");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string3, (Parcel)object);
        throw safeParcelReader$ParseException;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr$zzb$zzb[n3];
    }
}

