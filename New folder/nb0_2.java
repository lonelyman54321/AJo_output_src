/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nb0
 */
public final class nb0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ nb0_2(String string2, Function0 function0, String string3, Function0 function02, String string4, Function0 function03, int n3) {
        this.a = string2;
        this.b = function0;
        this.c = string3;
        this.d = function02;
        this.e = string4;
        this.f = function03;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$howDoesItWorkText");
        Function0 function0 = this.d;
        Intrinsics.checkNotNullParameter(function0, "$howDoesItWorkClick");
        String string3 = this.e;
        Intrinsics.checkNotNullParameter(string3, "$tAndCText");
        Function0 function02 = this.f;
        Intrinsics.checkNotNullParameter(function02, "$tAndCClick");
        int n3 = Me3.b(this.g | 1);
        String string4 = this.a;
        Function0 function03 = this.b;
        ob0_0.b(string4, function03, string2, function0, string3, function02, (b30_0)object3, n3);
        return Unit.a;
    }
}

