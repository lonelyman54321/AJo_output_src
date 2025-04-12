/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/*
 * Renamed from ju0
 */
public final class ju0_1
implements xq3_0 {
    public final xq3_0 b;
    public final boolean c;

    public ju0_1(xq3_0 xq3_02, boolean bl2) {
        this.b = xq3_02;
        this.c = bl2;
    }

    public final wk2_0 a(Context object, wk2_0 object2, int n3, int n4) {
        Object object3 = a.a((Context)object).b;
        Object object4 = (Drawable)object2.get();
        if ((object3 = iu0.a((ny_0)object3, (Drawable)object4, n3, n4)) == null) {
            boolean bl2 = this.c;
            if (!bl2) {
                return object2;
            }
            object2 = new StringBuilder("Unable to convert ");
            ((StringBuilder)object2).append(object4);
            ((StringBuilder)object2).append(" to a Bitmap");
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object4 = this.b;
        wk2_0 wk2_02 = object4.a((Context)object, (wk2_0)object3, n3, n4);
        if ((n4 = (int)(wk2_02.equals(object3) ? 1 : 0)) != 0) {
            wk2_02.a();
            return object2;
        }
        object = object.getResources();
        object2 = new uq1_2((Resources)object, wk2_02);
        return object2;
    }

    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ju0_1;
        if (bl2) {
            object = (ju0_1)object;
            xq3_0 xq3_02 = this.b;
            object = ((ju0_1)object).b;
            return xq3_02.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

