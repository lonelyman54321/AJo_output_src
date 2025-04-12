/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Xd1
 */
public final class xd1_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object2 = new qg3_2(3, (f80_0)object3);
        ((xd1_2)object2).b = object;
        object = Unit.a;
        return ((xd1_2)object2).invokeSuspend(object);
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
            object = this.b;
            zd1$a_0 zd1$a_0 = new zd1$a_0(null, null);
            this.a = n4;
            object = object.emit(zd1$a_0, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

