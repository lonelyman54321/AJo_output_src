/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from mx3
 */
public final class mx3_0
implements un1_2 {
    public static final mx3_0 a;

    static {
        mx3_0 mx3_02;
        a = mx3_02 = new Object();
    }

    public final fx3_0 H(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "value");
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        Charset charset = Charsets.UTF_8;
        String string2 = new String(byArray, charset);
        return ku3_0.b(string2);
    }

    public final byte[] z(Object object) {
        object = (fx3_0)object;
        Intrinsics.checkNotNullParameter(object, "value");
        object = ((fx3_0)object).f;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, "getBytes(...)");
        return object;
    }
}

