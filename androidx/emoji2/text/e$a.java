/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.SpannableString
 */
package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.emoji2.text.EmojiCompat$d;
import androidx.emoji2.text.EmojiCompat$i;
import androidx.emoji2.text.e$b;

public final class e$a
implements e$b {
    public iw3 a;
    public final EmojiCompat$i b;

    public e$a(iw3 iw32, EmojiCompat$i emojiCompat$i) {
        this.a = iw32;
        this.b = emojiCompat$i;
    }

    public final boolean a(CharSequence object, int n3, int n4, rt3 rt32) {
        int n7 = rt32.c & 4;
        boolean bl2 = true;
        if (n7 > 0) {
            return bl2;
        }
        iw3 iw32 = this.a;
        if (iw32 == null) {
            boolean bl3 = object instanceof Spannable;
            if (bl3) {
                object = (Spannable)object;
            } else {
                SpannableString spannableString = new SpannableString(object);
                object = spannableString;
            }
            this.a = iw32 = new iw3((Spannable)object);
        }
        ((EmojiCompat$d)this.b).getClass();
        object = new Ty0(rt32);
        this.a.setSpan(object, n3, n4, 33);
        return bl2;
    }

    public final Object getResult() {
        return this.a;
    }
}

