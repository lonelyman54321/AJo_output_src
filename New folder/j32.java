/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class j32
implements Runnable {
    public final /* synthetic */ n32_0 a;

    public /* synthetic */ j32(n32_0 n32_02) {
        this.a = n32_02;
    }

    public final void run() {
        Object object;
        int n3 = 1;
        n32_0 n32_02 = this.a;
        Intrinsics.checkNotNullParameter(n32_02, "this$0");
        LinearLayoutCompat linearLayoutCompat = n32_02.b;
        if (linearLayoutCompat != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_alert_popup;
            object2 = hv3_0.K(n4);
            int n7 = R$string.similar_products;
            String string2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            object = Arrays.copyOf(objectArray, n3);
            object = String.format((String)object2, object);
            object2 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            linearLayoutCompat.setContentDescription((CharSequence)object);
        }
        if ((object = n32_02.b) != null) {
            ai0_2.a((View)object);
        }
    }
}

