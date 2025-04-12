/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wR2
 */
public final class wr2_0
implements View.OnClickListener {
    public final Function1 a;
    public long b;

    public wr2_0(rh0_2 rh0_22) {
        Intrinsics.checkNotNullParameter(rh0_22, "onSafeCLick");
        this.a = rh0_22;
    }

    public final void onClick(View view) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        long l2 = SystemClock.elapsedRealtime();
        long l3 = this.b;
        l2 -= l3;
        int n3 = 1000;
        l3 = n3;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 < 0) {
            return;
        }
        this.b = l2 = SystemClock.elapsedRealtime();
        this.a.invoke(view);
    }
}

