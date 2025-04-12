/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kn
 */
public final class kn_0
implements Runnable {
    public final /* synthetic */ gt0_0 a;

    public /* synthetic */ kn_0(gt0_0 gt0_02) {
        this.a = gt0_02;
    }

    public final void run() {
        gt0_0 gt0_02 = this.a;
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            String string2 = "$reason";
            try {
                Intrinsics.checkNotNullParameter((Object)gt0_02, string2);
                f.d(gt0_02);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

