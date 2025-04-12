/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VC0
 */
public final class vc0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vc0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                object = (na3_2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((Fragment)object).getActivity();
                if (object2 != null && !(bl2 = (object2 = ((Fragment)object).requireActivity()).isFinishing()) && (object = ((Fragment)object).getActivity()) != null) {
                    ((ComponentActivity)object).onBackPressed();
                }
                return;
            }
            case 0: 
        }
        object = (gd0_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = (ExchangeReturnTabActivity)((gd0_0)object).j;
        if (object != null) {
            ((ExchangeReturnTabActivity)object).C2();
        }
    }
}

