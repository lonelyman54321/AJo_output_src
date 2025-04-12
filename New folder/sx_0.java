/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sx
 */
public final class sx_0
extends Wv {
    public final int b;

    public sx_0(N50 n50) {
        Intrinsics.checkNotNullParameter(n50, "tracker");
        super(n50);
        this.b = 6;
    }

    public final boolean c(EI3 eI3) {
        Intrinsics.checkNotNullParameter(eI3, "workSpec");
        return eI3.j.c;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e(Object object) {
        return (Boolean)object ^ true;
    }
}

