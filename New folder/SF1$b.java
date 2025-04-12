/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.ril.ajio.R$color;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class SF1$b
implements TextWatcher {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ TextView c;

    public SF1$b(EditText editText, EditText editText2, TextView textView) {
        this.a = editText;
        this.b = editText2;
        this.c = textView;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "arg0");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "arg0");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        int n8;
        Object object2 = "query";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.toString();
        n3 = object.length();
        TextView textView = this.c;
        if (n3 > 0) {
            void var8_10;
            int n10;
            n3 = 0;
            object2 = null;
            EditText editText = this.a;
            if (editText != null) {
                Editable editable = editText.getText();
            } else {
                n10 = 0;
                Object var8_9 = null;
            }
            if (var8_10 != null && (n10 = var8_10.length()) != 0) {
                int n14;
                if (editText != null) {
                    object2 = editText.getText();
                }
                object2 = StringsKt.toIntOrNull(String.valueOf(object2));
                object = StringsKt.toIntOrNull((String)object);
                if (object2 != null && object != null) {
                    int n15;
                    n3 = (Integer)object2;
                    if (n3 <= (n15 = ((Integer)object).intValue())) {
                        if (textView != null) {
                            n15 = R$color.accent_color_21;
                            textView.setBackgroundResource(n15);
                        }
                        if (textView == null) return;
                        n15 = hv3_0.m(R$color.new_accent_color_31);
                        textView.setTextColor(n15);
                        return;
                    }
                    if (textView != null) {
                        n15 = R$color.new_accent_color_31;
                        textView.setBackgroundResource(n15);
                    }
                    if (textView == null) return;
                    n15 = hv3_0.m(R$color.new_accent_color_33);
                    textView.setTextColor(n15);
                    return;
                }
                String string2 = "";
                if (object2 == null && editText != null) {
                    editText.setText((CharSequence)string2);
                }
                if (object == null && (object = this.b) != null) {
                    object.setText((CharSequence)string2);
                }
                if (textView != null) {
                    n14 = R$color.new_accent_color_31;
                    textView.setBackgroundResource(n14);
                }
                if (textView == null) return;
                n14 = hv3_0.m(R$color.new_accent_color_33);
                textView.setTextColor(n14);
                return;
            }
        }
        if (textView != null) {
            n8 = R$color.new_accent_color_31;
            textView.setBackgroundResource(n8);
        }
        if (textView == null) return;
        n8 = hv3_0.m(R$color.new_accent_color_33);
        textView.setTextColor(n8);
    }
}

