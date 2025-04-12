/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH;
import com.ril.ajio.services.data.options.CuratedLayoutType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class k71
implements Runnable {
    public final /* synthetic */ HomeCuratedWidgetVH a;

    public /* synthetic */ k71(HomeCuratedWidgetVH homeCuratedWidgetVH) {
        this.a = homeCuratedWidgetVH;
    }

    public final void run() {
        HomeCuratedWidgetVH homeCuratedWidgetVH = this.a;
        Intrinsics.checkNotNullParameter(homeCuratedWidgetVH, "this$0");
        U71 u71 = homeCuratedWidgetVH.b;
        if (u71 != null) {
            int n3;
            int n4;
            boolean bl2;
            ArrayList arrayList;
            int n7 = homeCuratedWidgetVH.getBindingAdapterPosition();
            Object object = u71.H(n7);
            if (object != null) {
                arrayList = object.getCuratedWidgetItemList();
            } else {
                bl2 = false;
                arrayList = null;
            }
            if (arrayList != null && (n4 = u71.A(n3 = homeCuratedWidgetVH.getBindingAdapterPosition())) == 0) {
                n4 = arrayList.size();
                bl2 = false;
                arrayList = null;
                n3 = 1;
                if (n4 > 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    u71 = null;
                }
                object = object.getLayoutType();
                CuratedLayoutType curatedLayoutType = CuratedLayoutType.HOME_WIDGET_TYPE_CURATED;
                if (object == curatedLayoutType) {
                    bl2 = true;
                }
                if (n4 != 0 && bl2) {
                    homeCuratedWidgetVH.w();
                }
            }
        }
    }
}

