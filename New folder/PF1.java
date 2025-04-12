/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public final class PF1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ PF1(EditText editText, TextView textView) {
        this.a = editText;
        this.b = textView;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4 = 6;
        if (n3 == n4) {
            this.a.clearFocus();
            textView = this.b;
            if (textView != null) {
                textView.performClick();
            }
            n4 = 1;
        } else {
            n4 = 0;
            textView = null;
        }
        return n4;
    }
}

