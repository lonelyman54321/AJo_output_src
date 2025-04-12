/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ik$a
 */
public final class ik$a_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Lj c;
    public final /* synthetic */ ib3_0 d;
    public final /* synthetic */ ib3_0 e;

    public ik$a_0(Object object, Lj lj, tr1_0 tr1_02, tr1_0 tr1_03, f80_0 f80_02) {
        this.b = object;
        this.c = lj;
        this.d = tr1_02;
        this.e = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.d;
        ib3_0 ib3_02 = object2;
        ib3_02 = (tr1_0)object2;
        object2 = this.e;
        ib3_0 ib3_03 = object2;
        ib3_03 = (tr1_0)object2;
        Object object3 = this.b;
        Lj lj = this.c;
        object2 = object;
        object = new ik$a_0(object3, lj, (tr1_0)ib3_02, (tr1_0)ib3_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ik$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ik$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        Lj lj = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = lj.e.getValue();
            Object object2 = this.b;
            boolean bl2 = Intrinsics.areEqual(object2, object);
            if (bl2) return Unit.a;
            object = jk_1.a;
            Object object3 = object = this.d.getValue();
            object3 = (Gl)object;
            this.a = n4;
            Lj lj2 = this.c;
            Object object4 = this.b;
            int n7 = 12;
            object = Lj.c(lj2, object4, (Gl)object3, null, this, n7);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = jk_1.a;
        object = (Function1)this.e.getValue();
        if (object == null) return Unit.a;
        Object object5 = lj.d();
        object.invoke(object5);
        return Unit.a;
    }
}

