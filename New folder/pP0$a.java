/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class pP0$a
implements hx0_2 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ Function2 d;

    public pP0$a(SystemUiController systemUiController, dr0_0 dr0_02, FragmentManager fragmentManager, Function2 function2) {
        this.a = systemUiController;
        this.b = dr0_02;
        this.c = fragmentManager;
        this.d = function2;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        Object object5 = "$this$composable";
        String string2 = "it";
        ro.c((Number)object4, (ek_1)object, (String)object5, (d)object2, string2);
        int n3 = -1851284627;
        object3.K(n3);
        object = this.a;
        boolean n4 = object3.J(object);
        object4 = object3.v();
        if (n4 || object4 == (object2 = b30$a.a)) {
            int n7 = 1;
            object4 = new lc_0(object, n7);
            object3.o(object4);
        }
        object4 = (Function0)object4;
        object3.E();
        object = ly0_0.a;
        object3.q((Function0)object4);
        object4 = this.b;
        pp0_1.c(false, (dr0_0)object4, (b30_0)object3, 70);
        n3 = 8;
        pp0_1.d((dr0_0)object4, (b30_0)object3, n3);
        object2 = h40_0.a;
        boolean bl2 = h40_0.c();
        if (bl2) {
            int n8 = -1554949592;
            object3.K(n8);
            object2 = this.c;
            object5 = this.d;
            T71.a((FragmentManager)object2, (Function2)object5, (b30_0)object3, n3);
            object3.E();
        } else {
            int n10 = -1851268096;
            object3.K(n10);
            fh3_2.a((dr0_0)object4, (b30_0)object3, n3);
            object3.E();
        }
        pp0_1.e((dr0_0)object4, "switch stores - click", "store switch halfcut screen", (b30_0)object3, 440);
        return Unit.a;
    }
}

