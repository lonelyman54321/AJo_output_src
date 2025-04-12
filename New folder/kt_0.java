/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Kt
 */
public final class kt_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ kt_0(String string2, int n3, int n4, boolean bl2) {
        this.a = string2;
        this.b = bl2;
        this.c = n3;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.c | 1);
        String string2 = this.a;
        boolean bl2 = this.b;
        int n4 = this.d;
        qt_0.h(string2, bl2, (b30_0)object, n3, n4);
        return Unit.a;
    }
}

