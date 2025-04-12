/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zd2
 */
public final class zd2_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ zd2_2(String string2, String string3, String string4, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$address");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$phone");
        int n3 = Me3.b(this.d | 1);
        de2_0.g(this.a, string2, string3, (b30_0)object, n3);
        return Unit.a;
    }
}

