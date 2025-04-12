/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.util.AttributeSet
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class ShapeableImageView
extends AppCompatImageView
implements Shapeable {
    private static final int DEF_STYLE_RES = 0;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;
    private int rightContentPadding;
    private MaterialShapeDrawable shadowDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private int startContentPadding;
    private ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_ShapeableImageView;
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context object, AttributeSet attributeSet, int n3) {
        int n4;
        float f5;
        Object object2;
        int n7 = DEF_STYLE_RES;
        object = MaterialThemeOverlay.wrap(object, attributeSet, n3, n7);
        super((Context)object, attributeSet, n3);
        object = ShapeAppearancePathProvider.getInstance();
        this.pathProvider = object;
        super();
        this.path = object;
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context = this.getContext();
        this.clearPaint = object2 = new Paint();
        boolean bl2 = true;
        object2.setAntiAlias(bl2);
        object2.setColor(-1);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        object2.setXfermode((Xfermode)porterDuffXfermode);
        super();
        this.destination = object2;
        super();
        this.maskRect = object2;
        super();
        this.maskPath = object2;
        object2 = R$styleable.ShapeableImageView;
        object2 = context.obtainStyledAttributes(attributeSet, (int[])object2, n3, n7);
        this.setLayerType(2, null);
        int n8 = R$styleable.ShapeableImageView_strokeColor;
        porterDuffXfermode = MaterialResources.getColorStateList(context, (TypedArray)object2, n8);
        this.strokeColor = porterDuffXfermode;
        n8 = R$styleable.ShapeableImageView_strokeWidth;
        this.strokeWidth = f5 = (float)object2.getDimensionPixelSize(n8, 0);
        n8 = R$styleable.ShapeableImageView_contentPadding;
        this.leftContentPadding = n4 = object2.getDimensionPixelSize(n8, 0);
        this.topContentPadding = n4;
        this.rightContentPadding = n4;
        this.bottomContentPadding = n4;
        n8 = R$styleable.ShapeableImageView_contentPaddingLeft;
        this.leftContentPadding = n8 = object2.getDimensionPixelSize(n8, n4);
        n8 = R$styleable.ShapeableImageView_contentPaddingTop;
        this.topContentPadding = n8 = object2.getDimensionPixelSize(n8, n4);
        n8 = R$styleable.ShapeableImageView_contentPaddingRight;
        this.rightContentPadding = n8 = object2.getDimensionPixelSize(n8, n4);
        n8 = R$styleable.ShapeableImageView_contentPaddingBottom;
        this.bottomContentPadding = n4 = object2.getDimensionPixelSize(n8, n4);
        n4 = R$styleable.ShapeableImageView_contentPaddingStart;
        n8 = -1 << -1;
        this.startContentPadding = n4 = object2.getDimensionPixelSize(n4, n8);
        n4 = R$styleable.ShapeableImageView_contentPaddingEnd;
        this.endContentPadding = n4 = object2.getDimensionPixelSize(n4, n8);
        object2.recycle();
        super();
        this.borderPaint = object;
        object2 = Paint.Style.STROKE;
        object.setStyle((Paint.Style)object2);
        object.setAntiAlias(bl2);
        object = ShapeAppearanceModel.builder(context, attributeSet, n3, n7).build();
        this.shapeAppearanceModel = object;
        super(this);
        this.setOutlineProvider((ViewOutlineProvider)object);
    }

    public static /* synthetic */ ShapeAppearanceModel access$000(ShapeableImageView shapeableImageView) {
        return shapeableImageView.shapeAppearanceModel;
    }

    public static /* synthetic */ MaterialShapeDrawable access$100(ShapeableImageView shapeableImageView) {
        return shapeableImageView.shadowDrawable;
    }

    public static /* synthetic */ MaterialShapeDrawable access$102(ShapeableImageView shapeableImageView, MaterialShapeDrawable materialShapeDrawable) {
        shapeableImageView.shadowDrawable = materialShapeDrawable;
        return materialShapeDrawable;
    }

    public static /* synthetic */ RectF access$200(ShapeableImageView shapeableImageView) {
        return shapeableImageView.destination;
    }

    private void drawStroke(Canvas canvas) {
        ColorStateList colorStateList = this.strokeColor;
        if (colorStateList == null) {
            return;
        }
        colorStateList = this.borderPaint;
        float f5 = this.strokeWidth;
        colorStateList.setStrokeWidth(f5);
        colorStateList = this.strokeColor;
        Object object = this.getDrawableState();
        int n3 = this.strokeColor.getDefaultColor();
        int n4 = colorStateList.getColorForState(object, n3);
        f5 = this.strokeWidth;
        n3 = 0;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 > 0 && n4 != 0) {
            this.borderPaint.setColor(n4);
            colorStateList = this.path;
            object = this.borderPaint;
            canvas.drawPath((Path)colorStateList, (Paint)object);
        }
    }

    private boolean isContentPaddingRelative() {
        int n3 = this.startContentPadding;
        int n4 = -1 << -1;
        n3 = n3 == n4 && (n3 = this.endContentPadding) == n4 ? 0 : 1;
        return n3 != 0;
    }

    private boolean isRtl() {
        int n3;
        int n4 = this.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    private void updateShapeMask(int n3, int n4) {
        Object object = this.destination;
        float f5 = this.getPaddingLeft();
        float f6 = this.getPaddingTop();
        int n7 = this.getPaddingRight();
        float f7 = n3 - n7;
        int n8 = this.getPaddingBottom();
        float f8 = n4 - n8;
        object.set(f5, f6, f7, f8);
        object = this.pathProvider;
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        RectF rectF = this.destination;
        Path path = this.path;
        ((ShapeAppearancePathProvider)object).calculatePath(shapeAppearanceModel, 1.0f, rectF, path);
        this.maskPath.rewind();
        object = this.maskPath;
        shapeAppearanceModel = this.path;
        object.addPath((Path)shapeAppearanceModel);
        object = this.maskRect;
        float f11 = n3;
        float f12 = n4;
        object.set(0.0f, 0.0f, f11, f12);
        Path path2 = this.maskPath;
        RectF rectF2 = this.maskRect;
        object = Path.Direction.CCW;
        path2.addRect(rectF2, (Path.Direction)object);
    }

    public int getContentPaddingBottom() {
        return this.bottomContentPadding;
    }

    public final int getContentPaddingEnd() {
        int n3 = this.endContentPadding;
        int n4 = -1 << -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = (int)(this.isRtl() ? 1 : 0);
        n3 = n3 != 0 ? this.leftContentPadding : this.rightContentPadding;
        return n3;
    }

    public int getContentPaddingLeft() {
        int n3 = this.isContentPaddingRelative();
        if (n3 != 0) {
            n3 = this.isRtl();
            int n4 = -1 << -1;
            if (n3 != 0 && (n3 = this.endContentPadding) != n4) {
                return n3;
            }
            n3 = (int)(this.isRtl() ? 1 : 0);
            if (n3 == 0 && (n3 = this.startContentPadding) != n4) {
                return n3;
            }
        }
        return this.leftContentPadding;
    }

    public int getContentPaddingRight() {
        int n3 = this.isContentPaddingRelative();
        if (n3 != 0) {
            n3 = this.isRtl();
            int n4 = -1 << -1;
            if (n3 != 0 && (n3 = this.startContentPadding) != n4) {
                return n3;
            }
            n3 = (int)(this.isRtl() ? 1 : 0);
            if (n3 == 0 && (n3 = this.endContentPadding) != n4) {
                return n3;
            }
        }
        return this.rightContentPadding;
    }

    public final int getContentPaddingStart() {
        int n3 = this.startContentPadding;
        int n4 = -1 << -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = (int)(this.isRtl() ? 1 : 0);
        n3 = n3 != 0 ? this.rightContentPadding : this.leftContentPadding;
        return n3;
    }

    public int getContentPaddingTop() {
        return this.topContentPadding;
    }

    public int getPaddingBottom() {
        int n3 = super.getPaddingBottom();
        int n4 = this.getContentPaddingBottom();
        return n3 - n4;
    }

    public int getPaddingEnd() {
        int n3 = super.getPaddingEnd();
        int n4 = this.getContentPaddingEnd();
        return n3 - n4;
    }

    public int getPaddingLeft() {
        int n3 = super.getPaddingLeft();
        int n4 = this.getContentPaddingLeft();
        return n3 - n4;
    }

    public int getPaddingRight() {
        int n3 = super.getPaddingRight();
        int n4 = this.getContentPaddingRight();
        return n3 - n4;
    }

    public int getPaddingStart() {
        int n3 = super.getPaddingStart();
        int n4 = this.getContentPaddingStart();
        return n3 - n4;
    }

    public int getPaddingTop() {
        int n3 = super.getPaddingTop();
        int n4 = this.getContentPaddingTop();
        return n3 - n4;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.maskPath;
        Paint paint = this.clearPaint;
        canvas.drawPath(path, paint);
        this.drawStroke(canvas);
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = (int)(this.hasAdjustedPaddingAfterLayoutDirectionResolved ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        n3 = (int)(this.isLayoutDirectionResolved() ? 1 : 0);
        if (n3 == 0) {
            return;
        }
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
        n3 = (int)(this.isPaddingRelative() ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(this.isContentPaddingRelative() ? 1 : 0)) == 0) {
            n3 = super.getPaddingLeft();
            n4 = super.getPaddingTop();
            int n7 = super.getPaddingRight();
            int n8 = super.getPaddingBottom();
            this.setPadding(n3, n4, n7, n8);
            return;
        }
        n3 = super.getPaddingStart();
        n4 = super.getPaddingTop();
        int n10 = super.getPaddingEnd();
        int n14 = super.getPaddingBottom();
        this.setPaddingRelative(n3, n4, n10, n14);
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        this.updateShapeMask(n3, n4);
    }

    public void setContentPadding(int n3, int n4, int n7, int n8) {
        int n10;
        this.startContentPadding = n10 = -1 << -1;
        this.endContentPadding = n10;
        n10 = super.getPaddingLeft();
        int n14 = this.leftContentPadding;
        n10 = n10 - n14 + n3;
        n14 = super.getPaddingTop();
        int n15 = this.topContentPadding;
        n14 = n14 - n15 + n4;
        n15 = super.getPaddingRight();
        int n16 = this.rightContentPadding;
        n15 = n15 - n16 + n7;
        n16 = super.getPaddingBottom();
        int n17 = this.bottomContentPadding;
        n16 = n16 - n17 + n8;
        super.setPadding(n10, n14, n15, n16);
        this.leftContentPadding = n3;
        this.topContentPadding = n4;
        this.rightContentPadding = n7;
        this.bottomContentPadding = n8;
    }

    public void setContentPaddingRelative(int n3, int n4, int n7, int n8) {
        int n10 = super.getPaddingStart();
        int n14 = this.getContentPaddingStart();
        n10 = n10 - n14 + n3;
        n14 = super.getPaddingTop();
        int n15 = this.topContentPadding;
        n14 = n14 - n15 + n4;
        n15 = super.getPaddingEnd();
        int n16 = this.getContentPaddingEnd();
        n15 = n15 - n16 + n7;
        n16 = super.getPaddingBottom();
        int n17 = this.bottomContentPadding;
        n16 = n16 - n17 + n8;
        super.setPaddingRelative(n10, n14, n15, n16);
        n10 = (int)(this.isRtl() ? 1 : 0);
        n10 = n10 != 0 ? n7 : n3;
        this.leftContentPadding = n10;
        this.topContentPadding = n4;
        n4 = (int)(this.isRtl() ? 1 : 0);
        if (n4 == 0) {
            n3 = n7;
        }
        this.rightContentPadding = n3;
        this.bottomContentPadding = n8;
    }

    public void setPadding(int n3, int n4, int n7, int n8) {
        int n10 = this.getContentPaddingLeft() + n3;
        n3 = this.getContentPaddingTop() + n4;
        n4 = this.getContentPaddingRight() + n7;
        n7 = this.getContentPaddingBottom() + n8;
        super.setPadding(n10, n3, n4, n7);
    }

    public void setPaddingRelative(int n3, int n4, int n7, int n8) {
        int n10 = this.getContentPaddingStart() + n3;
        n3 = this.getContentPaddingTop() + n4;
        n4 = this.getContentPaddingEnd() + n7;
        n7 = this.getContentPaddingBottom() + n8;
        super.setPaddingRelative(n10, n3, n4, n7);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shadowDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        this.updateShapeMask(n3, n4);
        this.invalidate();
        this.invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        this.invalidate();
    }

    public void setStrokeColorResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.getContext(), n3);
        this.setStrokeColor(colorStateList);
    }

    public void setStrokeWidth(float f5) {
        float f6 = this.strokeWidth;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.strokeWidth = f5;
            this.invalidate();
        }
    }

    public void setStrokeWidthResource(int n3) {
        float f5 = this.getResources().getDimensionPixelSize(n3);
        this.setStrokeWidth(f5);
    }
}

