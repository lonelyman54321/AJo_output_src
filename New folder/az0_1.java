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
import java.security.MessageDigest;

/*
 * Renamed from AZ0
 */
public final class az0_1
implements xq3_0 {
    public final xq3_0 b;

    public az0_1(xq3_0 xq3_02) {
        dV0.c(xq3_02, "Argument must not be null");
        this.b = xq3_02;
    }

    public final wk2_0 a(Context object, wk2_0 wk2_02, int n3, int n4) {
        yz0_2 yz0_22 = (yz0_2)wk2_02.get();
        Object object2 = a.a((Context)object).b;
        Bitmap bitmap = yz0_22.a.a.l;
        py_2 py_22 = new py_2((ny_0)object2, bitmap);
        if ((n3 = (int)(py_22.equals(object = (object2 = this.b).a((Context)object, py_22, n3, n4)) ? 1 : 0)) == 0) {
            py_22.a();
        }
        object = (Bitmap)object.get();
        yz0_22.a.a.c((xq3_0)object2, (Bitmap)object);
        return wk2_02;
    }

    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof az0_1;
        if (bl2) {
            object = (az0_1)object;
            xq3_0 xq3_02 = this.b;
            object = ((az0_1)object).b;
            return xq3_02.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

