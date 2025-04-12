/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import com.google.accompanist.systemuicontroller.SystemUiController;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LO0
 */
public final class lo0_1
implements Function1 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ pq_0 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ f23_0 e;
    public final /* synthetic */ FragmentManager f;
    public final /* synthetic */ yT1 g;
    public final /* synthetic */ Function2 h;

    public /* synthetic */ lo0_1(SystemUiController systemUiController, yT1 yT12, pq_0 pq_02, dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT13, hq0_2 hq0_22) {
        this.a = systemUiController;
        this.b = yT12;
        this.c = pq_02;
        this.d = dr0_02;
        this.e = f23_02;
        this.f = fragmentManager;
        this.g = yT13;
        this.h = hq0_22;
    }

    public final Object invoke(Object object) {
        yT1 yT12;
        Object object2 = object;
        object2 = (wT1)object;
        SystemUiController systemUiController = this.a;
        Intrinsics.checkNotNullParameter(systemUiController, "$systemUiController");
        yT1 yT13 = this.b;
        Intrinsics.checkNotNullParameter(yT13, "$fleekAppNavigationController");
        dr0_0 dr0_02 = this.d;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        f23_0 f23_02 = this.e;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekViewModel");
        yT1 yT14 = this.g;
        Intrinsics.checkNotNullParameter(yT14, "$fleekBottomNavigationController");
        Object object3 = this.h;
        Intrinsics.checkNotNullParameter(object3, "$getCommitFunction");
        Intrinsics.checkNotNullParameter(object2, "$this$NavHost");
        Object object4 = this.c;
        Object object5 = new wo0_1(systemUiController, yT13, (pq_0)object4, dr0_02);
        boolean bl2 = true;
        object4 = new u10(308166147, object5, bl2);
        int n3 = 254;
        xT1.a((wT1)object2, "splash-screen", null, (u10)object4, n3);
        object5 = new zo0_1(dr0_02, yT13, systemUiController);
        object4 = new u10(682809708, object5, bl2);
        xT1.a((wT1)object2, "onboarding", null, (u10)object4, n3);
        FragmentManager fragmentManager = this.f;
        Function2 function2 = object3;
        function2 = (hq0_2)object3;
        object3 = yT12;
        object5 = systemUiController;
        object4 = dr0_02;
        cp0_1 cp0_12 = yT12;
        yT12 = yT13;
        ((cp0_1)object3)(systemUiController, dr0_02, f23_02, fragmentManager, yT14, yT13, (hq0_2)function2);
        object3 = new u10(339925899, cp0_12, bl2);
        int n4 = 254;
        xT1.a((wT1)object2, "home", null, (u10)object3, n4);
        object3 = new Object();
        object3 = kotlin.collections.a.b(nm3.c("brandId", (Function1)object3));
        object5 = new fp0_0(dr0_02, yT13, f23_02, systemUiController);
        object4 = new u10(-2957910, object5, bl2);
        xT1.a((wT1)object2, "brand?brandId={brandId}", (List)object3, (u10)object4, 252);
        object3 = new hp0_1(dr0_02, yT13);
        object5 = new u10(-345841719, object3, bl2);
        xT1.a((wT1)object2, "brands", null, (u10)object5, n4);
        return Unit.a;
    }
}

