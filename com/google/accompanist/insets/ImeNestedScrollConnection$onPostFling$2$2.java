/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.ImeNestedScrollConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class ImeNestedScrollConnection$onPostFling$2$2
extends Lambda
implements Function1 {
    final /* synthetic */ ImeNestedScrollConnection this$0;

    public ImeNestedScrollConnection$onPostFling$2$2(ImeNestedScrollConnection imeNestedScrollConnection) {
        this.this$0 = imeNestedScrollConnection;
        super(1);
    }

    public final void invoke(Throwable throwable) {
        ImeNestedScrollConnection.access$getImeAnimController(this.this$0).cancel();
    }
}

