/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ia2
 */
public final class ia2_1
extends RecyclerView$B
implements View.OnClickListener {
    public final r82_0 a;
    public final String b;
    public final String c;
    public final View d;

    public ia2_1(View view, r82_0 r82_02, String string2, String string3) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = r82_02;
        this.b = string2;
        this.c = string3;
        int n3 = R$id.row_component_order_footer;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        this.d = view;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getTag();
        boolean bl2 = object instanceof hp1_2;
        if (bl2 && (object2 = this.a) != null) {
            object = (hp1_2)object;
            Object object3 = object.g;
            boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl3) {
                object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                String string2 = object.g;
                String string3 = "landing screen";
                String string4 = "Card on Home Page";
                ((GTMEvents)object3).pushButtonTapEvent(string4, string2, string3);
            }
            object2.La((hp1_2)object);
        }
    }
}

