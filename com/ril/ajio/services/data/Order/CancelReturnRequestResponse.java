/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.CancelReturnErrorResponse;
import kotlin.jvm.internal.Intrinsics;

public final class CancelReturnRequestResponse {
    private String content;
    private CancelReturnErrorResponse errorResponse;
    private int responseCode;
    private String status;

    public CancelReturnRequestResponse(String string2, int n3, String string3, CancelReturnErrorResponse cancelReturnErrorResponse) {
        Intrinsics.checkNotNullParameter(cancelReturnErrorResponse, "errorResponse");
        this.content = string2;
        this.responseCode = n3;
        this.status = string3;
        this.errorResponse = cancelReturnErrorResponse;
    }

    public static /* synthetic */ CancelReturnRequestResponse copy$default(CancelReturnRequestResponse cancelReturnRequestResponse, String string2, int n3, String string3, CancelReturnErrorResponse cancelReturnErrorResponse, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = cancelReturnRequestResponse.content;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = cancelReturnRequestResponse.responseCode;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = cancelReturnRequestResponse.status;
        }
        if ((n4 &= 8) != 0) {
            cancelReturnErrorResponse = cancelReturnRequestResponse.errorResponse;
        }
        return cancelReturnRequestResponse.copy(string2, n3, string3, cancelReturnErrorResponse);
    }

    public final String component1() {
        return this.content;
    }

    public final int component2() {
        return this.responseCode;
    }

    public final String component3() {
        return this.status;
    }

    public final CancelReturnErrorResponse component4() {
        return this.errorResponse;
    }

    public final CancelReturnRequestResponse copy(String string2, int n3, String string3, CancelReturnErrorResponse cancelReturnErrorResponse) {
        Intrinsics.checkNotNullParameter(cancelReturnErrorResponse, "errorResponse");
        CancelReturnRequestResponse cancelReturnRequestResponse = new CancelReturnRequestResponse(string2, n3, string3, cancelReturnErrorResponse);
        return cancelReturnRequestResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CancelReturnRequestResponse;
        if (n3 == 0) {
            return false;
        }
        object = (CancelReturnRequestResponse)object;
        Object object2 = this.content;
        String string2 = ((CancelReturnRequestResponse)object).content;
        n3 = Intrinsics.areEqual(object2, string2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.responseCode;
        int n4 = ((CancelReturnRequestResponse)object).responseCode;
        if (n3 != n4) {
            return false;
        }
        object2 = this.status;
        string2 = ((CancelReturnRequestResponse)object).status;
        n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.errorResponse;
        object = ((CancelReturnRequestResponse)object).errorResponse;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getContent() {
        return this.content;
    }

    public final CancelReturnErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        String string2 = this.content;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n7 = this.responseCode;
        n3 = (n3 + n7) * 31;
        String string3 = this.status;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        return this.errorResponse.hashCode() + n3;
    }

    public final void setContent(String string2) {
        this.content = string2;
    }

    public final void setErrorResponse(CancelReturnErrorResponse cancelReturnErrorResponse) {
        Intrinsics.checkNotNullParameter(cancelReturnErrorResponse, "<set-?>");
        this.errorResponse = cancelReturnErrorResponse;
    }

    public final void setResponseCode(int n3) {
        this.responseCode = n3;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public String toString() {
        CharSequence charSequence = this.content;
        int n3 = this.responseCode;
        String string2 = this.status;
        CancelReturnErrorResponse cancelReturnErrorResponse = this.errorResponse;
        charSequence = oe3_0.a(n3, "CancelReturnRequestResponse(content=", (String)charSequence, ", responseCode=", ", status=");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", errorResponse=");
        ((StringBuilder)charSequence).append(cancelReturnErrorResponse);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

