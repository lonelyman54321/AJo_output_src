/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.AdaptiveSearchReplayResponse;
import kotlin.jvm.internal.Intrinsics;

public final class AdaptiveSearchReplayResponse$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final AdaptiveSearchReplayResponse createFromParcel(Parcel object) {
        Boolean bl2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int bl3 = object.readInt();
        if (bl3 == 0) {
            boolean bl4 = false;
            bl2 = null;
        } else {
            void var3_8;
            int n3 = object.readInt();
            if (n3 != 0) {
                boolean bl5 = true;
            } else {
                boolean bl6 = false;
                bl2 = null;
            }
            bl2 = (boolean)var3_8;
        }
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        AdaptiveSearchReplayResponse adaptiveSearchReplayResponse = new AdaptiveSearchReplayResponse(bl2, string2, string3, (String)object);
        return adaptiveSearchReplayResponse;
    }

    public final AdaptiveSearchReplayResponse[] newArray(int n3) {
        return new AdaptiveSearchReplayResponse[n3];
    }
}

