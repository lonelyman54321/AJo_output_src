/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class o00$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ lP2 b;
    public final /* synthetic */ o00_0 c;
    public final /* synthetic */ Ey2$b d;

    public o00$a(lP2 lP22, o00_0 o00_02, Ey2$b ey2$b, f80_0 f80_02) {
        this.b = lP22;
        this.c = o00_02;
        this.d = ey2$b;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        o00_0 o00_02 = this.c;
        Ey2$b ey2$b = this.d;
        lP2 lP22 = this.b;
        object = new o00$a(lP22, o00_02, ey2$b, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (o00$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o00$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        o00_0 o00_02;
        Ey2$b ey2$b;
        block6: {
            block5: {
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                ey2$b = this.d;
                int n4 = 1;
                o00_02 = this.c;
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
                {
                    object = this.b;
                    this.a = n4;
                    object = ((lP2)object).a(this);
                    if (object != j90_02) break block5;
                    return j90_02;
                }
            }
            o00_02.x.g(ey2$b);
            jt0_0.a(o00_02);
            return Unit.a;
        }
        o00_02.x.g(ey2$b);
        jt0_0.a(o00_02);
        throw throwable2;
    }
}

