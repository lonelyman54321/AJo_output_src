/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.text.Layout
 *  android.text.Layout$Alignment
 */
import android.graphics.Paint;
import android.text.Layout;

public final class Eg1 {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final float a(Layout layout2, int object, Paint paint) {
        float f5;
        void var1_5;
        float f6;
        void var2_6;
        float f7;
        int n3;
        float f8 = layout2.getLineLeft(object);
        Ej3 ej3 = Wl3.a;
        int n4 = layout2.getEllipsisCount(object);
        int n7 = 0;
        String string2 = null;
        if (n4 <= 0) return 0.0f;
        n4 = layout2.getParagraphDirection(object);
        if (n4 != (n3 = 1) || (n4 = (int)((f7 = f8 - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) >= 0) return 0.0f;
        n4 = layout2.getLineStart(object);
        n7 = layout2.getEllipsisStart(object) + n4;
        float f11 = layout2.getPrimaryHorizontal(n7) - f8;
        string2 = "\u2026";
        float f12 = var2_6.measureText(string2) + f11;
        Layout.Alignment alignment = layout2.getParagraphAlignment(object);
        if (alignment == null) {
            int n8 = -1;
            f6 = 0.0f / 0.0f;
        } else {
            int[] nArray = Eg1$a.$EnumSwitchMapping$0;
            int n14 = alignment.ordinal();
            n14 = nArray[n14];
        }
        if (var1_5 == n3) {
            f6 = Math.abs(f8);
            int n15 = layout2.getWidth();
            f5 = (float)n15 - f12;
            f12 = 2.0f;
            f5 /= f12;
            return f5 += f6;
        } else {
            f6 = Math.abs(f8);
            int n16 = layout2.getWidth();
            f5 = (float)n16 - f12;
            return f5 += f6;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final float b(Layout layout2, int n3, Paint paint) {
        float f5;
        float f6;
        float f7;
        float f8;
        int n4;
        Ej3 ej3 = Wl3.a;
        int n7 = layout2.getEllipsisCount(n3);
        if (n7 <= 0 || (n7 = layout2.getParagraphDirection(n3)) != (n4 = -1) || (n7 = (int)((f8 = (f7 = (float)layout2.getWidth()) - (f6 = layout2.getLineRight(n3))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) >= 0) return 0.0f;
        n7 = layout2.getLineStart(n3);
        int n8 = layout2.getEllipsisStart(n3) + n7;
        f7 = layout2.getPrimaryHorizontal(n8);
        f6 = layout2.getLineRight(n3) - f7;
        float f11 = paint.measureText("\u2026") + f6;
        ej3 = layout2.getParagraphAlignment(n3);
        if (ej3 != null) {
            int[] nArray = Eg1$a.$EnumSwitchMapping$0;
            n7 = ((Enum)((Object)ej3)).ordinal();
            n4 = nArray[n7];
        }
        n7 = 1;
        f7 = Float.MIN_VALUE;
        if (n4 == n7) {
            n7 = layout2.getWidth();
            f7 = n7;
            float f12 = layout2.getLineRight(n3);
            f7 -= f12;
            int n10 = layout2.getWidth();
            f5 = (float)n10 - f11;
            n3 = 0x40000000;
            f12 = 2.0f;
            f5 /= f12;
            return f7 -= f5;
        } else {
            n7 = layout2.getWidth();
            f7 = n7;
            float f14 = layout2.getLineRight(n3);
            f7 -= f14;
            int n14 = layout2.getWidth();
            f5 = (float)n14 - f11;
            return f7 -= f5;
        }
    }
}

