/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 */
import android.os.Parcelable;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Z6$a
 */
public final class z6$a_0
implements F62 {
    public final /* synthetic */ j7_0 a;

    public z6$a_0(j7_0 j7_02) {
        this.a = j7_02;
    }

    public final void onChanged(Object object) {
        String string2;
        object = (DataCallback)object;
        Intrinsics.checkNotNullParameter(object, "value");
        Object object2 = (NavigationParent)((DataCallback)object).getData();
        Parcelable parcelable = Z6.c;
        parcelable.setValue(object2);
        this.a.getClass();
        object2 = h40_0.a;
        object2 = (NavigationParent)JsonUtils.fromJson(h40_0.T(), NavigationParent.class);
        NavigationParent navigationParent = (NavigationParent)parcelable.getValue();
        String string3 = null;
        if (navigationParent != null) {
            string2 = object2 != null ? ((NavigationParent)object2).getSwitchtoStoreIcon() : null;
            navigationParent.setSwitchtoStoreIcon(string2);
        }
        if ((navigationParent = (NavigationParent)parcelable.getValue()) != null) {
            string2 = object2 != null ? ((NavigationParent)object2).getSwitchtoStoreId() : null;
            navigationParent.setSwitchtoStoreId(string2);
        }
        if ((parcelable = (NavigationParent)parcelable.getValue()) != null) {
            if (object2 != null) {
                string3 = ((NavigationParent)object2).getAltText();
            }
            parcelable.setAltText(string3);
        }
        object2 = ((DataCallback)object).getStatus();
        parcelable = Z6.e;
        parcelable.setValue(object2);
        int n3 = ((DataCallback)object).getStatus();
        if (n3 == 0) {
            boolean bl2;
            if ((object = (NavigationParent)((DataCallback)object).getData()) == null || (object = ((NavigationParent)object).getData()) == null || (object = ((NavigationDataClass)object).getChildDetails()) == null) {
                object = mz0_2.a;
            }
            Intrinsics.checkNotNullParameter(object, "<set-?>");
            object2 = Z6.b;
            ((h83_0)object2).setValue(object);
            Z6.g = bl2 = true;
        }
    }
}

