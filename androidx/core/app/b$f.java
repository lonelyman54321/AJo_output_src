/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.SharedElementCallback
 *  android.app.SharedElementCallback$OnSharedElementsReadyListener
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
package androidx.core.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.b$a;
import java.util.List;
import java.util.Map;

public final class b$f
extends SharedElementCallback {
    public final e23 a;

    public b$f(e23 e232) {
        this.a = e232;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Drawable drawable2;
        View view2;
        Object object;
        View view3;
        block9: {
            float f5;
            int n3;
            float f6;
            float f7;
            int n4;
            RectF rectF2;
            block8: {
                view3 = view;
                rectF2 = rectF;
                object = this.a;
                object.getClass();
                n4 = view instanceof ImageView;
                f7 = 1.0f;
                f6 = 8;
                if (n4 == 0) break block8;
                view2 = view;
                view2 = (ImageView)view;
                drawable2 = view2.getDrawable();
                Drawable drawable3 = view2.getBackground();
                if (drawable2 == null || drawable3 != null) break block8;
                int n7 = drawable2.getIntrinsicWidth();
                int n8 = drawable2.getIntrinsicHeight();
                if (n7 > 0 && n8 > 0) {
                    int n10 = n7 * n8;
                    float f8 = n10;
                    f8 = f6 / f8;
                    f8 = Math.min(f7, f8);
                    boolean bl2 = drawable2 instanceof BitmapDrawable;
                    if (bl2 && !(bl2 = f8 == f7 ? 0 : (f8 > f7 ? 1 : -1))) {
                        drawable2 = ((BitmapDrawable)drawable2).getBitmap();
                    } else {
                        float f11 = (float)n7 * f8;
                        n7 = (int)f11;
                        float f12 = (float)n8 * f8;
                        n8 = (int)f12;
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        config = Bitmap.createBitmap((int)n7, (int)n8, (Bitmap.Config)config);
                        Canvas canvas = new Canvas((Bitmap)config);
                        Rect rect = drawable2.getBounds();
                        int n14 = rect.left;
                        int n15 = rect.top;
                        n3 = rect.right;
                        int n16 = rect.bottom;
                        f7 = 0.0f;
                        drawable2.setBounds(0, 0, n7, n8);
                        drawable2.draw(canvas);
                        drawable2.setBounds(n14, n15, n3, n16);
                        drawable2 = config;
                    }
                } else {
                    f5 = 0.0f;
                    drawable2 = null;
                }
                if (drawable2 != null) break block9;
            }
            float f14 = rectF.width();
            n4 = Math.round(f14);
            float f15 = rectF.height();
            n3 = Math.round(f15);
            if (n4 <= 0) return null;
            if (n3 <= 0) return null;
            f7 = n4 * n3;
            f6 /= f7;
            f7 = Math.min(1.0f, f6);
            f14 = (float)n4 * f7;
            n4 = (int)f14;
            f15 = (float)n3 * f7;
            n3 = (int)f15;
            Matrix matrix2 = ((e23)object).a;
            if (matrix2 == null) {
                ((e23)object).a = matrix2 = new Matrix();
            }
            matrix2 = ((e23)object).a;
            drawable2 = matrix;
            matrix2.set(matrix);
            matrix2 = ((e23)object).a;
            f5 = -rectF2.left;
            float f16 = -rectF2.top;
            matrix2.postTranslate(f5, f16);
            ((e23)object).a.postScale(f7, f7);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmap = Bitmap.createBitmap((int)n4, (int)n3, (Bitmap.Config)config);
            Canvas canvas = new Canvas(bitmap);
            object = ((e23)object).a;
            canvas.concat((Matrix)object);
            view3.draw(canvas);
            return bitmap;
        }
        view3 = new Bundle();
        view3.putParcelable("sharedElement:snapshot:bitmap", (Parcelable)drawable2);
        String string2 = view2.getScaleType().toString();
        view3.putString("sharedElement:snapshot:imageScaleType", string2);
        ImageView.ScaleType scaleType = view2.getScaleType();
        object = ImageView.ScaleType.MATRIX;
        if (scaleType != object) return view3;
        Matrix matrix3 = view2.getImageMatrix();
        int n17 = 9;
        object = new float[n17];
        matrix3.getValues((float[])object);
        String string3 = "sharedElement:snapshot:imageMatrix";
        view3.putFloatArray(string3, (float[])object);
        return view3;
    }

    public final View onCreateSnapshotView(Context object, Parcelable parcelable) {
        e23 e232 = this.a;
        e232.getClass();
        boolean bl2 = parcelable instanceof Bundle;
        ImageView imageView = null;
        if (bl2) {
            e232 = (Bitmap)(parcelable = (Bundle)parcelable).getParcelable("sharedElement:snapshot:bitmap");
            if (e232 != null) {
                imageView = new ImageView(object);
                imageView.setImageBitmap((Bitmap)e232);
                object = ImageView.ScaleType.valueOf((String)parcelable.getString("sharedElement:snapshot:imageScaleType"));
                imageView.setScaleType((ImageView.ScaleType)object);
                object = imageView.getScaleType();
                e232 = ImageView.ScaleType.MATRIX;
                if (object == e232) {
                    object = parcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
                    parcelable = new Matrix();
                    parcelable.setValues((float[])object);
                    imageView.setImageMatrix((Matrix)parcelable);
                }
            }
        } else {
            bl2 = parcelable instanceof Bitmap;
            if (bl2) {
                parcelable = (Bitmap)parcelable;
                imageView = new ImageView(object);
                imageView.setImageBitmap((Bitmap)parcelable);
            }
        }
        return imageView;
    }

    public final void onMapSharedElements(List list, Map map2) {
        this.a.getClass();
    }

    public final void onRejectSharedElements(List list) {
        this.a.getClass();
    }

    public final void onSharedElementEnd(List list, List list2, List list3) {
        this.a.getClass();
    }

    public final void onSharedElementStart(List list, List list2, List list3) {
        this.a.getClass();
    }

    public final void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.a.getClass();
        b$a.a(onSharedElementsReadyListener);
    }
}

