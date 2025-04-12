/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vb1
 */
public final class vb1_2
implements ua1_0 {
    public static final vb1_2 a;

    static {
        vb1_2 vb1_22;
        a = vb1_22 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof vb1_2;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 2058496954;
    }

    public final String toString() {
        return "HttpTimeoutCapability";
    }
}

