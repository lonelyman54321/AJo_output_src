/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nb2
 */
public final class nb2_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ nb2_1(Function0 function0, u10 u102, boolean bl2, String string2, int n3, int n4) {
        this.a = function0;
        this.b = u102;
        this.c = bl2;
        this.d = string2;
        this.e = n3;
        this.f = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$content");
        int n3 = Me3.b(this.e | 1);
        int n4 = this.f;
        Object object4 = object;
        object4 = (u10)object;
        boolean bl2 = this.c;
        String string2 = this.d;
        vb2.b(function0, (u10)object4, bl2, string2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

