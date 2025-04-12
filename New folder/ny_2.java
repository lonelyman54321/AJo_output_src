/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ny
 */
public final class ny_2
extends InputStream {
    public final /* synthetic */ uf_1 a;

    public ny_2(uf_1 uf_12) {
        this.a = uf_12;
    }

    public final void close() {
        vf_1.a(this.a);
    }

    public final int read() {
        uf_1 uf_12 = this.a;
        boolean bl2 = uf_12.i();
        int n3 = -1;
        if (bl2) {
            return n3;
        }
        Object object = uf_12.g();
        bl2 = object.g();
        if (bl2) {
            object = new my_2(uf_12, null);
            Ae3.f((Function2)object);
        }
        if (bl2 = uf_12.i()) {
            return n3;
        }
        return uf_12.g().readByte() & 0xFF;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "b");
        uf_1 uf_12 = this.a;
        int n7 = uf_12.i();
        int n8 = -1;
        if (n7 != 0) {
            return n8;
        }
        Object object = uf_12.g();
        n7 = object.g();
        if (n7 != 0) {
            object = new my_2(uf_12, null);
            Ae3.f((Function2)object);
        }
        n7 = wf_1.d(uf_12);
        n4 = Math.min(n7, n4);
        object = uf_12.g();
        int n10 = object.X(n3, byArray, n4 += n3);
        if (n10 >= 0) {
            return n10;
        }
        n10 = (int)(uf_12.i() ? 1 : 0);
        if (n10 == 0) {
            n8 = 0;
        }
        return n8;
    }
}

