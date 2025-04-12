/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ab
 */
public final class ab_1
implements Function0 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ lq_2 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ab_1(j7_0 j7_02, lq_2 lq_22, p83_0 p83_02, int n3) {
        this.a = j7_02;
        this.b = lq_22;
        this.c = p83_02;
        this.d = n3;
    }

    public final Object invoke() {
        boolean bl3;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        lq_2 lq_22 = this.b;
        Intrinsics.checkNotNullParameter(lq_22, "$subCategory");
        p83_0 p83_02 = this.c;
        Intrinsics.checkNotNullParameter(p83_02, "$expandableListL4");
        Object object2 = lq_22.a.getName();
        ((j7_0)object).k = object2;
        object2 = lq_22.a;
        Object object3 = ((CMSNavigation)object2).getChildDetails();
        boolean bl4 = true;
        if (object3 != null && (bl3 = object3.isEmpty()) == bl4) {
            ((j7_0)object).d((j7_0)object, (CMSNavigation)object2);
        } else {
            boolean bl2 = lq_22.b ^ bl4;
            int n3 = this.d;
            object3 = (lq_2)p83_02.get(n3);
            object = lq_2.a((lq_2)object3, bl2);
            p83_02.set(n3, object);
        }
        int n4 = jq_1.a;
        jq_1.a(((CMSNavigation)object2).getName());
        return Unit.a;
    }
}

