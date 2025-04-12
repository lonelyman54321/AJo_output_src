/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.ArrayList;

/*
 * Renamed from pI
 */
public final class pi_2
extends RecyclerView$f {
    public CTInboxListViewFragment a;
    public ArrayList b;

    public final int getItemCount() {
        return this.b.size();
    }

    public final int getItemViewType(int n3) {
        int[] nArray = pI$a.a;
        ArrayList arrayList = this.b;
        qi_1 qi_12 = ((CTInboxMessage)arrayList.get((int)n3)).p;
        n3 = qi_12.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    n7 = 4;
                    if (n3 != n7) {
                        return -1;
                    }
                    return n4;
                }
                return n7;
            }
            return n4;
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        CTInboxMessage cTInboxMessage = (CTInboxMessage)this.b.get(n3);
        recyclerView$B = (CTInboxBaseMessageViewHolder)recyclerView$B;
        CTInboxListViewFragment cTInboxListViewFragment = this.a;
        ((CTInboxBaseMessageViewHolder)recyclerView$B).x(cTInboxMessage, cTInboxListViewFragment, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        void var4_7;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    n4 = R$layout.inbox_carousel_layout;
                    viewGroup = layoutInflater.inflate(n4, viewGroup, false);
                    eh_1 eh_12 = new eh_1((View)viewGroup);
                    return var4_7;
                }
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.inbox_carousel_text_layout;
                viewGroup = layoutInflater.inflate(n4, viewGroup, false);
                fh_1 fh_12 = new fh_1((View)viewGroup);
                return var4_7;
            }
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.inbox_icon_message_layout;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            ph_1 ph_12 = new ph_1((View)viewGroup);
            return var4_7;
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n7 = R$layout.inbox_simple_message_layout;
        viewGroup = layoutInflater.inflate(n7, viewGroup, false);
        ei_2 ei_22 = new ei_2((View)viewGroup);
        return var4_7;
    }
}

