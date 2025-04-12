/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from cf3$a
 */
public final class cf3$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cf3_1 c;

    public cf3$a_0(df3_1 df3_12, f80_0 f80_02) {
        this.c = df3_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        df3_1 df3_12 = (df3_1)this.c;
        cf3$a_0 cf3$a_0 = new cf3$a_0(df3_12, f80_02);
        cf3$a_0.b = object;
        return cf3$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (cf3$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cf3$a_0)object).invokeSuspend(object2);
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
            df3_1 df3_12 = (df3_1)this.c;
            cf3$a$a cf3$a$a = new cf3$a$a(df3_12, null);
            this.a = n4;
            object = vv0_0.b((hw2_0)object, cf3$a$a, this);
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

