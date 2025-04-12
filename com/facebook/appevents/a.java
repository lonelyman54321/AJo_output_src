/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.appevents.a$a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements Serializable {
    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public a(String string2, String string3) {
        String string4 = "applicationId";
        Intrinsics.checkNotNullParameter(string3, string4);
        this.a = string3;
        boolean bl2 = lz3_0.A(string2);
        if (bl2) {
            string2 = null;
        }
        this.b = string2;
    }

    private final Object writeReplace() {
        String string2 = this.b;
        String string3 = this.a;
        a$a a$a = new a$a(string2, string3);
        return a$a;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof a;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = (a)object;
        String string2 = ((a)object).b;
        String string3 = this.b;
        bl3 = lz3_0.a(string2, string3);
        if (bl3 && (bl2 = lz3_0.a(object = ((a)object).a, string2 = this.a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.b;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        int n4 = this.a.hashCode();
        return n3 ^ n4;
    }
}

