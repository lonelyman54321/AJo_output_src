/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 */
import android.graphics.ColorFilter;

/*
 * Renamed from Ay
 */
public final class ay_1
extends TX {
    public final long b;
    public final int c;

    public ay_1(long l2, int n3, ColorFilter colorFilter) {
        super(colorFilter);
        this.b = l2;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ay_1;
        if (n3 == 0) {
            return false;
        }
        object = (ay_1)object;
        long l2 = this.b;
        long l3 = ((ay_1)object).b;
        n3 = OX.c(l2, l3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((ay_1)object).c;
        if ((n4 = (int)(zy_0.a(n3, n4) ? 1 : 0)) == 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = OX.m;
        n3 = mt3_0.a(this.b) * 31;
        int n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BlendModeColorFilter(color=");
        long l2 = this.b;
        String string2 = OX.i(l2);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", blendMode=");
        string2 = null;
        int n3 = this.c;
        boolean bl2 = zy_0.a(n3, 0);
        string2 = bl2 ? "Clear" : ((bl2 = zy_0.a(n3, 1)) ? "Src" : ((bl2 = zy_0.a(n3, 2)) ? "Dst" : ((bl2 = zy_0.a(n3, 3)) ? "SrcOver" : ((bl2 = zy_0.a(n3, 4)) ? "DstOver" : ((bl2 = zy_0.a(n3, 5)) ? "SrcIn" : ((bl2 = zy_0.a(n3, 6)) ? "DstIn" : ((bl2 = zy_0.a(n3, 7)) ? "SrcOut" : ((bl2 = zy_0.a(n3, 8)) ? "DstOut" : ((bl2 = zy_0.a(n3, 9)) ? "SrcAtop" : ((bl2 = zy_0.a(n3, 10)) ? "DstAtop" : ((bl2 = zy_0.a(n3, 11)) ? "Xor" : ((bl2 = zy_0.a(n3, 12)) ? "Plus" : ((bl2 = zy_0.a(n3, 13)) ? "Modulate" : ((bl2 = zy_0.a(n3, 14)) ? "Screen" : ((bl2 = zy_0.a(n3, 15)) ? "Overlay" : ((bl2 = zy_0.a(n3, 16)) ? "Darken" : ((bl2 = zy_0.a(n3, 17)) ? "Lighten" : ((bl2 = zy_0.a(n3, 18)) ? "ColorDodge" : ((bl2 = zy_0.a(n3, 19)) ? "ColorBurn" : ((bl2 = zy_0.a(n3, 20)) ? "HardLight" : ((bl2 = zy_0.a(n3, 21)) ? "Softlight" : ((bl2 = zy_0.a(n3, 22)) ? "Difference" : ((bl2 = zy_0.a(n3, 23)) ? "Exclusion" : ((bl2 = zy_0.a(n3, 24)) ? "Multiply" : ((bl2 = zy_0.a(n3, 25)) ? "Hue" : ((bl2 = zy_0.a(n3, 26)) ? "Saturation" : ((bl2 = zy_0.a(n3, 27)) ? "Color" : ((bl2 = zy_0.a(n3, 28)) ? "Luminosity" : "Unknown"))))))))))))))))))))))))))));
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

