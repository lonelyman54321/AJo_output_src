/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.StringCompanionObject;

public final class E43
implements Runnable {
    public final /* synthetic */ ConstraintLayout a;

    public /* synthetic */ E43(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public final void run() {
        int n3 = 1;
        ConstraintLayout constraintLayout = this.a;
        if (constraintLayout != null) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_error_popup;
            object = hv3_0.K(n4);
            int n7 = R$string.no_similar_product_found;
            String string2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            string2 = "format(...)";
            an_1.a(objectArray, n3, (String)object, string2, constraintLayout);
        }
        if (constraintLayout != null) {
            ai0_2.a((View)constraintLayout);
        }
    }
}

