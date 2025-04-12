/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Nu3
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ tv0_0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ ol0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ Nu3(boolean bl2, String string2, float f5, float f6, LP1 lP1, tv0_0 tv0_02, float f7, ol0 ol02, Function0 function0, boolean bl3, int n3, int n4) {
        this.a = bl2;
        this.b = string2;
        this.c = f5;
        this.d = f6;
        this.e = lP1;
        this.f = tv0_02;
        this.g = f7;
        this.h = ol02;
        this.i = function0;
        this.j = bl3;
        this.k = n3;
        this.l = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$buttonText");
        LP1 lP1 = this.e;
        Intrinsics.checkNotNullParameter(lP1, "$boxModifier");
        Function0 function0 = this.i;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        int n3 = Me3.b(this.k | 1);
        boolean bl2 = this.a;
        float f5 = this.c;
        float f6 = this.d;
        tv0_0 tv0_02 = this.f;
        float f7 = this.g;
        ol0 ol02 = this.h;
        boolean bl3 = this.j;
        int n4 = this.l;
        ov3.f(bl2, string2, f5, f6, lP1, tv0_02, f7, ol02, function0, bl3, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

