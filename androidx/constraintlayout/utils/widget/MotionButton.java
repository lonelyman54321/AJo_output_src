/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.view.ViewOutlineProvider
 */
package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.utils.widget.MotionButton$a;
import androidx.constraintlayout.utils.widget.MotionButton$b;
import androidx.constraintlayout.widget.R$styleable;

public class MotionButton
extends AppCompatButton {
    public float a = 0.0f;
    public float b = 0.0f / 0.0f;
    public Path c;
    public ViewOutlineProvider d;
    public RectF e;

    public MotionButton(Context context) {
        super(context);
        this.setPadding(0, 0, 0, 0);
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            int[] nArray = R$styleable.ImageFilterView;
            context = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = context.getIndexCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                int n4;
                int n7 = context.getIndex(i3);
                if (n7 == (n4 = R$styleable.ImageFilterView_round)) {
                    f5 = context.getDimension(n7, 0.0f);
                    this.setRound(f5);
                    continue;
                }
                n4 = R$styleable.ImageFilterView_roundPercent;
                if (n7 != n4) continue;
                f5 = context.getFloat(n7, 0.0f);
                this.setRoundPercent(f5);
            }
            context.recycle();
        }
    }

    public float getRound() {
        return this.b;
    }

    public float getRoundPercent() {
        return this.a;
    }

    public void setRound(float f5) {
        Object object = Float.isNaN(f5);
        if (object) {
            this.b = f5;
            f5 = this.a;
            this.a = -1.0f;
            this.setRoundPercent(f5);
            return;
        }
        float f6 = this.b;
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
        this.b = f5;
        Path.Direction direction = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            Object object2 = this.c;
            if (object2 == null) {
                this.c = object2 = new Path();
            }
            if ((object2 = this.e) == null) {
                object2 = new RectF();
                this.e = object2;
            }
            if ((object2 = this.d) == null) {
                object2 = new MotionButton$b(this);
                this.d = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(bl2);
            f12 = this.getWidth();
            n3 = this.getHeight();
            RectF rectF2 = this.e;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.c.reset();
            object2 = this.c;
            rectF = this.e;
            f8 = this.b;
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
        float f6 = this.a;
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
        this.a = f5;
        Path.Direction direction = null;
        float f11 = f5 - 0.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (f12 != false) {
            Object object2 = this.c;
            if (object2 == null) {
                this.c = object2 = new Path();
            }
            if ((object2 = this.e) == null) {
                object2 = new RectF();
                this.e = object2;
            }
            if ((object2 = this.d) == null) {
                object2 = new MotionButton$a(this);
                this.d = object2;
                this.setOutlineProvider((ViewOutlineProvider)object2);
            }
            this.setClipToOutline(n4 != 0);
            f12 = this.getWidth();
            n3 = this.getHeight();
            n4 = Math.min((int)f12, n3);
            f8 = n4;
            float f14 = this.a;
            f8 *= f14;
            f14 = 2.0f;
            f8 /= f14;
            RectF rectF2 = this.e;
            f5 = f12;
            f7 = n3;
            rectF2.set(0.0f, 0.0f, f5, f7);
            this.c.reset();
            object2 = this.c;
            rectF = this.e;
            direction = Path.Direction.CW;
            object2.addRoundRect(rectF, f8, f8, direction);
        } else {
            this.setClipToOutline(false);
        }
        if (object != false) {
            this.invalidateOutline();
        }
    }
}

