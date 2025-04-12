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
 *  android.widget.ImageView
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterButton$a;
import androidx.constraintlayout.utils.widget.ImageFilterButton$b;
import androidx.constraintlayout.utils.widget.ImageFilterView$c;
import androidx.constraintlayout.widget.R$styleable;

public class ImageFilterButton
extends AppCompatImageButton {
    public final ImageFilterView$c a;
    public float b;
    public float c;
    public float d;
    public Path e;
    public ViewOutlineProvider f;
    public RectF g;
    public final Drawable[] h;
    public LayerDrawable i;
    public boolean j;
    public Drawable k;
    public Drawable l;
    public float m;
    public float n;
    public float o;
    public float p;

    public ImageFilterButton(Context object) {
        super((Context)object);
        float f5;
        super();
        this.a = object;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = f5 = 0.0f / 0.0f;
        Drawable[] drawableArray = new Drawable[2];
        this.h = drawableArray;
        this.j = true;
        this.k = null;
        this.l = null;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.setPadding(0, 0, 0, 0);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        ImageFilterView$c imageFilterView$c;
        this.a = imageFilterView$c = new ImageFilterView$c();
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = f5 = 0.0f / 0.0f;
        Drawable[] drawableArray = new Drawable[2];
        this.h = drawableArray;
        this.j = true;
        this.k = null;
        this.l = null;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        float f5;
        ImageFilterView$c imageFilterView$c;
        this.a = imageFilterView$c = new ImageFilterView$c();
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = f5 = 0.0f / 0.0f;
        Drawable[] drawableArray = new Drawable[2];
        this.h = drawableArray;
        this.j = true;
        this.k = null;
        this.l = null;
        this.m = f5;
        this.n = f5;
        this.o = f5;
        this.p = f5;
        this.a(context, attributeSet);
    }

    private void setOverlay(boolean bl2) {
        this.j = bl2;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        float f5 = 0.0f;
        this.setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            Object object = R$styleable.ImageFilterView;
            context = context.obtainStyledAttributes(attributeSet, object);
            int n3 = context.getIndexCount();
            int n4 = R$styleable.ImageFilterView_altSrc;
            object = context.getDrawable(n4);
            this.k = (Drawable)object;
            float f6 = 0.0f;
            object = null;
            for (n4 = 0; n4 < n3; ++n4) {
                float f7;
                float f8;
                int n7;
                int n8 = context.getIndex(n4);
                if (n8 == (n7 = R$styleable.ImageFilterView_crossfade)) {
                    this.b = f8 = context.getFloat(n8, 0.0f);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_warmth;
                if (n8 == n7) {
                    f8 = context.getFloat(n8, 0.0f);
                    this.setWarmth(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_saturation;
                if (n8 == n7) {
                    f8 = context.getFloat(n8, 0.0f);
                    this.setSaturation(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_contrast;
                if (n8 == n7) {
                    f8 = context.getFloat(n8, 0.0f);
                    this.setContrast(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_round;
                if (n8 == n7) {
                    f8 = context.getDimension(n8, 0.0f);
                    this.setRound(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_roundPercent;
                if (n8 == n7) {
                    f8 = context.getFloat(n8, 0.0f);
                    this.setRoundPercent(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_overlay;
                if (n8 == n7) {
                    n7 = (int)(this.j ? 1 : 0);
                    n8 = (int)(context.getBoolean(n8, n7 != 0) ? 1 : 0);
                    this.setOverlay(n8 != 0);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_imagePanX;
                if (n8 == n7) {
                    f7 = this.m;
                    f8 = context.getFloat(n8, f7);
                    this.setImagePanX(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_imagePanY;
                if (n8 == n7) {
                    f7 = this.n;
                    f8 = context.getFloat(n8, f7);
                    this.setImagePanY(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_imageRotate;
                if (n8 == n7) {
                    f7 = this.p;
                    f8 = context.getFloat(n8, f7);
                    this.setImageRotate(f8);
                    continue;
                }
                n7 = R$styleable.ImageFilterView_imageZoom;
                if (n8 != n7) continue;
                f7 = this.o;
                f8 = context.getFloat(n8, f7);
                this.setImageZoom(f8);
            }
            context.recycle();
            context = this.getDrawable();
            this.l = context;
            attributeSet = this.k;
            object = this.h;
            if (attributeSet != null && context != null) {
                context = this.getDrawable().mutate();
                this.l = context;
                object[0] = (int)context;
                context = this.k.mutate();
                n3 = 1;
                object[n3] = (int)context;
                context = new LayerDrawable((Drawable[])object);
                this.i = context;
                context = context.getDrawable(n3);
                float f11 = this.b;
                n4 = 1132396544;
                f6 = 255.0f;
                n3 = (int)(f11 *= f6);
                context.setAlpha(n3);
                boolean bl2 = this.j;
                if (!bl2) {
                    context = this.i.getDrawable(0);
                    f5 = this.b;
                    f11 = (1.0f - f5) * f6;
                    n3 = (int)f11;
                    context.setAlpha(n3);
                }
                context = this.i;
                super.setImageDrawable((Drawable)context);
            } else {
                context = this.getDrawable();
                this.l = context;
                if (context != null) {
                    context = context.mutate();
                    this.l = context;
                    object[0] = (int)context;
                }
            }
        }
    }

    public final void b() {
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

    public final void c() {
        float f5 = this.m;
        boolean bl2 = Float.isNaN(f5);
        if (bl2 && (bl2 = Float.isNaN(f5 = this.n)) && (bl2 = Float.isNaN(f5 = this.o)) && (bl2 = Float.isNaN(f5 = this.p))) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            this.setScaleType(scaleType);
            return;
        }
        this.b();
    }

    public float getContrast() {
        return this.a.f;
    }

    public float getCrossfade() {
        return this.b;
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
        return this.d;
    }

    public float getRoundPercent() {
        return this.c;
    }

    public float getSaturation() {
        return this.a.e;
    }

    public float getWarmth() {
        return this.a.g;
    }

    public final void layout(int n3, int n4, int n7, int n8) {
        super.layout(n3, n4, n7, n8);
        this.b();
    }

    public void setAltImageResource(int n3) {
        Drawable drawable2;
        this.k = drawable2 = xn.a(this.getContext(), n3).mutate();
        Drawable drawable3 = this.l;
        Drawable[] drawableArray = this.h;
        drawableArray[0] = drawable3;
        drawableArray[1] = drawable2;
        drawable2 = new LayerDrawable(drawableArray);
        this.i = drawable2;
        super.setImageDrawable(drawable2);
        float f5 = this.b;
        this.setCrossfade(f5);
    }

    public void setBrightness(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.d = f5;
        imageFilterView$c.a((ImageView)this);
    }

    public void setContrast(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.f = f5;
        imageFilterView$c.a((ImageView)this);
    }

    public void setCrossfade(float f5) {
        this.b = f5;
        LayerDrawable layerDrawable = this.h;
        if (layerDrawable != null) {
            int n3;
            float f6;
            boolean bl2 = this.j;
            int n4 = 1132396544;
            float f7 = 255.0f;
            if (!bl2) {
                layerDrawable = this.i.getDrawable(0);
                float f8 = this.b;
                f6 = (1.0f - f8) * f7;
                n3 = (int)f6;
                layerDrawable.setAlpha(n3);
            }
            layerDrawable = this.i;
            n3 = 1;
            layerDrawable = layerDrawable.getDrawable(n3);
            f6 = this.b * f7;
            n4 = (int)f6;
            layerDrawable.setAlpha(n4);
            layerDrawable = this.i;
            super.setImageDrawable((Drawable)layerDrawable);
        }
    }

    public void setImageDrawable(Drawable drawable2) {
        Drawable drawable3 = this.k;
        if (drawable3 != null && drawable2 != null) {
            this.l = drawable2 = drawable2.mutate();
            Drawable[] drawableArray = this.h;
            drawableArray[0] = drawable2;
            int n3 = 1;
            drawableArray[n3] = drawable3 = this.k;
            drawable2 = new LayerDrawable(drawableArray);
            this.i = drawable2;
            super.setImageDrawable(drawable2);
            float f5 = this.b;
            this.setCrossfade(f5);
        } else {
            super.setImageDrawable(drawable2);
        }
    }

    public void setImagePanX(float f5) {
        this.m = f5;
        this.c();
    }

    public void setImagePanY(float f5) {
        this.n = f5;
        this.c();
    }

    public void setImageResource(int n3) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            Drawable drawable3;
            this.l = drawable3 = xn.a(this.getContext(), n3).mutate();
            Drawable[] drawableArray = this.h;
            drawableArray[0] = drawable3;
            n3 = 1;
            drawableArray[n3] = drawable2 = this.k;
            drawable3 = new LayerDrawable(drawableArray);
            this.i = drawable3;
            super.setImageDrawable(drawable3);
            float f5 = this.b;
            this.setCrossfade(f5);
        } else {
            super.setImageResource(n3);
        }
    }

    public void setImageRotate(float f5) {
        this.p = f5;
        this.c();
    }

    public void setImageZoom(float f5) {
        this.o = f5;
        this.c();
    }

    public void setRound(float f5) {
        Object object = Float.isNaN(f5);
        if (object) {
            this.d = f5;
            f5 = this.c;
            this.c = -1.0f;
            this.setRoundPercent(f5);
            return;
        }
        float f6 = this.d;
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
        this.d = f5;
        Path.Direction direction = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            Object object2 = this.e;
            if (object2 == null) {
                this.e = object2 = new Path();
            }
            if ((object2 = this.g) == null) {
                object2 = new RectF();
                this.g = object2;
            }
            if ((object2 = this.f) == null) {
                object2 = new ImageFilterButton$b(this);
                this.f = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(bl2);
            f12 = this.getWidth();
            n3 = this.getHeight();
            RectF rectF2 = this.g;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.e.reset();
            object2 = this.e;
            rectF = this.g;
            f8 = this.d;
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
        float f6 = this.c;
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
        this.c = f5;
        Path.Direction direction = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            Object object2 = this.e;
            if (object2 == null) {
                this.e = object2 = new Path();
            }
            if ((object2 = this.g) == null) {
                object2 = new RectF();
                this.g = object2;
            }
            if ((object2 = this.f) == null) {
                object2 = new ImageFilterButton$a(this);
                this.f = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(n4 != 0);
            f12 = this.getWidth();
            n3 = this.getHeight();
            n4 = Math.min((int)f12, n3);
            f8 = n4;
            float f14 = this.c;
            f8 *= f14;
            f14 = 2.0f;
            f8 /= f14;
            RectF rectF2 = this.g;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.e.reset();
            object2 = this.e;
            rectF = this.g;
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
        imageFilterView$c.a((ImageView)this);
    }

    public void setWarmth(float f5) {
        ImageFilterView$c imageFilterView$c = this.a;
        imageFilterView$c.g = f5;
        imageFilterView$c.a((ImageView)this);
    }
}

