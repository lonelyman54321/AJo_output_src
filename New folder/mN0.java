/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class mN0 {
    public static final mN0$a[] a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;

    static {
        mN0$a mN0$a;
        mN0$a mN0$a2;
        int n3 = 99;
        int n4 = -1;
        mN0$a mN0$a3 = new mN0$a(n3, n3, n4, n4);
        mN0$a mN0$a4 = new mN0$a(35, 36, n4, n4);
        mN0$a mN0$a5 = new mN0$a(71, 72, n4, n4);
        int n7 = 96;
        mN0$a mN0$a6 = new mN0$a(n7, n7, n4, n4);
        mN0$a mN0$a7 = new mN0$a(85, 86, n4, n4);
        mN0$a mN0$a8 = new mN0$a(90, n7, n4, n4);
        mN0$a mN0$a9 = new mN0$a(80, 81, n4, n4);
        int n8 = 6;
        mN0$a mN0$a10 = new mN0$a(n8, n8, n4, n4);
        int n10 = 20;
        mN0$a mN0$a11 = new mN0$a(n10, n10, n4, n4);
        n8 = 19;
        mN0$a mN0$a12 = new mN0$a(n8, n8, n4, n4);
        mN0$a mN0$a13 = new mN0$a(32, 34, n4, n4);
        mN0$a mN0$a14 = new mN0$a(n7, n7, n4, n4);
        mN0$a mN0$a15 = new mN0$a(30, 31, n4, n4);
        int n14 = 96;
        mN0$a mN0$a16 = mN0$a2 = new mN0$a(n14, n14, n4, n4);
        mN0$a mN0$a17 = mN0$a2 = new mN0$a(n14, n14, n4, n4);
        mN0$a mN0$a18 = mN0$a15;
        mN0$a[] mN0$aArray = new mN0$a(50, 52, n4, n4);
        n7 = 83;
        mN0$a mN0$a19 = mN0$a15 = new mN0$a(n7, n7, n4, n4);
        mN0$a[] mN0$aArray2 = mN0$aArray;
        mN0$a mN0$a20 = mN0$a2 = new mN0$a(60, 62, n4, n4);
        mN0$a[] mN0$aArray3 = mN0$aArray = new mN0$a(46, 47, n4, n4);
        mN0$a mN0$a21 = mN0$a14;
        mN0$a2 = new mN0$a(66, 67, 73, n4);
        mN0$a[] mN0$aArray4 = mN0$aArray = new mN0$a(40, 42, n4, n4);
        mN0$a mN0$a22 = mN0$a14 = new mN0$a(70, 71, n4, n4);
        mN0$a[] mN0$aArray5 = mN0$aArray = new mN0$a(1, 2, n4, n4);
        mN0$a mN0$a23 = mN0$a15 = new mN0$a(20, 21, n4, n4);
        mN0$aArray = new mN0$a(3, 4, n4, n4);
        int n15 = 96;
        mN0$a mN0$a24 = mN0$a14 = new mN0$a(n15, n15, n4, n4);
        mN0$a[] mN0$aArray6 = mN0$aArray;
        mN0$a mN0$a25 = mN0$a15 = new mN0$a(48, 49, n4, n4);
        mN0$a mN0$a26 = mN0$a14 = new mN0$a(55, 56, n4, n4);
        mN0$aArray = new mN0$a(63, 65, n4, n4);
        n15 = 96;
        mN0$a mN0$a27 = mN0$a14 = new mN0$a(n15, n15, n4, n4);
        mN0$a[] mN0$aArray7 = mN0$aArray;
        mN0$a mN0$a28 = mN0$a15 = new mN0$a(38, 39, n4, n4);
        mN0$a mN0$a29 = mN0$a14 = new mN0$a(55, 56, n4, n4);
        mN0$aArray = new mN0$a(27, 28, n4, n4);
        n15 = 58;
        mN0$a mN0$a30 = mN0$a14 = new mN0$a(n15, n15, n4, n4);
        mN0$a[] mN0$aArray8 = mN0$aArray;
        mN0$a mN0$a31 = mN0$a15 = new mN0$a(68, 69, n4, n4);
        mN0$a mN0$a32 = mN0$a14 = new mN0$a(3, 4, n4, n4);
        mN0$a[] mN0$aArray9 = mN0$aArray = new mN0$a(7, 8, n4, n4);
        n14 = 88;
        mN0$a mN0$a33 = mN0$a2;
        mN0$a mN0$a34 = mN0$a14 = new mN0$a(87, n14, 86, n4);
        mN0$a mN0$a35 = mN0$a2 = new mN0$a(n14, 89, 96, n4);
        mN0$a14 = new mN0$a(10, 14, 0, 6);
        n4 = -1;
        mN0$a[] mN0$aArray10 = mN0$aArray = new mN0$a(43, 45, n4, n4);
        mN0$a2 = new mN0$a(73, 74, n4, n4);
        n15 = 97;
        mN0$a[] mN0$aArray11 = mN0$aArray = new mN0$a(n15, n15, n4, n4);
        mN0$a mN0$a36 = mN0$a2;
        mN0$a15 = new mN0$a(15, 19, n4, n4);
        n4 = 6;
        mN0$aArray = new mN0$a(n4, n4, 0, 9);
        n7 = 96;
        n15 = -1;
        mN0$a mN0$a37 = mN0$a = new mN0$a(n7, n7, n15, n15);
        n4 = 2;
        mN0$a mN0$a38 = mN0$a2 = new mN0$a(n4, n4, n15, n15);
        n7 = 29;
        mN0$a mN0$a39 = mN0$a = new mN0$a(n7, n7, n15, n15);
        n4 = 57;
        mN0$a mN0$a40 = mN0$a2 = new mN0$a(n4, n4, n15, n15);
        mN0$a[] mN0$aArray12 = mN0$aArray;
        mN0$a mN0$a41 = mN0$a = new mN0$a(37, 38, n15, n15);
        mN0$a mN0$a42 = mN0$a14;
        mN0$aArray = new mN0$a(75, 79, 87, 88);
        n15 = -1;
        mN0$a mN0$a43 = mN0$a = new mN0$a(84, 84, n15, n15);
        mN0$a[] mN0$aArray13 = mN0$aArray;
        mN0$a14 = new mN0$a(22, 24, 20, n15);
        mN0$aArray = new mN0$a(6, 9, n15, n15);
        n7 = 5;
        mN0$a mN0$a44 = mN0$a = new mN0$a(n7, n7, n15, n15);
        mN0$a[] mN0$aArray14 = mN0$aArray;
        mN0$a2 = new mN0$a(98, 99, n15, n15);
        mN0$a mN0$a45 = mN0$a = new mN0$a(53, 54, n15, n15);
        mN0$a[] mN0$aArray15 = mN0$aArray = new mN0$a(24, 26, n15, n15);
        mN0$a = new mN0$a(82, 83, n15, n15);
        mN0$aArray = new mN0$a[]{mN0$a3, mN0$a4, mN0$a5, mN0$a6, mN0$a7, mN0$a8, mN0$a9, mN0$a10, mN0$a11, mN0$a12, mN0$a13, mN0$a21, mN0$a18, mN0$a16, mN0$a17, mN0$aArray2, mN0$a19, mN0$a20, mN0$aArray3, mN0$a33, mN0$aArray4, mN0$a22, mN0$aArray5, mN0$a23, mN0$aArray6, mN0$a24, mN0$a25, mN0$a26, mN0$aArray7, mN0$a27, mN0$a28, mN0$a29, mN0$aArray8, mN0$a30, mN0$a31, mN0$a32, mN0$aArray9, mN0$a34, mN0$a35, mN0$a42, mN0$aArray10, mN0$a36, mN0$aArray11, mN0$a15, mN0$aArray12, mN0$a37, mN0$a38, mN0$a39, mN0$a40, mN0$a41, mN0$aArray13, mN0$a43, mN0$a14, mN0$aArray14, mN0$a44, mN0$a2, mN0$a45, mN0$aArray15, mN0$a};
        a = mN0$aArray;
        n3 = 2;
        b = Pattern.compile("[^,*\u2022\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*\u2022\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", n3);
        c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", n3);
        d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+of[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+states[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+of[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+mariana[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+carolina)|(nd|north[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+hampshire)|(nj|new[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+jersey)|(nm|new[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+island)|(sc|south[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+carolina)|(sd|south[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000]+virginia)|(wy|wyoming))(?=[,*\u2022\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", n3);
        e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*\u2022\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", n3);
        f = Pattern.compile("([0-9]+)(st|nd|rd|th)", n3);
        g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*\u2022\t \u00a0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", n3);
    }

    public static boolean a(String object) {
        int n3;
        int n4;
        int n7 = 0;
        Object object2 = null;
        int n8 = 0;
        for (n4 = 0; n4 < (n3 = ((String)object).length()); ++n4) {
            n3 = (int)(Character.isDigit(((String)object).charAt(n4)) ? 1 : 0);
            if (n3 == 0) continue;
            ++n8;
        }
        n4 = 5;
        if (n8 > n4) {
            return false;
        }
        object2 = f;
        object = ((Pattern)object2).matcher((CharSequence)object);
        n4 = (int)(((Matcher)object).find() ? 1 : 0);
        n8 = 1;
        if (n4 != 0) {
            object2 = ((Matcher)object).group(n8);
            n4 = Integer.parseInt((String)object2);
            if (n4 == 0) {
                return false;
            }
            n7 = 2;
            object = ((Matcher)object).group(n7);
            Locale locale = Locale.getDefault();
            object = ((String)object).toLowerCase(locale);
            n3 = n4 % 10;
            String string2 = "th";
            if (n3 != n8) {
                if (n3 != n7) {
                    n7 = 3;
                    if (n3 != n7) {
                        return ((String)object).equals(string2);
                    }
                    n7 = 13;
                    if ((n4 %= 100) != n7) {
                        string2 = "rd";
                    }
                    return ((String)object).equals(string2);
                }
                n7 = 12;
                if ((n4 %= 100) != n7) {
                    string2 = "nd";
                }
                return ((String)object).equals(string2);
            }
            n7 = 11;
            if ((n4 %= 100) != n7) {
                string2 = "st";
            }
            return ((String)object).equals(string2);
        }
        return n8 != 0;
    }
}

