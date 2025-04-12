/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Editable
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.Spanned
 *  android.util.Log
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/*
 * Renamed from Nm3
 */
public final class nm3_0
implements V82 {
    public final M60 a(View view, M60 object) {
        int n3;
        Object object2 = "ReceiveContent";
        int n4 = 3;
        int n7 = Log.isLoggable((String)object2, (int)n4);
        if (n7 != 0) {
            Objects.toString(object);
        }
        if ((n7 = (object2 = ((M60)object).a).getSource()) == (n4 = 2)) {
            return object;
        }
        object = ((M60)object).a;
        object2 = object.a();
        int n8 = object.getFlags();
        view = (TextView)view;
        Editable editable = (Editable)view.getText();
        view = view.getContext();
        int n10 = 0;
        for (int i3 = 0; i3 < (n3 = object2.getItemCount()); ++i3) {
            Object object3 = object2.getItemAt(i3);
            int n14 = 1;
            int n15 = n8 & 1;
            if (n15 != 0) {
                n15 = (object3 = object3.coerceToText((Context)view)) instanceof Spanned;
                if (n15 != 0) {
                    object3 = ((CharSequence)object3).toString();
                }
            } else {
                object3 = object3.coerceToStyledText((Context)view);
            }
            if (object3 == null) continue;
            if (n10 == 0) {
                n10 = Selection.getSelectionStart((CharSequence)editable);
                n15 = Selection.getSelectionEnd((CharSequence)editable);
                int n16 = Math.min(n10, n15);
                n16 = Math.max(0, n16);
                n10 = Math.max(n10, n15);
                n10 = Math.max(0, n10);
                Selection.setSelection((Spannable)editable, (int)n10);
                editable.replace(n16, n10, (CharSequence)object3);
                n10 = 1;
                continue;
            }
            n14 = Selection.getSelectionEnd((CharSequence)editable);
            String string2 = "\n";
            editable.insert(n14, (CharSequence)string2);
            n14 = Selection.getSelectionEnd((CharSequence)editable);
            editable.insert(n14, (CharSequence)object3);
        }
        return null;
    }
}

