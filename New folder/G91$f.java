/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class G91$f
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    public G91$f(String string2, g91_0 g91_02, int n3, long l2) {
        this.e = g91_02;
        this.f = n3;
        this.g = l2;
        super(string2, true);
    }

    public final long a() {
        g91_0 g91_02 = this.e;
        t91_0 t91_02 = g91_02.y;
        int n3 = this.f;
        long l2 = this.g;
        try {
            t91_02.u(n3, l2);
        }
        catch (IOException iOException) {
            g91_02.b(iOException);
        }
        return -1;
    }
}

