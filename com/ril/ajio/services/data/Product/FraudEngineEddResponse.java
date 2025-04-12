/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.FraudEngineResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineEddResponse {
    private final FraudEngineResult result;
    private final int statusCode;
    private final boolean success;

    public FraudEngineEddResponse() {
        this(false, 0, null, 7, null);
    }

    public FraudEngineEddResponse(boolean bl2, int n3, FraudEngineResult fraudEngineResult) {
        this.success = bl2;
        this.statusCode = n3;
        this.result = fraudEngineResult;
    }

    public /* synthetic */ FraudEngineEddResponse(boolean bl2, int n3, FraudEngineResult fraudEngineResult, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            bl2 = false;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = 0;
        }
        if ((n4 &= 4) != 0) {
            fraudEngineResult = null;
        }
        this(bl2, n3, fraudEngineResult);
    }

    public static /* synthetic */ FraudEngineEddResponse copy$default(FraudEngineEddResponse fraudEngineEddResponse, boolean bl2, int n3, FraudEngineResult fraudEngineResult, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            bl2 = fraudEngineEddResponse.success;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = fraudEngineEddResponse.statusCode;
        }
        if ((n4 &= 4) != 0) {
            fraudEngineResult = fraudEngineEddResponse.result;
        }
        return fraudEngineEddResponse.copy(bl2, n3, fraudEngineResult);
    }

    public final boolean component1() {
        return this.success;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final FraudEngineResult component3() {
        return this.result;
    }

    public final FraudEngineEddResponse copy(boolean bl2, int n3, FraudEngineResult fraudEngineResult) {
        FraudEngineEddResponse fraudEngineEddResponse = new FraudEngineEddResponse(bl2, n3, fraudEngineResult);
        return fraudEngineEddResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof FraudEngineEddResponse;
        if (n3 == 0) {
            return false;
        }
        object = (FraudEngineEddResponse)object;
        n3 = this.success;
        int n4 = ((FraudEngineEddResponse)object).success;
        if (n3 != n4) {
            return false;
        }
        n3 = this.statusCode;
        n4 = ((FraudEngineEddResponse)object).statusCode;
        if (n3 != n4) {
            return false;
        }
        FraudEngineResult fraudEngineResult = this.result;
        object = ((FraudEngineEddResponse)object).result;
        boolean bl3 = Intrinsics.areEqual(fraudEngineResult, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final FraudEngineResult getResult() {
        return this.result;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int n3 = this.success;
        n3 = n3 != 0 ? 1231 : 1237;
        n3 *= 31;
        int n4 = this.statusCode;
        n3 = (n3 + n4) * 31;
        FraudEngineResult fraudEngineResult = this.result;
        if (fraudEngineResult == null) {
            n4 = 0;
            fraudEngineResult = null;
        } else {
            n4 = fraudEngineResult.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        boolean bl2 = this.success;
        int n3 = this.statusCode;
        FraudEngineResult fraudEngineResult = this.result;
        StringBuilder stringBuilder = new StringBuilder("FraudEngineEddResponse(success=");
        stringBuilder.append(bl2);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", result=");
        stringBuilder.append(fraudEngineResult);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

