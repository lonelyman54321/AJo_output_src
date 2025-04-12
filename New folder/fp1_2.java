/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.suggestedevents.a;

/*
 * Renamed from FP1
 */
public final class fp1_2
implements Runnable {
    public final void run() {
        Class<hp1_1> clazz = hp1_1.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            try {
                a.a();
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

