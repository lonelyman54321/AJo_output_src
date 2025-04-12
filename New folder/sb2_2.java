/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sb2
 */
public final class sb2_2
implements Function2 {
    public final /* synthetic */ hx0_2 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ sb2_2(u10 u102, u10 u103, u10 u104, u10 u105, u10 u106, u10 u107, int n3) {
        this.a = u102;
        this.b = u103;
        this.c = u104;
        this.d = u105;
        this.e = u106;
        this.f = u107;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$callBackExecution");
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$alwaysVisibleContent");
        Object object4 = this.c;
        Intrinsics.checkNotNullParameter(object4, "$expandableContent");
        Object object5 = this.d;
        Intrinsics.checkNotNullParameter(object5, "$hiddenContentOnExpand");
        Function2 function2 = this.e;
        Intrinsics.checkNotNullParameter(function2, "$replaceableContentOnExpand");
        Function2 function22 = this.f;
        Intrinsics.checkNotNullParameter(function22, "$footedExpandedContent");
        int n3 = Me3.b(this.g | 1);
        object = (u10)object;
        object2 = (u10)object2;
        Function2 function23 = object4;
        function23 = (u10)object4;
        Function2 function24 = object5;
        function24 = (u10)object5;
        Function2 function25 = function2;
        function25 = (u10)function2;
        Function2 function26 = function22;
        function26 = (u10)function22;
        object4 = object;
        object5 = object2;
        function2 = function23;
        function22 = function24;
        function23 = function25;
        function24 = function26;
        vb2.e((u10)object, (u10)object2, (u10)function2, (u10)function22, (u10)function25, (u10)function26, (b30_0)object3, n3);
        return Unit.a;
    }
}

