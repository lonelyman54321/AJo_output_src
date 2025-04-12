/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.ImeNestedScrollConnection;
import com.google.accompanist.insets.ImeNestedScrollConnection$onPostFling$2$1$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class ImeNestedScrollConnection$onPostFling$2$1
extends Lambda
implements Function1 {
    final /* synthetic */ bl_2 $cont;
    final /* synthetic */ ImeNestedScrollConnection this$0;

    public ImeNestedScrollConnection$onPostFling$2$1(bl_2 bl_22, ImeNestedScrollConnection imeNestedScrollConnection) {
        this.$cont = bl_22;
        this.this$0 = imeNestedScrollConnection;
        super(1);
    }

    public final void invoke(float f5) {
        bl_2 bl_22 = this.$cont;
        long l2 = XA3.a(0.0f, f5);
        WA3 wA3 = new WA3(l2);
        ImeNestedScrollConnection imeNestedScrollConnection = this.this$0;
        ImeNestedScrollConnection$onPostFling$2$1$1 imeNestedScrollConnection$onPostFling$2$1$1 = new ImeNestedScrollConnection$onPostFling$2$1$1(imeNestedScrollConnection);
        bl_22.B(imeNestedScrollConnection$onPostFling$2$1$1, wA3);
    }
}

