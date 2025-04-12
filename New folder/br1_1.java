/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from br1
 */
public final class br1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ tr1_0 d;

    public br1_1(ArrayList arrayList, tr1_0 tr1_02) {
        this.c = arrayList;
        this.d = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        br1_1 br1_12 = this;
        Object object2 = object;
        object2 = (Ns2$a)object;
        Object object3 = this.c;
        int n3 = object3.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            dr1_0 dr1_02 = (dr1_0)object3.get(i3);
            int n4 = dr1_02.r;
            int n7 = -1 << -1;
            if (n4 != n7) {
                int n8;
                Object object4;
                Object object5 = dr1_02.i;
                n7 = object5.size();
                for (int i8 = 0; i8 < n7; ++i8) {
                    long l2;
                    List list;
                    Ns2 ns2 = (Ns2)object5.get(i8);
                    int n10 = dr1_02.s;
                    boolean bl2 = dr1_02.c;
                    int n14 = bl2 ? ns2.b : ns2.a;
                    n10 -= n14;
                    n14 = dr1_02.t;
                    long l3 = dr1_02.v;
                    Object object6 = dr1_02.l;
                    object4 = object3;
                    object3 = dr1_02.b;
                    if ((object3 = ((LazyLayoutItemAnimator)object6).a(i8, object3)) != null) {
                        object6 = (Si1)((Gr1)object3).q.getValue();
                        n8 = n3;
                        long l4 = ((Si1)object6).a;
                        l4 = Si1.d(l3, l4);
                        list = object5;
                        n4 = dr1_02.o(l3);
                        if ((n4 <= n10 && (n4 = dr1_02.o(l4)) <= n10 || (n4 = dr1_02.o(l3)) >= n14 && (n4 = dr1_02.o(l4)) >= n14) && (n4 = (int)(((Boolean)(object5 = (Boolean)((Gr1)object3).h.getValue())).booleanValue() ? 1 : 0)) != 0) {
                            n10 = 0;
                            object5 = new jr1_2((Gr1)object3, null);
                            n14 = 3;
                            i90_0 i90_02 = ((Gr1)object3).a;
                            Ae3.d(i90_02, null, null, (Function2)object5, n14);
                        }
                        object5 = ((Gr1)object3).n;
                        l3 = l4;
                        object6 = object5;
                    } else {
                        n8 = n3;
                        list = object5;
                        n10 = 0;
                        object6 = null;
                    }
                    n3 = (int)(dr1_02.e ? 1 : 0);
                    if (n3 != 0) {
                        n3 = 32;
                        if (bl2) {
                            n10 = n7;
                            l2 = l3 >> n3;
                            n3 = (int)l2;
                        } else {
                            n10 = n7;
                            l2 = l3 >> n3;
                            n3 = (int)l2;
                            n4 = dr1_02.r - n3;
                            n3 = bl2 ? ns2.b : ns2.a;
                            n3 = n4 - n3;
                        }
                        l2 = 0xFFFFFFFFL;
                        if (bl2) {
                            n7 = (int)(l2 &= l3);
                            n4 = dr1_02.r - n7;
                            n7 = bl2 ? ns2.b : ns2.a;
                            n4 -= n7;
                        } else {
                            n4 = (int)(l2 &= l3);
                        }
                        l3 = Ti1.a(n3, n4);
                    } else {
                        n10 = n7;
                    }
                    l2 = dr1_02.j;
                    l2 = Si1.d(l3, l2);
                    if (object3 != null) {
                        ((Gr1)object3).m = l2;
                    }
                    if (bl2) {
                        if (object6 != null) {
                            object2.getClass();
                            Ns2$a.a((Ns2$a)object2, ns2);
                            long l7 = ns2.e;
                            l7 = Si1.d(l2, l7);
                            n4 = 0;
                            object5 = null;
                            ns2.j0(l7, 0.0f, (W01)object6);
                        } else {
                            Ns2$a.k((Ns2$a)object2, ns2, l2);
                        }
                    } else if (object6 != null) {
                        Ns2$a.i((Ns2$a)object2, ns2, l2, (W01)object6);
                    } else {
                        Ns2$a.h((Ns2$a)object2, ns2, l2);
                    }
                    n7 = n10;
                    object3 = object4;
                    n3 = n8;
                    object5 = list;
                }
                object4 = object3;
                n8 = n3;
                continue;
            }
            object3 = "position() should be called first".toString();
            object2 = new IllegalArgumentException((String)object3);
            throw object2;
        }
        br1_12.d.getValue();
        return Unit.a;
    }
}

