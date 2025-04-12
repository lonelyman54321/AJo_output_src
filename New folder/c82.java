/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

public final class c82
implements OnBackInvokedCallback {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ c82(b82_0 b82_02) {
        this.a = b82_02;
    }

    public final void onBackInvoked() {
        this.a.invoke();
    }
}

