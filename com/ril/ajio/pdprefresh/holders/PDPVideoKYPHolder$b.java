/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.holders;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class PDPVideoKYPHolder$b
implements F62,
FunctionAdapter {
    public final /* synthetic */ Function1 a;

    public PDPVideoKYPHolder$b(rh0_2 rh0_22) {
        Intrinsics.checkNotNullParameter(rh0_22, "function");
        this.a = rh0_22;
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
        return this.a;
    }

    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object object) {
        this.a.invoke(object);
    }
}

