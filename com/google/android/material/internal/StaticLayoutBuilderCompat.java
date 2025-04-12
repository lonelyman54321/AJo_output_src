/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 */
package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;

final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";
    private static Constructor constructor;
    private static boolean initialized;
    private static Object textDirection;
    private Layout.Alignment alignment;
    private TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final TextPaint paint;
    private CharSequence source;
    private int start;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n3 = n3 >= n4 ? 1 : 0;
        DEFAULT_HYPHENATION_FREQUENCY = n3;
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int n3) {
        int n4;
        this.source = charSequence;
        this.paint = textPaint;
        this.width = n3;
        this.start = 0;
        this.end = n4 = charSequence.length();
        charSequence = Layout.Alignment.ALIGN_NORMAL;
        this.alignment = charSequence;
        this.maxLines = -1 >>> 1;
        this.lineSpacingAdd = 0.0f;
        this.lineSpacingMultiplier = 1.0f;
        this.hyphenationFrequency = n4 = DEFAULT_HYPHENATION_FREQUENCY;
        this.includePad = true;
        this.ellipsize = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void createConstructorWithReflection() {
        Exception exception2;
        block5: {
            Class clazz;
            Object object;
            int n3;
            int n4;
            boolean bl2;
            GenericDeclaration genericDeclaration;
            block4: {
                block3: {
                    genericDeclaration = null;
                    bl2 = true;
                    n4 = initialized;
                    if (n4 != 0) {
                        return;
                    }
                    try {
                        n4 = this.isRtl;
                        if (n4 == 0 || (n4 = Build.VERSION.SDK_INT) < (n3 = 23)) break block3;
                        n4 = 1;
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                n4 = 0;
                object = null;
            }
            object = n4 != 0 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            textDirection = object;
            n4 = 13;
            object = new Class[n4];
            object[0] = clazz = CharSequence.class;
            genericDeclaration = Integer.TYPE;
            object[bl2] = genericDeclaration;
            n3 = 2;
            object[n3] = genericDeclaration;
            clazz = TextPaint.class;
            int n7 = 3;
            object[n7] = clazz;
            n3 = 4;
            object[n3] = genericDeclaration;
            clazz = Layout.Alignment.class;
            n7 = 5;
            object[n7] = clazz;
            clazz = TextDirectionHeuristic.class;
            n7 = 6;
            object[n7] = clazz;
            clazz = Float.TYPE;
            n7 = 7;
            object[n7] = clazz;
            n7 = 8;
            object[n7] = clazz;
            clazz = Boolean.TYPE;
            n7 = 9;
            object[n7] = clazz;
            clazz = TextUtils.TruncateAt.class;
            n7 = 10;
            object[n7] = clazz;
            n3 = 11;
            object[n3] = genericDeclaration;
            n3 = 12;
            object[n3] = genericDeclaration;
            genericDeclaration = StaticLayout.class;
            genericDeclaration = ((Class)genericDeclaration).getDeclaredConstructor((Class<?>)object);
            constructor = genericDeclaration;
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(bl2);
            initialized = bl2;
            return;
        }
        StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = new StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException(exception2);
        throw staticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
    }

    public static StaticLayoutBuilderCompat obtain(CharSequence charSequence, TextPaint textPaint, int n3) {
        StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(charSequence, textPaint, n3);
        return staticLayoutBuilderCompat;
    }

    public StaticLayout build() {
        Object object;
        Object object2;
        StaticLayoutBuilderCompat staticLayoutBuilderCompat = this;
        int n3 = 1;
        int n4 = 0;
        StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = null;
        Object object3 = this.source;
        if (object3 == null) {
            object3 = "";
            this.source = object3;
        }
        int n7 = staticLayoutBuilderCompat.width;
        n7 = Math.max(0, n7);
        CharSequence charSequence = staticLayoutBuilderCompat.source;
        int n8 = staticLayoutBuilderCompat.maxLines;
        if (n8 == n3) {
            object2 = staticLayoutBuilderCompat.paint;
            float f5 = n7;
            object = staticLayoutBuilderCompat.ellipsize;
            charSequence = TextUtils.ellipsize((CharSequence)charSequence, (TextPaint)object2, (float)f5, (TextUtils.TruncateAt)object);
        }
        n8 = charSequence.length();
        int n10 = staticLayoutBuilderCompat.end;
        staticLayoutBuilderCompat.end = n8 = Math.min(n8, n10);
        n10 = Build.VERSION.SDK_INT;
        int n14 = 23;
        float f6 = 1.0f;
        Float f7 = null;
        if (n10 >= n14) {
            StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
            float f8;
            float f11;
            n4 = staticLayoutBuilderCompat.isRtl;
            if (n4 != 0 && (n4 = staticLayoutBuilderCompat.maxLines) == n3) {
                staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = Layout.Alignment.ALIGN_OPPOSITE;
                staticLayoutBuilderCompat.alignment = staticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
            }
            n4 = staticLayoutBuilderCompat.start;
            TextPaint textPaint = staticLayoutBuilderCompat.paint;
            staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = Vb3.a(charSequence, n4, n8, textPaint, n7);
            object3 = staticLayoutBuilderCompat.alignment;
            Yb3.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, (Layout.Alignment)object3);
            n7 = (int)(staticLayoutBuilderCompat.includePad ? 1 : 0);
            dc3_1.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, n7 != 0);
            n7 = (int)(staticLayoutBuilderCompat.isRtl ? 1 : 0);
            object3 = n7 != 0 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Dn.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, (TextDirectionHeuristic)object3);
            object3 = staticLayoutBuilderCompat.ellipsize;
            if (object3 != null) {
                ac3.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, (TextUtils.TruncateAt)object3);
            }
            n7 = staticLayoutBuilderCompat.maxLines;
            Zb3.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, n7);
            float f12 = staticLayoutBuilderCompat.lineSpacingAdd;
            float f14 = f12 - 0.0f;
            float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            if (f15 != false || (f15 = (f11 = (f8 = staticLayoutBuilderCompat.lineSpacingMultiplier) - f6) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) != false) {
                f8 = staticLayoutBuilderCompat.lineSpacingMultiplier;
                cc3.b((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, f12, f8);
            }
            if ((n7 = staticLayoutBuilderCompat.maxLines) > n3) {
                n3 = staticLayoutBuilderCompat.hyphenationFrequency;
                Wb3.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException, n3);
            }
            if ((staticLayoutBuilderConfigurer = staticLayoutBuilderCompat.staticLayoutBuilderConfigurer) != null) {
                staticLayoutBuilderConfigurer.configure((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException);
            }
            return Xb3.a((StaticLayout.Builder)staticLayoutBuilderCompat$StaticLayoutBuilderCompatException);
        }
        this.createConstructorWithReflection();
        try {
            object2 = constructor;
        }
        catch (Exception exception) {
            staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = new StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException(exception);
            throw staticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
        }
        object2.getClass();
        n10 = staticLayoutBuilderCompat.start;
        Integer n15 = n10;
        n14 = staticLayoutBuilderCompat.end;
        object = n14;
        TextPaint textPaint = staticLayoutBuilderCompat.paint;
        Integer n16 = n7;
        Layout.Alignment alignment = staticLayoutBuilderCompat.alignment;
        Object object4 = textDirection;
        object4.getClass();
        Float f16 = Float.valueOf(f6);
        f7 = Float.valueOf(0.0f);
        boolean bl2 = staticLayoutBuilderCompat.includePad;
        Boolean bl3 = bl2;
        object3 = n7;
        int n17 = staticLayoutBuilderCompat.maxLines;
        Integer n18 = n17;
        n3 = 13;
        Object object5 = new Object[n3];
        object5[0] = charSequence;
        n4 = 1;
        object5[n4] = n15;
        n4 = 2;
        object5[n4] = object;
        n4 = 3;
        object5[n4] = textPaint;
        n4 = 4;
        object5[n4] = n16;
        n4 = 5;
        object5[n4] = alignment;
        n4 = 6;
        object5[n4] = object4;
        n4 = 7;
        object5[n4] = f16;
        n4 = 8;
        object5[n4] = f7;
        n4 = 9;
        object5[n4] = bl3;
        n4 = 0;
        staticLayoutBuilderCompat$StaticLayoutBuilderCompatException = null;
        int n19 = 10;
        float f17 = 1.4E-44f;
        object5[n19] = null;
        n4 = 11;
        object5[n4] = object3;
        n4 = 12;
        object5[n4] = n18;
        object5 = ((Constructor)object2).newInstance(object5);
        return (StaticLayout)object5;
    }

    public StaticLayoutBuilderCompat setAlignment(Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat setEnd(int n3) {
        this.end = n3;
        return this;
    }

    public StaticLayoutBuilderCompat setHyphenationFrequency(int n3) {
        this.hyphenationFrequency = n3;
        return this;
    }

    public StaticLayoutBuilderCompat setIncludePad(boolean bl2) {
        this.includePad = bl2;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean bl2) {
        this.isRtl = bl2;
        return this;
    }

    public StaticLayoutBuilderCompat setLineSpacing(float f5, float f6) {
        this.lineSpacingAdd = f5;
        this.lineSpacingMultiplier = f6;
        return this;
    }

    public StaticLayoutBuilderCompat setMaxLines(int n3) {
        this.maxLines = n3;
        return this;
    }

    public StaticLayoutBuilderCompat setStart(int n3) {
        this.start = n3;
        return this;
    }

    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
        return this;
    }
}

