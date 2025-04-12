/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.widget.Toolbar;
import androidx.media3.exoplayer.source.n;

public final class wB2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wB2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((Toolbar)this.b).collapseActionView();
                return;
            }
            case 0: 
        }
        ((n)this.b).J = true;
    }
}

