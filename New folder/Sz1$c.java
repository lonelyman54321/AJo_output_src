/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.widget.EditText
 */
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

public final class Sz1$c
implements View.OnKeyListener {
    public final EditText a;
    public final EditText b;
    public final EditText c;
    public final /* synthetic */ sz1_2 d;

    public Sz1$c(sz1_2 sz1_22, EditText editText, EditText editText2, EditText editText3) {
        Intrinsics.checkNotNullParameter(editText2, "curr");
        this.d = sz1_22;
        this.a = editText;
        this.b = editText2;
        this.c = editText3;
    }

    public final boolean onKey(View object, int n3, KeyEvent keyEvent) {
        int n4;
        object = null;
        if (keyEvent != null && (n4 = keyEvent.getAction()) == 0) {
            n4 = keyEvent.getKeyCode();
            int n7 = 66;
            boolean bl2 = true;
            EditText editText = this.b;
            if (n4 != n7 && n3 != (n4 = 6)) {
                Object object2;
                int n8;
                n3 = keyEvent.getKeyCode();
                if (n3 == (n8 = 67) && ((object2 = editText.getText()) == null || (n3 = object2.length()) == 0)) {
                    object = this.a;
                    if (object != null) {
                        object2 = "";
                        object.setText((CharSequence)object2);
                    }
                    if (object != null) {
                        editText.clearFocus();
                        object.requestFocus();
                    }
                    return bl2;
                }
                return false;
            }
            editText.clearFocus();
            object = this.c;
            if (object != null) {
                object.requestFocus();
            } else {
                object = this.d;
                sz1_2.Pa((sz1_2)object);
            }
            return bl2;
        }
        return false;
    }
}

