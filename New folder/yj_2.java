/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from yJ
 */
public final class yj_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ ar1_0 b;
    public /* synthetic */ ar1_0 c;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (ar1_0)object;
        object2 = (ar1_0)object2;
        object3 = (f80_0)object3;
        yj_2 yj_22 = new qg3_2(3, (f80_0)object3);
        yj_22.b = object;
        yj_22.c = object2;
        object = Unit.a;
        return yj_22.invokeSuspend(object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        ar1_0 ar1_02;
        void var2_5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                ar1_0 ar1_03 = this.b;
                vl2_2.b(object);
                return var2_5;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        this.b = ar1_02 = this.c;
        this.a = n4;
        object = ((ar1_0)object).c.d;
        n4 = 0;
        ((JobSupport)object).d(null);
        object = Unit.a;
        if (object == j90_02) {
            return j90_02;
        }
        ar1_0 ar1_04 = ar1_02;
        return var2_5;
    }
}

