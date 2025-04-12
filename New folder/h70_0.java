/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from H70
 */
public final class h70_0
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function1 d;

    public h70_0(G70$a g70$a, f80_0 f80_02) {
        this.d = g70$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        G70$a g70$a = (G70$a)this.d;
        h70_0 h70_02 = new h70_0(g70$a, f80_02);
        h70_02.c = object;
        return h70_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (h70_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((h70_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            Object object2;
            int n3;
            j90_0 j90_02;
            block7: {
                int n4;
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.b;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (ru_0)this.c;
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                object2 = object = this.c;
                this.c = object2 = (ru_0)object;
                this.b = n4;
                object = I70.a((ru_0)object2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (aw2_0)object;
            ((aw2_0)object).a();
            long l2 = ((aw2_0)object).c;
            e72 e722 = new e72(l2);
            this.d.invoke(e722);
            this.c = null;
            this.b = n3;
            object = Di3.a;
            object = Nv2.Main;
            object = Di3.e((ru_0)object2, (Nv2)((Object)object), this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (aw2_0)object;
        if (object != null) {
            ((aw2_0)object).a();
        }
        return Unit.a;
    }
}

