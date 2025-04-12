/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from id1
 */
public final class id1_0 {
    public final int a;

    public /* synthetic */ id1_0(int n3) {
        this.a = n3;
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof id1_0;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (id1_0)object;
            n3 = this.a;
            int n4 = ((id1_0)object).a;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String string2 = null;
        int n3 = this.a;
        boolean bl2 = id1_0.a(n3, 0);
        string2 = bl2 ? "Argb8888" : ((bl2 = id1_0.a(n3, 1)) ? "Alpha8" : ((bl2 = id1_0.a(n3, 2)) ? "Rgb565" : ((bl2 = id1_0.a(n3, 3)) ? "F16" : ((bl2 = id1_0.a(n3, 4)) ? "Gpu" : "Unknown"))));
        return string2;
    }
}

