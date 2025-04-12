/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.drawable.DrawableUtils$OutlineCompatL;
import com.google.android.material.drawable.DrawableUtils$OutlineCompatR;
import com.google.android.material.drawable.ScaledDrawableWrapper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = 255;
    private static final int UNSPECIFIED_HEIGHT = 255;
    private static final int UNSPECIFIED_WIDTH = 255;

    private DrawableUtils() {
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable2, Drawable drawable3) {
        int n3 = -1;
        return DrawableUtils.compositeTwoLayeredDrawable(drawable2, drawable3, n3, n3);
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable2, Drawable layerDrawable, int n3, int n4) {
        LayerDrawable layerDrawable2;
        int n7 = 2;
        int n8 = 1;
        if (drawable2 == null) {
            return layerDrawable;
        }
        if (layerDrawable == null) {
            return drawable2;
        }
        int n10 = -1;
        float f5 = 0.0f / 0.0f;
        int n14 = n3 != n10 && n4 != n10 ? 1 : 0;
        if (n3 == n10) {
            n3 = DrawableUtils.getTopLayerIntrinsicWidth(drawable2, (Drawable)layerDrawable);
        }
        if (n4 == n10) {
            n4 = DrawableUtils.getTopLayerIntrinsicHeight(drawable2, (Drawable)layerDrawable);
        }
        if (n3 > (n10 = drawable2.getIntrinsicWidth()) || n4 > (n10 = drawable2.getIntrinsicHeight())) {
            float f6 = n3;
            float f7 = n4;
            f6 /= f7;
            f7 = drawable2.getIntrinsicWidth();
            n10 = drawable2.getIntrinsicHeight();
            f5 = n10;
            float f8 = f6 - (f7 /= f5);
            n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n4 >= 0) {
                n4 = drawable2.getIntrinsicWidth();
                f5 = (float)n4 / f6;
                n3 = (int)f5;
                int n15 = n4;
                n4 = n3;
                n3 = n15;
            } else {
                n4 = drawable2.getIntrinsicHeight();
                f5 = n4;
                n3 = (int)(f6 *= f5);
            }
        }
        n10 = Build.VERSION.SDK_INT;
        int n16 = 23;
        if (n10 >= n16) {
            Drawable[] drawableArray = new Drawable[n7];
            drawableArray[0] = drawable2;
            drawableArray[n8] = layerDrawable;
            layerDrawable2 = new LayerDrawable(drawableArray);
            lu0_2.a(layerDrawable2, n3, n4);
            nu0_2.a(layerDrawable2);
        } else {
            if (n14 != 0) {
                layerDrawable = layerDrawable2 = new ScaledDrawableWrapper((Drawable)layerDrawable, n3, n4);
            }
            layerDrawable2 = new Drawable[n7];
            layerDrawable2[0] = drawable2;
            layerDrawable2[n8] = layerDrawable;
            LayerDrawable layerDrawable3 = new LayerDrawable((Drawable[])layerDrawable2);
            int n17 = (drawable2.getIntrinsicWidth() - n3) / n7;
            int n18 = Math.max(n17, 0);
            int n19 = (drawable2.getIntrinsicHeight() - n4) / n7;
            int n20 = Math.max(n19, 0);
            n14 = 1;
            layerDrawable2 = layerDrawable3;
            n16 = n18;
            layerDrawable3.setLayerInset(n14, n18, n20, n18, n20);
        }
        return layerDrawable2;
    }

    public static Drawable createTintableDrawableIfNeeded(Drawable drawable2, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return DrawableUtils.createTintableMutatedDrawableIfNeeded(drawable2, colorStateList, mode, false);
    }

    public static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable2, ColorStateList colorStateList, PorterDuff.Mode mode) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n3 = n3 < n4 ? 1 : 0;
        return DrawableUtils.createTintableMutatedDrawableIfNeeded(drawable2, colorStateList, mode, n3 != 0);
    }

    private static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable2, ColorStateList colorStateList, PorterDuff.Mode mode, boolean bl2) {
        if (drawable2 == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable2 = ut0_0.h(drawable2).mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        } else if (bl2) {
            drawable2.mutate();
        }
        return drawable2;
    }

    public static int[] getCheckedState(int[] nArray) {
        int n3;
        int n4 = 0;
        int[] nArray2 = null;
        while (true) {
            int n7 = nArray.length;
            n3 = 0x10100A0;
            if (n4 >= n7) break;
            n7 = nArray[n4];
            if (n7 == n3) {
                return nArray;
            }
            if (n7 == 0) {
                nArray = (int[])nArray.clone();
                nArray[n4] = n3;
                return nArray;
            }
            ++n4;
        }
        n4 = nArray.length + 1;
        nArray2 = Arrays.copyOf(nArray, n4);
        int n8 = nArray.length;
        nArray2[n8] = n3;
        return nArray2;
    }

    public static ColorStateList getColorStateListOrNull(Drawable drawable2) {
        int n3 = drawable2 instanceof ColorDrawable;
        if (n3 != 0) {
            return ColorStateList.valueOf((int)((ColorDrawable)drawable2).getColor());
        }
        n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4 && (n3 = (int)(pu0_2.b(drawable2) ? 1 : 0)) != 0) {
            return tu0_2.b(ru0_2.a(drawable2));
        }
        return null;
    }

    private static int getTopLayerIntrinsicHeight(Drawable drawable2, Drawable drawable3) {
        int n3;
        int n4 = drawable3.getIntrinsicHeight();
        if (n4 == (n3 = -1)) {
            n4 = drawable2.getIntrinsicHeight();
        }
        return n4;
    }

    private static int getTopLayerIntrinsicWidth(Drawable drawable2, Drawable drawable3) {
        int n3;
        int n4 = drawable3.getIntrinsicWidth();
        if (n4 == (n3 = -1)) {
            n4 = drawable2.getIntrinsicWidth();
        }
        return n4;
    }

    public static int[] getUncheckedState(int[] nArray) {
        int n3 = nArray.length;
        int[] nArray2 = new int[n3];
        int n4 = nArray.length;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = nArray[i3];
            int n10 = 0x10100A0;
            if (n8 == n10) continue;
            n10 = n7 + 1;
            nArray2[n7] = n8;
            n7 = n10;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AttributeSet parseDrawableXml(Context object, int n3, CharSequence object2) {
        void var0_3;
        block6: {
            CharSequence charSequence;
            try {
                int n4;
                int n7;
                int n8;
                object = object.getResources();
                object = object.getXml(n3);
                while ((n8 = object.next()) != (n7 = 2) && n8 != (n4 = 1)) {
                }
                if (n8 != n7) {
                    object2 = "No start tag found";
                    object = new XmlPullParserException((String)object2);
                    throw object;
                }
                charSequence = object.getName();
                n8 = (int)(TextUtils.equals((CharSequence)charSequence, (CharSequence)object2) ? 1 : 0);
                if (n8 != 0) {
                    return Xml.asAttributeSet((XmlPullParser)object);
                }
            }
            catch (IOException iOException) {
                break block6;
            }
            catch (XmlPullParserException xmlPullParserException) {
                break block6;
            }
            charSequence = new StringBuilder();
            String string2 = "Must have a <";
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(object2);
            object2 = "> start tag";
            ((StringBuilder)charSequence).append((String)object2);
            object2 = ((StringBuilder)charSequence).toString();
            object = new XmlPullParserException((String)object2);
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder("Can't load badge resource ID #0x");
        String string3 = Integer.toHexString(n3);
        stringBuilder.append(string3);
        string3 = stringBuilder.toString();
        object2 = new Resources.NotFoundException(string3);
        ((Throwable)object2).initCause((Throwable)var0_3);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void setOutlineToPath(Outline outline, Path path) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            DrawableUtils$OutlineCompatR.setPath(outline, path);
            return;
        }
        n4 = 29;
        if (n3 < n4) {
            n3 = (int)(path.isConvex() ? 1 : 0);
            if (n3 == 0) return;
            DrawableUtils$OutlineCompatL.setConvexPath(outline, path);
            return;
        }
        try {
            DrawableUtils$OutlineCompatL.setConvexPath(outline, path);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void setRippleDrawableRadius(RippleDrawable rippleDrawable, int n3) {
        void var0_4;
        int n4 = 1;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 23;
        if (n7 >= n8) {
            kw3.a(rippleDrawable, n3);
            return;
        }
        Object object = RippleDrawable.class;
        String string2 = "setMaxRadius";
        Class[] classArray = new Class[n4];
        Class<Integer> clazz = Integer.TYPE;
        classArray[0] = clazz;
        object = ((Class)object).getDeclaredMethod(string2, classArray);
        Integer n10 = n3;
        Object[] objectArray = new Object[n4];
        objectArray[0] = n10;
        try {
            ((Method)object).invoke((Object)rippleDrawable, objectArray);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        IllegalStateException illegalStateException = new IllegalStateException("Couldn't set RippleDrawable radius", (Throwable)var0_4);
        throw illegalStateException;
    }

    public static void setTint(Drawable drawable2, int n3) {
        PorterDuff.Mode mode;
        boolean bl2;
        if (n3 != 0) {
            bl2 = true;
        } else {
            bl2 = false;
            mode = null;
        }
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 21;
        if (n4 == n7) {
            if (bl2) {
                mode = PorterDuff.Mode.SRC_IN;
                drawable2.setColorFilter(n3, mode);
            } else {
                drawable2.setColorFilter(null);
            }
        } else if (bl2) {
            drawable2.setTint(n3);
        } else {
            drawable2.setTintList(null);
        }
    }

    public static PorterDuffColorFilter updateTintFilter(Drawable object, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            object = object.getState();
            int n3 = colorStateList.getColorForState((int[])object, 0);
            colorStateList = new PorterDuffColorFilter(n3, mode);
            return colorStateList;
        }
        return null;
    }
}

