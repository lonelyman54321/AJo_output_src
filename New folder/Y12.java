/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
import android.os.Message;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Y12
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm3_0 b;

    public /* synthetic */ Y12(sm3_0 sm3_02, int n3) {
        this.a = n3;
        this.b = sm3_02;
    }

    public final void onChanged(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Integer)object;
                int n4 = (Integer)object;
                ArrayList arrayList = (vv2_2)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(arrayList, string2);
                if (n4 > 0) {
                    ((vv2_2)((Object)arrayList)).Ya();
                } else {
                    object = ((vv2_2)((Object)arrayList)).D;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recentSearchTvRefresh");
                        n4 = 0;
                        object = null;
                    }
                    int n7 = 8;
                    object.setVisibility(n7);
                    object = ((vv2_2)((Object)arrayList)).I0;
                    if (object != null) {
                        arrayList = new ArrayList();
                        ((e00)object).t(arrayList);
                    }
                }
                return;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object2 = (NewProductDetailsFragment)this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "cartIdDetailsDataCallback");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            object3 = ((NewProductDetailsFragment)object2).cb();
            bl2 = ((e12_0)object3).k0;
            int n8 = ((DataCallback)object).getStatus();
            if (n8 == 0) {
                object = ((NewProductDetailsFragment)object2).cb().p0;
                object2 = ((NewProductDetailsFragment)object2).O1;
                ((NewProductDetailsFragment$c)((Object)object2)).handleMessage((Message)object);
            }
        }
    }
}

