/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 */
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

public final class k02
implements ck2_0 {
    public final /* synthetic */ j02_0 a;

    public k02(j02_0 j02_02) {
        this.a = j02_02;
    }

    public final void b(GlideException object, ki3_1 ki3_12) {
        Intrinsics.checkNotNullParameter(ki3_12, "target");
        object = this.a;
        object.getClass();
        Object object2 = Looper.getMainLooper();
        ki3_12 = new Handler(object2);
        object2 = new L7(object, 1);
        ki3_12.post((Runnable)object2);
    }

    public final void f(Object object, Object object2, ki3_1 object3, pi0_0 pi0_02) {
        Intrinsics.checkNotNullParameter((Drawable)object, "resource");
        Intrinsics.checkNotNullParameter(object2, "model");
        Intrinsics.checkNotNullParameter(object3, "target");
        Intrinsics.checkNotNullParameter((Object)pi0_02, "dataSource");
        object = this.a;
        object.getClass();
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new L7(object, 1);
        object2.post((Runnable)object3);
    }
}

