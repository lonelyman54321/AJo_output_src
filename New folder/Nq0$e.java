/*
 * Decompiled with CFR 0.152.
 */
public final class Nq0$e
extends Nq0 {
    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return true;
    }

    public final boolean c(pi0_0 pi0_02) {
        boolean bl2;
        pi0_0 pi0_03 = pi0_0.REMOTE;
        if (pi0_02 == pi0_03) {
            bl2 = true;
        } else {
            bl2 = false;
            pi0_02 = null;
        }
        return bl2;
    }

    public final boolean d(boolean bl2, pi0_0 pi0_02, cz0_0 cz0_02) {
        Enum enum_;
        if ((bl2 && pi0_02 == (enum_ = pi0_0.DATA_DISK_CACHE) || pi0_02 == (enum_ = pi0_0.LOCAL)) && cz0_02 == (enum_ = cz0_0.TRANSFORMED)) {
            bl2 = true;
        } else {
            bl2 = false;
            enum_ = null;
        }
        return bl2;
    }
}

