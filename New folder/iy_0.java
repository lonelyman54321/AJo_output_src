/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff$Mode
 */
import android.graphics.PorterDuff;

/*
 * Renamed from Iy
 */
public final class iy_0 {
    public static PorterDuff.Mode a(hy_0 hy_02) {
        if (hy_02 == null) {
            return null;
        }
        int[] nArray = Iy$a.a;
        int n3 = hy_02.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                return null;
            }
            case 18: {
                return PorterDuff.Mode.LIGHTEN;
            }
            case 17: {
                return PorterDuff.Mode.DARKEN;
            }
            case 16: {
                return PorterDuff.Mode.OVERLAY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 13: {
                return PorterDuff.Mode.ADD;
            }
            case 12: {
                return PorterDuff.Mode.XOR;
            }
            case 11: {
                return PorterDuff.Mode.DST_ATOP;
            }
            case 10: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 9: {
                return PorterDuff.Mode.DST_OUT;
            }
            case 8: {
                return PorterDuff.Mode.SRC_OUT;
            }
            case 7: {
                return PorterDuff.Mode.DST_IN;
            }
            case 6: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 5: {
                return PorterDuff.Mode.DST_OVER;
            }
            case 4: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 3: {
                return PorterDuff.Mode.DST;
            }
            case 2: {
                return PorterDuff.Mode.SRC;
            }
            case 1: 
        }
        return PorterDuff.Mode.CLEAR;
    }
}

