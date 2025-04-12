/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dc0
 */
public final class dc0_2
extends ew_2 {
    public RecyclerView b;
    public fd0_2 c;
    public ConstraintLayout d;
    public ec0_1 e;
    public String f;
    public ArrayList g;
    public ac0_0 h;
    public final dc0$a_0 i;

    public dc0_2() {
        dc0$a_0 dc0$a_0;
        this.i = dc0$a_0 = new dc0$a_0(this);
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof ec0_1;
        if (bl2) {
            object = (ec0_1)object;
            this.e = object;
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object4 = fd0_2.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, object4, string2);
        object2 = ef0_0.a(object4, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object4).concat((String)object3);
            this.c = object = (fd0_2)((pD3)object).a((yn1_2)object2, (String)object3);
            object = this.getArguments();
            object2 = null;
            if (object != null) {
                object3 = AllOffersItem.Companion.getCOUPON_TYPE();
                object4 = "";
                object = object.getString((String)object3, (String)object4);
            } else {
                object = null;
            }
            this.f = object;
            object = this.c;
            if (object != null) {
                object2 = ((fd0_2)object).g;
            }
            this.g = object2;
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_coupon_list;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.coupon_list_view;
        object2 = (RecyclerView)object.findViewById(n4);
        this.b = object2;
        if (object2 != null) {
            object4 = this.requireActivity();
            int n7 = 1;
            object3 = new LinearLayoutManager((Context)object4, n7, false);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        }
        if ((object2 = this.b) != null) {
            int n8 = hv3_0.q(R$dimen.coupon_list_margin);
            object3 = new xb3_2(n8);
            ((RecyclerView)object2).addItemDecoration((RecyclerView$n)object3);
        }
        n4 = R$id.coupon_no_offer_container;
        object = (ConstraintLayout)object.findViewById(n4);
        this.d = object;
        object = this.g;
        n4 = 8;
        if (object != null && (n3 = ((ArrayList)object).size()) == 0) {
            object = this.b;
            if (object != null) {
                object.setVisibility(n4);
            }
            if ((object = this.d) != null) {
                object.setVisibility(0);
            }
        } else {
            object3 = this.g;
            Intrinsics.checkNotNull(object3);
            object4 = this.i;
            String string2 = this.f;
            object = new ac0_0((List)object3, (zc0_0)object4, string2);
            this.h = object;
            object = this.d;
            if (object != null) {
                object.setVisibility(n4);
            }
            if ((object = this.b) != null) {
                object.setVisibility(0);
            }
            if ((object = this.b) != null) {
                object2 = this.h;
                ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
            }
        }
        ac0.Companion.getClass();
        object = ac0.b;
        if (object == null) {
            object = new ac0();
            ac0.b = object;
        }
        object = ac0.b;
        Intrinsics.checkNotNull(object);
        object = ((ac0)object).a;
        object2 = new cc0_2(this);
        ((t62_0)object).c((e62_0)object2);
    }
}

