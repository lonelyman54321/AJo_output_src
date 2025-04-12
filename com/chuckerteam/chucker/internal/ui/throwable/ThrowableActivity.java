/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 */
package com.chuckerteam.chucker.internal.ui.throwable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$menu;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.ui.BaseChuckerActivity;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity$a;
import com.chuckerteam.chucker.internal.ui.throwable.ThrowableActivity$b;
import java.text.DateFormat;
import java.text.Format;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class ThrowableActivity
extends BaseChuckerActivity {
    public static final /* synthetic */ int k0;
    public final D Y;
    public rU Z;

    public ThrowableActivity() {
        D d2;
        ThrowableActivity$b throwableActivity$b = new ThrowableActivity$b(this);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(on3_0.class);
        ThrowableActivity$a throwableActivity$a = new ThrowableActivity$a(this);
        this.Y = d2 = new D(yn1_22, throwableActivity$a, throwableActivity$b);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = rU.inflate(this.getLayoutInflater());
        Object object2 = "inflate(layoutInflater)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.Z = object;
        if (object != null) {
            object2 = ((rU)object).a;
            this.setContentView((View)object2);
            object2 = ((rU)object).d;
            this.setSupportActionBar((Toolbar)object2);
            object = ((rU)object).b.c;
            int bl2 = 8;
            object.setVisibility(bl2);
            object = this.getSupportActionBar();
            if (object != null) {
                boolean bl3 = true;
                ((ActionBar)object).n(bl3);
            }
            object = ((on3_0)this.Y.getValue()).a;
            object2 = new kn3(this);
            ((LiveData)object).e(this, (F62)object2);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errorBinding");
        throw null;
    }

    public final boolean onCreateOptionsMenu(Menu menu2) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        MenuInflater menuInflater = this.getMenuInflater();
        Intrinsics.checkNotNullExpressionValue(menuInflater, "menuInflater");
        int n3 = R$menu.chucker_throwable;
        menuInflater.inflate(n3, menu2);
        return super.onCreateOptionsMenu(menu2);
    }

    public final boolean onOptionsItemSelected(MenuItem object) {
        int n3 = 1;
        int n4 = 2;
        int n7 = 3;
        String string2 = "item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n8 = object.getItemId();
        int n10 = R$id.share_text;
        if (n8 == n10) {
            object = (NF2)((on3_0)this.Y.getValue()).a.d();
            if (object != null) {
                n8 = R$string.chucker_share_throwable_content;
                Object object2 = DateFormat.getDateTimeInstance(n7, n4);
                Object object3 = object.c;
                object2 = ((Format)object2).format(object3);
                Intrinsics.checkNotNullExpressionValue(object2, "getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM)\n                .format(this.date)");
                object3 = object.e;
                String string3 = object.f;
                String string4 = object.d;
                object = object.b;
                int n14 = 5;
                Object[] objectArray = new Object[n14];
                objectArray[0] = object2;
                objectArray[n3] = string4;
                objectArray[n4] = object;
                objectArray[n7] = object3;
                int n15 = 4;
                objectArray[n15] = string3;
                object = this.getString(n8, objectArray);
                Intrinsics.checkNotNullExpressionValue(object, "getString(\n            R.string.chucker_share_throwable_content,\n            throwable.formattedDate,\n            throwable.clazz,\n            throwable.tag,\n            throwable.message,\n            throwable.content\n        )");
                Object object4 = new E13$a((Context)this);
                string2 = ((E13$a)object4).a;
                string2.setType("text/plain");
                n7 = R$string.chucker_share_throwable_title;
                String string5 = this.getString(n7);
                ((E13$a)object4).b = string5;
                n7 = R$string.chucker_share_throwable_subject;
                string5 = this.getString(n7);
                object2 = "android.intent.extra.SUBJECT";
                string2.putExtra((String)object2, string5);
                string5 = "android.intent.extra.TEXT";
                string2.putExtra(string5, (CharSequence)object);
                object = ((E13$a)object4).a();
                object4 = ((E13$a)object4).b;
                object = Intent.createChooser((Intent)object, (CharSequence)object4);
                this.startActivity((Intent)object);
            }
        } else {
            n3 = super.onOptionsItemSelected(object);
        }
        return n3 != 0;
    }
}

