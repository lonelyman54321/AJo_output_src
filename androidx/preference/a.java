/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.Window
 *  android.widget.TextView
 */
package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.f$a;
import androidx.fragment.app.DialogFragment;
import androidx.preference.DialogPreference;
import androidx.preference.DialogPreference$a;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.preference.a$a;

public abstract class a
extends DialogFragment
implements DialogInterface.OnClickListener {
    public DialogPreference a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public int f;
    public BitmapDrawable g;
    public int h;

    public final DialogPreference Oa() {
        DialogPreference dialogPreference = this.a;
        if (dialogPreference == null) {
            dialogPreference = this.requireArguments();
            String string2 = "key";
            dialogPreference.getString(string2);
            ((DialogPreference$a)((Object)this.getTargetFragment())).u8();
            dialogPreference = null;
            this.a = null;
        }
        return this.a;
    }

    public void Pa(View view) {
        int n3 = 16908299;
        if ((view = view.findViewById(n3)) != null) {
            CharSequence charSequence = this.e;
            int n4 = TextUtils.isEmpty((CharSequence)charSequence);
            if (n4 == 0) {
                n4 = view instanceof TextView;
                if (n4 != 0) {
                    View view2 = view;
                    view2 = (TextView)view;
                    view2.setText(charSequence);
                }
                n3 = 0;
                charSequence = null;
            } else {
                n3 = 8;
            }
            n4 = view.getVisibility();
            if (n4 != n3) {
                view.setVisibility(n3);
            }
        }
    }

    public abstract void Qa(boolean var1);

    public void Ra(f$a f$a) {
    }

    public void Sa() {
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        this.h = n3;
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Object object2 = this.getTargetFragment();
        boolean bl2 = object2 instanceof DialogPreference$a;
        if (bl2) {
            object2 = (DialogPreference$a)object2;
            Bundle bundle = this.requireArguments();
            String string2 = "key";
            bundle.getString(string2);
            if (object != null) {
                int n3;
                this.b = object2 = object.getCharSequence("PreferenceDialogFragment.title");
                this.c = object2 = object.getCharSequence("PreferenceDialogFragment.positiveText");
                this.d = object2 = object.getCharSequence("PreferenceDialogFragment.negativeText");
                this.e = object2 = object.getCharSequence("PreferenceDialogFragment.message");
                bl2 = false;
                bundle = null;
                this.f = n3 = object.getInt("PreferenceDialogFragment.layout", 0);
                object2 = "PreferenceDialogFragment.icon";
                if ((object = (Bitmap)object.getParcelable((String)object2)) != null) {
                    bundle = this.getResources();
                    object2 = new BitmapDrawable((Resources)bundle, (Bitmap)object);
                    this.g = object2;
                }
                return;
            }
            object2.u8();
            this.a = null;
            throw null;
        }
        object = new IllegalStateException("Target fragment must implement TargetFragment interface");
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        int n3;
        this.h = n3 = -2;
        Object object2 = this.requireContext();
        object = new f$a((Context)object2);
        object2 = this.b;
        object = ((f$a)object).setTitle((CharSequence)object2);
        object2 = this.g;
        object = ((f$a)object).setIcon((Drawable)object2);
        object2 = this.c;
        object = ((f$a)object).setPositiveButton((CharSequence)object2, (DialogInterface.OnClickListener)this);
        object2 = this.d;
        object = ((f$a)object).setNegativeButton((CharSequence)object2, (DialogInterface.OnClickListener)this);
        this.requireContext();
        int n4 = this.f;
        int n7 = 0;
        View view = null;
        if (n4 != 0) {
            LayoutInflater layoutInflater = this.getLayoutInflater();
            view = layoutInflater.inflate(n4, null);
        }
        if (view != null) {
            this.Pa(view);
            ((f$a)object).setView(view);
        } else {
            object2 = this.e;
            ((f$a)object).setMessage((CharSequence)object2);
        }
        object = ((f$a)object).create();
        n4 = this instanceof EditTextPreferenceDialogFragmentCompat;
        if (n4 != 0) {
            object2 = object.getWindow();
            n7 = Build.VERSION.SDK_INT;
            int n8 = 30;
            if (n7 >= n8) {
                a$a.a((Window)object2);
            } else {
                this.Sa();
            }
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public final void onDismiss(DialogInterface dialogInterface) {
        void var2_5;
        super.onDismiss(dialogInterface);
        int bl2 = this.h;
        int n3 = -1;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            dialogInterface = null;
        }
        this.Qa((boolean)var2_5);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CharSequence charSequence = this.b;
        bundle.putCharSequence("PreferenceDialogFragment.title", charSequence);
        charSequence = this.c;
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", charSequence);
        charSequence = this.d;
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", charSequence);
        charSequence = this.e;
        bundle.putCharSequence("PreferenceDialogFragment.message", charSequence);
        int n3 = this.f;
        bundle.putInt("PreferenceDialogFragment.layout", n3);
        BitmapDrawable bitmapDrawable = this.g;
        if (bitmapDrawable != null) {
            charSequence = "PreferenceDialogFragment.icon";
            bitmapDrawable = bitmapDrawable.getBitmap();
            bundle.putParcelable((String)charSequence, (Parcelable)bitmapDrawable);
        }
    }
}

