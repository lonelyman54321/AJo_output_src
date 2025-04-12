/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class lE$c
extends FunctionReferenceImpl
implements gx0_2 {
    public static final lE$c a;

    static {
        lE$c lE$c;
        a = lE$c = new FunctionReferenceImpl(3, le_2.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block11: {
            block10: {
                Object object4;
                object = (le_2)object;
                object2 = (gx2_2)object2;
                object3 = le_2.d;
                object.getClass();
                object3 = (wr_2)le_2.i.get(object);
                while (true) {
                    int n3;
                    if ((n3 = ((le_2)object).B()) != 0) {
                        object = pe_2.l;
                        object2.c(object);
                        break block10;
                    }
                    object4 = le_2.e;
                    long l2 = ((AtomicLongFieldUpdater)object4).getAndIncrement(object);
                    n3 = pe_2.b;
                    long l3 = n3;
                    long l4 = l2 / l3;
                    int n4 = (int)(l2 % l3);
                    l3 = ((wx2_2)object3).c;
                    long l7 = l3 - l4;
                    Object object5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object5 != false) {
                        object4 = ((le_2)object).t(l4, (wr_2)object3);
                        if (object4 == null) continue;
                        object3 = object4;
                    }
                    object4 = object;
                    Object object6 = object3;
                    int n7 = n4;
                    object4 = ((le_2)object).L((wr_2)object3, n4, l2, object2);
                    if (object4 == (object6 = pe_2.m)) {
                        boolean bl2 = object2 instanceof me3_2;
                        if ((object2 = bl2 ? (me3_2)object2 : null) != null) {
                            object2.a((wx2_2)object3, n4);
                        }
                        break block10;
                    }
                    object6 = pe_2.o;
                    if (object4 != object6) break;
                    l3 = ((le_2)object).x();
                    long l8 = l2 - l3;
                    n7 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                    if (n7 >= 0) continue;
                    ((d40_0)object3).a();
                }
                object = pe_2.n;
                if (object4 == object) break block11;
                ((d40_0)object3).a();
                object2.c(object4);
            }
            return Unit.a;
        }
        object2 = "unexpected".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

