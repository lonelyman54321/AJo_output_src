/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JC
 */
public final class jc_0
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ Subcomponent c;
    public final /* synthetic */ Subcomponent d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ yp0_0 g;
    public final /* synthetic */ String h;

    public /* synthetic */ jc_0(dr0_0 dr0_02, p83_0 p83_02, Subcomponent subcomponent, Subcomponent subcomponent2, String string2, int n3, yp0_0 yp0_02, String string3) {
        this.a = dr0_02;
        this.b = p83_02;
        this.c = subcomponent;
        this.d = subcomponent2;
        this.e = string2;
        this.f = n3;
        this.g = yp0_02;
        this.h = string3;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Subcomponent subcomponent = this.c;
        Intrinsics.checkNotNullParameter(subcomponent, "$subcomponent");
        yp0_0 yp0_02 = this.g;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        boolean bl2 = subcomponent.isLiked();
        boolean bl3 = bl2 ^ true;
        String string2 = subcomponent.getId();
        Object object2 = this.b;
        Object object3 = this.d;
        String string3 = this.e;
        int n3 = this.f;
        ((dr0_0)object).Q((p83_0)object2, bl3, (Subcomponent)object3, string3, n3, string2);
        boolean bl4 = subcomponent.isLiked() ^ true;
        object = bl4 ? "post liked" : "post unliked";
        object2 = this.h;
        Object object4 = "";
        if (object2 == null) {
            object2 = object4;
        }
        if ((object3 = ((Subcomponent)object3).getId()) != null) {
            object4 = object3;
        }
        yp0_02.b((String)object, (String)object2, (String)object4);
        return Unit.a;
    }
}

