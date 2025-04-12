/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;

public final class DR2 {
    public final VC1 a;
    public final LI0$c b;

    public DR2() {
        Object object = new VC1(1000L);
        this.a = object;
        object = new Object();
        this.b = object = LI0.a(10, (LI0$b)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(qn1_0 object) {
        int n3;
        Object object2;
        DR2$b dR2$b = (DR2$b)this.b.b();
        try {
            object2 = dR2$b.a;
            object.b((MessageDigest)object2);
            object = dR2$b.a;
            object = ((MessageDigest)object).digest();
            object2 = dz3.b;
            synchronized (object2) {
                n3 = 0;
            }
        }
        catch (Throwable throwable) {
            this.b.a(dR2$b);
            throw throwable;
        }
        {
            while (true) {
                Object object3;
                if (n3 >= (object3 = ((Object)object).length)) {
                    object = new String((char[])object2);
                    // MONITOREXIT @DISABLED, blocks:[5, 7, 8] lbl18 : MonitorExitStatement: MONITOREXIT : var3_4
                    this.b.a(dR2$b);
                    return object;
                }
                object3 = object[n3];
                int n4 = object3 & 0xFF;
                int n7 = n3 * 2;
                n4 >>>= 4;
                char[] cArray = dz3.a;
                n4 = cArray[n4];
                object2[n7] = n4;
                object3 &= 0xF;
                object3 = cArray[object3];
                object2[++n7] = object3;
                ++n3;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String b(qn1_0 qn1_02) {
        VC1 vC1 = this.a;
        // MONITORENTER : vC1
        Object object = this.a;
        object = ((VC1)object).e(qn1_02);
        object = (String)object;
        // MONITOREXIT : vC1
        if (object == null) {
            object = this.a(qn1_02);
        }
        VC1 vC12 = this.a;
        // MONITORENTER : vC12
        vC1 = this.a;
        vC1.h(qn1_02, object);
        // MONITOREXIT : vC12
        return object;
    }
}

