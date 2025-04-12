/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.jio.jioads.network.i;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wy2
 */
public final class wy2_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wy2_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                i i3 = (i)this.b;
                Intrinsics.checkNotNullParameter(i3, "this$0");
                String string2 = (String)this.c;
                i3.d(string2);
                return;
            }
            case 0: 
        }
        Object object = (yy2_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((yy2_1)object).b.x5();
        AjioTextView ajioTextView = (AjioTextView)this.c;
        if (ajioTextView != null) {
            String string3 = null;
            String string4 = object != null ? ((Product)object).getBrandName() : null;
            if (object != null) {
                string3 = ((Product)object).getName();
            }
            n3 = R$string.revamp_oos;
            object = hv3_0.K(n3);
            String string5 = ", ";
            object = KW.a(string4, string5, string3, string5, (String)object);
            ajioTextView.setContentDescription((CharSequence)object);
        }
        if (ajioTextView != null) {
            ai0_2.a((View)ajioTextView);
        }
    }
}

