/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Bu
 */
public final class bu_2 {
    public static void a(AtomicLong atomicLong, long l2) {
        long l3;
        long l4;
        boolean bl2;
        do {
            long l7;
            long l8;
            if ((l8 = (l7 = (l4 = atomicLong.get()) - (l3 = Long.MAX_VALUE)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
                return;
            }
            long l12 = l4 + l2;
            long l14 = 0L;
            long l15 = l12 - l14;
            Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object < 0) continue;
            l3 = l12;
        } while (!(bl2 = atomicLong.compareAndSet(l4, l3)));
    }

    public static final void b(mv2_0 object, long l2, Function1 function1, boolean bl2) {
        object = ((mv2_0)object).b;
        object = object != null ? ((zj1)object).b.b : null;
        if (object != null) {
            float f5;
            int n3 = object.getAction();
            if (bl2) {
                int n4 = 3;
                f5 = 4.2E-45f;
                object.setAction(n4);
            }
            f5 = -e72.d(l2);
            float f6 = -e72.e(l2);
            object.offsetLocation(f5, f6);
            function1.invoke(object);
            float f7 = e72.d(l2);
            float f8 = e72.e(l2);
            object.offsetLocation(f7, f8);
            object.setAction(n3);
            return;
        }
        String string2 = "The PointerEvent receiver cannot have a null MotionEvent.".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

