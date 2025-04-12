/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import kotlin.jvm.functions.Function0;

public final class T3 {
    public static final long a;
    public static final /* synthetic */ int b;

    static {
        long l2;
        Object object = T3$a.c;
        yr1_2.b((Function0)object);
        object = Looper.getMainLooper();
        object = object.getThread();
        try {
            l2 = ((Thread)object).getId();
        }
        catch (Exception exception) {
            l2 = -1;
        }
        a = l2;
    }
}

