/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.WindowManager$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.model.CMSStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from T03
 */
public final class t03_0
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ v03_0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ t03_0(String[] stringArray, v03_0 v03_02, Context context) {
        this.a = stringArray;
        this.b = v03_02;
        this.c = context;
    }

    public final void onItemClick(AdapterView object, View object2, int n3, long l2) {
        String string2;
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$urlList");
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.c;
        String string3 = "$context";
        Intrinsics.checkNotNullParameter(object3, string3);
        int n4 = ((String[])object).length;
        if (n4 != 0 && (bl2 = kotlin.text.b.i((String)(object = object[n3]), string2 = "CMS Preview", (n4 = 1) != 0))) {
            boolean bl3;
            object2 = ((v03_0)object2).a;
            object = new hh_2((np_1)object2);
            object2 = "context";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            ((hh_2)object).a = object3;
            string2 = LayoutInflater.from((Context)object3);
            int n7 = R$layout.cms_myacc_data_setup_settings_dialog;
            String string4 = null;
            string2 = string2.inflate(n7, null);
            n7 = R$id.dateTV;
            Object object4 = (TextView)string2.findViewById(n7);
            ((hh_2)object).b = object4;
            n7 = R$id.timeTV;
            object4 = (TextView)string2.findViewById(n7);
            ((hh_2)object).c = object4;
            n7 = R$id.page_id_value_et;
            object4 = (EditText)string2.findViewById(n7);
            ((hh_2)object).d = object4;
            n7 = R$id.page_url_value_et;
            object4 = (EditText)string2.findViewById(n7);
            ((hh_2)object).e = object4;
            n7 = R$id.app_version_et;
            object4 = (EditText)string2.findViewById(n7);
            ((hh_2)object).f = object4;
            n7 = R$id.user_type_dd;
            object4 = (Spinner)string2.findViewById(n7);
            ((hh_2)object).g = object4;
            n7 = R$id.user_status_dd;
            object4 = (Spinner)string2.findViewById(n7);
            ((hh_2)object).h = object4;
            n7 = R$id.user_group_dd;
            object4 = (Spinner)string2.findViewById(n7);
            ((hh_2)object).i = object4;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userGroupDd");
                n7 = 0;
                object4 = null;
            }
            Object object5 = CMSConfigInitializer.INSTANCE;
            Object object6 = ((CMSConfigInitializer)object5).getUserSubGroup();
            int n8 = 0x1090009;
            Object object7 = new ArrayAdapter(object3, n8, (List)object6);
            object4.setAdapter((SpinnerAdapter)object7);
            n7 = R$id.btn_date_pick;
            object4 = (Button)string2.findViewById(n7);
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnDatePick");
                n7 = 0;
                object4 = null;
            }
            object4.setOnClickListener((View.OnClickListener)object);
            n7 = R$id.btn_time_pick;
            object4 = (Button)string2.findViewById(n7);
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnTimePick");
                n7 = 0;
                object4 = null;
            }
            object4.setOnClickListener((View.OnClickListener)object);
            n7 = R$id.uat_checkbox;
            object4 = (CheckBox)string2.findViewById(n7);
            ((hh_2)object).m = object4;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uatCheckbox");
                n7 = 0;
                object4 = null;
            }
            object7 = new Object();
            object4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object7);
            n7 = R$id.done;
            object4 = (Button)string2.findViewById(n7);
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("doneButton");
                n7 = 0;
                object4 = null;
            }
            object4.setOnClickListener((View.OnClickListener)object);
            n7 = R$id.sub_group_selection;
            object4 = (TextView)string2.findViewById(n7);
            ((hh_2)object).l = object4;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subUserGroup");
                n7 = 0;
                object4 = null;
            }
            object4.setOnClickListener((View.OnClickListener)object);
            n7 = R$id.store_selection;
            object4 = (Spinner)string2.findViewById(n7);
            ((hh_2)object).k = object4;
            object4 = ((CMSConfigInitializer)object5).getCMSStores();
            object7 = ((hh_2)object).o;
            object5 = ((hh_2)object).n;
            if (object4 != null && (bl3 = object4.isEmpty() ^ n4)) {
                object4 = ((ArrayList)object4).iterator();
                object6 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
                while (bl3 = object4.hasNext()) {
                    object6 = object4.next();
                    Intrinsics.checkNotNullExpressionValue(object6, "next(...)");
                    object6 = (CMSStore)object6;
                    String string5 = ((CMSStore)object6).getName();
                    ((ArrayList)object5).add(string5);
                    object6 = ((CMSStore)object6).getId();
                    ((ArrayList)object7).add(object6);
                }
            } else {
                ((ArrayList)object5).add("AJIO");
                object4 = "ajio";
                ((ArrayList)object7).add(object4);
            }
            if ((object7 = ((hh_2)object).a) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object7 = null;
            }
            int n10 = 17367048;
            object4 = new ArrayAdapter((Context)object7, n10, (List)object5);
            object2 = ((hh_2)object).k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storeList");
                n10 = 0;
                object2 = null;
            }
            object2.setAdapter((SpinnerAdapter)object4);
            object2 = new Dialog(object3);
            ((hh_2)object).j = object2;
            object2.requestWindowFeature(n4);
            object2 = ((hh_2)object).j;
            object3 = "dialog";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n10 = 0;
                object2 = null;
            }
            object2.setContentView((View)string2);
            object2 = ((hh_2)object).j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n10 = 0;
                object2 = null;
            }
            object2.show();
            object2 = ((hh_2)object).j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n10 = 0;
                object2 = null;
            }
            object2.setCancelable(n4 != 0);
            object2 = ((hh_2)object).j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n10 = 0;
                object2 = null;
            }
            if ((string2 = object2.getWindow()) != null) {
                string2 = string2.getAttributes();
            } else {
                n3 = 0;
                string2 = null;
            }
            int n14 = -1;
            if (string2 != null) {
                ((WindowManager.LayoutParams)string2).height = n14;
                ((WindowManager.LayoutParams)string2).width = n14;
            }
            if ((object2 = object2.getWindow()) != null) {
                object2.setAttributes((WindowManager.LayoutParams)string2);
            }
            if ((n10 = ch_2.c) > 0 && (n3 = ch_2.d) >= 0 && (n4 = ch_2.e) > 0) {
                ((hh_2)object).a(n4, n3, n10);
            }
            if ((n10 = ch_2.f) != n14) {
                object2 = String.valueOf(n10);
                string2 = ((hh_2)object).d;
                object3 = "pageIdEt";
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    string2 = null;
                }
                string2.setText((CharSequence)object2);
                string2 = ((hh_2)object).d;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    string2 = null;
                }
                n10 = ((String)object2).length();
                string2.setSelection(n10);
            }
            if ((object2 = ch_2.g) != null) {
                string2 = ((hh_2)object).e;
                object3 = "pageUrlEt";
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    string2 = null;
                }
                string2.setText((CharSequence)object2);
                string2 = ((hh_2)object).e;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    string2 = null;
                }
                n10 = ((String)object2).length();
                string2.setSelection(n10);
            }
            if ((object2 = ch_2.k) != null && (n3 = ((String)object2).length()) != 0) {
                string2 = ((hh_2)object).f;
                object3 = "appVersionEt";
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    string2 = null;
                }
                string2.setText((CharSequence)object2);
                string2 = ((hh_2)object).f;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    string4 = string2;
                }
                n10 = ((String)object2).length();
                string4.setSelection(n10);
            }
            n10 = ch_2.b;
            n3 = ch_2.a;
            ((hh_2)object).b(n10, n3);
        }
    }
}

