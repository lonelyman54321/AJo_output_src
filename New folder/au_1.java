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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aU
 */
public final class au_1
implements Runnable {
    public final /* synthetic */ du_1 a;

    public /* synthetic */ au_1(du_1 du_12) {
        this.a = du_12;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((du_1)object).b;
        if (object2 != null) {
            object2 = ((du_1)object).a;
            EditText editText = null;
            Object object3 = object2 != null ? ((yt_0)object2).e : null;
            if (object3 != null) {
                if (object2 != null && (object2 = ((yt_0)object2).e) != null) {
                    object3 = "";
                    object2.setText((CharSequence)object3);
                }
                if ((object2 = ((du_1)object).a) != null && (object2 = ((yt_0)object2).e) != null) {
                    object2.requestFocus();
                }
                if ((object2 = ((du_1)object).b) != null) {
                    object3 = "input_method";
                    object2 = object2.getSystemService((String)object3);
                } else {
                    object2 = null;
                }
                object3 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (InputMethodManager)object2;
                object = ((du_1)object).a;
                if (object != null) {
                    editText = ((yt_0)object).e;
                }
                int n3 = 1;
                object2.showSoftInput((View)editText, n3);
            }
        }
    }
}

