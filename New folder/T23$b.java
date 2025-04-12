/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class T23$b
implements fs0_2 {
    public final /* synthetic */ w23_0 a;

    public T23$b(w23_0 w23_02) {
        this.a = w23_02;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        object = (Number)object;
        long l2 = ((Number)object).longValue();
        Object object2 = yn3_0.a;
        Object object3 = new Long(l2);
        Object[] objectArray = new Object[]{object3};
        object3 = "SharedWithMeViewModel addSharedWithMe count: %s";
        ((yn3$a)object2).a((String)object3, objectArray);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            object2 = this.a;
            ((w23_0)object2).c(l2);
        }
        return Unit.a;
    }
}

