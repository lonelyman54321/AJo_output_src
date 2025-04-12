/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment$onRatingChangedEvent$1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gg2
 */
public final class gg2_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gg2_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.b;
        Object object2 = this.c;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (String)object2;
                object = (TextView)object;
                object.setContentDescription((CharSequence)object2);
                ai0_2.a((View)object);
                return;
            }
            case 0: 
        }
        n3 = OrderSummaryFragment$onRatingChangedEvent$1.c;
        object = (bg2_1)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = (wd2_0)object2;
        Intrinsics.checkNotNullParameter(object2, "$fragment");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        FragmentManager fragmentManager = ((Fragment)object).getChildFragmentManager();
        String string2 = "getChildFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(fragmentManager, string2);
        object3.getClass();
        n3 = (int)(cp_1.e(fragmentManager) ? 1 : 0);
        if (n3 == 0) {
            object = ((Fragment)object).getChildFragmentManager();
            object3 = "RatingBottomSheetFragment";
            ((DialogFragment)object2).show((FragmentManager)object, (String)object3);
        }
    }
}

