/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetrics
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewOutlineProvider
 */
package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.R$attr;
import androidx.constraintlayout.utils.widget.MotionLabel$a;
import androidx.constraintlayout.utils.widget.MotionLabel$b;
import androidx.constraintlayout.widget.R$styleable;
import java.util.Objects;

public class MotionLabel
extends View
implements fS0 {
    public float A;
    public float B;
    public Drawable C;
    public Matrix D;
    public Bitmap E;
    public BitmapShader F;
    public Matrix G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final Paint L;
    public int M;
    public Rect N;
    public Paint O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final TextPaint a;
    public Path b;
    public int c;
    public int d;
    public boolean e;
    public float f;
    public float g;
    public ViewOutlineProvider h;
    public RectF i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public String o;
    public boolean p;
    public final Rect q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public int w;
    public int x;
    public boolean y;
    public float z;

    public MotionLabel(Context context) {
        super(context);
        Paint paint;
        Rect rect;
        boolean bl2;
        float f5;
        TextPaint textPaint;
        this.a = textPaint = new TextPaint();
        super();
        this.b = textPaint;
        char c2 = (char)-1;
        this.c = c2;
        this.d = c2;
        this.e = false;
        this.f = 0.0f;
        this.g = f5 = 0.0f / 0.0f;
        this.j = 48.0f;
        this.k = f5;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = bl2 = true;
        this.q = rect = new Rect();
        this.r = (int)(bl2 ? 1 : 0);
        this.s = (int)(bl2 ? 1 : 0);
        this.t = (int)(bl2 ? 1 : 0);
        this.u = (int)(bl2 ? 1 : 0);
        this.w = 0x800033;
        this.x = 0;
        this.y = false;
        this.H = f5;
        this.I = f5;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = paint = new Paint();
        this.M = 0;
        this.Q = f5;
        this.R = f5;
        this.S = f5;
        this.T = f5;
        this.c(context, null);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint;
        Rect rect;
        boolean bl2;
        float f5;
        TextPaint textPaint;
        this.a = textPaint = new TextPaint();
        super();
        this.b = textPaint;
        char c2 = (char)-1;
        this.c = c2;
        this.d = c2;
        this.e = false;
        this.f = 0.0f;
        this.g = f5 = 0.0f / 0.0f;
        this.j = 48.0f;
        this.k = f5;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = bl2 = true;
        this.q = rect = new Rect();
        this.r = (int)(bl2 ? 1 : 0);
        this.s = (int)(bl2 ? 1 : 0);
        this.t = (int)(bl2 ? 1 : 0);
        this.u = (int)(bl2 ? 1 : 0);
        this.w = 0x800033;
        this.x = 0;
        this.y = false;
        this.H = f5;
        this.I = f5;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = paint = new Paint();
        this.M = 0;
        this.Q = f5;
        this.R = f5;
        this.S = f5;
        this.T = f5;
        this.c(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        Paint paint;
        Rect rect;
        boolean bl2;
        float f5;
        TextPaint textPaint;
        this.a = textPaint = new TextPaint();
        super();
        this.b = textPaint;
        this.c = n3 = (int)((char)-1);
        this.d = n3;
        this.e = false;
        this.f = 0.0f;
        this.g = f5 = 0.0f / 0.0f;
        this.j = 48.0f;
        this.k = f5;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = bl2 = true;
        this.q = rect = new Rect();
        this.r = (int)(bl2 ? 1 : 0);
        this.s = (int)(bl2 ? 1 : 0);
        this.t = (int)(bl2 ? 1 : 0);
        this.u = (int)(bl2 ? 1 : 0);
        this.w = 0x800033;
        this.x = 0;
        this.y = false;
        this.H = f5;
        this.I = f5;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = paint = new Paint();
        this.M = 0;
        this.Q = f5;
        this.R = f5;
        this.S = f5;
        this.T = f5;
        this.c(context, attributeSet);
    }

    private float getHorizontalOffset() {
        float f5;
        float f6 = this.k;
        int n3 = Float.isNaN(f6);
        float f7 = 1.0f;
        if (n3 != 0) {
            n3 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = this.j;
            f5 = this.k;
            f6 /= f5;
        }
        String string2 = this.o;
        float f8 = 0.0f;
        int n4 = string2.length();
        TextPaint textPaint = this.a;
        f5 = textPaint.measureText(string2, 0, n4) * f6;
        f6 = this.A;
        n3 = (int)(Float.isNaN(f6) ? 1 : 0);
        if (n3 != 0) {
            n3 = this.getMeasuredWidth();
            f6 = n3;
        } else {
            f6 = this.A;
        }
        f8 = this.getPaddingLeft();
        f6 -= f8;
        f8 = this.getPaddingRight();
        f6 = f6 - f8 - f5;
        return (this.J + f7) * f6 / 2.0f;
    }

    private float getVerticalOffset() {
        float f5;
        float f6 = this.k;
        int n3 = Float.isNaN(f6);
        float f7 = 1.0f;
        if (n3 != 0) {
            n3 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = this.j;
            f5 = this.k;
            f6 /= f5;
        }
        Paint.FontMetrics fontMetrics = this.a.getFontMetrics();
        float f8 = this.B;
        int n4 = Float.isNaN(f8);
        if (n4 != 0) {
            n4 = this.getMeasuredHeight();
            f8 = n4;
        } else {
            f8 = this.B;
        }
        float f11 = this.getPaddingTop();
        f8 -= f11;
        f11 = this.getPaddingBottom();
        f8 -= f11;
        f11 = fontMetrics.descent;
        f5 = fontMetrics.ascent;
        f11 = (f11 - f5) * f6;
        f8 -= f11;
        f11 = this.K;
        f7 = (f7 - f11) * f8 / 2.0f;
        return f7 - (f6 *= f5);
    }

    private void setUpTheme(Context context) {
        int n3;
        TypedValue typedValue = new TypedValue();
        context = context.getTheme();
        int n4 = R$attr.colorPrimary;
        context.resolveAttribute(n4, typedValue, true);
        this.c = n3 = typedValue.data;
        this.a.setColor(n3);
    }

    public final void a(float f5, float f6, float f7, float f8) {
        float f11 = 0.5f;
        float f12 = f5 + f11;
        int n3 = (int)f12;
        float f14 = n3;
        this.z = f14 = f5 - f14;
        f14 = f7 + f11;
        int n4 = (int)f14;
        int n7 = n4 - n3;
        float f15 = f8 + f11;
        int n8 = (int)f15;
        int n10 = (int)(f11 += f6);
        int n14 = n8 - n10;
        this.A = f7 -= f5;
        this.B = f8 -= f6;
        Matrix matrix = this.G;
        if (matrix != null) {
            this.A = f7;
            this.B = f8;
            this.d();
        }
        int n15 = this.getMeasuredHeight();
        if (n15 == n14 && (n15 = this.getMeasuredWidth()) == n7) {
            super.layout(n3, n10, n4, n8);
        } else {
            n15 = 0x40000000;
            f5 = 2.0f;
            int n16 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n15);
            n15 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)n15);
            this.measure(n16, n15);
            super.layout(n3, n10, n4, n8);
        }
        n15 = (int)(this.y ? 1 : 0);
        if (n15 != 0) {
            matrix = this.N;
            TextPaint textPaint = this.a;
            if (matrix == null) {
                matrix = new Paint();
                this.O = matrix;
                matrix = new Rect();
                this.N = matrix;
                this.O.set((Paint)textPaint);
                matrix = this.O;
                this.P = f5 = matrix.getTextSize();
            }
            this.A = f7;
            this.B = f8;
            matrix = this.O;
            String string2 = this.o;
            n3 = string2.length();
            Rect rect = this.N;
            n7 = 0;
            matrix.getTextBounds(string2, 0, n3, rect);
            matrix = this.N;
            n15 = matrix.width();
            string2 = this.N;
            n10 = string2.height();
            f11 = (float)n10 * 1.3f;
            f12 = this.s;
            f7 -= f12;
            f12 = this.r;
            f7 -= f12;
            f12 = this.u;
            f8 -= f12;
            f12 = this.t;
            f8 -= f12;
            f5 = n15;
            f12 = f5 * f8;
            f14 = f11 * f7;
            n3 = (int)(f12 == f14 ? 0 : (f12 > f14 ? 1 : -1));
            if (n3 > 0) {
                f8 = this.P * f7 / f5;
                textPaint.setTextSize(f8);
            } else {
                f5 = this.P * f8 / f11;
                textPaint.setTextSize(f5);
            }
            n15 = (int)(this.e ? 1 : 0);
            if (n15 != 0 || (n15 = (int)(Float.isNaN(f5 = this.k) ? 1 : 0)) == 0) {
                f5 = this.k;
                n15 = (int)(Float.isNaN(f5) ? 1 : 0);
                if (n15 != 0) {
                    n15 = 1065353216;
                    f5 = 1.0f;
                } else {
                    f5 = this.j;
                    f6 = this.k;
                    f5 /= f6;
                }
                this.b(f5);
            }
        }
    }

    public final void b(float f5) {
        float f6;
        int n3;
        Path path;
        boolean bl2 = this.e;
        float f7 = 1.0f;
        if (!bl2 && !(bl2 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1))) {
            return;
        }
        this.b.reset();
        String string2 = this.o;
        int n4 = string2.length();
        TextPaint textPaint = this.a;
        Rect rect = this.q;
        textPaint.getTextBounds(string2, 0, n4, rect);
        Path path2 = this.b;
        TextPaint textPaint2 = this.a;
        textPaint2.getTextPath(string2, 0, n4, 0.0f, 0.0f, path2);
        bl2 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
        if (bl2) {
            oi0_0.a();
            textPaint = new Matrix();
            textPaint.postScale(f5, f5);
            path = this.b;
            path.transform((Matrix)textPaint);
        }
        rect.right = n3 = rect.right + -1;
        rect.left = n3 = rect.left + 1;
        rect.bottom = n3 = rect.bottom + 1;
        rect.top = n3 = rect.top + -1;
        path = new RectF();
        path.bottom = f6 = (float)this.getHeight();
        path.right = f6 = (float)this.getWidth();
        this.p = false;
    }

    public final void c(Context context, AttributeSet object) {
        TextPaint textPaint;
        int n3;
        int n4;
        float f5;
        int n7;
        block47: {
            int n8;
            float f6;
            int n10;
            float f7;
            Object object2;
            int n14;
            int n15;
            int n16;
            block46: {
                block45: {
                    this.setUpTheme(context);
                    n7 = 0;
                    f5 = 0.0f;
                    context = null;
                    n4 = 1;
                    if (object != null) {
                        Context context2 = this.getContext();
                        int[] nArray = R$styleable.MotionLabel;
                        object = context2.obtainStyledAttributes(object, nArray);
                        n3 = object.getIndexCount();
                        nArray = null;
                        for (n16 = 0; n16 < n3; ++n16) {
                            float f8;
                            n15 = object.getIndex(n16);
                            if (n15 == (n14 = R$styleable.MotionLabel_android_text)) {
                                object2 = object.getText(n15);
                                this.setText((CharSequence)object2);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_fontFamily;
                            if (n15 == n14) {
                                object2 = object.getString(n15);
                                this.v = object2;
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_scaleFromTextSize;
                            if (n15 == n14) {
                                f8 = this.k;
                                n14 = (int)f8;
                                n15 = object.getDimensionPixelSize(n15, n14);
                                this.k = f7 = (float)n15;
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_textSize;
                            if (n15 == n14) {
                                f8 = this.j;
                                n14 = (int)f8;
                                n15 = object.getDimensionPixelSize(n15, n14);
                                this.j = f7 = (float)n15;
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_textStyle;
                            if (n15 == n14) {
                                n14 = this.l;
                                this.l = n15 = object.getInt(n15, n14);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_typeface;
                            if (n15 == n14) {
                                n14 = this.m;
                                this.m = n15 = object.getInt(n15, n14);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_textColor;
                            if (n15 == n14) {
                                n14 = this.c;
                                this.c = n15 = object.getColor(n15, n14);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_borderRound;
                            if (n15 == n14) {
                                f8 = this.g;
                                this.g = f7 = object.getDimension(n15, f8);
                                this.setRound(f7);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_borderRoundPercent;
                            if (n15 == n14) {
                                f8 = this.f;
                                this.f = f7 = object.getFloat(n15, f8);
                                this.setRoundPercent(f7);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_gravity;
                            if (n15 == n14) {
                                n14 = -1;
                                f8 = 0.0f / 0.0f;
                                n15 = object.getInt(n15, n14);
                                this.setGravity(n15);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_android_autoSizeTextType;
                            if (n15 == n14) {
                                this.x = n15 = object.getInt(n15, 0);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textOutlineColor;
                            if (n15 == n14) {
                                n14 = this.d;
                                this.d = n15 = object.getInt(n15, n14);
                                this.e = n4;
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textOutlineThickness;
                            if (n15 == n14) {
                                f8 = this.n;
                                this.n = f7 = object.getDimension(n15, f8);
                                this.e = n4;
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textBackground;
                            if (n15 == n14) {
                                this.C = object2 = object.getDrawable(n15);
                                this.e = n4;
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textBackgroundPanX;
                            if (n15 == n14) {
                                f8 = this.Q;
                                this.Q = f7 = object.getFloat(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textBackgroundPanY;
                            if (n15 == n14) {
                                f8 = this.R;
                                this.R = f7 = object.getFloat(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textPanX;
                            if (n15 == n14) {
                                f8 = this.J;
                                this.J = f7 = object.getFloat(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textPanY;
                            if (n15 == n14) {
                                f8 = this.K;
                                this.K = f7 = object.getFloat(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textBackgroundRotate;
                            if (n15 == n14) {
                                f8 = this.T;
                                this.T = f7 = object.getFloat(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textBackgroundZoom;
                            if (n15 == n14) {
                                f8 = this.S;
                                this.S = f7 = object.getFloat(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textureHeight;
                            if (n15 == n14) {
                                f8 = this.H;
                                this.H = f7 = object.getDimension(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textureWidth;
                            if (n15 == n14) {
                                f8 = this.I;
                                this.I = f7 = object.getDimension(n15, f8);
                                continue;
                            }
                            n14 = R$styleable.MotionLabel_textureEffect;
                            if (n15 != n14) continue;
                            n14 = this.M;
                            this.M = n15 = object.getInt(n15, n14);
                        }
                        object.recycle();
                    }
                    object = this.C;
                    n3 = 128;
                    n16 = 2;
                    if (object != null) {
                        object = new Matrix();
                        this.G = object;
                        object = this.C;
                        n10 = object.getIntrinsicWidth();
                        object2 = this.C;
                        n15 = object2.getIntrinsicHeight();
                        if (n10 <= 0 && (n10 = this.getWidth()) == 0) {
                            f6 = this.I;
                            n10 = (int)(Float.isNaN(f6) ? 1 : 0);
                            if (n10 != 0) {
                                n10 = 128;
                                f6 = 1.8E-43f;
                            } else {
                                f6 = this.I;
                                n10 = (int)f6;
                            }
                        }
                        if (n15 <= 0 && (n15 = this.getHeight()) == 0) {
                            f7 = this.H;
                            n15 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n15 != 0) {
                                n15 = 128;
                                f7 = 1.8E-43f;
                            } else {
                                f7 = this.H;
                                n15 = (int)f7;
                            }
                        }
                        if ((n14 = this.M) != 0) {
                            n10 /= 2;
                            n15 /= 2;
                        }
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        object = Bitmap.createBitmap((int)n10, (int)n15, (Bitmap.Config)config);
                        this.E = object;
                        object2 = this.E;
                        object = new Canvas((Bitmap)object2);
                        object2 = this.C;
                        n14 = object.getWidth();
                        int n17 = object.getHeight();
                        object2.setBounds(0, 0, n14, n17);
                        this.C.setFilterBitmap(n4 != 0);
                        object2 = this.C;
                        object2.draw((Canvas)object);
                        n10 = this.M;
                        if (n10 != 0) {
                            object = this.E;
                            n15 = object.getWidth();
                            n14 = object.getHeight();
                            object = Bitmap.createScaledBitmap((Bitmap)object, (int)(n15 /= n16), (int)(n14 /= n16), n4 != 0);
                            textPaint = null;
                            for (n17 = 0; n17 < (n8 = 4) && n15 >= (n8 = 32) && n14 >= n8; ++n17) {
                                object = Bitmap.createScaledBitmap((Bitmap)object, (int)(n15 /= 2), (int)(n14 /= 2), n4 != 0);
                            }
                            this.E = object;
                        }
                        object2 = this.E;
                        config = Shader.TileMode.REPEAT;
                        object = new BitmapShader((Bitmap)object2, (Shader.TileMode)config, (Shader.TileMode)config);
                        this.F = object;
                    }
                    this.r = n10 = this.getPaddingLeft();
                    this.s = n10 = this.getPaddingRight();
                    this.t = n10 = this.getPaddingTop();
                    this.u = n10 = this.getPaddingBottom();
                    object = this.v;
                    n15 = this.m;
                    n14 = this.l;
                    textPaint = this.a;
                    if (object == null) break block45;
                    if ((object = Typeface.create((String)object, (int)n14)) == null) break block46;
                    this.setTypeface((Typeface)object);
                    break block47;
                }
                n10 = 0;
                f6 = 0.0f;
                object = null;
            }
            if (n15 != n4) {
                if (n15 != n16) {
                    n8 = 3;
                    if (n15 == n8) {
                        object = Typeface.MONOSPACE;
                    }
                } else {
                    object = Typeface.SERIF;
                }
            } else {
                object = Typeface.SANS_SERIF;
            }
            n15 = 0;
            f7 = 0.0f;
            object2 = null;
            if (n14 > 0) {
                object = object == null ? Typeface.defaultFromStyle((int)n14) : Typeface.create((Typeface)object, (int)n14);
                this.setTypeface((Typeface)object);
                if (object != null) {
                    n10 = object.getStyle();
                } else {
                    n10 = 0;
                    f6 = 0.0f;
                    object = null;
                }
                n10 = ~n10 & n14;
                n14 = n10 & 1;
                if (n14 != 0) {
                    n7 = 1;
                    f5 = Float.MIN_VALUE;
                }
                textPaint.setFakeBoldText(n7 != 0);
                n7 = n10 & 2;
                if (n7 != 0) {
                    n15 = -1098907648;
                    f7 = -0.25f;
                }
                textPaint.setTextSkewX(f7);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                this.setTypeface((Typeface)object);
            }
        }
        n7 = this.c;
        textPaint.setColor(n7);
        f5 = this.n;
        textPaint.setStrokeWidth(f5);
        context = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle((Paint.Style)context);
        textPaint.setFlags(n3);
        f5 = this.j;
        this.setTextSize(f5);
        textPaint.setAntiAlias(n4 != 0);
    }

    public final void d() {
        Matrix matrix;
        float f5 = this.Q;
        boolean bl2 = Float.isNaN(f5);
        float f6 = 0.0f;
        Matrix matrix2 = null;
        if (bl2) {
            bl2 = false;
            f5 = 0.0f;
            matrix = null;
        } else {
            f5 = this.Q;
        }
        float f7 = this.R;
        boolean bl3 = Float.isNaN(f7);
        if (bl3) {
            bl3 = false;
            f7 = 0.0f;
        } else {
            f7 = this.R;
        }
        float f8 = this.S;
        int n3 = Float.isNaN(f8);
        if (n3 != 0) {
            n3 = 1065353216;
            f8 = 1.0f;
        } else {
            f8 = this.S;
        }
        float f11 = this.T;
        int n4 = Float.isNaN(f11);
        if (n4 == 0) {
            f6 = this.T;
        }
        this.G.reset();
        Bitmap bitmap = this.E;
        n4 = bitmap.getWidth();
        f11 = n4;
        Bitmap bitmap2 = this.E;
        int n7 = bitmap2.getHeight();
        float f12 = n7;
        float f14 = this.I;
        boolean bl4 = Float.isNaN(f14);
        f14 = bl4 ? this.A : this.I;
        float f15 = this.H;
        boolean bl5 = Float.isNaN(f15);
        f15 = bl5 ? this.B : this.H;
        float f16 = f11 * f15;
        float f17 = f12 * f14;
        float f18 = f16 == f17 ? 0 : (f16 < f17 ? -1 : 1);
        f16 = f18 < 0 ? f14 / f11 : f15 / f12;
        Matrix matrix3 = this.G;
        matrix3.postScale(f8 *= f16, f8);
        f16 = f14 - (f11 *= f8);
        f8 *= f12;
        f12 = f15 - f8;
        f17 = this.H;
        boolean bl6 = Float.isNaN(f17);
        float f19 = 2.0f;
        if (!bl6) {
            f12 = this.H / f19;
        }
        if (!(bl6 = Float.isNaN(f17 = this.I))) {
            f16 = this.I / f19;
        }
        f5 = f5 * f16 + f14 - f11;
        f11 = 0.5f;
        f7 = (f7 * f12 + f15 - f8) * f11;
        this.G.postTranslate(f5 *= f11, f7);
        matrix = this.G;
        matrix.postRotate(f6, f14 /= f19, f15 /= f19);
        matrix = this.F;
        matrix2 = this.G;
        matrix.setLocalMatrix(matrix2);
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getScaleFromTextSize() {
        return this.k;
    }

    public float getTextBackgroundPanX() {
        return this.Q;
    }

    public float getTextBackgroundPanY() {
        return this.R;
    }

    public float getTextBackgroundRotate() {
        return this.T;
    }

    public float getTextBackgroundZoom() {
        return this.S;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.J;
    }

    public float getTextPanY() {
        return this.K;
    }

    public float getTextureHeight() {
        return this.H;
    }

    public float getTextureWidth() {
        return this.I;
    }

    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    public final void layout(int n3, int n4, int n7, int n8) {
        float f5;
        float f6;
        super.layout(n3, n4, n7, n8);
        float f7 = this.k;
        boolean bl2 = Float.isNaN(f7);
        if (bl2) {
            f6 = 1.0f;
        } else {
            f6 = this.j;
            f5 = this.k;
            f6 /= f5;
        }
        this.A = f5 = (float)(n7 - n3);
        this.B = f5 = (float)(n8 - n4);
        int n10 = this.y;
        if (n10 != 0) {
            Rect rect = this.N;
            TextPaint textPaint = this.a;
            if (rect == null) {
                rect = new Paint();
                this.O = rect;
                this.N = rect = new Rect();
                this.O.set((Paint)textPaint);
                rect = this.O;
                this.P = f5 = rect.getTextSize();
            }
            rect = this.O;
            String string2 = this.o;
            int n14 = string2.length();
            Rect rect2 = this.N;
            rect.getTextBounds(string2, 0, n14, rect2);
            rect = this.N;
            n10 = rect.width();
            string2 = this.N;
            float f8 = string2.height();
            n14 = 1067869798;
            int n15 = (int)(f8 *= 1.3f);
            float f11 = this.A;
            float f12 = this.s;
            f11 -= f12;
            int n16 = this.r;
            f12 = n16;
            f11 -= f12;
            f12 = this.B;
            float f14 = this.u;
            f12 -= f14;
            int n17 = this.t;
            f14 = n17;
            f12 -= f14;
            if (bl2) {
                f5 = n10;
                f14 = f5 * f12;
                f8 = n15;
                float f15 = f8 * f11;
                float f16 = f14 - f15;
                n17 = (int)(f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1));
                if (n17 > 0) {
                    f8 = this.P * f11 / f5;
                    textPaint.setTextSize(f8);
                } else {
                    f5 = this.P * f12 / f8;
                    textPaint.setTextSize(f5);
                }
            } else {
                f6 = n10;
                f5 = f6 * f12;
                float f17 = n15;
                f8 = f17 * f11;
                float f18 = f5 - f8;
                if ((n10 = (int)(f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1))) > 0) {
                    f11 /= f6;
                    f6 = f11;
                } else {
                    f6 = f12 /= f17;
                }
            }
        }
        if ((n10 = this.e) != 0 || !bl2) {
            float f19 = n3;
            float f20 = n4;
            float f22 = n7;
            float f23 = n8;
            Matrix matrix = this.G;
            if (matrix != null) {
                this.A = f22 -= f19;
                this.B = f23 -= f20;
                this.d();
            }
            this.b(f6);
        }
    }

    public final void onDraw(Canvas canvas) {
        Matrix matrix;
        float f5;
        float f6 = this.k;
        int n3 = Float.isNaN(f6);
        int n4 = 1065353216;
        float f7 = 1.0f;
        if (n3 != 0) {
            n3 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = this.j;
            f5 = this.k;
            f6 /= f5;
        }
        super.onDraw(canvas);
        int n7 = this.e;
        TextPaint textPaint = this.a;
        if (n7 == 0 && (n4 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1))) == 0) {
            f6 = this.r;
            f7 = this.getHorizontalOffset();
            f6 += f7;
            f7 = this.t;
            f5 = this.getVerticalOffset();
            String string2 = this.o;
            float f8 = this.z + f6;
            canvas.drawText(string2, f8, f7 += f5, (Paint)textPaint);
            return;
        }
        n4 = (int)(this.p ? 1 : 0);
        if (n4 != 0) {
            this.b(f6);
        }
        if ((matrix = this.D) == null) {
            this.D = matrix = new Matrix();
        }
        if ((n4 = (int)(this.e ? 1 : 0)) != 0) {
            matrix = this.L;
            matrix.set((Paint)textPaint);
            Matrix matrix2 = this.D;
            matrix2.reset();
            n7 = this.r;
            f5 = n7;
            float f11 = this.getHorizontalOffset();
            f5 += f11;
            int n8 = this.t;
            f11 = n8;
            float f12 = this.getVerticalOffset();
            this.D.postTranslate(f5, f11 += f12);
            this.D.preScale(f6, f6);
            Path path = this.b;
            Matrix matrix3 = this.D;
            path.transform(matrix3);
            path = this.F;
            if (path != null) {
                n3 = 1;
                f6 = Float.MIN_VALUE;
                textPaint.setFilterBitmap(n3 != 0);
                path = this.F;
                textPaint.setShader((Shader)path);
            } else {
                n3 = this.c;
                textPaint.setColor(n3);
            }
            path = Paint.Style.FILL;
            textPaint.setStyle((Paint.Style)path);
            f6 = this.n;
            textPaint.setStrokeWidth(f6);
            path = this.b;
            canvas.drawPath(path, (Paint)textPaint);
            path = this.F;
            if (path != null) {
                n3 = 0;
                f6 = 0.0f;
                path = null;
                textPaint.setShader(null);
            }
            n3 = this.d;
            textPaint.setColor(n3);
            path = Paint.Style.STROKE;
            textPaint.setStyle((Paint.Style)path);
            f6 = this.n;
            textPaint.setStrokeWidth(f6);
            path = this.b;
            canvas.drawPath(path, (Paint)textPaint);
            this.D.reset();
            canvas = this.D;
            f6 = -f5;
            f5 = -f11;
            canvas.postTranslate(f6, f5);
            canvas = this.b;
            path = this.D;
            canvas.transform((Matrix)path);
            textPaint.set((Paint)matrix);
        } else {
            n3 = this.r;
            f6 = n3;
            f7 = this.getHorizontalOffset();
            f6 += f7;
            n4 = this.t;
            f7 = n4;
            f5 = this.getVerticalOffset();
            this.D.reset();
            this.D.preTranslate(f6, f7 += f5);
            Path path = this.b;
            Matrix matrix4 = this.D;
            path.transform(matrix4);
            n7 = this.c;
            textPaint.setColor(n7);
            path = Paint.Style.FILL_AND_STROKE;
            textPaint.setStyle((Paint.Style)path);
            f5 = this.n;
            textPaint.setStrokeWidth(f5);
            path = this.b;
            canvas.drawPath(path, (Paint)textPaint);
            this.D.reset();
            canvas = this.D;
            f6 = -f6;
            f7 = -f7;
            canvas.preTranslate(f6, f7);
            canvas = this.b;
            Matrix matrix5 = this.D;
            canvas.transform(matrix5);
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8 = View.MeasureSpec.getMode((int)n3);
        int n10 = View.MeasureSpec.getMode((int)n4);
        n3 = View.MeasureSpec.getSize((int)n3);
        n4 = View.MeasureSpec.getSize((int)n4);
        int n14 = 0;
        float f5 = 0.0f;
        this.y = false;
        this.r = n7 = this.getPaddingLeft();
        this.s = n7 = this.getPaddingRight();
        this.t = n7 = this.getPaddingTop();
        this.u = n7 = this.getPaddingBottom();
        n7 = 0x40000000;
        if (n8 == n7 && n10 == n7) {
            n8 = this.x;
            if (n8 != 0) {
                n8 = 1;
                float f6 = Float.MIN_VALUE;
                this.y = n8;
            }
        } else {
            String string2 = this.o;
            int n15 = string2.length();
            TextPaint textPaint = this.a;
            Rect rect = this.q;
            textPaint.getTextBounds(string2, 0, n15, rect);
            n14 = 1065353048;
            f5 = 0.99999f;
            if (n8 != n7) {
                float f7 = (float)rect.width() + f5;
                n3 = (int)f7;
            }
            n8 = this.r;
            int n16 = this.s;
            n3 += (n8 += n16);
            if (n10 != n7) {
                float f8 = (float)textPaint.getFontMetricsInt(null) + f5;
                n8 = (int)f8;
                n14 = -1 << -1;
                f5 = -0.0f;
                if (n10 == n14) {
                    n8 = Math.min(n4, n8);
                }
                n4 = this.t;
                n10 = this.u;
                n4 = n4 + n10 + n8;
            }
        }
        this.setMeasuredDimension(n3, n4);
    }

    /*
     * Unable to fully structure code
     */
    public void setGravity(int var1_1) {
        block7: {
            block6: {
                var2_2 = 0x800007;
                var3_3 = var1_1 & var2_2;
                var4_4 = 0x800003;
                if (var3_3 == 0) {
                    var1_1 |= var4_4;
                }
                if ((var3_3 = var1_1 & 112) == 0) {
                    var1_1 |= 48;
                }
                if (var1_1 != (var3_3 = this.w)) {
                    this.invalidate();
                }
                this.w = var1_1;
                var3_3 = var1_1 & 112;
                var5_5 = -1.0f;
                var6_6 = 1.0f;
                var7_7 = 48;
                this.K = var3_3 != var7_7 ? (var3_3 != (var7_7 = 80) ? 0.0f : var6_6) : var5_5;
                var1_1 &= var2_2;
                var2_2 = 3;
                if (var1_1 == var2_2) break block6;
                var2_2 = 5;
                if (var1_1 == var2_2) ** GOTO lbl-1000
                if (var1_1 != var4_4) {
                    var2_2 = 0x800005;
                    ** if (var1_1 == var2_2) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        this.J = 0.0f;
                        ** GOTO lbl31
                    }
                }
                break block6;
lbl-1000:
                // 2 sources

                {
                    this.J = var6_6;
                }
                break block7;
            }
            this.J = var5_5;
        }
    }

    public void setRound(float f5) {
        Object object = Float.isNaN(f5);
        if (object) {
            this.g = f5;
            f5 = this.f;
            this.f = -1.0f;
            this.setRoundPercent(f5);
            return;
        }
        float f6 = this.g;
        int n3 = 0;
        float f7 = 0.0f;
        RectF rectF = null;
        boolean bl2 = true;
        float f8 = Float.MIN_VALUE;
        object = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
        if (object) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
        }
        this.g = f5;
        Path.Direction direction = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            Object object2 = this.b;
            if (object2 == null) {
                this.b = object2 = new Path();
            }
            if ((object2 = this.i) == null) {
                object2 = new RectF();
                this.i = object2;
            }
            if ((object2 = this.h) == null) {
                object2 = new MotionLabel$b(this);
                this.h = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(bl2);
            f12 = this.getWidth();
            n3 = this.getHeight();
            RectF rectF2 = this.i;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.b.reset();
            object2 = this.b;
            rectF = this.i;
            f8 = this.g;
            direction = Path.Direction.CW;
            object2.addRoundRect(rectF, f8, f8, direction);
        } else {
            this.setClipToOutline(false);
        }
        if (object) {
            this.invalidateOutline();
        }
    }

    public void setRoundPercent(float f5) {
        float f6 = this.f;
        int n3 = 0;
        float f7 = 0.0f;
        RectF rectF = null;
        int n4 = 1;
        float f8 = Float.MIN_VALUE;
        Object object = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
        if (object != false) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
        }
        this.f = f5;
        Path.Direction direction = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            Object object2 = this.b;
            if (object2 == null) {
                this.b = object2 = new Path();
            }
            if ((object2 = this.i) == null) {
                object2 = new RectF();
                this.i = object2;
            }
            if ((object2 = this.h) == null) {
                object2 = new MotionLabel$a(this);
                this.h = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(n4 != 0);
            f12 = this.getWidth();
            n3 = this.getHeight();
            n4 = Math.min((int)f12, n3);
            f8 = n4;
            float f14 = this.f;
            f8 *= f14;
            f14 = 2.0f;
            f8 /= f14;
            RectF rectF2 = this.i;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.b.reset();
            object2 = this.b;
            rectF = this.i;
            direction = Path.Direction.CW;
            object2.addRoundRect(rectF, f8, f8, direction);
        } else {
            this.setClipToOutline(false);
        }
        if (object != false) {
            this.invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f5) {
        this.k = f5;
    }

    public void setText(CharSequence charSequence) {
        charSequence = charSequence.toString();
        this.o = charSequence;
        this.invalidate();
    }

    public void setTextBackgroundPanX(float f5) {
        this.Q = f5;
        this.d();
        this.invalidate();
    }

    public void setTextBackgroundPanY(float f5) {
        this.R = f5;
        this.d();
        this.invalidate();
    }

    public void setTextBackgroundRotate(float f5) {
        this.T = f5;
        this.d();
        this.invalidate();
    }

    public void setTextBackgroundZoom(float f5) {
        this.S = f5;
        this.d();
        this.invalidate();
    }

    public void setTextFillColor(int n3) {
        this.c = n3;
        this.invalidate();
    }

    public void setTextOutlineColor(int n3) {
        this.d = n3;
        this.e = true;
        this.invalidate();
    }

    public void setTextOutlineThickness(float f5) {
        boolean bl2;
        this.n = f5;
        this.e = bl2 = true;
        boolean bl3 = Float.isNaN(f5);
        if (bl3) {
            this.n = 1.0f;
            bl3 = false;
            f5 = 0.0f;
            this.e = false;
        }
        this.invalidate();
    }

    public void setTextPanX(float f5) {
        this.J = f5;
        this.invalidate();
    }

    public void setTextPanY(float f5) {
        this.K = f5;
        this.invalidate();
    }

    public void setTextSize(float f5) {
        this.j = f5;
        float f6 = this.k;
        boolean bl2 = Float.isNaN(f6);
        if (!bl2) {
            f5 = this.k;
        }
        TextPaint textPaint = this.a;
        textPaint.setTextSize(f5);
        f5 = this.k;
        int n3 = Float.isNaN(f5);
        if (n3 != 0) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            f5 = this.j;
            f6 = this.k;
            f5 /= f6;
        }
        this.b(f5);
        this.requestLayout();
        this.invalidate();
    }

    public void setTextureHeight(float f5) {
        this.H = f5;
        this.d();
        this.invalidate();
    }

    public void setTextureWidth(float f5) {
        this.I = f5;
        this.d();
        this.invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.a;
        Typeface typeface2 = textPaint.getTypeface();
        boolean bl2 = Objects.equals(typeface2, typeface);
        if (!bl2) {
            textPaint.setTypeface(typeface);
        }
    }
}

