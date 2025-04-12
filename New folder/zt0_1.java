/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from zt0
 */
public final class zt0_1
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ zt0_1(ArrayList arrayList, boolean bl2, String string2, int n3) {
        this.a = arrayList;
        this.b = bl2;
        this.c = string2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        int n3 = Me3.b(this.d | 1);
        boolean bl2 = this.b;
        String string2 = this.c;
        ht0_1.a(this.a, bl2, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

