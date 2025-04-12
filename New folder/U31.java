/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.hash.Hasher;
import com.google.common.hash.PrimitiveSink;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class U31 {
    public static /* bridge */ /* synthetic */ PrimitiveSink a(Hasher hasher, boolean bl2) {
        return hasher.putBoolean(bl2);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink b(Hasher hasher, byte by2) {
        return hasher.putByte(by2);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink c(Hasher hasher, ByteBuffer byteBuffer) {
        return hasher.putBytes(byteBuffer);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink d(Hasher hasher, byte[] byArray) {
        return hasher.putBytes(byArray);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink e(Hasher hasher, byte[] byArray, int n3, int n4) {
        return hasher.putBytes(byArray, n3, n4);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink f(Hasher hasher, char c2) {
        return hasher.putChar(c2);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink g(Hasher hasher, double d2) {
        return hasher.putDouble(d2);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink h(Hasher hasher, float f5) {
        return hasher.putFloat(f5);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink i(Hasher hasher, int n3) {
        return hasher.putInt(n3);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink j(Hasher hasher, long l2) {
        return hasher.putLong(l2);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink k(Hasher hasher, short s7) {
        return hasher.putShort(s7);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink l(Hasher hasher, CharSequence charSequence, Charset charset) {
        return hasher.putString(charSequence, charset);
    }

    public static /* bridge */ /* synthetic */ PrimitiveSink m(Hasher hasher, CharSequence charSequence) {
        return hasher.putUnencodedChars(charSequence);
    }
}

