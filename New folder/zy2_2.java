/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from ZY2
 */
public final class zy2_2
extends FunctionReferenceImpl
implements Function2 {
    public static final zy2_2 a;

    static {
        zy2_2 zy2_22;
        a = zy2_22 = new FunctionReferenceImpl(2, bz2_1.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    public final Object invoke(Object object, Object object2) {
        long l2 = ((Number)object).longValue();
        object2 = (cz2_1)object2;
        object = new cz2_1(l2, (cz2_1)object2, 0);
        return object;
    }
}

