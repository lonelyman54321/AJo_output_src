/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yI
 */
public final class yi_1 {
    public static final yI$a a;
    public static volatile yi_1 b;
    public static boolean c = true;

    static {
        yI$a yI$a;
        a = yI$a = new Object();
    }

    public static final void a(Context object, CleverTapInstanceConfig object2) {
        block10: {
            yI$a yI$a = a;
            Intrinsics.checkNotNullParameter(object, "context");
            Intrinsics.checkNotNullParameter(object2, "config");
            Object object3 = b;
            if (object3 != null) break block10;
            synchronized (yI$a) {
                Throwable throwable2;
                block11: {
                    block9: {
                        try {
                            object3 = b;
                            if (object3 != null) break block9;
                        }
                        catch (Throwable throwable2) {}
                        object2 = jh_1.a((CleverTapInstanceConfig)object2);
                        object2 = ((kh_1)object2).a();
                        object3 = new wi_2((Context)object);
                        object = "buildCache";
                        ((a)object2).c((String)object, (Callable)object3);
                        object = new Object();
                        b = object;
                        break block11;
                    }
                    break block10;
                }
                throw throwable2;
            }
        }
    }
}

