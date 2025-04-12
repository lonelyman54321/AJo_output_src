/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Matrix
 *  android.graphics.Matrix$ScaleToFit
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.ril.ajio.customviews.widgets.photoviewer.DefaultOnDoubleTapListener;
import com.ril.ajio.customviews.widgets.photoviewer.IPhotoView;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$2;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$AnimatedZoomRunnable;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$FlingRunnable;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnMatrixChangedListener;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnPhotoTapListener;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnScaleChangeListener;
import com.ril.ajio.customviews.widgets.photoviewer.PhotoViewAttacher$OnViewTapListener;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.GestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.OnGestureListener;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.VersionedGestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.log.LogManager;
import com.ril.ajio.customviews.widgets.photoviewer.log.Logger;
import java.lang.ref.WeakReference;

public class PhotoViewAttacher
implements IPhotoView,
View.OnTouchListener,
OnGestureListener,
ViewTreeObserver.OnGlobalLayoutListener {
    private static final boolean DEBUG = false;
    private static final int EDGE_BOTH = 2;
    private static final int EDGE_LEFT = 0;
    private static final int EDGE_NONE = 255;
    private static final int EDGE_RIGHT = 1;
    private static final String LOG_TAG = "PhotoViewAttacher";
    private static final Interpolator sInterpolator;
    private int ZOOM_DURATION = 200;
    private boolean mAllowParentInterceptOnEdge;
    private final Matrix mBaseMatrix;
    private boolean mBlockParentIntercept;
    private PhotoViewAttacher$FlingRunnable mCurrentFlingRunnable;
    private final RectF mDisplayRect;
    private final Matrix mDrawMatrix;
    private android.view.GestureDetector mGestureDetector;
    private WeakReference mImageView;
    private int mIvBottom;
    private int mIvLeft;
    private int mIvRight;
    private int mIvTop;
    private View.OnLongClickListener mLongClickListener;
    private PhotoViewAttacher$OnMatrixChangedListener mMatrixChangeListener;
    private final float[] mMatrixValues;
    private float mMaxScale = 3.0f;
    private float mMidScale = 1.75f;
    private float mMinScale = 1.0f;
    private PhotoViewAttacher$OnPhotoTapListener mPhotoTapListener;
    private PhotoViewAttacher$OnScaleChangeListener mScaleChangeListener;
    private GestureDetector mScaleDragDetector;
    private ImageView.ScaleType mScaleType;
    private int mScrollEdge;
    private final Matrix mSuppMatrix;
    private PhotoViewAttacher$OnViewTapListener mViewTapListener;
    private boolean mZoomEnabled;

    static {
        DEBUG = Log.isLoggable((String)LOG_TAG, (int)3);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        sInterpolator = accelerateDecelerateInterpolator;
    }

    public PhotoViewAttacher(ImageView imageView) {
        this(imageView, true);
    }

    private PhotoViewAttacher(ImageView object, boolean bl2) {
        int n3;
        Object object2;
        boolean bl3;
        this.mAllowParentInterceptOnEdge = bl3 = true;
        this.mBlockParentIntercept = false;
        this.mBaseMatrix = object2 = new Matrix();
        this.mDrawMatrix = object2 = new Matrix();
        this.mSuppMatrix = object2 = new Matrix();
        this.mDisplayRect = object2;
        object2 = new float[9];
        this.mMatrixValues = (float[])object2;
        this.mScrollEdge = n3 = 2;
        object2 = ImageView.ScaleType.FIT_CENTER;
        this.mScaleType = object2;
        super(object);
        this.mImageView = object2;
        object.setDrawingCacheEnabled(bl3);
        object.setOnTouchListener((View.OnTouchListener)this);
        Object object3 = object.getViewTreeObserver();
        if (object3 != null) {
            object3.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }
        PhotoViewAttacher.setImageViewScaleTypeMatrix(object);
        bl3 = object.isInEditMode();
        if (bl3) {
            return;
        }
        object3 = VersionedGestureDetector.newInstance(object.getContext(), this);
        this.mScaleDragDetector = object3;
        object = object.getContext();
        super(this);
        super((Context)object, (GestureDetector.OnGestureListener)object2);
        this.mGestureDetector = object3;
        super(this);
        object3.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)object);
        this.setZoomable(bl2);
    }

    public static /* bridge */ /* synthetic */ int a(PhotoViewAttacher photoViewAttacher) {
        return photoViewAttacher.ZOOM_DURATION;
    }

    public static /* bridge */ /* synthetic */ View.OnLongClickListener b(PhotoViewAttacher photoViewAttacher) {
        return photoViewAttacher.mLongClickListener;
    }

    public static /* bridge */ /* synthetic */ Matrix c(PhotoViewAttacher photoViewAttacher) {
        return photoViewAttacher.mSuppMatrix;
    }

    private void cancelFling() {
        PhotoViewAttacher$FlingRunnable photoViewAttacher$FlingRunnable = this.mCurrentFlingRunnable;
        if (photoViewAttacher$FlingRunnable != null) {
            photoViewAttacher$FlingRunnable.cancelFling();
            photoViewAttacher$FlingRunnable = null;
            this.mCurrentFlingRunnable = null;
        }
    }

    private void checkAndDisplayMatrix() {
        boolean bl2 = this.checkMatrixBounds();
        if (bl2) {
            Matrix matrix = this.getDrawMatrix();
            this.setImageViewMatrix(matrix);
        }
    }

    private void checkImageViewScaleType() {
        ImageView.ScaleType scaleType;
        boolean bl2;
        boolean bl3;
        Object object = this.getImageView();
        if (object != null && !(bl3 = object instanceof IPhotoView) && !(bl2 = (scaleType = ImageView.ScaleType.MATRIX).equals(object = object.getScaleType()))) {
            object = new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
            throw object;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean checkMatrixBounds() {
        block15: {
            block16: {
                block17: {
                    var1_1 = this.getImageView();
                    var2_2 = 0;
                    var3_3 = 0.0f;
                    var4_4 = null;
                    if (var1_1 == null) {
                        return false;
                    }
                    var5_5 = this.getDrawMatrix();
                    if ((var5_5 = this.getDisplayRect(var5_5)) == null) {
                        return false;
                    }
                    var6_6 = var5_5.height();
                    var7_7 = var5_5.width();
                    var8_8 = this.getImageViewHeight(var1_1);
                    var9_9 = var8_8;
                    var10_10 = 0x40000000;
                    var11_11 = 2.0f;
                    var12_12 = 3;
                    var13_13 = 2;
                    var14_14 = 0;
                    var15_15 = 0.0f;
                    var16_16 = null;
                    var17_17 /* !! */  = (float)(var6_6 == var9_9 ? 0 : (var6_6 < var9_9 ? -1 : 1));
                    if (var17_17 /* !! */  > 0) break block16;
                    var18_18 = PhotoViewAttacher$2.$SwitchMap$android$widget$ImageView$ScaleType;
                    var19_19 = this.mScaleType;
                    var20_20 = var19_19.ordinal();
                    var17_17 /* !! */  = var18_18[var20_20];
                    if (var17_17 /* !! */  == var13_13) break block17;
                    if (var17_17 /* !! */  != var12_12) {
                        var9_9 = (var9_9 - var6_6) / var11_11;
                        var6_6 = var5_5.top;
lbl31:
                        // 3 sources

                        while (true) {
                            var9_9 -= var6_6;
                            break block15;
                            break;
                        }
                    }
                    var9_9 -= var6_6;
                    var6_6 = var5_5.top;
                    ** GOTO lbl31
                }
                var6_6 = var5_5.top;
lbl39:
                // 2 sources

                while (true) {
                    var9_9 = -var6_6;
                    break block15;
                    break;
                }
            }
            ** while ((var17_17 /* !! */  = (cfr_temp_0 = (var6_6 = var5_5.top) - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) > 0)
lbl44:
            // 1 sources

            var6_6 = var5_5.bottom;
            cfr_temp_1 = var6_6 - var9_9;
            var17_17 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
            if (var17_17 /* !! */  >= 0) ** break;
            ** while (true)
            var8_8 = 0;
            var9_9 = 0.0f;
        }
        var21_21 = this.getImageViewWidth(var1_1);
        var22_22 = var21_21;
        var23_23 = 1;
        var6_6 = 1.4E-45f;
        var17_17 /* !! */  = var7_7 == var22_22 ? 0 : (var7_7 < var22_22 ? -1 : 1);
        if (var17_17 /* !! */  <= 0) {
            var4_4 = PhotoViewAttacher$2.$SwitchMap$android$widget$ImageView$ScaleType;
            var16_16 = this.mScaleType;
            var14_14 = var16_16.ordinal();
            var2_2 = var4_4[var14_14];
            if (var2_2 != var13_13) {
                if (var2_2 != var12_12) {
                    var22_22 = (var22_22 - var7_7) / var11_11;
                    var3_3 = var5_5.left;
lbl66:
                    // 2 sources

                    while (true) {
                        var22_22 -= var3_3;
lbl68:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                        break;
                    }
                }
                var22_22 -= var7_7;
                var3_3 = var5_5.left;
                ** continue;
            }
            var22_22 = -var5_5.left;
            ** continue;
            var15_15 = var22_22;
            this.mScrollEdge = var13_13;
        } else {
            var7_7 = var5_5.left;
            cfr_temp_2 = var7_7 - 0.0f;
            var10_10 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
            if (var10_10 > 0) {
                this.mScrollEdge = 0;
                var15_15 = -var7_7;
            } else {
                var3_3 = var5_5.right;
                cfr_temp_3 = var3_3 - var22_22;
                var24_24 /* !! */  = (float)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                if (var24_24 /* !! */  < 0) {
                    var15_15 = var22_22 - var3_3;
                    this.mScrollEdge = var23_23;
                } else {
                    var21_21 = -1;
                    var22_22 = 0.0f / 0.0f;
                    this.mScrollEdge = var21_21;
                }
            }
        }
        this.mSuppMatrix.postTranslate(var15_15, var9_9);
        return (boolean)var23_23;
    }

    private static void checkZoomLevels(float f5, float f6, float f7) {
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object < 0) {
            object = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
            if (object < 0) {
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("MidZoom has to be less than MaxZoom");
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("MinZoom has to be less than MidZoom");
        throw illegalArgumentException;
    }

    public static /* bridge */ /* synthetic */ Matrix d(PhotoViewAttacher photoViewAttacher) {
        return photoViewAttacher.getDrawMatrix();
    }

    public static /* bridge */ /* synthetic */ void e(PhotoViewAttacher photoViewAttacher, Matrix matrix) {
        photoViewAttacher.setImageViewMatrix(matrix);
    }

    public static /* bridge */ /* synthetic */ boolean f() {
        return DEBUG;
    }

    public static /* bridge */ /* synthetic */ Interpolator g() {
        return sInterpolator;
    }

    private RectF getDisplayRect(Matrix matrix) {
        ImageView imageView = this.getImageView();
        if (imageView != null && (imageView = imageView.getDrawable()) != null) {
            RectF rectF = this.mDisplayRect;
            float f5 = imageView.getIntrinsicWidth();
            float f6 = imageView.getIntrinsicHeight();
            rectF.set(0.0f, 0.0f, f5, f6);
            imageView = this.mDisplayRect;
            matrix.mapRect((RectF)imageView);
            return this.mDisplayRect;
        }
        return null;
    }

    private Matrix getDrawMatrix() {
        Matrix matrix = this.mDrawMatrix;
        Matrix matrix2 = this.mBaseMatrix;
        matrix.set(matrix2);
        matrix = this.mDrawMatrix;
        matrix2 = this.mSuppMatrix;
        matrix.postConcat(matrix2);
        return this.mDrawMatrix;
    }

    private int getImageViewHeight(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        int n3 = imageView.getHeight();
        int n4 = imageView.getPaddingTop();
        int n7 = imageView.getPaddingBottom();
        return (n3 -= n4) - n7;
    }

    private int getImageViewWidth(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        int n3 = imageView.getWidth();
        int n4 = imageView.getPaddingLeft();
        int n7 = imageView.getPaddingRight();
        return (n3 -= n4) - n7;
    }

    private float getValue(Matrix matrix, int n3) {
        float[] fArray = this.mMatrixValues;
        matrix.getValues(fArray);
        return this.mMatrixValues[n3];
    }

    private static boolean hasDrawable(ImageView imageView) {
        boolean bl2;
        if (imageView != null && (imageView = imageView.getDrawable()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            imageView = null;
        }
        return bl2;
    }

    private static boolean isSupportedScaleType(ImageView.ScaleType object) {
        if (object == null) {
            return false;
        }
        Object object2 = PhotoViewAttacher$2.$SwitchMap$android$widget$ImageView$ScaleType;
        int n3 = object.ordinal();
        int n4 = object2[n3];
        if (n4 != (n3 = 1)) {
            return n3;
        }
        object2 = new IllegalArgumentException;
        StringBuilder stringBuilder = new StringBuilder();
        object = object.name();
        stringBuilder.append((String)object);
        stringBuilder.append(" is not supported in PhotoView");
        object = stringBuilder.toString();
        object2((String)object);
        throw object2;
    }

    private void resetMatrix() {
        this.mSuppMatrix.reset();
        Matrix matrix = this.getDrawMatrix();
        this.setImageViewMatrix(matrix);
        this.checkMatrixBounds();
    }

    private void setImageViewMatrix(Matrix matrix) {
        Object object = this.getImageView();
        if (object != null) {
            this.checkImageViewScaleType();
            object.setImageMatrix(matrix);
            object = this.mMatrixChangeListener;
            if (object != null && (matrix = this.getDisplayRect(matrix)) != null) {
                object = this.mMatrixChangeListener;
                object.onMatrixChanged((RectF)matrix);
            }
        }
    }

    private static void setImageViewScaleTypeMatrix(ImageView imageView) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        boolean bl2;
        boolean bl3;
        if (imageView != null && !(bl3 = imageView instanceof IPhotoView) && !(bl2 = (scaleType2 = ImageView.ScaleType.MATRIX).equals(scaleType = imageView.getScaleType()))) {
            imageView.setScaleType(scaleType2);
        }
    }

    private void updateBaseMatrix(Drawable drawable2) {
        Object object = this.getImageView();
        if (object != null && drawable2 != null) {
            int n3 = this.getImageViewWidth((ImageView)object);
            float f5 = n3;
            Object object2 = this.getImageViewHeight((ImageView)object);
            float f6 = object2;
            int n4 = drawable2.getIntrinsicWidth();
            int n7 = drawable2.getIntrinsicHeight();
            Matrix matrix = this.mBaseMatrix;
            matrix.reset();
            float f7 = n4;
            float f8 = f5 / f7;
            float f11 = n7;
            float f12 = f6 / f11;
            ImageView.ScaleType scaleType = this.mScaleType;
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
            float f14 = 2.0f;
            if (scaleType == scaleType2) {
                matrix = this.mBaseMatrix;
                f5 = (f5 - f7) / f14;
                f6 = (f6 - f11) / f14;
                matrix.postTranslate(f5, f6);
            } else {
                scaleType2 = ImageView.ScaleType.CENTER_CROP;
                if (scaleType == scaleType2) {
                    f8 = Math.max(f8, f12);
                    this.mBaseMatrix.postScale(f8, f8);
                    Matrix matrix2 = this.mBaseMatrix;
                    f5 = qy_1.a(f7, f8, f5, f14);
                    f11 = qy_1.a(f11, f8, f6, f14);
                    matrix2.postTranslate(f5, f11);
                } else {
                    scaleType2 = ImageView.ScaleType.CENTER_INSIDE;
                    if (scaleType == scaleType2) {
                        float f15 = 1.0f;
                        f8 = Math.min(f8, f12);
                        f8 = Math.min(f15, f8);
                        this.mBaseMatrix.postScale(f8, f8);
                        Matrix matrix3 = this.mBaseMatrix;
                        f5 = qy_1.a(f7, f8, f5, f14);
                        f11 = qy_1.a(f11, f8, f6, f14);
                        matrix3.postTranslate(f5, f11);
                    } else {
                        f12 = 0.0f;
                        Object var17_19 = null;
                        matrix = new RectF(0.0f, 0.0f, f7, f11);
                        drawable2 = new RectF(0.0f, 0.0f, f5, f6);
                        object = PhotoViewAttacher$2.$SwitchMap$android$widget$ImageView$ScaleType;
                        ImageView.ScaleType scaleType3 = this.mScaleType;
                        n3 = scaleType3.ordinal();
                        object2 = object[n3];
                        n3 = 2;
                        f5 = 2.8E-45f;
                        if (object2 != n3) {
                            n3 = 3;
                            f5 = 4.2E-45f;
                            if (object2 != n3) {
                                n3 = 4;
                                f5 = 5.6E-45f;
                                if (object2 != n3) {
                                    n3 = 5;
                                    f5 = 7.0E-45f;
                                    if (object2 == n3) {
                                        object = this.mBaseMatrix;
                                        scaleType3 = Matrix.ScaleToFit.FILL;
                                        object.setRectToRect((RectF)matrix, (RectF)drawable2, (Matrix.ScaleToFit)scaleType3);
                                    }
                                } else {
                                    object = this.mBaseMatrix;
                                    scaleType3 = Matrix.ScaleToFit.CENTER;
                                    object.setRectToRect((RectF)matrix, (RectF)drawable2, (Matrix.ScaleToFit)scaleType3);
                                }
                            } else {
                                object = this.mBaseMatrix;
                                scaleType3 = Matrix.ScaleToFit.END;
                                object.setRectToRect((RectF)matrix, (RectF)drawable2, (Matrix.ScaleToFit)scaleType3);
                            }
                        } else {
                            object = this.mBaseMatrix;
                            scaleType3 = Matrix.ScaleToFit.START;
                            object.setRectToRect((RectF)matrix, (RectF)drawable2, (Matrix.ScaleToFit)scaleType3);
                        }
                    }
                }
            }
            this.resetMatrix();
        }
    }

    public boolean canZoom() {
        return this.mZoomEnabled;
    }

    public void cleanup() {
        WeakReference weakReference = this.mImageView;
        if (weakReference == null) {
            return;
        }
        if ((weakReference = (ImageView)weakReference.get()) != null) {
            boolean bl2;
            ViewTreeObserver viewTreeObserver = weakReference.getViewTreeObserver();
            if (viewTreeObserver != null && (bl2 = viewTreeObserver.isAlive())) {
                viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            }
            weakReference.setOnTouchListener(null);
            this.cancelFling();
        }
        if ((weakReference = this.mGestureDetector) != null) {
            weakReference.setOnDoubleTapListener(null);
        }
        this.mMatrixChangeListener = null;
        this.mPhotoTapListener = null;
        this.mViewTapListener = null;
        this.mImageView = null;
    }

    public Matrix getDisplayMatrix() {
        Matrix matrix = this.getDrawMatrix();
        Matrix matrix2 = new Matrix(matrix);
        return matrix2;
    }

    public RectF getDisplayRect() {
        this.checkMatrixBounds();
        Matrix matrix = this.getDrawMatrix();
        return this.getDisplayRect(matrix);
    }

    public IPhotoView getIPhotoViewImplementation() {
        return this;
    }

    public ImageView getImageView() {
        WeakReference weakReference = this.mImageView;
        weakReference = weakReference != null ? (ImageView)weakReference.get() : null;
        if (weakReference == null) {
            this.cleanup();
            Logger logger = LogManager.getLogger();
            String string2 = LOG_TAG;
            String string3 = "ImageView no longer exists. You should not use this PhotoViewAttacher any more.";
            logger.i(string2, string3);
        }
        return weakReference;
    }

    public float getMaxScale() {
        return this.getMaximumScale();
    }

    public float getMaximumScale() {
        return this.mMaxScale;
    }

    public float getMediumScale() {
        return this.mMidScale;
    }

    public float getMidScale() {
        return this.getMediumScale();
    }

    public float getMinScale() {
        return this.getMinimumScale();
    }

    public float getMinimumScale() {
        return this.mMinScale;
    }

    public PhotoViewAttacher$OnPhotoTapListener getOnPhotoTapListener() {
        return this.mPhotoTapListener;
    }

    public PhotoViewAttacher$OnScaleChangeListener getOnScaleChangeListener() {
        return this.mScaleChangeListener;
    }

    public PhotoViewAttacher$OnViewTapListener getOnViewTapListener() {
        return this.mViewTapListener;
    }

    public float getScale() {
        Matrix matrix = this.mSuppMatrix;
        double d2 = this.getValue(matrix, 0);
        double d5 = 2.0;
        float f5 = (float)Math.pow(d2, d5);
        Matrix matrix2 = this.mSuppMatrix;
        float f6 = (float)Math.pow(this.getValue(matrix2, 3), d5);
        return (float)Math.sqrt(f5 + f6);
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public Bitmap getVisibleRectangleBitmap() {
        Object object = this.getImageView();
        object = object == null ? null : object.getDrawingCache();
        return object;
    }

    public void onDrag(float f5, float f6) {
        block8: {
            ViewParent viewParent;
            int n3;
            block6: {
                block7: {
                    float f7;
                    Object object;
                    n3 = 1;
                    float f8 = Float.MIN_VALUE;
                    int n4 = 2;
                    float f11 = 2.8E-45f;
                    Object object2 = this.mScaleDragDetector;
                    int n7 = object2.isScaling();
                    if (n7 != 0) {
                        return;
                    }
                    n7 = DEBUG;
                    if (n7 != 0) {
                        object2 = LogManager.getLogger();
                        object = Float.valueOf(f5);
                        Object object3 = Float.valueOf(f6);
                        Object[] objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n3] = object3;
                        object = String.format("onDrag: dx: %.2f. dy: %.2f", objectArray);
                        object3 = LOG_TAG;
                        object2.d((String)object3, (String)object);
                    }
                    object2 = this.getImageView();
                    object = this.mSuppMatrix;
                    object.postTranslate(f5, f6);
                    this.checkAndDisplayMatrix();
                    viewParent = object2.getParent();
                    n7 = this.mAllowParentInterceptOnEdge;
                    if (n7 == 0 || (n7 = (object2 = this.mScaleDragDetector).isScaling()) != 0 || (n7 = this.mBlockParentIntercept) != 0) break block6;
                    n7 = this.mScrollEdge;
                    if (n7 == n4 || n7 == 0 && (n4 = (int)((f7 = f5 - (f11 = 1.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) >= 0) break block7;
                    if (n7 != n3) break block8;
                    n3 = -1082130432;
                    f8 = -1.0f;
                    float f12 = f5 - f8;
                    Object object4 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (object4 > 0) break block8;
                }
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                }
                break block8;
            }
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(n3 != 0);
            }
        }
    }

    public void onFling(float f5, float f6, float f7, float f8) {
        Object object;
        Object object2;
        Logger logger;
        int n3 = DEBUG;
        if (n3 != 0) {
            logger = LogManager.getLogger();
            String string2 = "onFling. sX: ";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(f5);
            stringBuilder.append(" sY: ");
            stringBuilder.append(f6);
            stringBuilder.append(" Vx: ");
            stringBuilder.append(f7);
            stringBuilder.append(" Vy: ");
            stringBuilder.append(f8);
            object2 = stringBuilder.toString();
            object = LOG_TAG;
            logger.d((String)object, (String)object2);
        }
        object2 = this.getImageView();
        logger = object2.getContext();
        object = new PhotoViewAttacher$FlingRunnable(this, (Context)logger);
        this.mCurrentFlingRunnable = object;
        n3 = this.getImageViewWidth((ImageView)object2);
        int n4 = this.getImageViewHeight((ImageView)object2);
        int n7 = (int)f7;
        int n8 = (int)f8;
        ((PhotoViewAttacher$FlingRunnable)object).fling(n3, n4, n7, n8);
        object = this.mCurrentFlingRunnable;
        object2.post((Runnable)object);
    }

    public void onGlobalLayout() {
        ImageView imageView = this.getImageView();
        if (imageView != null) {
            int n3 = this.mZoomEnabled;
            if (n3 != 0) {
                n3 = imageView.getTop();
                int n4 = imageView.getRight();
                int n7 = imageView.getBottom();
                int n8 = imageView.getLeft();
                int n10 = this.mIvTop;
                if (n3 != n10 || n7 != (n10 = this.mIvBottom) || n8 != (n10 = this.mIvLeft) || n4 != (n10 = this.mIvRight)) {
                    imageView = imageView.getDrawable();
                    this.updateBaseMatrix((Drawable)imageView);
                    this.mIvTop = n3;
                    this.mIvRight = n4;
                    this.mIvBottom = n7;
                    this.mIvLeft = n8;
                }
            } else {
                imageView = imageView.getDrawable();
                this.updateBaseMatrix((Drawable)imageView);
            }
        }
    }

    public void onScale(float f5, float f6, float f7) {
        float f8;
        float f11;
        float f12;
        float f14;
        Object object;
        int n3 = DEBUG;
        if (n3 != 0) {
            object = LogManager.getLogger();
            Object object2 = Float.valueOf(f5);
            Object object3 = Float.valueOf(f6);
            Float f15 = Float.valueOf(f7);
            int n4 = 3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object2;
            objectArray[1] = object3;
            int n7 = 2;
            f14 = 2.8E-45f;
            objectArray[n7] = f15;
            object2 = String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", objectArray);
            object3 = LOG_TAG;
            object.d((String)object3, (String)object2);
        }
        if ((n3 = (f12 = (f11 = this.getScale()) - (f14 = this.mMaxScale)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0 || (n3 = (int)((f8 = f5 - (f11 = 1.0f)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1))) < 0) {
            object = this.mScaleChangeListener;
            if (object != null) {
                object.onScaleChange(f5, f6, f7);
            }
            object = this.mSuppMatrix;
            object.postScale(f5, f5, f6, f7);
            this.checkAndDisplayMatrix();
        }
    }

    public boolean onTouch(View object, MotionEvent motionEvent) {
        int n3;
        block10: {
            int n4;
            Object object2;
            float f5;
            int n7;
            Object object3;
            int n8;
            block14: {
                block13: {
                    int n10;
                    block11: {
                        float f6;
                        float f7;
                        block12: {
                            n8 = this.mZoomEnabled;
                            n3 = 0;
                            if (n8 == 0) break block10;
                            object3 = object;
                            object3 = (ImageView)object;
                            n8 = PhotoViewAttacher.hasDrawable((ImageView)object3);
                            if (n8 == 0) break block10;
                            object3 = object.getParent();
                            n7 = motionEvent.getAction();
                            n10 = 1;
                            if (n7 == 0) break block11;
                            if (n7 == n10) break block12;
                            n8 = 3;
                            f5 = 4.2E-45f;
                            if (n7 != n8) break block13;
                        }
                        if ((n8 = (int)((f7 = (f5 = this.getScale()) - (f6 = this.mMinScale)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) >= 0 || (object3 = this.getDisplayRect()) == null) break block13;
                        float f8 = this.getScale();
                        float f11 = this.mMinScale;
                        float f12 = object3.centerX();
                        float f14 = object3.centerY();
                        object2 = new PhotoViewAttacher$AnimatedZoomRunnable(this, f8, f11, f12, f14);
                        object.post((Runnable)object2);
                        n4 = 1;
                        break block14;
                    }
                    if (object3 != null) {
                        object3.requestDisallowInterceptTouchEvent(n10 != 0);
                    } else {
                        object = LogManager.getLogger();
                        object3 = LOG_TAG;
                        object2 = "onTouch getParent() returned null";
                        object.i((String)object3, (String)object2);
                    }
                    this.cancelFling();
                }
                n4 = 0;
                object = null;
            }
            object3 = this.mScaleDragDetector;
            if (object3 != null) {
                n4 = object3.isScaling();
                object3 = this.mScaleDragDetector;
                n8 = (int)(object3.isDragging() ? 1 : 0);
                object2 = this.mScaleDragDetector;
                n7 = (int)(object2.onTouchEvent(motionEvent) ? 1 : 0);
                if (n4 == 0 && (n4 = (object = this.mScaleDragDetector).isScaling()) == 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (n8 == 0 && (n8 = (int)((object3 = this.mScaleDragDetector).isDragging() ? 1 : 0)) == 0) {
                    n8 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    n8 = 0;
                    f5 = 0.0f;
                    object3 = null;
                }
                if (n4 != 0 && n8 != 0) {
                    n3 = 1;
                }
                this.mBlockParentIntercept = n3;
                n3 = n7;
            } else {
                n3 = n4;
            }
            object = this.mGestureDetector;
            if (object != null && (n4 = object.onTouchEvent(motionEvent)) != 0) {
                n3 = 1;
            }
        }
        return n3 != 0;
    }

    public void setAllowParentInterceptOnEdge(boolean bl2) {
        this.mAllowParentInterceptOnEdge = bl2;
    }

    public boolean setDisplayMatrix(Matrix object) {
        if (object != null) {
            ImageView imageView = this.getImageView();
            if (imageView == null) {
                return false;
            }
            if ((imageView = imageView.getDrawable()) == null) {
                return false;
            }
            this.mSuppMatrix.set(object);
            object = this.getDrawMatrix();
            this.setImageViewMatrix((Matrix)object);
            this.checkMatrixBounds();
            return true;
        }
        object = new IllegalArgumentException("Matrix cannot be null");
        throw object;
    }

    public void setMaxScale(float f5) {
        this.setMaximumScale(f5);
    }

    public void setMaximumScale(float f5) {
        float f6 = this.mMinScale;
        float f7 = this.mMidScale;
        PhotoViewAttacher.checkZoomLevels(f6, f7, f5);
        this.mMaxScale = f5;
    }

    public void setMediumScale(float f5) {
        float f6 = this.mMinScale;
        float f7 = this.mMaxScale;
        PhotoViewAttacher.checkZoomLevels(f6, f5, f7);
        this.mMidScale = f5;
    }

    public void setMidScale(float f5) {
        this.setMediumScale(f5);
    }

    public void setMinScale(float f5) {
        this.setMinimumScale(f5);
    }

    public void setMinimumScale(float f5) {
        float f6 = this.mMidScale;
        float f7 = this.mMaxScale;
        PhotoViewAttacher.checkZoomLevels(f5, f6, f7);
        this.mMinScale = f5;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            android.view.GestureDetector gestureDetector = this.mGestureDetector;
            gestureDetector.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            onDoubleTapListener = this.mGestureDetector;
            DefaultOnDoubleTapListener defaultOnDoubleTapListener = new DefaultOnDoubleTapListener(this);
            onDoubleTapListener.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)defaultOnDoubleTapListener);
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnMatrixChangeListener(PhotoViewAttacher$OnMatrixChangedListener photoViewAttacher$OnMatrixChangedListener) {
        this.mMatrixChangeListener = photoViewAttacher$OnMatrixChangedListener;
    }

    public void setOnPhotoTapListener(PhotoViewAttacher$OnPhotoTapListener photoViewAttacher$OnPhotoTapListener) {
        this.mPhotoTapListener = photoViewAttacher$OnPhotoTapListener;
    }

    public void setOnScaleChangeListener(PhotoViewAttacher$OnScaleChangeListener photoViewAttacher$OnScaleChangeListener) {
        this.mScaleChangeListener = photoViewAttacher$OnScaleChangeListener;
    }

    public void setOnViewTapListener(PhotoViewAttacher$OnViewTapListener photoViewAttacher$OnViewTapListener) {
        this.mViewTapListener = photoViewAttacher$OnViewTapListener;
    }

    public void setPhotoViewRotation(float f5) {
        Matrix matrix = this.mSuppMatrix;
        matrix.setRotate(f5 %= 360.0f);
        this.checkAndDisplayMatrix();
    }

    public void setRotationBy(float f5) {
        Matrix matrix = this.mSuppMatrix;
        matrix.postRotate(f5 %= 360.0f);
        this.checkAndDisplayMatrix();
    }

    public void setRotationTo(float f5) {
        Matrix matrix = this.mSuppMatrix;
        matrix.setRotate(f5 %= 360.0f);
        this.checkAndDisplayMatrix();
    }

    public void setScale(float f5) {
        this.setScale(f5, false);
    }

    public void setScale(float f5, float f6, float f7, boolean bl2) {
        ImageView imageView = this.getImageView();
        if (imageView != null) {
            float f8;
            float f11 = this.mMinScale;
            float f12 = f5 - f11;
            Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (object >= 0 && (object = (f8 = f5 - (f11 = this.mMaxScale)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) <= 0) {
                if (bl2) {
                    float f14 = this.getScale();
                    PhotoViewAttacher$AnimatedZoomRunnable photoViewAttacher$AnimatedZoomRunnable = new PhotoViewAttacher$AnimatedZoomRunnable(this, f14, f5, f6, f7);
                    imageView.post((Runnable)photoViewAttacher$AnimatedZoomRunnable);
                } else {
                    Matrix matrix = this.mSuppMatrix;
                    matrix.setScale(f5, f5, f6, f7);
                    this.checkAndDisplayMatrix();
                }
            } else {
                Logger logger = LogManager.getLogger();
                String string2 = LOG_TAG;
                String string3 = "Scale must be within the range of minScale and maxScale";
                logger.i(string2, string3);
            }
        }
    }

    public void setScale(float f5, boolean bl2) {
        ImageView imageView = this.getImageView();
        if (imageView != null) {
            int n3 = imageView.getRight() / 2;
            float f6 = n3;
            int n4 = imageView.getBottom() / 2;
            float f7 = n4;
            this.setScale(f5, f6, f7, bl2);
        }
    }

    public void setScaleLevels(float f5, float f6, float f7) {
        PhotoViewAttacher.checkZoomLevels(f5, f6, f7);
        this.mMinScale = f5;
        this.mMidScale = f6;
        this.mMaxScale = f7;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2;
        boolean bl2 = PhotoViewAttacher.isSupportedScaleType(scaleType);
        if (bl2 && scaleType != (scaleType2 = this.mScaleType)) {
            this.mScaleType = scaleType;
            this.update();
        }
    }

    public void setZoomTransitionDuration(int n3) {
        if (n3 < 0) {
            n3 = 200;
        }
        this.ZOOM_DURATION = n3;
    }

    public void setZoomable(boolean bl2) {
        this.mZoomEnabled = bl2;
        this.update();
    }

    public void update() {
        ImageView imageView = this.getImageView();
        if (imageView != null) {
            boolean bl2 = this.mZoomEnabled;
            if (bl2) {
                PhotoViewAttacher.setImageViewScaleTypeMatrix(imageView);
                imageView = imageView.getDrawable();
                this.updateBaseMatrix((Drawable)imageView);
            } else {
                this.resetMatrix();
            }
        }
    }
}

