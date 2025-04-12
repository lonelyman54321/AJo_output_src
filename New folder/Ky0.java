/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.emoji2.text.EmojiCompat$c;
import androidx.emoji2.text.EmojiCompat$h;
import androidx.emoji2.text.EmojiCompatInitializer$c;
import androidx.emoji2.text.a;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f$b;
import java.util.concurrent.ThreadPoolExecutor;

public final class Ky0
implements Runnable {
    public final /* synthetic */ EmojiCompatInitializer$c a;
    public final /* synthetic */ EmojiCompat$h b;
    public final /* synthetic */ ThreadPoolExecutor c;

    public /* synthetic */ Ky0(EmojiCompatInitializer$c c2, EmojiCompat$h h3, ThreadPoolExecutor threadPoolExecutor) {
        this.a = c2;
        this.b = h3;
        this.c = threadPoolExecutor;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        ThreadPoolExecutor threadPoolExecutor;
        EmojiCompat$h emojiCompat$h;
        block8: {
            Object object;
            block7: {
                Object object2;
                object = this.a;
                emojiCompat$h = this.b;
                threadPoolExecutor = this.c;
                object.getClass();
                try {
                    object = ((EmojiCompatInitializer$c)object).a;
                    object = androidx.emoji2.text.a.a((Context)object);
                    if (object == null) break block7;
                    object2 = ((EmojiCompat$c)object).a;
                    object2 = (f$b)object2;
                    Object object3 = ((f$b)object2).d;
                    synchronized (object3) {
                        ((f$b)object2).f = threadPoolExecutor;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                {
                    object = ((EmojiCompat$c)object).a;
                    object2 = new d(emojiCompat$h, threadPoolExecutor);
                    object.a((EmojiCompat$h)object2);
                    return;
                }
            }
            String string2 = "EmojiCompat font provider not available on this device.";
            object = new RuntimeException(string2);
            throw object;
        }
        emojiCompat$h.a(throwable2);
        threadPoolExecutor.shutdown();
    }
}

