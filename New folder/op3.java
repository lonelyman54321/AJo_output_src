/*
 * Decompiled with CFR 0.152.
 */
public final class op3 {
    public final boolean a;
    public final String b;
    public final wp3$a c;
    public final int d;
    public final byte[] e;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public op3(boolean var1_1, String var2_2, int var3_3, byte[] var4_4, int var5_5, int var6_6, byte[] var7_7) {
        block13: {
            var8_8 = 2;
            super();
            var9_9 = 0;
            var10_10 = var3_3 == 0;
            var11_11 = var7_7 /* !! */  == null;
            ct3.a(var10_10 ^= var11_11);
            this.a = var1_1;
            this.b = var2_2;
            this.d = var3_3;
            this.e = var7_7 /* !! */ ;
            if (var2_2 == null) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var8_8 = 1;
                    break block13;
                    break;
                }
            }
            var3_3 = -1;
            var13_13 = var2_2.hashCode();
            switch (var13_13) lbl-1000:
            // 5 sources

            {
                default: {
                    var9_9 = -1;
                    break;
                }
                case 3049895: {
                    var7_7 /* !! */  = (byte[])"cens";
                    var13_13 = (int)var2_2.equals(var7_7 /* !! */ );
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var9_9 = 3;
                    break;
                }
                case 3049879: {
                    var7_7 /* !! */  = (byte[])"cenc";
                    var13_13 = (int)var2_2.equals(var7_7 /* !! */ );
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var9_9 = 2;
                    break;
                }
                case 3046671: {
                    var7_7 /* !! */  = (byte[])"cbcs";
                    var13_13 = (int)var2_2.equals(var7_7 /* !! */ );
                    if (var13_13 == 0) ** GOTO lbl-1000
                    var9_9 = 1;
                    break;
                }
                case 3046605: {
                    var7_7 /* !! */  = (byte[])"cbc1";
                    var13_13 = (int)var2_2.equals(var7_7 /* !! */ );
                    if (var13_13 == 0) ** GOTO lbl-1000
                }
            }
            switch (var9_9) {
                case 2: 
                case 3: {
                    ** GOTO lbl-1000
                }
                default: {
                    var7_7 /* !! */  = (byte[])"Unsupported protection scheme type '";
                    var14_14 = new StringBuilder((String)var7_7 /* !! */ );
                    var14_14.append(var2_2);
                    var14_14.append("'. Assuming AES-CTR crypto mode.");
                    var2_2 = var14_14.toString();
                    Cx.f(var2_2);
                    ** continue;
                }
                case 0: 
                case 1: 
            }
        }
        this.c = var12_12 = new wp3$a(var8_8, var4_4, var5_5, var6_6);
    }
}

