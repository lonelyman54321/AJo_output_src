/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ri2
 */
public final class ri2_0
implements Serializable {
    public final Product a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final Boolean k;
    public final Bundle l;
    public final String m;
    public final boolean n;
    public final String o;
    public final String p;
    public final Boolean q;
    public final String r;

    public ri2_0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 262143);
    }

    public ri2_0(Product product, String string2, Integer n3, String string3, String string4, String string5, Boolean bl2, String string6, String string7, Boolean bl3, Boolean bl4, String string8, boolean bl5, String string9, String string10, Boolean bl6, String string11, int n4) {
        String string12;
        Boolean bl7;
        String string13;
        String string14;
        Object object;
        ri2_0 ri2_02 = this;
        int n7 = n4;
        int n8 = n4 & 1;
        if (n8 != 0) {
            n8 = 0;
            object = null;
        } else {
            object = product;
        }
        int n10 = n7 & 2;
        String string15 = "";
        String string16 = n10 != 0 ? string15 : string2;
        int n14 = n7 & 4;
        int n15 = 0;
        Integer n16 = n14 != 0 ? Integer.valueOf(0) : n3;
        int n17 = n7 & 8;
        String string17 = n17 != 0 ? string15 : string3;
        int n18 = n7 & 0x10;
        String string18 = n18 != 0 ? string15 : string4;
        int n19 = n7 & 0x20;
        String string19 = n19 != 0 ? string15 : string5;
        int n20 = n7 & 0x40;
        Boolean bl8 = n20 != 0 ? Boolean.FALSE : bl2;
        int n21 = n7 & 0x80;
        String string20 = n21 != 0 ? string15 : string6;
        int n22 = n7 & 0x100;
        if (n22 == 0) {
            string15 = string7;
        }
        n22 = n7 & 0x200;
        Boolean bl9 = n22 != 0 ? Boolean.FALSE : bl3;
        int n24 = n7 & 0x400;
        Boolean bl10 = n24 != 0 ? Boolean.FALSE : bl4;
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            string14 = null;
        } else {
            string14 = string8;
        }
        n15 = n7 & 0x2000;
        n15 = n15 != 0 ? 0 : (int)(bl5 ? 1 : 0);
        int n26 = n7 & 0x4000;
        if (n26 != 0) {
            n26 = 0;
            string13 = null;
        } else {
            string13 = string9;
        }
        int n27 = n7 & 0x8000;
        String string21 = n27 != 0 ? null : string10;
        n27 = n7 & 0x10000;
        Boolean bl11 = n27 != 0 ? (bl7 = Boolean.FALSE) : bl6;
        n27 = 131072;
        if ((n7 &= n27) != 0) {
            n7 = 0;
            string12 = null;
        } else {
            string12 = string11;
        }
        ri2_02.a = object;
        ri2_02.b = string16;
        ri2_02.c = n16;
        ri2_02.d = string17;
        ri2_02.e = string18;
        ri2_02.f = string19;
        ri2_02.g = bl8;
        ri2_02.h = string20;
        ri2_02.i = string15;
        ri2_02.j = bl9;
        ri2_02.k = bl10;
        ri2_02.l = null;
        ri2_02.m = string14;
        ri2_02.n = n15;
        ri2_02.o = string13;
        object = string21;
        ri2_02.p = string21;
        object = bl11;
        ri2_02.q = bl11;
        ri2_02.r = string12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ri2_0;
        if (!bl3) {
            return false;
        }
        object = (ri2_0)object;
        Object object2 = this.a;
        Object object3 = ((ri2_0)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((ri2_0)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((ri2_0)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((ri2_0)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((ri2_0)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((ri2_0)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object2 = ((ri2_0)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object2 = ((ri2_0)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.i;
        object2 = ((ri2_0)object).i;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.j;
        object2 = ((ri2_0)object).j;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.k;
        object2 = ((ri2_0)object).k;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.l;
        object2 = ((ri2_0)object).l;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.m;
        object2 = ((ri2_0)object).m;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.n;
        boolean bl4 = ((ri2_0)object).n;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.o;
        object2 = ((ri2_0)object).o;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.p;
        object2 = ((ri2_0)object).p;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.q;
        object2 = ((ri2_0)object).q;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.r;
        object = ((ri2_0)object).r;
        boolean bl5 = Intrinsics.areEqual(object3, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Product product = this.a;
        if (product == null) {
            n4 = 0;
            product = null;
        } else {
            n4 = product.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.i;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.k;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.l;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.m;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.n ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.o;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.p;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.q;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.r;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PDPExtras(product=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", productCode=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", tabType=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", storeId=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", historySearchText=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", url=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", isSearchRv=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", pagetype=");
        object = this.h;
        stringBuilder.append((String)object);
        stringBuilder.append(", categoryId=");
        object = this.i;
        stringBuilder.append((String)object);
        stringBuilder.append(", clearTabStack=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", userTap=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(", notificationBundle=");
        object = this.l;
        stringBuilder.append(object);
        stringBuilder.append(", searchRedirected=");
        object = this.m;
        stringBuilder.append((String)object);
        stringBuilder.append(", isHalfPDP=");
        boolean bl2 = this.n;
        stringBuilder.append(bl2);
        stringBuilder.append(", halfPDPSelectedSize=");
        object = this.o;
        stringBuilder.append((String)object);
        stringBuilder.append(", searchQuery=");
        object = this.p;
        stringBuilder.append((String)object);
        stringBuilder.append(", isDeeplink=");
        object = this.q;
        stringBuilder.append(object);
        stringBuilder.append(", utmSource=");
        object = this.r;
        return h30_0.a(stringBuilder, (String)object, ")");
    }
}

