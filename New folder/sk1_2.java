/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from Sk1
 */
public final class sk1_2 {
    public final ps_2 a;

    public sk1_2(ny_2 ny_22) {
        ps_2 ps_22;
        Intrinsics.checkNotNullParameter(ny_22, "stream");
        Charset charset = Charsets.UTF_8;
        this.a = ps_22 = new ps_2(ny_22, charset);
    }

    public final int a(char[] cArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(cArray, "buffer");
        return this.a.a(cArray, n3, n4);
    }
}

