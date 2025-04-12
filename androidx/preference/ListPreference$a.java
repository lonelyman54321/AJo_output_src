/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package androidx.preference;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.Preference$d;
import androidx.preference.R$string;

public final class ListPreference$a
implements Preference$d {
    public static ListPreference$a a;

    public final CharSequence a(Preference object) {
        CharSequence charSequence = ((ListPreference)(object = (ListPreference)object)).m();
        int n3 = TextUtils.isEmpty((CharSequence)charSequence);
        if (n3 != 0) {
            n3 = R$string.not_set;
            object = ((Preference)object).a.getString(n3);
        } else {
            object = ((ListPreference)object).m();
        }
        return object;
    }
}

