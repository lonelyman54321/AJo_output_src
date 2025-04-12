/*
 * Decompiled with CFR 0.152.
 */
public final class en3 {
    public static final dn3_0 a;

    static {
        dn3_0 dn3_02;
        long[] lArray = new long[]{};
        Object[] objectArray = new Object[]{};
        a = dn3_02 = new dn3_0(0, lArray, objectArray);
    }

    public static final void a(wr1_0 wr1_02, Object object, int n3, Object object2, b30_0 object3, int n4) {
        Object object4;
        Object object5;
        object3 = object3.g(1439843069);
        int n7 = n4 & 6;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object3).J(wr1_02) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n4;
        }
        int n8 = n4 & 0x30;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object3).J(object) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n4 & 0x180) == 0) {
            n8 = (int)(((j30_0)object3).c(n3) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n4 & 0xC00) == 0) {
            n8 = (int)(((j30_0)object3).J(object2) ? 1 : 0);
            n8 = n8 != 0 ? 2048 : 1024;
            n7 |= n8;
        }
        if ((n7 &= 0x493) == (n8 = 1170) && (n7 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            object5 = object;
            object5 = (bs2_1)object;
            object4 = new ur1_1(n3, wr1_02, object2);
            object4 = v10.c(980966366, (fx0_2)object4, (b30_0)object3);
            int n10 = 48;
            object5.c(object2, (u10)object4, (b30_0)object3, n10);
        }
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            vr1_2 vr1_22;
            object5 = vr1_22;
            object4 = wr1_02;
            vr1_22 = new vr1_2(wr1_02, object, n3, object2, n4);
            ((CF2)object3).d = vr1_22;
        }
    }
}

