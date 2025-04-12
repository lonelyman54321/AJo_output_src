/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.EditText
 *  android.widget.TextView
 */
package com.ril.ajio.utility.validators;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Validator$a
implements TextWatcher {
    public ba3_2 a;
    public boolean b;
    public EditText c;

    public final void afterTextChanged(Editable editable) {
        boolean n3 = this.b;
        if (n3) {
            int n4;
            Object object = editable.toString();
            int n7 = ((String)object).length();
            Pattern pattern = this.a.d;
            boolean bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).matches();
            if (!bl2 && (n4 = editable.length()) > 0) {
                int n8 = n7 + -1;
                editable.delete(n8, n7);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        charSequence = (TextView)this.c.getTag();
        if (charSequence != null && (n3 = charSequence.getVisibility()) == 0) {
            n3 = 8;
            charSequence.setVisibility(n3);
        }
    }
}

