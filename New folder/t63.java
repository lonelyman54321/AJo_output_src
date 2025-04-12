/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class t63 {
    public static final void a(String string2, String string3, LP1 lP1, im2 im22, Function1 function1, Function1 function12, i70_0 i70_02, b30_0 b30_02, int n3, int n4) {
        Object object;
        Object object2;
        Object object3;
        b30_0 b30_03 = b30_02;
        int n7 = n4;
        b30_02.u(1693837359);
        int n8 = n4 & 8;
        if (n8 != 0) {
            n8 = 0;
            object3 = null;
        } else {
            object3 = im22;
        }
        int n10 = n7 & 0x40;
        if (n10 != 0) {
            n10 = 0;
            object2 = null;
        } else {
            object2 = function1;
        }
        if ((n7 &= 0x80) != 0) {
            n7 = 0;
            object = null;
        } else {
            object = function12;
        }
        Gx gx = Nc$a.e;
        Object object4 = QA0.a;
        Object object5 = ge1.a(cw1.a, b30_03);
        int n14 = n3 & 0x70;
        int n15 = n3 << 3;
        n14 |= 0x248E08;
        int n16 = 0x1C00000 & n15;
        n14 |= n16;
        n16 = 0xE000000;
        n14 |= (n15 &= n16);
        n15 = -1481548872;
        b30_03.u(n15);
        vq vq2 = new vq(string2, (PA0)object4, (ce1_0)object5);
        object4 = Lz3.b;
        object4 = object3 == null ? (object3 = pq_0.p) : new Hz3((im2)object3, null, null);
        object5 = object2 == null && object == null ? null : (object3 = new Fz3((Function1)object2, (Function1)object, null));
        int n17 = n14 & 0x70 | 0x180180;
        object = vq2;
        object3 = string3;
        object2 = object4;
        object4 = object5;
        object5 = i70_02;
        n16 = 1;
        boolean bl2 = true;
        mq.a(vq2, string3, lP1, (Function1)object2, (Function1)object4, gx, i70_02, 1.0f, null, n16, bl2, b30_02, n17, 0);
        b30_02.I();
        b30_02.I();
    }

    public static final void b(String string2, String string3, LP1 lP1, i70$a$a i70$a$a, b30_0 b30_02, int n3, int n4) {
        i70_0 i70_02;
        Object object;
        b30_0 b30_03 = b30_02;
        b30_02.u(1451072229);
        oq_0 oq_02 = pq_0.p;
        Gx gx = Nc$a.e;
        int n7 = n4 & 0x40;
        if (n7 != 0) {
            object = i70$a.b;
            i70_02 = object;
        } else {
            i70_02 = i70$a$a;
        }
        object = QA0.a;
        Object object2 = ge1.a(cw1.a, b30_03);
        int n8 = n3 & 0x70 | 0x208;
        int n10 = n3 << 3;
        int n14 = n10 & 0x1C00;
        n8 |= n14;
        n14 = 57344;
        int n15 = n10 & n14;
        n8 |= n15;
        n15 = 458752;
        int n16 = n10 & n15;
        n8 |= n16;
        n16 = 0x380000;
        int n17 = n10 & n16;
        n8 |= n17;
        n17 = 0x1C00000;
        int n18 = n10 & n17;
        n8 |= n18;
        n18 = 0xE000000;
        int n19 = n10 & n18;
        n8 |= n19;
        n19 = 0x70000000;
        n10 = n3 >> 27 & 0xE;
        b30_03.u(2032051394);
        vq vq2 = new vq(string2, (PA0)object, (ce1_0)object2);
        n7 = (n8 |= (n10 &= n19)) & 0x70;
        int n20 = n8 >> 3;
        n8 = n20 & 0x380;
        n7 |= n8;
        n8 = n20 & 0x1C00;
        n7 |= n8;
        n8 = n20 & n14;
        n7 |= n8;
        n8 = n20 & n15;
        n7 |= n8;
        n8 = n20 & n16;
        n7 |= n8;
        n8 = n20 & n17;
        n7 |= n8;
        n20 = n10 << 27 & n19;
        n19 = (n7 |= (n20 &= n18)) | n20;
        object = vq2;
        object2 = string3;
        mq.a(vq2, string3, lP1, oq_02, null, gx, i70_02, 1.0f, null, 1, true, b30_02, n19, 0);
        b30_02.I();
        b30_02.I();
    }
}

