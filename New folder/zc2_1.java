/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from zc2
 */
public final class zc2_1
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zc2_1(List list, boolean bl2) {
        this.a = list;
        this.b = bl2;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$entries");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        int n3 = object2.size();
        Lambda lambda = dc2_1.c;
        ec2_1 ec2_12 = new ec2_1((List)object2, (Function1)((Object)lambda));
        boolean bl2 = this.b;
        lambda = new fc2_1((List)object2, bl2);
        object2 = new u10(-632812321, lambda, true);
        object.a(n3, null, ec2_12, (u10)object2);
        return Unit.a;
    }
}

