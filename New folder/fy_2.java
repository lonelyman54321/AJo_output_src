/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/*
 * Renamed from fy
 */
public final class fy_2
implements el0_0 {
    public final Bitmap a;
    public final ba2 b;

    public fy_2(Bitmap bitmap, ba2 ba22) {
        this.a = bitmap;
        this.b = ba22;
    }

    public final Object a(f80_0 object) {
        Resources resources = this.b.a.getResources();
        Object object2 = this.a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, object2);
        object2 = ri0.MEMORY;
        object = new hu0((Drawable)bitmapDrawable, false, (ri0)((Object)object2));
        return object;
    }
}

