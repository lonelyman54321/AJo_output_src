/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mz2
 */
public class mz2_0
extends sm3_0
implements dz2 {
    public static final mz2$a Companion;
    public final hh3_2 b;
    public RecyclerView c;
    public j3_0 d;
    public zm0_0 e;

    static {
        mz2$a mz2$a;
        Companion = mz2$a = new Object();
    }

    public mz2_0() {
        Object object = new ky1_1(this, 1);
        this.b = object = yr1_2.b((Function0)object);
    }

    public final void A3() {
        F12 f12;
        Object object = this.Qa();
        int n3 = -1;
        if (object != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).b0 = n3;
        }
        if ((object = this.Qa()) != null && (object = ((F12)object).d) != null) {
            ((bv2_0)object).c0 = n3;
        }
        if ((object = this.Qa()) != null && (object = ((F12)object).d) != null) {
            n3 = 1;
            ((bv2_0)object).g0 = n3;
        }
        if ((object = this.d) != null) {
            object.startLoader();
        }
        if ((f12 = this.Qa()) != null) {
            object = this.Qa();
            object = object != null && (object = ((F12)object).d) != null ? ((bv2_0)object).N : null;
            Intrinsics.checkNotNull(object);
            boolean bl2 = true;
            int n4 = 28;
            F12.j(f12, (ProductsList)object, bl2, null, null, null, n4);
        }
    }

    public final int Pa() {
        int n3 = this.a;
        n3 = n3 != 0 ? R$color.plp_bg : R$color.accent_color_12;
        return n3;
    }

    public final F12 Qa() {
        return (F12)this.b.getValue();
    }

    public void Ra(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.facet_value_rv;
        Object object2 = (RecyclerView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.root_view;
        object = (ConstraintLayout)object.findViewById(n3);
        if (object != null) {
            object2 = new Object();
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object2 = this.requireActivity();
        int n4 = 1;
        HashMap hashMap = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.Qa();
        n3 = 0;
        object2 = null;
        if ((object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getValues() : null) != null) {
            object = this.Qa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.X;
            if (object != null) {
                object2 = ((Facet)object).getValues();
            }
            Intrinsics.checkNotNull(object2);
            object = ImmutableList.copyOf((Collection)object2);
            Intrinsics.checkNotNull(object);
            ImmutableList immutableList = ImmutableList.copyOf((Collection)mz3_0.a(mz3_0.v((ImmutableList)object)));
            object = this.c;
            if (object != null) {
                cz2_0 cz2_02;
                Intrinsics.checkNotNull(immutableList);
                object2 = this.Qa();
                Intrinsics.checkNotNull(object2);
                hashMap = ((F12)object2).d.R;
                object2 = this.Qa();
                Intrinsics.checkNotNull(object2);
                HashMap hashMap2 = ((F12)object2).d.S;
                object2 = this.Qa();
                Intrinsics.checkNotNull(object2);
                int n7 = ((F12)object2).d.b0;
                object2 = this.Qa();
                Intrinsics.checkNotNull(object2);
                int n8 = ((F12)object2).d.c0;
                object2 = cz2_02;
                cz2_02 = new cz2_0(immutableList, hashMap, hashMap2, n7, n8, this);
                ((RecyclerView)object).setAdapter(cz2_02);
            }
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            n4 = 2;
            object2 = new P5(this, n4);
            long l2 = 1000L;
            object.postDelayed((Runnable)object2, l2);
        }
    }

    public void S1() {
        int n3;
        Object object = this.getContext();
        if (object == null) {
            return;
        }
        Context context = this.requireContext();
        int n4 = this.a;
        n4 = n4 != 0 ? R$style.FleekPriceRangeBottomSheetFragment : R$style.PriceRangeBottomSheetFragment;
        object = new BottomSheetDialog(context, n4);
        int n7 = R$layout.price_facet_value_range_bottomsheet_view;
        ((BottomSheetDialog)object).setContentView(n7);
        n7 = R$id.price_facet_cancel_layout;
        context = ((on)object).findViewById(n7);
        n4 = R$id.price_facet_bottomsheet_min_et;
        Object object2 = (EditText)((on)object).findViewById(n4);
        int n8 = R$id.price_facet_bottomsheet_max_et;
        EditText editText = (EditText)((on)object).findViewById(n8);
        int n10 = R$id.price_facet_bottomsheet_done_tv;
        TextView textView = (TextView)((on)object).findViewById(n10);
        Object object3 = this.Qa();
        int n14 = -1;
        if (!(object3 != null && (object3 = ((F12)object3).d) != null && (n3 = ((bv2_0)object3).b0) == n14 || (object3 = this.Qa()) != null && (object3 = ((F12)object3).d) != null && (n3 = ((bv2_0)object3).c0) == n14)) {
            Object object4;
            n3 = 0;
            object3 = null;
            if (object2 != null) {
                object4 = this.Qa();
                if (object4 != null && (object4 = ((F12)object4).d) != null) {
                    n14 = ((bv2_0)object4).b0;
                    object4 = Integer.valueOf(n14).toString();
                } else {
                    n14 = 0;
                    object4 = null;
                }
                object2.setText((CharSequence)object4);
            }
            if (editText != null) {
                object4 = this.Qa();
                if (object4 != null && (object4 = ((F12)object4).d) != null) {
                    n3 = ((bv2_0)object4).c0;
                    object3 = Integer.valueOf(n3).toString();
                }
                editText.setText((CharSequence)object3);
            }
            if (textView != null) {
                n3 = R$drawable.facet_rounded_rect_black;
                textView.setBackgroundResource(n3);
            }
            if (textView != null) {
                n3 = hv3_0.m(R$color.accent_color_11);
                textView.setTextColor(n3);
            }
        }
        object3 = new fz2_0((BottomSheetDialog)object, (EditText)object2, this);
        object.setOnShowListener((DialogInterface.OnShowListener)object3);
        if (object2 != null) {
            object3 = new gz2_1((EditText)object2);
            object2.setOnFocusChangeListener((View.OnFocusChangeListener)object3);
        }
        if (editText != null) {
            object3 = new hz2_1(editText);
            editText.setOnFocusChangeListener((View.OnFocusChangeListener)object3);
        }
        if (object2 != null) {
            object3 = new iz2_1((EditText)object2, editText);
            object2.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        }
        if (editText != null) {
            object3 = new jz2_0(editText, textView);
            editText.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        }
        if (object2 != null) {
            object3 = new mz2$b(editText, (EditText)object2, textView, this);
            object2.addTextChangedListener((TextWatcher)object3);
        }
        if (editText != null) {
            object3 = new mz2$c((EditText)object2, editText, textView, this);
            editText.addTextChangedListener((TextWatcher)object3);
        }
        if (textView != null) {
            object3 = new kz2((EditText)object2, editText, this, (BottomSheetDialog)object);
            textView.setOnClickListener((View.OnClickListener)object3);
        }
        if (context != null) {
            object2 = new lz2((BottomSheetDialog)object);
            context.setOnClickListener((View.OnClickListener)object2);
        }
        object.show();
    }

    public final void Y5(FacetValue object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "facetValue");
        Object object2 = this.Qa();
        if (object2 != null) {
            object2 = this.Qa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.X;
            object2 = object2 != null ? ((Facet)object2).getCode() : null;
            ((FacetValue)object).setFacetCode((String)object2);
            object2 = this.Qa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.R;
            Object object3 = this.Qa();
            Intrinsics.checkNotNull(object3);
            object3 = ((F12)object3).d.S;
            if (bl2) {
                String string2 = ((FacetValue)object).getCode();
                if (string2 != null) {
                    boolean bl3 = ((FacetValue)object).getSelected();
                    if (!bl3) {
                        string2 = ((FacetValue)object).getCode();
                        Intrinsics.checkNotNull(string2);
                        ((HashMap)object2).put(string2, object);
                    }
                    object2 = ((FacetValue)object).getCode();
                    Intrinsics.checkNotNull(object2);
                    ((HashMap)object3).remove(object2);
                }
            } else {
                String string3 = ((FacetValue)object).getCode();
                if (string3 != null) {
                    boolean bl4 = ((FacetValue)object).getSelected();
                    if (bl4) {
                        string3 = ((FacetValue)object).getCode();
                        Intrinsics.checkNotNull(string3);
                        ((HashMap)object3).put(string3, object);
                    }
                    object3 = ((FacetValue)object).getCode();
                    Intrinsics.checkNotNull(object3);
                    ((HashMap)object2).remove(object3);
                }
            }
        }
        if ((object2 = this.e) != null) {
            object = ((FacetValue)object).getFacetCode();
            object2.B4((String)object, bl2);
        }
    }

    public final void onAttach(Context object) {
        boolean bl2;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl3 = object instanceof j3_0;
        if (bl3) {
            object = (j3_0)object;
            this.d = object;
        }
        if (bl2 = (object = this.getParentFragment()) instanceof zm0_0) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FilterParentFragmentListener";
            Intrinsics.checkNotNull(object, string2);
            object = (zm0_0)object;
            this.e = object;
        }
    }

    public final void onCreate(Bundle object) {
        String string2;
        int n3;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null && (n3 = (object = this.requireArguments()).containsKey(string2 = "PLP_TYPE")) != 0) {
            int n4;
            int n7;
            object = this.getArguments();
            if (object != null) {
                n3 = object.getInt(string2);
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n7 = ((Integer)object).intValue()) == (n4 = 101)) {
                object = ld3_2.STORE_LUXE.getStoreId();
                this.Oa((String)object);
            } else if (object != null && (n3 = ((Integer)object).intValue()) == (n7 = 103)) {
                object = ld3_2.STORE_AJIOGRAM.getStoreId();
                this.Oa((String)object);
            } else {
                object = ld3_2.STORE_AJIO.getStoreId();
                this.Oa((String)object);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.facet_value_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.Ra(view);
    }
}

