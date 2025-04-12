/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;

public final class y0 {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[13];
        int[] nArray3 = nArray;
        nArray2[0] = 96000;
        nArray3[1] = 88200;
        nArray2[2] = 64000;
        nArray3[3] = 48000;
        nArray2[4] = 44100;
        nArray3[5] = 32000;
        nArray2[6] = 24000;
        nArray3[7] = 22050;
        nArray2[8] = 16000;
        nArray3[9] = 12000;
        nArray2[10] = 11025;
        nArray3[11] = 8000;
        nArray3[12] = 7350;
        a = nArray;
        int[] nArray4 = nArray = new int[16];
        int[] nArray5 = nArray;
        nArray4[0] = 0;
        nArray5[1] = 1;
        nArray4[2] = 2;
        nArray5[3] = 3;
        nArray4[4] = 4;
        nArray5[5] = 5;
        nArray4[6] = 6;
        nArray5[7] = 8;
        nArray4[8] = -1;
        nArray5[9] = -1;
        nArray4[10] = -1;
        nArray5[11] = 7;
        nArray4[12] = 8;
        nArray5[13] = -1;
        nArray4[14] = 8;
        nArray5[15] = -1;
        b = nArray;
    }

    public static int a(Vm2 object) {
        block5: {
            Object object2;
            block4: {
                int n3;
                block2: {
                    block3: {
                        int n4;
                        n3 = ((Vm2)object).g(4);
                        if (n3 != (n4 = 15)) break block2;
                        n3 = ((Vm2)object).b();
                        if (n3 < (n4 = 24)) break block3;
                        object2 = ((Vm2)object).g(n4);
                        break block4;
                    }
                    throw ParserException.a("AAC header insufficient data", null);
                }
                object2 = 13;
                if (n3 >= object2) break block5;
                object = a;
                object2 = object[n3];
            }
            return object2;
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static y0$a b(Vm2 object, boolean n3) {
        Object object2;
        String string2;
        int n4;
        int n7;
        block19: {
            block20: {
                int n8;
                int n10 = 5;
                int n14 = ((Vm2)object).g(n10);
                int n15 = 31;
                int n16 = 6;
                if (n14 == n15) {
                    n14 = ((Vm2)object).g(n16) + 32;
                }
                n7 = y0.a((Vm2)object);
                int n17 = 4;
                n4 = ((Vm2)object).g(n17);
                string2 = hj0_0.a(n14, "mp4a.40.");
                int n18 = 22;
                if (n14 == n10 || n14 == (n8 = 29)) {
                    n7 = y0.a((Vm2)object);
                    if ((n10 = ((Vm2)object).g(n10)) == n15) {
                        n10 = ((Vm2)object).g(n16) + 32;
                    }
                    n14 = n10;
                    if (n10 == n18) {
                        n4 = ((Vm2)object).g(n17);
                    }
                }
                if (n3 == 0) break block19;
                n3 = 17;
                n10 = 1;
                n15 = 3;
                n8 = 2;
                if (n14 != n10 && n14 != n8 && n14 != n15 && n14 != n17 && n14 != n16 && n14 != (n17 = 7) && n14 != n3) {
                    switch (n14) {
                        default: {
                            object = new StringBuilder("Unsupported audio object type: ");
                            ((StringBuilder)object).append(n14);
                            throw ParserException.b(((StringBuilder)object).toString());
                        }
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                        case 23: 
                    }
                }
                if ((n17 = (int)(((Vm2)object).f() ? 1 : 0)) != 0) {
                    String string3 = "Unexpected frameLengthFlag = 1";
                    Cx.f(string3);
                }
                if ((n17 = (int)(((Vm2)object).f() ? 1 : 0)) != 0) {
                    n17 = 14;
                    ((Vm2)object).o(n17);
                }
                n17 = (int)(((Vm2)object).f() ? 1 : 0);
                if (n4 == 0) break block20;
                int n19 = 20;
                if (n14 == n16 || n14 == n19) {
                    ((Vm2)object).o(n15);
                }
                if (n17 != 0) {
                    if (n14 == n18) {
                        n16 = 16;
                        ((Vm2)object).o(n16);
                    }
                    if (n14 == n3 || n14 == (n3 = 19) || n14 == n19 || n14 == (n3 = 23)) {
                        ((Vm2)object).o(n15);
                    }
                    ((Vm2)object).o(n10);
                }
                switch (n14) {
                    default: {
                        break block19;
                    }
                    case 17: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: {
                        object2 = ((Vm2)object).g(n8);
                        if (object2 == n8 || object2 == n15) {
                            StringBuilder stringBuilder = new StringBuilder("Unsupported epConfig: ");
                            stringBuilder.append((int)object2);
                            throw ParserException.b(stringBuilder.toString());
                        }
                        break block19;
                    }
                }
            }
            object = new UnsupportedOperationException();
            throw object;
        }
        if ((object2 = (object = (Object)b)[n4]) != (n3 = -1)) {
            y0$a y0$a = new y0$a(n7, (int)object2, string2);
            return y0$a;
        }
        throw ParserException.a(null, null);
    }
}

