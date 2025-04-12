/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
import android.view.View;
import android.widget.EditText;

public final class LF1
implements View.OnClickListener {
    public final /* synthetic */ EditText a;

    public /* synthetic */ LF1(EditText editText) {
        this.a = editText;
    }

    public final void onClick(View view) {
        view = this.a;
        if (view != null) {
            view.requestFocus();
        }
    }
}

