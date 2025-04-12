/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.r;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class w30$a
implements r {
    public final r a;
    public final ImmutableList b;

    public w30$a(r object, List list) {
        this.a = object;
        this.b = object = ImmutableList.copyOf((Collection)list);
    }

    public final boolean a(i i3) {
        return this.a.a(i3);
    }

    public final ImmutableList c() {
        return this.b;
    }

    public final long d() {
        return this.a.d();
    }

    public final boolean isLoading() {
        return this.a.isLoading();
    }

    public final long o() {
        return this.a.o();
    }

    public final void q(long l2) {
        this.a.q(l2);
    }
}

