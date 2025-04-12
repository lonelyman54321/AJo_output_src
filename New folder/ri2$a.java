/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import java.lang.constant.Constable;

public final class ri2$a {
    public Product a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public final String f;
    public Boolean g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final Boolean k;
    public boolean l;
    public String m;
    public String n;

    public ri2$a() {
        Constable constable;
        String string2;
        this.b = string2 = "";
        this.c = constable = Integer.valueOf(0);
        this.d = string2;
        this.e = string2;
        this.f = string2;
        constable = Boolean.FALSE;
        this.g = constable;
        this.h = string2;
        this.i = string2;
        this.j = constable;
        this.k = constable;
    }

    public final ri2_0 a() {
        Product product = this.a;
        String string2 = this.b;
        Integer n3 = this.c;
        String string3 = this.d;
        String string4 = this.e;
        Boolean bl2 = this.g;
        boolean bl3 = this.l;
        String string5 = this.m;
        String string6 = this.n;
        String string7 = this.f;
        String string8 = this.h;
        String string9 = this.i;
        Boolean bl4 = this.j;
        Boolean bl5 = this.k;
        ri2_0 ri2_02 = new ri2_0(product, string2, n3, string3, string4, string7, bl2, string8, string9, bl4, bl5, null, bl3, string5, string6, null, null, 65536);
        return ri2_02;
    }

    public final void b(String string2) {
        if (string2 == null) {
            string2 = "";
        }
        this.b = string2;
    }
}

