/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pL2$b
 */
public final class pl2$b_0
extends qg3_2
implements gx0_2 {
    public jb1_2 a;
    public da1_2 b;
    public int c;
    public /* synthetic */ w5$a d;
    public /* synthetic */ jb1_2 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ mv_2 g;
    public final /* synthetic */ Function2 h;

    public pl2$b_0(mv_2 mv_22, Function2 function2, f80_0 f80_02) {
        this.f = null;
        this.g = mv_22;
        this.h = function2;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (w5$a)object;
        object2 = (jb1_2)object2;
        object3 = (f80_0)object3;
        Function2 function2 = this.h;
        mv_2 mv_22 = this.g;
        pl2$b_0 pl2$b_0 = new pl2$b_0(mv_22, function2, (f80_0)object3);
        pl2$b_0.d = object;
        pl2$b_0.e = object2;
        object = Unit.a;
        return pl2$b_0.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block7: {
            Object object2;
            w5$a w5$a;
            Object object3;
            Object object4;
            Object object5;
            int n3;
            j90_0 j90_02;
            block8: {
                int n4;
                int n7;
                block4: {
                    block5: {
                        block6: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n7 = this.c;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block4;
                            if (n7 == n4) break block5;
                            if (n7 != n3) break block6;
                            vl2_2.b(object);
                            break block7;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object5 = this.b;
                    object4 = this.a;
                    object3 = this.e;
                    w5$a = this.d;
                    vl2_2.b(object);
                    break block8;
                }
                vl2_2.b(object);
                w5$a = this.d;
                object = this.e;
                object5 = this.f;
                if (object5 != null && (n7 = (int)(((Boolean)(object5 = (Boolean)object5.invoke(object3 = ((jb1_2)object).a()))).booleanValue() ? 1 : 0)) == 0) {
                    return Unit.a;
                }
                object5 = rf_1.b(((jb1_2)object).b(), (i90_0)object);
                object3 = (uf_1)((Pair)object5).a;
                object5 = (uf_1)((Pair)object5).b;
                object5 = da3_0.c(((jb1_2)object).a(), (uf_1)object5).d();
                object = da3_0.c(((jb1_2)object).a(), (uf_1)object3).d();
                object3 = this.g.a;
                this.d = w5$a;
                this.e = object5;
                this.a = object;
                this.b = object3;
                this.c = n4;
                object4 = this.getContext();
                object2 = vg1_2.b;
                if ((object4 = (vg1_2)object4.get((CoroutineContext$a)object2)) == null) {
                    object4 = kotlin.coroutines.f.a;
                }
                if (object4 == j90_02) {
                    return j90_02;
                }
                Object object6 = object4;
                object4 = object;
                object = object6;
                Object object7 = object3;
                object3 = object5;
                object5 = object7;
            }
            object = (CoroutineContext)object;
            Function2 function2 = this.h;
            object2 = new pL2$b$a((jb1_2)object4, function2, null);
            Ae3.d((i90_0)object5, (CoroutineContext)object, null, (Function2)object2, n3);
            this.d = null;
            this.e = null;
            this.a = null;
            this.b = null;
            this.c = n3;
            object = w5$a.a.d(this, object3);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

