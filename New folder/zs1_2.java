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

/*
 * Renamed from zS1
 */
public final class zs1_2
implements Runnable {
    public final /* synthetic */ LinearLayout a;

    public /* synthetic */ zs1_2(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    public final void run() {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            int n3 = R$string.recommend_friends_family;
            String string2 = hv3_0.K(n3);
            linearLayout.setContentDescription((CharSequence)string2);
        }
        if (linearLayout != null) {
            ai0_2.a((View)linearLayout);
        }
    }
}

