/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VC
 */
public final class vc_0
implements Function2 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ String c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ dr0_0 f;

    public /* synthetic */ vc_0(c80 c802, Subcomponent subcomponent, String string2, p83_0 p83_02, int n3, dr0_0 dr0_02) {
        this.a = c802;
        this.b = subcomponent;
        this.c = string2;
        this.d = p83_02;
        this.e = n3;
        this.f = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = (Integer)object;
        object2 = (Subcomponent)object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$coroutineScope");
        dr0_0 dr0_02 = this.f;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object2, "<unused var>");
        p83_0 p83_02 = this.d;
        int n4 = this.e;
        Subcomponent subcomponent = this.b;
        String string2 = this.c;
        object2 = new ed_2(subcomponent, string2, p83_02, n4, n3, dr0_02, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
        return Unit.a;
    }
}

