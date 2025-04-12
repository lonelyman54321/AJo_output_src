/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;

public final class en2
implements UW2 {
    public d a;
    public On3 b;
    public wp3 c;

    public en2(String object) {
        d$a d$a = new d$a();
        object = ip1_0.l((String)object);
        d$a.n = object;
        this.a = object = new d(d$a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(Xm2 xm2) {
        ct3.h(this.b);
        Object object2 = this.b;
        // MONITORENTER : object2
        long l4 = ((On3)object2).c;
        long l3 = -9223372036854775807L;
        Object object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (object != false) {
            long l7 = ((On3)object2).b;
            l4 += l7;
        } else {
            l4 = ((On3)object2).d();
        }
        long l2 = l4;
        object2 = this.b;
        long l8 = ((On3)object2).e();
        Object object3 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (object3 == false) return;
        object3 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1);
        if (object3 == false) {
            return;
        }
        Object object4 = this.a;
        l3 = ((d)object4).t;
        long l7 = l8 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            object4 = ((d)object4).a();
            ((d$a)object4).s = l8;
            this.a = object2 = new d((d$a)object4);
            wp3 wp32 = this.c;
            wp32.d((d)object2);
        }
        int n3 = xm2.a();
        object2 = this.c;
        object2.f(n3, xm2);
        wp3 wp33 = this.c;
        int n4 = 1;
        wp33.a(l2, n4, n3, 0, null);
    }

    public final void b(On3 object, gi0_0 object2, Gs3$d gs3$d) {
        this.b = object;
        gs3$d.a();
        gs3$d.b();
        int n3 = gs3$d.d;
        this.c = object = object2.n(n3, 5);
        object2 = this.a;
        object.d((d)object2);
    }
}

