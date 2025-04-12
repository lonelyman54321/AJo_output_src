/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
package com.ril.ajio.utility.validators;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.utility.validators.Validator$1;
import com.ril.ajio.utility.validators.Validator$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Validator {
    public final ArrayList a;
    public boolean b = true;

    public Validator() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final void a(ba3_2 ba3_22) {
        Object object = ba3_22.f;
        fa3_2 fa3_22 = fa3_2.ONFOCUSLOST_DOVALIDATE;
        EditText editText = ba3_22.a;
        if (object == fa3_22 || object == (fa3_22 = fa3_2.ONFOCUSGAINED_CLEARVALIDATION) || object == (fa3_22 = fa3_2.ALL)) {
            object = new Object();
            ((ca3_2)object).a = this;
            ((ca3_2)object).b = ba3_22;
            editText.setOnFocusChangeListener((View.OnFocusChangeListener)object);
        }
        if ((fa3_22 = ba3_22.f) == (object = fa3_2.ONTEXTWATCH) || fa3_22 == (object = fa3_2.ALL)) {
            object = new Object();
            ((ga3_2)object).a = this;
            ((ga3_2)object).b = ba3_22;
            editText.addTextChangedListener((TextWatcher)object);
        }
    }

    public final boolean b(aa3_2 aa3_22) {
        boolean bl2;
        boolean bl3;
        this.b = bl3 = true;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            ba3_2 ba3_22 = (ba3_2)iterator.next();
            boolean bl4 = this.c(ba3_22);
            if (!bl4) {
                aa3_22.a(ba3_22);
            }
            bl3 &= bl4;
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(ba3_2 ba3_22) {
        cp$a cp$a;
        int n3;
        int n4;
        boolean bl2;
        Object object;
        block9: {
            block8: {
                int n7;
                int n8;
                int n10;
                String string2;
                block6: {
                    block10: {
                        block11: {
                            block7: {
                                string2 = ba3_22.a.getText().toString().trim();
                                object = ba3_22.a;
                                n10 = object.getInputType();
                                n8 = 2;
                                n7 = 3;
                                bl2 = true;
                                if (n10 == n8 || (n10 = object.getInputType()) == n7) break block6;
                                n10 = object.getInputType();
                                if (n10 != (n8 = 32)) break block7;
                                object = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(string2);
                                n4 = ((Matcher)object).matches();
                                if (n4 == 0 || (n3 = string2.length()) >= (n4 = 255)) break block8;
                                break block9;
                            }
                            n10 = object.getInputType();
                            if (n10 == (n8 = 128) || (n10 = object.getInputType()) == (n8 = 129)) break block10;
                            fa3_2 fa3_22 = ba3_22.f;
                            fa3_2 fa3_23 = fa3_2.REGEX;
                            if (fa3_22 != fa3_23) break block11;
                            Pattern pattern = ba3_22.d;
                            if (pattern == null) break block8;
                            object = object.getText().toString();
                            Matcher matcher = pattern.matcher((CharSequence)object);
                            bl2 = matcher.matches();
                            break block9;
                        }
                        n4 = (int)(ba3_22.g ? 1 : 0);
                        if (n4 != 0 && (n3 = (int)(string2.isEmpty() ? 1 : 0)) != 0) break block8;
                        break block9;
                    }
                    object = Pattern.compile("((?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^*()_\\-+]).{8,20})");
                    Matcher matcher = ((Pattern)object).matcher(string2);
                    bl2 = matcher.matches();
                    break block9;
                }
                Editable editable = object.getText();
                if (editable != null) {
                    String string3 = object.getText().toString().trim();
                    n10 = string3.length();
                } else {
                    n10 = 0;
                    Object var10_22 = null;
                }
                n8 = 10;
                if (n10 <= n8 && (n10 != n8 ? n10 == (n8 = 6) && (n4 = object.getInputType()) != n7 && (n3 = string2.length()) == n8 : (n4 = string2.startsWith((String)(object = "0"))) == 0 && (n4 = (int)(string2.startsWith((String)(object = "+91")) ? 1 : 0)) == 0 && (n3 = string2.length()) == n8)) break block9;
            }
            bl2 = false;
        }
        if (!bl2 && (n3 = this.b) != 0 && (n3 = (int)(km_1.b(cp$a = cp_1.Companion) ? 1 : 0)) != 0) {
            CharSequence charSequence;
            TextInputLayout textInputLayout = ba3_22.b;
            n3 = textInputLayout != null && (object = textInputLayout.getHint()) != null && (n3 = (int)((charSequence = textInputLayout.getHint()).equals(object = hv3_0.K(n4 = R$string.flat_no_building_name_text)) ? 1 : 0)) != 0 ? 3500 : 2500;
            Looper looper = Looper.getMainLooper();
            object = new Handler(looper);
            Validator$1 validator$1 = new Validator$1(ba3_22);
            long l2 = n3;
            object.postDelayed((Runnable)validator$1, l2);
            this.b = false;
        }
        return bl2;
    }

    public abstract void d(ba3_2 var1);

    public abstract void e();

    public final void f(fa3_2 object, EditText editText, TextInputLayout object2, String string2, String string3, boolean bl2, int n3) {
        fa3_2 fa3_22;
        ba3_2 ba3_22 = new Object();
        ba3_22.f = fa3_22 = fa3_2.NONE;
        ba3_22.g = true;
        ba3_22.a = editText;
        ba3_22.b = object2;
        ba3_22.e = string3;
        object2 = Pattern.compile(string2);
        ba3_22.d = object2;
        ba3_22.f = object;
        this.a(ba3_22);
        this.a.add(ba3_22);
        object = new Object();
        ((Validator$a)object).a = ba3_22;
        ((Validator$a)object).b = bl2;
        ((Validator$a)object).c = editText;
        editText.addTextChangedListener((TextWatcher)object);
    }

    public abstract void g(ba3_2 var1);

    public abstract boolean h();
}

