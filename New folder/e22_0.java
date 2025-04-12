/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from e22
 */
public final class e22_0
implements Function1 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ e22_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final Object invoke(Object object) {
        String string2 = null;
        int n3 = 1;
        object = (String)object;
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        Object[] objectArray = newProductDetailsFragment.cb();
        int n4 = objectArray.S;
        if (n4 == n3) {
            newProductDetailsFragment.cb().S = false;
            objectArray = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_alert_message;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2 = hv3_0.L(n4, object2);
            objectArray = new Object[]{};
            String string3 = "format(...)";
            string2 = xh2_0.a(objectArray, 0, (String)object2, string3);
            newProductDetailsFragment.showNotification((String)object, string2);
        }
        return Unit.a;
    }
}

