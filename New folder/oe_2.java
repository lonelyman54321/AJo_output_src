/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oE
 */
public final class oe_2
extends FunctionReferenceImpl
implements Function2 {
    public static final oe_2 a;

    static {
        oe_2 oe_22;
        a = oe_22 = new FunctionReferenceImpl(2, pe_2.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final Object invoke(Object object, Object object2) {
        long l2 = ((Number)object).longValue();
        Object object3 = object2;
        object3 = (wr_2)object2;
        object = pe_2.a;
        le_2 le_22 = ((wr_2)object3).e;
        Intrinsics.checkNotNull(le_22);
        object = new wr_2(l2, (wr_2)object3, le_22, 0);
        return object;
    }
}

