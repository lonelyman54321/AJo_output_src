/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ResponseError {
    private String exceptionMsg;
    private int respCode;
    private String supportId;

    public ResponseError() {
        this(0, null, null, 7, null);
    }

    public ResponseError(int n3, String string2, String string3) {
        this.respCode = n3;
        this.exceptionMsg = string2;
        this.supportId = string3;
    }

    public /* synthetic */ ResponseError(int n3, String string2, String string3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = 0;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = null;
        }
        if ((n4 &= 4) != 0) {
            string3 = null;
        }
        this(n3, string2, string3);
    }

    public static /* synthetic */ ResponseError copy$default(ResponseError responseError, int n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = responseError.respCode;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = responseError.exceptionMsg;
        }
        if ((n4 &= 4) != 0) {
            string3 = responseError.supportId;
        }
        return responseError.copy(n3, string2, string3);
    }

    public final int component1() {
        return this.respCode;
    }

    public final String component2() {
        return this.exceptionMsg;
    }

    public final String component3() {
        return this.supportId;
    }

    public final ResponseError copy(int n3, String string2, String string3) {
        ResponseError responseError = new ResponseError(n3, string2, string3);
        return responseError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ResponseError;
        if (n3 == 0) {
            return false;
        }
        object = (ResponseError)object;
        n3 = this.respCode;
        int n4 = ((ResponseError)object).respCode;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.exceptionMsg;
        String string3 = ((ResponseError)object).exceptionMsg;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.supportId;
        object = ((ResponseError)object).supportId;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public final int getRespCode() {
        return this.respCode;
    }

    public final String getSupportId() {
        return this.supportId;
    }

    public int hashCode() {
        int n3;
        int n4 = this.respCode * 31;
        String string2 = this.exceptionMsg;
        int n7 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.supportId;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setExceptionMsg(String string2) {
        this.exceptionMsg = string2;
    }

    public final void setRespCode(int n3) {
        this.respCode = n3;
    }

    public final void setSupportId(String string2) {
        this.supportId = string2;
    }

    public String toString() {
        int n3 = this.respCode;
        String string2 = this.exceptionMsg;
        String string3 = this.supportId;
        return h30_0.a(Fh3.a(n3, "ResponseError(respCode=", ", exceptionMsg=", string2, ", supportId="), string3, ")");
    }
}

