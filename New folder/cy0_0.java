/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import com.ril.ajio.data.model.GameInfo;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CY0
 */
public final class cy0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cy0_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        boolean bl2;
        Object object = this.c;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (vv2_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = (PlpProductUIModel)object;
                Intrinsics.checkNotNullParameter(object, "$it");
                object2 = ((vv2_1)object3).v;
                object = ((PlpProductUIModel)object).getSizeContentDescription();
                object2.setContentDescription((CharSequence)object);
                ai0_2.a(((vv2_1)object3).v);
                return;
            }
            case 0: 
        }
        Object object4 = GameZoneWebViewActivity.Companion;
        object4 = "$gameUrl";
        object3 = (String)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object = (GameZoneWebViewActivity)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ((GameZoneWebViewActivity)object).q0;
        if (object2 != null && (bl2 = TextUtils.isEmpty((CharSequence)object3))) {
            object2 = ((GameZoneWebViewActivity)object).q0;
            Intrinsics.checkNotNull(object2);
            object3 = ((GameInfo)object2).getGameUrl();
        }
        at2_1.i((Activity)object, (String)object3, "source - gamezop");
    }
}

