/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from xJ
 */
public final class xj_1
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i90_0 d;

    public xj_1(f80_0 f80_02, aW aW2) {
        this.d = aW2;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        aW aW2 = (aW)this.d;
        xj_1 xj_12 = new xj_1((f80_0)object3, aW2);
        xj_12.b = object;
        xj_12.c = object2;
        object = Unit.a;
        return xj_12.invokeSuspend(object);
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
            Ml2 ml2 = (Ml2)this.c;
            aW aW2 = (aW)this.d;
            ar1_0 ar1_02 = new ar1_0(aW2, ml2);
            this.a = n4;
            object = object.emit(ar1_02, this);
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

