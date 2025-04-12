/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.itemdetail;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

final class CCItemDetailFragment$sam$androidx_lifecycle_Observer$0
implements F62,
FunctionAdapter {
    private final /* synthetic */ Function1 function;

    public CCItemDetailFragment$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "function");
        this.function = function1;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof F62;
        boolean bl3 = false;
        if (bl2 && (bl2 = object instanceof FunctionAdapter)) {
            fx0_2 fx0_22 = this.getFunctionDelegate();
            object = ((FunctionAdapter)object).getFunctionDelegate();
            bl3 = Intrinsics.areEqual(fx0_22, object);
        }
        return bl3;
    }

    public final fx0_2 getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object object) {
        this.function.invoke(object);
    }
}

