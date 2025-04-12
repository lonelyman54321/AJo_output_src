/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 *  android.widget.Toast
 */
package com.chuckerteam.chucker.internal.ui.transaction;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$menu;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.BaseChuckerActivity;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$a;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$b;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$c;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$d;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class TransactionActivity
extends BaseChuckerActivity {
    public static int k0;
    public final D Y;
    public sU Z;

    public TransactionActivity() {
        D d2;
        TransactionActivity$e transactionActivity$e = new TransactionActivity$e(this);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(Hq3.class);
        TransactionActivity$d transactionActivity$d = new TransactionActivity$d(this);
        this.Y = d2 = new D(yn1_22, transactionActivity$d, transactionActivity$e);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = sU.inflate(this.getLayoutInflater());
        Object object2 = "inflate(layoutInflater)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.Z = object;
        if (object != null) {
            object2 = ((sU)object).a;
            this.setContentView((View)object2);
            object2 = ((sU)object).c;
            this.setSupportActionBar((Toolbar)object2);
            object2 = ((sU)object).e;
            Intrinsics.checkNotNullExpressionValue(object2, "viewPager");
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            String string2 = "supportFragmentManager";
            Intrinsics.checkNotNullExpressionValue(fragmentManager, string2);
            Object object3 = new vq3((Context)this, fragmentManager);
            ((ViewPager)((Object)object2)).setAdapter((Uk2)object3);
            object3 = new Object();
            ((ViewPager)((Object)object2)).addOnPageChangeListener((ViewPager$h)object3);
            int n3 = k0;
            ((ViewPager)((Object)object2)).setCurrentItem(n3);
            ((sU)object).b.setupWithViewPager((ViewPager)((Object)object2));
            object = this.getSupportActionBar();
            if (object != null) {
                boolean bl2 = true;
                ((ActionBar)object).n(bl2);
            }
            object = this.p2().c;
            object2 = new cq3(this);
            ((LiveData)object).e(this, (F62)object2);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionBinding");
        throw null;
    }

    public final boolean onCreateOptionsMenu(Menu menu2) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        MenuInflater menuInflater = this.getMenuInflater();
        int n3 = R$menu.chucker_transaction;
        menuInflater.inflate(n3, menu2);
        int n4 = R$id.encode_url;
        menuInflater = menu2.findItem(n4);
        Object object = new dq3(this);
        menuInflater.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)object);
        object = this.p2().b;
        k12_0 k12_02 = new k12_0(menuInflater, 1);
        ((LiveData)object).e(this, k12_02);
        return super.onCreateOptionsMenu(menu2);
    }

    public final boolean onOptionsItemSelected(MenuItem object) {
        Object object2 = "item";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getItemId();
        int n4 = R$id.share_text;
        boolean bl2 = true;
        if (n3 == n4) {
            object = new TransactionActivity$a(this);
            this.r2((Function1)object);
        } else {
            n4 = R$id.share_curl;
            if (n3 == n4) {
                object = TransactionActivity$b.c;
                this.r2((Function1)object);
            } else {
                n4 = R$id.share_file;
                if (n3 == n4) {
                    object = new TransactionActivity$c(this);
                    object2 = (HttpTransaction)this.p2().f.d();
                    if (object2 == null) {
                        int n7 = R$string.chucker_request_not_ready;
                        object = this.getString(n7);
                        Intrinsics.checkNotNullExpressionValue(object, "getString(R.string.chucker_request_not_ready)");
                        Intrinsics.checkNotNullParameter(object, "message");
                        n3 = 0;
                        object2 = null;
                        object = Toast.makeText((Context)this, (CharSequence)object, (int)0);
                        object.show();
                    } else {
                        object = (C13)((TransactionActivity$c)object).invoke(object2);
                        object2 = nu1_0.a(this);
                        fq3_0 fq3_02 = new fq3_0((C13)object, this, null);
                        int n8 = 3;
                        Ae3.d((i90_0)object2, null, null, fq3_02, n8);
                    }
                } else {
                    bl2 = super.onOptionsItemSelected((MenuItem)object);
                }
            }
        }
        return bl2;
    }

    public final Hq3 p2() {
        return (Hq3)this.Y.getValue();
    }

    public final void r2(Function1 object) {
        Object object2 = (HttpTransaction)this.p2().f.d();
        if (object2 == null) {
            int n3 = R$string.chucker_request_not_ready;
            object = this.getString(n3);
            Intrinsics.checkNotNullExpressionValue(object, "getString(R.string.chucker_request_not_ready)");
            Intrinsics.checkNotNullParameter(object, "message");
            Toast.makeText((Context)this, (CharSequence)object, (int)0).show();
            return;
        }
        object = (C13)object.invoke(object2);
        object2 = nu1_0.a(this);
        gq3_0 gq3_02 = new gq3_0((C13)object, this, null);
        Ae3.d((i90_0)object2, null, null, gq3_02, 3);
    }
}

