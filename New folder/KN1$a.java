/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;

public final class KN1$a
implements F62 {
    public final LiveData a;
    public final F62 b;
    public int c = -1;

    public KN1$a(LiveData liveData, F62 f62) {
        this.a = liveData;
        this.b = f62;
    }

    public final void onChanged(Object object) {
        int n3 = this.c;
        LiveData liveData = this.a;
        int n4 = liveData.g;
        if (n3 != n4) {
            this.c = n4;
            F62 f62 = this.b;
            f62.onChanged(object);
        }
    }
}

