/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from wF2
 */
public final class wf2_2
extends Lambda
implements Function2 {
    public final /* synthetic */ nl1_0 c;
    public final /* synthetic */ Subcomponent d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ int f;

    public wf2_2(nl1_0 nl1_02, Subcomponent subcomponent, p83_0 p83_02, int n3) {
        this.c = nl1_02;
        this.d = subcomponent;
        this.e = p83_02;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        wf2_2 wf2_22 = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object4 = wf2_22.c;
            n3 = 0;
            Object object5 = null;
            ((nl1_0)object4).c((b30_0)object3, 0);
            n4 = 1661163939;
            object3.K(n4);
            object4 = a.b("tagsListComposable");
            Object object6 = wf2_22.d;
            String string2 = "";
            if (object6 == null || (object5 = ((Subcomponent)object6).getResourceOwner()) == null || (object5 = ((ResourceOwner)object5).getTagsFromList()) == null) {
                object5 = string2;
            }
            long l2 = oj3_2.c;
            tv0_0 tv0_02 = tv0_0.e;
            long l3 = nz_1.b;
            int n7 = 24960;
            int n8 = 424;
            String string3 = null;
            long l4 = l2;
            Subcomponent subcomponent = object6;
            int n10 = n8;
            AF2.c((LP1)object4, (String)object5, l2, 0, tv0_02, null, l3, 0, 0, (b30_0)object3, n7, n8);
            object4 = a.b("brandDescriptionComposable");
            if (object6 == null || (object5 = ((Subcomponent)object6).getResourceOwner()) == null || (object5 = ((ResourceOwner)object5).getMotto()) == null) {
                object5 = string2;
            }
            tv0_02 = tv0_0.g;
            long l7 = OX.f;
            n7 = 1597824;
            n10 = 424;
            string3 = null;
            l4 = l2;
            l3 = l7;
            AF2.c((LP1)object4, (String)object5, l2, 0, tv0_02, null, l7, 0, 0, (b30_0)object3, n7, n10);
            object4 = a.b("brandTitleComposable");
            if (subcomponent == null || (object5 = subcomponent.getResourceOwner()) == null || (object5 = ((ResourceOwner)object5).getName()) == null) {
                object5 = string2;
            }
            l4 = oj3_2.i;
            tv0_02 = tv0_0.h;
            n7 = 1597824;
            n10 = 424;
            string3 = null;
            l3 = l7;
            AF2.c((LP1)object4, (String)object5, l4, 0, tv0_02, null, l7, 0, 0, (b30_0)object3, n7, n10);
            object4 = wf2_22.e;
            object5 = object4 != null && (object4 = (Subcomponent)((p83_0)object4).get(n3 = wf2_22.f)) != null && (object4 = ((Subcomponent)object4).getResourceOwner()) != null && (object4 = ((ResourceOwner)object4).getLogo()) != null ? object4 : string2;
            float f5 = uq0_0.E;
            object4 = a.b("brandImageComposable");
            int n14 = 996;
            string3 = "Brand Image";
            tv0_02 = null;
            long l8 = 0L;
            long l12 = 0L;
            long l14 = 0L;
            object6 = object3;
            int n15 = 27648;
            ov3.e((LP1)object4, (String)object5, false, f5, string3, false, l8, 0.0f, l12, l14, (b30_0)object3, n15, n14);
            object3.E();
        }
        return Unit.a;
    }
}

