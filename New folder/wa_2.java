/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wA
 */
public final class wa_2
implements Callable {
    public final /* synthetic */ cl2_2 a;

    public /* synthetic */ wa_2(cl2_2 cl2_22) {
        this.a = cl2_22;
    }

    public final Object call() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$response");
        Object object2 = ((cl2_2)object).g;
        object = null;
        object2 = object2 != null ? ((il2_2)object2).a() : null;
        if (object2 != null) {
            object2 = BitmapFactory.decodeStream((InputStream)object2);
            object = new qy_2((Bitmap)object2);
        } else {
            object = object2 = new qy_2(null);
        }
        return object;
    }
}

