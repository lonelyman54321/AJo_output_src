/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fB1
 */
public final class fb1_1
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ hw2_0 b;
    public final /* synthetic */ Sj3 c;

    public fb1_1(hw2_0 hw2_02, Sj3 sj3, f80_0 f80_02) {
        this.b = hw2_02;
        this.c = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hw2_0 hw2_02 = this.b;
        Sj3 sj3 = this.c;
        fb1_1 fb1_12 = new fb1_1(hw2_02, sj3, f80_02);
        fb1_12.a = object;
        return fb1_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fb1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fb1_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Enum enum_ = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        enum_ = l90_0.UNDISPATCHED;
        hw2_0 hw2_02 = this.b;
        Sj3 sj3 = this.c;
        qg3_2 qg3_22 = new fb1$a_0(hw2_02, sj3, null);
        int n3 = 1;
        Ae3.d((i90_0)object, null, (l90_0)enum_, qg3_22, n3);
        qg3_22 = new fb1$b_0(hw2_02, sj3, null);
        return Ae3.d((i90_0)object, null, (l90_0)enum_, qg3_22, n3);
    }
}

