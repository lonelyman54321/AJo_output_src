/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$menu;
import com.ril.ajio.customviews.widgets.AjioCircularTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ew
 */
public abstract class ew_2
extends Fragment {
    public final jo_2 a;

    public ew_2() {
        jo_2 jo_22;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.a = jo_22 = new jo_2((Context)aJIOApplication);
    }

    public void onCreateOptionsMenu(Menu menu2, MenuInflater object) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Object object2 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onCreateOptionsMenu(menu2, (MenuInflater)object);
        object = this.getActivity();
        if (object != null) {
            object = this.getActivity();
            int n4 = 0;
            object2 = null;
            if (object != null) {
                boolean n3 = object.isFinishing();
                object = n3;
            } else {
                boolean bl2 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            boolean bl3 = (Boolean)object;
            if (!bl3) {
                Object object3;
                int n3;
                int n7;
                object = this.getActivity();
                if (object != null && (n7 = object.isFinishing()) == 0) {
                    object = object.getMenuInflater();
                    n7 = R$menu.action_bar_menu;
                    object.inflate(n7, menu2);
                    int n8 = R$id.search;
                    menu2.findItem(n8);
                }
                if ((menu2 = menu2.findItem(n3 = R$id.cart)) != null) {
                    int n10 = R$layout.cart_menu_item_layout;
                    menu2.setActionView(n10);
                }
                if (menu2 != null) {
                    object = menu2.getActionView();
                } else {
                    boolean bl4 = false;
                    object = null;
                }
                if (object != null) {
                    n4 = R$id.count;
                    object2 = (AjioCircularTextView)object.findViewById(n4);
                }
                if ((n7 = ((jo_2)(object3 = this.a)).d()) == 0) {
                    if (object2 != null) {
                        n7 = 4;
                        object2.setVisibility(n7);
                    }
                } else {
                    if (object2 != null) {
                        object2.setVisibility(0);
                    }
                    if (object2 != null) {
                        object3 = String.valueOf(n7);
                        object2.setText((CharSequence)object3);
                    }
                }
                if (object != null) {
                    n7 = 0;
                    object3 = null;
                    object2 = new dw_1(this, menu2, 0);
                    object.setOnClickListener((View.OnClickListener)object2);
                }
            }
        }
    }
}

