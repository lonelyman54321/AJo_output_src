/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package androidx.preference;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.Preference$d;
import androidx.preference.R$string;

public final class EditTextPreference$a
implements Preference$d {
    public static EditTextPreference$a a;

    public final CharSequence a(Preference object) {
        object = (EditTextPreference)object;
        String string2 = ((EditTextPreference)object).A;
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 != 0) {
            n3 = R$string.not_set;
            object = ((Preference)object).a.getString(n3);
        } else {
            object = ((EditTextPreference)object).A;
        }
        return object;
    }
}

