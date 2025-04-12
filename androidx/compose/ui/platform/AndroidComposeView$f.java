/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
package androidx.compose.ui.platform;

import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$f
extends Lambda
implements Function0 {
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ KeyEvent d;

    public AndroidComposeView$f(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        this.c = androidComposeView;
        this.d = keyEvent;
        super(0);
    }

    public final Object invoke() {
        AndroidComposeView androidComposeView = this.c;
        KeyEvent keyEvent = this.d;
        return AndroidComposeView.C(androidComposeView, keyEvent);
    }
}

