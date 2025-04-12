/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.util.AttributeSet
 *  android.view.ViewOutlineProvider
 *  android.widget.ImageView$ScaleType
 */
package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.utils.widget.ImageFilterView$a;
import androidx.constraintlayout.utils.widget.ImageFilterView$b;
import androidx.constraintlayout.utils.widget.ImageFilterView$c;
import androidx.constraintlayout.widget.R$styleable;

public class ImageFilterView
extends AppCompatImageView {
    public final ImageFilterView$c a;
    public boolean b;
    public Drawable c;
    public Drawable d;
    public float e;
    public float f;
    public float g;
    public Path h;
    public ViewOutlineProvider i;
    public RectF j;
    public final Drawable[] k;
    public LayerDrawable l;
    public float m;
    public float n;
    public float o;
    public float p;

    public ImageFilterView(Context object) {
        super((Context)object);
        float f5;
        super();
        this.a = object;
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = f5 = 0.0f / 0.0f;
        Drawable[] drawableArray = new Drawable[2];
        this.k = drawableArray;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        ImageFilterView$c imageFilterView$c;
        this.a = imageFilterView$c = new ImageFilterView$c();
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = f5 = 0.0f / 0.0f;
        Drawable[] drawableArray = new Drawable[2];
        this.k = drawableArray;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.d(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        float f5;
        ImageFilterView$c imageFilterView$c;
        this.a = imageFilterView$c = new ImageFilterView$c();
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = f5 = 0.0f / 0.0f;
        Drawable[] drawableArray = new Drawable[2];
        this.k = drawableArray;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.d(context, attributeSet);
    }

    private void setOverlay(boolean bl2) {
        this.b = bl2;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int n3;
            Object object = R$styleable.ImageFilterView;
            context = context.obtainStyledAttributes(attributeSet, object);
            int n4 = context.getIndexCount();
            int n7 = R$styleable.ImageFilterView_altSrc;
            object = context.getDrawable(n7);
            this.c = (Drawable)object;
            n7 = 0;
            float f5 = 0.0f;
            object = null;
            float f6 = 0.0f;
            Drawable[] drawableArray = null;
            for (n3 = 0; n3 < n4; ++n3) {
                float f7;
                float f8;
                int n8;
                int n10 = context.getIndex(n3);
                if (n10 == (n8 = R$styleable.ImageFilterView_crossfade)) {
                    this.e = f8 = context.getFloat(n10, 0.0f);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_warmth;
                if (n10 == n8) {
                    f8 = context.getFloat(n10, 0.0f);
                    this.setWarmth(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_saturation;
                if (n10 == n8) {
                    f8 = context.getFloat(n10, 0.0f);
                    this.setSaturation(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_contrast;
                if (n10 == n8) {
                    f8 = context.getFloat(n10, 0.0f);
                    this.setContrast(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_brightness;
                if (n10 == n8) {
                    f8 = context.getFloat(n10, 0.0f);
                    this.setBrightness(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_round;
                if (n10 == n8) {
                    f8 = context.getDimension(n10, 0.0f);
                    this.setRound(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_roundPercent;
                if (n10 == n8) {
                    f8 = context.getFloat(n10, 0.0f);
                    this.setRoundPercent(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_overlay;
                if (n10 == n8) {
                    n8 = (int)(this.b ? 1 : 0);
                    n10 = (int)(context.getBoolean(n10, n8 != 0) ? 1 : 0);
                    this.setOverlay(n10 != 0);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_imagePanX;
                if (n10 == n8) {
                    f7 = this.m;
                    f8 = context.getFloat(n10, f7);
                    this.setImagePanX(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_imagePanY;
                if (n10 == n8) {
                    f7 = this.n;
                    f8 = context.getFloat(n10, f7);
                    this.setImagePanY(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_imageRotate;
                if (n10 == n8) {
                    f7 = this.p;
                    f8 = context.getFloat(n10, f7);
                    this.setImageRotate(f8);
                    continue;
                }
                n8 = R$styleable.ImageFilterView_imageZoom;
                if (n10 != n8) continue;
                f7 = this.o;
                f8 = context.getFloat(n10, f7);
                this.setImageZoom(f8);
            }
            context.recycle();
            context = this.getDrawable();
            this.d = context;
            attributeSet = this.c;
            drawableArray = this.k;
            if (attributeSet != null && context != null) {
                context = this.getDrawable().mutate();
                this.d = context;
                drawableArray[0] = context;
                context = this.c.mutate();
                n4 = 1;
                drawableArray[n4] = context;
                context = new LayerDrawable(drawableArray);
                this.l = context;
                context = context.getDrawable(n4);
                float f11 = this.e;
                n3 = 1132396544;
                f6 = 255.0f;
                n4 = (int)(f11 *= f6);
                context.setAlpha(n4);
                boolean bl2 = this.b;
                if (!bl2) {
                    context = this.l.getDrawable(0);
                    f5 = this.e;
                    f11 = (1.0f - f5) * f6;
                    n4 = (int)f11;
                    context.setAlpha(n4);
                }
                context = this.l;
                super.setImageDrawable((Drawable)context);
            } else {
                context = this.getDrawable();
                this.d = context;
                if (context != null) {
                    context = context.mutate();
                    this.d = context;
                    drawableArray[0] = context;
                }
            }
        }
    }

    public final void e() {
        ImageView.ScaleType scaleType;
        float f5 = this.m;
        boolean bl2 = Float.isNaN(f5);
        if (bl2 && (bl2 = Float.isNaN(f5 = this.n)) && (bl2 = Float.isNaN(f5 = this.o)) && (bl2 = Float.isNaN(f5 = this.p))) {
            return;
        }
        f5 = this.m;
        bl2 = Float.isNaN(f5);
        float f6 = 0.0f;
        if (bl2) {
            bl2 = false;
            f5 = 0.0f;
            scaleType = null;
        } else {
            f5 = this.m;
        }
        float f7 = this.n;
        boolean bl3 = Float.isNaN(f7);
        if (bl3) {
            bl3 = false;
            f7 = 0.0f;
        } else {
            f7 = this.n;
        }
        float f8 = this.o;
        int n3 = Float.isNaN(f8);
        if (n3 != 0) {
            n3 = 1065353216;
            f8 = 1.0f;
        } else {
            f8 = this.o;
        }
        float f11 = this.p;
        boolean bl4 = Float.isNaN(f11);
        if (!bl4) {
            f6 = this.p;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        Drawable drawable2 = this.getDrawable();
        int n4 = drawable2.getIntrinsicWidth();
        float f12 = n4;
        Drawable drawable3 = this.getDrawable();
        int n7 = drawable3.getIntrinsicHeight();
        float f14 = n7;
        int n8 = this.getWidth();
        float f15 = n8;
        int n10 = this.getHeight();
        float f16 = n10;
        float f17 = f12 * f16;
        float f18 = f14 * f15;
        float f19 = f17 == f18 ? 0 : (f17 < f18 ? -1 : 1);
        f17 = f19 < 0 ? f15 / f12 : f16 / f14;
        matrix.postScale(f8 *= f17, f8);
        f17 = (f15 - (f12 *= f8)) * f5 + f15 - f12;
        f5 = 0.5f;
        f12 = ((f16 - (f8 *= f14)) * f7 + f16 - f8) * f5;
        matrix.postTranslate(f17 *= f5, f12);
        f5 = 2.0f;
        matrix.postRotate(f6, f15 /= f5, f16 /= f5);
        this.setImageMatrix(matrix);
        scaleType = ImageView.ScaleType.MATRIX;
        this.setScaleType(scaleType);
    }

    public final void f() {
        float f5 = this.m;
        boolean bl2 = Float.isNaN(f5);
        if (bl2 && (bl2 = Float.isNaN(f5 = this.n)) && (bl2 = Float.isNaN(f5 = this.o)) && (bl2 = Float.isNaN(f5 = this.p))) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            this.setScaleType(scaleType);
            return;
        }
        this.e();
    }

    public float getBrightness() {
        return this.a.d;
    }

    public float getContrast() {
        return this.a.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.m;
    }

    public float getImagePanY() {
        return this.n;
    }

    public float getImageRotate() {
        return this.p;
    }

    public float getImageZoom() {
        return this.o;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.a.e;
    }

    public float getWarmth() {
        return this.a.g;
    }

    public final void layout(int n3, int n4, int n7, int n8) {
        super.layout(n3, n4, n7, n8);
        this.e();
    }

    public void setAltImageDrawable(Drawable drawable2) {
        this.c = drawable2 = drawable2.mutate();
        Drawable drawable3 = this.d;
        Drawable[] drawableArray = this.k;
        drawableArray[0] = drawable3;
        drawableArray[1] = drawable2;
        drawable2 = new LayerDrawable(drawableArray);
        this.l = drawable2;
        super.setImageDrawable(drawable2);
        float f5 = this.e;
        this.setCrossfade(f5);
    }

    public void setAltImageResource(int n3) {
        Drawable drawable2;
        this.c = drawable2 = xn.a(this.getContext(), n3);
        this.setAltImageDrawable(drawable2);
    }

    public void setBrightness(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.d = f5;
        imageFilterView$c.a(this);
    }

    public void setContrast(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.f = f5;
        imageFilterView$c.a(this);
    }

    public void setCrossfade(float f5) {
        this.e = f5;
        LayerDrawable layerDrawable = this.k;
        if (layerDrawable != null) {
            int n3;
            float f6;
            boolean bl2 = this.b;
            int n4 = 1132396544;
            float f7 = 255.0f;
            if (!bl2) {
                layerDrawable = this.l.getDrawable(0);
                float f8 = this.e;
                f6 = (1.0f - f8) * f7;
                n3 = (int)f6;
                layerDrawable.setAlpha(n3);
            }
            layerDrawable = this.l;
            n3 = 1;
            layerDrawable = layerDrawable.getDrawable(n3);
            f6 = this.e * f7;
            n4 = (int)f6;
            layerDrawable.setAlpha(n4);
            layerDrawable = this.l;
            super.setImageDrawable((Drawable)layerDrawable);
        }
    }

    public void setImageDrawable(Drawable drawable2) {
        Drawable drawable3 = this.c;
        if (drawable3 != null && drawable2 != null) {
            this.d = drawable2 = drawable2.mutate();
            Drawable[] drawableArray = this.k;
            drawableArray[0] = drawable2;
            int n3 = 1;
            drawableArray[n3] = drawable3 = this.c;
            drawable2 = new LayerDrawable(drawableArray);
            this.l = drawable2;
            super.setImageDrawable(drawable2);
            float f5 = this.e;
            this.setCrossfade(f5);
        } else {
            super.setImageDrawable(drawable2);
        }
    }

    public void setImagePanX(float f5) {
        this.m = f5;
        this.f();
    }

    public void setImagePanY(float f5) {
        this.n = f5;
        this.f();
    }

    public void setImageResource(int n3) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            Drawable drawable3;
            this.d = drawable3 = xn.a(this.getContext(), n3).mutate();
            Drawable[] drawableArray = this.k;
            drawableArray[0] = drawable3;
            n3 = 1;
            drawableArray[n3] = drawable2 = this.c;
            drawable3 = new LayerDrawable(drawableArray);
            this.l = drawable3;
            super.setImageDrawable(drawable3);
            float f5 = this.e;
            this.setCrossfade(f5);
        } else {
            super.setImageResource(n3);
        }
    }

    public void setImageRotate(float f5) {
        this.p = f5;
        this.f();
    }

    public void setImageZoom(float f5) {
        this.o = f5;
        this.f();
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
            Object object2 = this.h;
            if (object2 == null) {
                this.h = object2 = new Path();
            }
            if ((object2 = this.j) == null) {
                object2 = new RectF();
                this.j = object2;
            }
            if ((object2 = this.i) == null) {
                object2 = new ImageFilterView$b(this);
                this.i = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(bl2);
            f12 = this.getWidth();
            n3 = this.getHeight();
            RectF rectF2 = this.j;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.h.reset();
            object2 = this.h;
            rectF = this.j;
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
            Object object2 = this.h;
            if (object2 == null) {
                this.h = object2 = new Path();
            }
            if ((object2 = this.j) == null) {
                object2 = new RectF();
                this.j = object2;
            }
            if ((object2 = this.i) == null) {
                object2 = new ImageFilterView$a(this);
                this.i = object2;
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
            RectF rectF2 = this.j;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.h.reset();
            object2 = this.h;
            rectF = this.j;
            direction = Path.Direction.CW;
            object2.addRoundRect(rectF, f8, f8, direction);
        } else {
            this.setClipToOutline(false);
        }
        if (object != false) {
            this.invalidateOutline();
        }
    }

    public void setSaturation(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.e = f5;
        imageFilterView$c.a(this);
    }

    public void setWarmth(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.g = f5;
        imageFilterView$c.a(this);
    }
}

