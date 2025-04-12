/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rd3
 */
public final class rd3_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ rd3_2(LP1 lP1, List list, int n3, boolean bl2, boolean bl3, Function0 function0, int n4, int n7) {
        this.a = lP1;
        this.b = list;
        this.c = n3;
        this.d = bl2;
        this.e = bl3;
        this.f = function0;
        this.g = n4;
        this.h = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        Function0 function0 = this.f;
        Intrinsics.checkNotNullParameter(function0, "$onClick");
        int n3 = Me3.b(this.g | 1);
        List list = this.b;
        int n4 = this.c;
        boolean bl2 = this.d;
        boolean bl3 = this.e;
        int n7 = this.h;
        sd3_2.a(lP1, list, n4, bl2, bl3, function0, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

