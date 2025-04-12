/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VE1
 */
public final class ve1_1
implements Function1 {
    public final /* synthetic */ bf1_2 a;
    public final /* synthetic */ lq_2 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ve1_1(bf1_2 bf1_22, lq_2 lq_22, p83_0 p83_02, int n3) {
        this.a = bf1_22;
        this.b = lq_22;
        this.c = p83_02;
        this.d = n3;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4 = 1;
        object = (CMSNavigation)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$subCategory");
        p83_0 p83_02 = this.c;
        Intrinsics.checkNotNullParameter(p83_02, "$expandableList");
        Intrinsics.checkNotNullParameter(object, "it");
        ((bf1_2)object2).k = object = ((lq_2)object3).a.getName();
        ((bf1_2)object2).l = "";
        object = ((lq_2)object3).a;
        List list = ((CMSNavigation)object).getChildDetails();
        if (list != null && (n3 = list.isEmpty()) == n4) {
            ((bf1_2)object2).c((bf1_2)object2, (CMSNavigation)object);
        } else {
            Integer n7;
            boolean bl2;
            block5: {
                bl2 = ((lq_2)object3).b ^ n4;
                object3 = p83_02.a().c;
                Intrinsics.checkNotNullParameter(object3, "expandableList");
                object3 = object3.iterator();
                n3 = 0;
                list = null;
                int n8 = 0;
                while (true) {
                    boolean bl3 = object3.hasNext();
                    n7 = null;
                    if (!bl3) break block5;
                    Object object4 = object3.next();
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
                object3 = lq_2.a((lq_2)p83_02.get(n14), false);
                p83_02.set(n4, object3);
            }
            n4 = this.d;
            object3 = (lq_2)p83_02.get(n4);
            object2 = lq_2.a((lq_2)object3, bl2);
            p83_02.set(n4, object2);
        }
        n4 = jq_1.a;
        jq_1.a(((CMSNavigation)object).getName());
        return Unit.a;
    }
}

