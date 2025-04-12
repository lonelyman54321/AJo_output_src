/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.method.LinkMovementMethod
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.l;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;
import com.chuckerteam.chucker.R$menu;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class nn3
extends Fragment
implements ln3$a {
    public final D a;
    public vU b;
    public ln3 c;

    public nn3() {
        Object object = new nn3$a(this);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(gg1_0.class);
        nn3$b nn3$b = new nn3$b((nn3$a)object);
        super(this, 0);
        this.a = object = LW0.a(this, yn1_22, nn3$b, (Function0)object, null);
    }

    public final void B2(long l2) {
        FragmentActivity fragmentActivity = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "requireActivity()");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intent intent = new Intent((Context)fragmentActivity, ThrowableActivity.class);
        intent.putExtra("transaction_id", l2);
        fragmentActivity.startActivity(intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        int n3 = R$menu.chucker_throwables_list;
        menuInflater.inflate(n3, menu2);
        super.onCreateOptionsMenu(menu2, menuInflater);
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        int n3 = R$layout.chucker_fragment_throwable_list;
        int n4 = 0;
        Object object3 = null;
        object = vU.bind(object.inflate(n3, object2, false));
        Intrinsics.checkNotNullExpressionValue(object, "inflate(inflater, container, false)");
        this.b = object;
        object = new ln3(this);
        this.c = object;
        object = this.b;
        object2 = "errorsBinding";
        n3 = 0;
        if (object != null) {
            object3 = ((vU)object).c;
            Object object4 = LinkMovementMethod.getInstance();
            object3.setMovementMethod(object4);
            object = ((vU)object).b;
            n4 = 1;
            ((RecyclerView)object).setHasFixedSize(n4 != 0);
            Context context = object.getContext();
            object4 = new l(context, n4);
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object4);
            object3 = this.c;
            if (object3 != null) {
                ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
                object = this.b;
                if (object != null) {
                    return ((vU)object).a;
                }
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("errorsAdapter");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        throw null;
    }

    public final boolean onOptionsItemSelected(MenuItem object) {
        boolean bl2;
        String string2 = "item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getItemId();
        int n4 = R$id.clear;
        if (n3 == n4) {
            n3 = R$string.chucker_clear;
            string2 = this.getString(n3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_clear)");
            n4 = R$string.chucker_clear_throwable_confirmation;
            Object object2 = this.getString(n4);
            Intrinsics.checkNotNullExpressionValue(object2, "getString(R.string.chucker_clear_throwable_confirmation)");
            int n7 = R$string.chucker_clear;
            String string3 = this.getString(n7);
            int n8 = R$string.chucker_cancel;
            String string4 = this.getString(n8);
            object = new Tp0(string2, (String)object2, string3, string4);
            string2 = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(string2, "requireContext()");
            object2 = new mn3(this);
            y70.a((Context)string2, (Tp0)object, (Function0)object2);
            bl2 = true;
        } else {
            bl2 = super.onOptionsItemSelected((MenuItem)object);
        }
        return bl2;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = ((gg1_0)this.a.getValue()).c;
        object2 = this.getViewLifecycleOwner();
        ca1_1 ca1_12 = new ca1_1(this, 1);
        ((LiveData)object).e((mu1_1)object2, ca1_12);
    }
}

