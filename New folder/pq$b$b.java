/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class pq$b$b
implements fs0_2,
FunctionAdapter {
    public final /* synthetic */ pq_0 a;

    public pq$b$b(pq_0 pq_02) {
        this.a = pq_02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        object = (pq$a_0)object;
        this.a.c((pq$a_0)object);
        object = Unit.a;
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof fs0_2;
        boolean bl3 = false;
        if (bl2 && (bl2 = object instanceof FunctionAdapter)) {
            fx0_2 fx0_22 = this.getFunctionDelegate();
            object = ((FunctionAdapter)object).getFunctionDelegate();
            bl3 = Intrinsics.areEqual(fx0_22, object);
        }
        return bl3;
    }

    public final fx0_2 getFunctionDelegate() {
        pq_0 pq_02 = this.a;
        AdaptedFunctionReference adaptedFunctionReference = new AdaptedFunctionReference(2, pq_02, pq_0.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        return adaptedFunctionReference;
    }

    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }
}

