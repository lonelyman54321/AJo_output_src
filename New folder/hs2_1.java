/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Payment.BannerInfo;
import java.util.List;

/*
 * Renamed from hs2
 */
public final class hs2_1
extends RecyclerView$f {
    public LayoutInflater a;
    public List b;
    public es2_2 c;

    public final int getItemCount() {
        return this.b.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (hs2$a_0)recyclerView$B;
        Object object = (BannerInfo)this.b.get(n3);
        Object object2 = ((BannerInfo)object).getDescription();
        Object object3 = ((BannerInfo)object).getTncUrl();
        int n4 = TextUtils.isEmpty((CharSequence)object3);
        if (n4 == 0) {
            object3 = Ft2.a((String)object2, " T&C");
            CharSequence charSequence = nn_2.a((String)object2, ", ");
            int n7 = R$string.acc_terms_and_condition;
            String string2 = hv3_0.K(n7);
            charSequence.append(string2);
            charSequence = charSequence.toString();
            string2 = new SpannableString((CharSequence)object3);
            int n8 = hv3_0.m(R$color.pesdk_color_3);
            Object object4 = new ForegroundColorSpan(n8);
            n8 = ((String)object2).length();
            int n10 = ((String)object3).length();
            string2.setSpan(object4, n8, n10, 0);
            object4 = FontsManager.getInstance();
            AJIOApplication.Companion.getClass();
            Object object5 = AJIOApplication$a.a();
            object4 = object4.getTypefaceWithFont((Context)object5, 10);
            String string3 = "";
            object5 = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
            int n14 = ((String)object2).length();
            n10 = ((String)object3).length();
            int n15 = 34;
            string2.setSpan(object5, n14, n10, n15);
            object4 = new fs2_1(this, (BannerInfo)object);
            int n16 = ((String)object2).length();
            n4 = ((String)object3).length();
            n8 = 33;
            string2.setSpan(object4, n16, n4, n8);
            object2 = ((hs2$a_0)recyclerView$B).b;
            object3 = LinkMovementMethod.getInstance();
            object2.setMovementMethod((MovementMethod)object3);
            object2 = ((hs2$a_0)recyclerView$B).b;
            object2.setText((CharSequence)string2);
            object2.setContentDescription(charSequence);
            object3 = cp_1.Companion;
            n4 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
            if (n4 != 0) {
                object3 = new gs2_2(this, (BannerInfo)object);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
        } else {
            object3 = ((hs2$a_0)recyclerView$B).b;
            object3.setText((CharSequence)object2);
        }
        object2 = new da$a();
        ((da$a)object2).k = n4 = 1;
        ((da$a)object2).g = n4;
        object = ((BannerInfo)object).getLogo();
        recyclerView$B = ((hs2$a_0)recyclerView$B).a;
        ((da$a)object2).n = object;
        ((da$a)object2).u = recyclerView$B;
        ((da$a)object2).a();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        n3 = (int)(og1_1.b() ? 1 : 0);
        LayoutInflater layoutInflater = this.a;
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_list_row_offer;
            viewGroup = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_list_row_offer;
            viewGroup = layoutInflater.inflate(n3, viewGroup, false);
        }
        hs2$a_0 hs2$a_0 = new hs2$a_0((View)viewGroup);
        return hs2$a_0;
    }
}

