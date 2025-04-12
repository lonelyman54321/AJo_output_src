/*
 * Decompiled with CFR 0.152.
 */
public final class Rn1 {
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final /* synthetic */ int n;
    public final long a;

    static {
        to1_0.a(0);
        to1_0.a(1);
        to1_0.a(2);
        to1_0.a(3);
        b = to1_0.a(4);
        fo_0.a(259, 260, 261, 262, 263);
        fo_0.a(280, 281, 282, 283, 5);
        to1_0.a(6);
        c = to1_0.a(19);
        d = to1_0.a(20);
        e = to1_0.a(21);
        f = to1_0.a(22);
        g = to1_0.a(23);
        fo_0.a(268, 269, 270, 271, 24);
        fo_0.a(25, 26, 27, 28, 7);
        fo_0.a(8, 9, 10, 11, 12);
        fo_0.a(13, 14, 15, 16, 81);
        fo_0.a(69, 17, 70, 18, 29);
        fo_0.a(30, 31, 32, 33, 34);
        fo_0.a(35, 36, 37, 38, 39);
        fo_0.a(40, 41, 42, 43, 44);
        fo_0.a(45, 46, 47, 48, 49);
        fo_0.a(50, 51, 52, 53, 54);
        fo_0.a(55, 56, 57, 58, 59);
        to1_0.a(60);
        h = to1_0.a(61);
        to1_0.a(62);
        to1_0.a(63);
        to1_0.a(64);
        to1_0.a(65);
        i = to1_0.a(66);
        to1_0.a(67);
        to1_0.a(112);
        j = to1_0.a(111);
        fo_0.a(113, 114, 115, 116, 117);
        fo_0.a(118, 119, 120, 121, 122);
        fo_0.a(123, 124, 277, 278, 279);
        fo_0.a(68, 71, 72, 76, 73);
        fo_0.a(74, 75, 77, 78, 79);
        to1_0.a(80);
        to1_0.a(82);
        to1_0.a(83);
        to1_0.a(84);
        k = to1_0.a(92);
        l = to1_0.a(93);
        fo_0.a(94, 95, 96, 97, 98);
        fo_0.a(99, 100, 101, 102, 103);
        fo_0.a(104, 105, 106, 107, 108);
        fo_0.a(109, 110, 188, 189, 190);
        fo_0.a(191, 192, 193, 194, 195);
        fo_0.a(196, 197, 198, 199, 200);
        fo_0.a(201, 202, 203, 125, 131);
        fo_0.a(132, 133, 134, 135, 136);
        fo_0.a(137, 138, 139, 140, 141);
        fo_0.a(142, 143, 144, 145, 146);
        fo_0.a(147, 148, 149, 150, 151);
        fo_0.a(152, 153, 154, 155, 156);
        to1_0.a(157);
        to1_0.a(158);
        to1_0.a(159);
        m = to1_0.a(160);
        fo_0.a(161, 162, 163, 126, 127);
        fo_0.a(85, 86, 130, 87, 88);
        fo_0.a(89, 90, 128, 222, 129);
        fo_0.a(226, 272, 273, 274, 275);
        fo_0.a(91, 164, 165, 166, 167);
        fo_0.a(168, 169, 170, 171, 172);
        fo_0.a(173, 174, 175, 176, 177);
        fo_0.a(178, 179, 180, 181, 182);
        fo_0.a(183, 184, 185, 186, 187);
        fo_0.a(204, 205, 206, 207, 208);
        fo_0.a(209, 210, 211, 212, 213);
        fo_0.a(214, 215, 216, 217, 218);
        fo_0.a(219, 220, 221, 223, 224);
        fo_0.a(276, 225, 229, 230, 231);
        fo_0.a(232, 233, 234, 235, 236);
        fo_0.a(237, 238, 239, 240, 241);
        fo_0.a(242, 243, 244, 245, 246);
        fo_0.a(247, 248, 249, 250, 251);
        fo_0.a(252, 253, 254, 255, 256);
        fo_0.a(257, 258, 264, 265, 266);
        fo_0.a(267, 284, 285, 286, 287);
        to1_0.a(288);
    }

    public /* synthetic */ Rn1(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Rn1;
        boolean bl3 = false;
        if (bl2) {
            object = (Rn1)object;
            long l2 = this.a;
            long l3 = ((Rn1)object).a;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Key code: ");
        long l2 = this.a;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }
}

