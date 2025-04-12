/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jb0
 */
public final class jb0_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ jb0_1(String string2, int n3, String string3, String string4, String string5, String string6, Function0 function0, Function0 function02, Function0 function03, int n4, int n7) {
        this.a = string2;
        this.b = n3;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = function0;
        this.h = function02;
        this.i = function03;
        this.j = n4;
        this.k = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$desc");
        String string4 = this.e;
        Intrinsics.checkNotNullParameter(string4, "$howDoesItWorkText");
        String string5 = this.f;
        Intrinsics.checkNotNullParameter(string5, "$tAndCText");
        Function0 function0 = this.h;
        Intrinsics.checkNotNullParameter(function0, "$howDoesItWorkClick");
        Function0 function02 = this.i;
        Intrinsics.checkNotNullParameter(function02, "$tAndCClick");
        int n3 = Me3.b(this.j | 1);
        int n4 = this.b;
        String string6 = this.d;
        Function0 function03 = this.g;
        int n7 = this.k;
        ob0_0.a(string2, n4, string3, string6, string4, string5, function03, function0, function02, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

