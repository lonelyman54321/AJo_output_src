/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from Kk3
 */
public final class kk3_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ wr1_1 e;
    public final /* synthetic */ ib3_0 f;

    public kk3_0(c80 c802, tr1_0 tr1_02, wr1_1 wr1_12, tr1_0 tr1_03, f80_0 f80_02) {
        this.c = c802;
        this.d = tr1_02;
        this.e = wr1_12;
        this.f = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        kk3_0 kk3_02;
        Object object2 = this.c;
        i90_0 i90_02 = object2;
        i90_02 = (c80)object2;
        Object object3 = object2 = this.f;
        object3 = (tr1_0)object2;
        tr1_0 tr1_02 = this.d;
        wr1_1 wr1_12 = this.e;
        object2 = kk3_02;
        kk3_02 = new kk3_0((c80)i90_02, tr1_02, wr1_12, (tr1_0)object3, f80_02);
        kk3_02.b = object;
        return kk3_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (kk3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kk3_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        Object object2 = object = this.b;
        object2 = (hw2_0)object;
        object = this.d;
        c80 c802 = (c80)this.c;
        Object object3 = this.e;
        Kk3$a kk3$a = new Kk3$a(c802, (tr1_0)object, (wr1_1)object3, null);
        object = (tr1_0)this.f;
        Kk3$b kk3$b = new Kk3$b((tr1_0)object);
        this.a = n4;
        object = Di3.a;
        dy2_1 dy2_12 = new dy2_1((Vo0)object2);
        object3 = object;
        object = new gi3_1((hw2_0)object2, kk3$a, kk3$b, dy2_12, null);
        object = kotlinx.coroutines.d.c((Function2)object, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

