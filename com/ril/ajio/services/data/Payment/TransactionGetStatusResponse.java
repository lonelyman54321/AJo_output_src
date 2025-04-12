/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TransactionGetStatusResponse {
    private Error error;
    private TransactionInformation transactionInformation;
    private String transactionStatus;

    public TransactionGetStatusResponse() {
        this(null, null, null, 7, null);
    }

    public TransactionGetStatusResponse(Error error, String string2, TransactionInformation transactionInformation) {
        this.error = error;
        this.transactionStatus = string2;
        this.transactionInformation = transactionInformation;
    }

    public /* synthetic */ TransactionGetStatusResponse(Error error, String string2, TransactionInformation transactionInformation, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            error = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            transactionInformation = null;
        }
        this(error, string2, transactionInformation);
    }

    public static /* synthetic */ TransactionGetStatusResponse copy$default(TransactionGetStatusResponse transactionGetStatusResponse, Error error, String string2, TransactionInformation transactionInformation, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            error = transactionGetStatusResponse.error;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = transactionGetStatusResponse.transactionStatus;
        }
        if ((n3 &= 4) != 0) {
            transactionInformation = transactionGetStatusResponse.transactionInformation;
        }
        return transactionGetStatusResponse.copy(error, string2, transactionInformation);
    }

    public final Error component1() {
        return this.error;
    }

    public final String component2() {
        return this.transactionStatus;
    }

    public final TransactionInformation component3() {
        return this.transactionInformation;
    }

    public final TransactionGetStatusResponse copy(Error error, String string2, TransactionInformation transactionInformation) {
        TransactionGetStatusResponse transactionGetStatusResponse = new TransactionGetStatusResponse(error, string2, transactionInformation);
        return transactionGetStatusResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TransactionGetStatusResponse;
        if (!bl3) {
            return false;
        }
        object = (TransactionGetStatusResponse)object;
        Object object2 = this.error;
        Object object3 = ((TransactionGetStatusResponse)object).error;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionStatus;
        object3 = ((TransactionGetStatusResponse)object).transactionStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.transactionInformation;
        object = ((TransactionGetStatusResponse)object).transactionInformation;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Error getError() {
        return this.error;
    }

    public final TransactionInformation getTransactionInformation() {
        return this.transactionInformation;
    }

    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public int hashCode() {
        int n3;
        int n4;
        Error error = this.error;
        int n7 = 0;
        if (error == null) {
            n4 = 0;
            error = null;
        } else {
            n4 = error.hashCode();
        }
        n4 *= 31;
        Object object = this.transactionStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.transactionInformation;
        if (object != null) {
            n7 = ((TransactionInformation)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setError(Error error) {
        this.error = error;
    }

    public final void setTransactionInformation(TransactionInformation transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    public final void setTransactionStatus(String string2) {
        this.transactionStatus = string2;
    }

    public String toString() {
        Error error = this.error;
        String string2 = this.transactionStatus;
        TransactionInformation transactionInformation = this.transactionInformation;
        StringBuilder stringBuilder = new StringBuilder("TransactionGetStatusResponse(error=");
        stringBuilder.append(error);
        stringBuilder.append(", transactionStatus=");
        stringBuilder.append(string2);
        stringBuilder.append(", transactionInformation=");
        stringBuilder.append(transactionInformation);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

