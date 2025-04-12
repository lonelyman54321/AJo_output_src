/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uH2
 */
public final class uh2_0 {
    public final boolean a;
    public boolean b;
    public final wg2_1 c;
    public final boolean d;
    public final String e;

    public uh2_0(wg2_1 wg2_12, boolean bl2) {
        Intrinsics.checkNotNullParameter(wg2_12, "referralClickListener");
        String string2 = "pdp screen";
        Intrinsics.checkNotNullParameter(string2, "screenName");
        this.a = false;
        this.b = false;
        this.c = wg2_12;
        this.d = bl2;
        this.e = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof uh2_0;
        if (!bl3) {
            return false;
        }
        object = (uh2_0)object;
        boolean bl4 = this.a;
        bl3 = ((uh2_0)object).a;
        if (bl4 != bl3) {
            return false;
        }
        bl3 = this.b;
        bl4 = ((uh2_0)object).b;
        if (bl3 != bl4) {
            return false;
        }
        Object object2 = this.c;
        wg2_1 wg2_12 = ((uh2_0)object).c;
        bl3 = Intrinsics.areEqual(object2, wg2_12);
        if (!bl3) {
            return false;
        }
        bl3 = this.d;
        bl4 = ((uh2_0)object).d;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.e;
        object = ((uh2_0)object).e;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = 1237;
        int n4 = this.a;
        n4 = n4 != 0 ? 1231 : 1237;
        n4 *= 31;
        int n7 = this.b;
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        wg2_1 wg2_12 = this.c;
        n7 = (wg2_12.hashCode() + n4) * 31;
        n4 = (int)(this.d ? 1 : 0);
        if (n4 != 0) {
            n3 = 1231;
        }
        n7 = (n7 + n3) * 31;
        return this.e.hashCode() + n7;
    }

    public final String toString() {
        boolean bl2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("ReferralWidgetInfo(isTopPaddingRequired=");
        boolean bl3 = this.a;
        I81.a(", isEcommerceEventPushed=", ", referralClickListener=", stringBuilder, bl3, bl2);
        Object object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", isReferralEnabled=");
        bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", screenName=");
        object = this.e;
        return h30_0.a(stringBuilder, (String)object, ")");
    }
}

