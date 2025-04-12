/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from eZ2
 */
public final class ez2_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ mz2_1 b;
    public /* synthetic */ db1_2 c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ da1_2 e;

    public ez2_2(gx0_2 gx0_22, da1_2 da1_22, f80_0 f80_02) {
        this.d = gx0_22;
        this.e = da1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (mz2_1)object;
        object2 = (db1_2)object2;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.d;
        da1_2 da1_22 = this.e;
        ez2_2 ez2_22 = new ez2_2(gx0_22, da1_22, (f80_0)object3);
        ez2_22.b = object;
        ez2_22.c = object2;
        object = Unit.a;
        return ez2_22.invokeSuspend(object);
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
            db1_2 db1_22 = this.c;
            CoroutineContext coroutineContext = this.e.e;
            dZ2$a dZ2$a = new dZ2$a((mz2_1)object, coroutineContext);
            this.b = null;
            this.a = n4;
            object = this.d.invoke(dZ2$a, db1_22, this);
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

