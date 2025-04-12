/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from rE1$a
 */
public final class re1$a_0
implements F62 {
    public final /* synthetic */ bf1_2 a;

    public re1$a_0(bf1_2 bf1_22) {
        this.a = bf1_22;
    }

    public final void onChanged(Object list) {
        String string2;
        list = (DataCallback)((Object)list);
        Intrinsics.checkNotNullParameter(list, "value");
        Object object = (NavigationParent)((DataCallback)((Object)list)).getData();
        re1_1.c.setValue(object);
        this.a.getClass();
        object = h40_0.a;
        object = (NavigationParent)JsonUtils.fromJson(h40_0.U(), NavigationParent.class);
        Object object2 = re1_1.h();
        String string3 = null;
        if (object2 != null) {
            string2 = object != null ? ((NavigationParent)object).getSwitchtoStoreIcon() : null;
            ((NavigationParent)object2).setSwitchtoStoreIcon(string2);
        }
        if ((object2 = re1_1.h()) != null) {
            string2 = object != null ? ((NavigationParent)object).getSwitchtoStoreId() : null;
            ((NavigationParent)object2).setSwitchtoStoreId(string2);
        }
        if ((object2 = re1_1.h()) != null) {
            if (object != null) {
                string3 = ((NavigationParent)object).getAltText();
            }
            ((NavigationParent)object2).setAltText(string3);
        }
        int n3 = ((DataCallback)((Object)list)).getStatus();
        object2 = re1_1.d;
        object = n3;
        ((h83_0)object2).setValue(object);
        n3 = ((DataCallback)((Object)list)).getStatus();
        if (n3 == 0) {
            boolean bl2;
            if ((list = (NavigationParent)((DataCallback)((Object)list)).getData()) == null || (list = ((NavigationParent)((Object)list)).getData()) == null || (list = ((NavigationDataClass)((Object)list)).getChildDetails()) == null) {
                list = new List();
            }
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.services.data.Home.CMSNavigation>");
            list = TypeIntrinsics.asMutableList(list);
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            object = re1_1.a;
            ((h83_0)object).setValue(list);
            re1_1.f = bl2 = true;
        }
    }
}

