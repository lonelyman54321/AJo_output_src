/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ib
 */
public final class ib_1
implements Function0 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ lq_2 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ib_1(j7_0 j7_02, lq_2 lq_22, p83_0 p83_02, int n3) {
        this.a = j7_02;
        this.b = lq_22;
        this.c = p83_02;
        this.d = n3;
    }

    public final Object invoke() {
        int n3;
        int n4 = 1;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$ajioSubCategory");
        p83_0 p83_02 = this.c;
        Intrinsics.checkNotNullParameter(p83_02, "$expandableList");
        Object object3 = ((lq_2)object2).a.getName();
        ((j7_0)object).j = object3;
        ((j7_0)object).k = "";
        object3 = ((lq_2)object2).a;
        List list = ((CMSNavigation)object3).getChildDetails();
        if (list != null && (n3 = list.isEmpty()) == n4) {
            ((j7_0)object).d((j7_0)object, (CMSNavigation)object3);
        } else {
            Integer n7;
            boolean bl2;
            block5: {
                bl2 = ((lq_2)object2).b ^ n4;
                object2 = p83_02.a().c;
                Intrinsics.checkNotNullParameter(object2, "expandableList");
                object2 = object2.iterator();
                n3 = 0;
                list = null;
                int n8 = 0;
                while (true) {
                    boolean bl3 = object2.hasNext();
                    n7 = null;
                    if (!bl3) break block5;
                    Object object4 = object2.next();
                    int n10 = n8 + 1;
                    if (n8 < 0) break;
                    object4 = (lq_2)object4;
                    bl3 = ((lq_2)object4).b;
                    if (bl3) {
                        n7 = n8;
                        break block5;
                    }
                    n8 = n10;
                }
                xx_2.n();
                throw null;
            }
            if (n7 != null) {
                n4 = n7;
                int n14 = n7;
                object2 = lq_2.a((lq_2)p83_02.get(n14), false);
                p83_02.set(n4, object2);
            }
            n4 = this.d;
            object2 = (lq_2)p83_02.get(n4);
            object = lq_2.a((lq_2)object2, bl2);
            p83_02.set(n4, object);
        }
        n4 = jq_1.a;
        jq_1.a(((CMSNavigation)object3).getName());
        return Unit.a;
    }
}

