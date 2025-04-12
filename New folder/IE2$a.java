/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

public final class IE2$a
extends InputStream {
    public final /* synthetic */ ie2_2 a;

    public IE2$a(ie2_2 ie2_22) {
        this.a = ie2_22;
    }

    public final int available() {
        Object object = this.a;
        boolean bl2 = ((ie2_2)object).c;
        if (!bl2) {
            long l2 = ((ie2_2)object).b.b;
            long l3 = -1 >>> 1;
            return (int)Math.min(l2, l3);
        }
        object = new IOException("closed");
        throw object;
    }

    public final void close() {
        this.a.close();
    }

    public final int read() {
        Object object = this.a;
        boolean bl2 = ((ie2_2)object).c;
        if (!bl2) {
            long l2;
            a93_0 a93_02;
            long l3;
            long l4;
            long l7;
            ce_2 ce_22 = ((ie2_2)object).b;
            long l8 = ce_22.b;
            long l12 = 0L;
            long l14 = l8 - l12;
            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object2 == false && (l7 = (l4 = (l3 = (a93_02 = ((ie2_2)object).a).a0(ce_22, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                return -1;
            }
            return ((ie2_2)object).b.readByte() & 0xFF;
        }
        object = new IOException("closed");
        throw object;
    }

    public final int read(byte[] object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "data");
        ie2_2 ie2_22 = this.a;
        int n7 = ie2_22.c;
        if (n7 == 0) {
            long l2;
            a93_0 a93_02;
            long l3;
            long l4;
            long l7;
            n7 = ((byte[])object).length;
            long l8 = n7;
            long l12 = n3;
            long l14 = n4;
            l_0.b(l8, l12, l14);
            ce_2 ce_22 = ie2_22.b;
            l8 = ce_22.b;
            l12 = 0L;
            long l15 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (l15 == false && (l7 = (l4 = (l3 = (a93_02 = ie2_22.a).a0(ce_22, 8192L)) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                return -1;
            }
            return ie2_22.b.read((byte[])object, n3, n4);
        }
        object = new IOException;
        object("closed");
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ie2_2 ie2_22 = this.a;
        stringBuilder.append(ie2_22);
        stringBuilder.append(".inputStream()");
        return stringBuilder.toString();
    }
}

