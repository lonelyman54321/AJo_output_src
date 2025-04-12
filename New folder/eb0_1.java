/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eb0
 */
public final class eb0_1
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ int k;

    public /* synthetic */ eb0_1(ob0_1 ob0_12, boolean bl2, boolean bl3, String string2, long l2, String string3, String string4, long l3, long l4, tt_2 tt_22, int n3) {
        this.a = ob0_12;
        this.b = bl2;
        this.c = bl3;
        this.d = string2;
        this.e = l2;
        this.f = string3;
        this.g = string4;
        this.h = l3;
        this.i = l4;
        this.j = tt_22;
        this.k = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Integer)object2).getClass();
        object4 = this.a;
        Intrinsics.checkNotNullParameter(object4, "$viewModel");
        String string2 = this.d;
        Intrinsics.checkNotNullParameter(string2, "$title");
        String string3 = this.f;
        Intrinsics.checkNotNullParameter(string3, "$desc");
        String string4 = this.g;
        Intrinsics.checkNotNullParameter(string4, "$buttonText");
        Function0 function0 = this.j;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        int n3 = Me3.b(this.k | 1);
        long l2 = this.i;
        Function0 function02 = function0;
        function02 = (tt_2)function0;
        boolean bl2 = this.b;
        boolean bl3 = this.c;
        long l3 = this.e;
        long l4 = this.h;
        gb0_1.d((ob0_1)object4, bl2, bl3, string2, l3, string3, string4, l4, l2, (tt_2)function02, (b30_0)object3, n3);
        return Unit.a;
    }
}

