/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.FEResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineResponse {
    private String message;
    private FEResult result;
    private Integer statusCode;
    private Boolean success;

    public FraudEngineResponse() {
        this(null, null, null, null, 15, null);
    }

    public FraudEngineResponse(Boolean bl2, String string2, Integer n3, FEResult fEResult) {
        this.success = bl2;
        this.message = string2;
        this.statusCode = n3;
        this.result = fEResult;
    }

    public /* synthetic */ FraudEngineResponse(Boolean bl2, String string2, Integer n3, FEResult fEResult, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 4) != 0) {
            n3 = 0;
        }
        if ((n4 &= 8) != 0) {
            fEResult = null;
        }
        this(bl2, string2, n3, fEResult);
    }

    public static /* synthetic */ FraudEngineResponse copy$default(FraudEngineResponse fraudEngineResponse, Boolean bl2, String string2, Integer n3, FEResult fEResult, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            bl2 = fraudEngineResponse.success;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = fraudEngineResponse.message;
        }
        if ((n7 = n4 & 4) != 0) {
            n3 = fraudEngineResponse.statusCode;
        }
        if ((n4 &= 8) != 0) {
            fEResult = fraudEngineResponse.result;
        }
        return fraudEngineResponse.copy(bl2, string2, n3, fEResult);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.message;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final FEResult component4() {
        return this.result;
    }

    public final FraudEngineResponse copy(Boolean bl2, String string2, Integer n3, FEResult fEResult) {
        FraudEngineResponse fraudEngineResponse = new FraudEngineResponse(bl2, string2, n3, fEResult);
        return fraudEngineResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FraudEngineResponse;
        if (!bl3) {
            return false;
        }
        object = (FraudEngineResponse)object;
        Object object2 = this.success;
        Object object3 = ((FraudEngineResponse)object).success;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((FraudEngineResponse)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object3 = ((FraudEngineResponse)object).statusCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.result;
        object = ((FraudEngineResponse)object).result;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final FEResult getResult() {
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
        Boolean bl2 = this.success;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.result;
        if (object != null) {
            n7 = ((FEResult)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setResult(FEResult fEResult) {
        this.result = fEResult;
    }

    public final void setStatusCode(Integer n3) {
        this.statusCode = n3;
    }

    public final void setSuccess(Boolean bl2) {
        this.success = bl2;
    }

    public String toString() {
        Boolean bl2 = this.success;
        String string2 = this.message;
        Integer n3 = this.statusCode;
        FEResult fEResult = this.result;
        StringBuilder stringBuilder = new StringBuilder("FraudEngineResponse(success=");
        stringBuilder.append(bl2);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", result=");
        stringBuilder.append(fEResult);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

