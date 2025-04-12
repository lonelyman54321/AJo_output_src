/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat$a;
import androidx.emoji2.text.EmojiCompat$d;
import androidx.emoji2.text.EmojiCompat$e;
import androidx.emoji2.text.EmojiCompat$h;
import androidx.emoji2.text.e;
import androidx.emoji2.text.g;
import java.util.Set;

public final class c
extends EmojiCompat$h {
    public final /* synthetic */ EmojiCompat$a a;

    public c(EmojiCompat$a emojiCompat$a) {
        this.a = emojiCompat$a;
    }

    public final void a(Throwable throwable) {
        this.a.a.e(throwable);
    }

    public final void b(g object) {
        EmojiCompat$a emojiCompat$a = this.a;
        g g3 = emojiCompat$a.c = object;
        Object object2 = emojiCompat$a.a;
        EmojiCompat$d emojiCompat$d = ((EmojiCompat)object2).g;
        object2 = ((EmojiCompat)object2).i;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        Set set = n3 >= n4 ? Py0.a() : VP1.a();
        emojiCompat$a.b = object = new e(g3, emojiCompat$d, (EmojiCompat$e)object2, set);
        emojiCompat$a.a.f();
    }
}

