/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Gi3$a
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ dy2_1 g;

    public Gi3$a(i90_0 i90_02, gx0_2 gx0_22, Function1 function1, dy2_1 dy2_12, f80_0 f80_02) {
        this.d = i90_02;
        this.e = gx0_22;
        this.f = function1;
        this.g = dy2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.f;
        dy2_1 dy2_12 = this.g;
        i90_0 i90_02 = this.d;
        gx0_2 gx0_22 = this.e;
        Gi3$a gi3$a = new Gi3$a(i90_02, gx0_22, function1, dy2_12, f80_02);
        gi3$a.c = object;
        return gi3$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (Gi3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Gi3$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        dy2_1 dy2_12;
        int n3;
        i90_0 i90_02;
        Object object3;
        block9: {
            int n4;
            block10: {
                int n7;
                block6: {
                    block7: {
                        block8: {
                            object3 = j90_0.COROUTINE_SUSPENDED;
                            int n8 = this.b;
                            i90_02 = this.d;
                            n3 = 3;
                            n4 = 2;
                            n7 = 1;
                            dy2_12 = this.g;
                            if (n8 == 0) break block6;
                            if (n8 == n7) break block7;
                            if (n8 != n4) break block8;
                            vl2_2.b(object);
                            break block9;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (ru_0)this.c;
                    vl2_2.b(object);
                    break block10;
                }
                vl2_2.b(object);
                object2 = object = this.c;
                object2 = (ru_0)object;
                object = new Gi3$a$a(dy2_12, null);
                Ae3.d(i90_02, null, null, (Function2)object, n3);
                this.c = object2;
                this.b = n7;
                object = Di3.c((ru_0)object2, this, n3);
                if (object == object3) {
                    return object3;
                }
            }
            object = (aw2_0)object;
            ((aw2_0)object).a();
            qg3_2 qg3_22 = Di3.a;
            gx0_2 gx0_22 = this.e;
            if (gx0_22 != qg3_22) {
                qg3_22 = new Gi3$a$b(gx0_22, dy2_12, (aw2_0)object, null);
                Ae3.d(i90_02, null, null, (Function2)((Object)qg3_22), n3);
            }
            this.c = null;
            this.b = n4;
            object = Nv2.Main;
            if ((object = Di3.e((ru_0)object2, (Nv2)((Object)object), this)) == object3) {
                return object3;
            }
        }
        object = (aw2_0)object;
        if (object == null) {
            object = new Gi3$a$c(dy2_12, null);
            Ae3.d(i90_02, null, null, (Function2)object, n3);
        } else {
            ((aw2_0)object).a();
            object3 = new Gi3$a$d(dy2_12, null);
            Ae3.d(i90_02, null, null, (Function2)object3, n3);
            object3 = this.f;
            if (object3 != null) {
                long l2 = ((aw2_0)object).c;
                object2 = new e72(l2);
                object3.invoke(object2);
            }
        }
        return Unit.a;
    }
}

