/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hN
 */
public final class hn_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Function0)object;
                Intrinsics.checkNotNullParameter(object, "$onClick");
                object.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Object object2 = qn_2.Companion;
        object = (qn_2)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((Fragment)object).requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, "getApplication(...)");
        object2 = new hy3_0((Application)object, null, 2, null);
        return object2;
    }
}

