/*
 * Decompiled with CFR 0.152.
 */
public final class Rj3$a
implements Rj3$b {
    public static final Rj3$a a;

    static {
        Rj3$a rj3$a;
        a = rj3$a = new Object();
    }

    /*
     * Unable to fully structure code
     */
    public final int a(int var1_1, CharSequence var2_2) {
        var3_3 = 1;
        var4_4 = 2;
        var6_6 = 2;
        block4: for (var5_5 = 0; var5_5 < var1_1 && var6_6 == var4_4; var5_5 += var3_3) {
            var6_6 = Character.getDirectionality(var2_2.charAt(var5_5));
            if (var6_6 == 0) ** GOTO lbl-1000
            if (var6_6 == var3_3 || var6_6 == var4_4) ** GOTO lbl-1000
            switch (var6_6) {
                default: {
                    var6_6 = 2;
                    continue block4;
                }
                case 16: 
                case 17: lbl-1000:
                // 2 sources

                {
                    var6_6 = 0;
                    continue block4;
                }
                case 14: 
                case 15: lbl-1000:
                // 2 sources

                {
                    var6_6 = 1;
                }
            }
        }
        return var6_6;
    }
}

