/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity$b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public final class p40
implements o60_0 {
    public final /* synthetic */ ConfigEditActivity a;
    public final /* synthetic */ ConfigEditActivity$b b;

    public /* synthetic */ p40(ConfigEditActivity configEditActivity, ConfigEditActivity$b configEditActivity$b) {
        this.a = configEditActivity;
        this.b = configEditActivity$b;
    }

    public final void accept(Object object) {
        boolean bl2;
        object = (HashMap)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        ConfigEditActivity$b configEditActivity$b = this.b;
        Intrinsics.checkNotNullParameter(configEditActivity$b, "this$1");
        Intrinsics.checkNotNull(object);
        Object object3 = object.entrySet().iterator();
        while (bl2 = object3.hasNext()) {
            Object object4 = object3.next();
            yn3$a yn3$a = yn3_0.a;
            Object object5 = object4.getKey();
            object4 = object4.getValue();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object5);
            stringBuilder.append("   ");
            stringBuilder.append(object4);
            object4 = stringBuilder.toString();
            object5 = new Object[]{};
            yn3$a.a((String)object4, object5);
        }
        object3 = ((ConfigEditActivity)object2).Z;
        ((HashMap)object3).putAll(object);
        object2 = ((ConfigEditActivity)object2).Y;
        if (object2 != null) {
            object = ((HashMap)object).values();
            Intrinsics.checkNotNullExpressionValue(object, "<get-values>(...)");
            Intrinsics.checkNotNullParameter(object, "updatedList");
            object3 = ((i40)object2).c;
            ((ArrayList)object3).clear();
            ((ArrayList)object3).addAll(object);
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
        if ((object = configEditActivity$b.a) != null) {
            gr0_2.dispose((AtomicReference)object);
        }
    }
}

