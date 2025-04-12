/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.View
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a$a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public final class a {
    public boolean a = false;
    public String b;
    public a$a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public a(a object, Object object2) {
        String string2;
        this.b = string2 = object.b;
        object = object.c;
        this.c = object;
        this.f(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void d(Context object, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        void var7_8;
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        int[] nArray = R$styleable.CustomAttribute;
        xmlResourceParser = object.obtainStyledAttributes((AttributeSet)xmlResourceParser, nArray);
        int n3 = xmlResourceParser.getIndexCount();
        String string2 = null;
        boolean bl2 = false;
        Object var7_7 = null;
        int n4 = 0;
        Object var9_21 = null;
        float f5 = 0.0f;
        boolean bl3 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            void var7_11;
            void var9_25;
            StringBuilder stringBuilder;
            int n7 = xmlResourceParser.getIndex(i3);
            int n8 = R$styleable.CustomAttribute_attributeName;
            int n10 = 1;
            if (n7 == n8) {
                string2 = xmlResourceParser.getString(n7);
                if (string2 == null || (n7 = string2.length()) <= 0) continue;
                stringBuilder = new StringBuilder();
                n8 = Character.toUpperCase(string2.charAt(0));
                stringBuilder.append((char)n8);
                string2 = string2.substring(n10);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                continue;
            }
            n8 = R$styleable.CustomAttribute_methodName;
            if (n7 == n8) {
                string2 = xmlResourceParser.getString(n7);
                bl3 = true;
                continue;
            }
            n8 = R$styleable.CustomAttribute_customBoolean;
            if (n7 == n8) {
                bl2 = xmlResourceParser.getBoolean(n7, false);
                Boolean bl4 = bl2;
                a$a a$a = a$a.BOOLEAN_TYPE;
                continue;
            }
            n8 = R$styleable.CustomAttribute_customColorValue;
            if (n7 == n8) {
                a$a a$a = a$a.COLOR_TYPE;
                n4 = xmlResourceParser.getColor(n7, 0);
                Integer n14 = n4;
            } else {
                n8 = R$styleable.CustomAttribute_customColorDrawableValue;
                if (n7 == n8) {
                    a$a a$a = a$a.COLOR_DRAWABLE_TYPE;
                    n4 = xmlResourceParser.getColor(n7, 0);
                    Integer n15 = n4;
                } else {
                    n8 = R$styleable.CustomAttribute_customPixelDimension;
                    if (n7 == n8) {
                        a$a a$a = a$a.DIMENSION_TYPE;
                        f5 = xmlResourceParser.getDimension(n7, 0.0f);
                        stringBuilder = object.getResources().getDisplayMetrics();
                        f5 = TypedValue.applyDimension((int)n10, (float)f5, (DisplayMetrics)stringBuilder);
                        Float f6 = Float.valueOf(f5);
                    } else {
                        n8 = R$styleable.CustomAttribute_customDimension;
                        if (n7 == n8) {
                            a$a a$a = a$a.DIMENSION_TYPE;
                            f5 = xmlResourceParser.getDimension(n7, 0.0f);
                            Float f7 = Float.valueOf(f5);
                        } else {
                            n8 = R$styleable.CustomAttribute_customFloatValue;
                            if (n7 == n8) {
                                a$a a$a = a$a.FLOAT_TYPE;
                                n4 = 2143289344;
                                f5 = xmlResourceParser.getFloat(n7, 0.0f / 0.0f);
                                Float f8 = Float.valueOf(f5);
                            } else {
                                n8 = R$styleable.CustomAttribute_customIntegerValue;
                                n10 = -1;
                                if (n7 == n8) {
                                    a$a a$a = a$a.INT_TYPE;
                                    n4 = xmlResourceParser.getInteger(n7, n10);
                                    Integer n16 = n4;
                                } else {
                                    n8 = R$styleable.CustomAttribute_customStringValue;
                                    if (n7 == n8) {
                                        a$a a$a = a$a.STRING_TYPE;
                                        String string3 = xmlResourceParser.getString(n7);
                                    } else {
                                        n8 = R$styleable.CustomAttribute_customReference;
                                        if (n7 != n8) continue;
                                        a$a a$a = a$a.REFERENCE_TYPE;
                                        n4 = xmlResourceParser.getResourceId(n7, n10);
                                        if (n4 == n10) {
                                            n4 = xmlResourceParser.getInt(n7, n10);
                                        }
                                        Integer n17 = n4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            void var17_41 = var9_25;
            void var9_26 = var7_11;
            void var7_12 = var17_41;
        }
        if (string2 != null && var7_8 != null) {
            void var9_22;
            object = new Object();
            ((a)object).b = string2;
            ((a)object).c = var9_22;
            ((a)object).a = bl3;
            ((a)object).f(var7_8);
            hashMap.put(string2, object);
        }
        xmlResourceParser.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(View view, HashMap hashMap) {
        int n3 = 1;
        Class<?> clazz = view.getClass();
        Iterator iterator = hashMap.keySet().iterator();
        boolean bl2;
        block14: while (bl2 = iterator.hasNext()) {
            int n4;
            Class<Object> clazz2;
            Object object;
            Object object2 = (String)iterator.next();
            Object[] objectArray = (a)hashMap.get(object2);
            int n7 = objectArray.a;
            if (n7 == 0) {
                object = "set";
                object2 = kp1_0.c((String)object, (String)object2);
            }
            object = objectArray.c;
            n7 = ((Enum)object).ordinal();
            switch (n7) {
                default: {
                    continue block14;
                }
                case 7: {
                    object = new Class[n3];
                    object[0] = clazz2 = Integer.TYPE;
                    object2 = clazz.getMethod((String)object2, (Class<?>)object);
                    n4 = objectArray.d;
                    objectArray = n4;
                    object = new Object[n3];
                    object[0] = objectArray;
                    ((Method)object2).invoke((Object)view, (Object[])object);
                }
                case 6: {
                    float f5;
                    try {
                        object = new Class[n3];
                        object[0] = clazz2 = Float.TYPE;
                        object2 = clazz.getMethod((String)object2, (Class<?>)object);
                        f5 = objectArray.e;
                        objectArray = Float.valueOf(f5);
                        object = new Object[n3];
                        object[0] = objectArray;
                        ((Method)object2).invoke((Object)view, (Object[])object);
                    }
                    catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
                    continue block14;
                }
                case 5: {
                    object = new Class[n3];
                    object[0] = clazz2 = Boolean.TYPE;
                    object2 = clazz.getMethod((String)object2, (Class<?>)object);
                    n4 = objectArray.g;
                    objectArray = n4 != 0;
                    object = new Object[n3];
                    object[0] = objectArray;
                    ((Method)object2).invoke((Object)view, (Object[])object);
                    continue block14;
                }
                case 4: {
                    object = new Class[n3];
                    object[0] = clazz2 = CharSequence.class;
                    object2 = clazz.getMethod((String)object2, (Class<?>)object);
                    objectArray = objectArray.f;
                    object = new Object[n3];
                    object[0] = objectArray;
                    ((Method)object2).invoke((Object)view, (Object[])object);
                    continue block14;
                }
                case 3: {
                    object = new Class[n3];
                    object[0] = clazz2 = Drawable.class;
                    object2 = clazz.getMethod((String)object2, (Class<?>)object);
                    object = new ColorDrawable();
                    n4 = objectArray.h;
                    object.setColor(n4);
                    objectArray = new Object[n3];
                    objectArray[0] = object;
                    ((Method)object2).invoke((Object)view, objectArray);
                    continue block14;
                }
                case 2: {
                    object = new Class[n3];
                    object[0] = clazz2 = Integer.TYPE;
                    object2 = clazz.getMethod((String)object2, (Class<?>)object);
                    n4 = objectArray.h;
                    objectArray = n4;
                    object = new Object[n3];
                    object[0] = objectArray;
                    ((Method)object2).invoke((Object)view, (Object[])object);
                    continue block14;
                }
                case 1: {
                    object = new Class[n3];
                    object[0] = clazz2 = Float.TYPE;
                    object2 = clazz.getMethod((String)object2, (Class<?>)object);
                    float f5 = objectArray.e;
                    objectArray = Float.valueOf(f5);
                    object = new Object[n3];
                    object[0] = objectArray;
                    ((Method)object2).invoke((Object)view, (Object[])object);
                    continue block14;
                }
                case 0: 
            }
            object = new Class[n3];
            object[0] = clazz2 = Integer.TYPE;
            object2 = clazz.getMethod((String)object2, (Class<?>)object);
            n4 = objectArray.d;
            objectArray = n4;
            object = new Object[n3];
            object[0] = objectArray;
            ((Method)object2).invoke((Object)view, (Object[])object);
        }
        return;
    }

    public final float a() {
        Object object = this.c;
        int n3 = object.ordinal();
        switch (n3) {
            default: {
                return 0.0f / 0.0f;
            }
            case 5: {
                float f5;
                n3 = (int)(this.g ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1065353216;
                    f5 = 1.0f;
                } else {
                    n3 = 0;
                    f5 = 0.0f;
                    object = null;
                }
                return f5;
            }
            case 4: {
                object = new RuntimeException("Cannot interpolate String");
                throw object;
            }
            case 2: 
            case 3: {
                object = new RuntimeException("Color does not have a single color to interpolate");
                throw object;
            }
            case 1: 
            case 6: {
                return this.e;
            }
            case 0: 
        }
        return this.d;
    }

    public final void b(float[] object) {
        a$a a$a = this.c;
        int n3 = a$a.ordinal();
        int n4 = 0;
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                float f5;
                object[0] = f5 = this.e;
                break;
            }
            case 5: {
                float f6;
                n3 = (int)(this.g ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1065353216;
                    f6 = 1.0f;
                } else {
                    n3 = 0;
                    f6 = 0.0f;
                    a$a = null;
                }
                object[0] = f6;
                break;
            }
            case 4: {
                object = new RuntimeException;
                object("Color does not have a single color to interpolate");
                throw object;
            }
            case 2: 
            case 3: {
                n3 = this.h;
                int n7 = n3 >> 24 & 0xFF;
                int n8 = n3 >> 16 & 0xFF;
                int n10 = n3 >> 8 & 0xFF;
                n3 &= 0xFF;
                float f7 = n8;
                float f8 = 255.0f;
                double d2 = f7 / f8;
                double d5 = 2.2;
                f7 = (float)Math.pow(d2, d5);
                float f11 = (float)Math.pow((float)n10 / f8, d5);
                d2 = Math.pow((float)n3 / f8, d5);
                float f12 = (float)d2;
                object[0] = f7;
                object[1] = f11;
                object[2] = f12;
                f12 = (float)n7 / f8;
                n4 = 3;
                object[n4] = f12;
                break;
            }
            case 1: {
                float f14;
                object[0] = f14 = this.e;
                break;
            }
            case 0: {
                float f15;
                n3 = this.d;
                object[0] = f15 = (float)n3;
            }
        }
    }

    public final int c() {
        int n3;
        a$a a$a = this.c;
        int n4 = a$a.ordinal();
        if (n4 != (n3 = 2) && n4 != (n3 = 3)) {
            return 1;
        }
        return 4;
    }

    public final void f(Object object) {
        a$a a$a = this.c;
        int n3 = a$a.ordinal();
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                float f5;
                object = (Float)object;
                this.e = f5 = ((Float)object).floatValue();
                break;
            }
            case 5: {
                boolean bl2;
                object = (Boolean)object;
                this.g = bl2 = ((Boolean)object).booleanValue();
                break;
            }
            case 4: {
                this.f = object = (String)object;
                break;
            }
            case 2: 
            case 3: {
                int n4;
                object = (Integer)object;
                this.h = n4 = ((Integer)object).intValue();
                break;
            }
            case 1: {
                float f6;
                object = (Float)object;
                this.e = f6 = ((Float)object).floatValue();
                break;
            }
            case 0: 
            case 7: {
                int n7;
                object = (Integer)object;
                this.d = n7 = ((Integer)object).intValue();
            }
        }
    }
}

