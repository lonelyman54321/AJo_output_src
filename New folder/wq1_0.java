/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Wq1
 */
public final class wq1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ pr1_0 c;
    public final /* synthetic */ vq1_0 d;

    public wq1_0(pr1_0 pr1_02, vq1_0 vq1_02) {
        this.c = pr1_02;
        this.d = vq1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        object = this.c.b(n3);
        List list = ((pr1$c)object).b;
        int n4 = list.size();
        ArrayList<Pair> arrayList = new ArrayList<Pair>(n4);
        n4 = list.size();
        n3 = ((pr1$c)object).a;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            long l2 = ((J11)list.get((int)i3)).a;
            int n8 = (int)l2;
            Integer n10 = n3;
            long l3 = this.d.a(n7, n8);
            c60 c602 = new c60(l3);
            Pair pair = new Pair(n10, c602);
            arrayList.add(pair);
            ++n3;
            n7 += n8;
        }
        return arrayList;
    }
}

