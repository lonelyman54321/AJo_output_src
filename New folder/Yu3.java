/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Yu3
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ Yu3(boolean bl2, String string2, Function0 function0, Function0 function02, int n3) {
        this.a = bl2;
        this.b = string2;
        this.c = function0;
        this.d = function02;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$title");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$onShareClicked");
        Function0 function02 = this.d;
        Intrinsics.checkNotNullParameter(function02, "$onLikeClicked");
        int n3 = Me3.b(this.e | 1);
        ov3.n(this.a, string2, function0, function02, (b30_0)object3, n3);
        return Unit.a;
    }
}

