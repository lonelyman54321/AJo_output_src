/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class xE2$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ xe2_1 a;
    public final /* synthetic */ int b;

    public xE2$b(xe2_1 xe2_12, int n3, f80_0 f80_02) {
        this.a = xe2_12;
        this.b = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xe2_1 xe2_12 = this.a;
        int n3 = this.b;
        object = new xE2$b(xe2_12, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xE2$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xE2$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        long l2;
        we2_2 we2_22;
        long l3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        long l4 = l3 = 0L;
        while (true) {
            long l7;
            object = this.a;
            ee_2 ee_22 = ((xe2_1)object).e;
            long l8 = af_2.c(ee_22);
            int n3 = this.b;
            long l12 = n3;
            we2_22 = ((xe2_1)object).b;
            l2 = -1;
            Object object3 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (object3 >= 0 || (l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) < 0) break;
            object = ((xe2_1)object).e;
            l4 = Long.MAX_VALUE;
            try {
                l4 = we2_22.i0((ee_2)object, l4);
            }
            catch (EOFException eOFException) {
                l4 = l2;
            }
        }
        Object object4 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (object4 == false) {
            we2_22.close();
            ((xe2_1)object).f.a();
            object2 = new yv_2(null);
            ((xe2_1)object).d = object2;
        }
        return Unit.a;
    }
}

