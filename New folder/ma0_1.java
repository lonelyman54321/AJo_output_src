/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ma0
 */
public final class ma0_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ List c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ ma0_1(String string2, long l2, List list, float f5, boolean bl2, boolean bl3, Function0 function0, int n3, int n4) {
        this.a = string2;
        this.b = l2;
        this.c = list;
        this.d = f5;
        this.e = bl2;
        this.f = bl3;
        this.g = function0;
        this.h = n3;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$saleText");
        List list = this.c;
        Intrinsics.checkNotNullParameter(list, "$colors");
        Function0 function0 = this.g;
        Intrinsics.checkNotNullParameter(function0, "$onBackPressed");
        int n3 = Me3.b(this.h | 1);
        long l2 = this.b;
        float f5 = this.d;
        boolean bl2 = this.e;
        boolean bl3 = this.f;
        int n4 = this.i;
        ta0_0.d(string2, l2, list, f5, bl2, bl3, function0, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

