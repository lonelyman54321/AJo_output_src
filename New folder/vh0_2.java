/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VH0
 */
public final class vh0_2
extends pj2_2 {
    public final /* synthetic */ jn1_0 a;
    public final /* synthetic */ File b;
    public final /* synthetic */ Function1 c;

    public vh0_2(jn1_0 jn1_02, File file, sd2_0 sd2_02) {
        this.a = jn1_02;
        this.b = file;
        this.c = sd2_02;
    }

    public final long contentLength() {
        return this.b.length();
    }

    public final jn1_0 contentType() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeTo(re_2 object) {
        Throwable throwable2;
        FileInputStream fileInputStream;
        block7: {
            int n3;
            Handler handler;
            int n4;
            Intrinsics.checkNotNullParameter(object, "sink");
            File file = this.b;
            long l2 = file.length();
            int n7 = 8192;
            byte[] byArray = new byte[n7];
            fileInputStream = new FileInputStream(file);
            try {
                n4 = fileInputStream.read(byArray);
                Looper looper = Looper.getMainLooper();
                handler = new Handler(looper);
                long l3 = 0L;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            while (n4 != (n3 = -1)) {
                Function1 function1 = this.c;
                if (function1 != null) {
                    long l4 = n4;
                    double d2 = l3 += l4;
                    double d5 = l2;
                    float f5 = (float)(d2 /= d5);
                    function1 = (sd2_0)function1;
                    uh0_2 uh0_22 = new uh0_2((sd2_0)function1, f5);
                    handler.post((Runnable)uh0_22);
                    n3 = 0;
                    function1 = null;
                    object.S(0, byArray, n4);
                }
                n4 = fileInputStream.read(byArray);
            }
            object = Unit.a;
            xj3_1.b(fileInputStream, null);
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b(fileInputStream, throwable2);
            throw throwable3;
        }
    }
}

