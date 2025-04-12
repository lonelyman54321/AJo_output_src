/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 */
import android.graphics.drawable.Drawable;
import android.net.Uri;

/*
 * Renamed from xK2
 */
public final class xk2_0
implements BK2 {
    public final dk2_1 a;
    public final ny_0 b;

    public xk2_0(dk2_1 dk2_12, ny_0 ny_02) {
        this.a = dk2_12;
        this.b = ny_02;
    }

    public final boolean a(Object object, Z92 z92) {
        object = ((Uri)object).getScheme();
        return "android.resource".equals(object);
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 object2) {
        object = (Uri)object;
        dk2_1 dk2_12 = this.a;
        if ((object = dk2_12.c((Uri)object, (Z92)object2)) == null) {
            object = null;
        } else {
            object = (Drawable)((gu0_0)object).get();
            object2 = this.b;
            object = iu0.a((ny_0)object2, (Drawable)object, n3, n4);
        }
        return object;
    }
}

