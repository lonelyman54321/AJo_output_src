/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ga
 */
public final class ga_2
implements ck2_0 {
    public final /* synthetic */ da_2 a;

    public ga_2(da_2 da_22) {
        this.a = da_22;
    }

    public final void b(GlideException object, ki3_1 ki3_12) {
        Intrinsics.checkNotNullParameter(ki3_12, "target");
        object = this.a;
        boolean bl2 = ((da_2)object).u;
        if (bl2 && (object = ((da_2)object).t) != null) {
            object.a();
        }
    }

    public final void f(Object object, Object object2, ki3_1 object3, pi0_0 pi0_02) {
        object = (Bitmap)object;
        Intrinsics.checkNotNullParameter(object, "resource");
        object3 = "model";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter((Object)pi0_02, "dataSource");
        object2 = this.a;
        boolean bl2 = ((da_2)object2).u;
        if (bl2 && (object2 = ((da_2)object2).t) != null) {
            object2.b((Bitmap)object);
        }
    }
}

