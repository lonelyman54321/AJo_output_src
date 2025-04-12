/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from AE
 */
public final class ae_2
extends RecyclerView$f {
    public final List a;
    public final ye_0 b;
    public final String c;

    public /* synthetic */ ae_2(List list, ye_0 ye_02) {
        this(list, ye_02, "");
    }

    public ae_2(List list, ye_0 ye_02, String string2) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter((Object)ye_02, "fragmentName");
        Intrinsics.checkNotNullParameter(string2, "returnId");
        this.a = list;
        this.b = ye_02;
        this.c = string2;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        object = (AE$a)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = ((AE$a)object).b;
        Object object3 = this.a;
        Object object4 = ((ro1_0)object3.get((int)n3)).a;
        object2.setText((CharSequence)object4);
        object2 = ((ro1_0)object3.get((int)n3)).b;
        object4 = ((AE$a)object).c;
        object4.setText((CharSequence)object2);
        object2 = AE$b.$EnumSwitchMapping$0;
        ye_0 ye_02 = this.b;
        int n4 = ye_02.ordinal();
        Object object5 = object2[n4];
        n4 = 1;
        if (object5 != n4) {
            n3 = 2;
            if (object5 == n3) {
                object5 = R$style.muli_regular_12_accent_18;
                object = ((AE$a)object).b;
                ze_2.b((AjioTextView)object, (int)object5);
                object3 = object.getResources().getDisplayMetrics();
                int n7 = 0x40000000;
                float f5 = 2.0f;
                float f6 = TypedValue.applyDimension((int)n4, (float)f5, (DisplayMetrics)object3);
                float f7 = 1.0f;
                object.setLineSpacing(f6, f7);
                ze_2.b((AjioTextView)object4, (int)object5);
                object2 = object4.getResources().getDisplayMetrics();
                float f8 = TypedValue.applyDimension((int)n4, (float)f5, (DisplayMetrics)object2);
                object4.setLineSpacing(f8, f7);
                AJIOApplication.Companion.getClass();
                object2 = AJIOApplication$a.a();
                object = object.getLayoutParams();
                object3 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                Intrinsics.checkNotNull(object, (String)object3);
                object = (ConstraintLayout$LayoutParams)((Object)object);
                ((ViewGroup.MarginLayoutParams)object).topMargin = n4 = ai0_2.e(n3, (Context)object2);
                object = object4.getLayoutParams();
                Intrinsics.checkNotNull(object, (String)object3);
                object = (ConstraintLayout$LayoutParams)((Object)object);
                ((ViewGroup.MarginLayoutParams)object).topMargin = n3 = ai0_2.e(n3, (Context)object2);
            }
        } else {
            object = ((ro1_0)object3.get((int)n3)).b;
            object2 = this.c;
            n4 = 0;
            ye_02 = null;
            boolean bl2 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
            if (bl2) {
                Object object6 = ((ro1_0)object3.get((int)n3)).b;
                object = new SpannableString((CharSequence)object6);
                object6 = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                object3 = AJIOApplication$a.a();
                object6 = ((FontsManager)object6).getTypefaceWithFont((Context)object3, 10);
                Intrinsics.checkNotNullExpressionValue(object6, "getTypefaceWithFont(...)");
                String string2 = "";
                object3 = new AjioCustomTypefaceSpan(string2, (Typeface)object6);
                object6 = this.c;
                int n8 = 6;
                float f11 = 8.4E-45f;
                n3 = StringsKt.O((CharSequence)object, (String)object6, 0, false, n8);
                String string3 = this.c;
                n4 = StringsKt.O((CharSequence)object, string3, 0, false, n8);
                object5 = ((String)object2).length() + n4;
                n4 = 33;
                object.setSpan(object3, n3, (int)object5, n4);
                object4.setText((CharSequence)object);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_bulleted_list;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new AE$a((View)viewGroup);
        return object;
    }
}

