/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.contentcapture.ContentCaptureSession
 */
package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$e
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        View view = (View)this.receiver;
        Fg$a fg$a = Fg.a;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            n4 = 1;
            FC3$c.a(view, n4);
        }
        n4 = 29;
        v60 v602 = null;
        if (n3 >= n4 && (fg$a = FC3$b.a(view)) != null) {
            v602 = new v60((ContentCaptureSession)fg$a, view);
        }
        return v602;
    }
}

