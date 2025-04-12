/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xF3
 */
public final class xf3_2
implements ua1_0 {
    public static final xf3_2 a;

    static {
        xf3_2 xf3_22;
        a = xf3_22 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xf3_2;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return -1146563391;
    }

    public final String toString() {
        return "WebSocketCapability";
    }
}

