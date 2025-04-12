/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hc2
 */
public final class hc2_2
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ hc2_2(n8_0 n8_02, o8_0 o8_02, String string2, int n3) {
        this.a = n8_02;
        this.b = o8_02;
        this.c = string2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$onCloseButtonClicked");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onLinkButtonClicked");
        int n3 = Me3.b(this.d | 1);
        object2 = (n8_0)object2;
        function0 = (o8_0)function0;
        String string2 = this.c;
        jd2_1.i((n8_0)object2, (o8_0)function0, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

