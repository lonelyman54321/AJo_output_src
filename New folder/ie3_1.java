/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spanned
 */
import android.text.Spanned;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.e$c;
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ie3
 */
public final class ie3_1 {
    public static final void a(he1_2 he1_22, LP1 lP1, im2 im22, b30_0 object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(he1_22, "<this>");
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Object object2 = "painter";
        Intrinsics.checkNotNullParameter(im22, (String)object2);
        object = object.g(-1825163718);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(he1_22) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x30;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n3 & 0x180) == 0) {
            n8 = (int)(((j30_0)object).x(im22) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x93) == (n4 = 146) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Nc nc = he1_22.a;
            n8 = n7 >> 6 & 0xE;
            n7 = n7 << 3 & 0x380;
            int n10 = n8 | n7;
            float f5 = he1_22.e;
            TX tX = he1_22.d;
            String string2 = he1_22.b;
            i70_0 i70_02 = he1_22.c;
            Pd1.a(im22, string2, lP1, nc, i70_02, f5, tX, (b30_0)object, n10, 0);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ip1_2(he1_22, lP1, im22, n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final int b(int var0, String var1_1) {
        block5: {
            block7: {
                block6: {
                    var2_2 = EmojiCompat.c();
                    var3_3 = null;
                    if (var2_2 == 0 || (var5_5 = (var4_4 = EmojiCompat.a()).b()) != (var6_6 = 1)) {
                        var2_2 = 0;
                        var4_4 = null;
                    }
                    if (var4_4 == null) break block5;
                    var4_4 = var4_4.e;
                    var7_7 = var4_4.b;
                    var7_7.getClass();
                    var2_2 = -1;
                    if (var0 < 0 || var0 >= (var6_6 = var1_1.length())) break block6;
                    var6_6 = var1_1 instanceof Spanned;
                    var8_8 = 0;
                    if (var6_6 == 0) ** GOTO lbl-1000
                    var9_9 = var1_1;
                    var9_9 = (Spanned)var1_1;
                    var10_10 = var0 + 1;
                    var11_11 = Ty0.class;
                    var12_12 = (Ty0[])var9_9.getSpans(var0, var10_10, var11_11);
                    var13_13 = var12_12.length;
                    if (var13_13 > 0) {
                        var7_7 = var12_12[0];
                        var5_5 = var9_9.getSpanEnd(var7_7);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_6 = var0 + -16;
                        var8_8 = Math.max(0, var6_6);
                        var6_6 = var1_1.length();
                        var10_10 = var0 + 16;
                        var10_10 = Math.min(var6_6, var10_10);
                        var14_14 = new e$c(var0);
                        var13_13 = -1 >>> 1;
                        var15_15 = true;
                        var9_9 = var1_1;
                        var7_7 = (e$c)var7_7.c(var1_1, var8_8, var10_10, var13_13, var15_15, var14_14);
                        var5_5 = var7_7.c;
                    }
                    break block7;
                }
                var5_5 = -1;
            }
            var9_9 = var5_5;
            if (var5_5 != var2_2) {
                var3_3 = var9_9;
            }
        }
        if (var3_3 != null) {
            return var3_3;
        }
        var4_4 = BreakIterator.getCharacterInstance();
        var4_4.setText(var1_1);
        return var4_4.following(var0);
    }

    /*
     * Unable to fully structure code
     */
    public static final int c(int var0, String var1_1) {
        block5: {
            block7: {
                block6: {
                    var2_2 = EmojiCompat.c();
                    var3_3 = null;
                    if (var2_2 == 0 || (var5_5 = (var4_4 = EmojiCompat.a()).b()) != (var6_6 = 1)) {
                        var2_2 = 0;
                        var4_4 = null;
                    }
                    if (var4_4 == null) break block5;
                    var5_5 = var0 + -1;
                    var6_6 = 0;
                    var7_7 = null;
                    var5_5 = Math.max(0, var5_5);
                    var4_4 = var4_4.e;
                    var8_8 = var4_4.b;
                    var8_8.getClass();
                    var2_2 = -1;
                    if (var5_5 < 0 || var5_5 >= (var9_9 = var1_1.length())) break block6;
                    var9_9 = var1_1 instanceof Spanned;
                    if (var9_9 == 0) ** GOTO lbl-1000
                    var10_10 = var1_1;
                    var10_10 = (Spanned)var1_1;
                    var11_11 = var5_5 + 1;
                    var12_12 = Ty0.class;
                    var13_13 = (Ty0[])var10_10.getSpans(var5_5, var11_11, var12_12);
                    var14_14 = var13_13.length;
                    if (var14_14 > 0) {
                        var15_15 = var13_13[0];
                        var5_5 = var10_10.getSpanStart((Object)var15_15);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_9 = var5_5 + -16;
                        var11_11 = Math.max(0, var9_9);
                        var6_6 = var1_1.length();
                        var9_9 = var5_5 + 16;
                        var14_14 = Math.min(var6_6, var9_9);
                        var16_17 = new e$c(var5_5);
                        var17_18 = -1 >>> 1;
                        var18_19 = true;
                        var10_10 = var1_1;
                        var15_16 = (e$c)var8_8.c(var1_1, var11_11, var14_14, var17_18, var18_19, var16_17);
                        var5_5 = var15_16.b;
                    }
                    break block7;
                }
                var5_5 = -1;
            }
            var7_7 = var5_5;
            if (var5_5 != var2_2) {
                var3_3 = var7_7;
            }
        }
        if (var3_3 != null) {
            return var3_3;
        }
        var4_4 = BreakIterator.getCharacterInstance();
        var4_4.setText(var1_1);
        return var4_4.preceding(var0);
    }

    public static final boolean d(iu3_0 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = ((iu3_0)object).a;
        String string3 = "https";
        boolean bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3 && !(bl2 = Intrinsics.areEqual(object = ((iu3_0)object).a, string2 = "wss"))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

