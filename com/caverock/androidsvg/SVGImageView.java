/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Picture
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.PictureDrawable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 */
package com.caverock.androidsvg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.caverock.androidsvg.R$styleable;
import com.caverock.androidsvg.SVGImageView$a;
import com.caverock.androidsvg.SVGImageView$b;
import com.caverock.androidsvg.SVGParseException;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class SVGImageView
extends ImageView {
    public static final Method c;
    public rR2 a = null;
    public final pj2_0 b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        Class[] classArray;
        Object object = View.class;
        String string2 = "setLayerType";
        int n3 = 2;
        try {
            classArray = new Class[n3];
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return;
        }
        Class<Integer> clazz = Integer.TYPE;
        int n4 = 0;
        classArray[0] = clazz;
        clazz = Paint.class;
        n4 = 1;
        classArray[n4] = clazz;
        object = ((Class)object).getMethod(string2, classArray);
        c = object;
    }

    public SVGImageView(Context object) {
        super(object);
        super();
        this.b = object;
    }

    public SVGImageView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet, 0);
        super();
        this.b = object;
        this.b(attributeSet, 0);
    }

    public SVGImageView(Context object, AttributeSet attributeSet, int n3) {
        super(object, attributeSet, n3);
        super();
        this.b = object;
        this.b(attributeSet, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void setFromString(String object) {
        uR2 uR22;
        try {
            uR22 = new uR2();
        }
        catch (SVGParseException sVGParseException) {
            return;
        }
        object = ((String)object).getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        object = uR22.f(byteArrayInputStream);
        this.a = object;
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        float f5;
        rR2$p rR2$p;
        int n3;
        int n4;
        float f6;
        float f7;
        rR2$b rR2$b;
        Object object;
        rR2 rR22 = this.a;
        if (rR22 == null) {
            return;
        }
        Object object2 = this.b;
        if (object2 == null || (object = ((pj2_0)object2).c) == null) {
            object = rR22.a.p;
        }
        if (object2 != null && (rR2$b = ((pj2_0)object2).e) != null) {
            f7 = rR2$b.a();
            rR2$b rR2$b2 = ((pj2_0)object2).e;
            f6 = rR2$b2.b();
            double d2 = Math.ceil(f7);
            n4 = (int)d2;
            double d5 = Math.ceil(f6);
            n3 = (int)d5;
            rR22 = rR22.c(n4, n3, (pj2_0)object2);
        } else {
            rR2$d0 rR2$d0;
            rR2$p rR2$p2;
            rR2$d0 rR2$d02;
            rR2$d0 rR2$d03;
            rr2$f_0 rr2$f_0 = rR22.a;
            rR2$p = rr2$f_0.s;
            float f8 = rR22.b;
            if (rR2$p != null && (rR2$d03 = rR2$p.b) != (rR2$d02 = rR2$d0.percent) && (rR2$p2 = rr2$f_0.t) != null && (rR2$d0 = rR2$p2.b) != rR2$d02) {
                f7 = rR2$p.b(f8);
                rR2$p rR2$p3 = rR22.a.t;
                f6 = rR2$p3.b(f8);
                double d7 = Math.ceil(f7);
                n4 = (int)d7;
                double d9 = Math.ceil(f6);
                n3 = (int)d9;
                rR22 = rR22.c(n4, n3, (pj2_0)object2);
            } else if (rR2$p != null && object != null) {
                f6 = rR2$p.b(f8);
                f5 = ((rR2$b)object).d * f6;
                f7 = ((rR2$b)object).c;
                double d12 = Math.ceil(f6);
                n4 = (int)d12;
                double d13 = Math.ceil(f5 /= f7);
                n3 = (int)d13;
                rR22 = rR22.c(n4, n3, (pj2_0)object2);
            } else {
                rR2$p rR2$p4 = rr2$f_0.t;
                if (rR2$p4 != null && object != null) {
                    f6 = rR2$p4.b(f8);
                    f5 = ((rR2$b)object).c * f6;
                    f7 = ((rR2$b)object).d;
                    double d14 = Math.ceil(f5 /= f7);
                    n4 = (int)d14;
                    double d15 = Math.ceil(f6);
                    n3 = (int)d15;
                    rR22 = rR22.c(n4, n3, (pj2_0)object2);
                } else {
                    n4 = 512;
                    f7 = 7.17E-43f;
                    rR22 = rR22.c(n4, n4, (pj2_0)object2);
                }
            }
        }
        object2 = c;
        if (object2 != null) {
            object = View.class;
            String string2 = "LAYER_TYPE_SOFTWARE";
            try {
                object = ((Class)object).getField(string2);
                rR2$p = this.getContext();
                View view = new View((Context)rR2$p);
                n4 = ((Field)object).getInt(view);
                object = n4;
                n3 = 2;
                f6 = 2.8E-45f;
                Object[] objectArray = new Object[n3];
                int n7 = 0;
                f5 = 0.0f;
                rR2$p = null;
                objectArray[0] = object;
                n4 = 0;
                f7 = 0.0f;
                object = null;
                n7 = 1;
                f5 = Float.MIN_VALUE;
                objectArray[n7] = null;
                ((Method)object2).invoke((Object)this, objectArray);
            }
            catch (Exception exception) {}
        }
        object2 = new PictureDrawable((Picture)rR22);
        this.setImageDrawable((Drawable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(AttributeSet attributeSet, int n3) {
        Throwable throwable2;
        block11: {
            block8: {
                Object object;
                block10: {
                    int n4;
                    block9: {
                        Object object2;
                        block7: {
                            n4 = this.isInEditMode();
                            if (n4 != 0) {
                                return;
                            }
                            object2 = this.getContext().getTheme();
                            Object object3 = R$styleable.SVGImageView;
                            Object object4 = null;
                            attributeSet = object2.obtainStyledAttributes(attributeSet, (int[])object3, n3, 0);
                            try {
                                n3 = R$styleable.SVGImageView_css;
                                object = attributeSet.getString(n3);
                                if (object != null) {
                                    object2 = this.b;
                                    object2.getClass();
                                    object3 = new CH;
                                    object4 = CH$u.RenderOptions;
                                    CH$f cH$f = CH$f.screen;
                                    ((CH)object3)(cH$f, (CH$u)((Object)object4));
                                    object4 = new CH$d((String)object);
                                    ((uR2$i)object4).q();
                                    ((pj2_0)object2).a = object = ((CH)object3).e((CH$d)object4);
                                }
                                n3 = R$styleable.SVGImageView_svg;
                                n4 = -1;
                                if ((n3 = attributeSet.getResourceId(n3, n4)) == n4) break block7;
                                this.setImageResource(n3);
                            }
                            catch (Throwable throwable2) {}
                            attributeSet.recycle();
                            return;
                        }
                        n3 = R$styleable.SVGImageView_svg;
                        object = attributeSet.getString(n3);
                        if (object == null) break block8;
                        object2 = Uri.parse((String)object);
                        n4 = (int)(this.d((Uri)object2) ? 1 : 0);
                        if (n4 == 0) break block9;
                        attributeSet.recycle();
                        return;
                    }
                    n4 = (int)(this.c((String)object) ? 1 : 0);
                    if (n4 == 0) break block10;
                    attributeSet.recycle();
                    return;
                }
                this.setFromString((String)object);
                break block11;
            }
            attributeSet.recycle();
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }

    public final boolean c(String object) {
        Object object2;
        boolean bl2 = true;
        try {
            object2 = this.getContext();
        }
        catch (IOException iOException) {
            return false;
        }
        object2 = object2.getAssets();
        object = object2.open((String)object);
        object2 = new SVGImageView$b(this);
        Object[] objectArray = new InputStream[bl2];
        objectArray[0] = object;
        object2.execute(objectArray);
        return bl2;
    }

    public final boolean d(Uri object) {
        Object object2;
        boolean bl2 = true;
        try {
            object2 = this.getContext();
        }
        catch (FileNotFoundException fileNotFoundException) {
            return false;
        }
        object2 = object2.getContentResolver();
        object = object2.openInputStream(object);
        object2 = new SVGImageView$b(this);
        Object[] objectArray = new InputStream[bl2];
        objectArray[0] = object;
        object2.execute(objectArray);
        return bl2;
    }

    public void setCSS(String object) {
        pj2_0 pj2_02 = this.b;
        pj2_02.getClass();
        Object object2 = CH$u.RenderOptions;
        CH$f cH$f = CH$f.screen;
        CH cH = new CH(cH$f, (CH$u)((Object)object2));
        object2 = new CH$d((String)object);
        ((uR2$i)object2).q();
        pj2_02.a = object = cH.e((CH$d)object2);
        this.a();
    }

    public void setImageAsset(String string2) {
        this.c(string2);
    }

    public void setImageResource(int n3) {
        Context context = this.getContext();
        SVGImageView$a sVGImageView$a = new SVGImageView$a(this, context, n3);
        Object[] objectArray = new Integer[]{};
        sVGImageView$a.execute(objectArray);
    }

    public void setImageURI(Uri uri) {
        boolean bl2 = this.d(uri);
        if (!bl2) {
            Objects.toString(uri);
        }
    }

    public void setSVG(rR2 object) {
        if (object != null) {
            this.a = object;
            this.a();
            return;
        }
        object = new IllegalArgumentException("Null value passed to setSVG()");
        throw object;
    }

    public void setSVG(rR2 object, String object2) {
        if (object != null) {
            this.a = object;
            object = this.b;
            object.getClass();
            Object object3 = CH$u.RenderOptions;
            CH$f cH$f = CH$f.screen;
            CH cH = new CH(cH$f, (CH$u)((Object)object3));
            object3 = new CH$d((String)object2);
            ((uR2$i)object3).q();
            ((pj2_0)object).a = object2 = cH.e((CH$d)object3);
            this.a();
            return;
        }
        object = new IllegalArgumentException("Null value passed to setSVG()");
        throw object;
    }
}

