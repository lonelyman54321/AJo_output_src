/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package androidx.compose.ui.platform;

import android.os.SystemClock;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$r
extends Lambda
implements Function0 {
    public final /* synthetic */ AndroidComposeView c;

    public AndroidComposeView$r(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
        super(0);
    }

    public final Object invoke() {
        int n3;
        int n4;
        AndroidComposeView androidComposeView = this.c;
        Object object = androidComposeView.F0;
        if (object != null && ((n4 = object.getActionMasked()) == (n3 = 7) || n4 == (n3 = 9))) {
            long l2;
            androidComposeView.G0 = l2 = SystemClock.uptimeMillis();
            object = androidComposeView.J0;
            androidComposeView.post((Runnable)object);
        }
        return Unit.a;
    }
}

