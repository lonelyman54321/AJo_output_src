/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
package com.ril.ajio.remoteconfig.devsettings.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.l;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ril.ajio.remoteconfig.R$id;
import com.ril.ajio.remoteconfig.R$layout;
import com.ril.ajio.remoteconfig.devsettings.Data;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity$a;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity$b;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity$c;
import com.ril.ajio.remoteconfig.devsettings.view.a;
import io.reactivex.Scheduler;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class ConfigEditActivity
extends AppCompatActivity
implements sk1_0 {
    public static final ConfigEditActivity$a Companion;
    public FirebaseRemoteConfig X;
    public i40 Y;
    public final HashMap Z;
    public ao0_0 k0;
    public EditText p0;
    public ImageView q0;
    public RecyclerView r0;
    public Toolbar s0;

    static {
        ConfigEditActivity$a configEditActivity$a;
        Companion = configEditActivity$a = new Object();
    }

    public ConfigEditActivity() {
        HashMap hashMap;
        this.Z = hashMap = new HashMap();
    }

    public final void Y(Data object, int n3) {
        String string2 = "data";
        Intrinsics.checkNotNullParameter(object, string2);
        ConfigEditActivity$c configEditActivity$c = new ConfigEditActivity$c(this, (Data)object, n3);
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = "saveListener";
        Intrinsics.checkNotNullParameter(configEditActivity$c, (String)object2);
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(configEditActivity$c, (String)object2);
        object2 = new Bundle();
        object2.putParcelable(string2, (Parcelable)object);
        object = new a();
        ((Fragment)object).setArguments((Bundle)object2);
        ((a)object).a = configEditActivity$c;
        object2 = this.getSupportFragmentManager();
        object2 = Vp0.a((FragmentManager)object2, (FragmentManager)object2);
        int n4 = R$id.container;
        ((androidx.fragment.app.a)object2).h(n4, (Fragment)object, "ConfigEditFragment", 1);
        ((k)object2).c(null);
        ((androidx.fragment.app.a)object2).d();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_config_edit;
        this.setContentView(n3);
        n3 = R$id.search_text;
        object = (EditText)this.findViewById(n3);
        Object object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.p0 = object;
        n3 = R$id.toggle_edit;
        object = (ImageView)this.findViewById(n3);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.q0 = object;
        n3 = R$id.list;
        object = (RecyclerView)this.findViewById(n3);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.r0 = object;
        n3 = R$id.progress_bar;
        Intrinsics.checkNotNullParameter((ProgressBar)this.findViewById(n3), (String)object2);
        n3 = R$id.toolbar;
        object = (Toolbar)this.findViewById(n3);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.s0 = object;
        ao0_0.Companion.getClass();
        object = ao0_0.e;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            n3 = 0;
            object = null;
        }
        this.k0 = object;
        if (object != null) {
            object = ((cw)object).c();
        } else {
            n3 = 0;
            object = null;
        }
        this.X = object;
        object = this.s0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            n3 = 0;
            object = null;
        }
        this.setSupportActionBar((Toolbar)object);
        this.setTitle("Config Editor");
        object = this.p0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchText");
            n3 = 0;
            object = null;
        }
        Object object3 = new r40_0(this);
        object.addTextChangedListener((TextWatcher)object3);
        object = new yv2_0(this);
        object3 = this.q0;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toggleEdit");
            object3 = null;
        }
        int n4 = 0;
        Object object4 = new n40(0, object, this);
        object3.setOnClickListener((View.OnClickListener)object4);
        object3 = this.getLayoutInflater();
        object4 = "getLayoutInflater(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        this.Y = object = new i40((LayoutInflater)object3, this);
        object = this.r0;
        object3 = "recyclerView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object = null;
        }
        n4 = 1;
        object4 = new l((Context)this, n4);
        ((RecyclerView)object).addItemDecoration((RecyclerView$n)object4);
        object = this.r0;
        if (object != null) {
            object2 = object;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        }
        object = this.Y;
        ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        object = new ConfigEditActivity$b(this);
        object2 = String.valueOf(false);
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter(object2, "editOnly");
        object3 = new o40((ConfigEditActivity$b)object, (String)object2);
        object2 = new o53_0((Callable)object3);
        object3 = qt2_2.b;
        object2 = ((g53_0)object2).h((Scheduler)object3);
        object3 = ti_2.a();
        object2 = ((g53_0)object2).e((Scheduler)object3);
        object3 = ((ConfigEditActivity$b)object).b;
        object4 = ((ConfigEditActivity$b)object).c;
        ((ConfigEditActivity$b)object).a = object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)object4);
    }
}

