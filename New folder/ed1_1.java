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
import com.ril.ajio.services.data.Home.LinkDetail;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ED1
 */
public final class ed1_1
implements View.OnClickListener {
    public final /* synthetic */ LinkDetail a;
    public final /* synthetic */ fd1_1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ed1_1(LinkDetail linkDetail, fd1_1 fd1_12, String string2) {
        this.a = linkDetail;
        this.b = fd1_12;
        this.c = string2;
    }

    public final void onClick(View object) {
        LinkDetail linkDetail = this.a;
        Intrinsics.checkNotNullParameter(linkDetail, "$linkDetail");
        fd1_1 fd1_12 = this.b;
        Intrinsics.checkNotNullParameter((Object)fd1_12, "this$0");
        object = new Bundle();
        Object object2 = linkDetail.getLinkName();
        object.putString("category_name", (String)object2);
        object2 = fd1_12.d;
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
        object = fd1_12.a;
        if (object != null) {
            object.i(linkDetail);
        }
    }
}

