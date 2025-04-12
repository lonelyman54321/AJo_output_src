/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from zQ1
 */
public abstract class zq1_0 {
    public final int a;

    public zq1_0(int n3) {
        this.a = n3;
    }

    public static String a(int n3) {
        StringBuilder stringBuilder = new StringBuilder("");
        char c2 = (char)(n3 >> 24 & 0xFF);
        stringBuilder.append(c2);
        c2 = (char)(n3 >> 16 & 0xFF);
        stringBuilder.append(c2);
        c2 = (char)(n3 >> 8 & 0xFF);
        stringBuilder.append(c2);
        n3 = (char)(n3 & 0xFF);
        stringBuilder.append((char)n3);
        return stringBuilder.toString();
    }

    public String toString() {
        return zq1_0.a(this.a);
    }
}

