/*
 * Decompiled with CFR 0.152.
 */
public final class Ae {
    public int a;

    public Ae(int n3) {
        this.a = n3;
    }

    public final boolean a() {
        int n3 = this.a;
        int n4 = -1 << -1;
        n3 = n3 != n4 ? 1 : 0;
        return n3 != 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = super.toString();
        stringBuilder.append(string2);
        stringBuilder.append("{ location = ");
        return g30.a(this.a, " }", stringBuilder);
    }
}

