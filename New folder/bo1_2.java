/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BO1
 */
public final class bo1_2
implements Runnable {
    public final void run() {
        block9: {
            Class<co1_2> clazz = co1_2.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                Object object;
                block8: {
                    object = FacebookSdk.a();
                    String string2 = "context";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = Zq$a.a((Context)object);
                    if (object == null) break block8;
                    bl2 = ((zq_0)object).e;
                    if (bl2) break block9;
                }
                object = co1_2.a;
                ((co1_2)object).a();
                bl2 = true;
                try {
                    co1_2.b = bl2;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
    }
}

