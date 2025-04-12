/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Vg1
 */
public final class vg1_0 {
    public final WR1 a;
    public final ParcelableSnapshotMutableState b;
    public long c;
    public final ParcelableSnapshotMutableState d;

    public vg1_0(String object) {
        Object[] objectArray = new Vg1$a[16];
        this.a = object = new WR1(objectArray);
        this.b = object = J83.g(Boolean.FALSE);
        this.c = Long.MIN_VALUE;
        this.d = object = J83.g(Boolean.TRUE);
    }

    public final void a(b30_0 object, int n3) {
        Object object2;
        object = object.g(-318043801);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(this) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 3) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            b30$a$a b30$a$a;
            object2 = ((j30_0)object).v();
            if (object2 == (b30$a$a = b30$a.a)) {
                object2 = J83.g(null);
                ((j30_0)object).o(object2);
            }
            object2 = (tr1_0)object2;
            Boolean bl2 = (Boolean)this.d.getValue();
            boolean bl3 = bl2;
            if (!bl3 && !(bl3 = (bl2 = (Boolean)this.b.getValue()).booleanValue())) {
                n4 = 1721436120;
                ((j30_0)object).K(n4);
                ((j30_0)object).T(false);
            } else {
                ((j30_0)object).K(1719915818);
                bl3 = ((j30_0)object).x(this);
                Object object3 = ((j30_0)object).v();
                if (bl3 || object3 == b30$a$a) {
                    object3 = new Vg1$b((tr1_0)object2, this, null);
                    ((j30_0)object).o(object3);
                }
                object3 = (Function2)object3;
                ly0_0.d((b30_0)object, this, (Function2)object3);
                ((j30_0)object).T(false);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new Vg1$c(this, n3);
        }
    }
}

