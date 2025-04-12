/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Vs1
 */
public final class vs1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ xs1_0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tr1_0 f;

    public vs1_1(ArrayList arrayList, xs1_0 xs1_02, boolean bl2, tr1_0 tr1_02) {
        this.c = arrayList;
        this.d = xs1_02;
        this.e = bl2;
        this.f = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        xs1_0 xs1_02;
        object = (Ns2$a)object;
        List list = this.c;
        int n3 = list.size();
        int n4 = 0;
        while (true) {
            xs1_02 = this.d;
            bl2 = this.e;
            if (n4 >= n3) break;
            xs1_0 xs1_03 = (xs1_0)list.get(n4);
            if (xs1_03 != xs1_02) {
                xs1_03.e((Ns2$a)object, bl2);
            }
            ++n4;
        }
        if (xs1_02 != null) {
            xs1_02.e((Ns2$a)object, bl2);
        }
        this.f.getValue();
        return Unit.a;
    }
}

