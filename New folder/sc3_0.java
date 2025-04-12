/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 *  android.text.TextUtils$TruncateAt
 */
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from sc3
 */
public final class sc3_0
implements tc3_0 {
    public static boolean a;
    public static Constructor b;

    public final boolean a(StaticLayout staticLayout, boolean bl2) {
        return false;
    }

    public StaticLayout b(uc3_0 uc3_02) {
        Object object;
        Layout.Alignment alignment;
        TextPaint textPaint;
        StaticLayout staticLayout;
        Object object2;
        uc3_0 uc3_03 = uc3_02;
        int n3 = 11;
        int n4 = 10;
        int n7 = 9;
        int n8 = 8;
        int n10 = 7;
        int n14 = 6;
        float f5 = 8.4E-45f;
        int n15 = 5;
        float f6 = 7.0E-45f;
        int bl2 = 4;
        float f7 = 5.6E-45f;
        int n16 = 3;
        int n17 = 2;
        int n18 = 0;
        Object object3 = null;
        int n19 = 13;
        int n20 = 1;
        boolean bl3 = a;
        StaticLayout staticLayout2 = null;
        if (bl3) {
            object2 = b;
        } else {
            a = n20;
            object2 = StaticLayout.class;
            staticLayout = new Class[n19];
            Class clazz = CharSequence.class;
            staticLayout[0] = clazz;
            clazz = Integer.TYPE;
            staticLayout[n20] = clazz;
            staticLayout[n17] = clazz;
            Class clazz2 = TextPaint.class;
            staticLayout[n16] = clazz2;
            staticLayout[bl2] = clazz;
            clazz2 = Layout.Alignment.class;
            staticLayout[n15] = clazz2;
            clazz2 = TextDirectionHeuristic.class;
            staticLayout[n14] = clazz2;
            clazz2 = Float.TYPE;
            staticLayout[n10] = clazz2;
            staticLayout[n8] = clazz2;
            clazz2 = Boolean.TYPE;
            staticLayout[n7] = clazz2;
            clazz2 = TextUtils.TruncateAt.class;
            staticLayout[n4] = clazz2;
            staticLayout[n3] = clazz;
            int n21 = 12;
            staticLayout[n21] = clazz;
            staticLayout = ((Class)object2).getConstructor((Class<?>)staticLayout);
            try {
                b = staticLayout;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                b = null;
            }
            object2 = b;
        }
        if (object2 != null) {
            staticLayout = uc3_03.a;
            n3 = uc3_03.b;
            Integer n22 = n3;
            n4 = uc3_03.c;
            Integer n24 = n4;
            textPaint = uc3_03.d;
            n8 = uc3_03.e;
            Integer n25 = n8;
            alignment = uc3_03.g;
            TextDirectionHeuristic textDirectionHeuristic = uc3_03.f;
            f6 = uc3_03.k;
            Float f8 = Float.valueOf(f6);
            f7 = uc3_03.l;
            Float f11 = Float.valueOf(f7);
            boolean bl4 = uc3_03.n;
            object = bl4;
            TextUtils.TruncateAt truncateAt = uc3_03.i;
            n20 = uc3_03.j;
            Integer n26 = n20;
            n18 = uc3_03.h;
            object3 = n18;
            Object[] objectArray = new Object[n19];
            objectArray[0] = staticLayout;
            int n27 = 1;
            objectArray[n27] = n22;
            n27 = 2;
            objectArray[n27] = n24;
            n27 = 3;
            objectArray[n27] = textPaint;
            n27 = 4;
            objectArray[n27] = n25;
            n27 = 5;
            objectArray[n27] = alignment;
            n27 = 6;
            objectArray[n27] = textDirectionHeuristic;
            n27 = 7;
            objectArray[n27] = f8;
            n27 = 8;
            objectArray[n27] = f11;
            n27 = 9;
            objectArray[n27] = object;
            n27 = 10;
            objectArray[n27] = truncateAt;
            n27 = 11;
            objectArray[n27] = n26;
            n27 = 12;
            objectArray[n27] = object3;
            staticLayout = ((Constructor)object2).newInstance(objectArray);
            try {
                staticLayout2 = staticLayout = (StaticLayout)staticLayout;
            }
            catch (InvocationTargetException invocationTargetException) {
                b = null;
            }
            catch (InstantiationException instantiationException) {
                b = null;
            }
            catch (IllegalAccessException illegalAccessException) {
                b = null;
            }
        }
        if (staticLayout2 != null) {
            return staticLayout2;
        }
        staticLayout = uc3_03.a;
        n3 = uc3_03.b;
        n4 = uc3_03.c;
        textPaint = uc3_03.d;
        n8 = uc3_03.e;
        alignment = uc3_03.g;
        f5 = uc3_03.k;
        f6 = uc3_03.l;
        boolean bl5 = uc3_03.n;
        object = uc3_03.i;
        n17 = uc3_03.j;
        uc3_03 = object3;
        object3 = new StaticLayout((CharSequence)staticLayout, n3, n4, textPaint, n8, alignment, f5, f6, bl5, object, n17);
        return object3;
    }
}

