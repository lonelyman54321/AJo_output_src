/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapShader
 *  android.graphics.ColorFilter
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.ClipDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.widget.ProgressBar
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class vn {
    public static final int[] c = new int[]{16843067, 16843068};
    public final ProgressBar a;
    public Bitmap b;

    public vn(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public void a(AttributeSet object, int n3) {
        ProgressBar progressBar = this.a;
        Context context = progressBar.getContext();
        int[] nArray = c;
        object = Tn3.f(context, (AttributeSet)object, nArray, n3, 0);
        Drawable drawable2 = ((Tn3)object).c(0);
        boolean bl2 = true;
        if (drawable2 != null) {
            int n4 = drawable2 instanceof AnimationDrawable;
            if (n4 != 0) {
                int n7;
                drawable2 = (AnimationDrawable)drawable2;
                n4 = drawable2.getNumberOfFrames();
                AnimationDrawable animationDrawable = new AnimationDrawable();
                int n8 = drawable2.isOneShot();
                animationDrawable.setOneShot(n8 != 0);
                n8 = 0;
                while (true) {
                    n7 = 10000;
                    if (n8 >= n4) break;
                    Drawable drawable3 = drawable2.getFrame(n8);
                    drawable3 = this.b(drawable3, bl2);
                    drawable3.setLevel(n7);
                    n7 = drawable2.getDuration(n8);
                    animationDrawable.addFrame(drawable3, n7);
                    ++n8;
                }
                animationDrawable.setLevel(n7);
                drawable2 = animationDrawable;
            }
            progressBar.setIndeterminateDrawable(drawable2);
        }
        if ((drawable2 = ((Tn3)object).c((int)(bl2 ? 1 : 0))) != null) {
            drawable2 = this.b(drawable2, false);
            progressBar.setProgressDrawable(drawable2);
        }
        ((Tn3)object).g();
    }

    public final Drawable b(Drawable drawable2, boolean n3) {
        int n4 = 1;
        int n7 = drawable2 instanceof fj3_0;
        if (n7 != 0) {
            Object object = drawable2;
            object = (fj3_0)drawable2;
            Drawable drawable3 = object.a();
            if (drawable3 != null) {
                Drawable drawable4 = this.b(drawable3, n3 != 0);
                object.b(drawable4);
            }
        } else {
            n7 = drawable2 instanceof LayerDrawable;
            if (n7 != 0) {
                int n8;
                drawable2 = (LayerDrawable)drawable2;
                n3 = drawable2.getNumberOfLayers();
                Drawable[] drawableArray = new Drawable[n3];
                int n10 = 0;
                Object var9_11 = null;
                LayerDrawable layerDrawable = null;
                for (int i3 = 0; i3 < n3; i3 += n4) {
                    Drawable drawable5;
                    n8 = drawable2.getId(i3);
                    Drawable drawable6 = drawable2.getDrawable(i3);
                    int n14 = 16908301;
                    if (n8 != n14 && n8 != (n14 = 16908303)) {
                        n8 = 0;
                        drawable5 = null;
                    } else {
                        n8 = 1;
                    }
                    drawableArray[i3] = drawable5 = this.b(drawable6, n8 != 0);
                }
                layerDrawable = new LayerDrawable(drawableArray);
                while (n10 < n3) {
                    n7 = drawable2.getId(n10);
                    layerDrawable.setId(n10, n7);
                    n7 = Build.VERSION.SDK_INT;
                    n8 = 23;
                    if (n7 >= n8) {
                        vn$a.a((LayerDrawable)drawable2, layerDrawable, n10);
                    }
                    n10 += n4;
                }
                return layerDrawable;
            }
            n7 = drawable2 instanceof BitmapDrawable;
            if (n7 != 0) {
                Object object;
                drawable2 = (BitmapDrawable)drawable2;
                Bitmap bitmap = drawable2.getBitmap();
                Bitmap bitmap2 = this.b;
                if (bitmap2 == null) {
                    this.b = bitmap;
                }
                int n15 = 8;
                float[] fArray = object = new float[n15];
                float[] fArray2 = object;
                fArray[0] = 5.0f;
                fArray2[1] = 5.0f;
                fArray[2] = 5.0f;
                fArray2[3] = 5.0f;
                fArray[4] = 5.0f;
                fArray2[5] = 5.0f;
                fArray[6] = 5.0f;
                fArray2[7] = 5.0f;
                RoundRectShape roundRectShape = new RoundRectShape(object, null, null);
                bitmap2 = new ShapeDrawable((Shape)roundRectShape);
                object = new BitmapShader;
                roundRectShape = Shader.TileMode.REPEAT;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                object(bitmap, (Shader.TileMode)roundRectShape, tileMode);
                bitmap2.getPaint().setShader((Shader)object);
                bitmap = bitmap2.getPaint();
                drawable2 = drawable2.getPaint().getColorFilter();
                bitmap.setColorFilter((ColorFilter)drawable2);
                if (n3) {
                    n3 = 3;
                    drawable2 = new ClipDrawable((Drawable)bitmap2, n3, n4);
                    bitmap2 = drawable2;
                }
                return bitmap2;
            }
        }
        return drawable2;
    }
}

