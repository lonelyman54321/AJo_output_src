/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class I92$p
extends I92 {
    public static final I92$p c;

    static {
        I92$p i92$p;
        c = i92$p = new I92(0, 3, 1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(R92$a object, mp mp2, q73 q732, F30$a f30$a) {
        Throwable throwable2;
        q73 q733;
        block4: {
            block3: {
                boolean bl2 = true;
                l73 l732 = (l73)((R92$a)object).b((int)(bl2 ? 1 : 0));
                Ae ae2 = (Ae)((R92$a)object).b(0);
                int n3 = 2;
                object = (wo0_0)((R92$a)object).b(n3);
                q733 = l732.i();
                try {
                    R92 r92 = ((wo0_0)object).b;
                    boolean bl3 = r92.T();
                    if (!bl3) break block3;
                    object = ((wo0_0)object).a;
                    ((R92)object).S(mp2, q733, f30$a);
                    object = Unit.a;
                    q733.e(bl2);
                    q732.d();
                    ae2.getClass();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                int n4 = l732.d(ae2);
                q732.v(l732, n4);
                q732.j();
                return;
            }
            object = "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?";
            {
                p30_0.c((String)object);
                boolean bl4 = false;
                object = null;
                throw null;
            }
        }
        q733.e(false);
        throw throwable2;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "anchor" : ((bl2 = I92$t.a(n3, 1)) ? "from" : ((bl2 = I92$t.a(n3, 2)) ? "fixups" : super.c(n3)));
        return string2;
    }
}

