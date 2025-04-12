/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cP2
 */
public final class cp2_0
extends RecyclerView$B {
    public final View a;
    public final List b;
    public final n52_0 c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final TextView g;

    public cp2_0(View view, List object, n52_0 object2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "notificationsList");
        super(view);
        this.a = view;
        this.b = object;
        this.c = object2;
        int n3 = R$id.lnreTvTitle;
        object = view.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.d = object;
        n3 = R$id.lnreTvDesc;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.e = object;
        n3 = R$id.expiry_disabled_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.f = object;
        n3 = R$id.unread;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.g = object;
        object = new r7_0(this, 1);
        view.setOnClickListener((View.OnClickListener)object);
    }

    public final void w(Notifications notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        String string2 = notifications.getTitle();
        TextView textView = this.d;
        textView.setText((CharSequence)string2);
        ai0_2.B((View)textView);
        string2 = notifications.getMessage();
        textView = this.e;
        textView.setText((CharSequence)string2);
        ai0_2.B((View)textView);
        int n3 = notifications.getUnread();
        int n4 = 1;
        if (n3 == n4) {
            n3 = 0;
            notifications = null;
        } else {
            n3 = 8;
        }
        this.g.setVisibility(n3);
        ai0_2.i(this.f);
    }
}

