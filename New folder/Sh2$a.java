/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

public final class Sh2$a
implements ck2_0 {
    public final /* synthetic */ sh2_2 a;

    public Sh2$a(sh2_2 sh2_22) {
        this.a = sh2_22;
    }

    public final void b(GlideException object, ki3_1 ki3_12) {
        Intrinsics.checkNotNullParameter(ki3_12, "target");
        object = this.a.h;
        if (object != null) {
            int n3 = 8;
            object.setVisibility(n3);
        }
    }

    public final void f(Object object, Object object2, ki3_1 object3, pi0_0 pi0_02) {
        object = (Drawable)object;
        object3 = "resource";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "model");
        Intrinsics.checkNotNullParameter((Object)pi0_02, "dataSource");
        object = this.a.h;
        if (object != null) {
            object2 = null;
            object.setVisibility(0);
        }
    }
}

