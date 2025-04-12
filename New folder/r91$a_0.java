/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from R91$a
 */
public final class r91$a_0 {
    public static int a(int n3, int n4, int n7) {
        if ((n4 &= 8) != 0) {
            n3 += -1;
        }
        if (n7 <= n3) {
            return n3 - n7;
        }
        String string2 = D70.b(n7, n3, "PROTOCOL_ERROR padding ", " > remaining length ");
        IOException iOException = new IOException(string2);
        throw iOException;
    }
}

