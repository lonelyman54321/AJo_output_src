/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

public final class cm
implements OnBackInvokedCallback {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ cm(Function0 function0) {
        this.a = function0;
    }

    public final void onBackInvoked() {
        Function0 function0 = this.a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

