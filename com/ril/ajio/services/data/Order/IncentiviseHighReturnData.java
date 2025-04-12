/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ResultIncentivise;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class IncentiviseHighReturnData
implements Serializable {
    private final String message;
    private final ResultIncentivise result;
    private final Integer statusCode;
    private final Boolean success;

    public IncentiviseHighReturnData() {
        this(null, null, null, null, 15, null);
    }

    public IncentiviseHighReturnData(String string2, ResultIncentivise resultIncentivise, Integer n3, Boolean bl2) {
        this.message = string2;
        this.result = resultIncentivise;
        this.statusCode = n3;
        this.success = bl2;
    }

    public /* synthetic */ IncentiviseHighReturnData(String string2, ResultIncentivise resultIncentivise, Integer n3, Boolean bl2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            resultIncentivise = null;
        }
        if ((n7 = n4 & 4) != 0) {
            n3 = null;
        }
        if ((n4 &= 8) != 0) {
            bl2 = Boolean.FALSE;
        }
        this(string2, resultIncentivise, n3, bl2);
    }

    public static /* synthetic */ IncentiviseHighReturnData copy$default(IncentiviseHighReturnData incentiviseHighReturnData, String string2, ResultIncentivise resultIncentivise, Integer n3, Boolean bl2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = incentiviseHighReturnData.message;
        }
        if ((n7 = n4 & 2) != 0) {
            resultIncentivise = incentiviseHighReturnData.result;
        }
        if ((n7 = n4 & 4) != 0) {
            n3 = incentiviseHighReturnData.statusCode;
        }
        if ((n4 &= 8) != 0) {
            bl2 = incentiviseHighReturnData.success;
        }
        return incentiviseHighReturnData.copy(string2, resultIncentivise, n3, bl2);
    }

    public final String component1() {
        return this.message;
    }

    public final ResultIncentivise component2() {
        return this.result;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final Boolean component4() {
        return this.success;
    }

    public final IncentiviseHighReturnData copy(String string2, ResultIncentivise resultIncentivise, Integer n3, Boolean bl2) {
        IncentiviseHighReturnData incentiviseHighReturnData = new IncentiviseHighReturnData(string2, resultIncentivise, n3, bl2);
        return incentiviseHighReturnData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof IncentiviseHighReturnData;
        if (!bl3) {
            return false;
        }
        object = (IncentiviseHighReturnData)object;
        Object object2 = this.message;
        Object object3 = ((IncentiviseHighReturnData)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.result;
        object3 = ((IncentiviseHighReturnData)object).result;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object3 = ((IncentiviseHighReturnData)object).statusCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.success;
        object = ((IncentiviseHighReturnData)object).success;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ResultIncentivise getResult() {
        return this.result;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.message;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.result;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = ((ResultIncentivise)serializable).hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.statusCode;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.success;
        if (serializable != null) {
            n7 = serializable.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.message;
        ResultIncentivise resultIncentivise = this.result;
        Integer n3 = this.statusCode;
        Boolean bl2 = this.success;
        StringBuilder stringBuilder = new StringBuilder("IncentiviseHighReturnData(message=");
        stringBuilder.append(string2);
        stringBuilder.append(", result=");
        stringBuilder.append(resultIncentivise);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", success=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

