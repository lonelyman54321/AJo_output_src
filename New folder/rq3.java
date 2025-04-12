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
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView$k;
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
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class rq3
extends Fragment
implements SearchView$k,
hq3$a {
    public final D a;
    public wU b;
    public hq3_0 c;

    public rq3() {
        Object object = new rq3$c(this);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(gg1_0.class);
        rq3$d rq3$d = new rq3$d((rq3$c)object);
        super(this, 0);
        this.a = object = LW0.a(this, yn1_22, rq3$d, (Function0)object, null);
    }

    public final void D5(long l2) {
        FragmentActivity fragmentActivity = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "requireActivity()");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intent intent = new Intent((Context)fragmentActivity, TransactionActivity.class);
        intent.putExtra("transaction_id", l2);
        fragmentActivity.startActivity(intent);
    }

    public final boolean L1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "query");
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu object, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(object, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        int n3 = R$menu.chucker_transactions_list;
        menuInflater.inflate(n3, object);
        n3 = R$id.search;
        Object object2 = object.findItem(n3).getActionView();
        if (object2 != null) {
            object2 = (SearchView)object2;
            ((SearchView)object2).setOnQueryTextListener(this);
            ((SearchView)object2).setIconifiedByDefault(true);
            super.onCreateOptionsMenu((Menu)object, menuInflater);
            return;
        }
        object = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        throw object;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        int n3 = R$layout.chucker_fragment_transaction_list;
        int n4 = 0;
        Object object3 = null;
        object = wU.bind(object.inflate(n3, object2, false));
        Intrinsics.checkNotNullExpressionValue(object, "inflate(inflater, container, false)");
        this.b = object;
        object2 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object2, "requireContext()");
        object = new hq3_0((Context)object2, this);
        this.c = object;
        object = this.b;
        object2 = "transactionsBinding";
        n3 = 0;
        if (object != null) {
            object3 = ((wU)object).c;
            Object object4 = LinkMovementMethod.getInstance();
            object3.setMovementMethod(object4);
            object = ((wU)object).b;
            n4 = 1;
            ((RecyclerView)object).setHasFixedSize(n4 != 0);
            Context context = this.requireContext();
            object4 = new l(context, n4);
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object4);
            object3 = this.c;
            if (object3 != null) {
                ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
                object = this.b;
                if (object != null) {
                    return ((wU)object).a;
                }
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("transactionsAdapter");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        throw null;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Object object = "item";
        Intrinsics.checkNotNullParameter(menuItem, (String)object);
        int n3 = menuItem.getItemId();
        int n4 = R$id.clear;
        boolean bl2 = true;
        String string2 = "requireContext()";
        if (n3 == n4) {
            menuItem = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(menuItem, string2);
            n4 = R$string.chucker_clear;
            Object object2 = this.getString(n4);
            Intrinsics.checkNotNullExpressionValue(object2, "getString(R.string.chucker_clear)");
            int n7 = R$string.chucker_clear_http_confirmation;
            string2 = this.getString(n7);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_clear_http_confirmation)");
            int n8 = R$string.chucker_clear;
            String string3 = this.getString(n8);
            int n10 = R$string.chucker_cancel;
            String string4 = this.getString(n10);
            object = new Tp0((String)object2, string2, string3, string4);
            object2 = new rq3$a(this);
            y70.a((Context)menuItem, (Tp0)object, (Function0)object2);
        } else {
            n4 = R$id.export;
            if (n3 == n4) {
                menuItem = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(menuItem, string2);
                n4 = R$string.chucker_export;
                Object object3 = this.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object3, "getString(R.string.chucker_export)");
                int n14 = R$string.chucker_export_http_confirmation;
                string2 = this.getString(n14);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_export_http_confirmation)");
                int n15 = R$string.chucker_export;
                String string5 = this.getString(n15);
                int n16 = R$string.chucker_cancel;
                String string6 = this.getString(n16);
                object = new Tp0((String)object3, string2, string5, string6);
                object3 = new rq3$b(this);
                y70.a((Context)menuItem, (Tp0)object, (Function0)object3);
            } else {
                bl2 = super.onOptionsItemSelected(menuItem);
            }
        }
        return bl2;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object = ((gg1_0)this.a.getValue()).b;
        object2 = this.getViewLifecycleOwner();
        pq3_0 pq3_02 = new pq3_0(this);
        ((LiveData)object).e((mu1_1)object2, pq3_02);
    }

    public final void q1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "newText");
        gg1_0 gg1_02 = (gg1_0)this.a.getValue();
        gg1_02.getClass();
        Intrinsics.checkNotNullParameter(string2, "searchQuery");
        gg1_02.a.k(string2);
    }
}

