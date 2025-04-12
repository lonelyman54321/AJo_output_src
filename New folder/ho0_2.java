/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Ho0
 */
public final class ho0_2
implements Runnable {
    public final /* synthetic */ LinearLayout a;

    public /* synthetic */ ho0_2(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public final void run() {
        int n3 = 1;
        LinearLayout linearLayout = this.a;
        Intrinsics.checkNotNullParameter(linearLayout, "$parentLyt");
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_action_popup);
        String string2 = hv3_0.K(R$string.pesdk_remove_card);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        zw_0.a(objectArray, n3, (String)object, "format(...)", linearLayout);
        ai0_2.a((View)linearLayout);
    }
}

