/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from li2$b
 */
public final class li2$b_0
implements F62,
FunctionAdapter {
    public final /* synthetic */ Function1 a;

    public li2$b_0(ii2_2 ii2_22) {
        Intrinsics.checkNotNullParameter(ii2_22, "function");
        this.a = ii2_22;
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

