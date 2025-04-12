/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Fx1$e
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fw1_2 e;

    public Fx1$e(boolean bl2, fw1_2 fw1_22, f80_0 f80_02) {
        this.d = bl2;
        this.e = fw1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (cf2$a_0)object;
        object2 = (ea1_2)object2;
        object3 = (f80_0)object3;
        boolean bl2 = this.d;
        fw1_2 fw1_22 = this.e;
        Fx1$e fx1$e = new Fx1$e(bl2, fw1_22, (f80_0)object3);
        fx1$e.b = object;
        fx1$e.c = object2;
        object = Unit.a;
        return fx1$e.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        int n3;
        Object object3;
        Object object4;
        block14: {
            Throwable throwable2;
            xq_2 xq_22;
            Object object5;
            int n4;
            block12: {
                int n7;
                block13: {
                    object4 = j90_0.COROUTINE_SUSPENDED;
                    int n8 = this.a;
                    object3 = this.e;
                    n3 = 3;
                    n4 = 2;
                    n7 = 1;
                    if (n8 == 0) break block13;
                    if (n8 != n7) {
                        if (n8 != n4) {
                            if (n8 != n3) {
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            object4 = (Throwable)this.b;
                            vl2_2.b(object);
                            throw object4;
                        }
                        object2 = (fa1_1)this.c;
                        object3 = (Throwable)this.b;
                        vl2_2.b(object);
                        object = object3;
                        break block14;
                    } else {
                        object2 = (ea1_2)this.b;
                        vl2_2.b(object);
                        break block12;
                    }
                }
                vl2_2.b(object);
                object = (cf2$a_0)this.b;
                object2 = (ea1_2)this.c;
                boolean bl2 = this.d;
                if (bl2) {
                    return Unit.a;
                }
                object5 = fw1_2.NONE;
                if (object3 == object5) return Unit.a;
                object5 = ((ea1_2)object2).getAttributes();
                bl2 = object5.f(xq_22 = fx1_1.b);
                if (bl2) {
                    return Unit.a;
                }
                try {
                    this.b = object2;
                    this.a = n7;
                    object = ((cf2$a_0)object).a;
                    object = ((is2_2)object).c(this);
                    if (object != object4) break block12;
                    return object4;
                }
                catch (Throwable throwable2) {}
            }
            object = (kb1_2)object;
            return Unit.a;
            StringBuilder stringBuilder = new StringBuilder();
            object5 = ((ea1_2)object2).getAttributes();
            xq_22 = fx1_1.a;
            object5 = (fa1_1)object5.g(xq_22);
            object2 = ((ea1_2)object2).c();
            fx1_1.i(object3, stringBuilder, (bb1_2)object2, throwable2);
            object2 = stringBuilder.toString();
            object3 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            this.b = throwable2;
            this.c = object5;
            this.a = n4;
            object2 = ((fa1_1)object5).e((String)object2, this);
            if (object2 == object4) {
                return object4;
            }
            object2 = object5;
        }
        this.b = object;
        object3 = null;
        this.c = null;
        this.a = n3;
        object2 = ((fa1_1)object2).b(this);
        if (object2 == object4) {
            return object4;
        }
        object4 = object;
        throw object4;
    }
}

