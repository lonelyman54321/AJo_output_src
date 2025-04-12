/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lQ
 */
public final class lq_2 {
    public final CMSNavigation a;
    public final boolean b;

    public lq_2(CMSNavigation cMSNavigation, boolean bl2) {
        Intrinsics.checkNotNullParameter(cMSNavigation, "categoryNav");
        this.a = cMSNavigation;
        this.b = bl2;
    }

    public static lq_2 a(lq_2 lq_22, boolean bl2) {
        CMSNavigation cMSNavigation = lq_22.a;
        lq_22.getClass();
        Intrinsics.checkNotNullParameter(cMSNavigation, "categoryNav");
        lq_22 = new lq_2(cMSNavigation, bl2);
        return lq_22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof lq_2;
        if (!bl3) {
            return false;
        }
        object = (lq_2)object;
        CMSNavigation cMSNavigation = this.a;
        CMSNavigation cMSNavigation2 = ((lq_2)object).a;
        bl3 = Intrinsics.areEqual(cMSNavigation, cMSNavigation2);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl4 = ((lq_2)object).b;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        CMSNavigation cMSNavigation = this.a;
        int n3 = cMSNavigation.hashCode() * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CategoryNavigation(categoryNav=");
        CMSNavigation cMSNavigation = this.a;
        stringBuilder.append(cMSNavigation);
        stringBuilder.append(", isExpanded=");
        boolean bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

