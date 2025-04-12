/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from qF1
 */
public final class qf1_0
extends vy0_0 {
    public pf1_0 z;

    public final void Qa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.facet_value_rv;
        Object object2 = (RecyclerView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.category_selection_tv;
        this.d = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.filter_message;
        this.j = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.enter_location;
        this.k = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.error_location;
        this.l = object2 = (AjioTextView)object.findViewById(n3);
        n3 = R$id.address_bar_ui;
        object = (ConstraintLayout)object.findViewById(n3);
        this.m = object;
        object2 = this.requireActivity();
        int n4 = 1;
        HashMap hashMap = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        this.Ua();
        object = this.Pa();
        n3 = 0;
        object2 = null;
        object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).X) != null ? ((Facet)object).getValues() : null;
        if (object != null) {
            Object object3;
            object = this.Pa();
            object = object != null ? ((F12)object).d : null;
            Intrinsics.checkNotNull(object);
            object = ((bv2_0)object).X;
            if (object != null) {
                object2 = ((Facet)object).getValues();
            }
            Intrinsics.checkNotNull(object2);
            object = ImmutableList.copyOf((Collection)object2);
            n3 = this.e;
            n4 = 5;
            if (n3 != n4) {
                Intrinsics.checkNotNull(object);
                object = ImmutableList.copyOf((Collection)mz3_0.a(mz3_0.v((ImmutableList)object)));
            }
            this.Va();
            Intrinsics.checkNotNull(object);
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            hashMap = ((F12)object2).d.R;
            object2 = this.Pa();
            Intrinsics.checkNotNull(object2);
            HashMap hashMap2 = ((F12)object2).d.S;
            int n7 = this.e;
            object2 = object3;
            object3 = new pf1_0((ImmutableList)object, hashMap, hashMap2, this, n7);
            this.z = object3;
            object3 = this.c;
            if (object3 != null) {
                pf1_0 pf1_02;
                Intrinsics.checkNotNull(object);
                object2 = this.Pa();
                Intrinsics.checkNotNull(object2);
                hashMap = ((F12)object2).d.R;
                object2 = this.Pa();
                Intrinsics.checkNotNull(object2);
                hashMap2 = ((F12)object2).d.S;
                n7 = this.e;
                object2 = pf1_02;
                pf1_02 = new pf1_0((ImmutableList)object, hashMap, hashMap2, this, n7);
                ((RecyclerView)object3).setAdapter(pf1_02);
            }
        }
    }

    public final void Sa() {
        int n3;
        int n4 = h40_0.Q1();
        if (n4 != 0 && (n4 = this.e) == (n3 = 5)) {
            Object object = this.y;
            if (object == null) {
                object = this.z;
                if (object != null) {
                    object = ((qy0_1)object).g();
                } else {
                    n4 = 0;
                    object = null;
                }
                this.y = object;
            }
            if ((object = this.y) != null) {
                n3 = 0;
                this.Y5((FacetValue)object, false);
                object = this.z;
                if (object != null) {
                    n3 = -1;
                    ((qy0_1)object).d(n3);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Xa() {
        Object object;
        int n3;
        Object object2 = this.d;
        if (object2 == null) return;
        Intrinsics.checkNotNull(object2);
        int n4 = R$style.luxe_txt_body_dim_12_color4a4a4a;
        Hm3.f((TextView)object2, n4);
        object2 = this.getTag();
        if (object2 != null && (n3 = ((String)object2).equals(object = "verticalsizegroupformat")) == (n4 = 1) && (object2 = this.g) != null) {
            Intrinsics.checkNotNull(object2);
            object = "l1l3nestedcategory";
            n3 = (int)(object2.l9((String)object) ? 1 : 0);
            if (n3 == 0) {
                object = "For better results, SELECT CATEGORY";
                object2 = new SpannableString((CharSequence)object);
                FontsManager fontsManager = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                int n7 = 9;
                fontsManager = fontsManager.getTypefaceWithFont((Context)aJIOApplication, n7);
                qF1$a qF1$a = new qF1$a(this);
                String string2 = "SELECT CATEGORY";
                int n8 = 6;
                int n10 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
                int n14 = 35;
                int n15 = 33;
                object2.setSpan((Object)qF1$a, n10, n14, n15);
                String string3 = "";
                AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)fontsManager);
                int n16 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
                object2.setSpan((Object)ajioCustomTypefaceSpan, n16, n14, n15);
                int n17 = hv3_0.m(R$color.luxe_color_121212);
                fontsManager = new ForegroundColorSpan(n17);
                n4 = StringsKt.O((CharSequence)object, string2, 0, false, n8);
                object2.setSpan((Object)fontsManager, n4, n14, n15);
                object = this.d;
                if (object != null) {
                    object.setText((CharSequence)object2);
                }
                if ((object2 = this.d) != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = this.d) == null) return;
                object = LinkMovementMethod.getInstance();
                object2.setMovementMethod((MovementMethod)object);
                return;
            }
        }
        if ((object2 = this.d) == null) return;
        n4 = 8;
        object2.setVisibility(n4);
    }
}

