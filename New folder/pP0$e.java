/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class pP0$e
implements hx0_2 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ yT1 e;

    public pP0$e(SystemUiController systemUiController, dr0_0 dr0_02, FragmentManager fragmentManager, Function2 function2, yT1 yT12) {
        this.a = systemUiController;
        this.b = dr0_02;
        this.c = fragmentManager;
        this.d = function2;
        this.e = yT12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        FragmentManager fragmentManager = null;
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        Object object5 = "$this$composable";
        String string2 = "it";
        ro.c((Number)object4, (ek_1)object, (String)object5, (d)object2, string2);
        int n3 = -1851192979;
        object3.K(n3);
        object = this.a;
        boolean bl2 = object3.J(object);
        object4 = object3.v();
        if (bl2 || object4 == (object2 = b30$a.a)) {
            object4 = new up0_1((SystemUiController)object);
            object3.o(object4);
        }
        object4 = (Function0)object4;
        object3.E();
        object = ly0_0.a;
        object3.q((Function0)object4);
        object4 = this.b;
        pp0_1.c(true, (dr0_0)object4, (b30_0)object3, 70);
        n3 = 8;
        pp0_1.d((dr0_0)object4, (b30_0)object3, n3);
        ((dr0_0)object4).Z(false);
        object5 = this.e;
        object2 = new vp0_2(object5, 0);
        fragmentManager = this.c;
        object5 = this.d;
        qq_1.a(fragmentManager, (Function2)object5, (vp0_2)object2, (b30_0)object3, n3);
        pp0_1.e((dr0_0)object4, "category - click", "category screen", (b30_0)object3, 440);
        return Unit.a;
    }
}

