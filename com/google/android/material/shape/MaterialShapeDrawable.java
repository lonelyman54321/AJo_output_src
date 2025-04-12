/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Region
 *  android.graphics.Region$Op
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.AttributeSet
 */
package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable$2;
import com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapeAppearancePathProvider$PathListener;
import com.google.android.material.shape.ShapePath$ShadowCompatOperation;
import com.google.android.material.shape.ShapePathModel;
import com.google.android.material.shape.Shapeable;
import java.util.BitSet;
import java.util.Objects;

public class MaterialShapeDrawable
extends Drawable
implements Pn3,
Shapeable {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = "MaterialShapeDrawable";
    private static final Paint clearPaint;
    private final BitSet containsIncompatibleShadowOp;
    private final ShapePath$ShadowCompatOperation[] cornerShadowOperation;
    private MaterialShapeDrawable$MaterialShapeDrawableState drawableState;
    private final ShapePath$ShadowCompatOperation[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private final Matrix matrix;
    private final Path path;
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final ShapeAppearancePathProvider pathProvider;
    private final ShapeAppearancePathProvider$PathListener pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final ShadowRenderer shadowRenderer;
    private final Paint strokePaint;
    private ShapeAppearanceModel strokeShapeAppearance;
    private PorterDuffColorFilter strokeTintFilter;
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    static {
        Paint paint;
        clearPaint = paint = new Paint(1);
        paint.setColor(-1);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode);
        paint.setXfermode((Xfermode)porterDuffXfermode);
    }

    public MaterialShapeDrawable() {
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        this(shapeAppearanceModel);
    }

    public MaterialShapeDrawable(Context object, AttributeSet attributeSet, int n3, int n4) {
        object = ShapeAppearanceModel.builder(object, attributeSet, n3, n4).build();
        this((ShapeAppearanceModel)object);
    }

    public MaterialShapeDrawable(MaterialShapeDrawable$MaterialShapeDrawableState object) {
        Paint paint;
        int n3 = 4;
        ShapePath$ShadowCompatOperation[] shapePath$ShadowCompatOperationArray = new ShapePath$ShadowCompatOperation[n3];
        this.cornerShadowOperation = shapePath$ShadowCompatOperationArray;
        Matrix matrix = new ShapePath$ShadowCompatOperation[n3];
        this.edgeShadowOperation = matrix;
        super(8);
        this.containsIncompatibleShadowOp = matrix;
        this.matrix = matrix = new Matrix();
        super();
        this.path = matrix;
        super();
        this.pathInsetByStroke = matrix;
        super();
        this.rectF = matrix;
        super();
        this.insetRectF = matrix;
        super();
        this.transparentRegion = matrix;
        super();
        this.scratchRegion = matrix;
        int n4 = 1;
        super(n4);
        this.fillPaint = matrix;
        this.strokePaint = paint = new Paint(n4);
        Object object2 = new ShadowRenderer();
        this.shadowRenderer = object2;
        object2 = Looper.getMainLooper().getThread();
        Thread thread2 = Thread.currentThread();
        object2 = object2 == thread2 ? ShapeAppearancePathProvider.getInstance() : new ShapeAppearancePathProvider();
        this.pathProvider = object2;
        object2 = new RectF();
        this.pathBounds = object2;
        this.shadowBitmapDrawingEnable = n4;
        this.drawableState = object;
        object = Paint.Style.STROKE;
        paint.setStyle((Paint.Style)object);
        object = Paint.Style.FILL;
        matrix.setStyle((Paint.Style)object);
        this.updateTintFilter();
        object = this.getState();
        this.updateColorsForState((int[])object);
        super(this);
        this.pathShadowListener = object;
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = new MaterialShapeDrawable$MaterialShapeDrawableState(shapeAppearanceModel, null);
        this(materialShapeDrawable$MaterialShapeDrawableState);
    }

    public MaterialShapeDrawable(ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel)shapePathModel);
    }

    public static /* synthetic */ BitSet access$000(MaterialShapeDrawable materialShapeDrawable) {
        return materialShapeDrawable.containsIncompatibleShadowOp;
    }

    public static /* synthetic */ ShapePath$ShadowCompatOperation[] access$100(MaterialShapeDrawable materialShapeDrawable) {
        return materialShapeDrawable.cornerShadowOperation;
    }

    public static /* synthetic */ ShapePath$ShadowCompatOperation[] access$200(MaterialShapeDrawable materialShapeDrawable) {
        return materialShapeDrawable.edgeShadowOperation;
    }

    public static /* synthetic */ boolean access$302(MaterialShapeDrawable materialShapeDrawable, boolean bl2) {
        materialShapeDrawable.pathDirty = bl2;
        return bl2;
    }

    private PorterDuffColorFilter calculatePaintColorTintFilter(Paint paint, boolean n3) {
        if (n3 != 0) {
            int n4 = paint.getColor();
            n3 = this.compositeElevationOverlayIfNeeded(n4);
            this.resolvedTintColor = n3;
            if (n3 != n4) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint = new PorterDuffColorFilter(n3, mode);
                return paint;
            }
        }
        return null;
    }

    private void calculatePath(RectF rectF, Path path) {
        this.calculatePathForSize(rectF, path);
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        float f5 = materialShapeDrawable$MaterialShapeDrawableState.scale;
        float f6 = 1.0f;
        float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (f7 != false) {
            this.matrix.reset();
            materialShapeDrawable$MaterialShapeDrawableState = this.matrix;
            MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState2 = this.drawableState;
            f6 = materialShapeDrawable$MaterialShapeDrawableState2.scale;
            float f8 = rectF.width();
            float f11 = 2.0f;
            float f12 = rectF.height() / f11;
            materialShapeDrawable$MaterialShapeDrawableState.setScale(f6, f6, f8 /= f11, f12);
            rectF = this.matrix;
            path.transform((Matrix)rectF);
        }
        rectF = this.pathBounds;
        path.computeBounds(rectF, true);
    }

    private void calculateStrokePath() {
        ShapeAppearanceModel shapeAppearanceModel;
        float f5 = -this.getStrokeInsetLength();
        Object object = this.getShapeAppearanceModel();
        MaterialShapeDrawable$2 materialShapeDrawable$2 = new MaterialShapeDrawable$2(this, f5);
        this.strokeShapeAppearance = shapeAppearanceModel = ((ShapeAppearanceModel)object).withTransformedCornerSizes(materialShapeDrawable$2);
        object = this.pathProvider;
        float f6 = this.drawableState.interpolation;
        RectF rectF = this.getBoundsInsetByStroke();
        Path path = this.pathInsetByStroke;
        ((ShapeAppearancePathProvider)object).calculatePath(shapeAppearanceModel, f6, rectF, path);
    }

    private PorterDuffColorFilter calculateTintColorTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, boolean bl2) {
        int[] nArray = this.getState();
        int n3 = colorStateList.getColorForState(nArray, 0);
        if (bl2) {
            n3 = this.compositeElevationOverlayIfNeeded(n3);
        }
        this.resolvedTintColor = n3;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(n3, mode);
        return porterDuffColorFilter;
    }

    private PorterDuffColorFilter calculateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean bl2) {
        colorStateList = colorStateList != null && mode != null ? this.calculateTintColorTintFilter(colorStateList, mode, bl2) : this.calculatePaintColorTintFilter(paint, bl2);
        return colorStateList;
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return MaterialShapeDrawable.createWithElevationOverlay(context, 0.0f);
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f5) {
        return MaterialShapeDrawable.createWithElevationOverlay(context, f5, null);
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f5, ColorStateList colorStateList) {
        Object object;
        if (colorStateList == null) {
            int n3 = R$attr.colorSurface;
            object = TAG;
            n3 = MaterialColors.getColor(context, n3, (String)object);
            colorStateList = ColorStateList.valueOf((int)n3);
        }
        object = new MaterialShapeDrawable();
        ((MaterialShapeDrawable)object).initializeElevationOverlay(context);
        ((MaterialShapeDrawable)object).setFillColor(colorStateList);
        ((MaterialShapeDrawable)object).setElevation(f5);
        return object;
    }

    private void drawCompatShadow(Canvas canvas) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState;
        int n3;
        ShadowRenderer shadowRenderer;
        float f5;
        int n4;
        Object object;
        this.containsIncompatibleShadowOp.cardinality();
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState2 = this.drawableState;
        int n7 = materialShapeDrawable$MaterialShapeDrawableState2.shadowCompatOffset;
        if (n7 != 0) {
            materialShapeDrawable$MaterialShapeDrawableState2 = this.path;
            object = this.shadowRenderer.getShadowPaint();
            canvas.drawPath((Path)materialShapeDrawable$MaterialShapeDrawableState2, (Paint)object);
        }
        n7 = 0;
        float f6 = 0.0f;
        materialShapeDrawable$MaterialShapeDrawableState2 = null;
        while (true) {
            n4 = 4;
            f5 = 5.6E-45f;
            if (n7 >= n4) break;
            object = this.cornerShadowOperation[n7];
            shadowRenderer = this.shadowRenderer;
            n3 = this.drawableState.shadowCompatRadius;
            ((ShapePath$ShadowCompatOperation)object).draw(shadowRenderer, n3, canvas);
            object = this.edgeShadowOperation[n7];
            shadowRenderer = this.shadowRenderer;
            materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
            n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRadius;
            ((ShapePath$ShadowCompatOperation)object).draw(shadowRenderer, n3, canvas);
            ++n7;
        }
        n7 = (int)(this.shadowBitmapDrawingEnable ? 1 : 0);
        if (n7 != 0) {
            n7 = this.getShadowOffsetX();
            n4 = this.getShadowOffsetY();
            int n8 = -n7;
            float f7 = n8;
            n3 = -n4;
            float f8 = n3;
            canvas.translate(f7, f8);
            shadowRenderer = this.path;
            materialShapeDrawable$MaterialShapeDrawableState = clearPaint;
            canvas.drawPath((Path)shadowRenderer, (Paint)materialShapeDrawable$MaterialShapeDrawableState);
            f6 = n7;
            f5 = n4;
            canvas.translate(f6, f5);
        }
    }

    private void drawFillShape(Canvas canvas) {
        Paint paint = this.fillPaint;
        Path path = this.path;
        ShapeAppearanceModel shapeAppearanceModel = this.drawableState.shapeAppearanceModel;
        RectF rectF = this.getBoundsAsRectF();
        this.drawShape(canvas, paint, path, shapeAppearanceModel, rectF);
    }

    private void drawShape(Canvas canvas, Paint paint, Path object, ShapeAppearanceModel object2, RectF rectF) {
        boolean bl2 = object2.isRoundRect(rectF);
        if (bl2) {
            object = object2.getTopRightCornerSize();
            float f5 = object.getCornerSize(rectF);
            object2 = this.drawableState;
            float f6 = ((MaterialShapeDrawable$MaterialShapeDrawableState)((Object)object2)).interpolation;
            canvas.drawRoundRect(rectF, f5 *= f6, f5, paint);
        } else {
            canvas.drawPath((Path)object, paint);
        }
    }

    private RectF getBoundsInsetByStroke() {
        RectF rectF = this.insetRectF;
        RectF rectF2 = this.getBoundsAsRectF();
        rectF.set(rectF2);
        float f5 = this.getStrokeInsetLength();
        this.insetRectF.inset(f5, f5);
        return this.insetRectF;
    }

    private float getStrokeInsetLength() {
        boolean bl2 = this.hasStroke();
        if (bl2) {
            return this.strokePaint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean hasCompatShadow() {
        int n3;
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n4 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatMode;
        int n7 = 1;
        if (n4 == n7 || (n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRadius) <= 0 || n4 != (n3 = 2) && (n3 = (int)(this.requiresCompatShadow() ? 1 : 0)) == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    private boolean hasFill() {
        boolean bl2;
        Paint.Style style2 = this.drawableState.paintStyle;
        Paint.Style style3 = Paint.Style.FILL_AND_STROKE;
        if (style2 != style3 && style2 != (style3 = Paint.Style.FILL)) {
            bl2 = false;
            style2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean hasStroke() {
        void var4_7;
        Paint.Style style2 = this.drawableState.paintStyle;
        Paint.Style style3 = Paint.Style.FILL_AND_STROKE;
        if (style2 == style3 || style2 == (style3 = Paint.Style.STROKE)) {
            style2 = this.strokePaint;
            float f5 = style2.getStrokeWidth();
            style3 = null;
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object > 0) {
                return (boolean)var4_7;
            }
        }
        boolean bl2 = false;
        return (boolean)var4_7;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private void maybeDrawCompatShadow(Canvas object) {
        int n3 = this.hasCompatShadow();
        if (n3 == 0) {
            return;
        }
        object.save();
        this.prepareCanvasForShadow((Canvas)object);
        n3 = this.shadowBitmapDrawingEnable;
        if (n3 == 0) {
            this.drawCompatShadow((Canvas)object);
            object.restore();
            return;
        }
        RectF rectF = this.pathBounds;
        float f5 = rectF.width();
        float f6 = this.getBounds().width();
        n3 = (int)(f5 -= f6);
        RectF rectF2 = this.pathBounds;
        f6 = rectF2.height();
        Rect rect = this.getBounds();
        int n4 = rect.height();
        float f7 = n4;
        int n7 = (int)(f6 -= f7);
        if (n3 >= 0 && n7 >= 0) {
            n4 = (int)this.pathBounds.width();
            int n8 = this.drawableState.shadowCompatRadius;
            int n10 = 2;
            n4 = a60.a(n8, n10, n4, n3);
            n8 = (int)this.pathBounds.height();
            n8 = a60.a(this.drawableState.shadowCompatRadius, n10, n8, n7);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            rect = Bitmap.createBitmap((int)n4, (int)n8, (Bitmap.Config)config);
            Canvas canvas = new Canvas((Bitmap)rect);
            n10 = this.getBounds().left;
            int n14 = this.drawableState.shadowCompatRadius;
            f5 = n10 - n14 - n3;
            n10 = this.getBounds().top;
            n14 = this.drawableState.shadowCompatRadius;
            f6 = n10 - n14 - n7;
            float f8 = -f5;
            float f11 = -f6;
            canvas.translate(f8, f11);
            this.drawCompatShadow(canvas);
            object.drawBitmap((Bitmap)rect, f5, f6, null);
            rect.recycle();
            object.restore();
            return;
        }
        object = new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        throw object;
    }

    private static int modulateAlpha(int n3, int n4) {
        int n7 = n4 >>> 7;
        return (n4 + n7) * n3 >>> 8;
    }

    private void prepareCanvasForShadow(Canvas canvas) {
        int n3 = this.getShadowOffsetX();
        int n4 = this.getShadowOffsetY();
        float f5 = n3;
        float f6 = n4;
        canvas.translate(f5, f6);
    }

    private boolean updateColorsForState(int[] nArray) {
        ColorStateList colorStateList;
        int n3;
        ColorStateList colorStateList2;
        int n4;
        int n7;
        ColorStateList colorStateList3 = this.drawableState.fillColor;
        int n8 = 1;
        if (colorStateList3 != null && (n7 = (colorStateList3 = this.fillPaint).getColor()) != (n4 = (colorStateList2 = this.drawableState.fillColor).getColorForState(nArray, n7))) {
            colorStateList3 = this.fillPaint;
            colorStateList3.setColor(n4);
            n7 = 1;
        } else {
            n7 = 0;
            colorStateList3 = null;
        }
        colorStateList2 = this.drawableState.strokeColor;
        if (colorStateList2 != null && (n4 = (colorStateList2 = this.strokePaint).getColor()) != (n3 = (colorStateList = this.drawableState.strokeColor).getColorForState(nArray, n4))) {
            colorStateList3 = this.strokePaint;
            colorStateList3.setColor(n3);
        } else {
            n8 = n7;
        }
        return n8 != 0;
    }

    private boolean updateTintFilter() {
        boolean bl2;
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        Object object = materialShapeDrawable$MaterialShapeDrawableState.tintList;
        materialShapeDrawable$MaterialShapeDrawableState = materialShapeDrawable$MaterialShapeDrawableState.tintMode;
        Object object2 = this.fillPaint;
        boolean bl3 = true;
        materialShapeDrawable$MaterialShapeDrawableState = this.calculateTintFilter((ColorStateList)object, (PorterDuff.Mode)materialShapeDrawable$MaterialShapeDrawableState, (Paint)object2, bl3);
        this.tintFilter = materialShapeDrawable$MaterialShapeDrawableState;
        materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        object = materialShapeDrawable$MaterialShapeDrawableState.strokeTintList;
        materialShapeDrawable$MaterialShapeDrawableState = materialShapeDrawable$MaterialShapeDrawableState.tintMode;
        object2 = this.strokePaint;
        materialShapeDrawable$MaterialShapeDrawableState = this.calculateTintFilter((ColorStateList)object, (PorterDuff.Mode)materialShapeDrawable$MaterialShapeDrawableState, (Paint)object2, false);
        this.strokeTintFilter = materialShapeDrawable$MaterialShapeDrawableState;
        materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        boolean bl4 = materialShapeDrawable$MaterialShapeDrawableState.useTintColorForShadow;
        if (bl4) {
            object = this.shadowRenderer;
            materialShapeDrawable$MaterialShapeDrawableState = materialShapeDrawable$MaterialShapeDrawableState.tintList;
            object2 = this.getState();
            int n3 = materialShapeDrawable$MaterialShapeDrawableState.getColorForState((int[])object2, 0);
            ((ShadowRenderer)object).setShadowColor(n3);
        }
        if ((bl2 = Objects.equals(porterDuffColorFilter, (Object)(materialShapeDrawable$MaterialShapeDrawableState = this.tintFilter))) && (bl2 = Objects.equals(porterDuffColorFilter2, porterDuffColorFilter = this.strokeTintFilter))) {
            bl3 = false;
        }
        return bl3;
    }

    private void updateZ() {
        int n3;
        int n4;
        float f5 = this.getZ();
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRadius = n4 = (int)Math.ceil(0.75f * f5);
        materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        materialShapeDrawable$MaterialShapeDrawableState.shadowCompatOffset = n3 = (int)Math.ceil(f5 * 0.25f);
        this.updateTintFilter();
        this.invalidateSelfIgnoreShape();
    }

    public final void calculatePathForSize(RectF rectF, Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.pathProvider;
        Object object = this.drawableState;
        ShapeAppearanceModel shapeAppearanceModel = object.shapeAppearanceModel;
        float f5 = object.interpolation;
        ShapeAppearancePathProvider$PathListener shapeAppearancePathProvider$PathListener = this.pathShadowListener;
        object = shapeAppearanceModel;
        shapeAppearancePathProvider.calculatePath(shapeAppearanceModel, f5, rectF, shapeAppearancePathProvider$PathListener, path);
    }

    public int compositeElevationOverlayIfNeeded(int n3) {
        float f5 = this.getZ();
        float f6 = this.getParentAbsoluteElevation() + f5;
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        if (elevationOverlayProvider != null) {
            n3 = elevationOverlayProvider.compositeOverlayIfNeeded(n3, f6);
        }
        return n3;
    }

    public void draw(Canvas canvas) {
        Paint paint = this.fillPaint;
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        paint.setColorFilter((ColorFilter)porterDuffColorFilter);
        paint = this.fillPaint;
        int n3 = paint.getAlpha();
        porterDuffColorFilter = this.fillPaint;
        int n4 = this.drawableState.alpha;
        n4 = MaterialShapeDrawable.modulateAlpha(n3, n4);
        porterDuffColorFilter.setAlpha(n4);
        porterDuffColorFilter = this.strokePaint;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        porterDuffColorFilter.setColorFilter((ColorFilter)porterDuffColorFilter2);
        porterDuffColorFilter = this.strokePaint;
        float f5 = this.drawableState.strokeWidth;
        porterDuffColorFilter.setStrokeWidth(f5);
        porterDuffColorFilter = this.strokePaint;
        int n7 = porterDuffColorFilter.getAlpha();
        porterDuffColorFilter2 = this.strokePaint;
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n8 = materialShapeDrawable$MaterialShapeDrawableState.alpha;
        n8 = MaterialShapeDrawable.modulateAlpha(n7, n8);
        porterDuffColorFilter2.setAlpha(n8);
        n4 = (int)(this.pathDirty ? 1 : 0);
        if (n4 != 0) {
            this.calculateStrokePath();
            porterDuffColorFilter2 = this.getBoundsAsRectF();
            materialShapeDrawable$MaterialShapeDrawableState = this.path;
            this.calculatePath((RectF)porterDuffColorFilter2, (Path)materialShapeDrawable$MaterialShapeDrawableState);
            n4 = 0;
            f5 = 0.0f;
            porterDuffColorFilter2 = null;
            this.pathDirty = false;
        }
        this.maybeDrawCompatShadow(canvas);
        n4 = (int)(this.hasFill() ? 1 : 0);
        if (n4 != 0) {
            this.drawFillShape(canvas);
        }
        if ((n4 = (int)(this.hasStroke() ? 1 : 0)) != 0) {
            this.drawStrokeShape(canvas);
        }
        this.fillPaint.setAlpha(n3);
        this.strokePaint.setAlpha(n7);
    }

    public void drawShape(Canvas canvas, Paint paint, Path path, RectF rectF) {
        ShapeAppearanceModel shapeAppearanceModel = this.drawableState.shapeAppearanceModel;
        this.drawShape(canvas, paint, path, shapeAppearanceModel, rectF);
    }

    public void drawStrokeShape(Canvas canvas) {
        Paint paint = this.strokePaint;
        Path path = this.pathInsetByStroke;
        ShapeAppearanceModel shapeAppearanceModel = this.strokeShapeAppearance;
        RectF rectF = this.getBoundsInsetByStroke();
        this.drawShape(canvas, paint, path, shapeAppearanceModel, rectF);
    }

    public int getAlpha() {
        return this.drawableState.alpha;
    }

    public float getBottomLeftCornerResolvedSize() {
        CornerSize cornerSize = this.drawableState.shapeAppearanceModel.getBottomLeftCornerSize();
        RectF rectF = this.getBoundsAsRectF();
        return cornerSize.getCornerSize(rectF);
    }

    public float getBottomRightCornerResolvedSize() {
        CornerSize cornerSize = this.drawableState.shapeAppearanceModel.getBottomRightCornerSize();
        RectF rectF = this.getBoundsAsRectF();
        return cornerSize.getCornerSize(rectF);
    }

    public RectF getBoundsAsRectF() {
        RectF rectF = this.rectF;
        Rect rect = this.getBounds();
        rectF.set(rect);
        return this.rectF;
    }

    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public float getElevation() {
        return this.drawableState.elevation;
    }

    public ColorStateList getFillColor() {
        return this.drawableState.fillColor;
    }

    public float getInterpolation() {
        return this.drawableState.interpolation;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatMode;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4) {
            return;
        }
        n3 = (int)(this.isRoundRect() ? 1 : 0);
        if (n3 != 0) {
            float f6 = this.getTopLeftCornerResolvedSize();
            f5 = this.drawableState.interpolation;
            Rect rect = this.getBounds();
            outline.setRoundRect(rect, f6 *= f5);
            return;
        }
        materialShapeDrawable$MaterialShapeDrawableState = this.getBoundsAsRectF();
        Path path = this.path;
        this.calculatePath((RectF)materialShapeDrawable$MaterialShapeDrawableState, path);
        materialShapeDrawable$MaterialShapeDrawableState = this.path;
        DrawableUtils.setOutlineToPath(outline, (Path)materialShapeDrawable$MaterialShapeDrawableState);
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.drawableState.padding;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public Paint.Style getPaintStyle() {
        return this.drawableState.paintStyle;
    }

    public float getParentAbsoluteElevation() {
        return this.drawableState.parentAbsoluteElevation;
    }

    public void getPathForSize(int n3, int n4, Path path) {
        float f5 = n3;
        float f6 = n4;
        RectF rectF = new RectF(0.0f, 0.0f, f5, f6);
        this.calculatePathForSize(rectF, path);
    }

    public int getResolvedTintColor() {
        return this.resolvedTintColor;
    }

    public float getScale() {
        return this.drawableState.scale;
    }

    public int getShadowCompatRotation() {
        return this.drawableState.shadowCompatRotation;
    }

    public int getShadowCompatibilityMode() {
        return this.drawableState.shadowCompatMode;
    }

    public int getShadowElevation() {
        return (int)this.getElevation();
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        double d2 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatOffset;
        return (int)(Math.sin(Math.toRadians(materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRotation)) * d2);
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        double d2 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatOffset;
        return (int)(Math.cos(Math.toRadians(materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRotation)) * d2);
    }

    public int getShadowRadius() {
        return this.drawableState.shadowCompatRadius;
    }

    public int getShadowVerticalOffset() {
        return this.drawableState.shadowCompatOffset;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.shapeAppearanceModel;
    }

    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = this.getShapeAppearanceModel();
        boolean bl2 = shapeAppearanceModel instanceof ShapePathModel;
        shapeAppearanceModel = bl2 ? (ShapePathModel)shapeAppearanceModel : null;
        return shapeAppearanceModel;
    }

    public ColorStateList getStrokeColor() {
        return this.drawableState.strokeColor;
    }

    public ColorStateList getStrokeTintList() {
        return this.drawableState.strokeTintList;
    }

    public float getStrokeWidth() {
        return this.drawableState.strokeWidth;
    }

    public ColorStateList getTintList() {
        return this.drawableState.tintList;
    }

    public float getTopLeftCornerResolvedSize() {
        CornerSize cornerSize = this.drawableState.shapeAppearanceModel.getTopLeftCornerSize();
        RectF rectF = this.getBoundsAsRectF();
        return cornerSize.getCornerSize(rectF);
    }

    public float getTopRightCornerResolvedSize() {
        CornerSize cornerSize = this.drawableState.shapeAppearanceModel.getTopRightCornerSize();
        RectF rectF = this.getBoundsAsRectF();
        return cornerSize.getCornerSize(rectF);
    }

    public float getTranslationZ() {
        return this.drawableState.translationZ;
    }

    public Region getTransparentRegion() {
        Rect rect = this.getBounds();
        this.transparentRegion.set(rect);
        rect = this.getBoundsAsRectF();
        Path path = this.path;
        this.calculatePath((RectF)rect, path);
        rect = this.scratchRegion;
        path = this.path;
        Region region = this.transparentRegion;
        rect.setPath(path, region);
        rect = this.transparentRegion;
        path = this.scratchRegion;
        region = Region.Op.DIFFERENCE;
        rect.op((Region)path, (Region.Op)region);
        return this.transparentRegion;
    }

    public float getZ() {
        float f5 = this.getElevation();
        return this.getTranslationZ() + f5;
    }

    public void initializeElevationOverlay(Context context) {
        ElevationOverlayProvider elevationOverlayProvider;
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        materialShapeDrawable$MaterialShapeDrawableState.elevationOverlayProvider = elevationOverlayProvider = new ElevationOverlayProvider(context);
        this.updateZ();
    }

    public void invalidateSelf() {
        this.pathDirty = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        boolean bl2;
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        if (elevationOverlayProvider != null && (bl2 = elevationOverlayProvider.isThemeElevationOverlayEnabled())) {
            bl2 = true;
        } else {
            bl2 = false;
            elevationOverlayProvider = null;
        }
        return bl2;
    }

    public boolean isElevationOverlayInitialized() {
        boolean bl2;
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        if (elevationOverlayProvider != null) {
            bl2 = true;
        } else {
            bl2 = false;
            elevationOverlayProvider = null;
        }
        return bl2;
    }

    public boolean isPointInTransparentRegion(int n3, int n4) {
        return this.getTransparentRegion().contains(n3, n4);
    }

    public boolean isRoundRect() {
        ShapeAppearanceModel shapeAppearanceModel = this.drawableState.shapeAppearanceModel;
        RectF rectF = this.getBoundsAsRectF();
        return shapeAppearanceModel.isRoundRect(rectF);
    }

    public boolean isShadowEnabled() {
        int n3;
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n4 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatMode;
        if (n4 != 0 && n4 != (n3 = 2)) {
            n4 = 0;
            materialShapeDrawable$MaterialShapeDrawableState = null;
        } else {
            n4 = 1;
        }
        return n4 != 0;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        boolean bl2 = super.isStateful();
        if (!(bl2 || (colorStateList = this.drawableState.tintList) != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.drawableState.strokeTintList) != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.drawableState.strokeColor) != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.drawableState.fillColor) != null && (bl2 = colorStateList.isStateful()))) {
            bl2 = false;
            colorStateList = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Drawable mutate() {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState;
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState2 = this.drawableState;
        this.drawableState = materialShapeDrawable$MaterialShapeDrawableState = new MaterialShapeDrawable$MaterialShapeDrawableState(materialShapeDrawable$MaterialShapeDrawableState2);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] nArray) {
        boolean bl2 = this.updateColorsForState(nArray);
        boolean bl3 = this.updateTintFilter();
        if (!bl2 && !bl3) {
            bl2 = false;
            nArray = null;
        } else {
            bl2 = true;
        }
        if (bl2) {
            this.invalidateSelf();
        }
        return bl2;
    }

    public boolean requiresCompatShadow() {
        Path path;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = this.isRoundRect();
        n3 = n4 == 0 && (n4 = (path = this.path).isConvex()) == 0 && n3 < (n4 = 29) ? 1 : 0;
        return n3 != 0;
    }

    public void setAlpha(int n3) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n4 = materialShapeDrawable$MaterialShapeDrawableState.alpha;
        if (n4 != n3) {
            materialShapeDrawable$MaterialShapeDrawableState.alpha = n3;
            this.invalidateSelfIgnoreShape();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.colorFilter = colorFilter;
        this.invalidateSelfIgnoreShape();
    }

    public void setCornerSize(float f5) {
        ShapeAppearanceModel shapeAppearanceModel = this.drawableState.shapeAppearanceModel.withCornerSize(f5);
        this.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setCornerSize(CornerSize object) {
        object = this.drawableState.shapeAppearanceModel.withCornerSize((CornerSize)object);
        this.setShapeAppearanceModel((ShapeAppearanceModel)object);
    }

    public void setEdgeIntersectionCheckEnable(boolean bl2) {
        this.pathProvider.setEdgeIntersectionCheckEnable(bl2);
    }

    public void setElevation(float f5) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        float f6 = materialShapeDrawable$MaterialShapeDrawableState.elevation;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            materialShapeDrawable$MaterialShapeDrawableState.elevation = f5;
            this.updateZ();
        }
    }

    public void setFillColor(ColorStateList object) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        ColorStateList colorStateList = materialShapeDrawable$MaterialShapeDrawableState.fillColor;
        if (colorStateList != object) {
            materialShapeDrawable$MaterialShapeDrawableState.fillColor = object;
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setInterpolation(float f5) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        float f6 = materialShapeDrawable$MaterialShapeDrawableState.interpolation;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            materialShapeDrawable$MaterialShapeDrawableState.interpolation = f5;
            boolean bl2 = true;
            f5 = Float.MIN_VALUE;
            this.pathDirty = bl2;
            this.invalidateSelf();
        }
    }

    public void setPadding(int n3, int n4, int n7, int n8) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        Rect rect = materialShapeDrawable$MaterialShapeDrawableState.padding;
        if (rect == null) {
            materialShapeDrawable$MaterialShapeDrawableState.padding = rect = new Rect();
        }
        this.drawableState.padding.set(n3, n4, n7, n8);
        this.invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style2) {
        this.drawableState.paintStyle = style2;
        this.invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f5) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        float f6 = materialShapeDrawable$MaterialShapeDrawableState.parentAbsoluteElevation;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            materialShapeDrawable$MaterialShapeDrawableState.parentAbsoluteElevation = f5;
            this.updateZ();
        }
    }

    public void setScale(float f5) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        float f6 = materialShapeDrawable$MaterialShapeDrawableState.scale;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            materialShapeDrawable$MaterialShapeDrawableState.scale = f5;
            this.invalidateSelf();
        }
    }

    public void setShadowBitmapDrawingEnable(boolean bl2) {
        this.shadowBitmapDrawingEnable = bl2;
    }

    public void setShadowColor(int n3) {
        this.shadowRenderer.setShadowColor(n3);
        this.drawableState.useTintColorForShadow = false;
        this.invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int n3) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n4 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRotation;
        if (n4 != n3) {
            materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRotation = n3;
            this.invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int n3) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n4 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatMode;
        if (n4 != n3) {
            materialShapeDrawable$MaterialShapeDrawableState.shadowCompatMode = n3;
            this.invalidateSelfIgnoreShape();
        }
    }

    public void setShadowElevation(int n3) {
        float f5 = n3;
        this.setElevation(f5);
    }

    public void setShadowEnabled(boolean bl2) {
        this.setShadowCompatibilityMode((int)((bl2 ^= true) ? 1 : 0));
    }

    public void setShadowRadius(int n3) {
        this.drawableState.shadowCompatRadius = n3;
    }

    public void setShadowVerticalOffset(int n3) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        int n4 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatOffset;
        if (n4 != n3) {
            materialShapeDrawable$MaterialShapeDrawableState.shadowCompatOffset = n3;
            this.invalidateSelfIgnoreShape();
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.shapeAppearanceModel = shapeAppearanceModel;
        this.invalidateSelf();
    }

    public void setShapedViewModel(ShapePathModel shapePathModel) {
        this.setShapeAppearanceModel(shapePathModel);
    }

    public void setStroke(float f5, int n3) {
        this.setStrokeWidth(f5);
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setStrokeColor(colorStateList);
    }

    public void setStroke(float f5, ColorStateList colorStateList) {
        this.setStrokeWidth(f5);
        this.setStrokeColor(colorStateList);
    }

    public void setStrokeColor(ColorStateList object) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        ColorStateList colorStateList = materialShapeDrawable$MaterialShapeDrawableState.strokeColor;
        if (colorStateList != object) {
            materialShapeDrawable$MaterialShapeDrawableState.strokeColor = object;
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setStrokeTint(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setStrokeTint(colorStateList);
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.drawableState.strokeTintList = colorStateList;
        this.updateTintFilter();
        this.invalidateSelfIgnoreShape();
    }

    public void setStrokeWidth(float f5) {
        this.drawableState.strokeWidth = f5;
        this.invalidateSelf();
    }

    public void setTint(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setTintList(colorStateList);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.tintList = colorStateList;
        this.updateTintFilter();
        this.invalidateSelfIgnoreShape();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        PorterDuff.Mode mode2 = materialShapeDrawable$MaterialShapeDrawableState.tintMode;
        if (mode2 != mode) {
            materialShapeDrawable$MaterialShapeDrawableState.tintMode = mode;
            this.updateTintFilter();
            this.invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f5) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        float f6 = materialShapeDrawable$MaterialShapeDrawableState.translationZ;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            materialShapeDrawable$MaterialShapeDrawableState.translationZ = f5;
            this.updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean bl2) {
        MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState = this.drawableState;
        boolean bl3 = materialShapeDrawable$MaterialShapeDrawableState.useTintColorForShadow;
        if (bl3 != bl2) {
            materialShapeDrawable$MaterialShapeDrawableState.useTintColorForShadow = bl2;
            this.invalidateSelf();
        }
    }

    public void setZ(float f5) {
        float f6 = this.getElevation();
        this.setTranslationZ(f5 -= f6);
    }
}

