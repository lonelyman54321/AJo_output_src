/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public final class UB2 {
    public static UB2$a a(byte[] object) {
        int n3;
        Xm2 xm2 = new Xm2((byte[])object);
        int n4 = xm2.c;
        int n7 = 32;
        byte[] byArray = null;
        if (n4 < n7) {
            return null;
        }
        n4 = 0;
        object = null;
        xm2.I(0);
        n7 = xm2.a();
        int n8 = xm2.i();
        if (n8 != n7) {
            object = new StringBuilder;
            ((StringBuilder)object)("Advertised atom size (");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(") does not match buffer size: ");
            ((StringBuilder)object).append(n7);
            Cx.f(((StringBuilder)object).toString());
            return null;
        }
        n7 = xm2.i();
        if (n7 != (n8 = 1886614376)) {
            CS1.a(n7, "Atom type is not pssh: ");
            return null;
        }
        n7 = JA.c(xm2.i());
        if (n7 > (n8 = 1)) {
            CS1.a(n7, "Unsupported pssh version: ");
            return null;
        }
        long l2 = xm2.q();
        long l3 = xm2.q();
        UUID uUID = new UUID(l2, l3);
        if (n7 == n8) {
            n8 = xm2.A();
            UUID[] uUIDArray = new UUID[n8];
            for (int i3 = 0; i3 < n8; ++i3) {
                UUID uUID2;
                long l4 = xm2.q();
                long l7 = xm2.q();
                uUIDArray[i3] = uUID2 = new UUID(l4, l7);
            }
        }
        if ((n8 = xm2.A()) != (n3 = xm2.a())) {
            object = new StringBuilder("Atom data size (");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(") does not match the bytes left: ");
            ((StringBuilder)object).append(n3);
            Cx.f(((StringBuilder)object).toString());
            return null;
        }
        byArray = new byte[n8];
        xm2.g(0, byArray, n8);
        object = new UB2$a(uUID, n7, byArray);
        return object;
    }

    public static byte[] b(UUID uUID, byte[] object) {
        if ((object = (Object)UB2.a((byte[])object)) == null) {
            return null;
        }
        UUID uUID2 = ((UB2$a)object).a;
        boolean bl2 = uUID.equals(uUID2);
        if (!bl2) {
            object = new StringBuilder;
            ((StringBuilder)object)("UUID mismatch. Expected: ");
            ((StringBuilder)object).append(uUID);
            ((StringBuilder)object).append(", got: ");
            ((StringBuilder)object).append(uUID2);
            ((StringBuilder)object).append(".");
            Cx.f(((StringBuilder)object).toString());
            return null;
        }
        return ((UB2$a)object).c;
    }
}

