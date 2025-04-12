/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.d;
import com.facebook.appevents.f;

/*
 * Renamed from Nn
 */
public final class nn_0
implements Runnable {
    public final void run() {
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            d d2 = f.c;
            qn_0.b(d2);
            try {
                f.c = d2 = new d();
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

