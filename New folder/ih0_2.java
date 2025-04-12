/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IH0
 */
public final class ih0_2
extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] byArray = this.buf;
        Intrinsics.checkNotNullExpressionValue(byArray, "buf");
        return byArray;
    }
}

