/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yC0
 */
public class yc0_2 {
    public static void a(Throwable throwable, Throwable throwable2) {
        Intrinsics.checkNotNullParameter(throwable, "<this>");
        Object object = "exception";
        Intrinsics.checkNotNullParameter(throwable2, (String)object);
        if (throwable != throwable2) {
            object = ft2_2.a;
            ((mk1_1)object).a(throwable, throwable2);
        }
    }

    public static String b(Throwable object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ((Throwable)object).printStackTrace(printWriter);
        printWriter.flush();
        object = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

