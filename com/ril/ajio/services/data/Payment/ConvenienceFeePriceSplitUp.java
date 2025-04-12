/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ConvenienceFeePriceSplitUp
implements Serializable {
    private ConvenienceFeePriceSplitUp$AmountData COD;
    private ConvenienceFeePriceSplitUp$AmountData RVP;
    private ConvenienceFeePriceSplitUp$AmountData delivery;
    private ConvenienceFeePriceSplitUp$AmountData priorityDelivery;
    private ConvenienceFeePriceSplitUp$AmountData total;

    public ConvenienceFeePriceSplitUp() {
        this(null, null, null, null, null, 31, null);
    }

    public ConvenienceFeePriceSplitUp(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData3, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData4, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData5) {
        this.COD = convenienceFeePriceSplitUp$AmountData;
        this.RVP = convenienceFeePriceSplitUp$AmountData2;
        this.delivery = convenienceFeePriceSplitUp$AmountData3;
        this.priorityDelivery = convenienceFeePriceSplitUp$AmountData4;
        this.total = convenienceFeePriceSplitUp$AmountData5;
    }

    public /* synthetic */ ConvenienceFeePriceSplitUp(ConvenienceFeePriceSplitUp$AmountData serializable, ConvenienceFeePriceSplitUp$AmountData object, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData3, int n3, DefaultConstructorMarker object2) {
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData4;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = serializable;
        }
        int n7 = n3 & 2;
        Object object3 = n7 != 0 ? null : object;
        n7 = n3 & 4;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData5 = n7 != 0 ? null : convenienceFeePriceSplitUp$AmountData;
        n7 = n3 & 8;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData6 = n7 != 0 ? null : convenienceFeePriceSplitUp$AmountData2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            convenienceFeePriceSplitUp$AmountData4 = null;
        } else {
            convenienceFeePriceSplitUp$AmountData4 = convenienceFeePriceSplitUp$AmountData3;
        }
        serializable = this;
        object = object2;
        convenienceFeePriceSplitUp$AmountData = object3;
        convenienceFeePriceSplitUp$AmountData2 = convenienceFeePriceSplitUp$AmountData5;
        convenienceFeePriceSplitUp$AmountData3 = convenienceFeePriceSplitUp$AmountData6;
        this((ConvenienceFeePriceSplitUp$AmountData)object2, (ConvenienceFeePriceSplitUp$AmountData)object3, convenienceFeePriceSplitUp$AmountData5, convenienceFeePriceSplitUp$AmountData6, convenienceFeePriceSplitUp$AmountData4);
    }

    public static /* synthetic */ ConvenienceFeePriceSplitUp copy$default(ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData, ConvenienceFeePriceSplitUp$AmountData serializable, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2, ConvenienceFeePriceSplitUp$AmountData object, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData3, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            convenienceFeePriceSplitUp$AmountData = convenienceFeePriceSplitUp.COD;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = convenienceFeePriceSplitUp.RVP;
        }
        object2 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            convenienceFeePriceSplitUp$AmountData2 = convenienceFeePriceSplitUp.delivery;
        }
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData4 = convenienceFeePriceSplitUp$AmountData2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object = convenienceFeePriceSplitUp.priorityDelivery;
        }
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData5 = object;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            convenienceFeePriceSplitUp$AmountData3 = convenienceFeePriceSplitUp.total;
        }
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData6 = convenienceFeePriceSplitUp$AmountData3;
        serializable = convenienceFeePriceSplitUp;
        convenienceFeePriceSplitUp$AmountData2 = convenienceFeePriceSplitUp$AmountData;
        object = object2;
        convenienceFeePriceSplitUp$AmountData3 = convenienceFeePriceSplitUp$AmountData4;
        object2 = convenienceFeePriceSplitUp$AmountData6;
        return convenienceFeePriceSplitUp.copy(convenienceFeePriceSplitUp$AmountData, (ConvenienceFeePriceSplitUp$AmountData)object, convenienceFeePriceSplitUp$AmountData4, convenienceFeePriceSplitUp$AmountData5, convenienceFeePriceSplitUp$AmountData6);
    }

    public final ConvenienceFeePriceSplitUp$AmountData component1() {
        return this.COD;
    }

    public final ConvenienceFeePriceSplitUp$AmountData component2() {
        return this.RVP;
    }

    public final ConvenienceFeePriceSplitUp$AmountData component3() {
        return this.delivery;
    }

    public final ConvenienceFeePriceSplitUp$AmountData component4() {
        return this.priorityDelivery;
    }

    public final ConvenienceFeePriceSplitUp$AmountData component5() {
        return this.total;
    }

    public final ConvenienceFeePriceSplitUp copy(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData3, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData4, ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData5) {
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp = new ConvenienceFeePriceSplitUp(convenienceFeePriceSplitUp$AmountData, convenienceFeePriceSplitUp$AmountData2, convenienceFeePriceSplitUp$AmountData3, convenienceFeePriceSplitUp$AmountData4, convenienceFeePriceSplitUp$AmountData5);
        return convenienceFeePriceSplitUp;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ConvenienceFeePriceSplitUp;
        if (!bl3) {
            return false;
        }
        object = (ConvenienceFeePriceSplitUp)object;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData = this.COD;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2 = ((ConvenienceFeePriceSplitUp)object).COD;
        bl3 = Intrinsics.areEqual(convenienceFeePriceSplitUp$AmountData, convenienceFeePriceSplitUp$AmountData2);
        if (!bl3) {
            return false;
        }
        convenienceFeePriceSplitUp$AmountData = this.RVP;
        convenienceFeePriceSplitUp$AmountData2 = ((ConvenienceFeePriceSplitUp)object).RVP;
        bl3 = Intrinsics.areEqual(convenienceFeePriceSplitUp$AmountData, convenienceFeePriceSplitUp$AmountData2);
        if (!bl3) {
            return false;
        }
        convenienceFeePriceSplitUp$AmountData = this.delivery;
        convenienceFeePriceSplitUp$AmountData2 = ((ConvenienceFeePriceSplitUp)object).delivery;
        bl3 = Intrinsics.areEqual(convenienceFeePriceSplitUp$AmountData, convenienceFeePriceSplitUp$AmountData2);
        if (!bl3) {
            return false;
        }
        convenienceFeePriceSplitUp$AmountData = this.priorityDelivery;
        convenienceFeePriceSplitUp$AmountData2 = ((ConvenienceFeePriceSplitUp)object).priorityDelivery;
        bl3 = Intrinsics.areEqual(convenienceFeePriceSplitUp$AmountData, convenienceFeePriceSplitUp$AmountData2);
        if (!bl3) {
            return false;
        }
        convenienceFeePriceSplitUp$AmountData = this.total;
        object = ((ConvenienceFeePriceSplitUp)object).total;
        boolean bl4 = Intrinsics.areEqual(convenienceFeePriceSplitUp$AmountData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ConvenienceFeePriceSplitUp$AmountData getCOD() {
        return this.COD;
    }

    public final ConvenienceFeePriceSplitUp$AmountData getDelivery() {
        return this.delivery;
    }

    public final ConvenienceFeePriceSplitUp$AmountData getPriorityDelivery() {
        return this.priorityDelivery;
    }

    public final ConvenienceFeePriceSplitUp$AmountData getRVP() {
        return this.RVP;
    }

    public final ConvenienceFeePriceSplitUp$AmountData getTotal() {
        return this.total;
    }

    public int hashCode() {
        int n3;
        int n4;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData = this.COD;
        int n7 = 0;
        if (convenienceFeePriceSplitUp$AmountData == null) {
            n4 = 0;
            convenienceFeePriceSplitUp$AmountData = null;
        } else {
            n4 = convenienceFeePriceSplitUp$AmountData.hashCode();
        }
        n4 *= 31;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2 = this.RVP;
        if (convenienceFeePriceSplitUp$AmountData2 == null) {
            n3 = 0;
            convenienceFeePriceSplitUp$AmountData2 = null;
        } else {
            n3 = convenienceFeePriceSplitUp$AmountData2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        convenienceFeePriceSplitUp$AmountData2 = this.delivery;
        if (convenienceFeePriceSplitUp$AmountData2 == null) {
            n3 = 0;
            convenienceFeePriceSplitUp$AmountData2 = null;
        } else {
            n3 = convenienceFeePriceSplitUp$AmountData2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        convenienceFeePriceSplitUp$AmountData2 = this.priorityDelivery;
        if (convenienceFeePriceSplitUp$AmountData2 == null) {
            n3 = 0;
            convenienceFeePriceSplitUp$AmountData2 = null;
        } else {
            n3 = convenienceFeePriceSplitUp$AmountData2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        convenienceFeePriceSplitUp$AmountData2 = this.total;
        if (convenienceFeePriceSplitUp$AmountData2 != null) {
            n7 = convenienceFeePriceSplitUp$AmountData2.hashCode();
        }
        return n4 + n7;
    }

    public final void setCOD(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData) {
        this.COD = convenienceFeePriceSplitUp$AmountData;
    }

    public final void setDelivery(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData) {
        this.delivery = convenienceFeePriceSplitUp$AmountData;
    }

    public final void setPriorityDelivery(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData) {
        this.priorityDelivery = convenienceFeePriceSplitUp$AmountData;
    }

    public final void setRVP(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData) {
        this.RVP = convenienceFeePriceSplitUp$AmountData;
    }

    public final void setTotal(ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData) {
        this.total = convenienceFeePriceSplitUp$AmountData;
    }

    public String toString() {
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData = this.COD;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData2 = this.RVP;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData3 = this.delivery;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData4 = this.priorityDelivery;
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData5 = this.total;
        StringBuilder stringBuilder = new StringBuilder("ConvenienceFeePriceSplitUp(COD=");
        stringBuilder.append(convenienceFeePriceSplitUp$AmountData);
        stringBuilder.append(", RVP=");
        stringBuilder.append(convenienceFeePriceSplitUp$AmountData2);
        stringBuilder.append(", delivery=");
        stringBuilder.append(convenienceFeePriceSplitUp$AmountData3);
        stringBuilder.append(", priorityDelivery=");
        stringBuilder.append(convenienceFeePriceSplitUp$AmountData4);
        stringBuilder.append(", total=");
        stringBuilder.append(convenienceFeePriceSplitUp$AmountData5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

