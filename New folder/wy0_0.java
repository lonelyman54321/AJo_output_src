/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat;

/*
 * Renamed from Wy0
 */
public final class wy0_0
implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public Wy0$a c;
    public boolean d;

    public wy0_0(EditText editText) {
        this.a = editText;
        this.b = false;
        this.d = true;
    }

    public static void a(EditText editText, int n3) {
        int n4 = 1;
        if (n3 == n4 && editText != null && (n3 = (int)(editText.isAttachedToWindow() ? 1 : 0)) != 0) {
            int n7;
            editText = editText.getEditableText();
            n3 = Selection.getSelectionStart((CharSequence)editText);
            n4 = Selection.getSelectionEnd((CharSequence)editText);
            EmojiCompat emojiCompat = EmojiCompat.a();
            if (editText == null) {
                n7 = 0;
            } else {
                emojiCompat.getClass();
                n7 = editText.length();
            }
            emojiCompat.g((CharSequence)editText, 0, n7, 0);
            if (n3 >= 0 && n4 >= 0) {
                Selection.setSelection((Spannable)editText, (int)n3, (int)n4);
            } else if (n3 >= 0) {
                Selection.setSelection((Spannable)editText, (int)n3);
            } else if (n4 >= 0) {
                Selection.setSelection((Spannable)editText, (int)n4);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        block1: {
            EditText editText;
            block2: {
                EmojiCompat emojiCompat;
                block3: {
                    editText = this.a;
                    int n8 = editText.isInEditMode();
                    if (n8 != 0 || (n8 = this.d) == 0 || (n8 = this.b) == 0 && (n8 = EmojiCompat.c()) == 0 || n4 > n7 || (n4 = object instanceof Spannable) == 0) break block1;
                    emojiCompat = EmojiCompat.a();
                    n4 = emojiCompat.b();
                    if (n4 == 0) break block2;
                    n8 = 1;
                    if (n4 == n8) break block3;
                    int n10 = 3;
                    if (n4 == n10) break block2;
                    break block1;
                }
                object = (Spannable)object;
                emojiCompat = EmojiCompat.a();
                editText = null;
                emojiCompat.g((CharSequence)object, n3, n7 += n3, 0);
                break block1;
            }
            object = EmojiCompat.a();
            Wy0$a wy0$a = this.c;
            if (wy0$a == null) {
                this.c = wy0$a = new Wy0$a(editText);
            }
            wy0$a = this.c;
            ((EmojiCompat)object).h(wy0$a);
        }
    }
}

