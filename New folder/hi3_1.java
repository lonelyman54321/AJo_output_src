/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Hi3
 */
public final class hi3_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hw2_0 c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;

    public hi3_1(hw2_0 hw2_02, gx0_2 gx0_22, Function1 function1, Function1 function12, Function1 function13, f80_0 f80_02) {
        this.c = hw2_02;
        this.d = gx0_22;
        this.e = function1;
        this.f = function12;
        this.g = function13;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.f;
        Function1 function12 = this.g;
        hw2_0 hw2_02 = this.c;
        gx0_2 gx0_22 = this.d;
        Function1 function13 = this.e;
        hi3_1 hi3_12 = new hi3_1(hw2_02, gx0_22, function13, function1, function12, f80_02);
        hi3_12.b = object;
        return hi3_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hi3_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hi3_1)object).invokeSuspend(object2);
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
            object = this.c;
            dy2_1 dy2_12 = new dy2_1((Vo0)object);
            Function1 function1 = this.g;
            gx0_2 gx0_22 = this.d;
            Function1 function12 = this.e;
            Function1 function13 = this.f;
            hi3$a_1 hi3$a_1 = new hi3$a_1((i90_0)object2, gx0_22, function12, function13, function1, dy2_12, null);
            this.a = n4;
            object = vv0_0.b((hw2_0)object, hi3$a_1, this);
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

