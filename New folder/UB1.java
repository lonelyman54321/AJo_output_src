/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class UB1
implements Callable {
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ String b;

    public /* synthetic */ UB1(InputStream inputStream, String string2) {
        this.a = inputStream;
        this.b = string2;
    }

    public final Object call() {
        InputStream inputStream = this.a;
        String string2 = this.b;
        return cc1_0.e(inputStream, string2);
    }
}

