/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Facet;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SF1
 */
public final class sf1_0
extends mz2_0 {
    public static final /* synthetic */ int f;

    public final void Ra(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.facet_value_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        Object object2 = this.requireActivity();
        int n4 = 1;
        ImmutableList immutableList = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.Qa();
        n3 = 0;
        object2 = null;
        object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getValues() : null;
        if (object != null && (object = this.c) != null) {
            IF1 iF1;
            Object object3 = this.Qa();
            if (object3 != null) {
                object3 = ((F12)object3).d;
            } else {
                n4 = 0;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            object3 = ((bv2_0)object3).X;
            if (object3 != null) {
                object2 = ((Facet)object3).getValues();
            }
            Intrinsics.checkNotNull(object2);
            immutableList = ImmutableList.copyOf((Collection)object2);
            Intrinsics.checkNotNullExpressionValue(immutableList, "copyOf(...)");
            object2 = this.Qa();
            Intrinsics.checkNotNull(object2);
            HashMap hashMap = ((F12)object2).d.R;
            object2 = this.Qa();
            Intrinsics.checkNotNull(object2);
            HashMap hashMap2 = ((F12)object2).d.S;
            object2 = this.Qa();
            Intrinsics.checkNotNull(object2);
            int n7 = ((F12)object2).d.b0;
            object2 = this.Qa();
            Intrinsics.checkNotNull(object2);
            int n8 = ((F12)object2).d.c0;
            Intrinsics.checkNotNullParameter(immutableList, "facetValueList");
            Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
            Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
            object2 = "facetValueClickListener";
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object3 = iF1;
            iF1 = new cz2_0(immutableList, hashMap, hashMap2, n7, n8, this);
            ((RecyclerView)object).setAdapter(iF1);
        }
    }

    public final void S1() {
        Object object;
        int n3;
        Object object2 = this.getContext();
        if (object2 == null) {
            return;
        }
        Context context = this.requireContext();
        int n4 = R$style.PriceRangeBottomSheetFragment;
        object2 = new BottomSheetDialog(context, n4);
        int n7 = R$layout.luxe_price_range_bottomsheet_view;
        ((BottomSheetDialog)object2).setContentView(n7);
        n7 = R$id.price_facet_cancel_layout;
        context = ((on)object2).findViewById(n7);
        n4 = R$id.price_facet_bottomsheet_min_layout;
        Object object3 = ((on)object2).findViewById(n4);
        int n8 = R$id.price_facet_bottomsheet_max_layout;
        View view = ((on)object2).findViewById(n8);
        int n10 = R$id.price_facet_bottomsheet_min_et;
        EditText editText = (EditText)((on)object2).findViewById(n10);
        int n14 = R$id.price_facet_bottomsheet_max_et;
        EditText editText2 = (EditText)((on)object2).findViewById(n14);
        int n15 = R$id.price_facet_bottomsheet_done_tv;
        TextView textView = (TextView)((on)object2).findViewById(n15);
        Object object4 = this.Qa();
        int n16 = -1;
        if (!(object4 != null && (object4 = ((F12)object4).d) != null && (n3 = ((bv2_0)object4).b0) == n16 || (object4 = this.Qa()) != null && (object4 = ((F12)object4).d) != null && (n3 = ((bv2_0)object4).c0) == n16)) {
            n3 = 0;
            object4 = null;
            if (editText != null) {
                object = this.Qa();
                if (object != null && (object = ((F12)object).d) != null) {
                    n16 = ((bv2_0)object).b0;
                    object = Integer.valueOf(n16).toString();
                } else {
                    n16 = 0;
                    object = null;
                }
                editText.setText((CharSequence)object);
            }
            if (editText2 != null) {
                object = this.Qa();
                if (object != null && (object = ((F12)object).d) != null) {
                    n3 = ((bv2_0)object).c0;
                    object4 = Integer.valueOf(n3).toString();
                }
                editText2.setText((CharSequence)object4);
            }
            if (textView != null) {
                n3 = R$color.accent_color_21;
                textView.setBackgroundResource(n3);
            }
            if (textView != null) {
                n3 = hv3_0.m(R$color.new_accent_color_31);
                textView.setTextColor(n3);
            }
        }
        object4 = new JF1((BottomSheetDialog)object2, editText, this);
        object2.setOnShowListener((DialogInterface.OnShowListener)object4);
        if (object3 != null) {
            n16 = 0;
            object = null;
            object4 = new KF1(editText, 0);
            object3.setOnClickListener((View.OnClickListener)object4);
        }
        if (view != null) {
            object4 = new LF1(editText2);
            view.setOnClickListener((View.OnClickListener)object4);
        }
        if (editText != null) {
            object4 = new MF1((View)object3);
            editText.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if (editText2 != null) {
            object3 = new NF1(view);
            editText2.setOnFocusChangeListener((View.OnFocusChangeListener)object3);
        }
        if (editText != null) {
            object3 = new OF1(editText, editText2);
            editText.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        }
        if (editText2 != null) {
            object3 = new PF1(editText2, textView);
            editText2.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        }
        if (editText != null) {
            object3 = new SF1$a(editText2, editText, textView);
            editText.addTextChangedListener((TextWatcher)object3);
        }
        if (editText2 != null) {
            object3 = new SF1$b(editText, editText2, textView);
            editText2.addTextChangedListener((TextWatcher)object3);
        }
        if (textView != null) {
            object3 = new QF1(editText, editText2, this, (BottomSheetDialog)object2);
            textView.setOnClickListener((View.OnClickListener)object3);
        }
        if (context != null) {
            n8 = 0;
            view = null;
            object3 = new RF1(object2, 0);
            context.setOnClickListener((View.OnClickListener)object3);
        }
        object2.show();
    }
}

