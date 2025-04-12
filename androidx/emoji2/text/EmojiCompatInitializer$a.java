/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.EmojiCompatInitializer$LoadEmojiCompatRunnable;
import androidx.lifecycle.i;
import kotlin.jvm.internal.Intrinsics;

public final class EmojiCompatInitializer$a
implements jm0_1 {
    public final /* synthetic */ i a;
    public final /* synthetic */ EmojiCompatInitializer b;

    public EmojiCompatInitializer$a(EmojiCompatInitializer emojiCompatInitializer, i i3) {
        this.b = emojiCompatInitializer;
        this.a = i3;
    }

    public final /* synthetic */ void A(mu1_1 mu1_12) {
        im0.a(mu1_12);
    }

    public final void onDestroy(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final /* synthetic */ void onStart(mu1_1 mu1_12) {
        im0.c(mu1_12);
    }

    public final void onStop(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }

    public final void p(mu1_1 object) {
        Object object2;
        object = this.b;
        object.getClass();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            object = Z30.a(Looper.getMainLooper());
        } else {
            object2 = Looper.getMainLooper();
            object = new Handler(object2);
        }
        object2 = new EmojiCompatInitializer$LoadEmojiCompatRunnable();
        object.postDelayed((Runnable)object2, 500L);
        this.a.c(this);
    }

    public final void w(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
    }
}

