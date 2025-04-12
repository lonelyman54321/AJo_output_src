/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class GI2 {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public GI2(String object, CharSequence charSequence, CharSequence[] charSequenceArray, boolean bl2, int n3, Bundle bundle, HashSet hashSet) {
        this.a = object;
        this.b = charSequence;
        this.c = charSequenceArray;
        this.d = bl2;
        this.e = n3;
        this.f = bundle;
        this.g = hashSet;
        int n4 = 2;
        if (n3 == n4 && !bl2) {
            object = new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
            throw object;
        }
    }
}

