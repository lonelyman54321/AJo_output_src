/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from kT0
 */
public final class kt0_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function2 d;

    public kt0_2(Function2 function2, f80_0 f80_02) {
        this.d = function2;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        Function2 function2 = this.d;
        kt0_2 kt0_22 = new kt0_2(function2, (f80_0)object3);
        kt0_22.b = object;
        kt0_22.c = object2;
        object = Unit.a;
        return kt0_22.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Function2 function2;
            fs0_2 fs0_22;
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
                    fs0_22 = this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                fs0_22 = this.b;
                object = this.c;
                this.b = fs0_22;
                this.a = n3;
                function2 = this.d;
                object = function2.invoke(object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            function2 = null;
            this.b = null;
            this.a = n4;
            object = fs0_22.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

