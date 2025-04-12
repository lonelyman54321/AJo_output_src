/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Es1
 */
public final class es1_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ cs1_1 b;
    public final /* synthetic */ int c;

    public es1_0(cs1_1 cs1_12, int n3, f80_0 f80_02) {
        this.b = cs1_12;
        this.c = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        cs1_1 cs1_12 = this.b;
        int n3 = this.c;
        object = new es1_0(cs1_12, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (es1_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((es1_0)object).invokeSuspend(object2);
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
            object = this.b.o;
            this.a = n4;
            n3 = this.c;
            object = object.d(n3, this);
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

