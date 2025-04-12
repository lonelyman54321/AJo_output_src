/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Selection
 *  android.view.inputmethod.InputConnection
 */
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.InputConnection;

public final class Qy0$a {
    /*
     * Unable to fully structure code
     */
    public static boolean a(InputConnection var0, Editable var1_1, int var2_2, int var3_3, boolean var4_4) {
        block15: {
            block21: {
                block16: {
                    block14: {
                        block13: {
                            var5_5 = false;
                            if (var1_1 == null || var0 == null || var2_2 < 0 || var3_3 < 0) break block15;
                            var6_6 = Selection.getSelectionStart((CharSequence)var1_1);
                            var7_7 = Selection.getSelectionEnd((CharSequence)var1_1);
                            var8_8 = -1;
                            if (var6_6 == var8_8 || var7_7 == var8_8 || var6_6 != var7_7) break block15;
                            if (var4_4 == 0) break block16;
                            var2_2 = Math.max(var2_2, 0);
                            var4_4 = var1_1.length();
                            if (var6_6 < 0 || var4_4 < var6_6 || var2_2 < 0) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    var6_6 = -1;
                                    break block13;
                                    break;
                                }
                            }
                            block1: while (true) {
                                var4_4 = 0;
                                while (var2_2 != 0) {
                                    block18: {
                                        block17: {
                                            if ((var6_6 += -1) >= 0) break block17;
                                            if (var4_4 != 0) ** GOTO lbl-1000
                                            var6_6 = 0;
                                            break block1;
                                        }
                                        var9_9 = var1_1.charAt(var6_6);
                                        if (var4_4 == 0) break block18;
                                        var4_4 = (int)Character.isHighSurrogate((char)var9_9);
                                        if (var4_4 == 0) ** GOTO lbl-1000
                                        var2_2 += -1;
                                        continue block1;
                                    }
                                    var10_10 = Character.isSurrogate((char)var9_9);
                                    if (!var10_10) {
                                        var2_2 += -1;
                                        continue;
                                    }
                                    var4_4 = (int)Character.isHighSurrogate((char)var9_9);
                                    if (var4_4 == 0) ** break;
                                    ** continue;
                                    var4_4 = 1;
                                }
                                break;
                            }
                        }
                        var2_2 = Math.max(var3_3, 0);
                        var3_3 = var1_1.length();
                        if (var7_7 < 0 || var3_3 < var7_7 || var2_2 < 0) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                var3_3 = -1;
                                break block14;
                                break;
                            }
                        }
                        block4: while (true) {
                            var4_4 = 0;
                            while (true) {
                                block20: {
                                    block19: {
                                        if (var2_2 == 0) {
                                            var3_3 = var7_7;
                                            break block4;
                                        }
                                        if (var7_7 < var3_3) break block19;
                                        if (var4_4 == 0) break block4;
                                        ** GOTO lbl-1000
                                    }
                                    var9_9 = var1_1.charAt(var7_7);
                                    if (var4_4 == 0) break block20;
                                    var4_4 = (int)Character.isLowSurrogate((char)var9_9);
                                    if (var4_4 == 0) ** GOTO lbl-1000
                                    var2_2 += -1;
                                    ++var7_7;
                                    continue block4;
                                }
                                var10_10 = Character.isSurrogate((char)var9_9);
                                if (!var10_10) {
                                    var2_2 += -1;
                                    ++var7_7;
                                    continue;
                                }
                                var4_4 = (int)Character.isLowSurrogate((char)var9_9);
                                if (var4_4 == 0) ** break;
                                ** continue;
                                ++var7_7;
                                var4_4 = 1;
                            }
                            break;
                        }
                    }
                    if (var6_6 != var8_8 && var3_3 != var8_8) break block21;
                    break block15;
                }
                var6_6 = Math.max(var6_6 - var2_2, 0);
                var7_7 += var3_3;
                var2_2 = var1_1.length();
                var3_3 = Math.min(var7_7, var2_2);
            }
            if ((var11_11 = (Ty0[])var1_1.getSpans(var6_6, var3_3, Ty0.class)) != null && (var4_4 = var11_11.length) > 0) {
                for (Ty0 var12_12 : var11_11) {
                    var9_9 = var1_1.getSpanStart((Object)var12_12);
                    var8_8 = var1_1.getSpanEnd((Object)var12_12);
                    var6_6 = Math.min(var9_9, var6_6);
                    var3_3 = Math.max(var8_8, var3_3);
                }
                var2_2 = Math.max(var6_6, 0);
                var4_4 = var1_1.length();
                var3_3 = Math.min(var3_3, var4_4);
                var0.beginBatchEdit();
                var1_1.delete(var2_2, var3_3);
                var0.endBatchEdit();
                var5_5 = true;
            }
        }
        return var5_5;
    }
}

