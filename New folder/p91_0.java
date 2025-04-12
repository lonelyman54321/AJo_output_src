/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from P91
 */
public final class p91_0
extends ri3_1 {
    public final /* synthetic */ g91_0 e;

    public p91_0(String string2, g91_0 g91_02) {
        this.e = g91_02;
        super(string2, true);
    }

    public final long a() {
        g91_0 g91_02 = this.e;
        g91_02.getClass();
        t91_0 t91_02 = g91_02.y;
        int n3 = 2;
        try {
            t91_02.k(n3, 0, false);
        }
        catch (IOException iOException) {
            g91_02.b(iOException);
        }
        return -1;
    }
}

