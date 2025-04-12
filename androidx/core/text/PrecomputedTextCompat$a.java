/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.PrecomputedText$Params
 *  android.text.PrecomputedText$Params$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 *  android.text.TextUtils
 */
package androidx.core.text;

import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public final class PrecomputedTextCompat$a {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public PrecomputedTextCompat$a(PrecomputedText.Params params) {
        int n3;
        int n4;
        TextPaint textPaint;
        this.a = textPaint = Ex2.a(params);
        textPaint = Fx2.a(params);
        this.b = textPaint;
        this.c = n4 = Gx2.a(params);
        this.d = n3 = Hx2.a(params);
    }

    public PrecomputedTextCompat$a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int n3, int n4) {
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 29;
        if (n7 >= n8) {
            PrecomputedText.Params.Builder builder = kx2_0.a(Jx2.a(ix2_0.a(Cx2.a(textPaint), n3), n4), textDirectionHeuristic);
            Lx2.a(builder);
        }
        this.a = textPaint;
        this.b = textDirectionHeuristic;
        this.c = n3;
        this.d = n4;
    }

    public final boolean a(PrecomputedTextCompat$a precomputedTextCompat$a) {
        boolean bl2;
        Object object;
        int n3;
        Object object2;
        float f5;
        TextPaint textPaint;
        float f6;
        float f7;
        int n4;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 23;
        if (n7 >= n8) {
            n4 = this.c;
            n8 = precomputedTextCompat$a.c;
            if (n4 != n8) {
                return false;
            }
            n8 = this.d;
            n4 = precomputedTextCompat$a.d;
            if (n8 != n4) {
                return false;
            }
        }
        if ((n4 = (int)((f7 = (f6 = (textPaint = this.a).getTextSize()) - (f5 = (object2 = precomputedTextCompat$a.a).getTextSize())) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0) {
            return false;
        }
        f6 = textPaint.getTextScaleX();
        float f8 = f6 - (f5 = (precomputedTextCompat$a = precomputedTextCompat$a.a).getTextScaleX());
        n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            return false;
        }
        f6 = textPaint.getTextSkewX();
        float f11 = f6 - (f5 = precomputedTextCompat$a.getTextSkewX());
        n4 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            return false;
        }
        f6 = textPaint.getLetterSpacing();
        float f12 = f6 - (f5 = precomputedTextCompat$a.getLetterSpacing());
        n4 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            return false;
        }
        Object object3 = textPaint.getFontFeatureSettings();
        n4 = (int)(TextUtils.equals((CharSequence)object3, (CharSequence)(object2 = precomputedTextCompat$a.getFontFeatureSettings())) ? 1 : 0);
        if (n4 == 0) {
            return false;
        }
        n4 = textPaint.getFlags();
        if (n4 != (n3 = precomputedTextCompat$a.getFlags())) {
            return false;
        }
        n4 = 24;
        f6 = 3.4E-44f;
        if (n7 >= n4) {
            object = Bx2.a(textPaint);
            object3 = Bx2.a((TextPaint)precomputedTextCompat$a);
            n7 = (int)(an_0.a(object3, (LocaleList)object) ? 1 : 0);
            if (n7 == 0) {
                return false;
            }
        } else {
            object = textPaint.getTextLocale();
            n7 = (int)(((Locale)object).equals(object3 = precomputedTextCompat$a.getTextLocale()) ? 1 : 0);
            if (n7 == 0) {
                return false;
            }
        }
        return !((object = textPaint.getTypeface()) == null ? (precomputedTextCompat$a = precomputedTextCompat$a.getTypeface()) != null : !(bl2 = (object = textPaint.getTypeface()).equals((Object)(precomputedTextCompat$a = precomputedTextCompat$a.getTypeface()))));
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof PrecomputedTextCompat$a;
        if (!bl3) {
            return false;
        }
        bl3 = this.a((PrecomputedTextCompat$a)(object = (PrecomputedTextCompat$a)object));
        if (!bl3) {
            return false;
        }
        TextDirectionHeuristic textDirectionHeuristic = this.b;
        object = ((PrecomputedTextCompat$a)object).b;
        if (textDirectionHeuristic != object) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = 7;
        int n4 = 6;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        int n15 = 1;
        int n16 = 11;
        TextDirectionHeuristic textDirectionHeuristic = this.b;
        int n17 = Build.VERSION.SDK_INT;
        int n18 = 24;
        int n19 = this.d;
        int n20 = this.c;
        Object object = this.a;
        if (n17 >= n18) {
            Float f5 = Float.valueOf(object.getTextSize());
            Float f6 = Float.valueOf(object.getTextScaleX());
            Float f7 = Float.valueOf(object.getTextSkewX());
            Float f8 = Float.valueOf(object.getLetterSpacing());
            Integer n21 = object.getFlags();
            LocaleList localeList = Bx2.a(object);
            Typeface typeface = object.getTypeface();
            object = object.isElegantTextHeight();
            Integer n22 = n20;
            Integer n24 = n19;
            Object[] objectArray = new Object[n16];
            objectArray[0] = f5;
            objectArray[n15] = f6;
            objectArray[n14] = f7;
            objectArray[n10] = f8;
            objectArray[n8] = n21;
            objectArray[n7] = localeList;
            objectArray[n4] = typeface;
            objectArray[n3] = object;
            objectArray[8] = textDirectionHeuristic;
            objectArray[9] = n22;
            objectArray[10] = n24;
            return Objects.hash(objectArray);
        }
        Float f11 = Float.valueOf(object.getTextSize());
        Float f12 = Float.valueOf(object.getTextScaleX());
        Float f14 = Float.valueOf(object.getTextSkewX());
        Float f15 = Float.valueOf(object.getLetterSpacing());
        Integer n25 = object.getFlags();
        Locale locale = object.getTextLocale();
        Typeface typeface = object.getTypeface();
        object = object.isElegantTextHeight();
        Integer n26 = n20;
        Integer n27 = n19;
        Object[] objectArray = new Object[n16];
        objectArray[0] = f11;
        objectArray[n15] = f12;
        objectArray[n14] = f14;
        objectArray[n10] = f15;
        objectArray[n8] = n25;
        objectArray[n7] = locale;
        objectArray[n4] = typeface;
        objectArray[n3] = object;
        objectArray[8] = textDirectionHeuristic;
        objectArray[9] = n26;
        objectArray[10] = n27;
        return Objects.hash(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        CharSequence charSequence = new StringBuilder("textSize=");
        Object object = this.a;
        float f5 = object.getTextSize();
        ((StringBuilder)charSequence).append(f5);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        charSequence = new StringBuilder(", textScaleX=");
        f5 = object.getTextScaleX();
        ((StringBuilder)charSequence).append(f5);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        charSequence = new StringBuilder(", textSkewX=");
        f5 = object.getTextSkewX();
        ((StringBuilder)charSequence).append(f5);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        int n3 = Build.VERSION.SDK_INT;
        CharSequence charSequence2 = new StringBuilder(", letterSpacing=");
        float f6 = object.getLetterSpacing();
        ((StringBuilder)charSequence2).append(f6);
        charSequence2 = ((StringBuilder)charSequence2).toString();
        stringBuilder.append((String)charSequence2);
        charSequence2 = new StringBuilder(", elegantTextHeight=");
        boolean bl2 = object.isElegantTextHeight();
        ((StringBuilder)charSequence2).append(bl2);
        charSequence2 = ((StringBuilder)charSequence2).toString();
        stringBuilder.append((String)charSequence2);
        int n4 = 24;
        f5 = 3.4E-44f;
        Object object2 = ", textLocale=";
        if (n3 >= n4) {
            charSequence2 = new StringBuilder((String)object2);
            object2 = Bx2.a(object);
            ((StringBuilder)charSequence2).append(object2);
            charSequence2 = ((StringBuilder)charSequence2).toString();
            stringBuilder.append((String)charSequence2);
        } else {
            charSequence2 = new StringBuilder((String)object2);
            object2 = object.getTextLocale();
            ((StringBuilder)charSequence2).append(object2);
            charSequence2 = ((StringBuilder)charSequence2).toString();
            stringBuilder.append((String)charSequence2);
        }
        charSequence2 = new StringBuilder(", typeface=");
        object2 = object.getTypeface();
        ((StringBuilder)charSequence2).append(object2);
        charSequence2 = ((StringBuilder)charSequence2).toString();
        stringBuilder.append((String)charSequence2);
        n4 = 26;
        f5 = 3.6E-44f;
        if (n3 >= n4) {
            charSequence2 = ", variationSettings=";
            charSequence = new StringBuilder((String)charSequence2);
            object = dx2_0.a(object);
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)charSequence);
        }
        charSequence = new StringBuilder(", textDir=");
        object = this.b;
        ((StringBuilder)charSequence).append(object);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        charSequence = new StringBuilder(", breakStrategy=");
        int n7 = this.c;
        ((StringBuilder)charSequence).append(n7);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        charSequence = new StringBuilder(", hyphenationFrequency=");
        n7 = this.d;
        ((StringBuilder)charSequence).append(n7);
        charSequence = ((StringBuilder)charSequence).toString();
        stringBuilder.append((String)charSequence);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

