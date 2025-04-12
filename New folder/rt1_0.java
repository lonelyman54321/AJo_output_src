/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from rt1
 */
public final class rt1_0
implements iS2,
bs2_1 {
    public final iS2 a;
    public final ParcelableSnapshotMutableState b;
    public final LinkedHashSet c;

    public rt1_0(iS2 linkedHashSet, Map map2) {
        rt1$a rt1$a = new rt1$a((iS2)((Object)linkedHashSet));
        linkedHashSet = kS2.a;
        linkedHashSet = new LinkedHashSet(map2, rt1$a);
        this.a = linkedHashSet;
        linkedHashSet = J83.g(null);
        this.b = linkedHashSet;
        this.c = linkedHashSet = new LinkedHashSet();
    }

    public final boolean a(Object object) {
        return this.a.a(object);
    }

    public final iS2$a b(String string2, Function0 function0) {
        return this.a.b(string2, function0);
    }

    public final void c(Object object, u10 object2, b30_0 object3, int n3) {
        block11: {
            Object object4;
            block10: {
                int n4;
                int n7;
                block9: {
                    int n8;
                    object3 = object3.g(-697180401);
                    n7 = n3 & 6;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object3).x(object) ? 1 : 0);
                        n7 = n7 != 0 ? 4 : 2;
                        n7 |= n3;
                    } else {
                        n7 = n3;
                    }
                    n4 = n3 & 0x30;
                    if (n4 == 0) {
                        n4 = (int)(((j30_0)object3).x(object2) ? 1 : 0);
                        n4 = n4 != 0 ? 32 : 16;
                        n7 |= n4;
                    }
                    if ((n4 = n3 & 0x180) == 0) {
                        n4 = (int)(((j30_0)object3).x(this) ? 1 : 0);
                        n4 = n4 != 0 ? 256 : 128;
                        n7 |= n4;
                    }
                    if ((n4 = n7 & 0x93) != (n8 = 146) || (n4 = (int)(((j30_0)object3).h() ? 1 : 0)) == 0) break block9;
                    ((j30_0)object3).D();
                    break block10;
                }
                Object object5 = (bs2_1)this.b.getValue();
                if (object5 == null) break block11;
                object5.c(object, (u10)object2, (b30_0)object3, n7 &= 0x7E);
                n7 = (int)(((j30_0)object3).x(this) ? 1 : 0);
                n4 = (int)(((j30_0)object3).x(object) ? 1 : 0);
                object5 = ((j30_0)object3).v();
                if ((n7 |= n4) != 0 || object5 == (object4 = b30$a.a)) {
                    object5 = new vt1_2(this, object);
                    ((j30_0)object3).o(object5);
                }
                object5 = (Function1)object5;
                ly0_0.b(object, (Function1)object5, (b30_0)object3);
            }
            object3 = ((j30_0)object3).X();
            if (object3 != null) {
                object4 = new wt1_2(this, object, (u10)object2, n3);
                ((CF2)object3).d = object4;
            }
            return;
        }
        object2 = "null wrappedHolder".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void d(Object object) {
        Object object2 = (bs2_1)this.b.getValue();
        if (object2 != null) {
            object2.d(object);
            return;
        }
        object2 = "null wrappedHolder".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Map e() {
        bs2_1 bs2_12 = (bs2_1)this.b.getValue();
        if (bs2_12 != null) {
            boolean bl2;
            Iterator iterator = this.c.iterator();
            while (bl2 = iterator.hasNext()) {
                Object t3 = iterator.next();
                bs2_12.d(t3);
            }
        }
        return this.a.e();
    }

    public final Object f(String string2) {
        return this.a.f(string2);
    }
}

