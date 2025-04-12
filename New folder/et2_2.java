/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from et2
 */
public class et2_2 {
    public void a(Throwable throwable, Throwable throwable2) {
        Intrinsics.checkNotNullParameter(throwable, "cause");
        Intrinsics.checkNotNullParameter(throwable2, "exception");
        Method method = et2$a.b;
        if (method != null) {
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = throwable2;
            method.invoke((Object)throwable, objectArray);
        }
    }
}

