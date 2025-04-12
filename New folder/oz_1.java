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
 * Renamed from Oz
 */
public final class oz_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        ii3_0 ii3_02 = null;
        Object object = this.c;
        Object object2 = this.b;
        int n3 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                ii3_02 = ((Cn3)object2).b;
                object = (xb3_0)object;
                ii3_02.c((xb3_0)object, 3);
                return;
            }
            case 0: 
        }
        object2 = (sz_2)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        int n7 = ((sz_2)object2).c;
        object = (ConstraintLayout)((Object)object);
        String string2 = "format(...)";
        if (n7 != 0) {
            if (object != null) {
                object2 = StringCompanionObject.INSTANCE;
                n7 = R$string.acc_alert_popup;
                object2 = hv3_0.K(n7);
                int n8 = R$string.ag_add_wallet_dialog_title;
                String string3 = hv3_0.K(n8);
                Object[] objectArray = new Object[n3];
                objectArray[0] = string3;
                an_1.a(objectArray, n3, (String)object2, string2, (ConstraintLayout)((Object)object));
            }
        } else if (object != null) {
            object2 = StringCompanionObject.INSTANCE;
            n7 = R$string.acc_alert_popup;
            object2 = hv3_0.K(n7);
            int n10 = R$string.ag_check_balance_dialog_title;
            String string4 = hv3_0.K(n10);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string4;
            an_1.a(objectArray, n3, (String)object2, string2, (ConstraintLayout)((Object)object));
        }
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

