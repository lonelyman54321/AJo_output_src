/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G23
 */
public final class g23_0
extends RecyclerView$f {
    public final List a;
    public final e23_0 b;
    public String c;

    public g23_0(List list, e23_0 e23_02) {
        Intrinsics.checkNotNullParameter(list, "sharedWithMe");
        Intrinsics.checkNotNullParameter(e23_02, "sharedWithMeItemClickListener");
        this.a = list;
        this.b = e23_02;
        this.c = "";
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        Collection collection = list;
        collection = list;
        boolean bl2 = collection.isEmpty() ^ true;
        if (bl2) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof F23;
        if (bl2) {
            String string2;
            recyclerView$B = (F23)recyclerView$B;
            Object object2 = ((SharedWithMe)this.a.get(n3)).getShareProductExperience();
            Intrinsics.checkNotNull(object2);
            object = this.c;
            recyclerView$B.getClass();
            Intrinsics.checkNotNullParameter(object2, "sharedWithMe");
            Intrinsics.checkNotNullParameter(object, "uuid");
            int n4 = ((ShareProductExperience)object2).getId();
            Object object3 = n4;
            Object object4 = ((F23)recyclerView$B).a;
            object4.setTag(object3);
            object3 = ((F23)recyclerView$B).f;
            object4.setOnClickListener((View.OnClickListener)object3);
            int n7 = ((String)object).length();
            Object[] objectArray = ((F23)recyclerView$B).c;
            if (n7 == 0 || !(bl2 = Intrinsics.areEqual(object, object4 = ((ShareProductExperience)object2).getSenderId()))) {
                object = ai0_2.f(((ShareProductExperience)object2).getDSender());
                string2 = "Shared by ";
                object4 = new StringBuilder(string2);
                ((StringBuilder)object4).append((String)object);
                object = ((StringBuilder)object4).toString();
                objectArray.setText((CharSequence)object);
            } else {
                object = "Shared by Me";
                objectArray.setText((CharSequence)object);
            }
            object = yn3_0.a;
            object4 = ((ShareProductExperience)object2).getShortLink();
            int n8 = recyclerView$B.getAdapterPosition();
            string2 = " :: ";
            object4 = LO1.a(n8, (String)object4, string2);
            n8 = 0;
            objectArray = new Object[]{};
            ((yn3$a)object).a((String)object4, objectArray);
            long l2 = ((ShareProductExperience)object2).getReceivedMillis();
            object = k7.f(l2, "dd MMM yyyy");
            object4 = ((F23)recyclerView$B).d;
            object4.setText((CharSequence)object);
            n3 = ((ShareProductExperience)object2).getId();
            object2 = n3;
            recyclerView$B = ((F23)recyclerView$B).e;
            recyclerView$B.setTag(object2);
            recyclerView$B.setOnClickListener((View.OnClickListener)object3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_shared_with_me_list_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        F23 f23 = new F23((View)viewGroup, (e23_0)object);
        return f23;
    }
}

