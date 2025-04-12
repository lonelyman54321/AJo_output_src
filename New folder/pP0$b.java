/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class pP0$b
implements hx0_2 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ f23_0 c;
    public final /* synthetic */ yT1 d;

    public pP0$b(dr0_0 dr0_02, yT1 yT12, f23_0 f23_02, SystemUiController systemUiController) {
        this.a = systemUiController;
        this.b = dr0_02;
        this.c = f23_02;
        this.d = yT12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        String string2 = "backStackEntry";
        ro.c((Number)object4, (ek_1)object, "$this$composable", (d)object2, string2);
        int n3 = -1851257395;
        object3.K(n3);
        object = this.a;
        boolean bl2 = object3.J(object);
        Object object5 = object3.v();
        if (bl2 || object5 == (object4 = b30$a.a)) {
            object5 = new qp0_1((SystemUiController)object);
            object3.o(object5);
        }
        object5 = (Function0)object5;
        object3.E();
        object = ly0_0.a;
        object3.q((Function0)object5);
        bl2 = false;
        object4 = null;
        object5 = this.b;
        pp0_1.c(false, (dr0_0)object5, (b30_0)object3, 70);
        n3 = 8;
        pp0_1.d((dr0_0)object5, (b30_0)object3, n3);
        ((dr0_0)object5).Z(false);
        object = ((d)object2).a();
        if (object != null) {
            object2 = "postId";
            object.getString((String)object2);
        }
        object = this.c;
        object2 = this.d;
        gk0_1.b((f23_0)object, (yT1)object2, (dr0_0)object5, (b30_0)object3, 584);
        pp0_1.e((dr0_0)object5, "feed - click", "feed screen", (b30_0)object3, 440);
        return Unit.a;
    }
}

