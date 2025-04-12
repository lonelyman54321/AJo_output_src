/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.EditText
 */
package com.ril.ajio.login.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.login.activity.Hilt_ResetPasswordActivity;
import com.ril.ajio.login.activity.ResetPasswordActivity$a;
import com.ril.ajio.services.data.Login.QueryResetPassword;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

public final class ResetPasswordActivity
extends Hilt_ResetPasswordActivity
implements View.OnClickListener {
    public static final ResetPasswordActivity$a Companion;
    public final String Y;
    public AjioCustomToolbar Z;
    public EditText k0;
    public EditText p0;
    public TextInputLayout q0;
    public TextInputLayout r0;
    public AjioProgressView s0;
    public oa1_1 t0;
    public fv0_2 u0;
    public String v0;

    static {
        ResetPasswordActivity$a resetPasswordActivity$a;
        Companion = resetPasswordActivity$a = new Object();
    }

    public ResetPasswordActivity() {
        this.Y = "Reset Password";
    }

    public void onClick(View object) {
        TextInputLayout textInputLayout;
        int n3;
        int n4;
        int n7;
        object = this.q0;
        Object object2 = "newpasswordcontainer";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object.setError(null);
        object = this.q0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object = null;
        }
        object.setError(null);
        object = this.k0;
        Object object4 = "newpasswordView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object4);
            n7 = 0;
            object = null;
        }
        object = object.getText().toString();
        Object object5 = this.p0;
        Object object6 = "repeatpasswordView";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object6);
            object5 = null;
        }
        object5 = object5.getText().toString();
        int n8 = object.length();
        int n10 = 1;
        n8 -= n10;
        int n14 = 0;
        String string2 = null;
        int n15 = 0;
        while (true) {
            n4 = 32;
            if (n14 > n8) break;
            n3 = n15 == 0 ? n14 : n8;
            n3 = Intrinsics.compare(object.charAt(n3), n4);
            n3 = n3 <= 0 ? 1 : 0;
            if (n15 == 0) {
                if (n3 == 0) {
                    n15 = 1;
                    continue;
                }
                ++n14;
                continue;
            }
            if (n3 == 0) break;
            n8 += -1;
        }
        n8 += n10;
        String string3 = ((Object)object.subSequence(n14, n8)).toString();
        if ((n8 = string3.length()) > 0) {
            n8 = 1;
        } else {
            n8 = 0;
            string3 = null;
        }
        n14 = object5.length() - n10;
        n15 = 0;
        n3 = 0;
        while (n15 <= n14) {
            int n16 = n3 == 0 ? n15 : n14;
            n16 = Intrinsics.compare(object5.charAt(n16), n4);
            n16 = n16 <= 0 ? 1 : 0;
            if (n3 == 0) {
                if (n16 == 0) {
                    n3 = 1;
                    continue;
                }
                ++n15;
                continue;
            }
            if (n16 == 0) break;
            n14 += -1;
        }
        n14 += n10;
        string2 = ((Object)object5.subSequence(n15, n14)).toString();
        if ((n14 = string2.length()) > 0) {
            n14 = 1;
        } else {
            n14 = 0;
            string2 = null;
        }
        n15 = n8 != 0 && n14 != 0 ? 1 : 0;
        if (n15 == 0 || (n7 = Intrinsics.areEqual(object, object5)) == 0) {
            n10 = 0;
            textInputLayout = null;
        }
        object = "repeatpasswordcontainer";
        if (n15 == 0) {
            object4 = this.q0;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object4 = null;
            }
            ((TextInputLayout)((Object)object4)).setError(null);
            object4 = this.r0;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                object4 = null;
            }
            ((TextInputLayout)((Object)object4)).setError(null);
            object4 = "If you are entering passwords don't leave this field empty";
            if (n14 == 0) {
                object5 = this.r0;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object5 = null;
                }
                object5.setError((CharSequence)object4);
            }
            if (n8 == 0) {
                object = this.q0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    object3 = object;
                }
                ((TextInputLayout)((Object)object3)).setError((CharSequence)object4);
            }
            return;
        }
        if (n10 != 0) {
            int n17;
            object5 = this.u0;
            if (object5 != null) {
                string3 = this.k0;
                if (string3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(object4);
                    n8 = 0;
                    string3 = null;
                }
                if ((textInputLayout = this.q0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n10 = 0;
                    textInputLayout = null;
                }
                n17 = R$string.password_alert_text;
                object2 = hv3_0.K(n17);
                object5.c((EditText)string3, textInputLayout, (String)object2);
            }
            if ((object2 = this.u0) != null) {
                object5 = this.p0;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(object6);
                    object5 = null;
                }
                if ((object6 = this.r0) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object6 = null;
                }
                n7 = R$string.password_alert_text;
                object = hv3_0.K(n7);
                ((fv0_2)object2).c((EditText)object5, (TextInputLayout)((Object)object6), (String)object);
            }
            if ((object = this.u0) != null) {
                n7 = object.a.h();
                object = n7 != 0;
            } else {
                n7 = 0;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            n7 = (int)(object.booleanValue() ? 1 : 0);
            if (n7 == 0) {
                return;
            }
            object = this.s0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProgressView");
                n7 = 0;
                object = null;
            }
            object.show();
            object = this.v0;
            if (object != null && (object2 = this.t0) != null) {
                object5 = this.k0;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(object4);
                    object5 = null;
                }
                object4 = ((Object)StringsKt.m0(object5.getText().toString())).toString();
                Intrinsics.checkNotNullParameter(object, "token");
                Intrinsics.checkNotNullParameter(object4, "newPassword");
                object5 = new QueryResetPassword();
                object5.setToken((String)object);
                object5.setNewpassword((String)object4);
                object = md3_0.c((jD3)object2);
                object4 = new va1_2((oa1_1)object2, (QueryResetPassword)object5, null);
                n17 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object4, n17);
            }
            return;
        }
        object4 = this.q0;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object4 = null;
        }
        object2 = "Passwords do not match";
        ((TextInputLayout)((Object)object4)).setError((CharSequence)object2);
        object4 = this.r0;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object4;
        }
        ((TextInputLayout)((Object)object3)).setError((CharSequence)object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle object) {
        void var3_10;
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_reset_password;
        this.setContentView(n3);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object2, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", rd3_02, (E$b)object2, (Wd0)object);
        Class<oa1_1> clazz = oa1_1.class;
        object2 = "modelClass";
        Intrinsics.checkNotNullParameter(clazz, (String)object2);
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(clazz, string2);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(clazz);
        Intrinsics.checkNotNullParameter(yn1_22, (String)object2);
        Intrinsics.checkNotNullParameter(yn1_22, (String)object2);
        Intrinsics.checkNotNullParameter(yn1_22, string2);
        object2 = yn1_22.getQualifiedName();
        if (object2 == null) {
            String string3 = "Local and anonymous classes can not be ViewModels".toString();
            object = new IllegalArgumentException(string3);
            throw object;
        }
        string2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
        object2 = string2.concat((String)object2);
        this.t0 = object = (oa1_1)((pD3)object).a(yn1_22, (String)object2);
        object = this.getIntent();
        String string4 = "token";
        this.v0 = object = object.getStringExtra(string4);
        this.getIntent().removeExtra(string4);
        n3 = R$id.toolbar;
        this.Z = object = (AjioCustomToolbar)this.findViewById(n3);
        Object var3_7 = null;
        object2 = "toolbar";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        this.setSupportActionBar((Toolbar)object);
        object = this.getSupportActionBar();
        if (object != null) {
            boolean bl2 = true;
            ((ActionBar)object).n(bl2);
        }
        if ((object = this.getTitle()) == null) {
            object = this.Z;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                Object object3 = object;
            }
            object = this.Y;
        } else {
            object = this.Z;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                Object object4 = object;
            }
            object = this.getTitle();
        }
        var3_10.setTitle((CharSequence)object);
        n3 = R$id.newpasswordcontainer;
        object = (TextInputLayout)this.findViewById(n3);
        this.q0 = object;
        n3 = R$id.repeatpasswordcontainer;
        object = (TextInputLayout)this.findViewById(n3);
        this.r0 = object;
        n3 = R$id.et_newpassword;
        object = (EditText)this.findViewById(n3);
        this.k0 = object;
        n3 = R$id.et_repeatpassword;
        object = (EditText)this.findViewById(n3);
        this.p0 = object;
        n3 = R$id.btn_resetpassword;
        ((Button)this.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
        n3 = R$id.resetpassword_progress_bar;
        object = (AjioProgressView)this.findViewById(n3);
        this.s0 = object;
        vz3_0 vz3_02 = vz3_0.TEXTINPUTLAYOUTVALIDATOR;
        object = new fv0_2(vz3_02);
        this.u0 = object;
        object = this.t0;
        if (object != null && (object = ((oa1_1)object).s) != null) {
            qk2_1 qk2_12 = new qk2_1(this);
            ((LiveData)object).e(this, qk2_12);
        }
    }
}

