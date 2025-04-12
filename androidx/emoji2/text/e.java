/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.Selection
 *  android.text.TextPaint
 *  android.util.SparseArray
 *  android.view.KeyEvent
 */
package androidx.emoji2.text;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.EmojiCompat$e;
import androidx.emoji2.text.EmojiCompat$i;
import androidx.emoji2.text.b;
import androidx.emoji2.text.e$b;
import androidx.emoji2.text.e$d;
import androidx.emoji2.text.e$e;
import androidx.emoji2.text.g;
import androidx.emoji2.text.g$a;
import java.util.Set;

public final class e {
    public final EmojiCompat$i a;
    public final g b;
    public final EmojiCompat$e c;

    public e(g object, EmojiCompat$i object2, EmojiCompat$e emojiCompat$e, Set set) {
        this.a = object2;
        this.b = object;
        this.c = emojiCompat$e;
        boolean bl2 = set.isEmpty();
        if (!bl2) {
            boolean bl3;
            object = set.iterator();
            while (bl3 = object.hasNext()) {
                object2 = (int[])object.next();
                int n3 = ((Object)object2).length;
                set = null;
                String string2 = new String((int[])object2, 0, n3);
                e$d e$d = new e$d(string2);
                int n4 = string2.length();
                int n7 = 1;
                boolean bl4 = true;
                this.c(string2, 0, n4, n7, bl4, e$d);
            }
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean bl2) {
        Class<Ty0> clazz;
        Ty0[] ty0Array;
        int n3 = KeyEvent.metaStateHasNoModifiers((int)keyEvent.getMetaState());
        int n4 = 1;
        if ((n3 ^= n4) != 0) {
            return false;
        }
        n3 = Selection.getSelectionStart((CharSequence)editable);
        int n7 = Selection.getSelectionEnd((CharSequence)editable);
        int n8 = -1;
        if (n3 != n8 && n7 != n8 && n3 == n7 && (ty0Array = (Ty0[])editable.getSpans(n3, n7, clazz = Ty0.class)) != null && (n8 = ty0Array.length) > 0) {
            for (Ty0 ty0 : ty0Array) {
                int n10 = editable.getSpanStart((Object)ty0);
                int n14 = editable.getSpanEnd((Object)ty0);
                if (!(bl2 && n10 == n3 || !bl2 && n14 == n3) && (n3 <= n10 || n3 >= n14)) continue;
                editable.delete(n10, n14);
                return n4 != 0;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean b(CharSequence var1_1, int var2_2, int var3_3, rt3 var4_4) {
        block13: {
            block12: {
                block15: {
                    block14: {
                        var5_5 = 1;
                        var6_6 = var4_4.c & 3;
                        var7_7 = 2;
                        if (var6_6 != 0) break block13;
                        var8_8 = this.c;
                        var9_9 = var4_4.c();
                        var10_10 = 1.1E-44f;
                        var11_11 = var9_9.a(8);
                        if (var11_11 != 0) {
                            var12_12 = var9_9.b;
                            var13_13 = var9_9.a;
                            var11_11 += var13_13;
                            var13_13 = var12_12.getShort(var11_11);
                        } else {
                            var13_13 = 0;
                            var14_14 = 0.0f;
                            var9_9 = null;
                        }
                        var8_8 = (b)var8_8;
                        var8_8.getClass();
                        var11_11 = Build.VERSION.SDK_INT;
                        var15_15 = 23;
                        var16_16 = 3.2E-44f;
                        if (var11_11 < var15_15 && var13_13 > var11_11) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                var17_17 = 0;
                                var1_1 = null;
                                break block12;
                                break;
                            }
                        }
                        var9_9 = androidx.emoji2.text.b.b;
                        var18_18 /* !! */  = var9_9.get();
                        if (var18_18 /* !! */  == null) {
                            var18_18 /* !! */  = new T();
                            var9_9.set(var18_18 /* !! */ );
                        }
                        var9_9 = (StringBuilder)var9_9.get();
                        var9_9.setLength(0);
                        while (var2_2 < var3_3) {
                            var11_11 = var1_1.charAt(var2_2);
                            var9_9.append((char)var11_11);
                            var2_2 += var5_5;
                        }
                        var1_1 = var8_8.a;
                        var19_19 = var9_9.toString();
                        var3_3 = Build.VERSION.SDK_INT;
                        if (var3_3 < var15_15) break block14;
                        var17_17 = (int)gm2$a.a((TextPaint)var1_1, var19_19);
                        break block12;
                    }
                    var3_3 = var19_19.length();
                    if (var3_3 == var5_5 && (var6_6 = (int)Character.isWhitespace(var19_19.charAt(0))) != 0) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var17_17 = 1;
                            break block12;
                            break;
                        }
                    }
                    var8_8 = "\udb3f\udffd";
                    var14_14 = var1_1.measureText((String)var8_8);
                    var18_18 /* !! */  = "m";
                    var10_10 = var1_1.measureText((String)var18_18 /* !! */ );
                    var16_16 = var1_1.measureText(var19_19);
                    var20_20 = 0.0f;
                    var21_21 = null;
                    cfr_temp_0 = var16_16 - 0.0f;
                    var22_22 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var22_22 /* !! */  == false) ** GOTO lbl-1000
                    var22_22 /* !! */  = var19_19.length();
                    if ((var22_22 /* !! */  = (float)var19_19.codePointCount(0, (int)var22_22 /* !! */ )) <= var5_5) break block15;
                    var22_22 /* !! */  = 0x40000000;
                    var23_23 = 2.0f;
                    cfr_temp_1 = var16_16 - (var10_10 *= var23_23);
                    var11_11 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                    if (var11_11 > 0) ** GOTO lbl-1000
                    var11_11 = 0;
                    var10_10 = 0.0f;
                    var18_18 /* !! */  = null;
                    while (var11_11 < var3_3) {
                        var22_22 /* !! */  = Character.charCount(var19_19.codePointAt(var11_11)) + var11_11;
                        var10_10 = var1_1.measureText(var19_19, var11_11, (int)var22_22 /* !! */ );
                        var20_20 += var10_10;
                        var11_11 = (int)var22_22 /* !! */ ;
                    }
                    var11_11 = (int)(var16_16 == var20_20 ? 0 : (var16_16 > var20_20 ? 1 : -1));
                    if (var11_11 < 0) ** break;
                    ** while (true)
                }
                ** while ((var13_13 = (int)(var16_16 == var14_14 ? 0 : (var16_16 > var14_14 ? 1 : -1))) != 0)
lbl86:
                // 1 sources

                var9_9 = gm2_0.a;
                var18_18 /* !! */  = (lm2)var9_9.get();
                if (var18_18 /* !! */  == null) {
                    var12_12 = new Rect();
                    var21_21 = new Rect();
                    var18_18 /* !! */  = new T(var12_12, var21_21);
                    var9_9.set(var18_18 /* !! */ );
                } else {
                    ((Rect)var18_18 /* !! */ .a).setEmpty();
                    var9_9 = (Rect)var18_18 /* !! */ .b;
                    var9_9.setEmpty();
                }
                var9_9 = (Rect)var18_18 /* !! */ .a;
                var1_1.getTextBounds((String)var8_8, 0, var7_7, (Rect)var9_9);
                var8_8 = var18_18 /* !! */ .b;
                var18_18 /* !! */  = var8_8;
                var18_18 /* !! */  = (Rect)var8_8;
                var1_1.getTextBounds(var19_19, 0, var3_3, (Rect)var18_18 /* !! */ );
                var17_17 = var9_9.equals(var8_8) ^ var5_5;
            }
            var2_2 = var4_4.c & 4;
            var17_17 = var17_17 != 0 ? var2_2 | 2 : var2_2 | 1;
            var4_4.c = var17_17;
        }
        if ((var17_17 = var4_4.c & 3) != var7_7) {
            var5_5 = 0;
        }
        return (boolean)var5_5;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object c(CharSequence charSequence, int n3, int n4, int n7, boolean bl2, e$b e$b) {
        rt3 rt32;
        int n8;
        e e2 = this;
        CharSequence charSequence2 = charSequence;
        int n10 = n4;
        int n14 = n7;
        e$b e$b2 = e$b;
        g$a g$a = this.b.c;
        int n15 = 0;
        rt3 rt33 = null;
        e$e e$e = new e$e(g$a, false, null);
        int n16 = Character.codePointAt(charSequence, n3);
        int n17 = 1;
        int n18 = n3;
        int n19 = n16;
        int n20 = 0;
        boolean bl3 = true;
        n16 = n3;
        while (true) {
            block21: {
                block22: {
                    block19: {
                        block20: {
                            int n21;
                            block14: {
                                block9: {
                                    block15: {
                                        block18: {
                                            g$a g$a2;
                                            block16: {
                                                block17: {
                                                    g$a g$a3;
                                                    int n22;
                                                    block13: {
                                                        block10: {
                                                            block12: {
                                                                block11: {
                                                                    void var23_27;
                                                                    block7: {
                                                                        block8: {
                                                                            n8 = 2;
                                                                            if (n16 >= n10 || n20 >= n14 || !bl3) break;
                                                                            SparseArray sparseArray = e$e.c.a;
                                                                            if (sparseArray == null) {
                                                                                n21 = 0;
                                                                                Object var23_25 = null;
                                                                            } else {
                                                                                g$a g$a4 = (g$a)sparseArray.get(n19);
                                                                            }
                                                                            n22 = e$e.a;
                                                                            n15 = 3;
                                                                            if (n22 == n8) break block7;
                                                                            if (var23_27 != null) break block8;
                                                                            e$e.a();
                                                                            break block9;
                                                                        }
                                                                        e$e.a = n8;
                                                                        e$e.c = var23_27;
                                                                        e$e.f = n17;
                                                                        break block10;
                                                                    }
                                                                    if (var23_27 == null) break block11;
                                                                    e$e.c = var23_27;
                                                                    e$e.f = n21 = e$e.f + n17;
                                                                    break block10;
                                                                }
                                                                n21 = 65038;
                                                                if (n19 != n21) break block12;
                                                                e$e.a();
                                                                break block9;
                                                            }
                                                            n21 = 65039;
                                                            if (n19 != n21) break block13;
                                                        }
                                                        n21 = 2;
                                                        break block14;
                                                    }
                                                    g$a2 = e$e.c;
                                                    rt3 rt34 = g$a2.b;
                                                    if (rt34 == null) break block15;
                                                    n22 = e$e.f;
                                                    if (n22 != n17) break block16;
                                                    n21 = (int)(e$e.b() ? 1 : 0);
                                                    if (n21 == 0) break block17;
                                                    e$e.d = g$a3 = e$e.c;
                                                    e$e.a();
                                                    break block18;
                                                }
                                                e$e.a();
                                                break block9;
                                            }
                                            e$e.d = g$a2;
                                            e$e.a();
                                        }
                                        n21 = 3;
                                        break block14;
                                    }
                                    e$e.a();
                                }
                                n21 = 1;
                            }
                            e$e.e = n19;
                            if (n21 == n17) break block19;
                            if (n21 == n8) break block20;
                            if (n21 != n15) break block21;
                            if (bl2 || (n15 = (int)(e2.b(charSequence2, n18, n16, rt33 = e$e.d.b) ? 1 : 0)) == 0) {
                                rt33 = e$e.d.b;
                                bl3 = e$b2.a(charSequence2, n18, n16, rt33);
                                ++n20;
                            }
                            break block22;
                        }
                        n15 = Character.charCount(n19) + n16;
                        if (n15 < n10) {
                            n19 = n16 = Character.codePointAt(charSequence2, n15);
                        }
                        n16 = n15;
                        break block21;
                    }
                    n16 = Character.charCount(Character.codePointAt(charSequence2, n18)) + n18;
                    if (n16 < n10) {
                        n19 = n18 = Character.codePointAt(charSequence2, n16);
                    }
                }
                n18 = n16;
            }
            n15 = 0;
            rt33 = null;
        }
        n10 = e$e.a;
        if (n10 == n8 && (rt32 = e$e.c.b) != null && ((n10 = e$e.f) > n17 || (n10 = (int)(e$e.b() ? 1 : 0)) != 0) && n20 < n14 && bl3 && (bl2 || (n10 = (int)(e2.b(charSequence2, n18, n16, rt32 = e$e.c.b) ? 1 : 0)) == 0)) {
            rt32 = e$e.c.b;
            e$b2.a(charSequence2, n18, n16, rt32);
        }
        return e$b.getResult();
    }
}

