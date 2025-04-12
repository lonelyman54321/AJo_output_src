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

/*
 * Renamed from nK
 */
public final class nk_1
implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ConstraintLayout b;

    public /* synthetic */ nk_1(boolean bl2, ConstraintLayout constraintLayout) {
        this.a = bl2;
        this.b = constraintLayout;
    }

    public final void run() {
        int n3 = 1;
        ConstraintLayout constraintLayout = this.b;
        Object object = "$parentLyt";
        Intrinsics.checkNotNullParameter((Object)constraintLayout, (String)object);
        int n4 = this.a;
        String string2 = "format(...)";
        if (n4 != 0) {
            object = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_action_popup;
            object = hv3_0.K(n4);
            int n7 = R$string.are_you_sure_delete_item;
            String string3 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            an_1.a(objectArray, n3, (String)object, string2, constraintLayout);
        } else {
            object = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_action_popup;
            object = hv3_0.K(n4);
            int n8 = R$string.are_you_sure_reset_request;
            String string4 = hv3_0.K(n8);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string4;
            an_1.a(objectArray, n3, (String)object, string2, constraintLayout);
        }
        ai0_2.a((View)constraintLayout);
    }
}

