/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.Selection
 *  android.text.Spannable
 *  android.widget.TextView
 */
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat$f;
import java.lang.ref.WeakReference;

public final class Ry0$a
extends EmojiCompat$f {
    public final WeakReference a;
    public final WeakReference b;

    public Ry0$a(TextView object, Ry0 ry0) {
        WeakReference<TextView> weakReference;
        this.a = weakReference = new WeakReference<TextView>((TextView)object);
        super(ry0);
        this.b = object;
    }

    public final void b() {
        Object object;
        TextView textView = (TextView)this.a.get();
        Object object2 = (InputFilter)this.b.get();
        if (object2 != null && textView != null && (object = textView.getFilters()) != null) {
            int n3;
            int n4 = 0;
            for (int i3 = 0; i3 < (n3 = ((InputFilter[])object).length); ++i3) {
                InputFilter inputFilter = object[i3];
                if (inputFilter != object2) continue;
                int n7 = textView.isAttachedToWindow();
                if (n7 != 0) {
                    object2 = textView.getText();
                    object = EmojiCompat.a();
                    if (object2 == null) {
                        i3 = 0;
                    } else {
                        object.getClass();
                        i3 = object2.length();
                    }
                    object = ((EmojiCompat)object).g((CharSequence)object2, 0, i3, 0);
                    if (object2 == object) {
                        return;
                    }
                    n7 = Selection.getSelectionStart((CharSequence)object);
                    n4 = Selection.getSelectionEnd((CharSequence)object);
                    textView.setText((CharSequence)object);
                    boolean bl2 = object instanceof Spannable;
                    if (bl2) {
                        object = (Spannable)object;
                        if (n7 >= 0 && n4 >= 0) {
                            Selection.setSelection((Spannable)object, (int)n7, (int)n4);
                        } else if (n7 >= 0) {
                            Selection.setSelection((Spannable)object, (int)n7);
                        } else if (n4 >= 0) {
                            Selection.setSelection((Spannable)object, (int)n4);
                        }
                    }
                }
                return;
            }
        }
    }
}

