/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Jv$c
implements hx0_2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ g71_0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Cl2 d;

    public Jv$c(ArrayList arrayList, g71_0 g71_02, Function1 function1, hm0_0 hm0_02) {
        this.a = arrayList;
        this.b = g71_02;
        this.c = function1;
        this.d = hm0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (wl2_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue();
        Object object5 = object3;
        object5 = (b30_0)object3;
        object4 = (Number)object4;
        ((Number)object4).intValue();
        object3 = "$this$HorizontalPager";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object6 = object = this.a.get(n3);
        object6 = (BannerData)object;
        if (object6 != null) {
            object = this.d;
            int n4 = ((Cl2)object).j();
            int n7 = 64;
            g71_0 g71_02 = this.b;
            Function1 function1 = this.c;
            ov3.a(null, (BannerData)object6, g71_02, function1, n4, (b30_0)object5, n7);
        }
        return Unit.a;
    }
}

