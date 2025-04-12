/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class yh0$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yh0_0 b;
    public final /* synthetic */ Integer c;

    public yh0$a(yh0_0 yh0_02, Integer n3, f80_0 f80_02) {
        this.b = yh0_02;
        this.c = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yh0_0 yh0_02 = this.b;
        Integer n3 = this.c;
        object = new yh0$a(yh0_02, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yh0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yh0$a)object).invokeSuspend(object2);
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
            Object object2 = ((yh0_0)object).a;
            object2.getClass();
            Object object3 = this.c;
            Object object4 = new lo2_1((NO2)object2, (Integer)object3, null);
            object2 = new br2_2((Function2)object4);
            object4 = ir0_2.a;
            object4 = em0_2.b;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object4);
            object4 = new mo2_1((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object4 = new yh0$a$a((yh0_0)object, null);
            object3 = new at0_1((es0_2)object2, (gx0_2)object4);
            object2 = new yh0$a$b((yh0_0)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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

