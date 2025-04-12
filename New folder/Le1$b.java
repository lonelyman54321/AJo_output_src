/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$Theme
 */
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

public final class Le1$b {
    public final Resources.Theme a;
    public final int b;

    public Le1$b(Resources.Theme theme, int n3) {
        this.a = theme;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Le1$b;
        if (n3 == 0) {
            return false;
        }
        object = (Le1$b)object;
        Resources.Theme theme = this.a;
        Resources.Theme theme2 = ((Le1$b)object).a;
        n3 = Intrinsics.areEqual(theme, theme2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((Le1$b)object).b;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Key(theme=");
        Resources.Theme theme = this.a;
        stringBuilder.append(theme);
        stringBuilder.append(", id=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

