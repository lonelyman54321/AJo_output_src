/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.AppEventsLogger$b;
import com.facebook.appevents.f;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;

/*
 * Renamed from Ln
 */
public final class ln_0
implements Runnable {
    public final void run() {
        block7: {
            Class<f> clazz = f.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                bl2 = false;
                Object object = null;
                f.e = null;
                object = g.c;
                object = g$a.d();
                AppEventsLogger$b appEventsLogger$b = AppEventsLogger$b.EXPLICIT_ONLY;
                if (object == appEventsLogger$b) break block7;
                object = gt0_0.TIMER;
                try {
                    f.d((gt0_0)((Object)object));
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
    }
}

