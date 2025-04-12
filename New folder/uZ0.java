/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 *  android.graphics.Movie
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.E$b;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class uZ0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uZ0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = (pl2_1)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = ((Fragment)object2).requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(object3, "requireParentFragment(...)");
                object2 = "owner";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Object object4 = object3.getViewModelStore();
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                E$b e$b = object3.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object3 = object3.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object4, "store");
                Intrinsics.checkNotNullParameter(e$b, "factory");
                object3 = li_2.a((Wd0)object3, "defaultCreationExtras", (rd3_0)object4, e$b, (Wd0)object3);
                object2 = ov0_0.class;
                object4 = "modelClass";
                object2 = do_0.a(object2, (String)object4, object2, (String)object4, (String)object4);
                Intrinsics.checkNotNullParameter(object2, "<this>");
                object4 = object2.getQualifiedName();
                if (object4 != null) {
                    object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
                    return (ov0_0)((pD3)object3).a((yn1_2)object2, (String)object4);
                }
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object3 = new IllegalArgumentException((String)object2);
                throw object3;
            }
            case 0: 
        }
        Object object5 = (vz0_0)this.b;
        int n4 = ((vz0_0)object5).c;
        Object object6 = ((vz0_0)object5).a;
        if (n4 != 0) {
            object6 = ((Fe1)object6).d();
            object = new qw0_0((se_1)object6);
            object = o72_0.b((a93_0)object);
        } else {
            object = ((Fe1)object6).d();
        }
        try {
            object6 = object.inputStream();
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b((Closeable)object, throwable);
                throw throwable2;
            }
        }
        object6 = Movie.decodeStream((InputStream)object6);
        Object var5_11 = null;
        xj3_1.b((Closeable)object, null);
        if (object6 != null && (n4 = object6.width()) > 0 && (n4 = object6.height()) > 0) {
            Bitmap.Config config;
            boolean bl2 = object6.isOpaque();
            object5 = ((vz0_0)object5).b;
            config = bl2 && (bl2 = ((ba2)object5).g) ? Bitmap.Config.RGB_565 : ((bl2 = f.a(config = ((ba2)object5).b)) ? Bitmap.Config.ARGB_8888 : ((ba2)object5).b);
            WS2 wS2 = ((ba2)object5).e;
            object = new xQ1((Movie)object6, config, wS2);
            object5 = ((ba2)object5).l;
            object6 = (Hm2$b)((hm2_0)object5).a.get("coil#repeat_count");
            ((xQ1)((Object)object)).q = -1;
            object5 = ((hm2_0)object5).a;
            object6 = (Hm2$b)object5.get("coil#animation_start_callback");
            object6 = (Hm2$b)object5.get("coil#animation_end_callback");
            object5 = (Hm2$b)object5.get("coil#animated_transformation");
            ((xQ1)((Object)object)).r = null;
            object5 = Ms2.UNCHANGED;
            ((xQ1)((Object)object)).s = object5;
            ((xQ1)((Object)object)).t = false;
            object.invalidateSelf();
            object6 = new aj0((Drawable)object, false);
            return object6;
        }
        object = "Failed to decode GIF.".toString();
        object5 = new IllegalStateException((String)object);
        throw object5;
    }
}

