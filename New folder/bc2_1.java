/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bc2
 */
public final class bc2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public /* synthetic */ bc2_1(String string2, List list, int n3, String string3, boolean bl2, int n4) {
        this.a = string2;
        this.b = list;
        this.c = n3;
        this.d = string3;
        this.e = bl2;
        this.f = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$status");
        List list = this.b;
        Intrinsics.checkNotNullParameter(list, "$entries");
        String string3 = this.d;
        Intrinsics.checkNotNullParameter(string3, "$orderCode");
        int n3 = Me3.b(this.f | 1);
        int n4 = this.c;
        boolean bl2 = this.e;
        jd2_1.d(string2, list, n4, string3, bl2, (b30_0)object3, n3);
        return Unit.a;
    }
}

