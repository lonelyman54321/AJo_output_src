/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hc3
 */
public final class hc3_1
extends Wv {
    public final int b;

    public hc3_1(N50 n50) {
        Intrinsics.checkNotNullParameter(n50, "tracker");
        super(n50);
        this.b = 9;
    }

    public final boolean c(EI3 eI3) {
        Intrinsics.checkNotNullParameter(eI3, "workSpec");
        return eI3.j.f;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e(Object object) {
        return (Boolean)object ^ true;
    }
}

