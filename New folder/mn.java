/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatDelegateImpl;

public final class mn
implements OnBackInvokedCallback {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public /* synthetic */ mn(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final void onBackInvoked() {
        this.a.T();
    }
}

