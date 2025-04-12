/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.remoteconfig.R$color;
import com.ril.ajio.remoteconfig.R$layout;
import com.ril.ajio.remoteconfig.devsettings.Data;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class i40
extends RecyclerView$f {
    public final LayoutInflater a;
    public final sk1_0 b;
    public final ArrayList c;
    public String d;

    public i40(LayoutInflater object, sk1_0 sk1_02) {
        Intrinsics.checkNotNullParameter(object, "layoutInflater");
        Intrinsics.checkNotNullParameter(sk1_02, "itemClickListener");
        this.a = object;
        this.b = sk1_02;
        this.d = "";
        this.c = object;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (J40)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "configVH");
        Object object = (Data)this.c.get(n3);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object, "data");
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        ((J40)recyclerView$B).f = object;
        CharSequence charSequence = ((Data)object).a;
        Intrinsics.checkNotNull(charSequence);
        CharSequence charSequence2 = ((J40)recyclerView$B).c;
        charSequence = J40.w(charSequence, charSequence2);
        ((J40)recyclerView$B).d.setText(charSequence);
        charSequence = ((Data)object).b;
        Intrinsics.checkNotNull(charSequence);
        charSequence2 = J40.w(charSequence, charSequence2);
        TextView textView = ((J40)recyclerView$B).e;
        textView.setText(charSequence2);
        object = ((Data)object).c;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        n3 = !bl2 && (n3 = (int)(TextUtils.equals((CharSequence)object, (CharSequence)charSequence) ? 1 : 0)) == 0 ? R$color.edited_config : R$color.white;
        charSequence = ((J40)recyclerView$B).a;
        n3 = t70.getColor(charSequence.getContext(), n3);
        charSequence.setBackgroundColor(n3);
        charSequence.setOnClickListener((View.OnClickListener)recyclerView$B);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        int n4 = R$layout.list_item;
        viewGroup = this.a.inflate(n4, null);
        Intrinsics.checkNotNull(viewGroup);
        sk1_0 sk1_02 = this.b;
        String string2 = this.d;
        J40 j40 = new J40((View)viewGroup, sk1_02, string2);
        return j40;
    }
}

