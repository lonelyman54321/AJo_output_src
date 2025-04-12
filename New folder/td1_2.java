/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Td1
 */
public final class td1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ tr1_0 c;

    public td1_2(f80_0 f80_02, tr1_0 tr1_02, Function1 function1) {
        this.b = function1;
        this.c = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.b;
        tr1_0 tr1_02 = this.c;
        object = new td1_2(f80_02, tr1_02, function1);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (td1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((td1_2)object).invokeSuspend(object2);
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
            Object object2 = this.b;
            object = new wd1_2((Function1)object2, null);
            object2 = new br2_2((Function2)object);
            int n7 = 3;
            object = new qg3_2(n7, null);
            Object object3 = new at0_1((es0_2)object2, (gx0_2)object);
            object = ms0_1.h((es0_2)object3);
            object2 = ht2_2.a;
            object = ms0_1.m((es0_2)object, (CoroutineContext)object2);
            object3 = this.c;
            object2 = new Td1$a((tr1_0)object3);
            this.a = n4;
            object = object.collect((fs0_2)object2, this);
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

