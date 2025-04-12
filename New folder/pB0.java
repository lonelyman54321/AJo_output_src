/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class pB0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ pB0(String string2, String string3, String string4, Function0 function0, boolean bl2, int n3, int n4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = function0;
        this.e = bl2;
        this.f = n3;
        this.g = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$primaryText");
        String string3 = this.b;
        Intrinsics.checkNotNullParameter(string3, "$secondaryText");
        int n3 = Me3.b(this.f | 1);
        String string4 = this.c;
        Function0 function0 = this.d;
        boolean bl2 = this.e;
        int n4 = this.g;
        rB0.b(string2, string3, string4, function0, bl2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

