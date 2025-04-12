/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
import android.content.Context;
import android.os.Looper;
import com.bumptech.glide.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.concurrent.Callable;
import kotlin.Unit;

/*
 * Renamed from Y9
 */
public final class y9_0
implements Callable {
    public final Object call() {
        boolean bl2;
        AJIOApplication.Companion.getClass();
        Object object = a.a((Context)AJIOApplication$a.a());
        object.getClass();
        Object object2 = dz3.a;
        object2 = Looper.myLooper();
        Looper looper = Looper.getMainLooper();
        boolean bl3 = true;
        if (object2 == looper) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2 ^= bl3) {
            ((a)object).a.f.a().clear();
            return Unit.a;
        }
        object = new IllegalArgumentException("You must call this method on a background thread");
        throw object;
    }
}

