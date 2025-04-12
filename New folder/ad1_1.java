/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.engine.f;
import java.util.LinkedHashMap;

/*
 * Renamed from aD1
 */
public final class ad1_1
extends VC1
implements ON1 {
    public ON1$a d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n3) {
        int n4 = 40;
        if (n3 >= n4) {
            this.b();
            return;
        }
        n4 = 20;
        if (n3 < n4) {
            n4 = 15;
            if (n3 != n4) return;
        }
        synchronized (this) {
            long l2 = this.b;
        }
        long l3 = 2;
        this.i(l2 /= l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wk2_0 d(qn1_0 object) {
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.a;
            object = linkedHashMap.remove(object);
            object = (VC1$a)object;
            if (object == null) {
                // MONITOREXIT @DISABLED, blocks:[4, 5] lbl6 : MonitorExitStatement: MONITOREXIT : this
                object = null;
                return (wk2_0)object;
            }
            long l2 = this.c;
            int n3 = ((VC1$a)object).b;
            long l3 = n3;
            this.c = l2 -= l3;
            object = ((VC1$a)object).a;
            return (wk2_0)object;
        }
    }

    public final int f(Object object) {
        int n3 = (object = (wk2_0)object) == null ? 1 : object.getSize();
        return n3;
    }

    public final void g(Object object, Object object2) {
        object = (qn1_0)object;
        object2 = (wk2_0)object2;
        object = this.d;
        if (object != null && object2 != null) {
            object = ((f)object).e;
            boolean bl2 = true;
            ((QK2)object).a((wk2_0)object2, bl2);
        }
    }
}

