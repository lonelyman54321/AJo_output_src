/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yy0
 */
public final class yy0_2
implements bg1_2 {
    public final boolean a;

    public yy0_2(boolean bl2) {
        this.a = bl2;
    }

    public final d42_0 b() {
        return null;
    }

    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        String string2 = "Empty{";
        StringBuilder stringBuilder = new StringBuilder(string2);
        boolean bl2 = this.a;
        string2 = bl2 ? "Active" : "New";
        return ui0_1.a(stringBuilder, string2, '}');
    }
}

