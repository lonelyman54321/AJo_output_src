/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
import android.view.View;
import kotlinx.coroutines.i;

public final class nH3
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ i a;

    public nH3(mb3_2 mb3_22) {
        this.a = mb3_22;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.a.d(null);
    }
}

