/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.text.TextUtils
 */
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.f;
import com.google.common.base.Ascii;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class gz3 {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final long[] g;
    public static final Pattern h;
    public static final Pattern i;
    public static HashMap j;
    public static final String[] k;
    public static final String[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;

    static {
        int[] nArray;
        String string2;
        String string3;
        int n3;
        a = n3 = Build.VERSION.SDK_INT;
        Object object = Build.DEVICE;
        b = object;
        c = string3 = Build.MANUFACTURER;
        d = string2 = Build.MODEL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        object = ", ";
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        stringBuilder.append((String)object);
        stringBuilder.append(string3);
        stringBuilder.append((String)object);
        stringBuilder.append(n3);
        e = stringBuilder.toString();
        f = new byte[0];
        g = new long[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        h = Pattern.compile("%([A-Fa-f0-9]{2})");
        i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        n3 = 256;
        Object object2 = object = (Object)new int[n3];
        object2[0] = false;
        object2[1] = 79764919;
        object2[2] = 159529838;
        object2[3] = 222504665;
        object2[4] = 319059676;
        object2[5] = 398814059;
        object2[6] = 445009330;
        object2[7] = 507990021;
        object2[8] = 638119352;
        object2[9] = 583659535;
        object2[10] = 797628118;
        object2[11] = 726387553;
        object2[12] = 890018660;
        object2[13] = 835552979;
        object2[14] = 1015980042;
        object2[15] = 944750013;
        object2[16] = 1276238704;
        object2[17] = 1221641927;
        object2[18] = 1167319070;
        object2[19] = 1095957929;
        object2[20] = 1595256236;
        object2[21] = 1540665371;
        object2[22] = 1452775106;
        object2[23] = 1381403509;
        object2[24] = 1780037320;
        object2[25] = 1859660671;
        object2[26] = 1671105958;
        object2[27] = 1733955601;
        object2[28] = 2031960084;
        object2[29] = 2111593891;
        object2[30] = 1889500026;
        object2[31] = 1952343757;
        object2[32] = -1742489888;
        object2[33] = -1662866601;
        object2[34] = -1851683442;
        object2[35] = -1788833735;
        object2[36] = -1960329156;
        object2[37] = -1880695413;
        object2[38] = -2103051438;
        object2[39] = -2040207643;
        object2[40] = -1104454824;
        object2[41] = -1159051537;
        object2[42] = -1213636554;
        object2[43] = -1284997759;
        object2[44] = -1389417084;
        object2[45] = -1444007885;
        object2[46] = -1532160278;
        object2[47] = -1603531939;
        object2[48] = -734892656;
        object2[49] = -789352409;
        object2[50] = -575645954;
        object2[51] = -646886583;
        object2[52] = -952755380;
        object2[53] = -1007220997;
        object2[54] = -827056094;
        object2[55] = -898286187;
        object2[56] = -231047128;
        object2[57] = -151282273;
        object2[58] = -71779514;
        object2[59] = -8804623;
        object2[60] = -515967244;
        object2[61] = -436212925;
        object2[62] = -390279782;
        object2[63] = -327299027;
        object2[64] = 881225847;
        object2[65] = 809987520;
        object2[66] = 1023691545;
        object2[67] = 969234094;
        object2[68] = 662832811;
        object2[69] = 591600412;
        object2[70] = 771767749;
        object2[71] = 717299826;
        object2[72] = 311336399;
        object2[73] = 374308984;
        object2[74] = 453813921;
        object2[75] = 533576470;
        object2[76] = 25881363;
        object2[77] = 88864420;
        object2[78] = 134795389;
        object2[79] = 214552010;
        object2[80] = 2023205639;
        object2[81] = 2086057648;
        object2[82] = 1897238633;
        object2[83] = 1976864222;
        object2[84] = 1804852699;
        object2[85] = 1867694188;
        object2[86] = 1645340341;
        object2[87] = 1724971778;
        object2[88] = 1587496639;
        object2[89] = 1516133128;
        object2[90] = 1461550545;
        object2[91] = 1406951526;
        object2[92] = 1302016099;
        object2[93] = 1230646740;
        object2[94] = 1142491917;
        object2[95] = 1087903418;
        object2[96] = -1398421865;
        object2[97] = -1469785312;
        object2[98] = -1524105735;
        object2[99] = -1578704818;
        object2[100] = -1079922613;
        object2[101] = -1151291908;
        object2[102] = -1239184603;
        object2[103] = -1293773166;
        object2[104] = -1968362705;
        object2[105] = -1905510760;
        object2[106] = -2094067647;
        object2[107] = -2014441994;
        object2[108] = -1716953613;
        object2[109] = -1654112188;
        object2[110] = -1876203875;
        object2[111] = -1796572374;
        object2[112] = -525066777;
        object2[113] = -462094256;
        object2[114] = -382327159;
        object2[115] = -302564546;
        object2[116] = -206542021;
        object2[117] = -143559028;
        object2[118] = -97365931;
        object2[119] = -17609246;
        object2[120] = -960696225;
        object2[121] = -1031934488;
        object2[122] = -817968335;
        object2[123] = -872425850;
        object2[124] = -709327229;
        object2[125] = -780559564;
        object2[126] = -600130067;
        object2[127] = -654598054;
        object2[128] = 1762451694;
        object2[129] = 1842216281;
        object2[130] = 1619975040;
        object2[131] = 1682949687;
        object2[132] = 2047383090;
        object2[133] = 2127137669;
        object2[134] = 1938468188;
        object2[135] = 2001449195;
        object2[136] = 1325665622;
        object2[137] = 1271206113;
        object2[138] = 1183200824;
        object2[139] = 1111960463;
        object2[140] = 1543535498;
        object2[141] = 1489069629;
        object2[142] = 1434599652;
        object2[143] = 1363369299;
        object2[144] = 622672798;
        object2[145] = 568075817;
        object2[146] = 748617968;
        object2[147] = 677256519;
        object2[148] = 907627842;
        object2[149] = 853037301;
        object2[150] = 1067152940;
        object2[151] = 995781531;
        object2[152] = 51762726;
        object2[153] = 131386257;
        object2[154] = 177728840;
        object2[155] = 240578815;
        object2[156] = 269590778;
        object2[157] = 349224269;
        object2[158] = 429104020;
        object2[159] = 491947555;
        object2[160] = -248556018;
        object2[161] = -168932423;
        object2[162] = -122852000;
        object2[163] = -60002089;
        object2[164] = -500490030;
        object2[165] = -420856475;
        object2[166] = -341238852;
        object2[167] = -278395381;
        object2[168] = -685261898;
        object2[169] = -739858943;
        object2[170] = -559578920;
        object2[171] = -630940305;
        object2[172] = -1004286614;
        object2[173] = -1058877219;
        object2[174] = -845023740;
        object2[175] = -916395085;
        object2[176] = -1119974018;
        object2[177] = -1174433591;
        object2[178] = -1262701040;
        object2[179] = -1333941337;
        object2[180] = -1371866206;
        object2[181] = -1426332139;
        object2[182] = -1481064244;
        object2[183] = -1552294533;
        object2[184] = -1690935098;
        object2[185] = -1611170447;
        object2[186] = -1833673816;
        object2[187] = -1770699233;
        object2[188] = -2009983462;
        object2[189] = -1930228819;
        object2[190] = -2119160460;
        object2[191] = -2056179517;
        object2[192] = 1569362073;
        object2[193] = 1498123566;
        object2[194] = 1409854455;
        object2[195] = 1355396672;
        object2[196] = 1317987909;
        object2[197] = 1246755826;
        object2[198] = 1192025387;
        object2[199] = 1137557660;
        object2[200] = 2072149281;
        object2[201] = 2135122070;
        object2[202] = 1912620623;
        object2[203] = 1992383480;
        object2[204] = 1753615357;
        object2[205] = 1816598090;
        object2[206] = 1627664531;
        object2[207] = 1707420964;
        object2[208] = 295390185;
        object2[209] = 358241886;
        object2[210] = 404320391;
        object2[211] = 483945776;
        object2[212] = 43990325;
        object2[213] = 106832002;
        object2[214] = 186451547;
        object2[215] = 266083308;
        object2[216] = 932423249;
        object2[217] = 861060070;
        object2[218] = 1041341759;
        object2[219] = 986742920;
        object2[220] = 613929101;
        object2[221] = 542559546;
        object2[222] = 756411363;
        object2[223] = 701822548;
        object2[224] = -978770311;
        object2[225] = -1050133554;
        object2[226] = -869589737;
        object2[227] = -924188512;
        object2[228] = -693284699;
        object2[229] = -764654318;
        object2[230] = -550540341;
        object2[231] = -605129092;
        object2[232] = -475935807;
        object2[233] = -413084042;
        object2[234] = -366743377;
        object2[235] = -287118056;
        object2[236] = -257573603;
        object2[237] = -194731862;
        object2[238] = -114850189;
        object2[239] = -35218492;
        object2[240] = -1984365303;
        object2[241] = -1921392450;
        object2[242] = -2143631769;
        object2[243] = -2063868976;
        object2[244] = -1698919467;
        object2[245] = -1635936670;
        object2[246] = -1824608069;
        object2[247] = -1744851700;
        object2[248] = -1347415887;
        object2[249] = -1418654458;
        object2[250] = -1506661409;
        object2[251] = -1561119128;
        object2[252] = -1129027987;
        object2[253] = -1200260134;
        object2[254] = -1254728445;
        object2[255] = -1309196108;
        m = (int[])object;
        Object object3 = object = (Object)new int[16];
        object3[0] = false;
        object3[1] = 4129;
        object3[2] = 8258;
        object3[3] = 12387;
        object3[4] = 16516;
        object3[5] = 20645;
        object3[6] = 24774;
        object3[7] = 28903;
        object3[8] = 33032;
        object3[9] = 37161;
        object3[10] = 41290;
        object3[11] = 45419;
        object3[12] = 49548;
        object3[13] = 53677;
        object3[14] = 57806;
        object3[15] = 61935;
        n = (int[])object;
        int[] nArray2 = nArray = new int[n3];
        int[] nArray3 = nArray;
        nArray2[0] = 0;
        nArray3[1] = 7;
        nArray2[2] = 14;
        nArray3[3] = 9;
        nArray2[4] = 28;
        nArray3[5] = 27;
        nArray2[6] = 18;
        nArray3[7] = 21;
        nArray2[8] = 56;
        nArray3[9] = 63;
        nArray2[10] = 54;
        nArray3[11] = 49;
        nArray2[12] = 36;
        nArray3[13] = 35;
        nArray2[14] = 42;
        nArray3[15] = 45;
        nArray2[16] = 112;
        nArray3[17] = 119;
        nArray2[18] = 126;
        nArray3[19] = 121;
        nArray2[20] = 108;
        nArray3[21] = 107;
        nArray2[22] = 98;
        nArray3[23] = 101;
        nArray2[24] = 72;
        nArray3[25] = 79;
        nArray2[26] = 70;
        nArray3[27] = 65;
        nArray2[28] = 84;
        nArray3[29] = 83;
        nArray2[30] = 90;
        nArray3[31] = 93;
        nArray2[32] = 224;
        nArray3[33] = 231;
        nArray2[34] = 238;
        nArray3[35] = 233;
        nArray2[36] = 252;
        nArray3[37] = 251;
        nArray2[38] = 242;
        nArray3[39] = 245;
        nArray2[40] = 216;
        nArray3[41] = 223;
        nArray2[42] = 214;
        nArray3[43] = 209;
        nArray2[44] = 196;
        nArray3[45] = 195;
        nArray2[46] = 202;
        nArray3[47] = 205;
        nArray2[48] = 144;
        nArray3[49] = 151;
        nArray2[50] = 158;
        nArray3[51] = 153;
        nArray2[52] = 140;
        nArray3[53] = 139;
        nArray2[54] = 130;
        nArray3[55] = 133;
        nArray2[56] = 168;
        nArray3[57] = 175;
        nArray2[58] = 166;
        nArray3[59] = 161;
        nArray2[60] = 180;
        nArray3[61] = 179;
        nArray2[62] = 186;
        nArray3[63] = 189;
        nArray2[64] = 199;
        nArray3[65] = 192;
        nArray2[66] = 201;
        nArray3[67] = 206;
        nArray2[68] = 219;
        nArray3[69] = 220;
        nArray2[70] = 213;
        nArray3[71] = 210;
        nArray2[72] = 255;
        nArray3[73] = 248;
        nArray2[74] = 241;
        nArray3[75] = 246;
        nArray2[76] = 227;
        nArray3[77] = 228;
        nArray2[78] = 237;
        nArray3[79] = 234;
        nArray2[80] = 183;
        nArray3[81] = 176;
        nArray2[82] = 185;
        nArray3[83] = 190;
        nArray2[84] = 171;
        nArray3[85] = 172;
        nArray2[86] = 165;
        nArray3[87] = 162;
        nArray2[88] = 143;
        nArray3[89] = 136;
        nArray2[90] = 129;
        nArray3[91] = 134;
        nArray2[92] = 147;
        nArray3[93] = 148;
        nArray2[94] = 157;
        nArray3[95] = 154;
        nArray2[96] = 39;
        nArray3[97] = 32;
        nArray2[98] = 41;
        nArray3[99] = 46;
        nArray2[100] = 59;
        nArray3[101] = 60;
        nArray2[102] = 53;
        nArray3[103] = 50;
        nArray2[104] = 31;
        nArray3[105] = 24;
        nArray2[106] = 17;
        nArray3[107] = 22;
        nArray2[108] = 3;
        nArray3[109] = 4;
        nArray2[110] = 13;
        nArray3[111] = 10;
        nArray2[112] = 87;
        nArray3[113] = 80;
        nArray2[114] = 89;
        nArray3[115] = 94;
        nArray2[116] = 75;
        nArray3[117] = 76;
        nArray2[118] = 69;
        nArray3[119] = 66;
        nArray2[120] = 111;
        nArray3[121] = 104;
        nArray2[122] = 97;
        nArray3[123] = 102;
        nArray2[124] = 115;
        nArray3[125] = 116;
        nArray2[126] = 125;
        nArray3[127] = 122;
        nArray2[128] = 137;
        nArray3[129] = 142;
        nArray2[130] = 135;
        nArray3[131] = 128;
        nArray2[132] = 149;
        nArray3[133] = 146;
        nArray2[134] = 155;
        nArray3[135] = 156;
        nArray2[136] = 177;
        nArray3[137] = 182;
        nArray2[138] = 191;
        nArray3[139] = 184;
        nArray2[140] = 173;
        nArray3[141] = 170;
        nArray2[142] = 163;
        nArray3[143] = 164;
        nArray2[144] = 249;
        nArray3[145] = 254;
        nArray2[146] = 247;
        nArray3[147] = 240;
        nArray2[148] = 229;
        nArray3[149] = 226;
        nArray2[150] = 235;
        nArray3[151] = 236;
        nArray2[152] = 193;
        nArray3[153] = 198;
        nArray2[154] = 207;
        nArray3[155] = 200;
        nArray2[156] = 221;
        nArray3[157] = 218;
        nArray2[158] = 211;
        nArray3[159] = 212;
        nArray2[160] = 105;
        nArray3[161] = 110;
        nArray2[162] = 103;
        nArray3[163] = 96;
        nArray2[164] = 117;
        nArray3[165] = 114;
        nArray2[166] = 123;
        nArray3[167] = 124;
        nArray2[168] = 81;
        nArray3[169] = 86;
        nArray2[170] = 95;
        nArray3[171] = 88;
        nArray2[172] = 77;
        nArray3[173] = 74;
        nArray2[174] = 67;
        nArray3[175] = 68;
        nArray2[176] = 25;
        nArray3[177] = 30;
        nArray2[178] = 23;
        nArray3[179] = 16;
        nArray2[180] = 5;
        nArray3[181] = 2;
        nArray2[182] = 11;
        nArray3[183] = 12;
        nArray2[184] = 33;
        nArray3[185] = 38;
        nArray2[186] = 47;
        nArray3[187] = 40;
        nArray2[188] = 61;
        nArray3[189] = 58;
        nArray2[190] = 51;
        nArray3[191] = 52;
        nArray2[192] = 78;
        nArray3[193] = 73;
        nArray2[194] = 64;
        nArray3[195] = 71;
        nArray2[196] = 82;
        nArray3[197] = 85;
        nArray2[198] = 92;
        nArray3[199] = 91;
        nArray2[200] = 118;
        nArray3[201] = 113;
        nArray2[202] = 120;
        nArray3[203] = 127;
        nArray2[204] = 106;
        nArray3[205] = 109;
        nArray2[206] = 100;
        nArray3[207] = 99;
        nArray2[208] = 62;
        nArray3[209] = 57;
        nArray2[210] = 48;
        nArray3[211] = 55;
        nArray2[212] = 34;
        nArray3[213] = 37;
        nArray2[214] = 44;
        nArray3[215] = 43;
        nArray2[216] = 6;
        nArray3[217] = 1;
        nArray2[218] = 8;
        nArray3[219] = 15;
        nArray2[220] = 26;
        nArray3[221] = 29;
        nArray2[222] = 20;
        nArray3[223] = 19;
        nArray2[224] = 174;
        nArray3[225] = 169;
        nArray2[226] = 160;
        nArray3[227] = 167;
        nArray2[228] = 178;
        nArray3[229] = 181;
        nArray2[230] = 188;
        nArray3[231] = 187;
        nArray2[232] = 150;
        nArray3[233] = 145;
        nArray2[234] = 152;
        nArray3[235] = 159;
        nArray2[236] = 138;
        nArray3[237] = 141;
        nArray2[238] = 132;
        nArray3[239] = 131;
        nArray2[240] = 222;
        nArray3[241] = 217;
        nArray2[242] = 208;
        nArray3[243] = 215;
        nArray2[244] = 194;
        nArray3[245] = 197;
        nArray2[246] = 204;
        nArray3[247] = 203;
        nArray2[248] = 230;
        nArray3[249] = 225;
        nArray2[250] = 232;
        nArray3[251] = 239;
        nArray2[252] = 250;
        nArray3[253] = 253;
        nArray2[254] = 244;
        nArray3[255] = 243;
        o = nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean A(f f5) {
        int n3;
        int n4;
        int n7;
        block6: {
            block5: {
                int n8;
                block4: {
                    n7 = 0;
                    if (f5 == null) {
                        return false;
                    }
                    n4 = f5.getPlaybackState();
                    if (n4 != (n3 = 1) || !(n8 = (int)(f5.isCommandAvailable(2) ? 1 : 0))) break block4;
                    f5.prepare();
                    break block5;
                }
                n8 = 4;
                if (n4 != n8 || !(n4 = (int)(f5.isCommandAvailable(n8) ? 1 : 0))) break block6;
                f5.seekToDefaultPosition();
            }
            n7 = 1;
        }
        n4 = (int)(f5.isCommandAvailable(n3) ? 1 : 0);
        if (n4 == 0) return n7 != 0;
        f5.play();
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int B(Uri object, String object2) {
        int n3 = -1;
        int n4 = 1;
        int n7 = 2;
        int n8 = 4;
        int n10 = 3;
        if (object2 == null) {
            String string2;
            int n14;
            object2 = object.getScheme();
            if (object2 != null && (n14 = Ascii.equalsIgnoreCase(string2 = "rtsp", (CharSequence)object2)) != 0) {
                return 3;
            }
            object2 = object.getLastPathSegment();
            if (object2 == null) {
                return 4;
            }
            int n15 = ((String)object2).lastIndexOf(46);
            if (n15 >= 0) {
                object2 = Ascii.toLowerCase(((String)object2).substring(n15 += n4));
                object2.getClass();
                n15 = ((String)object2).hashCode();
                switch (n15) {
                    default: {
                        break;
                    }
                    case 3299913: {
                        string2 = "m3u8";
                        n14 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n14 == 0) break;
                        n3 = 3;
                        break;
                    }
                    case 3242057: {
                        String string3 = "isml";
                        n14 = (int)(((String)object2).equals(string3) ? 1 : 0);
                        if (n14 == 0) break;
                        n3 = 2;
                        break;
                    }
                    case 108321: {
                        String string4 = "mpd";
                        n14 = (int)(((String)object2).equals(string4) ? 1 : 0);
                        if (n14 == 0) break;
                        n3 = 1;
                        break;
                    }
                    case 104579: {
                        String string5 = "ism";
                        n14 = (int)(((String)object2).equals(string5) ? 1 : 0);
                        if (n14 == 0) break;
                        n3 = 0;
                    }
                }
                switch (n3) {
                    default: {
                        n14 = 4;
                        break;
                    }
                    case 3: {
                        n14 = 2;
                        break;
                    }
                    case 1: {
                        n14 = 0;
                        object2 = null;
                        break;
                    }
                    case 0: 
                    case 2: {
                        n14 = 1;
                    }
                }
                if (n14 != n8) {
                    return n14;
                }
            }
            object = object.getPath();
            object.getClass();
            object2 = i;
            n14 = ((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).matches();
            if (n14 == 0) return 4;
            if ((object = ((Matcher)object).group(n7)) == null) return n4;
            object2 = "format=mpd-time-csf";
            n14 = (int)(((String)object).contains((CharSequence)object2) ? 1 : 0);
            if (n14 != 0) {
                return 0;
            }
            object2 = "format=m3u8-aapl";
            boolean bl2 = ((String)object).contains((CharSequence)object2);
            if (!bl2) return n4;
            return 2;
        }
        int n16 = ((String)object2).hashCode();
        switch (n16) {
            default: {
                break;
            }
            case 1154777587: {
                object = "application/x-rtsp";
                n16 = (int)(((String)object2).equals(object) ? 1 : 0);
                if (n16 == 0) break;
                n3 = 3;
                break;
            }
            case 64194685: {
                object = "application/dash+xml";
                n16 = (int)(((String)object2).equals(object) ? 1 : 0);
                if (n16 == 0) break;
                n3 = 2;
                break;
            }
            case -156749520: {
                object = "application/vnd.ms-sstr+xml";
                n16 = (int)(((String)object2).equals(object) ? 1 : 0);
                if (n16 == 0) break;
                n3 = 1;
                break;
            }
            case -979127466: {
                object = "application/x-mpegURL";
                n16 = (int)(((String)object2).equals(object) ? 1 : 0);
                if (n16 == 0) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return n8;
            }
            case 3: {
                return n10;
            }
            case 2: {
                return 0;
            }
            case 1: {
                return n4;
            }
            case 0: 
        }
        return n7;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean C(Xm2 xm2, Xm2 xm22, Inflater inflater) {
        Throwable throwable222222;
        block13: {
            block12: {
                int n3 = xm2.a();
                if (n3 <= 0) {
                    return false;
                }
                byte[] byArray = xm22.a;
                n3 = byArray.length;
                int n4 = xm2.a();
                if (n3 < n4) {
                    n3 = xm2.a() * 2;
                    xm22.b(n3);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                byArray = xm2.a;
                n4 = xm2.b;
                int n7 = xm2.a();
                inflater.setInput(byArray, n4, n7);
                n7 = 0;
                xm2 = null;
                while (true) {
                    do {
                        byArray = xm22.a;
                        n4 = byArray.length - n7;
                        n3 = inflater.inflate(byArray, n7, n4);
                        n7 += n3;
                        n3 = (int)(inflater.finished() ? 1 : 0);
                        if (n3 != 0) {
                            xm22.H(n7);
                            inflater.reset();
                            return true;
                        }
                        n3 = (int)(inflater.needsDictionary() ? 1 : 0);
                        if (n3 != 0 || (n3 = (int)(inflater.needsInput() ? 1 : 0)) != 0) break block12;
                    } while (n7 != (n4 = (byArray = xm22.a).length));
                    n3 = byArray.length * 2;
                    xm22.b(n3);
                    continue;
                    break;
                }
                catch (Throwable throwable222222) {
                    break block13;
                }
            }
            inflater.reset();
            return false;
        }
        inflater.reset();
        throw throwable222222;
        catch (DataFormatException dataFormatException) {
            inflater.reset();
            return false;
        }
    }

    public static void D(int n3) {
        Integer.toString(n3, 36);
    }

    public static boolean E(int n3) {
        int n4 = 3;
        n3 = n3 != n4 && n3 != (n4 = 2) && n3 != (n4 = 0x10000000) && n3 != (n4 = 21) && n3 != (n4 = 0x50000000) && n3 != (n4 = 22) && n3 != (n4 = 0x60000000) && n3 != (n4 = 4) ? 0 : 1;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean F(Context object) {
        int n3 = a;
        int n4 = 29;
        if (n3 < n4) return 1 != 0;
        ApplicationInfo applicationInfo = object.getApplicationInfo();
        int n7 = applicationInfo.targetSdkVersion;
        if (n7 < n4) return 1 != 0;
        n7 = 30;
        String string2 = d;
        if (n3 == n7) {
            String string3 = "moto g(20)";
            n7 = (int)(Ascii.equalsIgnoreCase(string2, string3) ? 1 : 0);
            if (n7 != 0) return 1 != 0;
            String string4 = "rmx3231";
            n7 = (int)(Ascii.equalsIgnoreCase(string2, string4) ? 1 : 0);
            if (n7 != 0) return 1 != 0;
        }
        if (n3 != (n7 = 34)) return 0 != 0;
        String string5 = "sm-x200";
        n7 = (int)(Ascii.equalsIgnoreCase(string2, string5) ? 1 : 0);
        if (n7 == 0) return 0 != 0;
        return 1 != 0;
    }

    public static boolean G(Context context) {
        int n3;
        int n4;
        context = context.getApplicationContext();
        String string2 = "uimode";
        if ((context = (UiModeManager)context.getSystemService(string2)) != null && (n4 = context.getCurrentModeType()) == (n3 = 4)) {
            n4 = 1;
        } else {
            n4 = 0;
            context = null;
        }
        return n4 != 0;
    }

    public static void H(List list, int n3, int n4, int n7) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (n4 = n4 - n3 + -1; n4 >= 0; n4 += -1) {
            int n8 = n3 + n4;
            Object e2 = list.remove(n8);
            arrayDeque.addFirst(e2);
        }
        n3 = list.size();
        n3 = Math.min(n7, n3);
        list.addAll(n3, arrayDeque);
    }

    public static long I(long l2) {
        long l3;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = (l3 = l2 - (l4 = Long.MIN_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            l4 = 1000L;
            l2 *= l4;
        }
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    public static String J(String var0) {
        if (var0 == null) {
            return null;
        }
        var1_1 = 95;
        var2_2 = var0.replace((char)var1_1, '-');
        var3_3 = var2_2.isEmpty();
        if (var3_3 == 0 && (var3_3 = var2_2.equals(var4_4 = "und")) == 0) {
            var0 = var2_2;
        }
        var0 = Ascii.toLowerCase((String)var0);
        var2_2 = var0.split("-", 2);
        var3_3 = 0;
        var4_4 = null;
        var2_2 = var2_2[0];
        var5_5 = gz3.j;
        if (var5_5 == null) {
            var5_5 = Locale.getISOLanguages();
            var7_7 = ((String[])var5_5).length;
            var8_8 = gz3.k;
            var9_9 = var8_8.length;
            var6_6 = new HashMap(var7_7 += var9_9);
            var7_7 = ((Object)var5_5).length;
            var10_10 = null;
            block5: for (var9_9 = 0; var9_9 < var7_7; ++var9_9) {
                block15: {
                    var11_11 = var5_5[var9_9];
                    var12_12 = new Locale((String)var11_11);
                    var12_12 = var12_12.getISO3Language();
                    var13_13 = TextUtils.isEmpty((CharSequence)var12_12);
                    if (var13_13) break block15;
                    var6_6.put(var12_12, var11_11);
                }
lbl34:
                // 2 sources

            }
            var5_5 = null;
            for (var14_14 = 0; var14_14 < (var7_7 = var8_8.length); var14_14 += 2) {
                var15_15 = var8_8[var14_14];
                var9_9 = var14_14 + 1;
                var10_10 = var8_8[var9_9];
                var6_6.put(var15_15, var10_10);
            }
            gz3.j = var6_6;
        }
        if ((var5_5 = (String)gz3.j.get(var2_2)) != null) {
            var6_6 = Ex0.a((String)var5_5);
            var1_1 = var2_2.length();
            var0 = var0.substring(var1_1);
            var6_6.append((String)var0);
            var0 = var6_6.toString();
            var2_2 = var5_5;
        }
        if ((var14_14 = (var5_5 = "no").equals(var2_2)) != 0 || (var14_14 = (int)(var5_5 = "i").equals(var2_2)) != 0 || (var1_1 = (int)(var5_5 = "zh").equals(var2_2)) != 0) {
            while (var3_3 < (var14_14 = ((Object)(var2_2 = gz3.l)).length)) {
                var5_5 = var2_2[var3_3];
                var14_14 = (int)var0.startsWith((String)var5_5);
                if (var14_14 != 0) {
                    var5_5 = new StringBuilder();
                    var16_16 = var3_3 + 1;
                    var6_6 = var2_2[var16_16];
                    var5_5.append((String)var6_6);
                    var2_2 = var2_2[var3_3];
                    var1_1 = var2_2.length();
                    var0 = var0.substring(var1_1);
                    var5_5.append((String)var0);
                    var0 = var5_5.toString();
                    break;
                }
                var3_3 += 2;
            }
        }
        return var0;
        catch (MissingResourceException v0) {
            ** continue;
        }
    }

    public static Object[] K(int n3, Object[] objectArray) {
        int n4 = objectArray.length;
        n4 = n3 <= n4 ? 1 : 0;
        ct3.a(n4 != 0);
        return Arrays.copyOf(objectArray, n3);
    }

    public static void L(Handler handler, Runnable runnable2) {
        Looper looper;
        Thread thread2 = handler.getLooper().getThread();
        boolean bl2 = thread2.isAlive();
        if (!bl2) {
            return;
        }
        thread2 = handler.getLooper();
        if (thread2 == (looper = Looper.myLooper())) {
            runnable2.run();
            return;
        }
        handler.post(runnable2);
    }

    public static long M(int n3, long l2) {
        long l3 = n3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        return gz3.O(l2, 1000000L, l3, roundingMode);
    }

    public static void N(long[] lArray, long l2) {
        long l3;
        long l4;
        long l7;
        int n3;
        long l8;
        long l12;
        long l14;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long l15 = 1000000L;
        long l16 = 0L;
        Object object = l2 == l15 ? 0 : (l2 < l15 ? -1 : 1);
        if (object >= 0 && (l14 = (l12 = (l8 = l2 % l15) - l16) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false) {
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            l2 = LongMath.divide(l2, l15, roundingMode2);
            for (n3 = 0; n3 < (object = (Object)lArray.length); ++n3) {
                long l17;
                lArray[n3] = l17 = LongMath.divide(lArray[n3], l2, roundingMode);
            }
        } else if (object < 0 && (l7 = (l4 = (l3 = l15 % l2) - l16) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            RoundingMode roundingMode3 = RoundingMode.UNNECESSARY;
            l2 = LongMath.divide(l15, l2, roundingMode3);
            while (n3 < (object = (Object)lArray.length)) {
                lArray[n3] = l3 = LongMath.saturatedMultiply(lArray[n3], l2);
                ++n3;
            }
        } else {
            for (int i3 = 0; i3 < (n3 = lArray.length); ++i3) {
                long l18;
                RoundingMode roundingMode4;
                long l19;
                long l20;
                long l21;
                long l22 = lArray[i3];
                long l23 = l22 - l16;
                Object object2 = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
                if (object2 == false) continue;
                object2 = l2 == l22 ? 0 : (l2 < l22 ? -1 : 1);
                if (object2 >= 0 && (l21 = (l20 = (l19 = l2 % l22) - l16) == 0L ? 0 : (l20 < 0L ? -1 : 1)) == false) {
                    roundingMode4 = RoundingMode.UNNECESSARY;
                    l22 = LongMath.divide(l2, l22, roundingMode4);
                    lArray[i3] = l22 = LongMath.divide(l15, l22, roundingMode);
                    continue;
                }
                if (object2 < 0 && (l14 = (l18 = (l8 = l22 % l2) - l16) == 0L ? 0 : (l18 < 0L ? -1 : 1)) == false) {
                    roundingMode4 = RoundingMode.UNNECESSARY;
                    l22 = LongMath.divide(l22, l2, roundingMode4);
                    lArray[i3] = l22 = LongMath.saturatedMultiply(l15, l22);
                    continue;
                }
                l8 = l15;
                lArray[i3] = l22 = gz3.P(l22, l15, l2, roundingMode);
            }
        }
    }

    public static long O(long l2, long l3, long l4, RoundingMode roundingMode) {
        long l7 = 0L;
        long l8 = l2 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object != false && (object = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1)) != false) {
            long l12;
            long l14;
            long l15;
            long l16;
            long l17;
            long l18;
            long l19;
            long l20;
            object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
            if (object >= 0 && (l20 = (l19 = (l18 = l4 % l3) - l7) == 0L ? 0 : (l19 < 0L ? -1 : 1)) == false) {
                RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                l3 = LongMath.divide(l4, l3, roundingMode2);
                return LongMath.divide(l2, l3, roundingMode);
            }
            if (object < 0 && (l17 = (l16 = (l15 = l3 % l4) - l7) == 0L ? 0 : (l16 < 0L ? -1 : 1)) == false) {
                roundingMode = RoundingMode.UNNECESSARY;
                l3 = LongMath.divide(l3, l4, roundingMode);
                return LongMath.saturatedMultiply(l2, l3);
            }
            object = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
            if (object >= 0 && (l20 = (l14 = (l18 = l4 % l2) - l7) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false) {
                RoundingMode roundingMode3 = RoundingMode.UNNECESSARY;
                l2 = LongMath.divide(l4, l2, roundingMode3);
                return LongMath.divide(l3, l2, roundingMode);
            }
            if (object < 0 && (l17 = (l12 = (l15 = l2 % l4) - l7) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false) {
                roundingMode = RoundingMode.UNNECESSARY;
                l2 = LongMath.divide(l2, l4, roundingMode);
                return LongMath.saturatedMultiply(l3, l2);
            }
            return gz3.P(l2, l3, l4, roundingMode);
        }
        return l7;
    }

    public static long P(long l2, long l3, long l4, RoundingMode roundingMode) {
        long l7 = LongMath.saturatedMultiply(l2, l3);
        long l8 = Long.MIN_VALUE;
        long l12 = Long.MAX_VALUE;
        long l14 = l7 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object != false && (object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1)) != false) {
            return LongMath.divide(l7, l4, roundingMode);
        }
        l7 = Math.abs(l3);
        long l15 = Math.abs(l4);
        l7 = LongMath.gcd(l7, l15);
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        l3 = LongMath.divide(l3, l7, roundingMode2);
        l4 = LongMath.divide(l4, l7, roundingMode2);
        l7 = Math.abs(l2);
        long l16 = Math.abs(l4);
        l7 = LongMath.gcd(l7, l16);
        l2 = LongMath.divide(l2, l7, roundingMode2);
        l4 = LongMath.divide(l4, l7, roundingMode2);
        l7 = LongMath.saturatedMultiply(l2, l3);
        long l17 = l7 - l12;
        object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object != false && (object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1)) != false) {
            return LongMath.divide(l7, l4, roundingMode);
        }
        double d2 = l3;
        double d5 = l4;
        double d7 = (double)l2 * (d2 /= d5);
        l3 = 4890909195324358656L;
        d2 = 9.223372036854776E18;
        double d9 = d7 - d2;
        Object object2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object2 > 0) {
            return l12;
        }
        l3 = -4332462841530417152L;
        d2 = -9.223372036854776E18;
        double d12 = d7 - d2;
        object2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            return l8;
        }
        return DoubleMath.roundToLong(d7, roundingMode);
    }

    public static boolean Q(f f5, boolean bl2) {
        int n3;
        int n4;
        int n7;
        int n8 = 1;
        if (!(f5 == null || (n7 = f5.getPlayWhenReady()) == 0 || (n7 = f5.getPlaybackState()) == n8 || (n7 = f5.getPlaybackState()) == (n4 = 4) || bl2 && (n3 = f5.getPlaybackSuppressionReason()) != 0)) {
            n8 = 0;
        }
        return n8 != 0;
    }

    public static String[] R(String string2) {
        return string2.split("/", -1);
    }

    public static String[] S(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return new String[0];
        }
        return string2.trim().split("(\\s*,\\s*)", -1);
    }

    public static long T(long l2) {
        long l3;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = (l3 = l2 - (l4 = Long.MIN_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            l4 = 1000L;
            l2 /= l4;
        }
        return l2;
    }

    public static int a(long[] lArray, long l2, boolean bl2) {
        int n3;
        int n4 = Arrays.binarySearch(lArray, l2);
        if (n4 < 0) {
            n3 = ~n4;
        } else {
            long l3;
            long l4;
            long l7;
            int n7;
            int n8;
            while ((n8 = n4 + 1) < (n7 = lArray.length) && (l7 = (l4 = (l3 = lArray[n8]) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                n4 = n8;
            }
            n3 = bl2 ? n4 : n8;
        }
        return n3;
    }

    public static int b(ZA1 zA1, long l2) {
        long l3;
        long l4;
        int n3;
        int n4;
        int n7 = zA1.a + -1;
        int n8 = 0;
        int n10 = 0;
        while (n10 <= n7) {
            n4 = n10 + n7 >>> 1;
            long l7 = zA1.c(n4);
            long l8 = l7 - l2;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object < 0) {
                n10 = n4 + 1;
                continue;
            }
            n7 = n4 += -1;
        }
        n10 = n7 + 1;
        n4 = zA1.a;
        if (n10 < n4 && (n3 = (int)((l4 = (l3 = zA1.c(n10)) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
            n8 = n10;
        } else {
            n3 = -1;
            if (n7 != n3) {
                n8 = n7;
            }
        }
        return n8;
    }

    public static int c(int[] nArray, int n3, boolean bl2, boolean bl3) {
        int n4;
        int n7 = Arrays.binarySearch(nArray, n3);
        if (n7 < 0) {
            n4 = -(n7 += 2);
        } else {
            int n8;
            int n10;
            while ((n10 = n7 + -1) >= 0 && (n8 = nArray[n10]) == n3) {
                n7 = n10;
            }
            n4 = bl2 ? n7 : n10;
        }
        if (bl3) {
            n3 = 0;
            n4 = Math.max(0, n4);
        }
        return n4;
    }

    public static int d(long[] lArray, long l2, boolean bl2) {
        int n3;
        int n4 = Arrays.binarySearch(lArray, l2);
        if (n4 < 0) {
            n3 = -(n4 += 2);
        } else {
            long l3;
            long l4;
            long l7;
            int n7;
            while ((n7 = n4 + -1) >= 0 && (l7 = (l4 = (l3 = lArray[n7]) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                n4 = n7;
            }
            n3 = n4;
        }
        if (bl2) {
            n3 = Math.max(0, n3);
        }
        return n3;
    }

    public static int e(int n3, int n4) {
        return (n3 + n4 + -1) / n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static float g(float f5, float f6, float f7) {
        f5 = Math.min(f5, f7);
        return Math.max(f6, f5);
    }

    public static int h(int n3, int n4, int n7) {
        n3 = Math.min(n3, n7);
        return Math.max(n4, n3);
    }

    public static long i(long l2, long l3, long l4) {
        l2 = Math.min(l2, l4);
        return Math.max(l3, l2);
    }

    public static int j(int n3, byte[] byArray, int n4, int n7) {
        while (n3 < n4) {
            int n8 = n7 << 8;
            n7 >>>= 24;
            int n10 = byArray[n3] & 0xFF;
            n7 = (n7 ^ n10) & 0xFF;
            int[] nArray = m;
            n7 = nArray[n7] ^ n8;
            ++n3;
        }
        return n7;
    }

    public static Handler k(Handler.Callback callback2) {
        Looper looper = Looper.myLooper();
        ct3.h(looper);
        Handler handler = new Handler(looper, callback2);
        return handler;
    }

    public static String l(byte[] byArray) {
        Charset charset = StandardCharsets.UTF_8;
        String string2 = new String(byArray, charset);
        return string2;
    }

    public static int m(int n3) {
        int n4 = 20;
        int n7 = 30;
        if (n3 != n4) {
            n4 = 22;
            if (n3 != n4) {
                if (n3 != n7) {
                    switch (n3) {
                        default: {
                            switch (n3) {
                                default: {
                                    return -1 >>> 1;
                                }
                                case 14: {
                                    return 25;
                                }
                                case 15: 
                                case 16: 
                                case 17: 
                                case 18: 
                            }
                        }
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: {
                            return 28;
                        }
                        case 7: 
                        case 8: {
                            return 23;
                        }
                        case 4: 
                        case 5: 
                        case 6: {
                            return 21;
                        }
                        case 2: 
                        case 3: 
                    }
                    return 3;
                }
                return 34;
            }
            return 31;
        }
        return n7;
    }

    public static AudioFormat n(int n3, int n4, int n7) {
        AudioFormat.Builder builder = new AudioFormat.Builder();
        return builder.setSampleRate(n3).setChannelMask(n4).setEncoding(n7).build();
    }

    public static int o(int n3) {
        int n4 = 10;
        int n7 = 6396;
        int n8 = 32;
        int n10 = a;
        if (n3 != n4) {
            n4 = 12;
            if (n3 != n4) {
                int n14 = 24;
                if (n3 != n14) {
                    switch (n3) {
                        default: {
                            return 0;
                        }
                        case 8: {
                            return n7;
                        }
                        case 7: {
                            return 1276;
                        }
                        case 6: {
                            return 252;
                        }
                        case 5: {
                            return 220;
                        }
                        case 4: {
                            return 204;
                        }
                        case 3: {
                            return 28;
                        }
                        case 2: {
                            return n4;
                        }
                        case 1: 
                    }
                    return 4;
                }
                if (n10 >= n8) {
                    return 0x3FFFFFC;
                }
                return 0;
            }
            return 743676;
        }
        if (n10 >= n8) {
            return 737532;
        }
        return n7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int p(int n3) {
        int n4 = 2;
        if (n3 == n4 || n3 == (n4 = 4)) return 6005;
        n4 = 10;
        if (n3 == n4) return 6004;
        n4 = 7;
        if (n3 == n4) return 6005;
        n4 = 8;
        if (n3 == n4) return 6003;
        switch (n3) {
            default: {
                switch (n3) {
                    default: {
                        return 6006;
                    }
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                }
                return 6002;
            }
            case 15: {
                return 6003;
            }
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return 6004;
            }
            case 16: 
            case 18: 
        }
        return 6005;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int q(String object) {
        String string2;
        String string3;
        boolean bl2;
        int n3;
        int n4 = 0;
        if (object == null) {
            return 0;
        }
        String string4 = "_";
        String[] stringArray = ((String)object).split(string4, -1);
        int n7 = stringArray.length;
        if (n7 < (n3 = 2)) {
            return 0;
        }
        int n8 = n7 + -1;
        String string5 = stringArray[n8];
        int n10 = 3;
        if (n7 >= n10 && (bl2 = (string3 = "neg").equals(string2 = stringArray[n7 -= n3]))) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var0_3 = null;
        }
        try {
            string5.getClass();
            n4 = Integer.parseInt(string5);
            if (!bl2) return n4;
        }
        catch (NumberFormatException numberFormatException) {
            return n4;
        }
        return -n4;
    }

    public static long r(long l2, float f5) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return l2;
        }
        double d2 = l2;
        double d5 = f5;
        return Math.round(d2 * d5);
    }

    public static int s(int n3) {
        int n4 = 8;
        if (n3 != n4) {
            n4 = 16;
            if (n3 != n4) {
                n4 = 24;
                if (n3 != n4) {
                    n4 = 32;
                    if (n3 != n4) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    /*
     * Unable to fully structure code
     */
    public static int t(int var0, int var1_1) {
        block2: {
            block3: {
                block4: {
                    block5: {
                        var2_2 = 2;
                        if (var0 == var2_2) break block2;
                        var3_3 = 3;
                        if (var0 == var3_3) break block3;
                        var4_4 = 4;
                        if (var0 == var4_4) break block4;
                        var5_5 = 21;
                        if (var0 == var5_5) break block5;
                        var5_5 = 22;
                        if (var0 == var5_5) break block4;
                        var5_5 = 0x10000000;
                        if (var0 == var5_5) break block2;
                        var2_2 = 0x50000000;
                        if (var0 != var2_2) {
                            var2_2 = 0x60000000;
                            if (var0 != var2_2) {
                                var6_6 = new IllegalArgumentException();
                                throw var6_6;
                            } else {
                                ** GOTO lbl20
                            }
                        }
                        break block5;
lbl20:
                        // 2 sources

                        break block4;
                    }
                    var2_2 = 3;
                    break block2;
                }
                var2_2 = 4;
                break block2;
            }
            var2_2 = 1;
        }
        return var2_2 * var1_1;
    }

    public static String u(StringBuilder stringBuilder, Formatter formatter, long l2) {
        Object object = formatter;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        long l3 = -9223372036854775807L;
        long l4 = 0L;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l3 = object2 == false ? l4 : l2;
        object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        String string2 = object2 < 0 ? "-" : "";
        l3 = (Math.abs(l3) + 500L) / 1000L;
        long l7 = 60;
        long l8 = l3 % l7;
        long l12 = l3 / l7 % l7;
        l7 = 3600L;
        stringBuilder.setLength(0);
        long l14 = (l3 /= l7) - l4;
        long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (l15 > 0) {
            Long l16 = l3;
            Long l17 = l12;
            Long l18 = l8;
            int n8 = 4;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string2;
            objectArray[n7] = l16;
            objectArray[n4] = l17;
            objectArray[n3] = l18;
            String string3 = "%s%d:%02d:%02d";
            object = ((Formatter)object).format(string3, objectArray).toString();
        } else {
            Long l19 = l12;
            Long l20 = l8;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            objectArray[n7] = l19;
            objectArray[n4] = l20;
            String string4 = "%s%02d:%02d";
            object = ((Formatter)object).format(string4, objectArray).toString();
        }
        return object;
    }

    public static String[] v() {
        String string2;
        String[] stringArray = Resources.getSystem().getConfiguration();
        int n3 = a;
        int n4 = 24;
        if (n3 >= n4) {
            stringArray = en_0.a(Zm.b((Configuration)stringArray));
            n3 = -1;
            string2 = ",";
            stringArray = stringArray.split(string2, n3);
        } else {
            stringArray = stringArray.locale.toLanguageTag();
            stringArray = new String[]{stringArray};
        }
        for (n3 = 0; n3 < (n4 = stringArray.length); ++n3) {
            stringArray[n3] = string2 = gz3.J(stringArray[n3]);
        }
        return stringArray;
    }

    public static String w(String string2) {
        Object object;
        Object object2 = null;
        int n3 = 1;
        Object object3 = "android.os.SystemProperties";
        try {
            object3 = Class.forName((String)object3);
            object = "get";
        }
        catch (Exception exception) {
            Cx.d("Failed to read system property ".concat(string2), exception);
            return null;
        }
        Class[] classArray = new Class[n3];
        Class<String> clazz = String.class;
        classArray[0] = clazz;
        object = ((Class)object3).getMethod((String)object, classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        object2 = ((Method)object).invoke(object3, objectArray);
        return (String)object2;
    }

    public static String x(int n3) {
        switch (n3) {
            default: {
                String string2;
                int n4 = 10000;
                if (n3 >= n4) {
                    String string3 = "custom (";
                    String string4 = ")";
                    string2 = Gj0.b(n3, string3, string4);
                } else {
                    string2 = "?";
                }
                return string2;
            }
            case 6: {
                return "camera motion";
            }
            case 5: {
                return "metadata";
            }
            case 4: {
                return "image";
            }
            case 3: {
                return "text";
            }
            case 2: {
                return "video";
            }
            case 1: {
                return "audio";
            }
            case 0: {
                return "default";
            }
            case -1: {
                return "unknown";
            }
            case -2: 
        }
        return "none";
    }

    public static String y(Context object, String string2) {
        CharSequence charSequence = object.getPackageName();
        object = object.getPackageManager();
        object = object.getPackageInfo((String)charSequence, 0);
        try {
            object = object.versionName;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = "?";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("/");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" (Linux;Android ");
        object = Build.VERSION.RELEASE;
        return h30_0.a((StringBuilder)charSequence, (String)object, ") AndroidXMedia3/1.5.1");
    }

    public static boolean z(f f5) {
        boolean bl2;
        boolean bl3;
        if (f5 != null && (bl3 = f5.isCommandAvailable((int)((bl2 = true) ? 1 : 0)))) {
            f5.pause();
            return bl2;
        }
        return false;
    }
}

