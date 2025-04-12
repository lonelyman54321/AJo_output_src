/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.Intrinsics;

public final class Uf
implements Runnable {
    public final /* synthetic */ AndroidComposeView a;

    public /* synthetic */ Uf(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void run() {
        Object object = this.a;
        ((AndroidComposeView)object).L0 = false;
        Object object2 = ((AndroidComposeView)object).F0;
        Intrinsics.checkNotNull(object2);
        int n3 = object2.getActionMasked();
        int n4 = 10;
        if (n3 == n4) {
            ((AndroidComposeView)object).V((MotionEvent)object2);
            return;
        }
        object = "The ACTION_HOVER_EXIT event was not cleared.".toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

