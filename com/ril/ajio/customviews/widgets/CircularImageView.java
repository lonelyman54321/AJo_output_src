/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.VectorDrawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View$MeasureSpec
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.CircularImageView$Companion;
import com.ril.ajio.customviews.widgets.CircularImageView$GradientDirection;
import com.ril.ajio.customviews.widgets.CircularImageView$ShadowGravity;
import com.ril.ajio.customviews.widgets.CircularImageView$WhenMappings;
import com.ril.ajio.customviews.widgets.CircularImageView$manageElevation$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class CircularImageView
extends AppCompatImageView {
    public static final int $stable = 0;
    public static final CircularImageView$Companion Companion;
    private static final float DEFAULT_BORDER_WIDTH = 4.0f;
    private static final float DEFAULT_SHADOW_RADIUS = 8.0f;
    private int borderColor;
    private CircularImageView$GradientDirection borderColorDirection;
    private Integer borderColorEnd;
    private Integer borderColorStart;
    private float borderWidth;
    private int circleCenter;
    private int circleColor;
    private CircularImageView$GradientDirection circleColorDirection;
    private Integer circleColorEnd;
    private Integer circleColorStart;
    private ColorFilter civColorFilter;
    private Drawable civDrawable;
    private Bitmap civImage;
    private int heightCircle;
    private final Paint paint;
    private final Paint paintBackground;
    private final Paint paintBorder;
    private final Paint paintShadow;
    private int shadowColor;
    private boolean shadowEnable;
    private CircularImageView$ShadowGravity shadowGravity;
    private float shadowRadius;

    static {
        CircularImageView$Companion circularImageView$Companion;
        Companion = circularImageView$Companion = new CircularImageView$Companion(null);
        $stable = 8;
    }

    public CircularImageView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 0, 6, null);
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 0, 4, null);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        Object object = new Paint();
        int n4 = 1;
        object.setAntiAlias(n4 != 0);
        this.paint = object;
        object = new Paint();
        object.setAntiAlias(n4 != 0);
        this.paintBorder = object;
        object = new Paint();
        object.setAntiAlias(n4 != 0);
        this.paintShadow = object;
        object = new Paint();
        object.setAntiAlias(n4 != 0);
        this.paintBackground = object;
        this.circleColor = -1;
        object = CircularImageView$GradientDirection.LEFT_TO_RIGHT;
        this.circleColorDirection = object;
        this.borderColor = n4 = -16777216;
        this.borderColorDirection = object;
        this.shadowColor = n4;
        object = CircularImageView$ShadowGravity.BOTTOM;
        this.shadowGravity = object;
        this.init(context, attributeSet, n3);
    }

    public /* synthetic */ CircularImageView(Context context, AttributeSet attributeSet, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            attributeSet = null;
        }
        if ((n4 &= 4) != 0) {
            n3 = 0;
        }
        this(context, attributeSet, n3);
    }

    public static final /* synthetic */ int access$getHeightCircle$p(CircularImageView circularImageView) {
        return circularImageView.heightCircle;
    }

    private final Bitmap bitmapDrawableToBitmap(BitmapDrawable bitmapDrawable) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        int n3 = bitmapDrawable.getIntrinsicWidth();
        int n4 = bitmapDrawable.getIntrinsicHeight();
        bitmapDrawable = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n4, (boolean)false);
        Intrinsics.checkNotNullExpressionValue(bitmapDrawable, "let(...)");
        return bitmapDrawable;
    }

    private final Matrix centerCrop(Bitmap bitmap, int n3) {
        float f5;
        float f6;
        Matrix matrix = new Matrix();
        int n4 = bitmap.getWidth() * n3;
        int n7 = bitmap.getHeight() * n3;
        float f7 = 0.0f;
        float f8 = 0.5f;
        if (n4 > n7) {
            f6 = n3;
            n4 = bitmap.getHeight();
            f5 = n4;
            f5 = f6 / f5;
            int n8 = bitmap.getWidth();
            float f11 = (float)n8 * f5;
            f7 = (f6 - f11) * f8;
            n3 = 0;
            f6 = 0.0f;
        } else {
            f6 = n3;
            n4 = bitmap.getWidth();
            f5 = n4;
            f5 = f6 / f5;
            int n10 = bitmap.getHeight();
            float f12 = (float)n10 * f5;
            f6 = (f6 - f12) * f8;
        }
        matrix.setScale(f5, f5);
        matrix.postTranslate(f7, f6);
        return matrix;
    }

    private final Matrix centerInside(Bitmap bitmap, int n3) {
        float f5;
        float f6;
        float f7;
        Matrix matrix = new Matrix();
        int n4 = bitmap.getWidth();
        if (n4 <= n3 && (n4 = bitmap.getHeight()) <= n3) {
            n4 = 1065353216;
            f7 = 1.0f;
        } else {
            f7 = n3;
            int n7 = bitmap.getWidth();
            f6 = n7;
            f6 = f7 / f6;
            int n8 = bitmap.getHeight();
            f5 = n8;
            f7 /= f5;
            f7 = f.c(f6, f7);
        }
        float f8 = n3;
        f6 = (float)bitmap.getWidth() * f7;
        f6 = f8 - f6;
        f5 = 0.5f;
        f6 = ok1_1.b(f6 * f5);
        float f11 = (float)bitmap.getHeight() * f7;
        f11 = ok1_1.b((f8 - f11) * f5);
        matrix.setScale(f7, f7);
        matrix.postTranslate(f6, f11);
        return matrix;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final LinearGradient createLinearGradient(int n3, int n4, CircularImageView$GradientDirection circularImageView$GradientDirection) {
        float f5;
        float f6;
        float f7;
        float f8;
        block5: {
            block6: {
                float f11;
                int n7;
                block1: {
                    block4: {
                        float f12;
                        block2: {
                            float f14;
                            block3: {
                                float f15;
                                int[] nArray = CircularImageView$WhenMappings.$EnumSwitchMapping$0;
                                n7 = circularImageView$GradientDirection.ordinal();
                                int n8 = 1;
                                if ((n7 = nArray[n7]) == n8) break block1;
                                n8 = 2;
                                if (n7 == n8) break block2;
                                n8 = 3;
                                if (n7 == n8) break block3;
                                n8 = 4;
                                if (n7 != n8) {
                                    NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                                    throw noWhenBranchMatchedException;
                                }
                                n7 = this.getHeight();
                                f8 = f15 = (float)n7;
                                f7 = 0.0f;
                                break block4;
                            }
                            n7 = this.getHeight();
                            f6 = f14 = (float)n7;
                            f7 = 0.0f;
                            f8 = 0.0f;
                            f5 = 0.0f;
                            break block5;
                        }
                        n7 = this.getWidth();
                        f7 = f12 = (float)n7;
                        f8 = 0.0f;
                    }
                    f5 = 0.0f;
                    break block6;
                }
                n7 = this.getWidth();
                f5 = f11 = (float)n7;
                f7 = 0.0f;
                f8 = 0.0f;
            }
            f6 = 0.0f;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        return new LinearGradient(f7, f8, f5, f6, n3, n4, tileMode);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void drawShadow() {
        float f5;
        float f6;
        float f7;
        block7: {
            float f8;
            int n3;
            block8: {
                block5: {
                    block6: {
                        Object object;
                        int n4;
                        block4: {
                            n4 = Build.VERSION.SDK_INT;
                            int n7 = 28;
                            f7 = 3.9E-44f;
                            n3 = 1;
                            f8 = Float.MIN_VALUE;
                            if (n4 < n7) {
                                object = this.paintShadow;
                                this.setLayerType(n3, (Paint)object);
                            }
                            object = this.shadowGravity;
                            int[] nArray = CircularImageView$WhenMappings.$EnumSwitchMapping$1;
                            n4 = ((Enum)object).ordinal();
                            n4 = nArray[n4];
                            n7 = 0;
                            f7 = 0.0f;
                            nArray = null;
                            if (n4 == n3) break block4;
                            n3 = 2;
                            f8 = 2.8E-45f;
                            if (n4 == n3) break block5;
                            int n8 = 3;
                            f6 = 4.2E-45f;
                            if (n4 == n8) break block6;
                            n8 = 4;
                            f6 = 5.6E-45f;
                            if (n4 != n8) {
                                n8 = 5;
                                f6 = 7.0E-45f;
                                if (n4 != n8) {
                                    object = new NoWhenBranchMatchedException();
                                    throw object;
                                }
                                f5 = this.shadowRadius;
                            } else {
                                f5 = -this.shadowRadius;
                            }
                            f8 = n3;
                            f7 = f5 /= f8;
                        }
                        n4 = 0;
                        f5 = 0.0f;
                        object = null;
                        break block7;
                    }
                    f5 = this.shadowRadius;
                    break block8;
                }
                f5 = -this.shadowRadius;
            }
            f8 = n3;
            f5 /= f8;
        }
        Paint paint = this.paintShadow;
        f6 = this.shadowRadius;
        int n10 = this.shadowColor;
        paint.setShadowLayer(f6, f7, f5, n10);
    }

    private final Bitmap drawableToBitmap(Drawable drawable2) {
        if (drawable2 != null) {
            boolean bl2 = drawable2 instanceof VectorDrawable;
            if (bl2) {
                drawable2 = (VectorDrawable)drawable2;
                drawable2 = this.vectorDrawableToBitmap((VectorDrawable)drawable2);
            } else {
                bl2 = drawable2 instanceof BitmapDrawable;
                if (bl2) {
                    drawable2 = (BitmapDrawable)drawable2;
                    drawable2 = this.bitmapDrawableToBitmap((BitmapDrawable)drawable2);
                } else {
                    drawable2 = this.toBitmap(drawable2);
                }
            }
        } else {
            drawable2 = null;
        }
        return drawable2;
    }

    private final Matrix fitCenter(Bitmap bitmap, int n3) {
        Matrix matrix = new Matrix();
        RectF rectF = new RectF();
        float f5 = bitmap.getWidth();
        float f6 = bitmap.getHeight();
        rectF.set(0.0f, 0.0f, f5, f6);
        bitmap = new RectF();
        float f7 = n3;
        bitmap.set(0.0f, 0.0f, f7, f7);
        Unit unit = Unit.a;
        unit = Matrix.ScaleToFit.CENTER;
        matrix.setRectToRect(rectF, (RectF)bitmap, (Matrix.ScaleToFit)unit);
        return matrix;
    }

    private final void init(Context context, AttributeSet object, int n3) {
        Enum enum_;
        float f5;
        Object object2 = R$styleable.CircularImageView;
        context = context.obtainStyledAttributes(object, (int[])object2, n3, 0);
        object = "obtainStyledAttributes(...)";
        Intrinsics.checkNotNullExpressionValue(context, (String)object);
        int n4 = R$styleable.CircularImageView_civ_circle_color;
        n3 = -1;
        float f6 = 0.0f / 0.0f;
        n4 = context.getColor(n4, n3);
        this.setCircleColor(n4);
        n4 = R$styleable.CircularImageView_civ_circle_color_start;
        n4 = context.getColor(n4, 0);
        if (n4 != 0) {
            object = n4;
            this.setCircleColorStart((Integer)object);
        }
        n4 = R$styleable.CircularImageView_civ_circle_color_end;
        if ((n4 = context.getColor(n4, 0)) != 0) {
            object = n4;
            this.setCircleColorEnd((Integer)object);
        }
        n4 = R$styleable.CircularImageView_civ_circle_color_direction;
        object2 = (Object)this.circleColorDirection;
        int n7 = ((CircularImageView$GradientDirection)((Object)object2)).getValue();
        n4 = context.getInteger(n4, n7);
        object = this.toGradientDirection(n4);
        this.setCircleColorDirection((CircularImageView$GradientDirection)((Object)object));
        n4 = R$styleable.CircularImageView_civ_border;
        n7 = 1;
        float f7 = Float.MIN_VALUE;
        n4 = (int)(context.getBoolean(n4, n7 != 0) ? 1 : 0);
        if (n4 != 0) {
            object = this.getResources().getDisplayMetrics();
            f5 = object.density;
            f7 = 4.0f;
            f5 *= f7;
            n7 = R$styleable.CircularImageView_civ_border_width;
            f5 = context.getDimension(n7, f5);
            this.setBorderWidth(f5);
            n4 = R$styleable.CircularImageView_civ_border_color;
            n4 = context.getColor(n4, n3);
            this.setBorderColor(n4);
            n4 = R$styleable.CircularImageView_civ_border_color_start;
            n4 = context.getColor(n4, 0);
            if (n4 != 0) {
                object = n4;
                this.setBorderColorStart((Integer)object);
            }
            n4 = R$styleable.CircularImageView_civ_border_color_end;
            if ((n4 = context.getColor(n4, 0)) != 0) {
                object = n4;
                this.setBorderColorEnd((Integer)object);
            }
            n4 = R$styleable.CircularImageView_civ_border_color_direction;
            enum_ = this.borderColorDirection;
            n3 = ((CircularImageView$GradientDirection)enum_).getValue();
            n4 = context.getInteger(n4, n3);
            object = this.toGradientDirection(n4);
            this.setBorderColorDirection((CircularImageView$GradientDirection)((Object)object));
        }
        n4 = R$styleable.CircularImageView_civ_shadow;
        n3 = (int)(this.shadowEnable ? 1 : 0);
        n4 = (int)(context.getBoolean(n4, n3 != 0) ? 1 : 0);
        this.setShadowEnable(n4 != 0);
        n4 = this.shadowEnable;
        if (n4 != 0) {
            n4 = R$styleable.CircularImageView_civ_shadow_gravity;
            enum_ = this.shadowGravity;
            n3 = ((CircularImageView$ShadowGravity)enum_).getValue();
            n4 = context.getInteger(n4, n3);
            object = this.toShadowGravity(n4);
            this.setShadowGravity((CircularImageView$ShadowGravity)((Object)object));
            object = this.getResources().getDisplayMetrics();
            f5 = object.density;
            f6 = 8.0f;
            f5 *= f6;
            n3 = R$styleable.CircularImageView_civ_shadow_radius;
            f5 = context.getDimension(n3, f5);
            this.setShadowRadius(f5);
            n4 = R$styleable.CircularImageView_civ_shadow_color;
            n3 = this.shadowColor;
            n4 = context.getColor(n4, n3);
            this.setShadowColor(n4);
        }
        context.recycle();
    }

    private final void loadBitmap() {
        Drawable drawable2 = this.civDrawable;
        Drawable drawable3 = this.getDrawable();
        boolean bl2 = Intrinsics.areEqual(drawable2, drawable3);
        if (bl2) {
            return;
        }
        this.civDrawable = drawable2 = this.getDrawable();
        drawable2 = this.drawableToBitmap(drawable2);
        this.civImage = drawable2;
        this.updateShader();
    }

    private final void manageBorderColor() {
        float f5 = this.borderWidth;
        Paint paint = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        object = object == false ? (Object)this.circleColor : (Object)this.borderColor;
        paint = this.paintBorder;
        Integer n3 = this.borderColorStart;
        float f7 = n3 != null ? (float)n3.intValue() : object;
        Object object2 = this.borderColorEnd;
        if (object2 != null) {
            object = object2.intValue();
        }
        object2 = this.borderColorDirection;
        LinearGradient linearGradient = this.createLinearGradient((int)f7, (int)object, (CircularImageView$GradientDirection)((Object)object2));
        paint.setShader((Shader)linearGradient);
    }

    private final void manageCircleColor() {
        Paint paint = this.paintBackground;
        Integer n3 = this.circleColorStart;
        int n4 = n3 != null ? n3 : this.circleColor;
        Integer n7 = this.circleColorEnd;
        int n8 = n7 != null ? n7 : this.circleColor;
        CircularImageView$GradientDirection circularImageView$GradientDirection = this.circleColorDirection;
        n3 = this.createLinearGradient(n4, n8, circularImageView$GradientDirection);
        paint.setShader((Shader)n3);
    }

    private final void manageElevation() {
        CircularImageView$manageElevation$1 circularImageView$manageElevation$1;
        boolean bl2 = this.shadowEnable;
        if (!bl2) {
            circularImageView$manageElevation$1 = new CircularImageView$manageElevation$1(this);
        } else {
            bl2 = false;
            circularImageView$manageElevation$1 = null;
        }
        this.setOutlineProvider(circularImageView$manageElevation$1);
    }

    private final int measure(int n3) {
        int n4 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n7 = -1 << -1;
        if (n4 != n7 && n4 != (n7 = 0x40000000)) {
            n3 = this.heightCircle;
        }
        return n3;
    }

    private final void setCivColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = this.civColorFilter;
        boolean bl2 = Intrinsics.areEqual(colorFilter2, colorFilter);
        if (!bl2) {
            this.civColorFilter = colorFilter;
            if (colorFilter != null) {
                colorFilter = null;
                this.civDrawable = null;
                this.invalidate();
            }
        }
    }

    private final Bitmap toBitmap(Drawable drawable2) {
        int n3 = drawable2.getIntrinsicWidth();
        int n4 = drawable2.getIntrinsicHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)config);
        String string2 = "createBitmap(...)";
        Intrinsics.checkNotNullExpressionValue(bitmap, string2);
        string2 = new Canvas(bitmap);
        int n7 = string2.getWidth();
        int n8 = string2.getHeight();
        drawable2.setBounds(0, 0, n7, n8);
        try {
            drawable2.draw((Canvas)string2);
        }
        catch (Exception exception) {
            n3 = 0;
            bitmap = null;
        }
        return bitmap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final CircularImageView$GradientDirection toGradientDirection(int n3) {
        int n4 = 1;
        if (n3 == n4) return CircularImageView$GradientDirection.LEFT_TO_RIGHT;
        n4 = 2;
        if (n3 == n4) return CircularImageView$GradientDirection.RIGHT_TO_LEFT;
        n4 = 3;
        if (n3 == n4) return CircularImageView$GradientDirection.TOP_TO_BOTTOM;
        n4 = 4;
        if (n3 == n4) {
            return CircularImageView$GradientDirection.BOTTOM_TO_TOP;
        }
        String string2 = hj0_0.a(n3, "This value is not supported for GradientDirection: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final CircularImageView$ShadowGravity toShadowGravity(int n3) {
        int n4 = 1;
        if (n3 == n4) return CircularImageView$ShadowGravity.CENTER;
        n4 = 2;
        if (n3 == n4) return CircularImageView$ShadowGravity.TOP;
        n4 = 3;
        if (n3 == n4) return CircularImageView$ShadowGravity.BOTTOM;
        n4 = 4;
        if (n3 == n4) return CircularImageView$ShadowGravity.START;
        n4 = 5;
        if (n3 == n4) {
            return CircularImageView$ShadowGravity.END;
        }
        String string2 = hj0_0.a(n3, "This value is not supported for ShadowGravity: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    private final void update() {
        Bitmap bitmap = this.civImage;
        if (bitmap != null) {
            this.updateShader();
        }
        int n3 = this.getWidth();
        int n4 = this.getPaddingLeft();
        int n7 = this.getPaddingRight() + n4;
        n3 -= n7;
        n4 = this.getHeight();
        n7 = this.getPaddingTop();
        int n8 = this.getPaddingBottom() + n7;
        this.heightCircle = n3 = Math.min(n3, n4 -= n8);
        float f5 = n3;
        float f6 = this.borderWidth;
        n7 = 2;
        float f7 = n7;
        this.circleCenter = n3 = (int)(f5 - (f6 *= f7)) / n7;
        this.manageCircleColor();
        this.manageBorderColor();
        this.manageElevation();
        this.invalidate();
    }

    private final void updateShader() {
        Bitmap bitmap = this.civImage;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            tileMode = this.getScaleType();
            int[] nArray = CircularImageView$WhenMappings.$EnumSwitchMapping$2;
            int n3 = tileMode.ordinal();
            int n4 = 1;
            if ((n3 = nArray[n3]) != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        bitmap = new Matrix();
                    } else {
                        n3 = this.heightCircle;
                        bitmap = this.fitCenter(bitmap, n3);
                    }
                } else {
                    n3 = this.heightCircle;
                    bitmap = this.centerInside(bitmap, n3);
                }
            } else {
                n3 = this.heightCircle;
                bitmap = this.centerCrop(bitmap, n3);
            }
            bitmapShader.setLocalMatrix((Matrix)bitmap);
            this.paint.setShader((Shader)bitmapShader);
            bitmap = this.paint;
            bitmapShader = this.civColorFilter;
            bitmap.setColorFilter((ColorFilter)bitmapShader);
        }
    }

    private final Bitmap vectorDrawableToBitmap(VectorDrawable vectorDrawable) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2 = this.getScaleType();
        int n3 = scaleType2 == (scaleType = ImageView.ScaleType.CENTER_INSIDE) ? vectorDrawable.getIntrinsicWidth() : this.getWidth();
        ImageView.ScaleType scaleType3 = this.getScaleType();
        int n4 = scaleType3 == scaleType ? vectorDrawable.getIntrinsicHeight() : this.getHeight();
        scaleType3 = Bitmap.Config.ARGB_8888;
        scaleType2 = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)scaleType3);
        Intrinsics.checkNotNullExpressionValue(scaleType2, "createBitmap(...)");
        scaleType = new Canvas((Bitmap)scaleType2);
        int n7 = scaleType.getWidth();
        int n8 = scaleType.getHeight();
        vectorDrawable.setBounds(0, 0, n7, n8);
        vectorDrawable.draw((Canvas)scaleType);
        return scaleType2;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final CircularImageView$GradientDirection getBorderColorDirection() {
        return this.borderColorDirection;
    }

    public final Integer getBorderColorEnd() {
        return this.borderColorEnd;
    }

    public final Integer getBorderColorStart() {
        return this.borderColorStart;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final int getCircleColor() {
        return this.circleColor;
    }

    public final CircularImageView$GradientDirection getCircleColorDirection() {
        return this.circleColorDirection;
    }

    public final Integer getCircleColorEnd() {
        return this.circleColorEnd;
    }

    public final Integer getCircleColorStart() {
        return this.circleColorStart;
    }

    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = super.getScaleType();
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        return scaleType;
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final boolean getShadowEnable() {
        return this.shadowEnable;
    }

    public final CircularImageView$ShadowGravity getShadowGravity() {
        return this.shadowGravity;
    }

    public final float getShadowRadius() {
        return this.shadowRadius;
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        float f5;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.loadBitmap();
        Bitmap bitmap = this.civImage;
        if (bitmap == null) {
            return;
        }
        int n3 = this.circleCenter;
        float f6 = n3;
        float f7 = this.borderWidth;
        f6 += f7;
        boolean bl2 = this.shadowEnable;
        if (bl2) {
            f5 = this.shadowRadius;
            int n4 = 2;
            float f8 = n4;
            f5 *= f8;
        } else {
            f5 = 0.0f;
            paint2 = null;
        }
        if (bl2) {
            this.drawShadow();
            f7 = f6 - f5;
            paint = this.paintShadow;
            canvas.drawCircle(f6, f6, f7, paint);
        }
        f7 = f6 - f5;
        paint = this.paintBorder;
        canvas.drawCircle(f6, f6, f7, paint);
        f7 = (float)this.circleCenter - f5;
        paint = this.paintBackground;
        canvas.drawCircle(f6, f6, f7, paint);
        f7 = (float)this.circleCenter - f5;
        paint2 = this.paint;
        canvas.drawCircle(f6, f6, f7, paint2);
    }

    public void onMeasure(int n3, int n4) {
        n3 = this.measure(n3);
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight() + n7;
        n3 -= n8;
        n4 = this.measure(n4);
        n7 = this.getPaddingTop();
        n8 = this.getPaddingBottom() + n7;
        this.heightCircle = n3 = Math.min(n3, n4 -= n8);
        this.setMeasuredDimension(n3, n3);
    }

    public void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        this.update();
    }

    public final void setBorderColor(int n3) {
        this.borderColor = n3;
        this.manageBorderColor();
        this.invalidate();
    }

    public final void setBorderColorDirection(CircularImageView$GradientDirection circularImageView$GradientDirection) {
        Intrinsics.checkNotNullParameter((Object)circularImageView$GradientDirection, "value");
        this.borderColorDirection = circularImageView$GradientDirection;
        this.manageBorderColor();
        this.invalidate();
    }

    public final void setBorderColorEnd(Integer n3) {
        this.borderColorEnd = n3;
        this.manageBorderColor();
        this.invalidate();
    }

    public final void setBorderColorStart(Integer n3) {
        this.borderColorStart = n3;
        this.manageBorderColor();
        this.invalidate();
    }

    public final void setBorderWidth(float f5) {
        this.borderWidth = f5;
        this.update();
    }

    public final void setCircleColor(int n3) {
        this.circleColor = n3;
        this.manageCircleColor();
        this.invalidate();
    }

    public final void setCircleColorDirection(CircularImageView$GradientDirection circularImageView$GradientDirection) {
        Intrinsics.checkNotNullParameter((Object)circularImageView$GradientDirection, "value");
        this.circleColorDirection = circularImageView$GradientDirection;
        this.manageCircleColor();
        this.invalidate();
    }

    public final void setCircleColorEnd(Integer n3) {
        this.circleColorEnd = n3;
        this.manageCircleColor();
        this.invalidate();
    }

    public final void setCircleColorStart(Integer n3) {
        this.circleColorStart = n3;
        this.manageCircleColor();
        this.invalidate();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.setCivColorFilter(colorFilter);
    }

    public void setScaleType(ImageView.ScaleType object) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(object, "scaleType");
        Object object2 = new ImageView.ScaleType[3];
        object2[0] = scaleType = ImageView.ScaleType.CENTER_CROP;
        object2[1] = scaleType = ImageView.ScaleType.CENTER_INSIDE;
        scaleType = ImageView.ScaleType.FIT_CENTER;
        int n3 = 2;
        object2[n3] = scaleType;
        object2 = xx_2.i((Object[])object2);
        boolean bl2 = object2.contains(object);
        if (bl2) {
            super.setScaleType((ImageView.ScaleType)object);
            return;
        }
        object2 = new StringBuilder("ScaleType ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" not supported. Just ScaleType.CENTER_CROP, ScaleType.CENTER_INSIDE & ScaleType.FIT_CENTER are available for this library.");
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void setShadowColor(int n3) {
        this.shadowColor = n3;
        this.paintShadow.setColor(n3);
        this.invalidate();
    }

    public final void setShadowEnable(boolean object) {
        this.shadowEnable = object;
        if (object) {
            float f5 = this.shadowRadius;
            float f6 = 0.0f;
            float f7 = f5 - 0.0f;
            object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (!object) {
                DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
                f5 = displayMetrics.density;
                f6 = 8.0f;
                this.setShadowRadius(f5 *= f6);
            }
        }
        this.update();
    }

    public final void setShadowGravity(CircularImageView$ShadowGravity circularImageView$ShadowGravity) {
        Intrinsics.checkNotNullParameter((Object)circularImageView$ShadowGravity, "value");
        this.shadowGravity = circularImageView$ShadowGravity;
        this.invalidate();
    }

    public final void setShadowRadius(float f5) {
        this.shadowRadius = f5;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        this.setShadowEnable((boolean)object);
    }
}

