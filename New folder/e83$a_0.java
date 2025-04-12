/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from e83$a
 */
public final class e83$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public e83$a_0(int n3, ArrayList arrayList) {
        this.c = arrayList;
        this.d = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        ArrayList arrayList = this.c;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ns2 ns2 = (Ns2)arrayList.get(i3);
            int n4 = ns2.b;
            int n7 = (this.d - n4) / 2;
            Ns2$a.f((Ns2$a)object, ns2, 0, n7);
        }
        return Unit.a;
    }
}

