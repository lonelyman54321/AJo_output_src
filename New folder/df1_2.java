/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.jio.jioads.audioplayer.d;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from dF1
 */
public final class df1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ df1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        LinearLayout linearLayout;
        int n3 = 1;
        Object object = this.b;
        String string2 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (d)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((d)object).d();
                return;
            }
            case 0: 
        }
        object = (ff1_2)object;
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = ((ff1_2)object).a;
        if (string2 != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_action_popup;
            object2 = hv3_0.K(n4);
            int n7 = R$string.select_size;
            String string3 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            string3 = "format(...)";
            zw_0.a(objectArray, n3, (String)object2, string3, (LinearLayout)string2);
        }
        if ((linearLayout = ((ff1_2)object).a) != null) {
            ai0_2.a((View)linearLayout);
        }
    }
}

