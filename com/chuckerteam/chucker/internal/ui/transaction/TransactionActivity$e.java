/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.ui.transaction;

import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class TransactionActivity$e
extends Lambda
implements Function0 {
    public final /* synthetic */ TransactionActivity c;

    public TransactionActivity$e(TransactionActivity transactionActivity) {
        this.c = transactionActivity;
        super(0);
    }

    public final Object invoke() {
        long l2 = this.c.getIntent().getLongExtra("transaction_id", 0L);
        iq3_0 iq3_02 = new iq3_0(l2);
        return iq3_02;
    }
}

