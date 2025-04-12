/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ol3
 */
public final class ol3_0 {
    public static final vp_2 a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        vp_2 vp_22 = new vp_2(string2);
        return vp_22;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(outputStream, "out");
        int n3 = 8192;
        byte[] byArray = new byte[n3];
        int n4 = inputStream.read(byArray);
        long l2 = 0L;
        while (n4 >= 0) {
            outputStream.write(byArray, 0, n4);
            long l3 = n4;
            l2 += l3;
            n4 = inputStream.read(byArray);
        }
        return l2;
    }
}

