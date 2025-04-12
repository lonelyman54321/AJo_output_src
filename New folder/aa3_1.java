/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from AA3
 */
public final class aa3_1
extends za3_0 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public AA3$g b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f = true;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public aa3_1() {
        Object object;
        Object object2 = new float[9];
        this.g = object2;
        object2 = new Matrix;
        this.h = (Matrix)object2;
        object2 = new Rect;
        super();
        this.i = (Rect)object2;
        object2 = (Object)new AA3$g;
        super();
        object2.c = null;
        object2.d = object = j;
        super();
        object2.b = object;
        this.b = (AA3$g)((Object)object2);
    }

    public aa3_1(AA3$g aA3$g) {
        Object object = new float[9];
        this.g = object;
        object = new Matrix;
        this.h = (Matrix)object;
        object = new Rect;
        super();
        this.i = (Rect)object;
        this.b = aA3$g;
        object = aA3$g.c;
        aA3$g = aA3$g.d;
        aA3$g = this.b((ColorStateList)object, (PorterDuff.Mode)aA3$g);
        this.c = aA3$g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static aa3_1 a(int n3, Resources.Theme object, Resources resources) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 24;
        if (n4 >= n7) {
            Drawable drawable2;
            aa3_1 aa3_12 = new aa3_1();
            ThreadLocal threadLocal = WK2.a;
            aa3_12.a = drawable2 = resources.getDrawable(n3, object);
            return aa3_12;
        }
        try {
            int n8;
            int n10;
            Object object2 = resources.getXml(n3);
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)object2);
            while ((n7 = object2.next()) != (n10 = 2) && n7 != (n8 = 1)) {
            }
            if (n7 == n10) {
                aa3_1 aa3_13 = new aa3_1();
                aa3_13.inflate(resources, (XmlPullParser)object2, attributeSet, (Resources.Theme)object);
                return aa3_13;
            }
            object = "No start tag found";
            object2 = new XmlPullParserException((String)object);
            throw object2;
        }
        catch (IOException | XmlPullParserException throwable) {}
        return null;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            Object object = this.getState();
            int n3 = colorStateList.getColorForState(object, 0);
            object = new PorterDuffColorFilter;
            object(n3, mode);
            return object;
        }
        return null;
    }

    public final boolean canApplyTheme() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        aa3_1 aa3_12 = this;
        Canvas canvas2 = canvas;
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
            return;
        }
        drawable2 = this.i;
        this.copyBounds((Rect)drawable2);
        int n3 = drawable2.width();
        if (n3 > 0 && (n3 = drawable2.height()) > 0) {
            int n4;
            float f5;
            float f6;
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.c;
            }
            Object object = aa3_12.h;
            canvas2.getMatrix(object);
            Object object2 = aa3_12.g;
            object.getValues(object2);
            object = null;
            float f7 = Math.abs(object2[0]);
            int n7 = 4;
            float f8 = Math.abs(object2[n7]);
            boolean bl2 = true;
            float f11 = Math.abs(object2[bl2]);
            float f12 = Math.abs(object2[3]);
            int n8 = 1065353216;
            float f14 = 1.0f;
            int n10 = 0;
            ColorStateList colorStateList = null;
            float f15 = f11 - 0.0f;
            float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (f16 != false || (f6 = (f5 = f12 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false) {
                n4 = 1065353216;
                f7 = 1.0f;
                n7 = 1065353216;
                f8 = 1.0f;
            }
            f12 = (float)drawable2.width() * f7;
            f6 = (int)f12;
            f7 = (float)drawable2.height() * f8;
            n4 = (int)f7;
            n7 = 2048;
            f8 = 2.87E-42f;
            f6 = Math.min(n7, (int)f6);
            n4 = Math.min(n7, n4);
            if (f6 > 0 && n4 > 0) {
                Object object3;
                n7 = canvas.save();
                f11 = drawable2.left;
                int n14 = drawable2.top;
                float f17 = n14;
                canvas2.translate(f11, f17);
                f16 = (float)this.isAutoMirrored();
                if (f16 != false && (f16 = (float)ut0_0.b(this)) == bl2) {
                    f11 = drawable2.width();
                    canvas2.translate(f11, 0.0f);
                    f16 = -1082130432;
                    f11 = -1.0f;
                    canvas2.scale(f11, f14);
                }
                drawable2.offsetTo(0, 0);
                Object object4 = aa3_12.b;
                Bitmap bitmap = ((AA3$g)((Object)object4)).f;
                if (bitmap == null || f6 != (n8 = bitmap.getWidth()) || n4 != (n8 = (bitmap = ((AA3$g)((Object)object4)).f).getHeight())) {
                    bitmap = Bitmap.Config.ARGB_8888;
                    ((AA3$g)((Object)object4)).f = bitmap = Bitmap.createBitmap((int)f6, (int)n4, (Bitmap.Config)bitmap);
                    ((AA3$g)((Object)object4)).k = bl2;
                }
                f16 = (float)aa3_12.f;
                if (f16 == false) {
                    object4 = aa3_12.b;
                    bitmap = ((AA3$g)((Object)object4)).f;
                    bitmap.eraseColor(0);
                    object = ((AA3$g)((Object)object4)).f;
                    Canvas canvas3 = new Canvas((Bitmap)object);
                    AA3$f aA3$f = ((AA3$g)((Object)object4)).b;
                    Matrix matrix = AA3$f.p;
                    AA3$c aA3$c = aA3$f.g;
                    aA3$f.a(aA3$c, matrix, canvas3, (int)f6, n4);
                } else {
                    object4 = aa3_12.b;
                    n8 = (int)(((AA3$g)((Object)object4)).k ? 1 : 0);
                    if (n8 != 0 || (bitmap = ((AA3$g)((Object)object4)).g) != (colorStateList = ((AA3$g)((Object)object4)).c) || (bitmap = ((AA3$g)((Object)object4)).h) != (colorStateList = ((AA3$g)((Object)object4)).d) || (n8 = (int)(((AA3$g)((Object)object4)).j ? 1 : 0)) != (n10 = ((AA3$g)((Object)object4)).e) || (n8 = ((AA3$g)((Object)object4)).i) != (f16 = (float)((AA3$f)(object4 = ((AA3$g)((Object)object4)).b)).getRootAlpha())) {
                        object4 = aa3_12.b;
                        ((AA3$g)((Object)object4)).f.eraseColor(0);
                        bitmap = ((AA3$g)((Object)object4)).f;
                        Canvas canvas4 = new Canvas(bitmap);
                        AA3$f aA3$f = ((AA3$g)((Object)object4)).b;
                        Matrix matrix = AA3$f.p;
                        AA3$c aA3$c = aA3$f.g;
                        aA3$f.a(aA3$c, matrix, canvas4, (int)f6, n4);
                        object2 = aa3_12.b;
                        object3 = object2.c;
                        object2.g = object3;
                        object3 = object2.d;
                        object2.h = object3;
                        object3 = object2.b;
                        object2.i = n4 = ((AA3$f)object3).getRootAlpha();
                        n4 = (int)(object2.e ? 1 : 0);
                        object2.j = n4;
                        object2.k = false;
                    }
                }
                object = aa3_12.b;
                object2 = object.b;
                f6 = object2.getRootAlpha();
                n4 = 255;
                f7 = 3.57E-43f;
                f16 = 0.0f;
                f11 = 0.0f;
                object4 = null;
                if (f6 >= n4 && colorFilter == null) {
                    n3 = 0;
                    colorFilter = null;
                } else {
                    object2 = object.l;
                    if (object2 == null) {
                        object2 = new Paint;
                        object2();
                        object.l = (Paint)object2;
                        object2.setFilterBitmap(bl2);
                    }
                    object2 = object.l;
                    object3 = object.b;
                    n4 = ((AA3$f)object3).getRootAlpha();
                    object2.setAlpha(n4);
                    object2 = object.l;
                    object2.setColorFilter(colorFilter);
                    colorFilter = object.l;
                }
                object = object.f;
                canvas2.drawBitmap((Bitmap)object, null, (Rect)drawable2, (Paint)colorFilter);
                canvas2.restoreToCount(n7);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getAlpha();
        }
        return this.b.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getChangingConfigurations();
        }
        int n3 = super.getChangingConfigurations();
        int n4 = this.b.getChangingConfigurations();
        return n3 | n4;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getColorFilter();
        }
        return this.d;
    }

    public final Drawable.ConstantState getConstantState() {
        int n3;
        int n4;
        Object object = this.a;
        if (object != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 24)) {
            Drawable.ConstantState constantState = this.a.getConstantState();
            object = new AA3$h(constantState);
            return object;
        }
        object = this.b;
        object.a = n3 = this.getChangingConfigurations();
        return this.b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getIntrinsicHeight();
        }
        return (int)this.b.b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getIntrinsicWidth();
        }
        return (int)this.b.b.h;
    }

    public final int getOpacity() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.inflate(resources, xmlPullParser, attributeSet);
            return;
        }
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n3;
        aa3_1 aa3_12 = this;
        Resources resources2 = resources;
        Object object = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        AA3$g aA3$g = this.b;
        Object object2 = new AA3$f();
        aA3$g.b = object2;
        object2 = Pi.a;
        object2 = dt3.g(resources, theme, attributeSet, (int[])object2);
        AA3$g aA3$g2 = this.b;
        AA3$f aA3$f = aA3$g2.b;
        Object object3 = "tintMode";
        int n4 = 6;
        float f5 = 8.4E-45f;
        int n7 = -1;
        int n8 = dt3.d((TypedArray)object2, xmlPullParser, (String)object3, n4, n7);
        Object object4 = PorterDuff.Mode.SRC_IN;
        int n10 = 3;
        int n14 = 9;
        int n15 = 5;
        if (n8 != n10) {
            if (n8 != n15) {
                if (n8 != n14) {
                    switch (n8) {
                        default: {
                            break;
                        }
                        case 16: {
                            object4 = PorterDuff.Mode.ADD;
                            break;
                        }
                        case 15: {
                            object4 = PorterDuff.Mode.SCREEN;
                            break;
                        }
                        case 14: {
                            object4 = PorterDuff.Mode.MULTIPLY;
                            break;
                        }
                    }
                } else {
                    object4 = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            object4 = PorterDuff.Mode.SRC_OVER;
        }
        aA3$g2.d = object4;
        object3 = dt3.b((TypedArray)object2, (XmlPullParser)object, theme2);
        if (object3 != null) {
            aA3$g2.c = object3;
        }
        n8 = (int)(aA3$g2.e ? 1 : 0);
        object4 = "autoMirrored";
        int n16 = dt3.f((XmlPullParser)object, (String)object4);
        if (n16 != 0) {
            n8 = object2.getBoolean(n15, n8 != 0);
        }
        aA3$g2.e = n8;
        float f6 = aA3$f.j;
        object3 = "viewportWidth";
        n8 = dt3.f((XmlPullParser)object, (String)object3);
        n16 = 7;
        float f7 = 9.8E-45f;
        if (n8 != 0) {
            f6 = object2.getFloat(n16, f6);
        }
        aA3$f.j = f6;
        f6 = aA3$f.k;
        object3 = "viewportHeight";
        n8 = dt3.f((XmlPullParser)object, (String)object3);
        n15 = 8;
        if (n8 != 0) {
            f6 = object2.getFloat(n15, f6);
        }
        aA3$f.k = f6;
        float f8 = aA3$f.j;
        float f11 = f8 - 0.0f;
        n8 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
        if (n8 <= 0) {
            object = new StringBuilder();
            String string2 = object2.getPositionDescription();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("<vector> tag requires viewportWidth > 0");
            object = ((StringBuilder)object).toString();
            XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object);
            throw xmlPullParserException;
        }
        float f12 = f6 - 0.0f;
        Object object5 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object5 <= 0) {
            object = new StringBuilder();
            String string3 = object2.getPositionDescription();
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append("<vector> tag requires viewportHeight > 0");
            object = ((StringBuilder)object).toString();
            XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object);
            throw xmlPullParserException;
        }
        f6 = aA3$f.h;
        aA3$f.h = f6 = object2.getDimension(n10, f6);
        f6 = aA3$f.i;
        n8 = 2;
        f8 = 2.8E-45f;
        aA3$f.i = f6 = object2.getDimension(n8, f6);
        f7 = aA3$f.h;
        float f14 = f7 - 0.0f;
        n16 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
        if (n16 <= 0) {
            object = new StringBuilder();
            String string4 = object2.getPositionDescription();
            ((StringBuilder)object).append(string4);
            ((StringBuilder)object).append("<vector> tag requires width > 0");
            object = ((StringBuilder)object).toString();
            XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object);
            throw xmlPullParserException;
        }
        float f15 = f6 - 0.0f;
        Object object6 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (object6 <= 0) {
            object = new StringBuilder();
            String string5 = object2.getPositionDescription();
            ((StringBuilder)object).append(string5);
            ((StringBuilder)object).append("<vector> tag requires height > 0");
            object = ((StringBuilder)object).toString();
            XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object);
            throw xmlPullParserException;
        }
        f6 = aA3$f.getAlpha();
        object4 = "alpha";
        n16 = (int)(dt3.f((XmlPullParser)object, (String)object4) ? 1 : 0);
        n4 = 4;
        f5 = 5.6E-45f;
        if (n16 != 0) {
            f6 = object2.getFloat(n4, f6);
        }
        aA3$f.setAlpha(f6);
        boolean bl2 = false;
        f6 = 0.0f;
        Object var12_25 = null;
        object4 = object2.getString(0);
        if (object4 != null) {
            aA3$f.m = object4;
            Jp jp = aA3$f.o;
            jp.put(object4, aA3$f);
        }
        object2.recycle();
        aA3$g.a = n3 = this.getChangingConfigurations();
        n3 = 1;
        aA3$g.k = n3;
        AA3$g aA3$g3 = aa3_12.b;
        AA3$f aA3$f2 = aA3$g3.b;
        object4 = new ArrayDeque();
        AA3$c aA3$c = aA3$f2.g;
        ((ArrayDeque)object4).push(aA3$c);
        n14 = xmlPullParser.getEventType();
        n7 = xmlPullParser.getDepth() + 1;
        int n17 = 1;
        while (n14 != n3 && ((n15 = xmlPullParser.getDepth()) >= n7 || n14 != n10)) {
            int n18;
            int n19;
            void var35_107;
            block75: {
                String string6;
                void var28_63;
                String string7;
                block63: {
                    block72: {
                        block74: {
                            block64: {
                                Object object7;
                                String string8;
                                block73: {
                                    String string9;
                                    String string10;
                                    block65: {
                                        TypedArray typedArray;
                                        block67: {
                                            O00 o00;
                                            void var28_75;
                                            block71: {
                                                block70: {
                                                    block69: {
                                                        block68: {
                                                            O00 o002;
                                                            block66: {
                                                                string7 = "group";
                                                                if (n14 != n8) break block63;
                                                                string8 = xmlPullParser.getName();
                                                                Object e2 = ((ArrayDeque)object4).peek();
                                                                object7 = e2;
                                                                object7 = (AA3$c)e2;
                                                                if (object7 == null) break block64;
                                                                object2 = "path";
                                                                n3 = (int)(((String)object2).equals(string8) ? 1 : 0);
                                                                object3 = var28_63.o;
                                                                object7 = ((AA3$c)object7).b;
                                                                string10 = "fillType";
                                                                var35_107 = var28_63;
                                                                string9 = "pathData";
                                                                if (n3 == 0) break block65;
                                                                object2 = new AA3$b();
                                                                int[] nArray = Pi.c;
                                                                typedArray = dt3.g(resources2, theme2, attributeSet2, nArray);
                                                                n4 = (int)(dt3.f((XmlPullParser)object, string9) ? 1 : 0);
                                                                if (n4 != 0) break block66;
                                                                n19 = n7;
                                                                break block67;
                                                            }
                                                            n4 = 0;
                                                            f5 = 0.0f;
                                                            Object var28_65 = null;
                                                            string7 = typedArray.getString(0);
                                                            if (string7 != null) {
                                                                ((AA3$e)object2).b = string7;
                                                            }
                                                            n4 = 2;
                                                            f5 = 2.8E-45f;
                                                            string7 = typedArray.getString(n4);
                                                            if (string7 != null) {
                                                                rn2$a[] rn2$aArray = rn2.c(string7);
                                                                ((AA3$e)object2).a = rn2$aArray;
                                                            }
                                                            ((AA3$b)object2).g = o002 = dt3.c(typedArray, (XmlPullParser)object, theme2, "fillColor", 1);
                                                            f5 = ((AA3$b)object2).i;
                                                            string7 = "fillAlpha";
                                                            n15 = (int)(dt3.f((XmlPullParser)object, string7) ? 1 : 0);
                                                            if (n15 != 0) {
                                                                n15 = 12;
                                                                f5 = typedArray.getFloat(n15, f5);
                                                            }
                                                            ((AA3$b)object2).i = f5;
                                                            String string11 = "strokeLineCap";
                                                            n4 = (int)(dt3.f((XmlPullParser)object, string11) ? 1 : 0);
                                                            if (n4 == 0) {
                                                                n4 = -1;
                                                                f5 = 0.0f / 0.0f;
                                                            } else {
                                                                f5 = 0.0f / 0.0f;
                                                                n15 = 8;
                                                                n4 = n17 = typedArray.getInt(n15, -1);
                                                            }
                                                            string7 = ((AA3$b)object2).m;
                                                            if (n4 == 0) break block68;
                                                            n19 = n7;
                                                            n7 = 1;
                                                            if (n4 != n7) {
                                                                n7 = 2;
                                                                if (n4 == n7) {
                                                                    string7 = Paint.Cap.SQUARE;
                                                                }
                                                                break block69;
                                                            } else {
                                                                string7 = Paint.Cap.ROUND;
                                                            }
                                                            break block69;
                                                        }
                                                        n19 = n7;
                                                        string7 = Paint.Cap.BUTT;
                                                    }
                                                    ((AA3$b)object2).m = string7;
                                                    String string12 = "strokeLineJoin";
                                                    n4 = (int)(dt3.f((XmlPullParser)object, string12) ? 1 : 0);
                                                    if (n4 == 0) {
                                                        n7 = -1;
                                                        n15 = -1;
                                                    } else {
                                                        n4 = 9;
                                                        f5 = 1.3E-44f;
                                                        n7 = -1;
                                                        n15 = typedArray.getInt(n4, n7);
                                                    }
                                                    Paint.Join join = ((AA3$b)object2).n;
                                                    if (n15 == 0) break block70;
                                                    n7 = 1;
                                                    if (n15 != n7) {
                                                        n7 = 2;
                                                        if (n15 == n7) {
                                                            Paint.Join join2 = Paint.Join.BEVEL;
                                                        }
                                                        break block71;
                                                    } else {
                                                        Paint.Join join3 = Paint.Join.ROUND;
                                                    }
                                                    break block71;
                                                }
                                                Paint.Join join = Paint.Join.MITER;
                                            }
                                            ((AA3$b)object2).n = var28_75;
                                            f5 = ((AA3$b)object2).o;
                                            string6 = "strokeMiterLimit";
                                            n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                            if (n7 != 0) {
                                                n7 = 10;
                                                f5 = typedArray.getFloat(n7, f5);
                                            }
                                            ((AA3$b)object2).o = f5;
                                            ((AA3$b)object2).e = o00 = dt3.c(typedArray, (XmlPullParser)object, theme2, "strokeColor", 3);
                                            f5 = ((AA3$b)object2).h;
                                            string6 = "strokeAlpha";
                                            n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                            if (n7 != 0) {
                                                n7 = 11;
                                                f5 = typedArray.getFloat(n7, f5);
                                            }
                                            ((AA3$b)object2).h = f5;
                                            f5 = ((AA3$b)object2).f;
                                            string6 = "strokeWidth";
                                            n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                            if (n7 != 0) {
                                                n7 = 4;
                                                f5 = typedArray.getFloat(n7, f5);
                                            }
                                            ((AA3$b)object2).f = f5;
                                            f5 = ((AA3$b)object2).k;
                                            string6 = "trimPathEnd";
                                            n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                            if (n7 != 0) {
                                                n7 = 6;
                                                f5 = typedArray.getFloat(n7, f5);
                                            }
                                            ((AA3$b)object2).k = f5;
                                            f5 = ((AA3$b)object2).l;
                                            string6 = "trimPathOffset";
                                            n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                            if (n7 != 0) {
                                                n7 = 7;
                                                f5 = typedArray.getFloat(n7, f5);
                                            }
                                            ((AA3$b)object2).l = f5;
                                            f5 = ((AA3$b)object2).j;
                                            string6 = "trimPathStart";
                                            n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                            if (n7 != 0) {
                                                n7 = 5;
                                                f5 = typedArray.getFloat(n7, f5);
                                            }
                                            ((AA3$b)object2).j = f5;
                                            n4 = ((AA3$e)object2).c;
                                            n18 = (int)(dt3.f((XmlPullParser)object, string10) ? 1 : 0);
                                            if (n18 != 0) {
                                                n18 = 13;
                                                f6 = 1.8E-44f;
                                                n4 = typedArray.getInt(n18, n4);
                                            }
                                            ((AA3$e)object2).c = n4;
                                        }
                                        typedArray.recycle();
                                        ((ArrayList)object7).add((Object)object2);
                                        String string13 = ((AA3$e)object2).getPathName();
                                        if (string13 != null) {
                                            String string14 = ((AA3$e)object2).getPathName();
                                            ((a53)object3).put(string14, object2);
                                        }
                                        n18 = aA3$g3.a;
                                        aA3$g3.a = n3 = ((AA3$e)object2).d | n18;
                                        n4 = 0;
                                        f5 = 0.0f;
                                        Object var28_78 = null;
                                        n14 = 5;
                                        n15 = 1;
                                        n17 = 0;
                                        break block72;
                                    }
                                    n19 = n7;
                                    n7 = 8;
                                    object2 = "clip-path";
                                    n3 = (int)(((String)object2).equals(string8) ? 1 : 0);
                                    if (n3 == 0) break block73;
                                    object2 = new AA3$a();
                                    n4 = (int)(dt3.f((XmlPullParser)object, string9) ? 1 : 0);
                                    if (n4 != 0) {
                                        int[] nArray = Pi.d;
                                        TypedArray typedArray = dt3.g(resources2, theme2, attributeSet2, nArray);
                                        n14 = 0;
                                        Object var30_95 = null;
                                        string7 = typedArray.getString(0);
                                        if (string7 != null) {
                                            ((AA3$e)object2).b = string7;
                                        }
                                        if ((string7 = typedArray.getString(n14 = 1)) != null) {
                                            rn2$a[] rn2$aArray = rn2.c(string7);
                                            ((AA3$e)object2).a = rn2$aArray;
                                        }
                                        if ((n18 = (int)(dt3.f((XmlPullParser)object, string10) ? 1 : 0)) == 0) {
                                            n15 = 0;
                                            string7 = null;
                                        } else {
                                            n18 = 2;
                                            f6 = 2.8E-45f;
                                            n14 = 0;
                                            Object var30_98 = null;
                                            n15 = typedArray.getInt(n18, 0);
                                        }
                                        ((AA3$e)object2).c = n15;
                                        typedArray.recycle();
                                    }
                                    ((ArrayList)object7).add(object2);
                                    String string15 = ((AA3$e)object2).getPathName();
                                    if (string15 != null) {
                                        String string16 = ((AA3$e)object2).getPathName();
                                        ((a53)object3).put(string16, object2);
                                    }
                                    n18 = aA3$g3.a;
                                    aA3$g3.a = n3 = ((AA3$e)object2).d | n18;
                                    break block74;
                                }
                                n3 = (int)(string7.equals(string8) ? 1 : 0);
                                if (n3 == 0) break block74;
                                object2 = new AA3$c();
                                int[] nArray = Pi.b;
                                TypedArray typedArray = dt3.g(resources2, theme2, attributeSet2, nArray);
                                f5 = ((AA3$c)object2).c;
                                String string17 = "rotation";
                                n14 = (int)(dt3.f((XmlPullParser)object, string17) ? 1 : 0);
                                if (n14 == 0) {
                                    n14 = 5;
                                } else {
                                    n14 = 5;
                                    f5 = typedArray.getFloat(n14, f5);
                                }
                                ((AA3$c)object2).c = f5;
                                f5 = ((AA3$c)object2).d;
                                n15 = 1;
                                ((AA3$c)object2).d = f5 = typedArray.getFloat(n15, f5);
                                f5 = ((AA3$c)object2).e;
                                ((AA3$c)object2).e = f5 = typedArray.getFloat(2, f5);
                                f5 = ((AA3$c)object2).f;
                                string6 = "scaleX";
                                n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                if (n7 != 0) {
                                    n7 = 3;
                                    f5 = typedArray.getFloat(n7, f5);
                                }
                                ((AA3$c)object2).f = f5;
                                f5 = ((AA3$c)object2).g;
                                string6 = "scaleY";
                                n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                if (n7 == 0) {
                                    n7 = 4;
                                } else {
                                    n7 = 4;
                                    f5 = typedArray.getFloat(n7, f5);
                                }
                                ((AA3$c)object2).g = f5;
                                f5 = ((AA3$c)object2).h;
                                string6 = "translateX";
                                n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                if (n7 == 0) {
                                    n7 = 6;
                                } else {
                                    n7 = 6;
                                    f5 = typedArray.getFloat(n7, f5);
                                }
                                ((AA3$c)object2).h = f5;
                                f5 = ((AA3$c)object2).i;
                                string6 = "translateY";
                                n7 = (int)(dt3.f((XmlPullParser)object, string6) ? 1 : 0);
                                if (n7 == 0) {
                                    n7 = 7;
                                } else {
                                    n7 = 7;
                                    f5 = typedArray.getFloat(n7, f5);
                                }
                                ((AA3$c)object2).i = f5;
                                n4 = 0;
                                f5 = 0.0f;
                                Object var28_84 = null;
                                string6 = typedArray.getString(0);
                                if (string6 != null) {
                                    ((AA3$c)object2).l = string6;
                                }
                                ((AA3$c)object2).c();
                                typedArray.recycle();
                                ((ArrayList)object7).add(object2);
                                ((ArrayDeque)object4).push(object2);
                                String string18 = ((AA3$c)object2).getGroupName();
                                if (string18 != null) {
                                    String string19 = ((AA3$c)object2).getGroupName();
                                    ((a53)object3).put(string19, object2);
                                }
                                n18 = aA3$g3.a;
                                aA3$g3.a = n3 = ((AA3$c)object2).k | n18;
                                break block72;
                            }
                            var35_107 = var28_63;
                            n19 = n7;
                        }
                        n4 = 0;
                        f5 = 0.0f;
                        Object var28_83 = null;
                        n14 = 5;
                        n15 = 1;
                    }
                    n3 = 3;
                    n18 = 5;
                    f6 = 7.0E-45f;
                    n8 = 1;
                    f8 = Float.MIN_VALUE;
                    break block75;
                }
                var35_107 = var28_63;
                n19 = n7;
                n3 = 3;
                n18 = 5;
                f6 = 7.0E-45f;
                n8 = 1;
                f8 = Float.MIN_VALUE;
                n4 = 0;
                f5 = 0.0f;
                Object var28_86 = null;
                if (n14 == n3 && (n7 = (int)(string7.equals(string6 = xmlPullParser.getName()) ? 1 : 0)) != 0) {
                    ((ArrayDeque)object4).pop();
                }
            }
            n14 = xmlPullParser.next();
            void var28_88 = var35_107;
            n7 = n19;
            n3 = 1;
            n18 = 0;
            f6 = 0.0f;
            Object var12_41 = null;
            n8 = 2;
            f8 = 2.8E-45f;
            n10 = 3;
            n15 = 8;
        }
        if (n17 == 0) {
            PorterDuffColorFilter porterDuffColorFilter;
            ColorStateList colorStateList = aA3$g.c;
            object = aA3$g.d;
            aa3_12.c = porterDuffColorFilter = aa3_12.b(colorStateList, (PorterDuff.Mode)object);
            return;
        }
        XmlPullParserException xmlPullParserException = new XmlPullParserException("no path defined");
        throw xmlPullParserException;
    }

    public final void invalidateSelf() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.isAutoMirrored();
        }
        return this.b.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isStateful() {
        Boolean bl2;
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.isStateful();
        }
        boolean bl3 = super.isStateful();
        if (bl3) return true;
        AA3$g aA3$g = this.b;
        if (aA3$g == null) return false;
        AA3$f aA3$f = aA3$g.b;
        Boolean bl4 = aA3$f.n;
        if (bl4 == null) {
            boolean bl5 = aA3$f.g.a();
            aA3$f.n = bl4 = Boolean.valueOf(bl5);
        }
        if (bl3 = (bl2 = aA3$f.n).booleanValue()) return true;
        ColorStateList colorStateList = this.b.c;
        if (colorStateList == null) return false;
        bl3 = colorStateList.isStateful();
        if (!bl3) return false;
        return true;
    }

    public final Drawable mutate() {
        Object object = this.a;
        if (object != null) {
            object.mutate();
            return this;
        }
        boolean bl2 = this.e;
        if (!bl2 && (object = super.mutate()) == this) {
            Object object2;
            AA3$g aA3$g = this.b;
            object = new Drawable.ConstantState();
            int n3 = 0;
            object.c = null;
            object.d = object2 = j;
            if (aA3$g != null) {
                boolean bl3;
                Paint paint;
                object.a = n3 = aA3$g.a;
                AA3$f aA3$f = aA3$g.b;
                object2 = new AA3$f(aA3$f);
                object.b = object2;
                aA3$f = aA3$g.b.e;
                if (aA3$f != null) {
                    paint = aA3$g.b.e;
                    aA3$f = new Paint(paint);
                    object2.e = aA3$f;
                }
                if ((object2 = aA3$g.b.d) != null) {
                    object2 = object.b;
                    paint = aA3$g.b.d;
                    aA3$f = new Paint(paint);
                    object2.d = aA3$f;
                }
                object2 = aA3$g.c;
                object.c = object2;
                object.d = object2 = aA3$g.d;
                object.e = bl3 = aA3$g.e;
            }
            this.b = object;
            this.e = bl2 = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onStateChange(int[] nArray) {
        boolean bl2;
        boolean bl3;
        Object object;
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setState(nArray);
        }
        AA3$g aA3$g = this.b;
        ColorStateList colorStateList = aA3$g.c;
        boolean bl4 = true;
        if (colorStateList != null && (object = aA3$g.d) != null) {
            colorStateList = this.b(colorStateList, (PorterDuff.Mode)object);
            this.c = colorStateList;
            this.invalidateSelf();
            bl3 = true;
        } else {
            bl3 = false;
            colorStateList = null;
        }
        object = aA3$g.b;
        Boolean bl5 = ((AA3$f)object).n;
        if (bl5 == null) {
            boolean bl6 = ((AA3$f)object).g.a();
            ((AA3$f)object).n = bl5 = Boolean.valueOf(bl6);
        }
        if (!(bl2 = ((Boolean)(object = ((AA3$f)object).n)).booleanValue())) return bl3;
        object = aA3$g.b.g;
        boolean bl7 = ((AA3$c)object).b(nArray);
        aA3$g.k = bl2 = aA3$g.k | bl7;
        if (!bl7) return bl3;
        this.invalidateSelf();
        return bl4;
    }

    public final void scheduleSelf(Runnable runnable2, long l2) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.scheduleSelf(runnable2, l2);
            return;
        }
        super.scheduleSelf(runnable2, l2);
    }

    public final void setAlpha(int n3) {
        Object object = this.a;
        if (object != null) {
            object.setAlpha(n3);
            return;
        }
        object = this.b.b;
        int n4 = ((AA3$f)object).getRootAlpha();
        if (n4 != n3) {
            object = this.b.b;
            ((AA3$f)object).setRootAlpha(n3);
            this.invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean bl2) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(bl2);
            return;
        }
        this.b.e = bl2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        this.invalidateSelf();
    }

    public final void setTint(int n3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            ut0_0.d(drawable2, n3);
            return;
        }
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setTintList(colorStateList);
    }

    public final void setTintList(ColorStateList colorStateList) {
        Object object = this.a;
        if (object != null) {
            object.setTintList(colorStateList);
            return;
        }
        object = this.b;
        ColorStateList colorStateList2 = object.c;
        if (colorStateList2 != colorStateList) {
            object.c = colorStateList;
            object = object.d;
            colorStateList = this.b(colorStateList, (PorterDuff.Mode)object);
            this.c = colorStateList;
            this.invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Object object = this.a;
        if (object != null) {
            object.setTintMode(mode);
            return;
        }
        object = this.b;
        PorterDuff.Mode mode2 = object.d;
        if (mode2 != mode) {
            object.d = mode;
            object = object.c;
            mode = this.b((ColorStateList)object, mode);
            this.c = mode;
            this.invalidateSelf();
        }
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setVisible(bl2, bl3);
        }
        return super.setVisible(bl2, bl3);
    }

    public final void unscheduleSelf(Runnable runnable2) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.unscheduleSelf(runnable2);
            return;
        }
        super.unscheduleSelf(runnable2);
    }
}

