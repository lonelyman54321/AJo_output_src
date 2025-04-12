/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xP2$a
 */
public final class xp2$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xp2_0 c;

    public xp2$a_0(xp2_0 xp2_02, f80_0 f80_02) {
        this.c = xp2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xp2_0 xp2_02 = this.c;
        xp2$a_0 xp2$a_0 = new xp2$a_0(xp2_02, f80_02);
        xp2$a_0.b = object;
        return xp2$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xp2$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xp2$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            i90_0 i90_02 = (i90_0)this.b;
            xp2_0 xp2_02 = this.c;
            i23_0 i23_02 = xp2_02.n.b();
            xP2$a$a xP2$a$a = new xP2$a$a(xp2_02, i90_02);
            this.a = n4;
            i23_02.getClass();
            j90_0 j90_03 = i23_0.l(i23_02, xP2$a$a, this);
            if (j90_03 != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw illegalStateException;
    }
}

