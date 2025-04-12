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
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeeConfig;
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeePostOrdeerConfig;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnProcessingFeeConfig$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final ReturnProcessingFeeConfig createFromParcel(Parcel object) {
        void var3_6;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int bl2 = object.readInt();
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        object = (ReturnProcessingFeePostOrdeerConfig)ReturnProcessingFeePostOrdeerConfig.CREATOR.createFromParcel((Parcel)object);
        ReturnProcessingFeeConfig returnProcessingFeeConfig = new ReturnProcessingFeeConfig((boolean)var3_6, (ReturnProcessingFeePostOrdeerConfig)object);
        return returnProcessingFeeConfig;
    }

    public final ReturnProcessingFeeConfig[] newArray(int n3) {
        return new ReturnProcessingFeeConfig[n3];
    }
}

