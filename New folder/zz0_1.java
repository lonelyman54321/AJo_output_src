/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.LinkedHashMap;

/*
 * Renamed from zz0
 */
public final class zz0_1 {
    public static final LinkedHashMap a;
    public static final wi3_1 b;
    public static final wi3_1 c;
    public static final wi3_1 d;
    public static final wi3_1 e;
    public static final wi3_1 f;
    public static final wi3_1 g;
    public static final wi3_1 h;
    public static final wi3_1 i;
    public static final wi3_1 j;
    public static final wi3_1 k;

    static {
        Object object = new LinkedHashMap();
        a = object;
        yi3 yi32 = yi3.BINARY;
        b = object = new wi3_1("4f", yi32, "Application Identifier (AID) - card");
        c = object = new wi3_1("84", yi32, "Dedicated File (DF) Name");
        d = object = new wi3_1("57", yi32, "Track 2 Equivalent Data");
        e = object = new wi3_1("80", yi32, "Response Message Template Format 1");
        f = object = new wi3_1("83", yi32, "Command Template");
        g = object = new wi3_1("94", yi32, "Application File Locator (AFL)");
        yi3 yi33 = yi3.DOL;
        h = object = new wi3_1("9f38", yi33, "Processing Options Data Object List (PDOL)");
        i = object = new wi3_1("9f66", yi32, "Terminal Transaction Qualifiers");
        j = object = new wi3_1("9f6b", yi32, "Track 2 Data");
        k = object = new wi3_1("9f2a", yi32, "The value to be appended to the ADF Name in the data field of the SELECT command, if the Extended Selection Support flag is present and set to 1");
    }

    public static void a() {
        zz0_1.b(b);
        zz0_1.b(c);
        zz0_1.b(d);
        zz0_1.b(e);
        zz0_1.b(f);
        zz0_1.b(g);
        zz0_1.b(h);
        zz0_1.b(i);
        zz0_1.b(j);
        zz0_1.b(k);
    }

    public static void b(wi3_1 wi3_12) {
        byte[] byArray = wi3_12.a;
        byArray.getClass();
        ZE zE = new ZE(byArray);
        ((AbstractMap)a).put(zE, wi3_12);
    }
}

