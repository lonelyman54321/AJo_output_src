/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from P73
 */
public final class p73_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Lj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Gl d;
    public final /* synthetic */ Function0 e;

    public p73_0(Lj lj, boolean bl2, Qs3 qs3, Function0 function0, f80_0 f80_02) {
        this.b = lj;
        this.c = bl2;
        this.d = qs3;
        this.e = function0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.c;
        Object object2 = this.d;
        Gl gl = object2;
        gl = (Qs3)object2;
        Lj lj = this.b;
        Function0 function0 = this.e;
        object2 = object;
        object = new p73_0(lj, bl2, (Qs3)gl, function0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (p73_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((p73_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            float f5;
            vl2_2.b(object);
            int n7 = this.c;
            if (n7 != 0) {
                n7 = 1065353216;
                f5 = 1.0f;
            } else {
                n7 = 0;
                f5 = 0.0f;
                object = null;
            }
            Float f6 = new Float(f5);
            this.a = n4;
            int n8 = 12;
            Lj lj = this.b;
            Gl gl = this.d;
            object = Lj.c(lj, f6, gl, null, this, n8);
            if (object == j90_02) {
                return j90_02;
            }
        }
        this.e.invoke();
        return Unit.a;
    }
}

