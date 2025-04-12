/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Qv3
extends qg3_2
implements hx0_2 {
    public int a;
    public /* synthetic */ long b;

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        long l2 = ((Number)object3).longValue();
        object4 = (f80_0)object4;
        object3 = new qg3_2(4, (f80_0)object4);
        ((Qv3)object3).b = l2;
        object = Unit.a;
        return ((Qv3)object3).invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            long l2 = this.b;
            object = qx1.a();
            n3 = Sv3.b;
            object.getClass();
            int n7 = 30000;
            long l3 = n7;
            l2 *= l3;
            l3 = Sv3.a;
            l2 = Math.min(l2, l3);
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object != j90_02) return Boolean.TRUE;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Boolean.TRUE;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

