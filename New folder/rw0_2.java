/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$string;
import in.juspay.hypersdk.core.DuiInterface;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from rw0
 */
public final class rw0_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rw0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (ConstraintLayout)((Object)object);
                if (object != null) {
                    Object object2 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_action_popup;
                    object2 = hv3_0.K(n4);
                    int n7 = R$string.acc_icon_filter_referral_image_search;
                    String string2 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string2;
                    string2 = "format(...)";
                    an_1.a(objectArray, n3, (String)object2, string2, (ConstraintLayout)((Object)object));
                }
                if (object != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 0: 
        }
        DuiInterface.h((DuiInterface)object);
    }
}

