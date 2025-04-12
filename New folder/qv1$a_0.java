/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QV1$a
 */
public final class qv1$a_0
extends i {
    public final /* synthetic */ qv1_2 j;

    public qv1$a_0(qv1_2 qv1_22, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.j = qv1_22;
        super(fragmentManager, 0);
    }

    public final int c() {
        Object object = this.j;
        Object object2 = ((qv1_2)object).l;
        if (object2 != null) {
            List list = null;
            if ((object2 = object2 != null && (object2 = ((NavigationParent)object2).getData()) != null ? ((NavigationDataClass)object2).getChildDetails() : null) != null) {
                object = ((qv1_2)object).l;
                Intrinsics.checkNotNull(object);
                object = ((NavigationParent)object).getData();
                if (object != null) {
                    list = ((NavigationDataClass)object).getChildDetails();
                }
                Intrinsics.checkNotNull(list);
                return list.size();
            }
        }
        return 0;
    }

    public final CharSequence e(int n3) {
        return "";
    }

    public final Fragment n(int n3) {
        Object object;
        ArrayList arrayList = new ArrayList();
        qv1_2 qv1_22 = this.j;
        Object object2 = qv1_22.l;
        object2 = object2 != null && (object2 = ((NavigationParent)object2).getData()) != null ? ((NavigationDataClass)object2).getChildDetails() : null;
        if (object2 != null && (object2 = qv1_22.l) != null && (object2 = ((NavigationParent)object2).getData()) != null && (object2 = ((NavigationDataClass)object2).getChildDetails()) != null && (object = (CMSNavigation)object2.get(n3)) != null && (object = ((CMSNavigation)object).getChildDetails()) != null) {
            object = (Collection)object;
            arrayList.addAll(object);
        }
        object = yd1_1.Companion;
        object2 = qv1_22.l;
        object.getClass();
        object = "navigationList";
        Intrinsics.checkNotNullParameter(arrayList, (String)object);
        yd1_1 yd1_12 = new yd1_1();
        Bundle bundle = new Bundle();
        bundle.putSerializable((String)object, arrayList);
        bundle.putParcelable("NAVIGATION_PARENT", (Parcelable)object2);
        yd1_12.setArguments(bundle);
        yd1_12.b = object = qv1_22.i;
        return yd1_12;
    }
}

