/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class u$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s_0 c;

    public u$a(s_0 s_02, f80_0 f80_02) {
        this.c = s_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        s_0 s_02 = this.c;
        u$a u$a = new u$a(s_02, f80_02);
        u$a.b = object;
        return u$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ml2)object;
        object2 = (f80_0)object2;
        object = (u$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u$a)object).invokeSuspend(object2);
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
        V5 v5 = this.c.e;
        if (v5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioCashNTAdapter");
            n3 = 0;
            v5 = null;
        }
        this.a = n4;
        if ((object = v5.i((Ml2)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

