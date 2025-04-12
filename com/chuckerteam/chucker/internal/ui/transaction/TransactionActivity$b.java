/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class TransactionActivity$b
extends Lambda
implements Function1 {
    public static final TransactionActivity$b c;

    static {
        TransactionActivity$b transactionActivity$b;
        c = transactionActivity$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (HttpTransaction)object;
        Intrinsics.checkNotNullParameter(object, "transaction");
        jq3_0 jq3_02 = new jq3_0((HttpTransaction)object);
        return jq3_02;
    }
}

