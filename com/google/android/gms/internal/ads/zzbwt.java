/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbws;
import java.util.ArrayList;
import java.util.List;

public final class zzbwt
implements Parcelable.Creator {
    public static final zzbws zza(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        float f5 = 0.0f;
        Object object2 = null;
        int n7 = 0;
        Parcelable.Creator creator = null;
        long l2 = 0L;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        Object object7 = null;
        Object object8 = null;
        Object object9 = null;
        Object object10 = null;
        Object object11 = null;
        Object object12 = null;
        Object object13 = null;
        Object object14 = null;
        Object object15 = null;
        Object object16 = null;
        Object object17 = null;
        Object object18 = null;
        Object object19 = null;
        Object object20 = null;
        Object object21 = null;
        Object object22 = null;
        Object object23 = null;
        Object object24 = null;
        Object object25 = null;
        Object object26 = null;
        Object object27 = null;
        Object object28 = null;
        Object object29 = null;
        Object object30 = null;
        Object object31 = null;
        Object object32 = null;
        Object object33 = null;
        Object object34 = null;
        Object object35 = null;
        Object object36 = null;
        Object object37 = null;
        Object object38 = null;
        Object object39 = null;
        long l3 = l2;
        long l4 = l2;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        block60: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block60;
                }
                case 65: {
                    object39 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block60;
                }
                case 64: {
                    object38 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 63: {
                    creator = zzbnz.CREATOR;
                    object37 = object2 = (zzbnz)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 61: {
                    object36 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 60: {
                    object35 = object2 = SafeParcelReader.createStringList(object, n4);
                    continue block60;
                }
                case 59: {
                    n29 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 58: {
                    n28 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 57: {
                    n27 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 56: {
                    n26 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 55: {
                    object34 = object2 = SafeParcelReader.createStringList(object, n4);
                    continue block60;
                }
                case 54: {
                    object33 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 53: {
                    object32 = object2 = SafeParcelReader.createIntegerList(object, n4);
                    continue block60;
                }
                case 52: {
                    n25 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 51: {
                    object31 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 50: {
                    object30 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 49: {
                    object29 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 48: {
                    object28 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block60;
                }
                case 47: {
                    n24 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 46: {
                    creator = zzdu.CREATOR;
                    object27 = object2 = (zzdu)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 45: {
                    object26 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 44: {
                    object25 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block60;
                }
                case 43: {
                    n22 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 42: {
                    n21 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 41: {
                    object24 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 40: {
                    n17 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 39: {
                    object23 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 37: {
                    n20 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 36: {
                    n19 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 35: {
                    n18 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 34: {
                    f7 = f5 = SafeParcelReader.readFloat(object, n4);
                    continue block60;
                }
                case 33: {
                    object22 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 31: {
                    long l7;
                    l4 = l7 = SafeParcelReader.readLong(object, n4);
                    continue block60;
                }
                case 30: {
                    object21 = object2 = SafeParcelReader.createStringList(object, n4);
                    continue block60;
                }
                case 29: {
                    creator = zzbhk.CREATOR;
                    object20 = object2 = (zzbhk)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 28: {
                    object19 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 27: {
                    object18 = object2 = SafeParcelReader.createStringList(object, n4);
                    continue block60;
                }
                case 26: {
                    object17 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 25: {
                    long l7;
                    l3 = l7 = SafeParcelReader.readLong(object, n4);
                    continue block60;
                }
                case 21: {
                    object16 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 20: {
                    f6 = f5 = SafeParcelReader.readFloat(object, n4);
                    continue block60;
                }
                case 19: {
                    n16 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 18: {
                    n15 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 16: {
                    n14 = n4 = (int)(SafeParcelReader.readBoolean(object, n4) ? 1 : 0);
                    continue block60;
                }
                case 15: {
                    object15 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block60;
                }
                case 14: {
                    object14 = object2 = SafeParcelReader.createStringList(object, n4);
                    continue block60;
                }
                case 13: {
                    n10 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block60;
                }
                case 12: {
                    object13 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block60;
                }
                case 11: {
                    creator = VersionInfoParcel.CREATOR;
                    object12 = object2 = (VersionInfoParcel)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 10: {
                    object11 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 9: {
                    object10 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 8: {
                    object9 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 7: {
                    creator = PackageInfo.CREATOR;
                    object8 = object2 = (PackageInfo)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 6: {
                    creator = ApplicationInfo.CREATOR;
                    object7 = object2 = (ApplicationInfo)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 5: {
                    object6 = object2 = SafeParcelReader.createString(object, n4);
                    continue block60;
                }
                case 4: {
                    creator = zzq.CREATOR;
                    object5 = object2 = (zzq)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 3: {
                    creator = zzl.CREATOR;
                    object4 = object2 = (zzl)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block60;
                }
                case 2: {
                    object3 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block60;
                }
                case 1: 
            }
            n8 = n4 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzbws(n8, (Bundle)object3, (zzl)object4, (zzq)object5, (String)object6, (ApplicationInfo)object7, (PackageInfo)object8, (String)object9, (String)object10, (String)object11, (VersionInfoParcel)object12, (Bundle)object13, n10, (List)object14, (Bundle)object15, n14 != 0, n15, n16, f6, (String)object16, l3, (String)object17, (List)object18, (String)object19, (zzbhk)object20, (List)object21, l4, (String)object22, f7, n17 != 0, n18, n19, n20 != 0, (String)object23, (String)object24, n21 != 0, n22, (Bundle)object25, (String)object26, (zzdu)object27, n24 != 0, (Bundle)object28, (String)object29, (String)object30, (String)object31, n25 != 0, (List)object32, (String)object33, (List)object34, n26, n27 != 0, n28 != 0, n29 != 0, (ArrayList)object35, (String)object36, (zzbnz)object37, (String)object38, (Bundle)object39);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzbws[n3];
    }
}

