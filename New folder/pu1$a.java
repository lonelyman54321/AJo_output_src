/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import java.util.HashMap;

public final class pu1$a
implements ku1_0 {
    public final /* synthetic */ i a;
    public final /* synthetic */ pu1_0 b;

    public pu1$a(pu1_0 pu1_02, i i3) {
        this.b = pu1_02;
        this.a = i3;
    }

    public final void onDestroy() {
        HashMap hashMap = this.b.a;
        i i3 = this.a;
        hashMap.remove(i3);
    }

    public final void onStart() {
    }

    public final void onStop() {
    }
}

