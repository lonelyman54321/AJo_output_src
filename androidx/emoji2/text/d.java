/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompat$h;
import androidx.emoji2.text.g;
import java.util.concurrent.ThreadPoolExecutor;

public final class d
extends EmojiCompat$h {
    public final /* synthetic */ EmojiCompat$h a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public d(EmojiCompat$h emojiCompat$h, ThreadPoolExecutor threadPoolExecutor) {
        this.a = emojiCompat$h;
        this.b = threadPoolExecutor;
    }

    public final void a(Throwable throwable) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            EmojiCompat$h emojiCompat$h = this.a;
            emojiCompat$h.a(throwable);
            return;
        }
        finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void b(g g3) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            EmojiCompat$h emojiCompat$h = this.a;
            emojiCompat$h.b(g3);
            return;
        }
        finally {
            threadPoolExecutor.shutdown();
        }
    }
}

