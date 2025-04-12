/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat$c;
import androidx.emoji2.text.EmojiCompat$g;
import androidx.emoji2.text.EmojiCompatInitializer$a;
import androidx.emoji2.text.EmojiCompatInitializer$b;
import androidx.emoji2.text.EmojiCompatInitializer$c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer
implements wh1_0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Context context) {
        block6: {
            int n3;
            Object object = new EmojiCompatInitializer$c(context);
            EmojiCompatInitializer$b emojiCompatInitializer$b = new EmojiCompat$c((EmojiCompat$g)object);
            emojiCompatInitializer$b.b = n3 = 1;
            object = EmojiCompat.k;
            if (object == null) {
                object = EmojiCompat.j;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                EmojiCompat emojiCompat = EmojiCompat.k;
                                if (emojiCompat != null) break block4;
                                EmojiCompat.k = emojiCompat = new EmojiCompat(emojiCompatInitializer$b);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        this.c(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Context object) {
        object = Bo.c((Context)object);
        Object object2 = ProcessLifecycleInitializer.class;
        object.getClass();
        Object object3 = Bo.e;
        synchronized (object3) {
            try {
                Object object4 = ((Bo)object).a;
                object4 = ((HashMap)object4).get(object2);
                if (object4 == null) {
                    object4 = new HashSet();
                    object4 = ((Bo)object).b((Class)object2, (HashSet)object4);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl13 : MonitorExitStatement: MONITOREXIT : var3_4
                object = ((mu1_1)object4).getLifecycle();
                object2 = new EmojiCompatInitializer$a(this, (i)object);
                ((i)object).a((lu1)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

