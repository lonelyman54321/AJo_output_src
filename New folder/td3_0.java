/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Td3
 */
public final class td3_0
implements BK2 {
    public final vs0 a;
    public final Kp b;

    public td3_0(vs0 vs02, Kp kp) {
        this.a = vs02;
        this.b = kp;
    }

    public final boolean a(Object object, Z92 z92) {
        object = (InputStream)object;
        this.a.getClass();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        Object object2;
        boolean bl2 = (object = (InputStream)object) instanceof hG2;
        if (bl2) {
            object = (hG2)object;
            bl2 = false;
            Object var6_6 = null;
        } else {
            object2 = this.b;
            hG2 hG22 = new hG2((InputStream)object, (Kp)object2);
            object = hG22;
            bl2 = true;
        }
        object2 = vC0.c;
        // MONITORENTER : object2
        Object object3 = ((ArrayDeque)object2).poll();
        object3 = (vC0)object3;
        // MONITOREXIT : object2
        if (object3 == null) {
            object3 = new vC0();
        }
        ((vC0)object3).a = object;
        object2 = new iH1((vC0)object3);
        Td3$a td3$a = new Td3$a((hG2)object, (vC0)object3);
        try {
            vs0 vs02 = this.a;
            List list = vs02.d;
            Kp kp = vs02.c;
            list = (ArrayList)list;
            ne1$b ne1$b = new ne1$b((iH1)object2, (ArrayList)list, kp);
            py_2 py_22 = vs02.a(ne1$b, n3, n4, z92, td3$a);
            return py_22;
        }
        finally {
            ((vC0)object3).release();
            if (bl2) {
                ((hG2)object).release();
            }
        }
    }
}

