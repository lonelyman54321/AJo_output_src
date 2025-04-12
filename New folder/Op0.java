/*
 * Decompiled with CFR 0.152.
 */
import androidx.profileinstaller.b;
import androidx.profileinstaller.c$c;
import java.io.Serializable;

public final class Op0
implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Op0(b b2, int n3, Serializable serializable) {
        this.a = b2;
        this.b = n3;
        this.c = serializable;
    }

    public final void run() {
        c$c c$c = this.a.b;
        Serializable serializable = (Serializable)this.c;
        int n3 = this.b;
        c$c.a(n3, serializable);
    }
}

