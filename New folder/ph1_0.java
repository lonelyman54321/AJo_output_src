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
 * Renamed from ph1
 */
public final class ph1_0
implements Runnable {
    public final /* synthetic */ LinearLayout a;

    public /* synthetic */ ph1_0(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public final void run() {
        int n3 = 1;
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_info_popup);
        String string2 = hv3_0.K(R$string.how_ratings_calculated);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string3 = xh2_0.a(objectArray, n3, (String)object, "format(...)");
        object = this.a;
        object.setContentDescription((CharSequence)string3);
        Intrinsics.checkNotNull(object);
        ai0_2.a((View)object);
    }
}

