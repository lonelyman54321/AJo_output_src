/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from by2$a
 */
public final class by2$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2 c;

    public by2$a_0(Function2 function2, f80_0 f80_02) {
        this.c = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function2 function2 = this.c;
        by2$a_0 by2$a_0 = new by2$a_0(function2, f80_02);
        by2$a_0.b = object;
        return by2$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (my2_0)object;
        object2 = (f80_0)object2;
        object = (by2$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((by2$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 != bl3) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (my2_0)this.b;
            this.a = bl3;
            Function2 function2 = this.c;
            object = function2.invoke(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        Object object2 = object = (my2_0)object;
        ((kr1_1)object).b.set(bl3);
        return object;
    }
}

