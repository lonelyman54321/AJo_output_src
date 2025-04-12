/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import java.util.List;

public final class CleverTapInstanceConfig$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        Object object;
        CleverTapInstanceConfig cleverTapInstanceConfig = new Object();
        Object object2 = zb2_0.b();
        cleverTapInstanceConfig.g = object2;
        object2 = q50_0.g;
        cleverTapInstanceConfig.t = object2;
        cleverTapInstanceConfig.a = object2 = parcel.readString();
        cleverTapInstanceConfig.c = object2 = parcel.readString();
        cleverTapInstanceConfig.b = object2 = parcel.readString();
        cleverTapInstanceConfig.d = object2 = parcel.readString();
        cleverTapInstanceConfig.e = object2 = parcel.readString();
        cleverTapInstanceConfig.f = object2 = parcel.readString();
        int n4 = parcel.readByte();
        boolean bl2 = false;
        ClassLoader classLoader = null;
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        cleverTapInstanceConfig.h = n4;
        n4 = parcel.readByte();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        cleverTapInstanceConfig.p = n4;
        n4 = parcel.readByte();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        cleverTapInstanceConfig.v = n4;
        n4 = parcel.readByte();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        cleverTapInstanceConfig.m = n4;
        n4 = parcel.readByte();
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        cleverTapInstanceConfig.s = n4;
        cleverTapInstanceConfig.l = n4 = parcel.readInt();
        byte by2 = parcel.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object = null;
        }
        cleverTapInstanceConfig.k = by2;
        by2 = parcel.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object = null;
        }
        cleverTapInstanceConfig.u = by2;
        by2 = parcel.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object = null;
        }
        cleverTapInstanceConfig.i = by2;
        by2 = parcel.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object = null;
        }
        cleverTapInstanceConfig.n = by2;
        object = parcel.readString();
        cleverTapInstanceConfig.o = object;
        object = parcel.readString();
        cleverTapInstanceConfig.r = object;
        cleverTapInstanceConfig.q = object = new b(n4);
        n4 = parcel.readByte();
        if (n4 != 0) {
            bl2 = true;
        }
        cleverTapInstanceConfig.j = bl2;
        cleverTapInstanceConfig.g = object2 = new ArrayList();
        classLoader = String.class.getClassLoader();
        parcel.readList((List)object2, classLoader);
        object2 = parcel.createStringArray();
        cleverTapInstanceConfig.t = object2;
        cleverTapInstanceConfig.w = n3 = parcel.readInt();
        return cleverTapInstanceConfig;
    }

    public final Object[] newArray(int n3) {
        return new CleverTapInstanceConfig[n3];
    }
}

