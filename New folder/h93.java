/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsController
 *  android.view.WindowInsetsController$OnControllableInsetsChangedListener
 */
import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h93
implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ h93(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController object, int n3) {
        object = this.a;
        n3 = (n3 &= 8) != 0 ? 1 : 0;
        ((AtomicBoolean)object).set(n3 != 0);
    }
}

