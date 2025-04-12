/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class H22
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H22(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        String string2 = "format(...)";
        Object object = null;
        Object object2 = this.b;
        int n3 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (LinearLayout)object2;
                Intrinsics.checkNotNullParameter(object2, "$parentLyt");
                Object object3 = StringCompanionObject.INSTANCE;
                object3 = hv3_0.K(R$string.acc_info_popup);
                String string3 = hv3_0.K(R$string.offers);
                Object[] objectArray = new Object[n3];
                objectArray[0] = string3;
                zw_0.a(objectArray, n3, (String)object3, string2, (LinearLayout)object2);
                ai0_2.a((View)object2);
                return;
            }
            case 0: 
        }
        object2 = (q22_0)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        View view = ((q22_0)object2).Y;
        if (view != null) {
            Object object4 = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_error_popup;
            object4 = hv3_0.K(n7);
            int n8 = R$string.plp_zero_product;
            String string4 = hv3_0.K(n8);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string4;
            object = Arrays.copyOf(objectArray, n3);
            object = String.format((String)object4, object);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            view.setContentDescription((CharSequence)object);
        }
        if ((string2 = ((q22_0)object2).Y) != null) {
            ai0_2.a((View)string2);
        }
    }
}

