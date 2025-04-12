/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.ril.ajio.payment.fragment.d;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qP1
 */
public final class qp1_2
implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ qp1_2(d d2, EditText editText) {
        this.a = d2;
        this.b = editText;
    }

    public final void run() {
        boolean bl2;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        EditText editText = this.b;
        Intrinsics.checkNotNullParameter(editText, "$ettext");
        Object object2 = ((Fragment)object).getActivity();
        if (object2 != null && !(bl2 = object2.isFinishing())) {
            object2 = ((Fragment)object).getActivity();
            if (object2 != null) {
                object = "input_method";
                object2 = object2.getSystemService((String)object);
            } else {
                bl2 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            object2 = (InputMethodManager)object2;
            object = null;
            object2.showSoftInput((View)editText, 0);
        }
    }
}

