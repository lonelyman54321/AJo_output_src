/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class gC2
implements Callable {
    public final /* synthetic */ hC2 a;

    public gC2(hC2 hC22) {
        this.a = hC22;
    }

    public final Object call() {
        Object object;
        CleverTapInstanceConfig cleverTapInstanceConfig;
        boolean bl2;
        hC2 hC22 = this.a;
        Iterator iterator = hC22.b.iterator();
        while (true) {
            bl2 = iterator.hasNext();
            cleverTapInstanceConfig = hC22.f;
            if (!bl2) break;
            object = (ci_0)iterator.next();
            try {
                object.requestToken();
            }
            catch (Throwable throwable) {
                Objects.toString(object);
                cleverTapInstanceConfig.c();
            }
        }
        iterator = hC22.c.iterator();
        while (bl2 = iterator.hasNext()) {
            object = (XB2$a)((Object)iterator.next());
            String string2 = hC22.d((XB2$a)((Object)object));
            boolean bl3 = true;
            try {
                hC22.f(string2, bl3, (XB2$a)((Object)object));
            }
            catch (Throwable throwable) {
                Objects.toString(object);
                cleverTapInstanceConfig.c();
            }
        }
        return null;
    }
}

