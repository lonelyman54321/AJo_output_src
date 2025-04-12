/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;

/*
 * Renamed from Hs
 */
public final class hs_0
extends om3_0 {
    public final TextView a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final int e;

    public hs_0(TextView object, CharSequence charSequence, int n3, int n4, int n7) {
        if (object != null) {
            this.a = object;
            if (charSequence != null) {
                this.b = charSequence;
                this.c = n3;
                this.d = n4;
                this.e = n7;
                return;
            }
            super("Null text");
            throw object;
        }
        super("Null view");
        throw object;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return this.c;
    }

    public final CharSequence d() {
        return this.b;
    }

    public final TextView e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof om3_0;
        if (n3 != 0) {
            int n4;
            int n7;
            Object object2 = this.a;
            Object object3 = ((om3_0)(object = (om3_0)object)).e();
            n3 = object2.equals(object3);
            if (n3 == 0 || (n3 = (object3 = this.b).equals(object2 = ((om3_0)object).d())) == 0 || (n3 = this.c) != (n7 = ((om3_0)object).c()) || (n3 = this.d) != (n7 = ((om3_0)object).a()) || (n3 = this.e) != (n4 = ((om3_0)object).b())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.b.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.c;
        n3 = (n3 ^ n7) * n4;
        n7 = this.d;
        n3 = (n3 ^ n7) * n4;
        n4 = this.e;
        return n3 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextViewTextChangeEvent{view=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", text=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", start=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", before=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", count=");
        return g30.a(this.e, "}", stringBuilder);
    }
}

