/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat$f;
import java.lang.ref.WeakReference;

public final class Wy0$a
extends EmojiCompat$f {
    public final WeakReference a;

    public Wy0$a(EditText editText) {
        WeakReference<EditText> weakReference;
        this.a = weakReference = new WeakReference<EditText>(editText);
    }

    public final void b() {
        wy0_0.a((EditText)this.a.get(), 1);
    }
}

