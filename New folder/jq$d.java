/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class jq$d
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ jq_0 b;
    public final /* synthetic */ LU0 c;

    public jq$d(jq_0 jq_02, LU0 lU0, f80_0 f80_02) {
        this.b = jq_02;
        this.c = lU0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jq_0 jq_02 = this.b;
        LU0 lU0 = this.c;
        object = new jq$d(jq_02, lU0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jq$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jq$d)object).invokeSuspend(object2);
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
            object = this.b.e;
            this.a = n4;
            LU0 lU0 = this.c;
            object = object.b(lU0, this);
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

