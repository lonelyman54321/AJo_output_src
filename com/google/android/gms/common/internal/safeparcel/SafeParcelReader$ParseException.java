/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class SafeParcelReader$ParseException
extends RuntimeException {
    public SafeParcelReader$ParseException(String string2, Parcel parcel) {
        int n3 = parcel.dataPosition();
        int n4 = parcel.dataSize();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" Parcel: pos=");
        stringBuilder.append(n3);
        stringBuilder.append(" size=");
        stringBuilder.append(n4);
        string2 = stringBuilder.toString();
        super(string2);
    }
}

