/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent$Callback
 *  android.view.View
 */
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from YD0
 */
public final class yd0_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ yd0_1(KeyEvent.Callback callback2, int n3) {
        this.a = n3;
        this.b = callback2;
    }

    public final void run() {
        Object object = this.b;
        int n3 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (ConstraintLayout)((Object)object);
                if (object != null) {
                    Object object2 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_info_popup;
                    object2 = hv3_0.K(n4);
                    int n7 = R$string.how_to_find_upi;
                    String string2 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string2;
                    string2 = "format(...)";
                    an_1.a(objectArray, n3, (String)object2, string2, (ConstraintLayout)((Object)object));
                }
                if (object != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 0: 
        }
        object = (ExchangeReturnVerifyActivity)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        RecyclerView recyclerView = ((ExchangeReturnVerifyActivity)object).r0;
        Intrinsics.checkNotNull(recyclerView);
        object = ((ExchangeReturnVerifyActivity)object).r0;
        Intrinsics.checkNotNull(object);
        object = ((RecyclerView)object).getAdapter();
        Intrinsics.checkNotNull(object);
        int n8 = ((RecyclerView$f)object).getItemCount() - n3;
        recyclerView.smoothScrollToPosition(n8);
    }
}

