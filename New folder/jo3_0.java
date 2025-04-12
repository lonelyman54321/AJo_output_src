/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jo3
 */
public final class jo3_0
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ jo3_0(boolean bl2, ob0_1 ob0_12, String string2, String string3, String string4, Function0 function0, u10 u102, int n3, int n4) {
        this.a = bl2;
        this.b = ob0_12;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = function0;
        this.g = u102;
        this.h = n3;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        ob0_1 ob0_12 = this.b;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Function0 function0 = this.f;
        Intrinsics.checkNotNullParameter(function0, "$onBackPressed");
        object = this.g;
        Intrinsics.checkNotNullParameter(object, "$content");
        int n3 = Me3.b(this.h | 1);
        int n4 = this.i;
        Object object4 = object;
        object4 = (u10)object;
        boolean bl2 = this.a;
        String string2 = this.c;
        String string3 = this.d;
        String string4 = this.e;
        ro3_0.c(bl2, ob0_12, string2, string3, string4, function0, (u10)object4, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

