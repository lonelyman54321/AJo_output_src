/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from m52
 */
public final class m52_0 {
    public final boolean a;
    public final boolean b;

    public m52_0(boolean bl2, boolean bl3) {
        this.a = bl2;
        this.b = bl3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotificationInfo{fromCleverTap=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", shouldRender=");
        bl2 = this.b;
        return AR.a(stringBuilder, bl2, '}');
    }
}

