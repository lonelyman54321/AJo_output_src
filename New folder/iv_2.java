/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Iv
 */
public final class iv_2
implements Function2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g71_0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ iv_2(ArrayList arrayList, Function1 function1, g71_0 g71_02, Function1 function12, boolean bl2, float f5, boolean bl3, float f6, int n3, int n4) {
        this.a = arrayList;
        this.b = function1;
        this.c = g71_02;
        this.d = function12;
        this.e = bl2;
        this.f = f5;
        this.g = bl3;
        this.h = f6;
        this.i = n3;
        this.j = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        ArrayList arrayList = this.a;
        Intrinsics.checkNotNullParameter(arrayList, "$bannerDataList");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        Function1 function12 = this.d;
        Intrinsics.checkNotNullParameter(function12, "$sendImpression");
        int n3 = Me3.b(this.i | 1);
        g71_0 g71_02 = this.c;
        boolean bl2 = this.e;
        float f5 = this.f;
        boolean bl3 = this.g;
        float f6 = this.h;
        int n4 = this.j;
        jv_1.b(arrayList, function1, g71_02, function12, bl2, f5, bl3, f6, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

