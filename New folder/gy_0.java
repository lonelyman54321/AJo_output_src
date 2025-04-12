/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.BlendModeColorFilter
 *  android.graphics.ColorFilter
 */
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/*
 * Renamed from Gy
 */
public final class gy_0 {
    public static final gy_0 a;

    static {
        gy_0 gy_02;
        a = gy_02 = new Object();
    }

    public final BlendModeColorFilter a(long l2, int n3) {
        fy_0.a();
        int n4 = zx_0.i(l2);
        BlendMode blendMode = Lf.a(n3);
        return ey_0.a(n4, blendMode);
    }

    public final ay_1 b(BlendModeColorFilter blendModeColorFilter) {
        int n3 = cy_0.a(blendModeColorFilter);
        long l2 = zx_0.c(n3);
        BlendMode blendMode = dy_0.a(blendModeColorFilter);
        int[] nArray = Lf$a.$EnumSwitchMapping$0;
        int n4 = Bf.a(blendMode);
        n4 = nArray[n4];
        switch (n4) {
            default: {
                n4 = 3;
                break;
            }
            case 29: {
                n4 = 28;
                break;
            }
            case 28: {
                n4 = 27;
                break;
            }
            case 27: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 25;
                break;
            }
            case 25: {
                n4 = 24;
                break;
            }
            case 24: {
                n4 = 23;
                break;
            }
            case 23: {
                n4 = 22;
                break;
            }
            case 22: {
                n4 = 21;
                break;
            }
            case 21: {
                n4 = 20;
                break;
            }
            case 20: {
                n4 = 19;
                break;
            }
            case 19: {
                n4 = 18;
                break;
            }
            case 18: {
                n4 = 17;
                break;
            }
            case 17: {
                n4 = 16;
                break;
            }
            case 16: {
                n4 = 15;
                break;
            }
            case 15: {
                n4 = 14;
                break;
            }
            case 14: {
                n4 = 13;
                break;
            }
            case 13: {
                n4 = 12;
                break;
            }
            case 12: {
                n4 = 11;
                break;
            }
            case 11: {
                n4 = 10;
                break;
            }
            case 10: {
                n4 = 9;
                break;
            }
            case 9: {
                n4 = 8;
                break;
            }
            case 8: {
                n4 = 7;
                break;
            }
            case 7: {
                n4 = 6;
                break;
            }
            case 6: {
                n4 = 5;
                break;
            }
            case 5: {
                n4 = 4;
                break;
            }
            case 3: {
                n4 = 2;
                break;
            }
            case 2: {
                n4 = 1;
                break;
            }
            case 1: {
                n4 = 0;
                blendMode = null;
            }
        }
        ay_1 ay_12 = new ay_1(l2, n4, (ColorFilter)blendModeColorFilter);
        return ay_12;
    }
}

