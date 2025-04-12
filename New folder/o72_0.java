/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import okio.a;

/*
 * Renamed from O72
 */
public final class o72_0 {
    public static String a = "plp screen";
    public static final KSerializer[] b = new KSerializer[0];

    public static final he2_2 a(y63_0 y63_02) {
        Intrinsics.checkNotNullParameter(y63_02, "<this>");
        he2_2 he2_22 = new he2_2(y63_02);
        return he2_22;
    }

    public static final ie2_2 b(a93_0 a93_02) {
        Intrinsics.checkNotNullParameter(a93_02, "<this>");
        ie2_2 ie2_22 = new ie2_2(a93_02);
        return ie2_22;
    }

    public static final boolean c(AssertionError object) {
        Object object2 = p72_0.a;
        Intrinsics.checkNotNullParameter(object, "<this>");
        object2 = ((Throwable)object).getCause();
        boolean bl2 = false;
        if (object2 != null) {
            boolean bl3;
            if ((object = ((Throwable)object).getMessage()) != null) {
                object2 = "getsockname failed";
                bl3 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
            } else {
                bl3 = false;
                object = null;
            }
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static final dq_2 d(Socket closeable) {
        Object object = p72_0.a;
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        object = new z83_0((Socket)closeable);
        closeable = closeable.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(closeable, "getOutputStream(...)");
        lg2_1 lg2_12 = new lg2_1((OutputStream)closeable, (a)object);
        Intrinsics.checkNotNullParameter(lg2_12, "sink");
        closeable = new dq_2((z83_0)object, lg2_12);
        return closeable;
    }

    public static lg2_1 e(File object) {
        Object object2 = p72_0.a;
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        FileOutputStream fileOutputStream = new FileOutputStream((File)object, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, (String)object2);
        object2 = new a();
        object = new lg2_1(fileOutputStream, (a)object2);
        return object;
    }

    public static final eq_2 f(Socket closeable) {
        Object object = p72_0.a;
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        object = new z83_0((Socket)closeable);
        closeable = closeable.getInputStream();
        Intrinsics.checkNotNullExpressionValue(closeable, "getInputStream(...)");
        bi1_2 bi1_22 = new bi1_2((InputStream)closeable, (a)object);
        Intrinsics.checkNotNullParameter(bi1_22, "source");
        closeable = new eq_2((z83_0)object, bi1_22);
        return closeable;
    }

    public static final bi1_2 g(File object) {
        Object object2 = p72_0.a;
        Intrinsics.checkNotNullParameter(object, "<this>");
        FileInputStream fileInputStream = new FileInputStream((File)object);
        object = okio.a.d;
        object2 = new bi1_2(fileInputStream, (a)object);
        return object2;
    }

    public static final bi1_2 h(InputStream inputStream) {
        Object object = p72_0.a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        a a2 = new a();
        object = new bi1_2(inputStream, a2);
        return object;
    }
}

