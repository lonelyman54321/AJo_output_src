/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;

public final class yv1
implements Cr0 {
    public final /* synthetic */ LiveData a;
    public final /* synthetic */ F62 b;

    public yv1(LiveData liveData, xv1_0 xv1_02) {
        this.a = liveData;
        this.b = xv1_02;
    }

    public final void dispose() {
        LiveData liveData = this.a;
        F62 f62 = this.b;
        liveData.j(f62);
    }
}

