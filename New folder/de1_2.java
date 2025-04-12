/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.x;
import androidx.navigation.d;
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;

/*
 * Renamed from dE1
 */
public final class de1_2
implements hx0_2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ zd1_1 b;

    public de1_2(yT1 yT12, zd1_1 zd1_12) {
        this.a = yT12;
        this.b = zd1_12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        String string2 = "$this$composable";
        String string3 = "it";
        ro.c((Number)object4, (ek_1)object, string2, (d)object2, string3);
        object = this.a;
        object2 = ((e)object).k();
        if (object2 != null && (object2 = ((d)object2).b()) != null) {
            object4 = "selected_category";
            object2 = (CMSNavigation)((x)object2).b((String)object4);
        } else {
            object2 = null;
        }
        object4 = (bf1_2)this.b.f.getValue();
        ue1_0.b((e)object, (bf1_2)object4, (CMSNavigation)object2, (b30_0)object3, 584);
        return Unit.a;
    }
}

