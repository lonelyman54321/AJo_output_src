/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;
import com.google.common.primitives.Ints;

/*
 * Renamed from eb3
 */
public final class eb3_1 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public eb3_1(String string2, int n3, Integer n4, Integer n7, float f5, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n8) {
        this.a = string2;
        this.b = n3;
        this.c = n4;
        this.d = n7;
        this.e = f5;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = bl5;
        this.j = n8;
    }

    public static int a(String string2) {
        String string3;
        try {
            string3 = string2.trim();
        }
        catch (NumberFormatException numberFormatException) {}
        int n3 = Integer.parseInt(string3);
        switch (n3) {
            default: {
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return n3;
            }
        }
        KW.b("Ignoring unknown alignment: ", string2);
        return -1;
    }

    public static boolean b(String string2) {
        boolean bl2 = false;
        try {
            int n3;
            int n4 = Integer.parseInt(string2);
            int n7 = 1;
            if (n4 == n7 || n4 == (n3 = -1)) {
                bl2 = true;
            }
            return bl2;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder("Failed to parse boolean value: '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            Cx.g(stringBuilder.toString(), numberFormatException);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Integer c(String string2) {
        IllegalArgumentException illegalArgumentException2;
        block6: {
            long l2;
            int n3;
            int n4;
            String string3;
            block5: {
                block4: {
                    string3 = "&H";
                    try {
                        n4 = string2.startsWith(string3);
                        n3 = 16;
                        if (n4 == 0) break block4;
                        n4 = 2;
                        string3 = string2.substring(n4);
                        l2 = Long.parseLong(string3, n3);
                        break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block6;
                    }
                }
                l2 = Long.parseLong(string2);
            }
            long l3 = 0xFFFFFFFFL;
            n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n4 <= 0) {
                n4 = 1;
            } else {
                n4 = 0;
                string3 = null;
            }
            ct3.a(n4 != 0);
            l3 = l2 >> 24;
            long l4 = 255L;
            int n7 = Ints.checkedCast(l3 & l4 ^ l4);
            n4 = Ints.checkedCast(l2 >> n3 & l4);
            n3 = Ints.checkedCast(l2 >> 8 & l4);
            int n8 = Ints.checkedCast(l2 & l4);
            return Color.argb((int)n7, (int)n8, (int)n3, (int)n4);
        }
        StringBuilder stringBuilder = new StringBuilder("Failed to parse color expression: '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        Cx.g(stringBuilder.toString(), illegalArgumentException2);
        return null;
    }
}

