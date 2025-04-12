/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fs0
 */
public final class fs0_0 {
    public final String a;

    public fs0_0(String string2) {
        this.a = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static fs0_0 a(Xm2 object) {
        Object object2;
        ((Xm2)object).J(2);
        int n3 = ((Xm2)object).w();
        int n4 = n3 >> 1;
        n3 &= 1;
        int n7 = 5;
        int n8 = ((Xm2)object).w() >> 3 & 0x1F | (n3 <<= n7);
        n3 = 4;
        if (n4 != n3 && n4 != n7 && n4 != (n3 = 7)) {
            n3 = 8;
            if (n4 == n3) {
                object2 = "hev1";
            } else {
                n3 = 9;
                if (n4 != n3) return null;
                object2 = "avc3";
            }
        } else {
            object2 = "dvhe";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object2);
        object2 = ".0";
        stringBuilder.append((String)object2);
        stringBuilder.append(n4);
        n4 = 10;
        if (n8 >= n4) {
            object2 = ".";
        }
        stringBuilder.append((String)object2);
        stringBuilder.append(n8);
        object = stringBuilder.toString();
        return new fs0_0((String)object);
    }
}

