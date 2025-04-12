/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.concurrent.Callable;

public final class XB1
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ XB1(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public final Object call() {
        Object object = this.a.getBytes();
        Closeable closeable = new ByteArrayInputStream((byte[])object);
        closeable = o72_0.b(o72_0.h(closeable));
        object = gm1_0.e;
        object = new vm1_1;
        object((ie2_2)closeable);
        String string2 = this.b;
        return cc1_0.f((vm1_1)object, string2, true);
    }
}

