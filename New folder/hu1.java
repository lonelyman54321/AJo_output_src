/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class hu1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ iu1_0 b;
    public final /* synthetic */ Function2 c;

    public hu1(iu1_0 iu1_02, Function2 function2, f80_0 f80_02) {
        this.b = iu1_02;
        this.c = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        iu1_0 iu1_02 = this.b;
        Function2 function2 = this.c;
        object = new hu1(iu1_02, function2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hu1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hu1)object).invokeSuspend(object2);
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
            object = this.b.b();
            this.a = n4;
            i$b i$b = i$b.STARTED;
            wm0_2 wm0_22 = ir0_2.a;
            d21_0 d21_02 = bg1_1.a.N0();
            Function2 function2 = this.c;
            q q2 = new q((i)object, i$b, function2, null);
            object = Ae3.g(this, d21_02, q2);
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

