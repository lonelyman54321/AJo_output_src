/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.LinearGradient
 *  android.graphics.RadialGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.SweepGradient
 *  android.util.AttributeSet
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.R$styleable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class O00 {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public O00(Shader shader, ColorStateList colorStateList, int n3) {
        this.a = shader;
        this.b = colorStateList;
        this.c = n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static O00 a(int n3, Resources.Theme theme, Resources resources) {
        void var3_15;
        int n4;
        void var3_14;
        int n7;
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        boolean bl2;
        float f14;
        int n8;
        String string2;
        ArrayList<Integer> arrayList;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int n10;
        Object object;
        int n14;
        int n15;
        int n16;
        int n17;
        XmlResourceParser xmlResourceParser;
        Object object2;
        Object object3;
        block41: {
            block40: {
                int n18;
                String string3;
                int n19;
                int n20;
                Resources.Theme theme2 = theme;
                object3 = resources;
                object2 = "gradient";
                xmlResourceParser = resources.getXml(n3);
                AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
                do {
                    n20 = xmlResourceParser.next();
                    n17 = 2;
                    n16 = 1;
                } while (n20 != n17 && n20 != n16);
                if (n20 != n17) {
                    XmlPullParserException xmlPullParserException = new XmlPullParserException("No start tag found");
                    throw xmlPullParserException;
                }
                Object object4 = xmlResourceParser.getName();
                object4.getClass();
                n15 = 0;
                String string4 = null;
                int n21 = ((String)object4).equals(object2);
                if (n21 == 0) {
                    object2 = "selector";
                    int n22 = ((String)object4).equals(object2);
                    if (n22 != 0) {
                        ColorStateList colorStateList = fZ.b((Resources)object3, xmlResourceParser, attributeSet, theme2);
                        n22 = colorStateList.getDefaultColor();
                        return new O00(null, colorStateList, n22);
                    }
                    object3 = new StringBuilder();
                    object2 = xmlResourceParser.getPositionDescription();
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(": unsupported complex color tag ");
                    ((StringBuilder)object3).append((String)object4);
                    object3 = ((StringBuilder)object3).toString();
                    XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                    throw xmlPullParserException;
                }
                object4 = xmlResourceParser.getName();
                n14 = ((String)object4).equals(object2);
                if (n14 == 0) {
                    object3 = new StringBuilder();
                    object2 = xmlResourceParser.getPositionDescription();
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(": invalid gradient color tag ");
                    ((StringBuilder)object3).append((String)object4);
                    object3 = ((StringBuilder)object3).toString();
                    XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                    throw xmlPullParserException;
                }
                object2 = R$styleable.GradientColor;
                object2 = dt3.g((Resources)object3, theme2, attributeSet, (int[])object2);
                n20 = R$styleable.GradientColor_android_startX;
                object = "startX";
                n21 = dt3.f((XmlPullParser)xmlResourceParser, (String)object);
                n10 = 0;
                f18 = n21 == 0 ? 0.0f : (f19 = object2.getFloat(n20, 0.0f));
                n20 = R$styleable.GradientColor_android_startY;
                object = "startY";
                n21 = dt3.f((XmlPullParser)xmlResourceParser, (String)object);
                if (n21 == 0) {
                    n19 = 0;
                    f17 = 0.0f;
                    string3 = null;
                } else {
                    f17 = f19 = object2.getFloat(n20, 0.0f);
                }
                n20 = R$styleable.GradientColor_android_endX;
                object = "endX";
                n21 = dt3.f((XmlPullParser)xmlResourceParser, (String)object);
                if (n21 == 0) {
                    n18 = 0;
                    f16 = 0.0f;
                } else {
                    f16 = f19 = object2.getFloat(n20, 0.0f);
                }
                n20 = R$styleable.GradientColor_android_endY;
                object = "endY";
                n21 = dt3.f((XmlPullParser)xmlResourceParser, (String)object);
                if (n21 == 0) {
                    f15 = 0.0f;
                    arrayList = null;
                } else {
                    f15 = f19 = object2.getFloat(n20, 0.0f);
                }
                n20 = R$styleable.GradientColor_android_centerX;
                object = "centerX";
                n21 = dt3.f((XmlPullParser)xmlResourceParser, (String)object);
                if (n21 == 0) {
                    n20 = 0;
                    f19 = 0.0f;
                    object4 = null;
                } else {
                    f19 = object2.getFloat(n20, 0.0f);
                }
                n21 = R$styleable.GradientColor_android_centerY;
                string2 = "centerY";
                n8 = dt3.f((XmlPullParser)xmlResourceParser, string2);
                if (n8 == 0) {
                    n21 = 0;
                    f14 = 0.0f;
                    object = null;
                } else {
                    f14 = object2.getFloat(n21, 0.0f);
                }
                n8 = R$styleable.GradientColor_android_type;
                string4 = "type";
                n15 = dt3.f((XmlPullParser)xmlResourceParser, string4);
                n17 = 0;
                String string5 = null;
                if (n15 == 0) {
                    n15 = 0;
                    string4 = null;
                } else {
                    n15 = object2.getInt(n8, 0);
                }
                n8 = R$styleable.GradientColor_android_startColor;
                String string6 = "startColor";
                n16 = dt3.f((XmlPullParser)xmlResourceParser, string6) ? 1 : 0;
                if (n16 == 0) {
                    n16 = 0;
                    string6 = null;
                } else {
                    n16 = object2.getColor(n8, 0);
                }
                string2 = "centerColor";
                bl2 = dt3.f((XmlPullParser)xmlResourceParser, string2);
                n10 = R$styleable.GradientColor_android_centerColor;
                n8 = dt3.f((XmlPullParser)xmlResourceParser, string2) ? 1 : 0;
                n10 = n8 == 0 ? 0 : object2.getColor(n10, 0);
                n8 = R$styleable.GradientColor_android_endColor;
                string5 = "endColor";
                n17 = dt3.f((XmlPullParser)xmlResourceParser, string5) ? 1 : 0;
                if (n17 == 0) {
                    n8 = 0;
                    string2 = null;
                } else {
                    int n24;
                    n17 = 0;
                    string5 = null;
                    n8 = n24 = object2.getColor(n8, 0);
                }
                n17 = R$styleable.GradientColor_android_tileMode;
                f12 = f19;
                object4 = "tileMode";
                n20 = dt3.f((XmlPullParser)xmlResourceParser, (String)object4) ? 1 : 0;
                if (n20 == 0) {
                    n17 = 0;
                    string5 = null;
                } else {
                    n20 = 0;
                    f19 = 0.0f;
                    object4 = null;
                    n17 = object2.getInt(n17, 0);
                }
                n20 = R$styleable.GradientColor_android_gradientRadius;
                f11 = f14;
                object = "gradientRadius";
                n21 = dt3.f((XmlPullParser)xmlResourceParser, (String)object) ? 1 : 0;
                if (n21 == 0) {
                    n20 = 0;
                    f19 = 0.0f;
                    object4 = null;
                } else {
                    n21 = 0;
                    f14 = 0.0f;
                    object = null;
                    f19 = object2.getFloat(n20, 0.0f);
                }
                object2.recycle();
                n14 = xmlResourceParser.getDepth();
                n21 = 1;
                f14 = Float.MIN_VALUE;
                n14 += n21;
                f8 = f19;
                n20 = 20;
                f19 = 2.8E-44f;
                object = new Object(n20);
                f7 = f15;
                arrayList = new ArrayList<Integer>(n20);
                while (true) {
                    block42: {
                        block43: {
                            void var3_6;
                            n20 = xmlResourceParser.next();
                            f6 = f16;
                            n18 = 1;
                            f16 = Float.MIN_VALUE;
                            if (n20 == n18) break block40;
                            n18 = xmlResourceParser.getDepth();
                            f5 = f17;
                            if (n18 < n14) {
                                n19 = 3;
                                f17 = 4.2E-45f;
                                if (n20 == n19) break block41;
                            }
                            n19 = 2;
                            f17 = 2.8E-45f;
                            if (n20 != n19) break block42;
                            if (n18 > n14) break block43;
                            object4 = xmlResourceParser.getName();
                            n20 = ((String)object4).equals(string3 = "item") ? 1 : 0;
                            if (n20 == 0) break block42;
                            object4 = R$styleable.GradientColorItem;
                            object4 = dt3.g((Resources)object3, (Resources.Theme)var3_6, attributeSet, (int[])object4);
                            n19 = R$styleable.GradientColorItem_android_color;
                            n19 = object4.hasValue(n19) ? 1 : 0;
                            n18 = R$styleable.GradientColorItem_android_offset;
                            n18 = object4.hasValue(n18) ? 1 : 0;
                            if (n19 == 0 || n18 == 0) break;
                            n19 = R$styleable.GradientColorItem_android_color;
                            n19 = object4.getColor(n19, 0);
                            n18 = R$styleable.GradientColorItem_android_offset;
                            n7 = 0;
                            f16 = object4.getFloat(n18, 0.0f);
                            object4.recycle();
                            Integer n25 = n19;
                            arrayList.add(n25);
                            Float f20 = Float.valueOf(f16);
                            ((ArrayList)object).add(f20);
                        }
                        Resources.Theme theme3 = theme;
                    }
                    f16 = f6;
                    f17 = f5;
                }
                object3 = new StringBuilder();
                object2 = xmlResourceParser.getPositionDescription();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                object3 = ((StringBuilder)object3).toString();
                XmlPullParserException xmlPullParserException = new XmlPullParserException((String)object3);
                throw xmlPullParserException;
            }
            f5 = f17;
        }
        if ((n7 = arrayList.size()) > 0) {
            C01 c01 = new C01(arrayList, (ArrayList)object);
        } else {
            n7 = 0;
            Object var3_13 = null;
        }
        if (var3_14 == null) {
            if (bl2) {
                C01 c01 = new C01(n16, n10, n8);
            } else {
                C01 c01 = new C01(n16, n8);
            }
        }
        if (n15 != (n4 = 1)) {
            n14 = 2;
            if (n15 != n14) {
                object3 = n17 != n4 ? (n17 != n14 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR) : Shader.TileMode.REPEAT;
                Object object5 = object3;
                object3 = var3_15.a;
                float[] fArray = var3_15.b;
                string2 = xmlResourceParser;
                f17 = f5;
                f16 = f6;
                f15 = f7;
                xmlResourceParser = new LinearGradient(f18, f5, f6, f7, (int[])object3, fArray, (Shader.TileMode)object5);
                return new O00((Shader)xmlResourceParser, null, 0);
            } else {
                object3 = var3_15.a;
                float[] fArray = var3_15.b;
                f19 = f12;
                f14 = f11;
                xmlResourceParser = new SweepGradient(f12, f11, (int[])object3, fArray);
            }
            return new O00((Shader)xmlResourceParser, null, 0);
        }
        f19 = f12;
        f14 = f11;
        object3 = null;
        float f22 = f8 - 0.0f;
        n4 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
        if (n4 <= 0) {
            XmlPullParserException xmlPullParserException = new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            throw xmlPullParserException;
        }
        n4 = 1;
        object3 = n17 != n4 ? (n17 != (n4 = 2) ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR) : Shader.TileMode.REPEAT;
        object2 = var3_15.a;
        float[] fArray = var3_15.b;
        xmlResourceParser = new RadialGradient(f19, f14, f8, (int[])object2, fArray, (Shader.TileMode)object3);
        return new O00((Shader)xmlResourceParser, null, 0);
    }

    public final boolean b() {
        boolean bl2;
        Shader shader = this.a;
        if (shader == null && (shader = this.b) != null && (bl2 = shader.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            shader = null;
        }
        return bl2;
    }
}

