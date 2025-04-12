/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class rF$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ if_1 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public rF$a$a(if_1 if_12, byte[] byArray, int n3, f80_0 f80_02) {
        this.b = if_12;
        this.c = byArray;
        this.d = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        byte[] byArray = this.c;
        int n3 = this.d;
        if_1 if_12 = this.b;
        object = new rF$a$a(if_12, byArray, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rF$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rF$a$a)object).invokeSuspend(object2);
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
            this.a = n4;
            object = this.b;
            byte[] byArray = this.c;
            n4 = 0;
            int n7 = this.d;
            object = kf_1.b((gf_2)object, byArray, 0, n7, this);
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

