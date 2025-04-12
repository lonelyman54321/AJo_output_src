/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.navigation.e;
import com.ril.ajio.payment.fragment.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vP0
 */
public final class vp0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (d)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object, "getApplication(...)");
                op2_2 op2_22 = new op2_2((Application)object);
                return op2_22;
            }
            case 0: 
        }
        object = (yT1)object;
        Intrinsics.checkNotNullParameter(object, "$bottomNavigationController");
        Object object2 = h40_0.a;
        n3 = (int)(h40_0.c() ? 1 : 0);
        if (n3 != 0) {
            object2 = "category-page";
            T61.f((e)object, (String)object2);
        }
        return Unit.a;
    }
}

