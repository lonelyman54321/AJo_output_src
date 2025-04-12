/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class pP0$f
implements hx0_2 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;

    public pP0$f(SystemUiController systemUiController, dr0_0 dr0_02) {
        this.a = systemUiController;
        this.b = dr0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        String string2 = "$this$composable";
        String string3 = "it";
        ro.c((Number)object4, (ek_1)object, string2, (d)object2, string3);
        int n3 = -1851167283;
        object3.K(n3);
        object = this.a;
        boolean bl2 = object3.J(object);
        object4 = object3.v();
        if (bl2 || object4 == (object2 = b30$a.a)) {
            object4 = new wp0_2((SystemUiController)object);
            object3.o(object4);
        }
        object4 = (Function0)object4;
        object3.E();
        object = ly0_0.a;
        object3.q((Function0)object4);
        object = this.b;
        pp0_1.c(false, (dr0_0)object, (b30_0)object3, 70);
        rB0.d((b30_0)object3, 0);
        return Unit.a;
    }
}

