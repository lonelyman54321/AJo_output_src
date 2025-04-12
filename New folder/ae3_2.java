/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ae3
 */
public final class ae3_2
extends pj2_2 {
    public final Long a;
    public final Function0 b;

    public ae3_2(Long l2, Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        this.a = l2;
        this.b = function0;
    }

    public final long contentLength() {
        Long l2 = this.a;
        long l3 = l2 != null ? l2 : (long)-1;
        return l3;
    }

    public final jn1_0 contentType() {
        return null;
    }

    public final boolean isOneShot() {
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeTo(re_2 var1_1) {
        var2_5 = "sink";
        Intrinsics.checkNotNullParameter(var1_1, (String)var2_5);
        var2_5 = this.b;
        var2_5 = var2_5.invoke();
        var2_5 = (uf_1)var2_5;
        var3_7 = "<this>";
        Intrinsics.checkNotNullParameter(var2_5, (String)var3_7);
        var3_7 = new ny_2((uf_1)var2_5);
        var2_5 = o72_0.h((InputStream)var3_7);
        var3_7 = null;
        var4_9 = var1_1.s((a93_0)var2_5);
        var1_1 = var4_9;
        try {
            var2_5.close();
        }
        catch (Throwable var3_8) {
            // empty catch block
        }
        var6_10 = var3_7;
        var3_7 = var1_1;
        var1_1 = var6_10;
        ** GOTO lbl31
        catch (Throwable var1_2) {
            try {
                var2_5.close();
                ** GOTO lbl31
            }
            catch (Throwable var2_6) {
                try {
                    yc0_2.a(var1_2, var2_6);
lbl31:
                    // 3 sources

                    if (var1_1 != null) throw var1_1;
                    var3_7.getClass();
                    return;
                }
                catch (Throwable var1_3) {
                }
                catch (IOException var1_4) {
                    throw var1_4;
                }
            }
        }
        Intrinsics.checkNotNullParameter(var1_3, "cause");
        var2_5 = new IOException(var1_3);
        throw var2_5;
    }
}

