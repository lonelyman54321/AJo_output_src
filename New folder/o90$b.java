/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class o90$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Sj3 c;
    public final /* synthetic */ Sk3 d;

    public o90$b(Sj3 sj3, Sk3 sk3, f80_0 f80_02) {
        this.c = sj3;
        this.d = sk3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sj3 sj3 = this.c;
        Sk3 sk3 = this.d;
        o90$b o90$b = new o90$b(sj3, sk3, f80_02);
        o90$b.b = object;
        return o90$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (o90$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o90$b)object).invokeSuspend(object2);
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
            object = (hw2_0)this.b;
            Sk3 sk3 = this.d;
            Sj3 sj3 = this.c;
            o90$b$a o90$b$a = new o90$b$a((hw2_0)object, sj3, sk3, null);
            this.a = n4;
            object = kotlinx.coroutines.d.c(o90$b$a, this);
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

