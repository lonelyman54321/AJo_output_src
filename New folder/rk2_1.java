/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from Rk2
 */
public final class rk2_1
extends FunctionReferenceImpl
implements Function1 {
    public rk2_1(Function0 function0) {
        super(1, function0, sg3_1.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        sg3_1 sg3_12 = (sg3_1)this.receiver;
        sg3_12.getClass();
        rg3_1 rg3_12 = new rg3_1(sg3_12, null);
        return Ae3.g((f80_0)object, null, rg3_12);
    }
}

