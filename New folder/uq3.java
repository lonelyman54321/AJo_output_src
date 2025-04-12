/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

public final class uq3
extends Fragment {
    public final D a;
    public xU b;

    public uq3() {
        Object object = Reflection.getOrCreateKotlinClass(Hq3.class);
        uq3$a uq3$a = new uq3$a(this);
        Lambda lambda = uq3$c.c;
        if (lambda == null) {
            super(this);
        }
        jw0_0 jw0_02 = new jw0_0(this, 0);
        this.a = object = LW0.a(this, (yn1_2)object, uq3$a, jw0_02, lambda);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        int n3 = R$id.save_body;
        menu2.findItem(n3).setVisible(false);
        kn1_0 kn1_02 = ((Hq3)this.a.getValue()).d;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        sq3 sq32 = new sq3(menu2);
        kn1_02.e(mu1_12, sq32);
        super.onCreateOptionsMenu(menu2, menuInflater);
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        object3 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n3 = R$layout.chucker_fragment_transaction_overview;
        object = xU.bind(object.inflate(n3, object2, false));
        object2 = "inflate(inflater, container, false)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.b = object;
        if (object != null) {
            return object.a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("overviewBinding");
        throw null;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.a;
        object2 = ((Hq3)((D)object).getValue()).f;
        object = ((Hq3)((D)object).getValue()).b;
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(object, "other");
        Object object3 = ev1_0.c;
        object = ft0.a((LiveData)object2, (zr1_1)object, (Function2)object3);
        object2 = this.getViewLifecycleOwner();
        object3 = new tq3(this);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
    }
}

