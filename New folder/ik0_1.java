/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.data.model.FeedbackData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from IK0
 */
public final class ik0_1
extends RecyclerView$f {
    public static final IK0$a Companion;
    public Context a;
    public FeedbackData b;
    public qk0_1 c;
    public boolean d;
    public boolean e;

    static {
        IK0$a iK0$a;
        Companion = iK0$a = new Object();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int getItemCount() {
        int n3 = this.e;
        FeedbackData feedbackData = this.b;
        int n4 = this.d;
        if (n4 != 0 && n3 != 0) {
            ArrayList arrayList = feedbackData.getCategories();
            n3 = arrayList.isEmpty();
            n4 = 2;
            if (n3 != 0) {
                return n4;
            }
            arrayList = feedbackData.getCategories();
            n3 = arrayList.size();
            return n4 += n3;
        }
        if (n3 != 0 && n4 == 0) {
            ArrayList arrayList = feedbackData.getCategories();
            n3 = arrayList.isEmpty();
            if (n3 != 0) return 1;
            arrayList = feedbackData.getCategories();
            n3 = arrayList.size();
            return n3 + 1;
        }
        if (n4 != 0 && n3 == 0) {
            ArrayList arrayList = feedbackData.getCategories();
            n3 = arrayList.isEmpty();
            if (n3 != 0) {
                return 1;
            }
            arrayList = feedbackData.getCategories();
            n3 = arrayList.size();
            return n3 + 1;
        }
        ArrayList arrayList = feedbackData.getCategories();
        return arrayList.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getItemViewType(int n3) {
        if (n3 == 0) {
            return 0;
        }
        Object object = this.b;
        ArrayList arrayList = ((FeedbackData)object).getCategories();
        int n4 = arrayList.size();
        if (n3 <= n4) {
            return 1;
        }
        int n7 = ((ArrayList)(object = ((FeedbackData)object).getCategories())).size();
        if (n3 <= n7) return 1;
        return 2;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = this.getItemViewType(n3);
        Object object3 = this.b;
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                n3 = 2;
                if (n4 == n3) {
                    object = (kk0_1)object;
                    Object object4 = ((FeedbackData)object3).getFooterData();
                    object.getClass();
                    Intrinsics.checkNotNullParameter(object4, "footerData");
                    object2 = new SpannableString((CharSequence)object4);
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                    if (n3 == 0) {
                        object4 = new jk0_1((kk0_1)object);
                        object3 = hv3_0.K(R$string.customore_care);
                        int n8 = 6;
                        int n10 = StringsKt.O((CharSequence)object2, (String)object3, 0, false, n8);
                        int n14 = object2.length();
                        object2.setSpan(object4, n10, n14, 33);
                        n10 = hv3_0.m(R$color.accent_color_4);
                        object4 = new ForegroundColorSpan(n10);
                        object3 = hv3_0.K(R$string.customore_care);
                        n10 = StringsKt.O((CharSequence)object2, (String)object3, 0, false, n8);
                        n14 = object2.length();
                        int n15 = 18;
                        object2.setSpan(object4, n10, n14, n15);
                        object4 = new StyleSpan(n7);
                        object3 = hv3_0.K(R$string.customore_care);
                        n10 = StringsKt.O((CharSequence)object2, (String)object3, 0, false, n8);
                        n7 = object2.length();
                        object2.setSpan(object4, n10, n7, n15);
                        object = ((kk0_1)object).b;
                        object.setText((CharSequence)object2);
                        object4 = LinkMovementMethod.getInstance();
                        object.setMovementMethod((MovementMethod)object4);
                    }
                }
            } else {
                object = (mk0_1)object;
                object2 = ((FeedbackData)object3).getCategories();
                Object object5 = ((ArrayList)object2).get(n3 -= n7);
                Intrinsics.checkNotNullExpressionValue(object5, "get(...)");
                object5 = (String)object5;
                object.getClass();
                object2 = "feedbackCategory";
                Intrinsics.checkNotNullParameter(object5, (String)object2);
                ((mk0_1)object).c = object5;
                object = ((mk0_1)object).b;
                object.setText(object5);
            }
        } else {
            object = (lk0_1)object;
            String string2 = ((FeedbackData)object3).getHeaderData();
            object.getClass();
            object2 = "headerData";
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            object = ((lk0_1)object).a;
            object.setText((CharSequence)string2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (n3 != 0) {
            int n4 = 2;
            qk0_1 qk0_12 = this.c;
            if (n3 != n4) {
                Object object = LayoutInflater.from((Context)this.a);
                n4 = R$layout.new_row_feedback_categories_list;
                viewGroup = object.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
                object = new mk0_1((View)viewGroup, qk0_12);
                return object;
            }
            Object object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.new_feedback_categories_list_footer;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = new kk0_1((View)viewGroup, qk0_12);
            return object;
        }
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n7 = R$layout.new_feedback_categories_list_header;
        viewGroup = object.inflate(n7, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new lk0_1((View)viewGroup);
        return object;
    }
}

