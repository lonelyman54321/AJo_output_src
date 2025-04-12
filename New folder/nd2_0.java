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
import com.ril.ajio.R$attr;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.ratings.ResponseOption;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ND2
 */
public final class nd2_0
extends RecyclerView$f {
    public final ArrayList a;
    public int b;
    public kl2_0 c;
    public int d;
    public final String e;

    public nd2_0(ArrayList arrayList, String string2) {
        int n3;
        this.a = arrayList;
        this.b = n3 = -1;
        this.d = n3;
        this.e = string2;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof ND2$a;
        if (bl2) {
            ResponseOption responseOption;
            object = this.a;
            if (object != null) {
                responseOption = (ResponseOption)((ArrayList)object).get(n3);
            } else {
                n3 = 0;
                responseOption = null;
            }
            recyclerView$B = (ND2$a)recyclerView$B;
            recyclerView$B.getClass();
            if (responseOption != null && (object = responseOption.getText()) != null) {
                String string2;
                int n4;
                String string3;
                Comparable<StringBuilder> comparable;
                Object object2 = Locale.ROOT;
                object = ((String)object).toLowerCase((Locale)object2);
                Object object3 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                int n7 = ((String)object).length();
                if (n7 > 0) {
                    String string4;
                    comparable = new StringBuilder();
                    char c2 = '\u0000';
                    string3 = null;
                    n4 = ((String)object).charAt(0);
                    boolean bl3 = Character.isLowerCase((char)n4);
                    String string5 = "substring(...)";
                    int n8 = 1;
                    if (bl3) {
                        string4 = String.valueOf((char)n4);
                        String string6 = "null cannot be cast to non-null type java.lang.String";
                        Intrinsics.checkNotNull(string4, string6);
                        string4 = string4.toUpperCase((Locale)object2);
                        String string7 = "toUpperCase(...)";
                        Intrinsics.checkNotNullExpressionValue(string4, string7);
                        int n10 = string4.length();
                        if (n10 > n8) {
                            n10 = 329;
                            if (n4 != n10) {
                                c2 = string4.charAt(0);
                                Intrinsics.checkNotNull(string4, string6);
                                string2 = string4.substring(n8);
                                Intrinsics.checkNotNullExpressionValue(string2, string5);
                                Intrinsics.checkNotNull(string2, string6);
                                object2 = string2.toLowerCase((Locale)object2);
                                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append(c2);
                                ((StringBuilder)object3).append((String)object2);
                                string4 = ((StringBuilder)object3).toString();
                            }
                        } else {
                            char c3 = Character.toTitleCase((char)n4);
                            string4 = String.valueOf(c3);
                        }
                    } else {
                        string4 = String.valueOf((char)n4);
                    }
                    comparable.append(string4);
                    object = ((String)object).substring(n8);
                    Intrinsics.checkNotNullExpressionValue(object, string5);
                    comparable.append((String)object);
                    object = comparable.toString();
                }
                object2 = ((ND2$a)recyclerView$B).a;
                object2.setText((CharSequence)object);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(" for ");
                object = this.e;
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
                object2.setContentDescription((CharSequence)object);
                object = ((ND2$a)recyclerView$B).b;
                int n14 = ((nd2_0)object).b;
                n7 = recyclerView$B.getAdapterPosition();
                string3 = "getContext(...)";
                if (n14 == n7) {
                    object3 = ((nd2_0)object).c;
                    if (object3 != null) {
                        comparable = responseOption.getId();
                        string2 = responseOption.getText();
                        object3.a((Integer)comparable, string2);
                    }
                    object3 = recyclerView$B.itemView.getContext();
                    comparable = object2.getContext();
                    Intrinsics.checkNotNullExpressionValue(comparable, string3);
                    n4 = R$attr.ratings_response_select_text_color;
                    n7 = tm3_0.b(n4, (Context)comparable);
                    n14 = t70.getColor((Context)object3, n7);
                    object2.setTextColor(n14);
                    object3 = object2.getContext();
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    n7 = R$attr.ratings_response_select_bg;
                    n14 = tm3_0.b(n7, (Context)object3);
                    object2.setBackgroundResource(n14);
                } else {
                    object3 = recyclerView$B.itemView.getContext();
                    comparable = object2.getContext();
                    Intrinsics.checkNotNullExpressionValue(comparable, string3);
                    n4 = R$attr.ratings_response_unselect_text_color;
                    n7 = tm3_0.b(n4, (Context)comparable);
                    n14 = t70.getColor((Context)object3, n7);
                    object2.setTextColor(n14);
                    object3 = object2.getContext();
                    Intrinsics.checkNotNullExpressionValue(object3, string3);
                    n7 = R$attr.ratings_response_unselect_bg;
                    n14 = tm3_0.b(n7, (Context)object3);
                    object2.setBackgroundResource(n14);
                }
                object3 = new MD2((ND2$a)recyclerView$B, (nd2_0)object, responseOption);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.item_question;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        ND2$a nD2$a = new ND2$a(this, (View)viewGroup);
        return nD2$a;
    }
}

