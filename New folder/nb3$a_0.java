/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Nb3$a
 */
public final class nb3$a_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ nb3_0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Gl d;

    public nb3$a_0(nb3_0 nb3_02, float f5, Qs3 qs3, f80_0 f80_02) {
        this.b = nb3_02;
        this.c = f5;
        this.d = qs3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        nb3_0 nb3_02 = this.b;
        Qs3 qs3 = (Qs3)this.d;
        float f5 = this.c;
        object = new nb3$a_0(nb3_02, f5, qs3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nb3$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nb3$a_0)object).invokeSuspend(object2);
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
            Lj lj = this.b.c;
            float f5 = this.c;
            Float f6 = new Float(f5);
            this.a = n4;
            int n7 = 12;
            Gl gl = this.d;
            object = Lj.c(lj, f6, gl, null, this, n7);
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

