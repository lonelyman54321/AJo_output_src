/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class G70
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ P70 c;

    public G70(P70 p70, f80_0 f80_02) {
        this.c = p70;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        P70 p70 = this.c;
        G70 g70 = new G70(p70, f80_02);
        g70.b = object;
        return g70;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (G70)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((G70)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (hw2_0)this.b;
        P70 p70 = this.c;
        G70$a g70$a = new G70$a(p70);
        this.a = n4;
        p70 = null;
        h70_0 h70_02 = new h70_0(g70$a, null);
        object = vv0_0.b((hw2_0)object, h70_02, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

