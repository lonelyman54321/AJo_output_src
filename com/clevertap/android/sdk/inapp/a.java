/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class a
extends Fragment {
    public CloseImageView a = null;
    public CleverTapInstanceConfig b;
    public Context c;
    public int d;
    public CTInAppNotification e;
    public final AtomicBoolean f;
    public WeakReference g;
    public pq0_0 h;
    public ol0_1 i;

    public a() {
        AtomicBoolean atomicBoolean;
        this.f = atomicBoolean = new AtomicBoolean();
    }

    public abstract void Oa();

    public final void Pa(Bundle bundle) {
        this.Oa();
        lf1_1 lf1_12 = this.Ra();
        if (lf1_12 != null) {
            CTInAppNotification cTInAppNotification = this.e;
            lf1_12.N1(cTInAppNotification, bundle);
        }
    }

    public abstract void Qa();

    public final lf1_1 Ra() {
        Object object = this.g;
        object = ((Reference)object).get();
        try {
            object = (lf1_1)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        if (object == null) {
            b b2 = this.b.b();
            String string2 = this.b.a;
            CharSequence charSequence = new StringBuilder("InAppListener is null for notification: ");
            JSONObject jSONObject = this.e.v;
            charSequence.append(jSONObject);
            charSequence = charSequence.toString();
            b2.b(string2, (String)charSequence);
        }
        return object;
    }

    public final int Sa(int n3) {
        float f5 = n3;
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        return (int)TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)displayMetrics);
    }

    public final void Ta(CTInAppAction object, String string2, Bundle object2) {
        Object object3;
        Object object4;
        Object object5 = ((CTInAppAction)object).a;
        Object object6 = xf1_1.OPEN_URL;
        Bundle bundle = null;
        if (object5 == object6) {
            int n3;
            int n4;
            object5 = ((CTInAppAction)object).b;
            object6 = null;
            object5 = Yw3.a((String)object5, false);
            String string3 = "wzrk_c2a";
            String string4 = object5.getString(string3);
            object5.remove(string3);
            if (object2 != null) {
                object5.putAll((Bundle)object2);
            }
            if (string4 != null && (n4 = ((String[])(object2 = string4.split("__dl__"))).length) == (n3 = 2)) {
                int n7;
                object = object2[0];
                object6 = "UTF-8";
                try {
                    string4 = URLDecoder.decode((String)object, (String)object6);
                }
                catch (UnsupportedEncodingException | IllegalArgumentException exception) {
                    this.b.b().getClass();
                    n7 = com.clevertap.android.sdk.a.c;
                    object = a$a.INFO;
                    ((a$a)((Object)object)).intValue();
                }
                n7 = 1;
                object = object2[n7];
                CTInAppAction.CREATOR.getClass();
                Intrinsics.checkNotNullParameter(object, "url");
                object2 = new CTInAppAction(null);
                object2.a = object6 = xf1_1.OPEN_URL;
                object2.b = object;
                object = object2;
            }
            object4 = object;
            object3 = object5;
            if (string2 == null) {
                string2 = string4;
            }
        } else {
            object4 = object;
            object3 = object2;
        }
        Object object7 = string2 != null ? string2 : (object = "");
        lf1_1 lf1_12 = this.Ra();
        if (lf1_12 != null) {
            CTInAppNotification cTInAppNotification = this.e;
            FragmentActivity fragmentActivity = this.getActivity();
            bundle = lf1_12.O1(cTInAppNotification, (CTInAppAction)object4, (String)object7, (Bundle)object3, (Context)fragmentActivity);
        }
        this.Pa(bundle);
    }

    public void onAttach(Context object) {
        super.onAttach((Context)object);
        this.c = object;
        Object object2 = this.getArguments();
        if (object2 != null) {
            int n3;
            Object object3 = (CTInAppNotification)object2.getParcelable("inApp");
            this.e = object3;
            object3 = "config";
            object2 = (CleverTapInstanceConfig)object2.getParcelable((String)object3);
            this.b = object2;
            if (object2 != null) {
                object2 = ((CleverTapInstanceConfig)object2).b();
            } else {
                n3 = 0;
                object2 = null;
            }
            this.i = object3 = new ol0_1((Context)object, (yc1_2)object2);
            object2 = this.getResources().getConfiguration();
            this.d = n3 = ((Configuration)object2).orientation;
            this.Qa();
            n3 = object instanceof pq0_0;
            if (n3 != 0) {
                object = (pq0_0)object;
                this.h = object;
            }
        }
    }

    public void onViewCreated(View object, Bundle object2) {
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.Ra();
        if (object != null) {
            object2 = this.e;
            object.l0((CTInAppNotification)object2);
        }
    }
}

