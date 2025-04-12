/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public class fB
extends sm3_0
implements KI0 {
    public static final fB$a Companion;
    public final hh3_2 b;
    public RecyclerView c;
    public TextView d;
    public EditText e;
    public ArrayList f;
    public zm0_0 g;

    static {
        fB$a fB$a;
        Companion = fB$a = new Object();
    }

    public fB() {
        Object object = new g8_0(this, 1);
        this.b = object = yr1_2.b((Function0)object);
    }

    public static ArrayList Ra(ArrayList arrayList) {
        FacetValue facetValue;
        Object object = arrayList;
        Intrinsics.checkNotNullParameter(arrayList, "brandFacetValueList");
        ArrayList<FacetValue> arrayList2 = new ArrayList<FacetValue>();
        bx_2.q(arrayList, (Comparator)((Object)arrayList2));
        arrayList2 = new ArrayList<FacetValue>();
        String string2 = hv3_0.K(R$string.popular_brands);
        String string3 = null;
        int n3 = 0;
        Object object2 = null;
        boolean bl2 = false;
        Object object3 = null;
        int n4 = 1;
        int n7 = 0;
        int n8 = 0;
        Object object4 = null;
        char c2 = '\u0000';
        boolean bl3 = false;
        FacetValue facetValue2 = null;
        int n10 = 8123;
        ArrayList<FacetValue> arrayList3 = facetValue;
        facetValue = new FacetValue(null, null, n4 != 0, false, 0, null, string2, null, null, null, false, false, false, n10, null);
        arrayList2.add(facetValue);
        int n14 = arrayList.size();
        int n15 = 5;
        if (n14 < n15) {
            n15 = arrayList.size();
        }
        n14 = 0;
        facetValue = null;
        object2 = null;
        for (n3 = 0; n3 < n15; ++n3) {
            object3 = ((ArrayList)object).get(n3);
            arrayList2.add((FacetValue)object3);
        }
        arrayList3 = new ArrayList<FacetValue>();
        bx_2.q((List)object, (Comparator)((Object)arrayList3));
        arrayList3 = new ArrayList<FacetValue>();
        n3 = arrayList.isEmpty() ^ '\u0001';
        if (n3 != 0) {
            object2 = ((FacetValue)((ArrayList)object).get(0)).getName();
            Intrinsics.checkNotNull(object2);
            n3 = ((String)object2).charAt(0);
            n4 = 58;
            n7 = 48;
            if (n7 <= n3 && n3 < n4) {
                n3 = 35;
            }
            string3 = String.valueOf((char)n3);
            c2 = '\u0000';
            char c3 = '\u0000';
            string2 = null;
            bl3 = true;
            object4 = facetValue2;
            object3 = facetValue2;
            facetValue2 = null;
            n10 = 0;
            int n16 = 8123;
            ((FacetValue)object4)(null, null, bl3, false, 0, null, string3, null, null, null, false, false, false, n16, null);
            arrayList3.add((FacetValue)object4);
            object = arrayList.iterator();
            object3 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            while (bl2 = object.hasNext()) {
                object3 = object.next();
                Intrinsics.checkNotNullExpressionValue(object3, "next(...)");
                object3 = (FacetValue)object3;
                object4 = ((FacetValue)object3).getName();
                Intrinsics.checkNotNull(object4);
                n8 = Character.toUpperCase(((String)object4).charAt(0));
                if (n7 <= n8 && n8 < n4) {
                    n8 = 35;
                }
                if ((c2 = Character.toLowerCase((char)n8)) != (c3 = Character.toLowerCase((char)n3))) {
                    String string4 = String.valueOf((char)n8);
                    boolean bl4 = true;
                    int n17 = 8123;
                    object2 = new FacetValue(null, null, bl4, false, 0, null, string4, null, null, null, false, false, false, n17, null);
                    arrayList3.add((FacetValue)object2);
                    n3 = n8;
                }
                arrayList3.add((FacetValue)object3);
            }
        }
        arrayList3.addAll(0, arrayList2);
        return arrayList3;
    }

    public final F12 Pa() {
        return (F12)this.b.getValue();
    }

    public void Qa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.brand_facet_value_no_result_tv;
        Object object2 = (TextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.brand_facet_value_row_search_et;
        object2 = (EditText)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.brand_facet_value_row_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        object2 = this.requireActivity();
        int n4 = 1;
        Object object3 = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.Pa();
        n3 = 0;
        object2 = null;
        if ((object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getValues() : null) != null) {
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.X;
            if (object != null) {
                object2 = ((Facet)object).getValues();
            }
            this.f = object2;
            Intrinsics.checkNotNull(object2);
            this.f = object = fB.Ra((ArrayList)object2);
            Intrinsics.checkNotNull(object);
            this.f = object = mz3_0.a((ArrayList)object);
            object2 = this.c;
            if (object2 != null) {
                object = ImmutableList.copyOf((Collection)object);
                Intrinsics.checkNotNullExpressionValue(object, "copyOf(...)");
                object3 = this.Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d.R;
                Object object4 = this.Pa();
                Intrinsics.checkNotNull(object4);
                object4 = ((F12)object4).d.S;
                za_0 za_02 = new za_0((ImmutableList)object, (HashMap)object3, (HashMap)object4, this);
                ((RecyclerView)object2).setAdapter(za_02);
            }
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            object2 = new cB(this);
            long l2 = 1000L;
            object.postDelayed((Runnable)object2, l2);
        }
    }

    public final void Y5(FacetValue object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "facetValue");
        Object object2 = this.Pa();
        if (object2 != null) {
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.X;
            object2 = object2 != null ? ((Facet)object2).getCode() : null;
            ((FacetValue)object).setFacetCode((String)object2);
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.R;
            Object object3 = this.Pa();
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
        if ((object2 = this.c) != null && (object2 = ((RecyclerView)object2).getAdapter()) != null) {
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
        if ((object2 = this.g) != null) {
            object = ((FacetValue)object).getFacetCode();
            object2.B4((String)object, bl2);
        }
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        object = this.getParentFragment();
        boolean bl2 = object instanceof zm0_0;
        if (bl2) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FilterParentFragmentListener";
            Intrinsics.checkNotNull(object, string2);
            object = (zm0_0)object;
            this.g = object;
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.brand_facet_value_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super.onViewCreated(view, (Bundle)object);
        this.Qa(view);
        view = this.e;
        if (view != null) {
            object = new fB$b(this);
            view.addTextChangedListener((TextWatcher)object);
        }
        if ((view = this.e) != null) {
            object = new aB(this);
            view.setOnEditorActionListener((TextView.OnEditorActionListener)object);
        }
        if ((view = this.e) != null) {
            object = new bB(this);
            view.setOnFocusChangeListener((View.OnFocusChangeListener)object);
        }
    }
}

