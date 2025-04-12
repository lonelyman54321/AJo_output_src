/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class tZ2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gx0_2 d;

    public tZ2(xl2_0 xl2_02, f80_0 f80_02) {
        this.d = xl2_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object3 = (f80_0)object3;
        xl2_0 xl2_02 = (xl2_0)this.d;
        tZ2 tZ22 = new tZ2(xl2_02, (f80_0)object3);
        tZ22.b = object;
        tZ22.c = object2;
        object = Unit.a;
        return tZ22.invokeSuspend(object);
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
            this.b = null;
            this.a = n4;
            gx0_2 gx0_22 = this.d;
            object = gx0_22.invoke(object, object2, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

