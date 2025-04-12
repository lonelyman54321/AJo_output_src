/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Wd1
 */
public final class wd1_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1 c;

    public wd1_2(Function1 function1, f80_0 f80_02) {
        this.c = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.c;
        wd1_2 wd1_22 = new wd1_2(function1, f80_02);
        wd1_22.b = object;
        return wd1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (wd1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wd1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                this.b = object2 = (fs0_2)object;
                this.a = n3;
                object = this.c.invoke(this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (es0_2)object;
            n3 = 0;
            this.b = null;
            this.a = n4;
            object = ms0_1.i(this, (es0_2)object, (fs0_2)object2);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

