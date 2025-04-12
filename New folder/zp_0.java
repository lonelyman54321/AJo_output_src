/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Facet;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZP
 */
public class zp_0
extends sm3_0
implements KQ {
    public static final ZP$a Companion;
    public final hh3_2 b;
    public RecyclerView c;

    static {
        ZP$a zP$a;
        Companion = zP$a = new Object();
    }

    public zp_0() {
        Object object = new c8_0(this, 1);
        this.b = object = yr1_2.b((Function0)object);
    }

    public final void J9(String object) {
        boolean bl2;
        int n3;
        HashMap hashMap;
        int n4;
        Intrinsics.checkNotNullParameter(object, "title");
        Object object2 = this.Pa();
        a a2 = null;
        if (object2 != null && (object2 = ((F12)object2).d) != null && (object2 = ((bv2_0)object2).X) != null) {
            object2 = ((Facet)object2).getCategoryFacetValues();
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d;
            hashMap = this.Pa();
            Intrinsics.checkNotNull(hashMap);
            hashMap = ((F12)((Object)hashMap)).d.X;
            hashMap = hashMap != null ? ((Facet)((Object)hashMap)).getCategoryFacetValues() : null;
            Intrinsics.checkNotNull(hashMap);
            ((bv2_0)object2).Z = hashMap = (ArrayList)hashMap.get(object);
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            object2 = ((F12)object2).d;
            ((bv2_0)object2).a0 = object;
        }
        object = this.getArguments();
        object2 = "OPEN_THROUGH_CATEGORY";
        hashMap = "PLP_TYPE";
        if (object != null && (n3 = (int)((object = this.requireArguments()).containsKey((String)((Object)hashMap)) ? 1 : 0)) != 0) {
            object = this.getArguments();
            if (object != null) {
                n3 = object.getInt((String)((Object)hashMap));
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n3 = (Integer)object;
            Bundle bundle = this.requireArguments();
            bl2 = bundle.getBoolean((String)object2, false);
        } else {
            n3 = -1;
            bl2 = false;
            Object var7_8 = null;
        }
        Object object3 = vp_1.Companion;
        object3.getClass();
        int n7 = 100;
        object3 = n3 != n7 ? (n3 != (n7 = 101) ? new vp_1() : new td1_0()) : new vp_1();
        Bundle bundle = new Bundle();
        bundle.putInt((String)((Object)hashMap), n3);
        bundle.putBoolean((String)object2, bl2);
        ((Fragment)object3).setArguments(bundle);
        object = this.getParentFragment();
        if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            a2 = new a((FragmentManager)object);
        }
        if (a2 != null) {
            n3 = R$anim.slide_in_left;
            n4 = R$anim.slide_out_right;
            a2.k(n3, n4, 0, 0);
        }
        if (a2 != null) {
            n3 = R$id.filter_view_facet_value_frag_container;
            object2 = this.getTag();
            a2.j(n3, (Fragment)object3, (String)object2);
        }
        if (a2 != null) {
            n3 = 1;
            a2.o(n3 != 0, n3 != 0);
        }
    }

    public final F12 Pa() {
        return (F12)this.b.getValue();
    }

    public void Qa(View object) {
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
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        if ((object = (object = this.Pa()) != null && (object = ((F12)object).d) != null ? ((bv2_0)object).X : null) != null) {
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.X;
            Intrinsics.checkNotNull(object);
            object2 = this.c;
            if (object2 != null) {
                object = ((Facet)object).getCategoryGenderItemCount();
                XP xP = new XP((HashMap)object, this);
                ((RecyclerView)object2).setAdapter(xP);
            }
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
        this.Qa(view);
    }
}

