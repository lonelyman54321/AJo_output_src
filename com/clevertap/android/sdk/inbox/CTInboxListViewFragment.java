/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment$1;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment$a;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInboxListViewFragment
extends Fragment {
    public CleverTapInstanceConfig a;
    public final boolean b;
    public ArrayList c;
    public LinearLayout d;
    public MediaPlayerRecyclerView e;
    public RecyclerView f;
    public pi_2 g;
    public CTInboxStyleConfig h;
    public boolean i;
    public WeakReference j;
    public int k;
    public pq0_0 l;

    public CTInboxListViewFragment() {
        ArrayList arrayList;
        boolean bl2;
        this.b = bl2 = qb3_2.b;
        this.c = arrayList = new ArrayList();
        this.i = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Oa(String object) {
        Intent intent;
        block10: {
            String string2 = "";
            String string3 = "android.intent.action.VIEW";
            String string4 = "\n";
            try {
                object = ((String)object).replace(string4, string2);
                string4 = "\r";
            }
            catch (Throwable throwable) {
                return;
            }
            object = ((String)object).replace(string4, string2);
            object = Uri.parse((String)object);
            intent = new Intent(string3, (Uri)object);
            object = this.getActivity();
            if (object == null) break block10;
            object = this.getActivity();
            yz3_0.k((Context)object, intent);
        }
        this.startActivity(intent);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Pa(int var1_1, String var2_2, JSONObject var3_3, HashMap var4_6, int var5_7) {
        block28: {
            block27: {
                block29: {
                    block22: {
                        var6_8 = false;
                        var7_9 = null;
                        if (var3_3 == null) break block29;
                        try {
                            block26: {
                                block25: {
                                    block24: {
                                        block23: {
                                            var8_10 = this.c;
                                            var8_10 = var8_10.get(var1_1);
                                            var8_10 = (CTInboxMessage)var8_10;
                                            var8_10 = var8_10.j;
                                            var8_10 = var8_10.get(0);
                                            var8_10 = (CTInboxMessageContent)var8_10;
                                            var8_10.getClass();
                                            var8_10 = CTInboxMessageContent.e((JSONObject)var3_3);
                                            var9_11 = "url";
                                            var10_12 = var8_10.equalsIgnoreCase((String)var9_11);
                                            if (!var10_12) break block22;
                                            var8_10 = this.c;
                                            var8_10 = var8_10.get(var1_1);
                                            var8_10 = (CTInboxMessage)var8_10;
                                            var8_10 = var8_10.j;
                                            var7_9 = var8_10.get(0);
                                            var7_9 = (CTInboxMessageContent)var7_9;
                                            var7_9.getClass();
                                            var7_9 = "text";
                                            var8_10 = "android";
                                            var9_11 = "url";
                                            var11_13 /* !! */  = null;
                                            if (var3_3 == null) break block26;
                                            try {
                                                var12_14 = var3_3.has((String)var9_11);
                                                if (!var12_14) break block23;
                                                var3_3 = var3_3.getJSONObject((String)var9_11);
                                                break block24;
                                            }
                                            catch (JSONException var3_4) {
                                                break block25;
                                            }
                                        }
                                        var13_15 = false;
                                        var3_3 = null;
                                    }
                                    if (var3_3 != null) {
                                        var10_12 = var3_3.has((String)var8_10);
                                        if (var10_12) {
                                            var3_3 = var3_3.getJSONObject((String)var8_10);
                                        } else {
                                            var13_15 = false;
                                            var3_3 = null;
                                        }
                                        var8_10 = "";
                                        if (var3_3 != null && (var10_12 = var3_3.has((String)var7_9))) {
                                            var3_3 = var3_3.getString((String)var7_9);
                                            var11_13 /* !! */  = var3_3;
                                            break block26;
                                        } else {
                                            var11_13 /* !! */  = var8_10;
                                        }
                                    }
                                    break block26;
                                }
                                var3_4.getLocalizedMessage();
                                com.clevertap.android.sdk.b.j();
                            }
                            if (var11_13 /* !! */  != null) {
                                this.Oa((String)var11_13 /* !! */ );
                            }
                            break block27;
                        }
                        catch (Throwable var14_16) {
                            break block28;
                        }
                    }
                    var9_11 = "rfp";
                    var15_19 = var8_10.contains((CharSequence)var9_11);
                    if (var15_19 && (var8_10 = this.l) != null) {
                        var8_10 = this.c;
                        var8_10 = var8_10.get(var1_1);
                        var8_10 = (CTInboxMessage)var8_10;
                        var8_10 = var8_10.j;
                        var8_10 = var8_10.get(0);
                        var8_10 = (CTInboxMessageContent)var8_10;
                        var8_10.getClass();
                        var8_10 = "fbSettings";
                        try {
                            var10_12 = var3_3.has((String)var8_10);
                            if (var10_12) {
                                var6_8 = var3_3.getBoolean((String)var8_10);
                            }
                        }
                        catch (JSONException var3_5) {
                            var3_5.getLocalizedMessage();
                            com.clevertap.android.sdk.b.j();
                        }
                        var3_3 = this.l;
                        var3_3.a2(var6_8);
                    }
                    break block27;
                }
                var3_3 = this.c;
                var3_3 = var3_3.get(var1_1);
                var3_3 = (CTInboxMessage)var3_3;
                var3_3 = var3_3.j;
                var3_3 = var3_3.get(0);
                var3_3 = (CTInboxMessageContent)var3_3;
                var3_3 = var3_3.a;
                if (var3_3 != null) {
                    this.Oa((String)var3_3);
                }
            }
            var11_13 /* !! */  = new Bundle();
            var3_3 = this.c;
            var3_3 = var3_3.get(var1_1);
            var3_3 = (CTInboxMessage)var3_3;
            var3_3 = var3_3.q;
            if (var3_3 == null) {
                var3_3 = new JSONObject();
            }
            var7_9 = var3_3.keys();
            while (var15_19 = var7_9.hasNext()) {
                var8_10 = var7_9.next();
                var9_11 = "wzrk_";
                var10_12 = (var8_10 = (String)var8_10).startsWith((String)var9_11);
                if (!var10_12) continue;
                var9_11 = var3_3.getString((String)var8_10);
                var11_13 /* !! */ .putString((String)var8_10, (String)var9_11);
            }
            if (var2_2 != null && !(var13_15 = var2_2.isEmpty())) {
                var3_3 = "wzrk_c2a";
                var11_13 /* !! */ .putString((String)var3_3, (String)var2_2);
            }
            try {
                var2_2 = this.j;
                var2_2 = var2_2.get();
                var2_2 = (CTInboxListViewFragment$a)var2_2;
lbl126:
                // 2 sources

                while (true) {
                    var7_9 = var2_2;
                    break;
                }
            }
            catch (Throwable v0) {
                var2_2 = null;
                ** continue;
            }
            if (var2_2 != null) ** GOTO lbl134
            {
                com.clevertap.android.sdk.b.j();
lbl134:
                // 2 sources

                if (var7_9 == null) return;
                var2_2 = this.getActivity();
                var2_2.getBaseContext();
                var2_2 = this.c;
                var14_17 = var2_2.get(var1_1);
                var9_11 = var14_17;
                var9_11 = (CTInboxMessage)var14_17;
                var15_19 = false;
                var8_10 = null;
                var7_9.h(0, (CTInboxMessage)var9_11, var11_13 /* !! */ , var4_6, var5_7);
                return;
            }
        }
        var14_18 = var14_16.getCause();
        Objects.toString(var14_18);
        com.clevertap.android.sdk.b.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Qa(int n3, int n4) {
        Throwable throwable2;
        block8: {
            boolean bl2;
            String string2;
            Object object;
            Object object2;
            Object object3;
            Bundle bundle;
            block9: {
                try {
                    boolean bl3;
                    bundle = new Bundle();
                    object3 = this.c;
                    object3 = ((ArrayList)object3).get(n3);
                    object3 = (CTInboxMessage)object3;
                    object3 = ((CTInboxMessage)object3).q;
                    if (object3 == null) {
                        object3 = new JSONObject();
                    }
                    object2 = object3.keys();
                    while (bl3 = object2.hasNext()) {
                        object = object2.next();
                        string2 = "wzrk_";
                        bl2 = ((String)(object = (String)object)).startsWith(string2);
                        if (!bl2) continue;
                        string2 = object3.getString((String)object);
                        bundle.putString((String)object, string2);
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                try {
                    object3 = this.j;
                    object3 = ((Reference)object3).get();
                    object3 = (CTInboxListViewFragment$a)object3;
                }
                catch (Throwable throwable3) {
                    object3 = null;
                }
                if (object3 != null) break block9;
                com.clevertap.android.sdk.b.j();
            }
            if (object3 != null) {
                object2 = this.getActivity();
                object2.getBaseContext();
                object2 = this.c;
                object = object2 = ((ArrayList)object2).get(n3);
                object = (CTInboxMessage)object2;
                bl2 = false;
                string2 = null;
                int n7 = -1;
                object3.h(n4, (CTInboxMessage)object, bundle, null, n7);
            }
            object3 = this.c;
            Object object4 = ((ArrayList)object3).get(n3);
            object4 = (CTInboxMessage)object4;
            object4 = ((CTInboxMessage)object4).j;
            object4 = ((ArrayList)object4).get(n4);
            object4 = (CTInboxMessageContent)object4;
            object4 = ((CTInboxMessageContent)object4).a;
            this.Oa((String)object4);
            return;
        }
        Throwable throwable4 = throwable2.getCause();
        Objects.toString(throwable4);
        com.clevertap.android.sdk.b.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onAttach(Context object) {
        int n3;
        ArrayList<Object> arrayList;
        Object object2;
        block10: {
            Object object4;
            int n7;
            Object object5;
            Object object6;
            Object object3;
            block11: {
                block9: {
                    super.onAttach((Context)object);
                    object2 = this.getArguments();
                    if (object2 == null) return;
                    arrayList = (CleverTapInstanceConfig)object2.getParcelable("config");
                    this.a = arrayList;
                    arrayList = (CTInboxStyleConfig)object2.getParcelable("styleConfig");
                    this.h = arrayList;
                    arrayList = "position";
                    int n4 = -1;
                    this.k = n3 = object2.getInt((String)((Object)arrayList), n4);
                    object2 = this.getArguments();
                    if (object2 == null) break block10;
                    n4 = 0;
                    object2 = object2.getString("filter", null);
                    arrayList = this.getActivity();
                    object3 = this.a;
                    if ((arrayList = com.clevertap.android.sdk.a.k(arrayList, (CleverTapInstanceConfig)object3)) == null) break block10;
                    com.clevertap.android.sdk.b.j();
                    com.clevertap.android.sdk.b.c();
                    object3 = new Object();
                    object6 = ((a)((Object)arrayList)).b.h.b;
                    // MONITORENTER : object6
                    object5 = ((a)((Object)arrayList)).b;
                    object5 = ((H80)object5).j;
                    object5 = ((l80_0)object5).e;
                    if (object5 == null) break block9;
                    arrayList = ((oi_1)object5).d();
                    arrayList = arrayList.iterator();
                    while ((n7 = arrayList.hasNext()) != 0) {
                        object5 = arrayList.next();
                        object5 = (ui_2)object5;
                        object4 = ((ui_2)object5).c();
                        object4.toString();
                        com.clevertap.android.sdk.b.j();
                        object5 = ((ui_2)object5).c();
                        object4 = new CTInboxMessage((JSONObject)object5);
                        ((ArrayList)object3).add(object4);
                    }
                    break block11;
                }
                object5 = ((a)((Object)arrayList)).f();
                ((a)((Object)arrayList)).b();
                arrayList = "Notification Inbox not initialized";
                object5.getClass();
                com.clevertap.android.sdk.b.f((String)((Object)arrayList));
                // MONITOREXIT : object6
            }
            if (object2 != null) {
                boolean bl2;
                arrayList = new ArrayList<Object>();
                object3 = ((ArrayList)object3).iterator();
                while (bl2 = object3.hasNext()) {
                    boolean bl3;
                    object6 = (CTInboxMessage)object3.next();
                    object5 = ((CTInboxMessage)object6).n;
                    if (object5 == null || (n7 = ((ArrayList)object5).size()) <= 0) continue;
                    object5 = ((CTInboxMessage)object6).n.iterator();
                    while (bl3 = object5.hasNext()) {
                        object4 = (String)object5.next();
                        bl3 = ((String)object4).equalsIgnoreCase((String)object2);
                        if (!bl3) continue;
                        arrayList.add(object6);
                    }
                }
                object3 = arrayList;
            }
            this.c = object3;
        }
        n3 = object instanceof CTInboxActivity;
        if (n3 != 0) {
            object2 = (CTInboxListViewFragment$a)((Object)this.getActivity());
            arrayList = new ArrayList<Object>(object2);
            this.j = arrayList;
        }
        if ((n3 = object instanceof pq0_0) == 0) return;
        this.l = object = (pq0_0)object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        int n3 = R$layout.inbox_list_view;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        int n4 = R$id.list_view_linear_layout;
        object = (LinearLayout)layoutInflater.findViewById(n4);
        this.d = object;
        n3 = Color.parseColor((String)this.h.c);
        object.setBackgroundColor(n3);
        n4 = R$id.list_view_no_message_view;
        object = (TextView)layoutInflater.findViewById(n4);
        object2 = this.c;
        n3 = ((ArrayList)object2).size();
        if (n3 <= 0) {
            object.setVisibility(0);
            object2 = this.h.g;
            object.setText((CharSequence)object2);
            n3 = Color.parseColor((String)this.h.h);
            object.setTextColor(n3);
            return layoutInflater;
        }
        object.setVisibility(8);
        object2 = this.getActivity();
        object = new LinearLayoutManager((Context)object2);
        Object object3 = this.c;
        object2 = new RecyclerView$f();
        Objects.toString(object3);
        com.clevertap.android.sdk.b.j();
        ((pi_2)object2).b = object3;
        ((pi_2)object2).a = this;
        this.g = object2;
        n3 = (int)(this.b ? 1 : 0);
        if (n3 != 0) {
            object3 = this.getActivity();
            this.e = object2 = new MediaPlayerRecyclerView((Context)object3);
            object2.setVisibility(0);
            this.e.setLayoutManager((RecyclerView$o)object);
            object = this.e;
            object2 = new yb3_1();
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
            object = this.e;
            object2 = new DefaultItemAnimator();
            ((RecyclerView)object).setItemAnimator((RecyclerView$l)object2);
            object = this.e;
            object2 = this.g;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
            this.g.notifyDataSetChanged();
            object = this.d;
            object2 = this.e;
            object.addView((View)object2);
            n4 = (int)(this.i ? 1 : 0);
            if (n4 != 0 && (n4 = this.k) <= 0) {
                object2 = Looper.getMainLooper();
                object = new Handler((Looper)object2);
                object2 = new CTInboxListViewFragment$1(this);
                long l2 = 1000L;
                object.postDelayed((Runnable)object2, l2);
                this.i = false;
            }
        } else {
            n3 = R$id.list_view_recycler_view;
            this.f = object2 = (RecyclerView)layoutInflater.findViewById(n3);
            object2.setVisibility(0);
            this.f.setLayoutManager((RecyclerView$o)object);
            object = this.f;
            object2 = new yb3_1();
            ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
            object = this.f;
            object2 = new DefaultItemAnimator();
            ((RecyclerView)object).setItemAnimator((RecyclerView$l)object2);
            object = this.f;
            object2 = this.g;
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
            object = this.g;
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        return layoutInflater;
    }

    public final void onDestroy() {
        super.onDestroy();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.e;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.a.pause();
            mediaPlayerRecyclerView.e = null;
        }
    }

    public final void onPause() {
        super.onPause();
        Object object = this.e;
        if (object != null) {
            object = ((MediaPlayerRecyclerView)object).a;
            object.setPlayWhenReady(false);
        }
    }

    public final void onResume() {
        super.onResume();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.e;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.a();
            mediaPlayerRecyclerView.b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Object object = this.e;
        String string2 = "recyclerLayoutState";
        if (object != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
            object = this.e.getLayoutManager().onSaveInstanceState();
            bundle.putParcelable(string2, (Parcelable)object);
        }
        if ((object = this.f) != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
            object = this.f.getLayoutManager().onSaveInstanceState();
            bundle.putParcelable(string2, (Parcelable)object);
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            bundle = bundle.getParcelable("recyclerLayoutState");
            Object object = this.e;
            if (object != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
                object = this.e.getLayoutManager();
                ((RecyclerView$o)object).onRestoreInstanceState((Parcelable)bundle);
            }
            if ((object = this.f) != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
                object = this.f.getLayoutManager();
                ((RecyclerView$o)object).onRestoreInstanceState((Parcelable)bundle);
            }
        }
    }
}

