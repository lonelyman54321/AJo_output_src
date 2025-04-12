/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package androidx.preference;

import android.text.TextUtils;
import androidx.preference.Preference;

public final class PreferenceGroupAdapter$a {
    public final int a;
    public final int b;
    public final String c;

    public PreferenceGroupAdapter$a(Preference preference) {
        int n3;
        int n4;
        String string2;
        this.c = string2 = preference.getClass().getName();
        this.a = n4 = preference.u;
        this.b = n3 = preference.v;
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        int n3 = object instanceof PreferenceGroupAdapter$a;
        boolean bl3 = false;
        if (n3 == 0) {
            return false;
        }
        object = (PreferenceGroupAdapter$a)object;
        int n4 = this.a;
        n3 = ((PreferenceGroupAdapter$a)object).a;
        if (n4 == n3 && (n3 = this.b) == (n4 = ((PreferenceGroupAdapter$a)object).b) && (bl2 = TextUtils.equals((CharSequence)(string2 = this.c), (CharSequence)(object = ((PreferenceGroupAdapter$a)object).c)))) {
            bl3 = true;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = (527 + n3) * 31;
        n3 = this.b;
        n4 = (n4 + n3) * 31;
        return this.c.hashCode() + n4;
    }
}

