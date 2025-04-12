/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class bK$a {
    public final int a;
    public final int b;
    public final Intent c;

    public bK$a(int n3, int n4, Intent intent) {
        this.a = n3;
        this.b = n4;
        this.c = intent;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof bK$a;
        if (n3 == 0) {
            return false;
        }
        object = (bK$a)object;
        int n4 = this.a;
        n3 = ((bK$a)object).a;
        if (n4 != n3) {
            return false;
        }
        n3 = this.b;
        n4 = ((bK$a)object).b;
        if (n3 != n4) {
            return false;
        }
        Intent intent = this.c;
        object = ((bK$a)object).c;
        boolean bl3 = Intrinsics.areEqual(intent, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        Intent intent = this.c;
        if (intent == null) {
            n4 = 0;
            intent = null;
        } else {
            n4 = intent.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActivityResultParameters(requestCode=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", resultCode=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", data=");
        Intent intent = this.c;
        stringBuilder.append(intent);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

