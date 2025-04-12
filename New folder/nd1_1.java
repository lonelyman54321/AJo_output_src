/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nD1
 */
public final class nd1_1
implements View.OnClickListener {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ od1_2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nd1_1(CMSNavigation cMSNavigation, od1_2 od1_22, String string2) {
        this.a = cMSNavigation;
        this.b = od1_22;
        this.c = string2;
    }

    public final void onClick(View object) {
        CMSNavigation cMSNavigation = this.a;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$cmsNavigation");
        od1_2 od1_22 = this.b;
        Intrinsics.checkNotNullParameter((Object)od1_22, "this$0");
        object = new Bundle();
        Object object2 = cMSNavigation.getName();
        object.putString("category_name", (String)object2);
        object2 = od1_22.d;
        CharSequence charSequence = new StringBuilder();
        charSequence.append((String)object2);
        charSequence.append("->");
        object2 = this.c;
        charSequence.append((String)object2);
        object2 = charSequence.toString();
        object.putString("Category_L1_L2", (String)object2);
        object2 = FirebaseEvents.Companion.getInstance();
        charSequence = "navigation_used";
        ((FirebaseEvents)object2).sendEvent((String)charSequence, (Bundle)object);
        object = od1_22.a;
        if (object != null) {
            object.f(cMSNavigation);
        }
    }
}

