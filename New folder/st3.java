/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Typeface
 *  android.text.Spanned
 *  android.text.TextPaint
 *  android.text.style.CharacterStyle
 */
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.EmojiCompat;

public final class st3
extends Ty0 {
    public TextPaint e;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void draw(Canvas var1_1, CharSequence var2_2, int var3_3, int var4_4, float var5_5, int var6_6, int var7_7, int var8_8, Paint var9_9) {
        block9: {
            block8: {
                var10_10 = this;
                var11_11 /* !! */  = var2_2;
                var12_12 = var9_9;
                var13_13 = var2_2 instanceof Spanned;
                var14_14 /* !! */  = null;
                if (var13_13 == 0) break block8;
                var11_11 /* !! */  = (Spanned)var2_2;
                var15_15 = CharacterStyle.class;
                var16_16 = var3_3;
                var17_17 = var4_4;
                var13_13 = (var11_11 /* !! */  = (CharacterStyle[])var11_11 /* !! */ .getSpans(var3_3, var4_4, var15_15)).length;
                if (var13_13 == 0) ** GOTO lbl-1000
                var13_13 = var11_11 /* !! */ .length;
                var16_16 = 1;
                var17_17 = 0;
                var18_18 = null;
                if (var13_13 != var16_16 || (var15_15 = var11_11 /* !! */ [0]) != this) {
                    var15_15 = var10_10.e;
                    if (var15_15 == null) {
                        var15_15 = new TextPaint();
                        var10_10.e = var15_15;
                    }
                    var14_14 /* !! */  = var15_15;
                    var15_15.set(var12_12);
                    while (var17_17 < (var13_13 = var11_11 /* !! */ .length)) {
                        var15_15 = var11_11 /* !! */ [var17_17];
                        var15_15.updateDrawState((TextPaint)var14_14 /* !! */ );
                        ++var17_17;
                    }
                } else if ((var19_19 = var12_12 instanceof TextPaint) != 0) {
                    var14_14 /* !! */  = var12_12;
                    var14_14 /* !! */  = (TextPaint)var12_12;
                }
                break block9;
            }
            var19_19 = var9_9 instanceof TextPaint;
            if (var19_19 != 0) {
                var14_14 /* !! */  = var9_9;
                var14_14 /* !! */  = (TextPaint)var9_9;
            }
        }
        if (var14_14 /* !! */  != null && (var19_19 = var14_14 /* !! */ .bgColor) != 0) {
            var20_20 = var10_10.c;
            var21_21 = var5_5 + var20_20;
            var19_19 = var6_6;
            var22_22 = var6_6;
            var19_19 = var8_8;
            var23_23 = var8_8;
            var19_19 = var14_14 /* !! */ .getColor();
            var15_15 = var14_14 /* !! */ .getStyle();
            var16_16 = var14_14 /* !! */ .bgColor;
            var14_14 /* !! */ .setColor(var16_16);
            var24_24 = Paint.Style.FILL;
            var14_14 /* !! */ .setStyle(var24_24);
            var24_24 = var1_1;
            var1_1.drawRect(var5_5, var22_22, var21_21, var23_23, var14_14 /* !! */ );
            var14_14 /* !! */ .setStyle((Paint.Style)var15_15);
            var14_14 /* !! */ .setColor(var19_19);
        }
        var11_11 /* !! */  = EmojiCompat.a();
        var11_11 /* !! */ .getClass();
        var19_19 = var7_7;
        var25_25 = var7_7;
        if (var14_14 /* !! */  != null) {
            var12_12 = var14_14 /* !! */ ;
        }
        var11_11 /* !! */  = var10_10.b;
        var15_15 = var11_11 /* !! */ .b;
        var14_14 /* !! */  = var15_15.d;
        var26_26 = var12_12.getTypeface();
        var12_12.setTypeface((Typeface)var14_14 /* !! */ );
        var27_27 = var11_11 /* !! */ .a * 2;
        var18_18 = var15_15.b;
        var24_24 = var1_1;
        var23_23 = var5_5;
        var1_1.drawText(var18_18, var27_27, 2, var5_5, var25_25, var12_12);
        var12_12.setTypeface(var26_26);
    }
}

