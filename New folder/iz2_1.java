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

/*
 * Renamed from iz2
 */
public final class iz2_1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ iz2_1(EditText editText, EditText editText2) {
        this.a = editText;
        this.b = editText2;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4 = 6;
        if (n3 == n4) {
            this.a.clearFocus();
            textView = this.b;
            if (textView != null) {
                textView.requestFocus();
            }
            n4 = 1;
        } else {
            n4 = 0;
            textView = null;
        }
        return n4;
    }
}

