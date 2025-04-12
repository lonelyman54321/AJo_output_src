/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.EmojiCompat$f;
import java.lang.ref.WeakReference;

public final class SwitchCompat$b
extends EmojiCompat$f {
    public final WeakReference a;

    public SwitchCompat$b(SwitchCompat switchCompat) {
        WeakReference<SwitchCompat> weakReference;
        this.a = weakReference = new WeakReference<SwitchCompat>(switchCompat);
    }

    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat)((Object)this.a.get());
        if (switchCompat != null) {
            switchCompat.onEmojiCompatInitializedForSwitchText();
        }
    }

    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat)((Object)this.a.get());
        if (switchCompat != null) {
            switchCompat.onEmojiCompatInitializedForSwitchText();
        }
    }
}

