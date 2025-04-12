/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$string;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeConfirmedActivity;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class CC0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ CC0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        String string2 = "this$0";
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object2;
                object = (o12_0)object;
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = ((o12_0)object).b;
                if (string2 != null) {
                    Object object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_action_popup;
                    object3 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    String string3 = "";
                    objectArray[0] = string3;
                    object2 = Arrays.copyOf(objectArray, n3);
                    object2 = String.format((String)object3, object2);
                    object3 = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    string2.setContentDescription((CharSequence)object2);
                }
                if ((object2 = ((o12_0)object).b) != null) {
                    ai0_2.a((View)object2);
                }
                return;
            }
            case 0: 
        }
        n3 = ExchangeConfirmedActivity.Z;
        object = (ExchangeConfirmedActivity)object;
        Intrinsics.checkNotNullParameter(object, string2);
        Toolbar toolbar = ((ExchangeConfirmedActivity)object).y2().alfToolbar;
        Intrinsics.checkNotNullExpressionValue(toolbar, "alfToolbar");
        ai0_2.a((View)toolbar);
    }
}

