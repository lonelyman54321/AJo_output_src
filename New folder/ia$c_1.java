/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iA$c
 */
public final class ia$c_1
implements F62,
FunctionAdapter {
    public final /* synthetic */ Function1 a;

    public ia$c_1(ga_1 ga_12) {
        Intrinsics.checkNotNullParameter(ga_12, "function");
        this.a = ga_12;
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

