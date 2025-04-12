/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vu3
 */
public final class vu3_0
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ vu3_0(boolean bl2, String string2, String string3, String string4, boolean bl3, Function0 function0, Function0 function02, int n3) {
        this.a = bl2;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = bl3;
        this.f = function0;
        this.g = function02;
        this.h = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Function0 function0 = this.f;
        Intrinsics.checkNotNullParameter(function0, "$onFollowButtonClicked");
        Function0 function02 = this.g;
        Intrinsics.checkNotNullParameter(function02, "$onBrandClicked");
        int n3 = Me3.b(this.h | 1);
        String string2 = this.d;
        boolean bl2 = this.e;
        boolean bl3 = this.a;
        String string3 = this.b;
        String string4 = this.c;
        ov3.k(bl3, string3, string4, string2, bl2, function0, function02, (b30_0)object3, n3);
        return Unit.a;
    }
}

