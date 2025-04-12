/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;

/*
 * Renamed from Ym
 */
public final class ym_0
extends ur3 {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public ym_0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final void a() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.v.setVisibility(0);
        Object object = appCompatDelegateImpl.v.getParent();
        boolean bl2 = object instanceof View;
        if (bl2) {
            appCompatDelegateImpl = (View)appCompatDelegateImpl.v.getParent();
            object = ViewCompat.a;
            ViewCompat$b.c((View)appCompatDelegateImpl);
        }
    }

    public final void onAnimationEnd() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.v.setAlpha(1.0f);
        appCompatDelegateImpl.y.d(null);
        appCompatDelegateImpl.y = null;
    }
}

