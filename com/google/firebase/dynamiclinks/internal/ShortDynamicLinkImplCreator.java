/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl$WarningImpl;
import java.util.List;

public class ShortDynamicLinkImplCreator
implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public static void writeToParcel(ShortDynamicLinkImpl object, Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Uri uri = ((ShortDynamicLinkImpl)object).getShortLink();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)uri, n3, false);
        Uri uri2 = ((ShortDynamicLinkImpl)object).getPreviewLink();
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)uri2, n3, false);
        object = ((ShortDynamicLinkImpl)object).getWarnings();
        SafeParcelWriter.writeTypedList(parcel, 3, (List)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public ShortDynamicLinkImpl createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Parcelable.Creator creator = null;
        Parcelable.Creator creator2 = null;
        Object object2 = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 1)) {
                n7 = 2;
                if (n8 != n7) {
                    n7 = 3;
                    if (n8 != n7) {
                        SafeParcelReader.skipUnknownField(object, n3);
                        continue;
                    }
                    object2 = ShortDynamicLinkImpl$WarningImpl.CREATOR;
                    object2 = SafeParcelReader.createTypedList(object, n3, object2);
                    continue;
                }
                creator2 = Uri.CREATOR;
                creator2 = (Uri)SafeParcelReader.createParcelable(object, n3, creator2);
                continue;
            }
            creator = Uri.CREATOR;
            creator = (Uri)SafeParcelReader.createParcelable(object, n3, creator);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new ShortDynamicLinkImpl((Uri)creator, (Uri)creator2, (List)object2);
        return object;
    }

    public ShortDynamicLinkImpl[] newArray(int n3) {
        return new ShortDynamicLinkImpl[n3];
    }
}

