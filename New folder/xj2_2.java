/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Build$VERSION
 */
import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XJ2
 */
public final class xj2_2
implements lv_2,
TV {
    public static final xj2_2 a;

    static {
        xj2_2 xj2_22;
        a = xj2_22 = new Object();
    }

    public static ih_0 b(int n3, int n4, int n7) {
        Bitmap bitmap;
        gp2_0 gp2_02 = eZ.c;
        Bitmap.Config config = Lh.b(n7);
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 26;
        boolean bl2 = true;
        if (n8 >= n10) {
            bitmap = Yl.b(n3, n4, n7, bl2, gp2_02);
        } else {
            n7 = 0;
            bitmap = Bitmap.createBitmap(null, (int)n3, (int)n4, (Bitmap.Config)config);
            bitmap.setHasAlpha(bl2);
        }
        ih_0 ih_02 = new ih_0(bitmap);
        return ih_02;
    }

    public void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).f;
        ks2_2 ks2_22 = ib1_2.f;
        wj2_2 wj2_22 = new wj2_2((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, wj2_22);
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

