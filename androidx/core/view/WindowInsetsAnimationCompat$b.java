/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$a;
import androidx.core.view.f;
import java.util.List;

public abstract class WindowInsetsAnimationCompat$b {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP;
    WindowInsets mDispachedInsets;
    private final int mDispatchMode;

    public WindowInsetsAnimationCompat$b(int n3) {
        this.mDispatchMode = n3;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
    }

    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
    }

    public abstract f onProgress(f var1, List var2);

    public WindowInsetsAnimationCompat$a onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat$a windowInsetsAnimationCompat$a) {
        return windowInsetsAnimationCompat$a;
    }
}

