/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$b;
import androidx.lifecycle.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Ih2$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ih2_1 b;

    public Ih2$b(ih2_1 ih2_12, f80_0 f80_02) {
        this.b = ih2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ih2_1 ih2_12 = this.b;
        object = new Ih2$b(ih2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Ih2$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Ih2$b)object).invokeSuspend(object2);
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
            object = this.b;
            mu1_1 mu1_12 = ((ih2_1)object).b.k2();
            if (mu1_12 == null) return Unit.a;
            i$b i$b = i$b.RESUMED;
            Ih2$b$a ih2$b$a = new Ih2$b$a((ih2_1)object, null);
            this.a = n4;
            object = v.a(mu1_12, i$b, ih2$b$a, this);
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

