/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/*
 * Renamed from le1
 */
public final class le1_2
implements Callable {
    public final /* synthetic */ me1_2 a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ le1_2(me1_2 me1_22, Uri uri) {
        this.a = me1_22;
        this.b = uri;
    }

    public final Object call() {
        Object object = this.a;
        Object object2 = ((me1_2)object).b;
        object = ((me1_2)object).a;
        object2.getClass();
        Uri uri = this.b;
        float f5 = ty2_2.f((Context)object, uri);
        float f6 = 0.0f;
        Object object3 = "Oops, something went wrong. Please try again";
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 != false) {
            f8 = 1065353216;
            f6 = 1.0f;
            float f11 = f5 - f6;
            Object object4 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (object4 <= 0) {
                if (object != null) {
                    object4 = ((ty2_2)object2).a;
                    if (object4 != false) {
                        object3 = new uy2_2();
                        ((uy2_2)object3).b = object2 = ty2_2.b((Context)object, uri);
                        ((uy2_2)object3).a = object = ty2_2.e((Context)object, uri);
                        boolean bl2 = false;
                        float f12 = 0.0f;
                        object = null;
                        ((uy2_2)object3).c = null;
                        ((uy2_2)object3).e = uri;
                    } else {
                        object3 = ((ty2_2)object2).h((Context)object, uri);
                    }
                }
            } else {
                object3 = ((ty2_2)object2).h((Context)object, uri);
                object2 = ((uy2_2)object3).e;
                float f14 = ty2_2.f((Context)object, (Uri)object2);
                float f15 = f14 - f6;
                Object object5 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (object5 > 0) {
                    object3 = "Image size is too big";
                }
            }
        }
        return object3;
    }
}

