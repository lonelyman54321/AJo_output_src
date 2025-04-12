/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/*
 * Renamed from uh
 */
public final class uh_2
implements zg1_1 {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public d21_0 b(List object) {
        object = Looper.getMainLooper();
        if (object != null) {
            object = f21_0.b((Looper)object);
            c21_0 c21_02 = new c21_0((Handler)object);
            return c21_02;
        }
        object = new IllegalStateException("The main looper is not available");
        throw object;
    }

    public int c() {
        return -1 >>> 2;
    }
}

