/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SegmentFinder
 */
import android.text.SegmentFinder;

public final class jm$a
extends SegmentFinder {
    public final /* synthetic */ xx2_0 a;

    public jm$a(xx2_0 xx2_02) {
        this.a = xx2_02;
    }

    public final int nextEndBoundary(int n3) {
        return this.a.l(n3);
    }

    public final int nextStartBoundary(int n3) {
        return this.a.h(n3);
    }

    public final int previousEndBoundary(int n3) {
        return this.a.G(n3);
    }

    public final int previousStartBoundary(int n3) {
        return this.a.j(n3);
    }
}

