/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class kU0
implements FunctionAdapter {
    public final /* synthetic */ Function1 a;

    public kU0(Function1 function1) {
        this.a = function1;
    }

    public final void a(gU0 gU02) {
        this.a.invoke(gU02);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof kU0;
        boolean bl3 = false;
        if (bl2 && (bl2 = object instanceof FunctionAdapter)) {
            fx0_2 fx0_22 = this.a;
            object = ((FunctionAdapter)object).getFunctionDelegate();
            bl3 = Intrinsics.areEqual(fx0_22, object);
        }
        return bl3;
    }

    public final fx0_2 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return ((fx0_2)this.a).hashCode();
    }
}

