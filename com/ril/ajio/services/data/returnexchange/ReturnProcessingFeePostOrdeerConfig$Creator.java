/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.returnexchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeePostOrdeerConfig;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnProcessingFeePostOrdeerConfig$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final ReturnProcessingFeePostOrdeerConfig createFromParcel(Parcel parcel) {
        void var5_11;
        void var3_6;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int bl2 = parcel.readInt();
        boolean bl3 = false;
        if (bl2 != 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
        }
        int n3 = parcel.readInt();
        if (n3 != 0) {
            boolean bl6 = true;
        } else {
            boolean bl7 = false;
        }
        int n4 = parcel.readInt();
        if (n4 != 0) {
            bl3 = true;
        }
        ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig = new ReturnProcessingFeePostOrdeerConfig((boolean)var3_6, (boolean)var5_11, bl3);
        return returnProcessingFeePostOrdeerConfig;
    }

    public final ReturnProcessingFeePostOrdeerConfig[] newArray(int n3) {
        return new ReturnProcessingFeePostOrdeerConfig[n3];
    }
}

