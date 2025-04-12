/*
 * Decompiled with CFR 0.152.
 */
import androidx.emoji2.text.g;
import java.nio.ByteBuffer;

public final class rt3 {
    public static final ThreadLocal d;
    public final int a;
    public final g b;
    public volatile int c = 0;

    static {
        ThreadLocal threadLocal;
        d = threadLocal = new ThreadLocal();
    }

    public rt3(g g3, int n3) {
        this.b = g3;
        this.a = n3;
    }

    public final int a(int n3) {
        eo1_0 eo1_02 = this.c();
        int n4 = eo1_02.a(16);
        if (n4 != 0) {
            ByteBuffer byteBuffer = eo1_02.b;
            int n7 = eo1_02.a;
            n4 += n7;
            n7 = byteBuffer.getInt(n4) + n4 + 4;
            n3 = n3 * 4 + n7;
            n3 = byteBuffer.getInt(n3);
        } else {
            n3 = 0;
        }
        return n3;
    }

    public final int b() {
        int n3;
        Object object = this.c();
        int n4 = ((di3_1)object).a(16);
        if (n4 != 0) {
            int n7 = ((di3_1)object).a;
            n4 += n7;
            ByteBuffer byteBuffer = ((di3_1)object).b;
            n7 = byteBuffer.getInt(n4) + n4;
            object = ((di3_1)object).b;
            n3 = ((ByteBuffer)object).getInt(n7);
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final eo1_0 c() {
        int n3;
        Object object = d;
        eo1_0 eo1_02 = (eo1_0)((ThreadLocal)object).get();
        if (eo1_02 == null) {
            eo1_02 = new eo1_0();
            ((ThreadLocal)object).set(eo1_02);
        }
        if ((n3 = ((di3_1)(object = this.b.a)).a(6)) != 0) {
            int n4 = ((di3_1)object).a;
            n3 += n4;
            n4 = ((di3_1)object).b.getInt(n3) + n3 + 4;
            n3 = this.a * 4 + n4;
            ByteBuffer byteBuffer = ((di3_1)object).b;
            n4 = byteBuffer.getInt(n3) + n3;
            eo1_02.b = object = ((di3_1)object).b;
            if (object != null) {
                eo1_02.a = n4;
                int n7 = ((ByteBuffer)object).getInt(n4);
                eo1_02.c = n4 -= n7;
                object = eo1_02.b;
                eo1_02.d = n7 = (int)((ByteBuffer)object).getShort(n4);
            } else {
                boolean bl2 = false;
                object = null;
                eo1_02.a = 0;
                eo1_02.c = 0;
                eo1_02.d = 0;
            }
        }
        return eo1_02;
    }

    public final String toString() {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        Object object = super.toString();
        stringBuilder.append((String)object);
        stringBuilder.append(", id:");
        object = this.c();
        int n4 = ((di3_1)object).a(4);
        int n7 = 0;
        if (n4 != 0) {
            ByteBuffer byteBuffer = ((di3_1)object).b;
            n3 = ((di3_1)object).a;
            n4 += n3;
            n3 = byteBuffer.getInt(n4);
        } else {
            n3 = 0;
            object = null;
        }
        object = Integer.toHexString(n3);
        stringBuilder.append((String)object);
        object = ", codepoints:";
        stringBuilder.append((String)object);
        n3 = this.b();
        while (n7 < n3) {
            n4 = this.a(n7);
            String string2 = Integer.toHexString(n4);
            stringBuilder.append(string2);
            string2 = " ";
            stringBuilder.append(string2);
            ++n7;
        }
        return stringBuilder.toString();
    }
}

