/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class OA2
implements Runnable {
    public final /* synthetic */ ConstraintLayout a;

    public /* synthetic */ OA2(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public final void run() {
        int n3 = 1;
        Object object = sa2_2.j;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$parentLyt");
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_alert_popup);
        String string2 = hv3_0.K(R$string.product_breakup);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        an_1.a(objectArray, n3, (String)object2, "format(...)", (ConstraintLayout)((Object)object));
        ai0_2.a((View)object);
    }
}

