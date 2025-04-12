/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
package androidx.emoji2.text;

import android.os.Trace;
import androidx.emoji2.text.EmojiCompat;

class EmojiCompatInitializer$LoadEmojiCompatRunnable
implements Runnable {
    public final void run() {
        Throwable throwable2;
        block6: {
            block5: {
                Object object = "EmojiCompat.EmojiCompatInitializer.run";
                try {}
                catch (Throwable throwable2) {
                    break block6;
                }
                Trace.beginSection((String)object);
                boolean bl2 = EmojiCompat.c();
                if (!bl2) break block5;
                object = EmojiCompat.a();
                ((EmojiCompat)object).d();
            }
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw throwable2;
    }
}

