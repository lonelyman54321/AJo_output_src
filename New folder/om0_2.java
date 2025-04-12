/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from oM0
 */
public class om0_2
extends mm0_1 {
    public static ArrayList a(File file) {
        Charset charset = Charsets.UTF_8;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(file, (String)object);
        Object object2 = "charset";
        Intrinsics.checkNotNullParameter(charset, (String)object2);
        ArrayList arrayList = new ArrayList();
        nm0_2 nm0_22 = new nm0_2(arrayList);
        Intrinsics.checkNotNullParameter(file, (String)object);
        Intrinsics.checkNotNullParameter(charset, (String)object2);
        Intrinsics.checkNotNullParameter(nm0_22, "action");
        FileInputStream fileInputStream = new FileInputStream(file);
        object2 = new InputStreamReader((InputStream)fileInputStream, charset);
        object = new BufferedReader((Reader)object2);
        vm3_0.a((BufferedReader)object, nm0_22);
        return arrayList;
    }

    public static String b(File object) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileInputStream fileInputStream = new FileInputStream((File)object);
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)fileInputStream, charset);
        try {
            object = vm3_0.b(inputStreamReader);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b(inputStreamReader, throwable);
                throw throwable2;
            }
        }
        xj3_1.b(inputStreamReader, null);
        return object;
    }

    public static void c(File object, String object2) {
        Object object3 = Charsets.UTF_8;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "text");
        String string3 = "charset";
        Intrinsics.checkNotNullParameter(object3, string3);
        object2 = ((String)object2).getBytes((Charset)object3);
        Intrinsics.checkNotNullExpressionValue(object2, "getBytes(...)");
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "array");
        object3 = new FileOutputStream((File)object);
        try {
            ((FileOutputStream)object3).write((byte[])object2);
            object = Unit.a;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b((Closeable)object3, throwable);
                throw throwable2;
            }
        }
        xj3_1.b((Closeable)object3, null);
    }
}

