/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class X2$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w2_0 c;

    public X2$a(w2_0 w2_02, f80_0 f80_02) {
        this.c = w2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w2_0 w2_02 = this.c;
        X2$a x2$a = new X2$a(w2_02, f80_02);
        x2$a.b = object;
        return x2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ml2)object;
        object2 = (f80_0)object2;
        object = (X2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((X2$a)object).invokeSuspend(object2);
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
        object = (Ml2)this.b;
        t2_0 t2_02 = this.c.h;
        if (t2_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activePointsAdapter");
            n3 = 0;
            t2_02 = null;
        }
        this.a = n4;
        if ((object = t2_02.i((Ml2)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

