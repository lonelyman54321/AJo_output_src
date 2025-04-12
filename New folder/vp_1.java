/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
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
import android.os.Bundle;
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
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VP
 */
public class vp_1
extends sm3_0
implements KI0 {
    public static final VP$a Companion;
    public View b;
    public EditText c;
    public View d;
    public TextView e;
    public RecyclerView f;
    public TextView g;
    public zm0_0 h;
    public final hh3_2 i;

    static {
        VP$a vP$a;
        Companion = vP$a = new Object();
    }

    public vp_1() {
        Object object = new W7(this, 1);
        this.i = object = yr1_2.b((Function0)object);
    }

    public final F12 Pa() {
        return (F12)this.i.getValue();
    }

    public void Qa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.category_facet_subtitle_no_result_tv;
        Object object2 = (TextView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.category_facet_subtitle_row_title_layout;
        object2 = object.findViewById(n3);
        this.b = object2;
        n3 = R$id.category_facet_subtitle_row_search_et;
        object2 = (EditText)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.category_facet_subtitle_row_search_layout;
        object2 = object.findViewById(n3);
        this.d = object2;
        n3 = R$id.category_facet_subtitle_row_clear_tv;
        object2 = (TextView)object.findViewById(n3);
        n3 = R$id.category_facet_subtitle_row_title_tv;
        object2 = (TextView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.category_facet_subtitle_row_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.f = object;
        object2 = this.requireActivity();
        int n4 = 1;
        Object object3 = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.f;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        if ((object = (object = this.Pa()) != null && (object = object.d) != null ? object.Z : null) != null) {
            object = ImmutableList.copyOf((Collection)this.Ra((ArrayList)object));
            Intrinsics.checkNotNull(object);
            object = ImmutableList.copyOf((Collection)mz3_0.a(mz3_0.v((ImmutableList)object)));
            object2 = this.f;
            if (object2 != null) {
                Intrinsics.checkNotNull(object);
                object3 = this.Pa();
                Intrinsics.checkNotNull(object3);
                object3 = ((F12)object3).d.R;
                Object object4 = this.Pa();
                Intrinsics.checkNotNull(object4);
                object4 = ((F12)object4).d.S;
                wp_1 wp_12 = new wp_1((ImmutableList)object, (HashMap)object3, (HashMap)object4, this);
                ((RecyclerView)object2).setAdapter(wp_12);
            }
        }
    }

    public final ArrayList Ra(ArrayList arrayList) {
        String string2;
        boolean bl2;
        boolean bl3;
        int n3;
        String string3;
        String string4;
        int n4;
        int n7;
        Object object = arrayList;
        Intrinsics.checkNotNullParameter(arrayList, "facetValueList");
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Collection<Object> collection = z40_0.Companion;
        Object object2 = this.requireActivity().getApplication();
        ArrayList arrayList3 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)arrayList3));
        collection.getClass();
        collection = z40$a.a((Context)object2).a;
        object2 = "filter_new_ux";
        boolean bl4 = ((ao0_0)((Object)collection)).a((String)object2);
        if (!bl4) {
            return arrayList;
        }
        collection = new Collection<Object>(arrayList);
        object2 = new Object();
        Iterator<Object> iterator = new Iterator<Object>((SP)object2);
        bx_2.q(collection, (Comparator)((Object)iterator));
        object2 = new ArrayList();
        iterator = new Iterator<Object>(arrayList);
        Object object3 = this.Pa();
        if (object3 != null && (object3 = ((F12)object3).d) != null) {
            object3 = ((bv2_0)object3).R;
        } else {
            n7 = 0;
            object3 = null;
        }
        int n8 = 1;
        if (object3 != null && (n4 = ((HashMap)object3).isEmpty()) == n8) {
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n7 = iterator.hasNext()) != 0) {
                object3 = (FacetValue)iterator.next();
                boolean bl5 = ((FacetValue)object3).getSelected();
                if (!bl5 || !(bl5 = ((ArrayList)object).contains(object3))) continue;
                ((ArrayList)object2).add(object3);
            }
        } else if (object3 != null) {
            iterator = object3.entrySet().iterator();
            while ((n7 = iterator.hasNext()) != 0) {
                object3 = (FacetValue)((Map.Entry)iterator.next()).getValue();
                boolean bl6 = ((ArrayList)object).contains(object3);
                if (!bl6) continue;
                ((ArrayList)object2).add(object3);
            }
        }
        iterator = new Iterator<Object>();
        object3 = z40_0.Companion;
        Object object4 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object4, (String)((Object)arrayList3));
        object3.getClass();
        arrayList3 = z40$a.a((Context)object4).a;
        object3 = "top_category_filter_count";
        int n10 = ((ao0_0)((Object)arrayList3)).g((String)object3);
        if (n10 > 0) {
            string4 = hv3_0.K(R$string.top_categories);
            n7 = R$string.top_categories;
            string3 = hv3_0.K(n7);
            n3 = 0;
            bl3 = false;
            bl2 = true;
            string2 = null;
            int n14 = 7867;
            object4 = object3;
            object3 = new FacetValue(null, null, bl2, false, 0, null, string4, null, string3, null, false, false, false, n14, null);
            ((ArrayList)((Object)iterator)).add(object3);
            collection = CollectionsKt.f0(collection, n10);
            ((ArrayList)((Object)iterator)).addAll(collection);
        }
        collection = new Collection<Object>();
        arrayList3 = new ArrayList(object);
        arrayList3.removeAll((Collection<?>)object2);
        int n15 = arrayList3.isEmpty() ^ n8;
        if (n15 != 0) {
            string2 = hv3_0.K(R$string.all_categories);
            n15 = R$string.all_categories;
            string4 = hv3_0.K(n15);
            n8 = 0;
            boolean bl7 = false;
            object4 = null;
            bl3 = true;
            bl2 = false;
            string3 = null;
            n3 = 7867;
            object3 = object;
            object = new FacetValue(null, null, bl3, false, 0, null, string2, null, string4, null, false, false, false, n3, null);
            ((ArrayList)collection).add(object);
            ((ArrayList)collection).addAll(arrayList3);
        }
        arrayList2.addAll((Collection<Object>)object2);
        arrayList2.addAll((Collection<Object>)((Object)iterator));
        arrayList2.addAll(collection);
        return arrayList2;
    }

    public final void Y5(FacetValue object, boolean bl2) {
        Object object2;
        boolean bl3;
        Object object3;
        int n3;
        Intrinsics.checkNotNullParameter(object, "facetValue");
        Object object4 = this.Pa();
        RecyclerView$f recyclerView$f = null;
        if (object4 != null) {
            int n4;
            object4 = this.Pa();
            n3 = 1;
            if (object4 != null && (object4 = ((F12)object4).d) != null && (object4 = ((bv2_0)object4).Z) != null) {
                object4 = this.Ra((ArrayList)object4);
                object3 = z40_0.Companion;
                Object object5 = this.requireActivity().getApplication();
                String string2 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                object3.getClass();
                object3 = z40$a.a((Context)object5).a;
                object5 = "top_category_filter_count";
                n4 = ((ao0_0)object3).g((String)object5) + n3;
                object4 = CollectionsKt.f0((Iterable)object4, n4);
                bl3 = object4.contains(object);
            } else {
                bl3 = false;
                object4 = null;
            }
            if (bl3) {
                object4 = this.Pa();
                Intrinsics.checkNotNull(object4);
                object4 = ((F12)object4).d;
                ((bv2_0)object4).k1 = n3;
            }
            object4 = this.Pa();
            Intrinsics.checkNotNull(object4);
            object4 = ((F12)object4).d.X;
            if (object4 != null) {
                object4 = ((Facet)object4).getCode();
            } else {
                bl3 = false;
                object4 = null;
            }
            ((FacetValue)object).setFacetCode((String)object4);
            object4 = this.Pa();
            Intrinsics.checkNotNull(object4);
            object4 = ((F12)object4).d.R;
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d.S;
            if (bl2) {
                object3 = ((FacetValue)object).getCode();
                if (object3 != null) {
                    n4 = (int)(((FacetValue)object).getSelected() ? 1 : 0);
                    if (n4 == 0) {
                        object3 = ((FacetValue)object).getCode();
                        Intrinsics.checkNotNull(object3);
                        ((HashMap)object4).put(object3, object);
                    }
                    object4 = ((FacetValue)object).getCode();
                    Intrinsics.checkNotNull(object4);
                    ((HashMap)object2).remove(object4);
                }
            } else {
                object3 = ((FacetValue)object).getCode();
                if (object3 != null) {
                    n4 = (int)(((FacetValue)object).getSelected() ? 1 : 0);
                    if (n4 != 0) {
                        object3 = ((FacetValue)object).getCode();
                        Intrinsics.checkNotNull(object3);
                        ((HashMap)object2).put(object3, object);
                    }
                    object2 = ((FacetValue)object).getCode();
                    Intrinsics.checkNotNull(object2);
                    ((HashMap)object4).remove(object2);
                }
            }
        }
        if ((object4 = this.Pa()) != null && (object4 = ((F12)object4).d) != null) {
            object4 = ((bv2_0)object4).Z;
        } else {
            bl3 = false;
            object4 = null;
        }
        if (object4 != null) {
            object4 = this.Pa();
            if (object4 != null && (object4 = ((F12)object4).d) != null) {
                object4 = ((bv2_0)object4).Z;
            } else {
                bl3 = false;
                object4 = null;
            }
            Intrinsics.checkNotNull(object4);
            object4 = ImmutableList.copyOf((Collection)this.Ra((ArrayList)object4));
            object2 = this.f;
            if (object2 != null) {
                object2 = ((RecyclerView)object2).getAdapter();
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 = object2 instanceof wp_1;
            object3 = "facetValueList";
            if (n3 != 0) {
                object2 = this.f;
                if (object2 != null) {
                    recyclerView$f = ((RecyclerView)object2).getAdapter();
                }
                object2 = "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.CategoriesFacetValueAdapter";
                Intrinsics.checkNotNull(recyclerView$f, (String)object2);
                recyclerView$f = (wp_1)recyclerView$f;
                Intrinsics.checkNotNull(object4);
                recyclerView$f.getClass();
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                ((wp_1)recyclerView$f).a = object4;
                recyclerView$f.notifyDataSetChanged();
            } else {
                object2 = this.f;
                if (object2 != null) {
                    object2 = ((RecyclerView)object2).getAdapter();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                n3 = object2 instanceof pf1_0;
                if (n3 != 0) {
                    object2 = this.f;
                    if (object2 != null) {
                        recyclerView$f = ((RecyclerView)object2).getAdapter();
                    }
                    object2 = "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.LuxeGeneralFacetValueAdapter";
                    Intrinsics.checkNotNull(recyclerView$f, (String)object2);
                    recyclerView$f = (pf1_0)recyclerView$f;
                    Intrinsics.checkNotNull(object4);
                    recyclerView$f.getClass();
                    Intrinsics.checkNotNullParameter(object4, (String)object3);
                    ((qy0_1)recyclerView$f).a = object4;
                    recyclerView$f.notifyDataSetChanged();
                }
            }
        }
        if ((object4 = this.h) != null) {
            object = ((FacetValue)object).getFacetCode();
            object4.B4((String)object, bl2);
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
            this.h = object;
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
        int n3 = R$layout.category_facet_subtitle_row_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.Qa((View)object);
        object = this.Pa();
        int n3 = 0;
        object2 = null;
        if (object != null && (object = object.d) != null) {
            object = object.X;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null && (object = this.e) != null) {
            object3 = this.Pa();
            if (object3 != null && (object3 = ((F12)object3).d) != null) {
                object2 = ((bv2_0)object3).a0;
            }
            object.setText((CharSequence)object2);
        }
        if ((object = this.b) != null) {
            object3 = null;
            object2 = new PP(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.c) != null) {
            object2 = new VP$b(this);
            object.addTextChangedListener((TextWatcher)object2);
        }
        if ((object = this.c) != null) {
            object2 = new QP(this);
            object.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
        }
        if ((object = this.c) != null) {
            object2 = new RP(this);
            object.setOnFocusChangeListener((View.OnFocusChangeListener)object2);
        }
        if ((object = this.getArguments()) != null && (bl2 = (object = this.requireArguments()).containsKey((String)(object2 = "OPEN_THROUGH_CATEGORY"))) && (bl2 = (object = this.requireArguments()).getBoolean((String)object2))) {
            object = this.d;
            if (object != null) {
                n3 = 8;
                object.setVisibility(n3);
            }
        } else {
            object = this.d;
            if (object != null) {
                n3 = 0;
                object2 = null;
                object.setVisibility(0);
            }
        }
    }
}

