/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from WM
 */
public final class wm_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (oy1_1)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object.getClass();
                l l2 = nu1_0.a((mu1_1)object);
                ry1_2 ry1_22 = new ry1_2((oy1_1)object, null);
                Ae3.d(l2, null, null, ry1_22, 3);
                return;
            }
            case 0: 
        }
        object = (ConstraintLayout)((Object)object);
        if (object != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_action_popup;
            object2 = hv3_0.K(n4);
            int n7 = R$string.remove_bag_refresh;
            String string2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            string2 = "format(...)";
            an_1.a(objectArray, n3, (String)object2, string2, (ConstraintLayout)((Object)object));
        }
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

