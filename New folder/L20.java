/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal$OnCancelListener
 */
import android.os.CancellationSignal;
import kotlinx.coroutines.i;

public final class L20
implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ i a;

    public /* synthetic */ L20(mb3_2 mb3_22) {
        this.a = mb3_22;
    }

    public final void onCancel() {
        this.a.d(null);
    }
}

