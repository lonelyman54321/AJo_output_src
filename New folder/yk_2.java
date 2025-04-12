/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ArrayAdapter
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 */
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import com.ril.ajio.services.data.Order.CancelReasons;
import java.util.ArrayList;

/*
 * Renamed from yK
 */
public final class yk_2
implements F62 {
    public final /* synthetic */ CancelReasonFragment a;

    public /* synthetic */ yk_2(CancelReasonFragment cancelReasonFragment) {
        this.a = cancelReasonFragment;
    }

    public final void onChanged(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        object2.getClass();
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            object3 = ((CancelReasonFragment)object2).o;
            ((AjioProgressView)((Object)object3)).dismiss();
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                Spinner spinner = new ArrayList();
                object3 = "Reason";
                spinner.add(object3);
                object = (CancelReasons)((DataCallback)object).getData();
                if (object != null) {
                    object = ((CancelReasons)object).getCancelReasons();
                    spinner.addAll(object);
                    object3 = ((CancelReasonFragment)object2).k;
                    int n7 = R$layout.spinner_adapter_layout;
                    object = new ArrayAdapter((Context)object3, n7, spinner);
                    spinner = ((CancelReasonFragment)object2).n;
                    spinner.setAdapter((SpinnerAdapter)object);
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    n8 = R$string.acc_error_message;
                    object = hv3_0.K(n8);
                    object2 = "Cancel reasons cannot be loaded";
                    Object[] objectArray = new Object[n3];
                    n4 = 0;
                    object3 = null;
                    objectArray[0] = object2;
                    object = String.format((String)object, objectArray);
                    mq0_2.c((String)object2, (String)object);
                }
            }
        }
    }
}

