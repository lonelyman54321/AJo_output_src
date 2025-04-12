/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.view.KeyEvent
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ps2
 */
public final class ps2_1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ ss2_2 a;

    public /* synthetic */ ps2_1(ss2_2 ss2_22) {
        this.a = ss2_22;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent object2) {
        object = this.a;
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = 6;
        boolean bl2 = false;
        if (n3 == n4) {
            Object object3 = object.i;
            if (object3 != null) {
                object2 = object3.getContext();
                String string2 = "input_method";
                object2 = object2.getSystemService(string2);
                string2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                Intrinsics.checkNotNull(object2, string2);
                object2 = (InputMethodManager)object2;
                object3 = object3.getWindowToken();
                try {
                    object2.hideSoftInputFromWindow((IBinder)object3, 0);
                }
                catch (Exception exception) {
                    object2 = yn3_0.a;
                    ((yn3$a)object2).e(exception);
                }
            }
            object3 = cp_1.Companion;
            object3.getClass();
            n3 = (int)(cp$a.s() ? 1 : 0);
            if (n3 != 0) {
                int n7;
                object3 = object.u;
                n4 = -1;
                if (object3 == null || (n7 = ((tt3_0)object3).f) != n4) {
                    if (object3 != null) {
                        ((tt3_0)object3).f = n4;
                    }
                    if (object3 != null) {
                        object3.notifyDataSetChanged();
                    }
                }
            }
            object3 = object.k;
            object3.setVisibility(0);
            object = object.p;
            if (object != null) {
                object.setVisibility(0);
            }
            bl2 = true;
        }
        return bl2;
    }
}

