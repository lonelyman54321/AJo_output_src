/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class hw1 {
    public final Locale a;

    public hw1(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object object) {
        String string2 = null;
        if (object == null) {
            return false;
        }
        boolean bl2 = object instanceof hw1;
        if (!bl2) {
            return false;
        }
        if (this == object) {
            return true;
        }
        string2 = this.a.toLanguageTag();
        object = ((hw1)object).a.toLanguageTag();
        return Intrinsics.areEqual(string2, object);
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}

