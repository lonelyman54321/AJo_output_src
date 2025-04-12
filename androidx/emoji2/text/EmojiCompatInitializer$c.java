/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompat$g;
import androidx.emoji2.text.EmojiCompat$h;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class EmojiCompatInitializer$c
implements EmojiCompat$g {
    public final Context a;

    public EmojiCompatInitializer$c(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final void a(EmojiCompat$h emojiCompat$h) {
        ThreadPoolExecutor threadPoolExecutor;
        X30 x30 = new X30("EmojiCompatInitializer");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<Runnable>();
        Object object = threadPoolExecutor;
        threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long)15, timeUnit, linkedBlockingDeque, x30);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        object = new Ky0(this, emojiCompat$h, threadPoolExecutor);
        threadPoolExecutor.execute((Runnable)object);
    }
}

