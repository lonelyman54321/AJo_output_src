/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class tk2$e
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sk2 d;

    public tk2$e(f80_0 f80_02, sk2 sk22) {
        this.d = sk22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        sk2 sk22 = this.d;
        tk2$e tk2$e = new tk2$e((f80_0)object3, sk22);
        tk2$e.b = object;
        tk2$e.c = object2;
        object = Unit.a;
        return tk2$e.invokeSuspend(object);
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
            Object object2 = (sk2$a)this.c;
            Object object3 = ((sk2$a)object2).a;
            Object object4 = this.d;
            object4.getClass();
            object3 = ((yk2_1)object3).m;
            int n7 = 2;
            Object object5 = new qg3_2(n7, null);
            vt0_2 vt0_22 = new vt0_2((es0_2)object3, (Function2)object5);
            String string2 = "retryEventBus";
            Intrinsics.checkNotNullParameter(((sk2)object4).e, string2);
            object5 = new Object();
            object2 = ((sk2$a)object2).a;
            object4 = new sk2$b((yk2_1)object2);
            object2 = ll2_0.c;
            object3 = new Ml2(vt0_22, (tu3)object5, (z61)object4, (Function0)object2);
            this.a = n4;
            object = object.emit(object3, this);
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

