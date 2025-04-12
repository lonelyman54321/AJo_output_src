/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pl1
 */
public final class pl1_2 {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public pl1_2(Charset object) {
        Intrinsics.checkNotNullParameter(object, "charset");
        byte[] byArray = be3_1.b("[", (Charset)object);
        this.a = byArray;
        byArray = be3_1.b("]", (Charset)object);
        this.b = byArray;
        object = be3_1.b(",", (Charset)object);
        this.c = (byte[])object;
    }
}

