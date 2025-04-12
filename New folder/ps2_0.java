/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from PS2
 */
public final class ps2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Integer k;
    public final /* synthetic */ mI0 l;
    public final /* synthetic */ Integer m;

    public ps2_0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int n3, int n4, int n7, Integer n8, mI0 mI02, Integer n10) {
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.g = arrayList5;
        this.h = n3;
        this.i = n4;
        this.j = n7;
        this.k = n8;
        this.l = mI02;
        this.m = n10;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        int n3;
        Ns2 ns2;
        int n4;
        Ns2 ns22;
        int n7;
        object = (Ns2$a)object;
        List list = this.c;
        int n8 = list.size();
        for (n7 = 0; n7 < n8; ++n7) {
            ns22 = (Ns2)list.get(n7);
            int n10 = this.h;
            Ns2$a.d((Ns2$a)object, ns22, 0, n10);
        }
        list = this.d;
        n8 = list.size();
        for (n7 = 0; n7 < n8; ++n7) {
            ns22 = (Ns2)list.get(n7);
            Ns2$a.d((Ns2$a)object, ns22, 0, 0);
        }
        list = this.e;
        n8 = list.size();
        n7 = 0;
        while (true) {
            n4 = this.i;
            if (n7 >= n8) break;
            ns2 = (Ns2)list.get(n7);
            n3 = this.j;
            Ns2$a.d((Ns2$a)object, ns2, 0, n4 -= n3);
            ++n7;
        }
        list = this.f;
        n8 = list.size();
        for (n7 = 0; n7 < n8; ++n7) {
            ns2 = (Ns2)list.get(n7);
            object2 = this.k;
            if (object2 != null) {
                n3 = (Integer)object2;
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 = n4 - n3;
            Ns2$a.d((Ns2$a)object, ns2, 0, n3);
        }
        list = this.g;
        n8 = list.size();
        for (n7 = 0; n7 < n8; ++n7) {
            int n14;
            ns2 = (Ns2)list.get(n7);
            object2 = this.l;
            if (object2 != null) {
                n3 = ((mI0)object2).a;
            } else {
                n3 = 0;
                object2 = null;
            }
            Integer n15 = this.m;
            if (n15 != null) {
                n14 = n15;
            } else {
                n14 = 0;
                n15 = null;
            }
            n14 = n4 - n14;
            Ns2$a.d((Ns2$a)object, ns2, n3, n14);
        }
        return Unit.a;
    }
}

