/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

public final class AndroidComposeView$p
implements Wv2 {
    public final /* synthetic */ AndroidComposeView a;

    public AndroidComposeView$p(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        Uv2.a.getClass();
    }

    public final void a(Uv2 uv2) {
        int n3;
        int n4;
        if (uv2 == null) {
            Uv2.a.getClass();
            uv2 = Xv2.a;
        }
        if ((n4 = Build.VERSION.SDK_INT) >= (n3 = 24)) {
            Bg bg2 = Bg.a;
            AndroidComposeView androidComposeView = this.a;
            bg2.a((View)androidComposeView, uv2);
        }
    }
}

