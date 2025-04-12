/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Xm0$a$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xm0_0 c;
    public final /* synthetic */ Function2 d;

    public Xm0$a$a(xm0_0 xm0_02, Function2 function2, f80_0 f80_02) {
        this.c = xm0_02;
        this.d = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xm0_0 xm0_02 = this.c;
        Function2 function2 = this.d;
        Xm0$a$a xm0$a$a = new Xm0$a$a(xm0_02, function2, f80_02);
        xm0$a$a.b = object;
        return xm0$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (Xm0$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Xm0$a$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Throwable throwable2;
        xm0_0 xm0_02;
        Object object3;
        block6: {
            block5: {
                object3 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                int n4 = 1;
                xm0_02 = this.c;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    try {
                        vl2_2.b(object);
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                vl2_2.b(object);
                object = (QT2)this.b;
                object2 = xm0_02.d;
                Boolean bl2 = Boolean.TRUE;
                ((h83_0)object2).setValue(bl2);
                {
                    object2 = this.d;
                    this.a = n4;
                    object = object2.invoke(object, this);
                    if (object != object3) break block5;
                    return object3;
                }
            }
            object = xm0_02.d;
            object3 = Boolean.FALSE;
            ((h83_0)object).setValue(object3);
            return Unit.a;
        }
        object3 = xm0_02.d;
        object2 = Boolean.FALSE;
        ((h83_0)object3).setValue(object2);
        throw throwable2;
    }
}

