/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.MenuItem
 *  android.widget.TextView
 */
package com.ril.ajio.payment.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;

public class TermsAndConditionActivity
extends AppCompatActivity {
    public TextView X;

    public final void onCreate(Bundle object) {
        int n3;
        Object object2;
        Object object3;
        super.onCreate((Bundle)object);
        int n4 = og1_1.b();
        String string2 = "Terms And Conditions";
        if (n4 != 0) {
            n4 = R$layout.pesdk_lux_activity_terms_condition;
            this.setContentView(n4);
            n4 = R$id.pesdk_toolbar;
            object3 = (Toolbar)this.findViewById(n4);
            int n7 = R$id.pesdk_toolbar_title_tv;
            object2 = (TextView)this.findViewById(n7);
            this.X = object2;
            object2.setText((CharSequence)string2);
            kq2_1.d((Toolbar)object3, this);
            n3 = R$drawable.ic_back_arrow_lux;
            ((Toolbar)object3).setNavigationIcon(n3);
            n3 = R$string.back_button_text;
            ((Toolbar)object3).setNavigationContentDescription(n3);
        } else {
            n4 = R$layout.pesdk_activity_terms_condition;
            this.setContentView(n4);
            n4 = R$id.pesdk_toolbar;
            object3 = (Toolbar)this.findViewById(n4);
            int n8 = R$id.pesdk_toolbar_title_tv;
            object2 = (TextView)this.findViewById(n8);
            this.X = object2;
            object2.setText((CharSequence)string2);
            this.setSupportActionBar((Toolbar)object3);
            kq2_1.d((Toolbar)object3, this);
        }
        if (object == null) {
            int n10;
            object = this.getIntent().getExtras();
            object3 = "url";
            n3 = 0;
            string2 = null;
            if (object != null) {
                object = object.getString((String)object3);
            } else {
                n10 = 0;
                object = null;
            }
            object2 = this.getSupportFragmentManager();
            object2 = Vp0.a((FragmentManager)object2, (FragmentManager)object2);
            rf3_1 rf3_12 = new rf3_1();
            Bundle bundle = new Bundle();
            bundle.putString((String)object3, (String)object);
            rf3_12.setArguments(bundle);
            n10 = R$id.sample_content_fragment;
            ((k)object2).j(n10, rf3_12, null);
            ((a)object2).d();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int n3;
        int n4 = menuItem.getItemId();
        if (n4 == (n3 = 16908332)) {
            this.finish();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

