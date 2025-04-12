/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompat$f;
import java.util.ArrayList;
import java.util.List;

class EmojiCompat$ListenerDispatcher
implements Runnable {
    public final ArrayList a;
    public final int b;

    public EmojiCompat$ListenerDispatcher() {
        throw null;
    }

    public EmojiCompat$ListenerDispatcher(List list, int n3, Throwable serializable) {
        B41.c(list, "initCallbacks cannot be null");
        super(list);
        this.a = serializable;
        this.b = n3;
    }

    public final void run() {
        int n3;
        ArrayList arrayList = this.a;
        int n4 = arrayList.size();
        int n7 = this.b;
        int n8 = 1;
        if (n7 != n8) {
            for (n3 = 0; n3 < n4; ++n3) {
                EmojiCompat$f emojiCompat$f = (EmojiCompat$f)arrayList.get(n3);
                emojiCompat$f.a();
            }
        } else {
            while (n3 < n4) {
                EmojiCompat$f emojiCompat$f = (EmojiCompat$f)arrayList.get(n3);
                emojiCompat$f.b();
                ++n3;
            }
        }
    }
}

