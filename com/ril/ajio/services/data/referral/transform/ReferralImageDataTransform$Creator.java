/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.referral.transform;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform;
import kotlin.jvm.internal.Intrinsics;

public final class ReferralImageDataTransform$Creator
implements Parcelable.Creator {
    public final ReferralImageDataTransform createFromParcel(Parcel object) {
        ReferralImageDataTransform referralImageDataTransform;
        Object object2;
        Float f5;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        int n3 = object.readInt();
        Float f6 = null;
        if (n3 == 0) {
            f5 = null;
        } else {
            float f7 = object.readFloat();
            object2 = Float.valueOf(f7);
            f5 = object2;
        }
        n3 = object.readInt();
        if (n3 == 0) {
            object = null;
            float f8 = 0.0f;
        } else {
            float f11 = object.readFloat();
            object = Float.valueOf(f11);
        }
        object2 = referralImageDataTransform;
        f6 = f5;
        f5 = object;
        referralImageDataTransform = new ReferralImageDataTransform(string2, string3, string4, f6, (Float)object);
        return referralImageDataTransform;
    }

    public final ReferralImageDataTransform[] newArray(int n3) {
        return new ReferralImageDataTransform[n3];
    }
}

