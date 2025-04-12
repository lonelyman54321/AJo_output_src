/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

public final class n72 {
    public static final byte[] d;
    public static final byte[] e;
    public ByteBuffer a;
    public int b;
    public int c;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[47];
        byte[] byArray3 = byArray;
        byArray2[0] = 79;
        byArray3[1] = 103;
        byArray2[2] = 103;
        byArray3[3] = 83;
        byArray2[4] = 0;
        byArray3[5] = 2;
        byArray2[6] = 0;
        byArray3[7] = 0;
        byArray2[8] = 0;
        byArray3[9] = 0;
        byArray2[10] = 0;
        byArray3[11] = 0;
        byArray2[12] = 0;
        byArray3[13] = 0;
        byArray2[14] = 0;
        byArray3[15] = 0;
        byArray2[16] = 0;
        byArray3[17] = 0;
        byArray2[18] = 0;
        byArray3[19] = 0;
        byArray2[20] = 0;
        byArray3[21] = 0;
        byArray2[22] = 28;
        byArray3[23] = -43;
        byArray2[24] = -59;
        byArray3[25] = -9;
        byArray2[26] = 1;
        byArray3[27] = 19;
        byArray2[28] = 79;
        byArray3[29] = 112;
        byArray2[30] = 117;
        byArray3[31] = 115;
        byArray2[32] = 72;
        byArray3[33] = 101;
        byArray2[34] = 97;
        byArray3[35] = 100;
        byArray2[36] = 1;
        byArray3[37] = 2;
        byArray2[38] = 56;
        byArray3[39] = 1;
        byArray2[40] = -128;
        byArray3[41] = -69;
        byArray2[42] = 0;
        byArray3[43] = 0;
        byArray2[44] = 0;
        byArray3[45] = 0;
        byArray3[46] = 0;
        d = byArray;
        byte[] byArray4 = byArray = new byte[44];
        byte[] byArray5 = byArray;
        byArray4[0] = 79;
        byArray5[1] = 103;
        byArray4[2] = 103;
        byArray5[3] = 83;
        byArray4[4] = 0;
        byArray5[5] = 0;
        byArray4[6] = 0;
        byArray5[7] = 0;
        byArray4[8] = 0;
        byArray5[9] = 0;
        byArray4[10] = 0;
        byArray5[11] = 0;
        byArray4[12] = 0;
        byArray5[13] = 0;
        byArray4[14] = 0;
        byArray5[15] = 0;
        byArray4[16] = 0;
        byArray5[17] = 0;
        byArray4[18] = 1;
        byArray5[19] = 0;
        byArray4[20] = 0;
        byArray5[21] = 0;
        byArray4[22] = 11;
        byArray5[23] = -103;
        byArray4[24] = 87;
        byArray5[25] = 83;
        byArray4[26] = 1;
        byArray5[27] = 16;
        byArray4[28] = 79;
        byArray5[29] = 112;
        byArray4[30] = 117;
        byArray5[31] = 115;
        byArray4[32] = 84;
        byArray5[33] = 97;
        byArray4[34] = 103;
        byArray5[35] = 115;
        byArray4[36] = 0;
        byArray5[37] = 0;
        byArray4[38] = 0;
        byArray5[39] = 0;
        byArray4[40] = 0;
        byArray5[41] = 0;
        byArray4[42] = 0;
        byArray5[43] = 0;
        e = byArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(ByteBuffer byteBuffer, long l2, int n3, int n4, boolean bl2) {
        void var5_7;
        byteBuffer.put((byte)79);
        byte by2 = 103;
        byteBuffer.put(by2);
        byteBuffer.put(by2);
        byteBuffer.put((byte)83);
        by2 = 0;
        byteBuffer.put((byte)0);
        if (bl2) {
            int n7 = 2;
        } else {
            boolean bl3 = false;
        }
        byteBuffer.put((byte)var5_7);
        byteBuffer.putLong(l2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(n3);
        byteBuffer.putInt(0);
        byte by4 = UnsignedBytes.checkedCast(n4);
        byteBuffer.put(by4);
    }
}

