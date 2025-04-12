/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from h92
 */
public final class h92_0
extends FunctionReferenceImpl
implements gx0_2 {
    public static final h92_0 a;

    static {
        h92_0 h92_02;
        a = h92_02 = new FunctionReferenceImpl(3, i92_0.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (i92_0)object;
        object2 = (gx2_2)object2;
        long l2 = ((i92_0)object).a;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 <= 0) {
            object = Unit.a;
            object2.c(object);
        } else {
            object3 = new g92_0(0, object2, object);
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            object2 = (fx2_2)object2;
            object = ((fx2_2)object2).a;
            ao0_1 ao0_12 = bo0_2.b((CoroutineContext)object);
            ((fx2_2)object2).c = object = ao0_12.H(l2, (Runnable)object3, (CoroutineContext)object);
        }
        return Unit.a;
    }
}

