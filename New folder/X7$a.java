/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class X7$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ AjioHomeActivity b;

    public X7$a(AjioHomeActivity ajioHomeActivity, f80_0 f80_02) {
        this.b = ajioHomeActivity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AjioHomeActivity ajioHomeActivity = this.b;
        object = new X7$a(ajioHomeActivity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (X7$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((X7$a)object).invokeSuspend(object2);
    }

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
            vl2_2.b(object);
            tp_0.Companion.getClass();
            object = ((tp_0)tp_0.c.getValue()).b;
            AjioHomeActivity ajioHomeActivity = this.b;
            X7$a$a x7$a$a = new X7$a$a(ajioHomeActivity);
            this.a = n4;
            object = ((kb3_2)object).collect(x7$a$a, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

