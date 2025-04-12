/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from di3
 */
public class di3_1 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public di3_1() {
        Qy3 qy3 = Qy3.a;
        if (qy3 == null) {
            Qy3.a = qy3;
        }
    }

    public final int a(int n3) {
        int n4 = this.d;
        if (n3 < n4) {
            ByteBuffer byteBuffer = this.b;
            int n7 = this.c + n3;
            n3 = byteBuffer.getShort(n7);
        } else {
            n3 = 0;
        }
        return n3;
    }
}

