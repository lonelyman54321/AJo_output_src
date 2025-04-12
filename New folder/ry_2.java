/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 */
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/*
 * Renamed from ry
 */
public abstract class ry_2
implements xq3_0 {
    public final wk2_0 a(Context object, wk2_0 object2, int n3, int n4) {
        boolean bl2 = dz3.i(n3, n4);
        if (bl2) {
            Bitmap bitmap;
            object = a.a((Context)object).b;
            Bitmap bitmap2 = (Bitmap)object2.get();
            int n7 = -1 << -1;
            if (n3 == n7) {
                n3 = bitmap2.getWidth();
            }
            if (n4 == n7) {
                n4 = bitmap2.getHeight();
            }
            if ((n4 = (int)(bitmap2.equals(bitmap = this.c((ny_0)object, bitmap2, n3, n4)) ? 1 : 0)) == 0) {
                object2 = py_2.b((ny_0)object, bitmap);
            }
            return object2;
        }
        object2 = z41.a("Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL", n3, n4);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public abstract Bitmap c(ny_0 var1, Bitmap var2, int var3, int var4);
}

