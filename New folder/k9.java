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

public final class k9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = "this$0";
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                ConstraintLayout constraintLayout;
                object2 = (s12)object2;
                Intrinsics.checkNotNullParameter(object2, object);
                object = ((s12)object2).d;
                if (object != null) {
                    Object object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_action_popup;
                    object3 = hv3_0.K(n4);
                    int n7 = R$string.acc_plp_filter;
                    String string2 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string2;
                    string2 = "format(...)";
                    an_1.a(objectArray, n3, (String)object3, string2, (ConstraintLayout)((Object)object));
                }
                if ((constraintLayout = ((s12)object2).d) != null) {
                    ai0_2.a((View)constraintLayout);
                }
                return;
            }
            case 1: {
                object2 = (ConstraintLayout)((Object)object2);
                if (object2 != null) {
                    ai0_2.a((View)object2);
                }
                return;
            }
            case 0: 
        }
        Object object4 = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, object);
        object4 = ((q9_0)object2).Q;
        if (object4 != null) {
            ai0_2.a((View)object4);
        }
    }
}

