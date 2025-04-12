/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class gQ
implements Runnable {
    public final /* synthetic */ ConstraintLayout a;
    public final /* synthetic */ iq_0 b;

    public /* synthetic */ gQ(ConstraintLayout constraintLayout, iq_0 iq_02) {
        this.a = constraintLayout;
        this.b = iq_02;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ConstraintLayout constraintLayout = this.a;
        if (constraintLayout != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_action_popup;
            object2 = hv3_0.K(n4);
            object = (object = ((iq_0)object).Pa()) != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getName() : null;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = "format(...)";
            an_1.a(objectArray, n3, (String)object2, (String)object, constraintLayout);
        }
        if (constraintLayout != null) {
            ai0_2.a((View)constraintLayout);
        }
    }
}

