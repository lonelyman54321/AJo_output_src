/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;

public class DynamicLinkDataCreator
implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public static void writeToParcel(DynamicLinkData dynamicLinkData, Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = dynamicLinkData.getDynamicLink();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = dynamicLinkData.getDeepLink();
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        int n7 = dynamicLinkData.getMinVersion();
        SafeParcelWriter.writeInt(parcel, 3, n7);
        long l2 = dynamicLinkData.getClickTimestamp();
        SafeParcelWriter.writeLong(parcel, 4, l2);
        string3 = dynamicLinkData.getExtensionBundle();
        SafeParcelWriter.writeBundle(parcel, 5, (Bundle)string3, false);
        dynamicLinkData = dynamicLinkData.getRedirectUrl();
        SafeParcelWriter.writeParcelable(parcel, 6, dynamicLinkData, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public DynamicLinkData createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        Object object2 = null;
        int n7 = 0;
        Parcelable.Creator creator = null;
        long l2 = 0L;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        long l3 = l2;
        int n8 = 0;
        block8: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block8;
                }
                case 6: {
                    creator = Uri.CREATOR;
                    object6 = object2 = (Uri)SafeParcelReader.createParcelable(object, n4, creator);
                    continue block8;
                }
                case 5: {
                    object5 = object2 = SafeParcelReader.createBundle(object, n4);
                    continue block8;
                }
                case 4: {
                    long l4;
                    l3 = l4 = SafeParcelReader.readLong(object, n4);
                    continue block8;
                }
                case 3: {
                    n8 = n4 = SafeParcelReader.readInt(object, n4);
                    continue block8;
                }
                case 2: {
                    object4 = object2 = SafeParcelReader.createString(object, n4);
                    continue block8;
                }
                case 1: 
            }
            object3 = object2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new DynamicLinkData((String)object3, (String)object4, n8, l3, (Bundle)object5, (Uri)object6);
        return object;
    }

    public DynamicLinkData[] newArray(int n3) {
        return new DynamicLinkData[n3];
    }
}

