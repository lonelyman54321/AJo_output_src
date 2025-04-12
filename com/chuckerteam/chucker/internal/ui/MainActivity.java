/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 */
package com.chuckerteam.chucker.internal.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;
import com.chuckerteam.chucker.internal.ui.BaseChuckerActivity;
import com.chuckerteam.chucker.internal.ui.MainActivity$a;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;

public final class MainActivity
extends BaseChuckerActivity
implements hq3$a,
ln3$a {
    public qu_0 Y;

    public final void B2(long l2) {
        Intrinsics.checkNotNullParameter(this, "context");
        Intent intent = new Intent((Context)this, ThrowableActivity.class);
        intent.putExtra("transaction_id", l2);
        this.startActivity(intent);
    }

    public final void D5(long l2) {
        Intrinsics.checkNotNullParameter(this, "context");
        Intent intent = new Intent((Context)this, TransactionActivity.class);
        intent.putExtra("transaction_id", l2);
        this.startActivity(intent);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = qu_0.inflate(this.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(object, "inflate(layoutInflater)");
        this.Y = object;
        String string2 = "mainBinding";
        if (object != null) {
            Object object2 = ((qu_0)object).a;
            this.setContentView((View)object2);
            object2 = ((qu_0)object).c;
            this.setSupportActionBar((Toolbar)object2);
            Object object3 = this.getApplicationInfo();
            Object object4 = this.getPackageManager();
            object3 = object3.loadLabel(object4);
            Intrinsics.checkNotNullExpressionValue(object3, "applicationInfo.loadLabel(packageManager)");
            ((Toolbar)object2).setSubtitle((CharSequence)object3);
            object3 = this.getSupportFragmentManager();
            object4 = "supportFragmentManager";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object2 = new B71((Context)this, (FragmentManager)object3);
            object3 = ((qu_0)object).d;
            ((ViewPager)((Object)object3)).setAdapter((Uk2)object2);
            object = ((qu_0)object).b;
            ((TabLayout)((Object)object)).setupWithViewPager((ViewPager)((Object)object3));
            object2 = new MainActivity$a(this, (TabLayout)((Object)object));
            ((ViewPager)((Object)object3)).addOnPageChangeListener((ViewPager$h)object2);
            object = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object, "intent");
            int n3 = 1;
            int n4 = object.getIntExtra("EXTRA_SCREEN", n3);
            object2 = this.Y;
            if (object2 != null) {
                if (n4 == n3) {
                    n3 = 0;
                    object3 = null;
                }
                ((qu_0)object2).d.setCurrentItem(n3);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(string2);
        throw null;
    }

    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        int n3 = 1;
        int n4 = intent.getIntExtra("EXTRA_SCREEN", n3);
        qu_0 qu_02 = this.Y;
        if (qu_02 != null) {
            if (n4 == n3) {
                n3 = 0;
            }
            qu_02.d.setCurrentItem(n3);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
        throw null;
    }
}

