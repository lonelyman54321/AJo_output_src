/*
 * Decompiled with CFR 0.152.
 */
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.c;

public final class G91$a {
    public final boolean a;
    public final c b;
    public Socket c;
    public String d;
    public se_1 e;
    public re_2 f;
    public G91$b g;
    public final e60_0 h;
    public int i;

    public G91$a(c object) {
        Intrinsics.checkNotNullParameter(object, "taskRunner");
        this.a = true;
        this.b = object;
        this.g = object = G91$b.a;
        this.h = object = e60_0.a;
    }
}

