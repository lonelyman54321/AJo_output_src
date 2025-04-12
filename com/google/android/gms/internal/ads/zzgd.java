/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.graphics.Point
 *  android.hardware.display.DisplayManager
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  android.view.Display
 *  android.view.Display$Mode
 *  android.view.WindowManager
 */
package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgdu;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class zzgd {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;
    private static final int[] zzp;

    static {
        int[] nArray;
        String string2;
        String string3;
        int n3;
        zza = n3 = Build.VERSION.SDK_INT;
        Object object = Build.DEVICE;
        zzb = object;
        zzc = string3 = Build.MANUFACTURER;
        zzd = string2 = Build.MODEL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        object = ", ";
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        stringBuilder.append((String)object);
        stringBuilder.append(string3);
        stringBuilder.append((String)object);
        stringBuilder.append(n3);
        zze = stringBuilder.toString();
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
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
        zzn = (int[])object;
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
        zzo = (int[])object;
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
        zzp = nArray;
    }

    public static String zzA(byte[] byArray) {
        Charset charset = zzfxs.zzc;
        String string2 = new String(byArray, charset);
        return string2;
    }

    public static String zzB(byte[] byArray, int n3, int n4) {
        Charset charset = zzfxs.zzc;
        String string2 = new String(byArray, n3, n4, charset);
        return string2;
    }

    public static String zzC(int n3) {
        switch (n3) {
            default: {
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

    /*
     * WARNING - void declaration
     */
    public static String zzD(String object) {
        int n3;
        String string2;
        boolean bl2;
        if (object == null) {
            return null;
        }
        int n4 = 95;
        Object object2 = ((String)object).replace((char)n4, '-');
        boolean n7 = ((String)object2).isEmpty();
        if (!n7 && !(bl2 = ((String)object2).equals(string2 = "und"))) {
            object = object2;
        }
        object = zzfxm.zza((String)object);
        object2 = ((String)object).split("-", 2);
        boolean bl3 = false;
        string2 = null;
        object2 = object2[0];
        Object object3 = zzk;
        if (object3 == null) {
            object3 = zzgd.zzT();
            zzk = object3;
        }
        if ((object3 = (String)zzk.get(object2)) != null) {
            n4 = ((String)object2).length();
            object = String.valueOf(((String)object).substring(n4));
            object = ((String)object3).concat((String)object);
            object2 = object3;
        }
        if ((n3 = ((String)(object3 = "no")).equals(object2)) == 0 && (n3 = (int)(((String)(object3 = "i")).equals(object2) ? 1 : 0)) == 0 && (n4 = (int)(((String)(object3 = "zh")).equals(object2) ? 1 : 0)) == 0) {
            return object;
        }
        while (true) {
            void var3_6;
            object2 = zzm;
            n3 = ((Object)object2).length;
            n3 = 18;
            if (var3_6 >= n3) break;
            object3 = object2[var3_6];
            n3 = (int)(((String)object).startsWith((String)object3) ? 1 : 0);
            if (n3 != 0) {
                n3 = var3_6 + true;
                object3 = object2[n3];
                n4 = ((String)object2[var3_6]).length();
                object = ((String)object).substring(n4);
                object2 = String.valueOf(object3);
                object = String.valueOf(object);
                object = ((String)object2).concat((String)object);
                break;
            }
            var3_6 += 2;
        }
        return object;
    }

    public static ExecutorService zzE(String string2) {
        zzgc zzgc2 = new zzgc(string2);
        return Executors.newSingleThreadExecutor(zzgc2);
    }

    public static void zzF(long[] lArray, long l2, long l3) {
        long l4;
        long l7;
        long l8;
        int n3;
        long l12;
        long l14;
        long l15;
        long[] lArray2 = lArray;
        long l16 = l3;
        long l17 = 0L;
        long l18 = 1000000L;
        long l19 = l3 == l18 ? 0 : (l3 < l18 ? -1 : 1);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        if (l19 >= 0 && (l15 = (l14 = (l12 = l3 % l18) - l17) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false) {
            int n4;
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            long l20 = zzgdu.zza(l3, l18, roundingMode2);
            for (n3 = 0; n3 < (n4 = lArray2.length); ++n3) {
                long l21;
                lArray2[n3] = l21 = zzgdu.zza(lArray2[n3], l20, roundingMode);
            }
        } else if (l19 < 0 && (l8 = (l7 = (l4 = l18 % l16) - l17) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
            RoundingMode roundingMode3 = RoundingMode.UNNECESSARY;
            l4 = zzgdu.zza(l18, l16, roundingMode3);
            while (n3 < (l8 = (long)lArray2.length)) {
                long l22;
                lArray2[n3] = l22 = zzgdu.zzc(lArray2[n3], l4);
                ++n3;
            }
        } else {
            for (int i3 = 0; i3 < (n3 = lArray2.length); ++i3) {
                long l23;
                RoundingMode roundingMode4;
                long l24;
                long l25;
                long l26;
                long l27 = lArray2[i3];
                long l28 = l27 - l17;
                Object object = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                if (object == false) continue;
                object = l16 == l27 ? 0 : (l16 < l27 ? -1 : 1);
                if (object >= 0 && (l26 = (l25 = (l24 = l16 % l27) - l17) == 0L ? 0 : (l25 < 0L ? -1 : 1)) == false) {
                    roundingMode4 = RoundingMode.UNNECESSARY;
                    l27 = zzgdu.zza(l16, l27, roundingMode4);
                    lArray2[i3] = l27 = zzgdu.zza(l18, l27, roundingMode);
                    continue;
                }
                if (object < 0 && (l15 = (l23 = (l12 = l27 % l16) - l17) == 0L ? 0 : (l23 < 0L ? -1 : 1)) == false) {
                    roundingMode4 = RoundingMode.UNNECESSARY;
                    l27 = zzgdu.zza(l27, l16, roundingMode4);
                    lArray2[i3] = l27 = zzgdu.zzc(l18, l27);
                    continue;
                }
                l12 = 1000000L;
                lArray2[i3] = l27 = zzgd.zzR(l27, l12, l3, roundingMode);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean zzG(Object object, Object object2) {
        if (object != null) return object.equals(object2);
        if (object2 == null) return true;
        return false;
    }

    public static boolean zzH(SparseArray sparseArray, int n3) {
        int n4 = sparseArray.indexOfKey(n3);
        return n4 >= 0;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zzI(zzfu zzfu2, zzfu zzfu3, Inflater inflater) {
        boolean bl2;
        block10: {
            Throwable throwable2222;
            int n3;
            int n4 = zzfu2.zzb();
            bl2 = false;
            if (n4 <= 0) {
                return false;
            }
            n4 = zzfu3.zzc();
            if (n4 < (n3 = zzfu2.zzb())) {
                n4 = zzfu2.zzb();
                n4 += n4;
                zzfu3.zzE(n4);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            byte[] byArray = zzfu2.zzM();
            n3 = zzfu2.zzd();
            int n7 = zzfu2.zzb();
            inflater.setInput(byArray, n3, n7);
            n7 = 0;
            zzfu2 = null;
            while (true) {
                block9: {
                    try {
                        byArray = zzfu3.zzM();
                        n3 = zzfu3.zzc() - n7;
                        n4 = inflater.inflate(byArray, n7, n3);
                        n7 += n4;
                        n4 = (int)(inflater.finished() ? 1 : 0);
                        if (n4 == 0) break block9;
                        zzfu3.zzJ(n7);
                        bl2 = true;
                        break block10;
                    }
                    catch (Throwable throwable2222) {
                        break;
                    }
                }
                n4 = (int)(inflater.needsDictionary() ? 1 : 0);
                if (n4 == 0 && (n4 = (int)(inflater.needsInput() ? 1 : 0)) == 0) {
                    n4 = zzfu3.zzc();
                    if (n7 != n4) continue;
                    n4 = zzfu3.zzc();
                    n4 += n4;
                    zzfu3.zzE(n4);
                    continue;
                }
                break block10;
                break;
            }
            inflater.reset();
            throw throwable2222;
            catch (DataFormatException dataFormatException) {}
        }
        inflater.reset();
        return bl2;
    }

    public static boolean zzJ(Context context) {
        String string2;
        boolean bl2;
        int n3 = zza;
        int n4 = 23;
        return n3 >= n4 && (bl2 = (context = context.getPackageManager()).hasSystemFeature(string2 = "android.hardware.type.automotive"));
    }

    public static boolean zzK(int n3) {
        int n4 = 3;
        return n3 == n4 || n3 == (n4 = 2) || n3 == (n4 = 0x10000000) || n3 == (n4 = 21) || n3 == (n4 = 0x50000000) || n3 == (n4 = 22) || n3 == (n4 = 0x60000000) || n3 == (n4 = 4);
        {
        }
    }

    public static boolean zzL(Context object) {
        int n3 = zza;
        boolean bl2 = true;
        int n4 = 29;
        if (n3 >= n4) {
            object = object.getApplicationInfo();
            int n7 = object.targetSdkVersion;
            if (n7 >= n4) {
                n7 = 30;
                n4 = 0;
                if (n3 == n7) {
                    object = zzd;
                    String string2 = "moto g(20)";
                    n3 = (int)(zzfxm.zzc((CharSequence)object, string2) ? 1 : 0);
                    if (n3 == 0 && (n7 = (int)(zzfxm.zzc((CharSequence)object, string2 = "rmx3231") ? 1 : 0)) == 0) {
                        return false;
                    }
                } else {
                    bl2 = false;
                }
            }
        }
        return bl2;
    }

    public static boolean zzM(int n3) {
        int n4 = 10;
        return n3 == n4 || n3 == (n4 = 13);
        {
        }
    }

    public static boolean zzN(Context context) {
        int n3;
        int n4;
        context = context.getApplicationContext();
        String string2 = "uimode";
        return (context = (UiModeManager)context.getSystemService(string2)) != null && (n4 = context.getCurrentModeType()) == (n3 = 4);
    }

    public static boolean zzO(Handler handler, Runnable runnable2) {
        Looper looper;
        Thread thread2 = handler.getLooper().getThread();
        boolean bl2 = thread2.isAlive();
        if (!bl2) {
            return false;
        }
        thread2 = handler.getLooper();
        if (thread2 == (looper = Looper.myLooper())) {
            runnable2.run();
            return true;
        }
        return handler.post(runnable2);
    }

    public static Object[] zzP(Object[] objectArray, int n3) {
        int n4 = objectArray.length;
        n4 = n3 <= n4 ? 1 : 0;
        zzeq.zzd(n4 != 0);
        return Arrays.copyOf(objectArray, n3);
    }

    private static int zzQ(int n3, int n4) {
        int[] nArray = zzo;
        int n7 = n4 >> 12;
        n3 ^= n7;
        n3 = nArray[n3];
        n4 = (char)(n4 << 4);
        return (char)(n3 ^ n4);
    }

    private static long zzR(long l2, long l3, long l4, RoundingMode roundingMode) {
        long l7 = zzgdu.zzc(l2, l3);
        long l8 = Long.MIN_VALUE;
        long l12 = Long.MAX_VALUE;
        long l14 = l7 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object != false && (object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1)) != false) {
            return zzgdu.zza(l7, l4, roundingMode);
        }
        l7 = Math.abs(l3);
        long l15 = Math.abs(l4);
        l7 = zzgdu.zzb(l7, l15);
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        l3 = zzgdu.zza(l3, l7, roundingMode2);
        l4 = zzgdu.zza(l4, l7, roundingMode2);
        l7 = Math.abs(l2);
        long l16 = Math.abs(l4);
        l7 = zzgdu.zzb(l7, l16);
        l2 = zzgdu.zza(l2, l7, roundingMode2);
        l4 = zzgdu.zza(l4, l7, roundingMode2);
        l7 = zzgdu.zzc(l2, l3);
        long l17 = l7 - l12;
        object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object != false && (object = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1)) != false) {
            return zzgdu.zza(l7, l4, roundingMode);
        }
        double d2 = l3;
        double d5 = l4;
        double d7 = l2;
        d2 = d2 / d5 * d7;
        l2 = 4890909195324358656L;
        d7 = 9.223372036854776E18;
        double d9 = d2 - d7;
        Object object2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object2 > 0) {
            return l12;
        }
        l2 = -4332462841530417152L;
        d7 = -9.223372036854776E18;
        double d12 = d2 - d7;
        object2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            return l8;
        }
        return zzgdp.zza(d2, roundingMode);
    }

    private static String zzS(String string2) {
        Object object;
        Object object2 = null;
        int n3 = 1;
        Object object3 = "android.os.SystemProperties";
        try {
            object3 = Class.forName((String)object3);
            object = "get";
        }
        catch (Exception exception) {
            string2 = "Failed to read system property ".concat(string2);
            zzfk.zzd("Util", string2, exception);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static HashMap zzT() {
        String[] stringArray = Locale.getISOLanguages();
        int n3 = stringArray.length;
        int n4 = zzl.length;
        n4 = n3 + 88;
        HashMap<Object, String> hashMap = new HashMap<Object, String>(n4);
        n4 = 0;
        int n7 = 0;
        while (true) {
            if (n7 >= n3) {
                while (true) {
                    String[] stringArray2 = zzl;
                    n3 = stringArray2.length;
                    n3 = 88;
                    if (n4 >= n3) return hashMap;
                    String string3 = stringArray2[n4];
                    n7 = n4 + 1;
                    String string4 = stringArray2[n7];
                    hashMap.put(string3, string4);
                    n4 += 2;
                }
            }
            String string2 = stringArray[n7];
            try {
                Object object = new Locale(string2);
                object = ((Locale)object).getISO3Language();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2) {
                    hashMap.put(object, string2);
                }
            }
            catch (MissingResourceException missingResourceException) {}
            ++n7;
        }
    }

    public static int zza(long[] lArray, long l2, boolean bl2, boolean n3) {
        block5: {
            int n4;
            block4: {
                long l3;
                long l4;
                long l7;
                int n7;
                int n8;
                block3: {
                    n3 = Arrays.binarySearch(lArray, l2);
                    if (n3 >= 0) break block3;
                    n4 = ~n3;
                    break block4;
                }
                while ((n8 = n3 + 1) < (n7 = lArray.length) && (l7 = (l4 = (l3 = lArray[n8]) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                    n3 = n8;
                }
                if (bl2) break block5;
                n4 = n8;
            }
            return n4;
        }
        return n3;
    }

    public static int zzb(int[] nArray, int n3, boolean bl2, boolean bl3) {
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

    public static int zzc(long[] lArray, long l2, boolean n3, boolean bl2) {
        int n4;
        n3 = Arrays.binarySearch(lArray, l2);
        if (n3 < 0) {
            n4 = -(n3 += 2);
        } else {
            long l3;
            long l4;
            long l7;
            int n7;
            while ((n7 = n3 + -1) >= 0 && (l7 = (l4 = (l3 = lArray[n7]) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                n3 = n7;
            }
            n4 = n3;
        }
        if (bl2) {
            n4 = Math.max(0, n4);
        }
        return n4;
    }

    public static int zzd(byte[] byArray, int n3, int n4, int n7) {
        n7 = (char)-1;
        for (n3 = 0; n3 < n4; ++n3) {
            int n8 = byArray[n3];
            int n10 = (n8 & 0xFF) >> 4;
            n7 = zzgd.zzQ(n10, n7);
            n7 = zzgd.zzQ(n8 &= 0xF, n7);
        }
        return n7;
    }

    public static int zze(byte[] byArray, int n3, int n4, int n7) {
        while (n3 < n4) {
            int n8 = n7 << 8;
            n7 >>>= 24;
            int[] nArray = zzn;
            int n10 = byArray[n3] & 0xFF;
            n7 ^= n10;
            n7 = nArray[n7] ^ n8;
            ++n3;
        }
        return n7;
    }

    public static int zzf(byte[] byArray, int n3, int n4, int n7) {
        n7 = 0;
        while (n3 < n4) {
            int[] nArray = zzp;
            int n8 = byArray[n3] & 0xFF;
            n7 ^= n8;
            n7 = nArray[n7];
            ++n3;
        }
        return n7;
    }

    public static int zzg(int n3) {
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

    public static int zzh(int n3) {
        int n4 = 6396;
        switch (n3) {
            default: {
                return 0;
            }
            case 12: {
                return 743676;
            }
            case 10: {
                n3 = zza;
                int n7 = 32;
                if (n3 >= n7) {
                    return 737532;
                }
            }
            case 8: {
                return n4;
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
                return 12;
            }
            case 1: 
        }
        return 4;
    }

    public static int zzi(ByteBuffer object, int n3) {
        ByteOrder byteOrder;
        n3 = ((ByteBuffer)object).getInt(n3);
        if ((object = ((ByteBuffer)object).order()) == (byteOrder = ByteOrder.BIG_ENDIAN)) {
            return n3;
        }
        return Integer.reverseBytes(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int zzj(int n3) {
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
    public static int zzk(String object) {
        String string2;
        boolean bl2;
        int n3;
        int n4 = 0;
        if (object == null) {
            return 0;
        }
        String string3 = "_";
        String[] stringArray = ((String)object).split(string3, -1);
        int n7 = stringArray.length;
        if (n7 < (n3 = 2)) {
            return 0;
        }
        n3 = n7 + -1;
        String string4 = stringArray[n3];
        int n8 = 3;
        if (n7 >= n8 && (bl2 = (string3 = "neg").equals(string2 = stringArray[n7 += -2]))) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var0_3 = null;
        }
        if (string4 != null) {
            n4 = Integer.parseInt(string4);
            if (!bl2) return n4;
            return -n4;
        }
        bl2 = false;
        Object var0_4 = null;
        try {
            throw null;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public static int zzl(int n3) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int zzm(int n3, int n4) {
        int n7 = 2;
        if (n3 == n7) return n4 + n4;
        n7 = 3;
        if (n3 == n7) return n4;
        int n8 = 4;
        if (n3 != n8) {
            int n10 = 21;
            if (n3 == n10) return n4 * 3;
            n10 = 22;
            if (n3 != n10) {
                n10 = 0x10000000;
                if (n3 == n10) return n4 + n4;
                n10 = 0x50000000;
                if (n3 == n10) return n4 * 3;
                n7 = 0x60000000;
                if (n3 != n7) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                    throw illegalArgumentException;
                }
            }
        }
        n4 *= 4;
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    public static int zzn(Uri object) {
        int n3;
        int n4;
        int n7;
        Object object2;
        block19: {
            void var4_20;
            void var4_15;
            int n10;
            block20: {
                String string2;
                boolean n8;
                object2 = object.getScheme();
                n10 = 3;
                if (object2 != null && (n8 = zzfxm.zzc(string2 = "rtsp", (CharSequence)object2))) {
                    return n10;
                }
                object2 = object.getLastPathSegment();
                n7 = 4;
                if (object2 == null) {
                    return n7;
                }
                int n14 = ((String)object2).lastIndexOf(46);
                n4 = 2;
                n3 = 1;
                if (n14 < 0) break block19;
                object2 = zzfxm.zza(((String)object2).substring(n14 += n3));
                n14 = ((String)object2).hashCode();
                switch (n14) {
                    default: {
                        break;
                    }
                    case 3299913: {
                        String string3 = "m3u8";
                        boolean bl2 = ((String)object2).equals(string3);
                        if (!bl2) break;
                        boolean bl3 = true;
                        break block20;
                    }
                    case 3242057: {
                        String string4 = "isml";
                        boolean bl4 = ((String)object2).equals(string4);
                        if (!bl4) break;
                        int n15 = 3;
                        break block20;
                    }
                    case 108321: {
                        String string5 = "mpd";
                        boolean bl5 = ((String)object2).equals(string5);
                        if (!bl5) break;
                        boolean bl6 = false;
                        object2 = null;
                        break block20;
                    }
                    case 104579: {
                        String string6 = "ism";
                        boolean bl7 = ((String)object2).equals(string6);
                        if (!bl7) break;
                        int n16 = 2;
                        break block20;
                    }
                }
                int n17 = -1;
            }
            if (var4_15 != false) {
                if (var4_15 != n3) {
                    if (var4_15 != n4 && var4_15 != n10) {
                        int n18 = 4;
                    } else {
                        boolean bl8 = true;
                    }
                } else {
                    int n19 = 2;
                }
            } else {
                boolean bl9 = false;
                object2 = null;
            }
            if (var4_20 != n7) {
                return (int)var4_20;
            }
        }
        object2 = zzj;
        object = object.getPath();
        object.getClass();
        object = ((Pattern)object2).matcher((CharSequence)object);
        boolean bl10 = ((Matcher)object).matches();
        if (bl10) {
            if ((object = ((Matcher)object).group(n4)) != null) {
                object2 = "format=mpd-time-csf";
                boolean bl11 = ((String)object).contains((CharSequence)object2);
                if (bl11) {
                    return 0;
                }
                object2 = "format=m3u8-aapl";
                boolean bl12 = ((String)object).contains((CharSequence)object2);
                if (bl12) {
                    return n4;
                }
            }
            return n3;
        }
        return n7;
    }

    public static long zzo(long l2, int n3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        long l3 = n3;
        return zzgd.zzt(l2, l3, 1000000L, roundingMode);
    }

    public static long zzp(long l2, float f5) {
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

    public static long zzq(long l2, float f5) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return l2;
        }
        double d2 = l2;
        double d5 = f5;
        return Math.round(d2 / d5);
    }

    public static long zzr(long l2) {
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

    public static long zzs(long l2, int n3) {
        long l3 = n3;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return zzgd.zzt(l2, 1000000L, l3, roundingMode);
    }

    public static long zzt(long l2, long l3, long l4, RoundingMode roundingMode) {
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
                l3 = zzgdu.zza(l4, l3, roundingMode2);
                return zzgdu.zza(l2, l3, roundingMode);
            }
            if (object < 0 && (l17 = (l16 = (l15 = l3 % l4) - l7) == 0L ? 0 : (l16 < 0L ? -1 : 1)) == false) {
                roundingMode = RoundingMode.UNNECESSARY;
                l3 = zzgdu.zza(l3, l4, roundingMode);
                return zzgdu.zzc(l2, l3);
            }
            object = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
            if (object >= 0 && (l20 = (l14 = (l18 = l4 % l2) - l7) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false) {
                RoundingMode roundingMode3 = RoundingMode.UNNECESSARY;
                l2 = zzgdu.zza(l4, l2, roundingMode3);
                return zzgdu.zza(l3, l2, roundingMode);
            }
            if (object < 0 && (l17 = (l12 = (l15 = l2 % l4) - l7) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false) {
                roundingMode = RoundingMode.UNNECESSARY;
                l2 = zzgdu.zza(l2, l4, roundingMode);
                return zzgdu.zzc(l3, l2);
            }
            return zzgd.zzR(l2, l3, l4, roundingMode);
        }
        return l7;
    }

    public static long zzu(long l2) {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Point zzv(Context context) {
        int n3;
        void var9_17;
        int n4;
        int n7;
        DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        int n8 = 0;
        String string2 = null;
        if (displayManager != null) {
            displayManager = displayManager.getDisplay(0);
        } else {
            n7 = 0;
            displayManager = null;
        }
        if (displayManager == null) {
            displayManager = (WindowManager)context.getSystemService("window");
            displayManager.getClass();
            displayManager = displayManager.getDefaultDisplay();
        }
        if ((n4 = displayManager.getDisplayId()) == 0 && (n4 = (int)(zzgd.zzN(context) ? 1 : 0)) != 0) {
            n4 = zza;
            int n10 = 28;
            String string3 = n4 < n10 ? zzgd.zzS("sys.display-size") : zzgd.zzS("vendor.display-size");
            n10 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
            if (n10 == 0) {
                try {
                    String string4 = string3.trim();
                    String string5 = "x";
                    int n14 = -1;
                    String[] stringArray = string4.split(string5, n14);
                    int n15 = stringArray.length;
                    n14 = 2;
                    if (n15 == n14) {
                        string2 = stringArray[0];
                        n8 = Integer.parseInt(string2);
                        n15 = 1;
                        String string6 = stringArray[n15];
                        n10 = Integer.parseInt(string6);
                        if (n8 > 0 && n10 > 0) {
                            Point point = new Point(n8, n10);
                            return var9_17;
                        }
                    }
                }
                catch (NumberFormatException numberFormatException) {}
                string2 = String.valueOf(string3);
                string3 = "Util";
                String string7 = "Invalid display size: ";
                string2 = string7.concat(string2);
                zzfk.zzc(string3, string2);
            }
            if ((n8 = (int)((string2 = "Sony").equals(string3 = zzc) ? 1 : 0)) != 0 && (n8 = (int)((string2 = zzd).startsWith(string3 = "BRAVIA") ? 1 : 0)) != 0 && (n3 = (int)((context = context.getPackageManager()).hasSystemFeature(string2 = "com.sony.dtv.hardware.panel.qfhd") ? 1 : 0)) != 0) {
                n3 = 3840;
                n7 = 2160;
                Point point = new Point(n3, n7);
                return var9_17;
            }
        }
        Point point = new Point();
        n3 = zza;
        n8 = 23;
        if (n3 >= n8) {
            context = Ty3.a((Display)displayManager);
            point.x = n7 = Uy3.a((Display.Mode)context);
            point.y = n3 = Vy3.a((Display.Mode)context);
            return var9_17;
        }
        displayManager.getRealSize(point);
        return var9_17;
    }

    public static AudioFormat zzw(int n3, int n4, int n7) {
        AudioFormat.Builder builder = new AudioFormat.Builder();
        return builder.setSampleRate(n3).setChannelMask(n4).setEncoding(n7).build();
    }

    public static Handler zzx(Handler.Callback callback2) {
        callback2 = Looper.myLooper();
        zzeq.zzb(callback2);
        Handler handler = new Handler((Looper)callback2, null);
        return handler;
    }

    public static Looper zzy() {
        Looper looper = Looper.myLooper();
        if (looper != null) {
            return looper;
        }
        return Looper.getMainLooper();
    }

    public static zzan zzz(int n3, int n4, int n7) {
        zzal zzal2 = new zzal();
        zzal2.zzX("audio/raw");
        zzal2.zzy(n4);
        zzal2.zzY(n7);
        zzal2.zzR(n3);
        return zzal2.zzad();
    }
}

