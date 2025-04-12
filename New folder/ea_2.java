/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 */
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ea
 */
public final class ea_2
extends ky_0 {
    public final /* synthetic */ da_2 e;

    public ea_2(da_2 da_22, ImageView imageView) {
        this.e = da_22;
        super((View)imageView);
    }

    public final void d(Object object, qr3 object2) {
        boolean bl2;
        object = (Bitmap)object;
        Intrinsics.checkNotNullParameter(object, "resource");
        da_2 da_22 = this.e;
        boolean bl3 = da_22.r;
        if (!bl3) {
            super.d(object, (qr3)object2);
        }
        if ((bl2 = da_22.u) && (object2 = da_22.t) != null) {
            object2.b((Bitmap)object);
        }
    }

    public final void i(Drawable object) {
        super.i((Drawable)object);
        object = this.e;
        object.getClass();
        boolean bl2 = ((da_2)object).u;
        if (bl2 && (object = ((da_2)object).t) != null) {
            object.a();
        }
    }
}

