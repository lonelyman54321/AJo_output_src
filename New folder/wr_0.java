/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from wR
 */
public final class wr_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yr_0 b;
    public final /* synthetic */ ut2 c;
    public final /* synthetic */ bt2_2 d;

    public wr_0(yr_0 yr_02, xt1_0 xt1_02, bt2_2 bt2_22, f80_0 f80_02) {
        this.b = yr_02;
        this.c = xt1_02;
        this.d = bt2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yr_0 yr_02 = this.b;
        xt1_0 xt1_02 = (xt1_0)this.c;
        bt2_2 bt2_22 = this.d;
        object = new wr_0(yr_02, xt1_02, bt2_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Unit)object;
        object2 = (f80_0)object2;
        object = (wr_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wr_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            Object object3 = this.b;
            object = new wR$a((yr_0)object3);
            object = J83.k((Function0)object);
            xt1_0 xt1_02 = (xt1_0)this.c;
            bt2_2 bt2_22 = this.d;
            object3 = new wR$b(xt1_02, bt2_22, null);
            this.a = n4;
            object = ms0_1.f((es0_2)object, (Function2)object3, this);
            if (object == object2) {
                return object2;
            }
        }
        object2 = "Interceptors flow should never terminate.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

