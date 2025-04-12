/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.FirebaseCrashlytics;

public final class Bo2 {
    public static final void a() {
        Object object = yn3_0.a;
        Object object2 = new Object[]{};
        ((yn3$a)object).d("JuspayActivity: Order is null", object2);
        FirebaseCrashlytics.getInstance().log("Order is null");
        object = FirebaseCrashlytics.getInstance();
        object2 = new Exception("JuspayActivity");
        ((FirebaseCrashlytics)object).recordException((Throwable)object2);
    }
}

