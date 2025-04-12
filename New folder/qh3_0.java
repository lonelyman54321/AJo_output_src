/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qh3
 */
public final class qh3_0
implements al1_1 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function2 b;

    public qh3_0(u10 u102, Function2 function2) {
        this.a = u102;
        this.b = function2;
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        float f5;
        int n3;
        int n4;
        int n7;
        Qh3$a qh3$a;
        boolean bl2;
        Object object;
        Object object2;
        int n8;
        int n10;
        Object object3;
        Object object4;
        Object object5;
        dl1_1 dl1_13;
        block13: {
            long l3;
            Object object6;
            Function2 function2;
            qh3_0 qh3_02;
            block12: {
                int n14;
                qh3_02 = this;
                dl1_13 = dl1_12;
                object5 = list;
                object4 = this.a;
                object3 = "Collection contains no element matching the predicate.";
                n10 = 0;
                if (object4 != null) {
                    n14 = list.size();
                    function2 = null;
                    for (n8 = 0; n8 < n14; ++n8) {
                        object2 = (xk1_0)object5.get(n8);
                        object = androidx.compose.ui.layout.a.a((xk1_0)object2);
                        bl2 = Intrinsics.areEqual(object, object6 = "text");
                        if (!bl2) continue;
                        qh3$a = null;
                        int n15 = 11;
                        l3 = l2;
                        l3 = c60.b(l2, 0, 0, 0, 0, n15);
                        object4 = object2.Q(l3);
                        break block12;
                    }
                    object5 = new NoSuchElementException((String)object3);
                    throw object5;
                }
                n14 = 0;
                object4 = null;
            }
            function2 = qh3_02.b;
            if (function2 != null) {
                n8 = list.size();
                object2 = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    String string2;
                    object = (xk1_0)object5.get(n7);
                    object6 = androidx.compose.ui.layout.a.a((xk1_0)object);
                    n4 = (int)(Intrinsics.areEqual(object6, string2 = "icon") ? 1 : 0);
                    if (n4 != 0) {
                        l3 = l2;
                        object3 = object5 = object.Q(l2);
                        break block13;
                    }
                    l3 = l2;
                }
                object5 = new NoSuchElementException((String)object3);
                throw object5;
            }
            object3 = null;
        }
        if (object4 != null) {
            n3 = ((Ns2)object4).a;
        } else {
            n3 = 0;
            f5 = 0.0f;
            object5 = null;
        }
        if (object3 != null) {
            n10 = ((Ns2)object3).a;
        }
        n4 = Math.max(n3, n10);
        f5 = object4 != null && object3 != null ? Uh3.b : Uh3.a;
        int n16 = dl1_13.e0(f5);
        if (object4 != null) {
            object5 = Pc.a;
            n3 = object4.U((Oc)object5);
            object2 = object5 = Integer.valueOf(n3);
        } else {
            n7 = 0;
            object2 = null;
        }
        if (object4 != null) {
            object5 = Pc.b;
            n3 = object4.U((Oc)object5);
            object = object5 = Integer.valueOf(n3);
        } else {
            bl2 = false;
            object = null;
        }
        object5 = qh3$a;
        n10 = n4;
        n8 = n16;
        qh3$a = new Qh3$a((Ns2)object4, (Ns2)object3, dl1_12, n4, n16, (Integer)object2, (Integer)object);
        return cl1_0.a(dl1_13, n4, n16, qh3$a);
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }
}

