/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oJ0
 */
public final class oj0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (Function0)object;
                Intrinsics.checkNotNullParameter(object, "$onBackClick");
                object.invoke();
                return Unit.a;
            }
            case 1: {
                return ((Cl2)object).j();
            }
            case 0: 
        }
        Object object2 = pj0_2.Companion;
        object = (pj0_2)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = ((pj0_2)object).Qa().h.e;
        mu1_1 mu1_12 = ((Fragment)object).getViewLifecycleOwner();
        Function1 function1 = new xl_2(object, n3);
        pJ0$d pJ0$d = new pJ0$d(function1);
        ((LiveData)object2).e(mu1_12, pJ0$d);
        object2 = ((pj0_2)object).Qa().h.g;
        mu1_12 = ((Fragment)object).getViewLifecycleOwner();
        function1 = new yl_2(object, n3);
        pJ0$d pJ0$d2 = new pJ0$d(function1);
        ((LiveData)object2).e(mu1_12, pJ0$d2);
        return Unit.a;
    }
}

