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
 * Renamed from iP0
 */
public final class ip0_1
implements Function1 {
    public final /* synthetic */ SystemUiController a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ f23_0 e;
    public final /* synthetic */ yT1 f;
    public final /* synthetic */ yT1 g;

    public /* synthetic */ ip0_1(SystemUiController systemUiController, dr0_0 dr0_02, FragmentManager fragmentManager, Function2 function2, f23_0 f23_02, yT1 yT12, yT1 yT13) {
        this.a = systemUiController;
        this.b = dr0_02;
        this.c = fragmentManager;
        this.d = function2;
        this.e = f23_02;
        this.f = yT12;
        this.g = yT13;
    }

    public final Object invoke(Object object) {
        yT1 yT12;
        Object object2 = object;
        object2 = (wT1)object;
        SystemUiController systemUiController = this.a;
        Intrinsics.checkNotNullParameter(systemUiController, "$systemUiController");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Function2 function2 = this.d;
        Intrinsics.checkNotNullParameter(function2, "$getCommitFunction");
        Object object3 = this.e;
        Intrinsics.checkNotNullParameter(object3, "$sharedFleekVM");
        Object object4 = this.f;
        Intrinsics.checkNotNullParameter(object4, "$fleekAppNavigationController");
        yT1 yT13 = this.g;
        Intrinsics.checkNotNullParameter(yT13, "$bottomNavigationController");
        Intrinsics.checkNotNullParameter(object2, "$this$NavHost");
        FragmentManager fragmentManager = this.c;
        Object object5 = new pP0$a(systemUiController, dr0_02, fragmentManager, function2);
        boolean bl2 = true;
        Object object6 = new u10(1380231598, object5, bl2);
        int n3 = 254;
        xT1.a((wT1)object2, "switch-store-route", null, (u10)object6, n3);
        object5 = new kp0_1(0);
        object5 = kotlin.collections.a.b(nm3.c("postId", (Function1)object5));
        object6 = new pP0$b(dr0_02, (yT1)object4, (f23_0)object3, systemUiController);
        object3 = new u10(145390885, object6, bl2);
        xT1.a((wT1)object2, "feed?postId={postId}", (List)object5, (u10)object3, 252);
        object3 = new pP0$c(dr0_02, (yT1)object4, systemUiController);
        object4 = new u10(1242708774, object3, bl2);
        xT1.a((wT1)object2, "explore-brands", null, (u10)object4, n3);
        object3 = yT12;
        object4 = systemUiController;
        object5 = dr0_02;
        object6 = fragmentManager;
        hx0_2 hx0_22 = yT12;
        yT12 = yT13;
        object3 = new pP0$d(systemUiController, dr0_02, fragmentManager, function2, yT13);
        object3 = new u10(-1954940633, hx0_22, bl2);
        xT1.a((wT1)object2, "account", null, (u10)object3, n3);
        object3 = hx0_22;
        hx0_22 = new pP0$e(systemUiController, dr0_02, fragmentManager, function2, yT13);
        object3 = new u10(-857622744, hx0_22, bl2);
        xT1.a((wT1)object2, "category-page", null, (u10)object3, n3);
        object3 = new pP0$f(systemUiController, dr0_02);
        object4 = new u10(239695145, object3, bl2);
        xT1.a((wT1)object2, "not-configured", null, (u10)object4, n3);
        return Unit.a;
    }
}

