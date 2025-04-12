/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Credit;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreditActivityDetails {
    private final Float amount;
    private final String returnReferenceid;
    private final String transactionDate;
    private final String transactionReason;
    private final String transactionType;

    public CreditActivityDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public CreditActivityDetails(Float f5, String string2, String string3, String string4, String string5) {
        this.amount = f5;
        this.returnReferenceid = string2;
        this.transactionDate = string3;
        this.transactionType = string4;
        this.transactionReason = string5;
    }

    public /* synthetic */ CreditActivityDetails(Float f5, String object, String object2, String object3, String string2, int n3, DefaultConstructorMarker object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = Float.valueOf(0.0f);
        }
        n4 = n3 & 2;
        String string3 = null;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 4;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 == 0) {
            string3 = string2;
        }
        object = this;
        object2 = f5;
        object3 = object4;
        string2 = object5;
        object4 = string3;
        this(f5, (String)object3, (String)object5, (String)object6, string3);
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final String getReturnReferenceid() {
        return this.returnReferenceid;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final String getTransactionReason() {
        return this.transactionReason;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }
}

