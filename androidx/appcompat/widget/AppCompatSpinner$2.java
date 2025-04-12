/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatSpinner$d;

class AppCompatSpinner$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AppCompatSpinner a;

    public AppCompatSpinner$2(AppCompatSpinner appCompatSpinner) {
        this.a = appCompatSpinner;
    }

    public final void onGlobalLayout() {
        AppCompatSpinner appCompatSpinner = this.a;
        AppCompatSpinner$d appCompatSpinner$d = appCompatSpinner.getInternalPopup();
        int n3 = appCompatSpinner$d.a();
        if (n3 == 0) {
            n3 = appCompatSpinner.getTextDirection();
            int n4 = appCompatSpinner.getTextAlignment();
            AppCompatSpinner$d appCompatSpinner$d2 = appCompatSpinner.f;
            appCompatSpinner$d2.j(n3, n4);
        }
        if ((appCompatSpinner = appCompatSpinner.getViewTreeObserver()) != null) {
            appCompatSpinner.removeOnGlobalLayoutListener(this);
        }
    }
}

