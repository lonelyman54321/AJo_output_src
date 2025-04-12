/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;

/*
 * Renamed from Ki0
 */
public final class ki0_1 {
    public static /* synthetic */ void a(EditText[] editTextArray, View view, boolean n3) {
        for (EditText editText : editTextArray) {
            boolean bl2 = editText.hasFocus();
            if (!bl2) continue;
            return;
        }
        ViewUtils.hideKeyboard(view, false);
    }

    public static /* synthetic */ void b(View view) {
        ViewUtils.requestFocusAndShowKeyboard(view, false);
    }

    public static void c(EditText ... editText) {
        int n3 = ((EditText[])editText).length;
        if (n3 == 0) {
            return;
        }
        Object object = new ii0_2((EditText[])editText);
        for (EditText editText2 : editText) {
            editText2.setOnFocusChangeListener((View.OnFocusChangeListener)object);
        }
        editText = editText[0];
        object = new ji0_1(editText);
        editText.postDelayed((Runnable)object, (long)100);
    }
}

