/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MJ2
 */
public final class mj2_2
extends pj2_2 {
    public final /* synthetic */ jn1_0 a;
    public final /* synthetic */ File b;

    public mj2_2(jn1_0 jn1_02, File file) {
        this.a = jn1_02;
        this.b = file;
    }

    public final long contentLength() {
        return this.b.length();
    }

    public final jn1_0 contentType() {
        return this.a;
    }

    public final void writeTo(re_2 re_22) {
        Intrinsics.checkNotNullParameter(re_22, "sink");
        bi1_2 bi1_22 = o72_0.g(this.b);
        try {
            re_22.s(bi1_22);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b(bi1_22, throwable);
                throw throwable2;
            }
        }
        xj3_1.b(bi1_22, null);
    }
}

