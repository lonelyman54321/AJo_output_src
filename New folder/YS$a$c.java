/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

public final class YS$a$c
implements TextView.OnEditorActionListener {
    public final /* synthetic */ ys_1 a;
    public final /* synthetic */ YS$a b;

    public YS$a$c(YS$a yS$a, ys_1 ys_12) {
        this.a = ys_12;
        this.b = yS$a;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4 = 6;
        if (n3 == n4) {
            textView = this.b.b;
            Context context = this.a.k;
            if (context != null) {
                Object object = context.getSystemService("input_method");
                String string2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                Intrinsics.checkNotNull(object, string2);
                object = (InputMethodManager)object;
                if (textView == null) {
                    textView = new View(context);
                }
                textView = textView.getWindowToken();
                object.hideSoftInputFromWindow((IBinder)textView, 0);
            }
            return true;
        }
        return false;
    }
}

