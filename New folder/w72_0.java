/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from w72
 */
public final class w72_0
implements wj_2 {
    public final eb1_2 a;
    public final bl_2 b;

    public w72_0(eb1_2 eb1_22, CancellableContinuationImpl cancellableContinuationImpl) {
        Intrinsics.checkNotNullParameter(eb1_22, "requestData");
        Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "continuation");
        this.a = eb1_22;
        this.b = cancellableContinuationImpl;
    }

    /*
     * Unable to fully structure code
     */
    public final void onFailure(ij_2 var1_1, IOException var2_2) {
        var3_3 = "call";
        Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
        Intrinsics.checkNotNullParameter(var2_2, "e");
        var1_1 = this.b;
        var4_4 = var1_1.p();
        if (var4_4) {
            return;
        }
        var3_3 = tl2_2.b;
        var4_4 = var2_2 instanceof StreamAdapterIOException;
        if (var4_4) {
            var3_3 = ((Throwable)var2_2).getCause();
            if (var3_3 != null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 = var3_3;
                    break;
                }
            }
        } else {
            var4_4 = var2_2 instanceof SocketTimeoutException;
            if (var4_4) {
                var3_3 = ((Throwable)var2_2).getMessage();
                var5_5 = this.a;
                if (var3_3 != null && (var4_4 = StringsKt.F((CharSequence)var3_3, var6_6 = "connect", var7_7 = true)) == var7_7) {
                    var3_3 = yb1_2.a;
                    Intrinsics.checkNotNullParameter(var5_5, "request");
                    var6_6 = new StringBuilder("Connect timeout has expired [url=");
                    var8_8 = var5_5.a;
                    var6_6.append(var8_8);
                    var6_6.append(", connect_timeout=");
                    var8_8 = vb1_2.a;
                    var5_5 = (wb1_2)var5_5.a((ua1_0)var8_8);
                    if (var5_5 == null || (var5_5 = var5_5.b) == null) {
                        var5_5 = "unknown";
                    }
                    var8_8 = " ms]";
                    var5_5 = fK.a((StringBuilder)var6_6, var5_5, (String)var8_8);
                    var3_3 = new ConnectTimeoutException((String)var5_5, (Throwable)var2_2);
                    ** continue;
                }
                var2_2 = yb1_2.a((eb1_2)var5_5, (Throwable)var2_2);
            }
        }
        var2_2 = vl2_2.a((Throwable)var2_2);
        var1_1.resumeWith(var2_2);
    }

    public final void onResponse(ij_2 object, cl2_2 cl2_22) {
        Intrinsics.checkNotNullParameter(object, "call");
        String string2 = "response";
        Intrinsics.checkNotNullParameter(cl2_22, string2);
        boolean bl2 = object.a();
        if (!bl2) {
            object = tl2_2.b;
            object = this.b;
            object.resumeWith(cl2_22);
        }
    }
}

