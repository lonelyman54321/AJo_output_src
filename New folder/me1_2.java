/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import io.reactivex.Scheduler;
import java.io.IOException;
import java.util.concurrent.Callable;

/*
 * Renamed from me1
 */
public final class me1_2 {
    public final Context a;
    public final ty2_2 b;

    public me1_2(Context context, ty2_2 ty2_22) {
        this.a = context;
        this.b = ty2_22;
    }

    public final q60_0 a(Uri object, o60_0 o60_02, o60_0 o60_03) {
        if (object != null) {
            Object object2 = new le1_2(this, (Uri)object);
            object = new o53_0((Callable)object2);
            object2 = qt2_2.c;
            object = ((g53_0)object).h((Scheduler)object2);
            object2 = ti_2.a();
            return ((g53_0)object).e((Scheduler)object2).f(o60_02, o60_03);
        }
        object = new IOException("Unable to find the file.");
        o60_03.accept(object);
        return null;
    }
}

