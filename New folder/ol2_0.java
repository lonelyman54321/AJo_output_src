/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ol2
 */
public final class ol2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ tr1_0 d;

    public ol2_0(ArrayList arrayList, tr1_0 tr1_02) {
        this.c = arrayList;
        this.d = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        ol2_0 ol2_02 = this;
        Object object2 = object;
        object2 = (Ns2$a)object;
        Object object3 = this.c;
        int n3 = object3.size();
        int n4 = 0;
        while (n4 < n3) {
            fl1_1 fl1_12 = (fl1_1)object3.get(n4);
            int n7 = fl1_12.n;
            int n8 = -1 << -1;
            if (n7 != n8) {
                int n10;
                List list = fl1_12.c;
                n8 = list.size();
                for (int i3 = 0; i3 < n8; ++i3) {
                    long l2;
                    Ns2 ns2 = (Ns2)list.get(i3);
                    int n14 = i3 * 2;
                    int[] nArray = fl1_12.l;
                    int n15 = nArray[n14];
                    ++n14;
                    n14 = nArray[n14];
                    long l3 = Ti1.a(n15, n14);
                    n15 = (int)(fl1_12.i ? 1 : 0);
                    boolean bl2 = fl1_12.j;
                    if (n15 != 0) {
                        int n16;
                        n15 = 32;
                        if (bl2) {
                            n10 = n4;
                            l2 = l3 >> n15;
                            n4 = (int)l2;
                        } else {
                            n10 = n4;
                            l2 = l3 >> n15;
                            n4 = (int)l2;
                            n16 = fl1_12.n - n4;
                            n4 = bl2 ? ns2.b : ns2.a;
                            n4 = n16 - n4;
                        }
                        long l4 = 0xFFFFFFFFL;
                        if (bl2) {
                            n16 = (int)(l3 &= l4);
                            n14 = fl1_12.n - n16;
                            n16 = bl2 ? ns2.b : ns2.a;
                            n14 -= n16;
                        } else {
                            n14 = (int)(l3 &= l4);
                        }
                        l3 = Ti1.a(n4, n14);
                    } else {
                        n10 = n4;
                    }
                    l2 = fl1_12.d;
                    l2 = Si1.d(l3, l2);
                    if (bl2) {
                        Ns2$a.k((Ns2$a)object2, ns2, l2);
                    } else {
                        Ns2$a.h((Ns2$a)object2, ns2, l2);
                    }
                    n4 = n10;
                }
                n10 = n4++;
                continue;
            }
            object3 = "position() should be called first".toString();
            object2 = new IllegalArgumentException((String)object3);
            throw object2;
        }
        ol2_02.d.getValue();
        return Unit.a;
    }
}

