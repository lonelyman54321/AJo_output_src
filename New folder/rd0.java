/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class rd0
implements Thread.UncaughtExceptionHandler {
    public static final rd0$a b;
    public static rd0 c;
    public final Thread.UncaughtExceptionHandler a;

    static {
        rd0$a rd0$a;
        b = rd0$a = new Object();
    }

    public rd0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    /*
     * WARNING - void declaration
     */
    public final void uncaughtException(Thread thread2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread2, "t");
        Object object = "e";
        Intrinsics.checkNotNullParameter(throwable, (String)object);
        if (throwable != null) {
            void var4_5;
            Object object2 = null;
            object = throwable;
            block0: while (object != null && object != var4_5) {
                StackTraceElement[] stackTraceElementArray = ((Throwable)object).getStackTrace();
                String string2 = "t.stackTrace";
                Intrinsics.checkNotNullExpressionValue(stackTraceElementArray, string2);
                for (StackTraceElement stackTraceElement : stackTraceElementArray) {
                    String string3 = "element";
                    Intrinsics.checkNotNullExpressionValue(stackTraceElement, string3);
                    boolean bl2 = ii1_0.c(stackTraceElement);
                    if (!bl2) continue;
                    sC0.a(throwable);
                    object = Di1$b.CrashReport;
                    object = Di1$a.b(throwable, (Di1$b)((Object)object));
                    ((Di1)object).b();
                    break block0;
                }
                Throwable throwable2 = ((Throwable)object).getCause();
                Object object3 = object;
                object = throwable2;
            }
        }
        object = this.a;
        if (object != null) {
            object.uncaughtException(thread2, throwable);
        }
    }
}

