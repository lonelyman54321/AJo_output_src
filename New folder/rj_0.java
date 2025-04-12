/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;

/*
 * Renamed from rj
 */
public final class rj_0 {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final rj_0 e;

    static {
        rj_0 rj_02;
        int[] nArray;
        int[] nArray2 = nArray = new int[9];
        int[] nArray3 = nArray;
        nArray2[0] = 0x1010003;
        nArray3[1] = 0x1010121;
        nArray2[2] = 0x1010155;
        nArray3[3] = 16843097;
        nArray2[4] = 16843551;
        nArray3[5] = 16843754;
        nArray2[6] = 16843771;
        nArray3[7] = 16843778;
        nArray3[8] = 16843779;
        a = nArray;
        int[] nArray4 = nArray = new int[8];
        int[] nArray5 = nArray;
        nArray4[0] = 0x1010003;
        nArray5[1] = 16843189;
        nArray4[2] = 16843190;
        nArray5[3] = 16843556;
        nArray4[4] = 16843557;
        nArray5[5] = 16843558;
        nArray4[6] = 16843866;
        nArray5[7] = 16843867;
        b = nArray;
        int[] nArray6 = nArray = new int[14];
        int[] nArray7 = nArray;
        nArray6[0] = 0x1010003;
        nArray7[1] = 0x1010404;
        nArray6[2] = 16843781;
        nArray7[3] = 16843782;
        nArray6[4] = 16843783;
        nArray7[5] = 16843784;
        nArray6[6] = 16843785;
        nArray7[7] = 16843786;
        nArray6[8] = 16843787;
        nArray7[9] = 16843788;
        nArray6[10] = 16843789;
        nArray7[11] = 16843979;
        nArray6[12] = 16843980;
        nArray7[13] = 16844062;
        c = nArray;
        d = new int[]{0x1010003, 16843781};
        e = rj_02 = new Object();
    }

    public static int a() {
        Comparable<Calendar> comparable;
        int n3 = ch_2.e;
        Date date = null;
        if (n3 > 0) {
            comparable = Calendar.getInstance();
            comparable.set(14, 0);
            comparable.set(13, 0);
            int n4 = ch_2.a;
            comparable.set(12, n4);
            n4 = ch_2.b;
            comparable.set(11, n4);
            n4 = ch_2.c;
            comparable.set(5, n4);
            n4 = ch_2.d;
            comparable.set(2, n4);
            n4 = ch_2.e;
            int n7 = 1;
            comparable.set(n7, n4);
            comparable = comparable.getTime();
        } else {
            n3 = 0;
            comparable = null;
        }
        if (comparable == null) {
            return 0;
        }
        date = Calendar.getInstance().getTime();
        long l2 = ((Date)comparable).getTime();
        long l3 = date.getTime();
        long l4 = (l2 -= l3) - (l3 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            n3 = -1;
            l3 = n3;
            l2 *= l3;
        }
        l3 = 60000;
        return (int)(l2 / l3);
    }

    public static final String b() {
        Calendar calendar = Calendar.getInstance();
        int n3 = 11;
        int n4 = calendar.get(n3);
        switch (n4) {
            default: {
                return "";
            }
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                return "night";
            }
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                return "evening";
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return "afternoon";
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return "morning";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                return "early morning";
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
        }
        return "Late night";
    }
}

