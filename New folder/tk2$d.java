/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class tk2$d
implements fs0_2,
FunctionAdapter {
    public final /* synthetic */ x53_0 a;

    public tk2$d(x53_0 x53_02) {
        this.a = x53_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (Ml2)object;
        x53_0 x53_02 = this.a;
        if ((object = x53_02.o((f80_0)object2, object)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
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
        x53_0 x53_02 = this.a;
        FunctionReferenceImpl functionReferenceImpl = new FunctionReferenceImpl(2, x53_02, x53_0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        return functionReferenceImpl;
    }

    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }
}

