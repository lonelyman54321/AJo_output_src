/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tk2$a
 */
public final class tk2$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;

    public tk2$a_0(f80_0 f80_02) {
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tk2$a_0 tk2$a_0 = new tk2$a_0(f80_02);
        tk2$a_0.b = object;
        return tk2$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (tk2$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tk2$a_0)object).invokeSuspend(object2);
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
                    object = (HI2)((Object)object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                object2 = (fs0_2)object;
                object = null;
            }
            HI2 hI2 = HI2.LAUNCH_INITIAL_REFRESH;
            if (object != hI2) {
                n3 = 0;
            }
            object = n3 != 0;
            this.b = null;
            this.a = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

