/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class u62$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bg2_2 c;

    public u62$a(bg2_2 bg2_22, f80_0 f80_02) {
        this.c = bg2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bg2_2 bg2_22 = this.c;
        u62$a u62$a = new u62$a(bg2_22, f80_02);
        u62$a.b = object;
        return u62$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (u62$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u62$a)object).invokeSuspend(object2);
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
            object = (sj3_2)this.b;
            bg2$e_0 bg2$e_0 = (bg2$e_0)this.c;
            object = ((sj3_2)object).a;
            this.a = n4;
            object = bg2$e_0.e((gf_2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

