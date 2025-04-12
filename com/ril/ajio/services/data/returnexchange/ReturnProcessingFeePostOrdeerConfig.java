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
import com.ril.ajio.services.data.returnexchange.ReturnProcessingFeePostOrdeerConfig$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnProcessingFeePostOrdeerConfig
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean master;
    private final boolean refund_breakup;
    private final boolean return_creation;

    static {
        ReturnProcessingFeePostOrdeerConfig$Creator returnProcessingFeePostOrdeerConfig$Creator = new ReturnProcessingFeePostOrdeerConfig$Creator();
        CREATOR = returnProcessingFeePostOrdeerConfig$Creator;
    }

    public ReturnProcessingFeePostOrdeerConfig(boolean bl2, boolean bl3, boolean bl4) {
        this.master = bl2;
        this.return_creation = bl3;
        this.refund_breakup = bl4;
    }

    public static /* synthetic */ ReturnProcessingFeePostOrdeerConfig copy$default(ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig, boolean bl2, boolean bl3, boolean bl4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = returnProcessingFeePostOrdeerConfig.master;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = returnProcessingFeePostOrdeerConfig.return_creation;
        }
        if ((n3 &= 4) != 0) {
            bl4 = returnProcessingFeePostOrdeerConfig.refund_breakup;
        }
        return returnProcessingFeePostOrdeerConfig.copy(bl2, bl3, bl4);
    }

    public final boolean component1() {
        return this.master;
    }

    public final boolean component2() {
        return this.return_creation;
    }

    public final boolean component3() {
        return this.refund_breakup;
    }

    public final ReturnProcessingFeePostOrdeerConfig copy(boolean bl2, boolean bl3, boolean bl4) {
        ReturnProcessingFeePostOrdeerConfig returnProcessingFeePostOrdeerConfig = new ReturnProcessingFeePostOrdeerConfig(bl2, bl3, bl4);
        return returnProcessingFeePostOrdeerConfig;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnProcessingFeePostOrdeerConfig;
        if (!bl3) {
            return false;
        }
        object = (ReturnProcessingFeePostOrdeerConfig)object;
        bl3 = this.master;
        boolean bl4 = ((ReturnProcessingFeePostOrdeerConfig)object).master;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.return_creation;
        bl4 = ((ReturnProcessingFeePostOrdeerConfig)object).return_creation;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.refund_breakup;
        boolean bl5 = ((ReturnProcessingFeePostOrdeerConfig)object).refund_breakup;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final boolean getMaster() {
        return this.master;
    }

    public final boolean getRefund_breakup() {
        return this.refund_breakup;
    }

    public final boolean getReturn_creation() {
        return this.return_creation;
    }

    public int hashCode() {
        int n3 = this.master;
        int n4 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n3 *= 31;
        int n7 = this.return_creation;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.refund_breakup ? 1 : 0);
        if (n7 != 0) {
            n4 = 1231;
        }
        return n3 + n4;
    }

    public String toString() {
        boolean bl2 = this.master;
        boolean bl3 = this.return_creation;
        boolean bl4 = this.refund_breakup;
        StringBuilder stringBuilder = new StringBuilder("ReturnProcessingFeePostOrdeerConfig(master=");
        stringBuilder.append(bl2);
        stringBuilder.append(", return_creation=");
        stringBuilder.append(bl3);
        stringBuilder.append(", refund_breakup=");
        return Vm.a(")", bl4, stringBuilder);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        n3 = (int)(this.master ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.return_creation ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.refund_breakup ? 1 : 0);
        parcel.writeInt(n3);
    }
}

