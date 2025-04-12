/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$b;
import androidx.lifecycle.v;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from X7
 */
public final class x7_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ AjioHomeActivity b;

    public x7_0(AjioHomeActivity ajioHomeActivity, f80_0 f80_02) {
        this.b = ajioHomeActivity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AjioHomeActivity ajioHomeActivity = this.b;
        object = new x7_0(ajioHomeActivity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (x7_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((x7_0)object).invokeSuspend(object2);
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
            i$b i$b = i$b.STARTED;
            AjioHomeActivity ajioHomeActivity = this.b;
            X7$a x7$a = new X7$a(ajioHomeActivity, null);
            this.a = n4;
            Object object2 = v.a(ajioHomeActivity, i$b, x7$a, this);
            if (object2 != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw illegalStateException;
    }
}

