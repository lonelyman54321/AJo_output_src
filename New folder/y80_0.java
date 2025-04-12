/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y80
 */
public final class y80_0 {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public y80_0(String string2, String string3, long l2, String string4, String string5, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a = string2;
        this.b = string3;
        this.c = l2;
        this.d = string4;
        this.e = string5;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = bl5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof y80_0;
        if (!bl2) return false;
        object = (y80_0)object;
        String string2 = ((y80_0)object).a;
        String string3 = this.a;
        bl2 = Intrinsics.areEqual(string2, string3);
        if (!bl2) return false;
        string2 = ((y80_0)object).b;
        string3 = this.b;
        bl2 = Intrinsics.areEqual(string2, string3);
        if (!bl2) return false;
        long l2 = ((y80_0)object).c;
        long l3 = this.c;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) return false;
        string2 = ((y80_0)object).d;
        string3 = this.d;
        bl2 = Intrinsics.areEqual(string2, string3);
        if (!bl2) return false;
        string2 = ((y80_0)object).e;
        string3 = this.e;
        bl2 = Intrinsics.areEqual(string2, string3);
        if (!bl2) return false;
        bl2 = ((y80_0)object).f;
        boolean bl3 = this.f;
        if (bl2 != bl3) return false;
        bl2 = ((y80_0)object).g;
        bl3 = this.g;
        if (bl2 != bl3) return false;
        bl2 = ((y80_0)object).h;
        bl3 = this.h;
        if (bl2 != bl3) return false;
        boolean bl4 = ((y80_0)object).i;
        bl2 = this.i;
        if (bl4 != bl2) return false;
        return true;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = 31;
        int n4 = zy_2.b(527, n3, string2);
        String string3 = this.b;
        n4 = zy_2.b(n4, n3, string3);
        long l2 = this.c;
        long l3 = l2 >>> 32;
        int n7 = (int)(l2 ^= l3);
        n4 = (n4 + n7) * 31;
        string3 = this.d;
        n4 = zy_2.b(n4, n3, string3);
        string3 = this.e;
        n4 = zy_2.b(n4, n3, string3);
        n7 = 1237;
        int n8 = this.f;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = (int)(this.g ? 1 : 0);
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = (int)(this.h ? 1 : 0);
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n3 = (int)(this.i ? 1 : 0);
        if (n3 != 0) {
            n7 = 1231;
        }
        return n4 + n7;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        Object object = this.a;
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append('=');
        object = this.b;
        ((StringBuilder)charSequence).append((String)object);
        boolean bl2 = this.h;
        if (bl2) {
            long l2 = this.c;
            long l3 = Long.MIN_VALUE;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                object = "; max-age=0";
                ((StringBuilder)charSequence).append((String)object);
            } else {
                ((StringBuilder)charSequence).append("; expires=");
                object = new Date(l2);
                Object object3 = mi0_2.a;
                Intrinsics.checkNotNullParameter(object, "<this>");
                object = ((DateFormat)mi0_2.a.get()).format((Date)object);
                object3 = "STANDARD_DATE_FORMAT.get().format(this)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                ((StringBuilder)charSequence).append((String)object);
            }
        }
        if (!(bl2 = this.i)) {
            ((StringBuilder)charSequence).append("; domain=");
            object = this.d;
            ((StringBuilder)charSequence).append((String)object);
        }
        ((StringBuilder)charSequence).append("; path=");
        object = this.e;
        ((StringBuilder)charSequence).append((String)object);
        bl2 = this.f;
        if (bl2) {
            object = "; secure";
            ((StringBuilder)charSequence).append((String)object);
        }
        if (bl2 = this.g) {
            object = "; httponly";
            ((StringBuilder)charSequence).append((String)object);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "toString()");
        return charSequence;
    }
}

