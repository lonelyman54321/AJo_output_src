/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from fB1$b
 */
public final class fb1$b_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ hw2_0 b;
    public final /* synthetic */ Sj3 c;

    public fb1$b_0(hw2_0 hw2_02, Sj3 sj3, f80_0 f80_02) {
        this.b = hw2_02;
        this.c = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hw2_0 hw2_02 = this.b;
        Sj3 sj3 = this.c;
        object = new fb1$b_0(hw2_02, sj3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fb1$b_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fb1$b_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        this.a = n4;
        Object object2 = this.c;
        object = new gb1_0((Sj3)object2);
        hb1_1 hb1_12 = new hb1_1(object2, 0);
        ib1_1 ib1_12 = new ib1_1((Sj3)object2);
        jb1_1 jb1_12 = new jb1_1((Sj3)object2);
        os0_0 os0_02 = new os0_0((gb1_0)object);
        ps0_0 ps0_02 = new ps0_0(hb1_12);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        qs0_0 qs0_02 = qs0_0.c;
        object = new rs0_0(qs0_02, ref$LongRef, null, os0_02, jb1_12, ib1_12, ps0_02, null);
        object2 = this.b;
        object = vv0_0.b((hw2_0)object2, (Function2)object, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

