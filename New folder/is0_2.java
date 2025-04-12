/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from IS0
 */
public final class is0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ fs0_2 d;

    public is0_2(ts0_2 ts0_22, fs0_2 fs0_22, f80_0 f80_02) {
        this.c = ts0_22;
        this.d = fs0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fs0_2 fs0_22 = this.d;
        ts0_2 ts0_22 = (ts0_2)this.c;
        is0_2 is0_22 = new is0_2(ts0_22, fs0_22, f80_02);
        is0_22.b = object;
        return is0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (is0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((is0_2)object).invokeSuspend(object2);
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
            object = (i90_0)this.b;
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            fs0_2 fs0_22 = this.d;
            object = gx0_22.invoke(object, fs0_22, this);
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

