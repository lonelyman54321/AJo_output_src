/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class o90$b$a$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ hw2_0 b;
    public final /* synthetic */ Sk3 c;

    public o90$b$a$b(hw2_0 hw2_02, Sk3 sk3, f80_0 f80_02) {
        this.b = hw2_02;
        this.c = sk3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hw2_0 hw2_02 = this.b;
        Sk3 sk3 = this.c;
        object = new o90$b$a$b(hw2_02, sk3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (o90$b$a$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o90$b$a$b)object).invokeSuspend(object2);
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
            Object object2 = this.c;
            object = new o90$b$a$b$a((Sk3)object2);
            this.a = n4;
            object2 = this.b;
            object = Di3.d((hw2_0)object2, (Function1)object, this);
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

