/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;

public final class GC3$a
implements n {
    public final /* synthetic */ gc3_2 a;

    public GC3$a(gc3_2 gc3_22) {
        this.a = gc3_22;
    }

    public final void k(mu1_1 object, i$a i$a) {
        object = i$a.ON_DESTROY;
        if (i$a == object) {
            object = this.a;
            object.getClass();
            i$a = null;
            ((gc3_2)((Object)object)).a = null;
            ((gc3_2)((Object)object)).b = null;
        }
    }
}

