/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.android.schedulers.HandlerScheduler;

/*
 * Renamed from Ti
 */
public final class ti_2 {
    public static final HandlerScheduler a;

    static {
        String string2;
        Object object;
        try {
            object = ti$a_0.a;
            if (object != null) {
                a = object;
                return;
            }
            string2 = "Scheduler Callable returned null";
        }
        catch (Throwable throwable) {
            throw uc0_2.a(throwable);
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static HandlerScheduler a() {
        Object object = a;
        if (object != null) {
            return object;
        }
        object = new NullPointerException("scheduler == null");
        throw object;
    }
}

