/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView
 */
package com.ril.ajio.remoteconfig.devsettings.view;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.remoteconfig.R$id;
import com.ril.ajio.remoteconfig.R$layout;
import com.ril.ajio.remoteconfig.devsettings.Data;
import com.ril.ajio.remoteconfig.devsettings.view.a$a;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends Fragment {
    public static final a$a Companion;
    public ZR2 a;
    public EditText b;
    public Button c;
    public Button d;
    public Button e;
    public TextView f;

    static {
        a$a a$a;
        Companion = a$a = new Object();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_config_editor;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2;
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        View view = null;
        if (object2 != null) {
            n4 = Build.VERSION.SDK_INT;
            n3 = 33;
            if (n4 >= n3) {
                object2 = (Parcelable)s40_0.a(object2);
            } else {
                string2 = "data";
                n4 = (object2 = object2.getParcelable(string2)) instanceof Data;
                if (n4 == 0) {
                    object2 = null;
                }
                object2 = (Data)object2;
            }
            object2 = (Data)object2;
        } else {
            object2 = null;
        }
        n4 = R$id.edit;
        string2 = (EditText)object.findViewById(n4);
        String string3 = "<set-?>";
        Intrinsics.checkNotNullParameter(string2, string3);
        this.b = string2;
        n4 = R$id.key;
        string2 = (Button)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(string2, string3);
        this.c = string2;
        n4 = R$id.value;
        string2 = (TextView)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(string2, string3);
        this.f = string2;
        n4 = R$id.save;
        string2 = (Button)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(string2, string3);
        this.d = string2;
        n4 = R$id.cancel_tv;
        object = (Button)object.findViewById(n4);
        Intrinsics.checkNotNullParameter(object, string3);
        this.e = object;
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edit");
            object = null;
        }
        Intrinsics.checkNotNull(object2);
        string2 = object2.c;
        n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        String string4 = object2.b;
        string2 = n3 != 0 ? String.valueOf(string4) : String.valueOf(string2);
        object.setText((CharSequence)string2);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            object = null;
        }
        object.setText((CharSequence)string4);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("key");
            object = null;
        }
        object2 = object2.a;
        object.setText((CharSequence)object2);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("save");
            object = null;
        }
        n4 = 1;
        object2 = new io_1(this, n4);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.e;
        if (object != null) {
            view = object;
        } else {
            object = "cancel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        }
        object = new t40_0(this, 0);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

