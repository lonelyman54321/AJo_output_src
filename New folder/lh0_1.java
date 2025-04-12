/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lh0
 */
public final class lh0_1
implements Function2 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ gx0_2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ lh0_1(yi2_1 yi2_12, ArrayList arrayList, Function0 function0, gx0_2 gx0_22, int n3) {
        this.a = yi2_12;
        this.b = arrayList;
        this.c = function0;
        this.d = gx0_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$thumbnailArray");
        gx0_2 gx0_22 = this.d;
        Intrinsics.checkNotNullParameter(gx0_22, "$imgClicked");
        int n3 = Me3.b(this.e | 1);
        Function0 function0 = this.c;
        Object object4 = object;
        object4 = (ArrayList)object;
        mh0_1.a(this.a, (ArrayList)object4, function0, gx0_22, (b30_0)object3, n3);
        return Unit.a;
    }
}

