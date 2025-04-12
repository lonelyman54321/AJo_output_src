/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RM2
 */
public final class rm2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ rm2_1(String string2, String string3, String string4, Function0 function0, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = function0;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        String string3 = this.b;
        Intrinsics.checkNotNullParameter(string3, "$desc");
        String string4 = this.c;
        Intrinsics.checkNotNullParameter(string4, "$cta");
        int n3 = Me3.b(this.e | 1);
        Function0 function0 = this.d;
        sm2_1.a(string2, string3, string4, function0, (b30_0)object3, n3);
        return Unit.a;
    }
}

