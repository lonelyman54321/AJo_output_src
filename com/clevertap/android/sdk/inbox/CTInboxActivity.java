/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity$c;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.c;
import com.clevertap.android.sdk.inbox.CTInboxActivity$a;
import com.clevertap.android.sdk.inbox.CTInboxActivity$b;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment$a;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$TabLayoutOnPageChangeListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class CTInboxActivity
extends FragmentActivity
implements CTInboxListViewFragment$a,
pq0_0 {
    public static int u0;
    public ri_1 X;
    public CTInboxStyleConfig Y;
    public TabLayout Z;
    public ViewPager k0;
    public CleverTapInstanceConfig p0;
    public WeakReference q0;
    public a r0;
    public c s0;
    public WeakReference t0;

    public final void a2(boolean bl2) {
        c c2 = this.s0;
        InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)this.t0.get();
        c2.a(bl2, inAppNotificationActivity$c);
    }

    public final void d(CTInboxMessage cTInboxMessage) {
        Object object = cTInboxMessage.l;
        b.j();
        b.j();
        object = this.p2();
        if (object != null) {
            object.d(cTInboxMessage);
        }
    }

    public final void h(int n3, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap hashMap, int n4) {
        CTInboxActivity$b cTInboxActivity$b = this.p2();
        if (cTInboxActivity$b != null) {
            cTInboxActivity$b.e(cTInboxMessage, bundle, hashMap);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onCreate(Bundle object) {
        block21: {
            Object object2;
            int n3;
            int n4 = 1;
            super.onCreate((Bundle)object);
            object = this.getIntent();
            object = object.getExtras();
            if (object == null) break block21;
            Object object3 = "styleConfig";
            object3 = object.getParcelable((String)object3);
            this.Y = object3 = (CTInboxStyleConfig)object3;
            object3 = "configBundle";
            if ((object = object.getBundle((String)object3)) != null) {
                object3 = "config";
                object = object.getParcelable((String)object3);
                this.p0 = object = (CleverTapInstanceConfig)object;
            }
            object = this.getApplicationContext();
            object3 = this.p0;
            this.r0 = object = a.k((Context)object, (CleverTapInstanceConfig)object3);
            if (object != null) {
                object3 = new WeakReference(object);
                this.q0 = object3;
                object = this.p0;
                object = a.k((Context)this, (CleverTapInstanceConfig)object);
                object = ((a)object).b;
                object = ((H80)object).k;
                object3 = new WeakReference(object);
                this.t0 = object3;
                object3 = this.p0;
                this.s0 = object = new c(this, (CleverTapInstanceConfig)object3);
            }
            object = this.getResources();
            object = object.getConfiguration();
            u0 = n3 = ((Configuration)object).orientation;
            n3 = R$layout.inbox_activity;
            this.setContentView(n3);
            this.r0.b.b.getClass();
            new WeakReference<CTInboxActivity>(this);
            n3 = R$id.toolbar;
            object = (Toolbar)this.findViewById(n3);
            object3 = this.Y.e;
            ((Toolbar)object).setTitle((CharSequence)object3);
            int n7 = Color.parseColor((String)this.Y.f);
            ((Toolbar)object).setTitleTextColor(n7);
            n7 = Color.parseColor((String)this.Y.d);
            object.setBackgroundColor(n7);
            object3 = this.getResources();
            int n8 = R$drawable.ct_ic_arrow_back_white_24dp;
            Object object4 = WK2.a;
            int n10 = 0;
            object4 = null;
            object3 = object3.getDrawable(n8, null);
            if (object3 != null) {
                object2 = this.Y.a;
                n8 = Color.parseColor((String)object2);
                object4 = PorterDuff.Mode.SRC_IN;
                object3.setColorFilter(n8, (PorterDuff.Mode)object4);
            }
            ((Toolbar)object).setNavigationIcon((Drawable)object3);
            object3 = new CTInboxActivity$a(this);
            ((Toolbar)object).setNavigationOnClickListener((View.OnClickListener)object3);
            n3 = R$id.inbox_linear_layout;
            object = (LinearLayout)this.findViewById(n3);
            n7 = Color.parseColor((String)this.Y.c);
            object.setBackgroundColor(n7);
            n7 = R$id.tab_layout;
            object3 = (TabLayout)object.findViewById(n7);
            this.Z = object3;
            n7 = R$id.view_pager;
            object = (ViewPager)object.findViewById(n7);
            this.k0 = object;
            n3 = R$id.no_message_view;
            object = (String[])this.findViewById(n3);
            object3 = new Bundle();
            object4 = this.p0;
            object3.putParcelable("config", (Parcelable)object4);
            object4 = this.Y;
            object3.putParcelable("styleConfig", (Parcelable)object4);
            object2 = this.Y.l;
            n10 = 0;
            object4 = null;
            if (object2 != null && (n8 = ((String[])object2).length) > 0) {
                n8 = 1;
            } else {
                n8 = 0;
                object2 = null;
            }
            if (n8 == 0) {
                Object object5;
                object2 = this.k0;
                int n14 = 8;
                object2.setVisibility(n14);
                this.Z.setVisibility(n14);
                object2 = this.r0;
                if (object2 != null) {
                    block23: {
                        Object object6;
                        block22: {
                            object5 = ((a)object2).b.h.b;
                            // MONITORENTER : object5
                            object6 = ((a)object2).b;
                            object6 = ((H80)object6).j;
                            object6 = ((l80_0)object6).e;
                            if (object6 == null) break block22;
                            object2 = ((oi_1)object6).d();
                            n8 = ((ArrayList)object2).size();
                            // MONITOREXIT : object5
                            break block23;
                        }
                        object6 = ((a)object2).f();
                        ((a)object2).b();
                        object2 = "Notification Inbox not initialized";
                        object6.getClass();
                        b.f((String)object2);
                        // MONITOREXIT : object5
                        n8 = -1;
                    }
                    if (n8 == 0) {
                        n4 = Color.parseColor((String)this.Y.c);
                        object.setBackgroundColor(n4);
                        object.setVisibility(0);
                        String string2 = this.Y.g;
                        object.setText((CharSequence)string2);
                        string2 = this.Y.h;
                        n4 = Color.parseColor((String)string2);
                        object.setTextColor(n4);
                        return;
                    }
                }
                n8 = R$id.list_view_fragment;
                object2 = (FrameLayout)this.findViewById(n8);
                object2.setVisibility(0);
                object.setVisibility(n14);
                object = this.getSupportFragmentManager().c.f().iterator();
                while (true) {
                    CharSequence charSequence;
                    if ((n8 = (int)(object.hasNext() ? 1 : 0)) == 0) {
                        if (n10 != 0) return;
                        object = new CTInboxListViewFragment();
                        ((Fragment)object).setArguments((Bundle)object3);
                        object3 = this.getSupportFragmentManager();
                        object3 = Vp0.a((FragmentManager)object3, (FragmentManager)object3);
                        n8 = R$id.list_view_fragment;
                        object4 = new StringBuilder();
                        charSequence = this.p0.a;
                        object5 = ":CT_INBOX_LIST_VIEW_FRAGMENT";
                        object4 = h30_0.a((StringBuilder)object4, (String)charSequence, (String)object5);
                        ((androidx.fragment.app.a)object3).h(n8, (Fragment)object, (String)object4, n4);
                        ((androidx.fragment.app.a)object3).d();
                        return;
                    }
                    object2 = (Fragment)object.next();
                    charSequence = ((Fragment)object2).getTag();
                    if (charSequence == null) continue;
                    object2 = ((Fragment)object2).getTag();
                    charSequence = new StringBuilder();
                    object5 = this.p0.a;
                    ((StringBuilder)charSequence).append((String)object5);
                    object5 = ":CT_INBOX_LIST_VIEW_FRAGMENT";
                    ((StringBuilder)charSequence).append((String)object5);
                    n8 = (int)(((String)object2).equalsIgnoreCase((String)(charSequence = ((StringBuilder)charSequence).toString())) ? 1 : 0);
                    if (n8 != 0) continue;
                    n10 = 1;
                }
            }
            this.k0.setVisibility(0);
            object = this.Y.l;
            if (object == null) {
                object = new ArrayList();
            } else {
                object = Arrays.asList(object);
                object = object2 = new ArrayList(object);
            }
            Object object7 = this.getSupportFragmentManager();
            int n15 = ((ArrayList)object).size() + n4;
            object2 = new ri_1((FragmentManager)object7, n15);
            this.X = object2;
            this.Z.setVisibility(0);
            this.Z.setTabGravity(0);
            this.Z.setTabMode(n4);
            object2 = this.Z;
            int n16 = Color.parseColor((String)this.Y.j);
            ((TabLayout)((Object)object2)).setSelectedTabIndicatorColor(n16);
            object2 = this.Z;
            n16 = Color.parseColor((String)this.Y.m);
            n15 = Color.parseColor((String)this.Y.i);
            ((TabLayout)((Object)object2)).setTabTextColors(n16, n15);
            object2 = this.Z;
            n16 = Color.parseColor((String)this.Y.k);
            object2.setBackgroundColor(n16);
            object2 = (Bundle)object3.clone();
            object2.putInt("position", 0);
            object7 = new CTInboxListViewFragment();
            ((Fragment)object7).setArguments((Bundle)object2);
            object2 = this.X;
            Object object8 = this.Y.b;
            Fragment[] fragmentArray = ((ri_1)object2).h;
            fragmentArray[0] = object7;
            object2 = ((ri_1)object2).i;
            ((ArrayList)object2).add(object8);
            while (true) {
                if (n10 >= (n8 = ((ArrayList)object).size())) {
                    object = this.k0;
                    Object object9 = this.X;
                    ((ViewPager)((Object)object)).setAdapter((Uk2)object9);
                    this.X.h();
                    object = this.k0;
                    object3 = this.Z;
                    object9 = new TabLayout$TabLayoutOnPageChangeListener((TabLayout)((Object)object3));
                    ((ViewPager)((Object)object)).addOnPageChangeListener((ViewPager$h)object9);
                    object = this.Z;
                    object9 = this.k0;
                    ((TabLayout)((Object)object)).setupWithViewPager((ViewPager)((Object)object9));
                    return;
                }
                object2 = (String)((ArrayList)object).get(n10);
                object7 = (Bundle)object3.clone();
                object7.putInt("position", n10 += n4);
                object7.putString("filter", (String)object2);
                object8 = new CTInboxListViewFragment();
                ((Fragment)object8).setArguments((Bundle)object7);
                object7 = this.X;
                fragmentArray = ((ri_1)object7).h;
                fragmentArray[n10] = object8;
                object7 = ((ri_1)object7).i;
                ((ArrayList)object7).add(object2);
                object2 = this.k0;
                ((ViewPager)((Object)object2)).setOffscreenPageLimit(n10);
            }
        }
        try {
            object = new IllegalArgumentException();
            throw object;
        }
        catch (Throwable throwable) {}
        b.l();
    }

    public final void onDestroy() {
        int n3;
        this.r0.b.b.getClass();
        boolean bl2 = false;
        Fragment fragment = null;
        Object object = new WeakReference(null);
        object = this.Y.l;
        if (object != null && (n3 = ((String[])object).length) > 0) {
            object = this.getSupportFragmentManager().c.f().iterator();
            while (bl2 = object.hasNext()) {
                fragment = (Fragment)object.next();
                boolean bl3 = fragment instanceof CTInboxListViewFragment;
                if (!bl3) continue;
                fragment.toString();
                b.j();
                List list = this.getSupportFragmentManager().c.f();
                list.remove(fragment);
            }
        }
        super.onDestroy();
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        super.onRequestPermissionsResult(n3, (String[])object, nArray);
        object = this.p0;
        yi_1.a((Context)this, (CleverTapInstanceConfig)object);
        object = null;
        yi_1.c = false;
        Object object2 = this.p0;
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(object2, "config");
        object2 = jh_1.a((CleverTapInstanceConfig)object2).a();
        xi_2 xi_22 = new xi_2((Context)this);
        String string2 = "updateCacheToDisk";
        ((com.clevertap.android.sdk.task.a)object2).c(string2, xi_22);
        int n4 = 102;
        if (n3 == n4) {
            n3 = nArray.length;
            if (n3 > 0 && (n3 = nArray[0]) == 0) {
                InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)this.t0.get();
                inAppNotificationActivity$c.a();
            } else {
                InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)this.t0.get();
                inAppNotificationActivity$c.b();
            }
        }
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Object object = this.s0;
        int n4 = ((c)object).d;
        if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
            object = "android.permission.POST_NOTIFICATIONS";
            n4 = t70.checkSelfPermission((Context)this, (String)object);
            if (n4 == 0) {
                object = (InAppNotificationActivity$c)this.t0.get();
                object.a();
            } else {
                object = (InAppNotificationActivity$c)this.t0.get();
                object.b();
            }
        }
    }

    public final CTInboxActivity$b p2() {
        Object object = this.q0;
        object = ((Reference)object).get();
        try {
            object = (CTInboxActivity$b)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        if (object == null) {
            b b2 = this.p0.b();
            String string2 = this.p0.a;
            String string3 = "InboxActivityListener is null for notification inbox ";
            b2.b(string2, string3);
        }
        return object;
    }
}

