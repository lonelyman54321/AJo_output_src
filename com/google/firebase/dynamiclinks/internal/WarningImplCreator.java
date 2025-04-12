/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl$WarningImpl;

public class WarningImplCreator
implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public static void writeToParcel(ShortDynamicLinkImpl$WarningImpl object, Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        object = ((ShortDynamicLinkImpl$WarningImpl)object).getMessage();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public ShortDynamicLinkImpl$WarningImpl createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        String string2 = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 2)) {
                SafeParcelReader.skipUnknownField(object, n3);
                continue;
            }
            string2 = SafeParcelReader.createString(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new ShortDynamicLinkImpl$WarningImpl(string2);
        return object;
    }

    public ShortDynamicLinkImpl$WarningImpl[] newArray(int n3) {
        return new ShortDynamicLinkImpl$WarningImpl[n3];
    }
}

