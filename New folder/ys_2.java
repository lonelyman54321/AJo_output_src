/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ys
 */
public final class ys_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ft1_2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public /* synthetic */ ys_2(LP1 lP1, List list, String string2, boolean bl2, ft1_2 ft1_22, boolean bl3, int n3, String string3, int n4) {
        this.a = lP1;
        this.b = list;
        this.c = string2;
        this.d = bl2;
        this.e = ft1_22;
        this.f = bl3;
        this.g = n3;
        this.h = string3;
        this.i = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        List list = this.b;
        Intrinsics.checkNotNullParameter(list, "$component");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$videoId");
        ft1_2 ft1_22 = this.e;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        String string3 = this.h;
        Intrinsics.checkNotNullParameter(string3, "$thumbnailUrl");
        int n3 = Me3.b(this.i | 1);
        boolean bl2 = this.f;
        int n4 = this.g;
        boolean bl3 = this.d;
        Fs.a(lP1, list, string2, bl3, ft1_22, bl2, n4, string3, (b30_0)object3, n3);
        return Unit.a;
    }
}

