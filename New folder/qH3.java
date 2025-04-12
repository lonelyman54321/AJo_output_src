/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
import android.view.View;

public final class qH3
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ FF2 b;

    public qH3(View view, FF2 fF2) {
        this.a = view;
        this.b = fF2;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.b.z();
    }
}

