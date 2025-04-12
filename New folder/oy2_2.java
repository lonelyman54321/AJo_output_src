/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from oY2
 */
public final class oy2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ Lj d;

    public oy2_2(ib3_0 ib3_02, Lj lj, f80_0 f80_02) {
        this.c = ib3_02;
        this.d = lj;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ib3_0 ib3_02 = this.c;
        Lj lj = this.d;
        oy2_2 oy2_22 = new oy2_2(ib3_02, lj, f80_02);
        oy2_22.b = object;
        return oy2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oy2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oy2_2)object).invokeSuspend(object2);
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
            object = (i90_0)this.b;
            Object object2 = this.c;
            Object object3 = new oY2$a((ib3_0)object2);
            object3 = J83.k((Function0)object3);
            Lj lj = this.d;
            object2 = new oY2$b(lj, (i90_0)object);
            this.a = n4;
            object = ((m0_0)object3).collect((fs0_2)object2, this);
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

