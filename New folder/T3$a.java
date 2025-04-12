/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class T3$a
extends Lambda
implements Function0 {
    public static final T3$a c;

    static {
        T3$a t3$a;
        c = t3$a = new Lambda(0);
    }

    public final Object invoke() {
        Object object = Looper.getMainLooper();
        object = object != null ? xl0_1.a : mu2_2.a;
        return object;
    }
}

