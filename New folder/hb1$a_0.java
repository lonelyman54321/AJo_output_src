/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from hb1$a
 */
public final class hb1$a_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Function1 c;
    public final /* synthetic */ mv_2 d;

    public hb1$a_0(mv_2 mv_22, f80_0 f80_02) {
        this.d = mv_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (db1_2)object;
        object2 = (Function1)object2;
        object3 = (f80_0)object3;
        mv_2 mv_22 = this.d;
        hb1$a_0 hb1$a_0 = new hb1$a_0(mv_22, (f80_0)object3);
        hb1$a_0.b = object;
        hb1$a_0.c = object2 = (Function1)object2;
        object = Unit.a;
        return hb1$a_0.invokeSuspend(object);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invokeSuspend(Object object) {
        g00_0 g00_02;
        block14: {
            block13: {
                int n3 = 1;
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n4 = this.a;
                if (n4 != 0) {
                    if (n4 == n3) {
                        g00_02 = (g00_0)this.b;
                        try {
                            vl2_2.b(object);
                            break block13;
                        }
                        catch (Throwable throwable) {
                            break block14;
                        }
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                object = (db1_2)this.b;
                Function1 function1 = this.c;
                Object object2 = ((db1_2)object).e;
                sg3_2 sg3_22 = new xl1_2((i)object2);
                object2 = this.d.a.e;
                Object object3 = i$a.a;
                object2 = object2.get((CoroutineContext$a)object3);
                Intrinsics.checkNotNull(object2);
                object2 = (i)object2;
                object3 = hb1_2.a;
                object3 = new gb1_2(sg3_22);
                object2 = object2.G((Function1)object3);
                object3 = new ds_0(object2, n3);
                sg3_22.G((Function1)object3);
                object2 = "<set-?>";
                Intrinsics.checkNotNullParameter(sg3_22, (String)object2);
                ((db1_2)object).e = sg3_22;
                this.b = sg3_22;
                this.a = n3;
                try {
                    object = function1.invoke(this);
                    if (object == j90_02) {
                        return j90_02;
                    }
                    g00_02 = sg3_22;
                }
                catch (Throwable throwable) {
                    g00_02 = sg3_22;
                }
            }
            g00_02.a();
            return Unit.a;
        }
        try {
            void var1_4;
            g00_02.c((Throwable)var1_4);
            throw var1_4;
        }
        catch (Throwable throwable) {
            g00_02.a();
            throw throwable;
        }
    }
}

