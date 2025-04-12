/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.c;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y01
 */
public final class y01_0
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ c b;

    public /* synthetic */ y01_0(String string2, c c2) {
        this.a = string2;
        this.b = c2;
    }

    public final void run() {
        String string2 = this.a;
        c c2 = this.b;
        Class<z01_0> clazz = z01_0.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            Object object = "$applicationId";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object = "$event";
            Intrinsics.checkNotNullParameter(c2, (String)object);
            object = z01_0.a;
            try {
                ((z01_0)object).b(string2, c2);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

