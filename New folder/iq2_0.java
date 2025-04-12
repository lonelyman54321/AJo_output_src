/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from IQ2
 */
public final class iq2_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Throwable c;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        iq2_0 iq2_02 = new qg3_2(3, (f80_0)object3);
        iq2_02.b = object;
        iq2_02.c = object2;
        object = Unit.a;
        return iq2_02.invokeSuspend(object);
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
            Object object2 = this.c;
            object2 = ((Throwable)object2).getMessage();
            int n7 = 2;
            KK2$a kK2$a = new KK2$a((String)object2, null, n7);
            this.b = null;
            this.a = n4;
            object = object.emit(kK2$a, this);
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

