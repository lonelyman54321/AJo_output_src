/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from v5
 */
public final class v5_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ jb1_2 c;
    public final /* synthetic */ Function2 d;

    public v5_0(Function2 function2, f80_0 f80_02) {
        this.d = function2;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (jb1_2)object2;
        object3 = (f80_0)object3;
        Function2 function2 = this.d;
        v5_0 v5_02 = new v5_0(function2, (f80_0)object3);
        v5_02.b = object;
        v5_02.c = object2;
        object = Unit.a;
        return v5_02.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            Function2 function2;
            is2_2 is2_22;
            int n3;
            int n4;
            j90_0 j90_02;
            block7: {
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n3) break block4;
                            if (n7 != n4) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    is2_22 = this.b;
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                is2_22 = this.b;
                object = this.c;
                this.b = is2_22;
                this.a = n3;
                function2 = this.d;
                object = function2.invoke(object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (jb1_2)object;
            if (object != null) {
                n3 = 0;
                function2 = null;
                this.b = null;
                this.a = n4;
                if ((object = is2_22.d(this, object)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

