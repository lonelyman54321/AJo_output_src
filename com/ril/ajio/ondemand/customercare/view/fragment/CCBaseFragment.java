/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.MenuItem
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.R$id;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public class CCBaseFragment
extends Fragment {
    private pf_1 ccActivityListener;
    private AppCompatActivity mActivity;
    private ArrayList mUiItemsList;

    public CCBaseFragment() {
        ArrayList arrayList;
        this.mUiItemsList = arrayList = new ArrayList();
    }

    public final pf_1 getCcActivityListener() {
        return this.ccActivityListener;
    }

    public final AppCompatActivity getMActivity() {
        return this.mActivity;
    }

    public final ArrayList getMUiItemsList() {
        return this.mUiItemsList;
    }

    public void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof pf_1;
        if (bl2) {
            object2 = object;
            this.ccActivityListener = object2 = (pf_1)object;
            object = (AppCompatActivity)object;
            this.mActivity = object;
            return;
        }
        object = new ClassCastException("$context Must implement CCActivityListener");
        throw object;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setHasOptionsMenu(true);
    }

    public boolean onOptionsItemSelected(MenuItem object) {
        Object object2 = "menuItem";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getItemId();
        int n4 = R$id.home;
        if (n3 == n4) {
            object2 = this.mActivity;
            if (object2 != null) {
                Intrinsics.checkNotNull(object2);
                n3 = (int)(object2.isFinishing() ? 1 : 0);
                if (n3 == 0) {
                    object = this.mActivity;
                    if (object != null) {
                        ((ComponentActivity)object).onBackPressed();
                    }
                    return false;
                }
            }
            return super.onOptionsItemSelected((MenuItem)object);
        }
        return super.onOptionsItemSelected((MenuItem)object);
    }

    public final void setCcActivityListener(pf_1 pf_12) {
        this.ccActivityListener = pf_12;
    }

    public final void setMActivity(AppCompatActivity appCompatActivity) {
        this.mActivity = appCompatActivity;
    }

    public final void setMUiItemsList(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mUiItemsList = arrayList;
    }
}

