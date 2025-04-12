/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package androidx.compose.foundation.layout;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$a;
import androidx.core.view.WindowInsetsAnimationCompat$b;
import androidx.core.view.WindowInsetsAnimationCompat$d;
import androidx.core.view.f;
import java.util.List;

final class InsetsListener
extends WindowInsetsAnimationCompat$b
implements Runnable,
T72,
View.OnAttachStateChangeListener {
    public boolean a;
    public f b;

    public final f onApplyWindowInsets(View view, f f5) {
        this.b = f5;
        throw null;
    }

    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        long l2;
        this.a = false;
        f f5 = this.b;
        WindowInsetsAnimationCompat$d windowInsetsAnimationCompat$d = windowInsetsAnimationCompat.a;
        long l3 = windowInsetsAnimationCompat$d.a();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false && f5 != null) {
            throw null;
        }
        this.b = null;
        super.onEnd(windowInsetsAnimationCompat);
    }

    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.a = true;
        super.onPrepare(windowInsetsAnimationCompat);
    }

    public final f onProgress(f f5, List list) {
        throw null;
    }

    public final WindowInsetsAnimationCompat$a onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat$a windowInsetsAnimationCompat$a) {
        this.a = false;
        return super.onStart(windowInsetsAnimationCompat, windowInsetsAnimationCompat$a);
    }

    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void run() {
        boolean bl2 = this.a;
        if (bl2) {
            bl2 = false;
            this.a = false;
            f f5 = this.b;
            if (f5 != null) {
                throw null;
            }
        }
    }
}

