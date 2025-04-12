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

/*
 * Renamed from hO
 */
public final class ho_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ho_1(ConstraintLayout constraintLayout) {
        this.a = 0;
        this.b = constraintLayout;
    }

    public /* synthetic */ ho_1(dl0$b_0 dl0$b_0, al0_2 al0_22) {
        this.a = 1;
        this.b = dl0$b_0;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                ((dl0$b_0)object).onSuccess();
                return;
            }
            case 0: 
        }
        object = (ConstraintLayout)((Object)object);
        if (object != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_alert_popup;
            object2 = hv3_0.K(n4);
            int n7 = R$string.acc_select_size_quantity;
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

