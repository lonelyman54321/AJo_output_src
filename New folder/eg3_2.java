/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.suggestedevents.a;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from eg3
 */
public final class eg3_2
implements Runnable {
    public final void run() {
        block6: {
            Class<a> clazz = a.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                Object object = a.b;
                boolean bl3 = ((AtomicBoolean)object).get();
                if (bl3) break block6;
                bl3 = true;
                ((AtomicBoolean)object).set(bl3);
                object = a.a;
                try {
                    ((a)object).b();
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
    }
}

