/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import java.io.EOFException;

/*
 * Renamed from Vc1
 */
public final class vc1_0 {
    public final Xm2 a;

    public vc1_0() {
        Xm2 xm2;
        this.a = xm2 = new Xm2(10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Metadata a(il0_0 var1_1, Uc1$a var2_2) {
        block4: {
            var3_3 = this.a;
            var4_4 /* !! */  = null;
            var5_5 = 0;
            while (true) lbl-1000:
            // 2 sources

            {
                var6_6 = var3_3.a;
                var7_7 = 10;
                break;
            }
            catch (EOFException v0) {}
            {
                block6: {
                    block5: {
                        var1_1.b((byte[])var6_6, 0, var7_7, false);
                        var3_3.I(0);
                        var8_8 = var3_3.z();
                        var9_9 = 0x494433;
                        if (var8_8 != var9_9) break block4;
                        var3_3.J(3);
                        var8_8 = var3_3.v();
                        var9_9 = var8_8 + 10;
                        if (var4_4 /* !! */  != null) break block5;
                        var4_4 /* !! */  = new byte[var9_9];
                        var10_10 = var3_3.a;
                        System.arraycopy(var10_10, 0, var4_4 /* !! */ , 0, var7_7);
                        var1_1.b(var4_4 /* !! */ , var7_7, var8_8, false);
                        var6_6 = new uc1_1;
                        var6_6(var2_2);
                        var4_4 /* !! */  = (byte[])var6_6.Z(var9_9, var4_4 /* !! */ );
                        break block6;
                    }
                    var1_1.l(var8_8, false);
                }
                var5_5 += var9_9;
                ** while (true)
            }
        }
        var1_1.f = 0;
        var1_1.l(var5_5, false);
        return var4_4 /* !! */ ;
    }
}

