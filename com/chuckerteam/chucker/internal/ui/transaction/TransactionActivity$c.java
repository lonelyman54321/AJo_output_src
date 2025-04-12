/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class TransactionActivity$c
extends Lambda
implements Function1 {
    public final /* synthetic */ TransactionActivity c;

    public TransactionActivity$c(TransactionActivity transactionActivity) {
        this.c = transactionActivity;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (HttpTransaction)object;
        Intrinsics.checkNotNullParameter(object, "transaction");
        int bl2 = TransactionActivity.k0;
        Object object2 = this.c.p2().b.d();
        Intrinsics.checkNotNull(object2);
        Intrinsics.checkNotNullExpressionValue(object2, "viewModel.encodeUrl.value!!");
        boolean bl3 = (Boolean)object2;
        kq3_0 kq3_02 = new kq3_0((HttpTransaction)object, bl3);
        return kq3_02;
    }
}

