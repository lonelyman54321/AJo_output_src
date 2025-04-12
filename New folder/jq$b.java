/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class jq$b
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ jq_0 b;
    public final /* synthetic */ LU0 c;

    public jq$b(jq_0 jq_02, LU0 lU0, f80_0 f80_02) {
        this.b = jq_02;
        this.c = lU0;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        jq_0 jq_02 = this.b;
        LU0 lU0 = this.c;
        jq$b jq$b = new jq$b(jq_02, lU0, f80_02);
        return jq$b;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (jq$b)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((jq$b)object).invokeSuspend(unit);
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
            LU0 lU0 = this.c;
            object = ((jq_0)object).g(lU0, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

