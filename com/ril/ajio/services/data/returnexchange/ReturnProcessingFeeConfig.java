/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.returnexchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeeConfig$Creator;
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeePostOrdeerConfig;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnProcessingFeeConfig
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean return_processing_fee_cart;
    private final ReturnProcessingFeePostOrdeerConfig return_processing_fee_post_order;

    static {
        ReturnProcessingFeeConfig$Creator returnProcessingFeeConfig$Creator = new ReturnProcessingFeeConfig$Creator();
        CREATOR = returnProcessingFeeConfig$Creator;
    }

    public ReturnProcessingFeeConfig(boolean bl2, ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig) {
        Intrinsics.checkNotNullParameter(returnProcessingFeePostOrdeerConfig, "return_processing_fee_post_order");
        this.return_processing_fee_cart = bl2;
        this.return_processing_fee_post_order = returnProcessingFeePostOrdeerConfig;
    }

    public static /* synthetic */ ReturnProcessingFeeConfig copy$default(ReturnProcessingFeeConfig returnProcessingFeeConfig, boolean bl2, ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = returnProcessingFeeConfig.return_processing_fee_cart;
        }
        if ((n3 &= 2) != 0) {
            returnProcessingFeePostOrdeerConfig = returnProcessingFeeConfig.return_processing_fee_post_order;
        }
        return returnProcessingFeeConfig.copy(bl2, returnProcessingFeePostOrdeerConfig);
    }

    public final boolean component1() {
        return this.return_processing_fee_cart;
    }

    public final ReturnProcessingFeePostOrdeerConfig component2() {
        return this.return_processing_fee_post_order;
    }

    public final ReturnProcessingFeeConfig copy(boolean bl2, ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig) {
        Intrinsics.checkNotNullParameter(returnProcessingFeePostOrdeerConfig, "return_processing_fee_post_order");
        ReturnProcessingFeeConfig returnProcessingFeeConfig = new ReturnProcessingFeeConfig(bl2, returnProcessingFeePostOrdeerConfig);
        return returnProcessingFeeConfig;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnProcessingFeeConfig;
        if (!bl3) {
            return false;
        }
        object = (ReturnProcessingFeeConfig)object;
        bl3 = this.return_processing_fee_cart;
        boolean bl4 = ((ReturnProcessingFeeConfig)object).return_processing_fee_cart;
        if (bl3 != bl4) {
            return false;
        }
        ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig = this.return_processing_fee_post_order;
        object = ((ReturnProcessingFeeConfig)object).return_processing_fee_post_order;
        boolean bl5 = Intrinsics.areEqual(returnProcessingFeePostOrdeerConfig, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final boolean getReturn_processing_fee_cart() {
        return this.return_processing_fee_cart;
    }

    public final ReturnProcessingFeePostOrdeerConfig getReturn_processing_fee_post_order() {
        return this.return_processing_fee_post_order;
    }

    public int hashCode() {
        int n3 = this.return_processing_fee_cart;
        n3 = n3 != 0 ? 1231 : 1237;
        return this.return_processing_fee_post_order.hashCode() + (n3 *= 31);
    }

    public String toString() {
        boolean bl2 = this.return_processing_fee_cart;
        ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig = this.return_processing_fee_post_order;
        StringBuilder stringBuilder = new StringBuilder("ReturnProcessingFeeConfig(return_processing_fee_cart=");
        stringBuilder.append(bl2);
        stringBuilder.append(", return_processing_fee_post_order=");
        stringBuilder.append(returnProcessingFeePostOrdeerConfig);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        int n4 = this.return_processing_fee_cart;
        parcel.writeInt(n4);
        this.return_processing_fee_post_order.writeToParcel(parcel, n3);
    }
}

