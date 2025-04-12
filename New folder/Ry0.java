/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.Spanned
 *  android.widget.TextView
 */
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

public final class Ry0
implements InputFilter {
    public final TextView a;
    public Ry0$a b;

    public Ry0(TextView textView) {
        this.a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int n3, int n4, Spanned object, int n7, int n8) {
        TextView textView = this.a;
        int n10 = textView.isInEditMode();
        if (n10 != 0) {
            return charSequence;
        }
        EmojiCompat emojiCompat = EmojiCompat.a();
        n10 = emojiCompat.b();
        if (n10 != 0) {
            int n14 = 1;
            if (n10 != n14) {
                n3 = 3;
                if (n10 != n3) {
                    return charSequence;
                }
            } else {
                int n15;
                if ((n8 != 0 || n7 != 0 || (n15 = object.length()) != 0 || charSequence != (object = textView.getText())) && charSequence != null) {
                    if (n3 != 0 || n4 != (n15 = charSequence.length())) {
                        charSequence = charSequence.subSequence(n3, n4);
                    }
                    EmojiCompat emojiCompat2 = EmojiCompat.a();
                    n4 = charSequence.length();
                    n15 = 0;
                    object = null;
                    charSequence = emojiCompat2.g(charSequence, 0, n4, 0);
                }
                return charSequence;
            }
        }
        EmojiCompat emojiCompat3 = EmojiCompat.a();
        Ry0$a ry0$a = this.b;
        if (ry0$a == null) {
            this.b = ry0$a = new Ry0$a(textView, this);
        }
        ry0$a = this.b;
        emojiCompat3.h(ry0$a);
        return charSequence;
    }
}

