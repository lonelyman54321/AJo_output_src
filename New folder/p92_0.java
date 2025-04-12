/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from p92
 */
public final class p92_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Cl2 b;
    public final /* synthetic */ dr0_0 c;

    public p92_0(f80_0 f80_02, hm0_0 hm0_02, dr0_0 dr0_02) {
        this.b = hm0_02;
        this.c = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.c;
        hm0_0 hm0_02 = (hm0_0)this.b;
        object = new p92_0(f80_02, hm0_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (p92_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((p92_0)object).invokeSuspend(object2);
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
            hm0_0 hm0_02 = (hm0_0)this.b;
            int n7 = 1;
            object = new oj0_1(hm0_02, n7);
            object = J83.k((Function0)object);
            dr0_0 dr0_02 = this.c;
            p92$a p92$a = new p92$a(dr0_02, hm0_02);
            this.a = n4;
            object = ((m0_0)object).collect(p92$a, this);
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

