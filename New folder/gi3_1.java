/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Gi3
 */
public final class gi3_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hw2_0 c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ dy2_1 f;

    public gi3_1(hw2_0 hw2_02, gx0_2 gx0_22, Function1 function1, dy2_1 dy2_12, f80_0 f80_02) {
        this.c = hw2_02;
        this.d = gx0_22;
        this.e = function1;
        this.f = dy2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.e;
        dy2_1 dy2_12 = this.f;
        hw2_0 hw2_02 = this.c;
        gx0_2 gx0_22 = this.d;
        gi3_1 gi3_12 = new gi3_1(hw2_02, gx0_22, function1, dy2_12, f80_02);
        gi3_12.b = object;
        return gi3_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gi3_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gi3_1)object).invokeSuspend(object2);
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
            Object object2 = object = this.b;
            object2 = (i90_0)object;
            dy2_1 dy2_12 = this.f;
            gx0_2 gx0_22 = this.d;
            Function1 function1 = this.e;
            object = new Gi3$a((i90_0)object2, gx0_22, function1, dy2_12, null);
            this.a = n4;
            hw2_0 hw2_02 = this.c;
            object = vv0_0.b(hw2_02, (Function2)object, this);
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

