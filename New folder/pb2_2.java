/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pb2
 */
public final class pb2_2
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;

    public /* synthetic */ pb2_2(Function0 function0, Function0 function02, Function0 function03, u10 u102, boolean bl2, String string2, int n3) {
        this.a = function0;
        this.b = function02;
        this.c = function03;
        this.d = u102;
        this.e = bl2;
        this.f = string2;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$onCloseButtonClicked");
        Function0 function02 = this.b;
        Intrinsics.checkNotNullParameter(function02, "$onCtaButtonClicked");
        Function0 function03 = this.c;
        Intrinsics.checkNotNullParameter(function03, "$onOutsideClicked");
        object = this.d;
        Intrinsics.checkNotNullParameter(object, "$content");
        int n3 = Me3.b(this.g | 1);
        String string2 = this.f;
        Object object4 = object;
        object4 = (u10)object;
        boolean bl2 = this.e;
        vb2.c(function0, function02, function03, (u10)object4, bl2, string2, (b30_0)object3, n3);
        return Unit.a;
    }
}

