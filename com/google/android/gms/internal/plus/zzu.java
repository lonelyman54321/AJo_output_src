/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.plus.zzr$zzb;
import com.google.android.gms.internal.plus.zzr$zzb$zza;
import com.google.android.gms.internal.plus.zzr$zzb$zzb;
import java.util.HashSet;

public final class zzu
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n4 = 0;
        Object var5_6 = null;
        Object var6_14 = null;
        Object var7_19 = null;
        int n7 = 0;
        int n8 = 0;
        while ((n4 = object.dataPosition()) < n3) {
            int n10;
            block7: {
                block8: {
                    n4 = SafeParcelReader.readHeader(object);
                    int n14 = SafeParcelReader.getFieldId(n4);
                    if (n14 == (n10 = 1)) break block8;
                    n10 = 2;
                    if (n14 != n10) {
                        n10 = 3;
                        if (n14 != n10) {
                            n10 = 4;
                            if (n14 != n10) {
                                SafeParcelReader.skipUnknownField(object, n4);
                                continue;
                            }
                            n8 = SafeParcelReader.readInt(object, n4);
                            break block7;
                        } else {
                            Parcelable parcelable;
                            Parcelable.Creator creator = zzr$zzb$zzb.CREATOR;
                            Parcelable parcelable2 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                            zzr$zzb$zzb zzr$zzb$zzb = (zzr$zzb$zzb)parcelable;
                        }
                        break block7;
                    } else {
                        Parcelable parcelable;
                        Parcelable.Creator creator = zzr$zzb$zza.CREATOR;
                        Parcelable parcelable3 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                        zzr$zzb$zza zzr$zzb$zza = (zzr$zzb$zza)parcelable;
                    }
                    break block7;
                }
                n7 = SafeParcelReader.readInt(object, n4);
            }
            Integer n15 = n10;
            hashSet.add(n15);
        }
        n4 = object.dataPosition();
        if (n4 == n3) {
            void var7_20;
            void var6_15;
            zzr$zzb zzr$zzb;
            zzr$zzb zzr$zzb2 = zzr$zzb;
            return new zzr$zzb(hashSet, n7, (zzr$zzb$zza)var6_15, (zzr$zzb$zzb)var7_20, n8);
        }
        String string2 = tk3_2.a(37, n3, "Overread allowed size end=");
        SafeParcelReader$ParseException safeParcelReader$ParseException = new SafeParcelReader$ParseException(string2, (Parcel)object);
        throw safeParcelReader$ParseException;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr$zzb[n3];
    }
}

