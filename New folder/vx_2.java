/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vx
 */
public final class vx_2
extends Wv {
    public final int b;

    public vx_2(wx_1 wx_12) {
        Intrinsics.checkNotNullParameter(wx_12, "tracker");
        super(wx_12);
        this.b = 5;
    }

    public final boolean c(EI3 eI3) {
        Intrinsics.checkNotNullParameter(eI3, "workSpec");
        return eI3.j.e;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e(Object object) {
        return (Boolean)object ^ true;
    }
}

