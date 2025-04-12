/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from J91
 */
public final class j91_0
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public j91_0(String string2, g91_0 g91_02, int n3, int n4) {
        this.e = g91_02;
        this.f = n3;
        this.g = n4;
        super(string2, true);
    }

    public final long a() {
        int n3 = this.f;
        int n4 = this.g;
        g91_0 g91_02 = this.e;
        g91_02.getClass();
        t91_0 t91_02 = g91_02.y;
        boolean bl2 = true;
        try {
            t91_02.k(n3, n4, bl2);
        }
        catch (IOException iOException) {
            g91_02.b(iOException);
        }
        return -1;
    }
}

