/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.util.AttributeSet
 *  org.xmlpull.v1.XmlPullParser
 */
package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.transition.PathMotion;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion
extends PathMotion {
    public final Path a;
    public final Matrix b;

    public PatternPathMotion() {
        Matrix matrix;
        Path path;
        this.a = path = new Path();
        this.b = matrix = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PatternPathMotion(Context context, AttributeSet object) {
        Throwable throwable2;
        Object object2;
        block3: {
            this.a = object2 = new Path();
            this.b = object2;
            object2 = af3.i;
            context = context.obtainStyledAttributes(object, (int[])object2);
            try {
                object = (XmlPullParser)object;
                object2 = "patternPathData";
                object = dt3.e((TypedArray)context, (XmlPullParser)object, (String)object2, 0);
                if (object == null) break block3;
                object = rn2.d((String)object);
                this.a((Path)object);
            }
            catch (Throwable throwable2) {}
            context.recycle();
            return;
        }
        object2 = "pathData must be supplied for patternPathMotion";
        super((String)object2);
        throw object;
        context.recycle();
        throw throwable2;
    }

    public PatternPathMotion(Path path) {
        Path path2;
        this.a = path2 = new Path();
        this.b = path2;
        this.a(path);
    }

    public final void a(Path object) {
        PathMeasure pathMeasure = new PathMeasure(object, false);
        float f5 = pathMeasure.getLength();
        float f6 = 2.8E-45f;
        float[] fArray = new float[2];
        float f7 = 0.0f;
        pathMeasure.getPosTan(f5, fArray, null);
        f5 = fArray[0];
        int n3 = 1;
        float f8 = fArray[n3];
        pathMeasure.getPosTan(0.0f, fArray, null);
        float f11 = fArray[0];
        float f12 = fArray[n3];
        float f14 = f11 == f5 ? 0 : (f11 > f5 ? 1 : -1);
        if (f14 == false && (f14 = f12 == f8 ? 0 : (f12 > f8 ? 1 : -1)) == false) {
            object = new IllegalArgumentException("pattern must not end at the starting point");
            throw object;
        }
        f6 = -f11;
        f7 = -f12;
        Matrix matrix = this.b;
        matrix.setTranslate(f6, f7);
        f5 -= f11;
        f11 = f5 * f5;
        f11 = (float)Math.sqrt((f8 -= f12) * f8 + f11);
        f12 = 1.0f / f11;
        matrix.postScale(f12, f12);
        double d2 = f8;
        double d5 = f5;
        f11 = (float)Math.toDegrees(-Math.atan2(d2, d5));
        matrix.postRotate(f11);
        pathMeasure = this.a;
        object.transform(matrix, (Path)pathMeasure);
    }

    public final Path getPath(float f5, float f6, float f7, float f8) {
        float f11 = (f7 -= f5) * f7;
        f11 = (float)Math.sqrt((f8 -= f6) * f8 + f11);
        double d2 = f8;
        double d5 = f7;
        d5 = Math.atan2(d2, d5);
        Matrix matrix = this.b;
        matrix.setScale(f11, f11);
        f7 = (float)Math.toDegrees(d5);
        matrix.postRotate(f7);
        matrix.postTranslate(f5, f6);
        Path path = new Path();
        this.a.transform(matrix, path);
        return path;
    }
}

