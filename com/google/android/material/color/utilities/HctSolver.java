/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Cam16;
import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.ViewingConditions;

public class HctSolver {
    static final double[] CRITICAL_PLANES;
    static final double[][] LINRGB_FROM_SCALED_DISCOUNT;
    static final double[][] SCALED_DISCOUNT_FROM_LINRGB;
    static final double[] Y_FROM_LINRGB;

    static {
        double[] dArray;
        double[] dArray2;
        double[] dArray3;
        double[] dArray4;
        double[] dArray5;
        int n3 = 3;
        double[] dArray6 = dArray5 = new double[n3];
        dArray5[0] = 0.001200833568784504;
        dArray6[1] = 0.002389694492170889;
        dArray6[2] = 2.795742885861124E-4;
        double[] dArray7 = dArray4 = new double[n3];
        dArray4[0] = 5.891086651375999E-4;
        dArray7[1] = 0.0029785502573438758;
        dArray7[2] = 3.270666104008398E-4;
        double[] dArray8 = dArray3 = new double[n3];
        dArray3[0] = 1.0146692491640572E-4;
        dArray8[1] = 5.364214359186694E-4;
        dArray8[2] = 0.0032979401770712076;
        Object object = new double[n3][];
        object[0] = dArray5;
        int n4 = 1;
        object[n4] = dArray4;
        int n7 = 2;
        object[n7] = dArray3;
        SCALED_DISCOUNT_FROM_LINRGB = object;
        double[] dArray9 = dArray3 = new double[n3];
        dArray3[0] = 1373.2198709594231;
        dArray9[1] = -1100.4251190754821;
        dArray9[2] = -7.278681089101213;
        Object object2 = object = (Object)new double[n3];
        object[0] = (double[])-271.815969077903;
        object2[1] = (double[])559.6580465940733;
        object2[2] = (double[])-32.46047482791194;
        double[] dArray10 = dArray2 = new double[n3];
        dArray2[0] = 1.9622899599665666;
        dArray10[1] = -57.173814538844006;
        dArray10[2] = 308.7233197812385;
        double[][] dArrayArray = new double[n3][];
        dArrayArray[0] = dArray3;
        dArrayArray[n4] = (double[])object;
        dArrayArray[n7] = dArray2;
        LINRGB_FROM_SCALED_DISCOUNT = dArrayArray;
        double[] dArray11 = dArray = new double[n3];
        dArray[0] = 0.2126;
        dArray11[1] = 0.7152;
        dArray11[2] = 0.0722;
        Y_FROM_LINRGB = dArray;
        double[] dArray12 = dArray = new double[255];
        double[] dArray13 = dArray;
        dArray12[0] = 0.015176349177441876;
        dArray13[1] = 0.045529047532325624;
        dArray12[2] = 0.07588174588720938;
        dArray13[3] = 0.10623444424209313;
        dArray12[4] = 0.13658714259697685;
        dArray13[5] = 0.16693984095186062;
        dArray12[6] = 0.19729253930674434;
        dArray13[7] = 0.2276452376616281;
        dArray12[8] = 0.2579979360165119;
        dArray13[9] = 0.28835063437139563;
        dArray12[10] = 0.3188300904430532;
        dArray13[11] = 0.350925934958123;
        dArray12[12] = 0.3848314933096426;
        dArray13[13] = 0.42057480301049466;
        dArray12[14] = 0.458183274052838;
        dArray13[15] = 0.4976837250274023;
        dArray12[16] = 0.5391024159806381;
        dArray13[17] = 0.5824650784040898;
        dArray12[18] = 0.6277969426914107;
        dArray13[19] = 0.6751227633498623;
        dArray12[20] = 0.7244668422128921;
        dArray13[21] = 0.775853049866786;
        dArray12[22] = 0.829304845476233;
        dArray13[23] = 0.8848452951698498;
        dArray12[24] = 0.942497089126609;
        dArray13[25] = 1.0022825574869039;
        dArray12[26] = 1.0642236851973577;
        dArray13[27] = 1.1283421258858297;
        dArray12[28] = 1.1946592148522128;
        dArray13[29] = 1.2631959812511864;
        dArray12[30] = 1.3339731595349034;
        dArray13[31] = 1.407011200216447;
        dArray12[32] = 1.4823302800086415;
        dArray13[33] = 1.5599503113873272;
        dArray12[34] = 1.6398909516233677;
        dArray13[35] = 1.7221716113234105;
        dArray12[36] = 1.8068114625156377;
        dArray13[37] = 1.8938294463134073;
        dArray12[38] = 1.9832442801866852;
        dArray13[39] = 2.075074464868551;
        dArray12[40] = 2.1693382909216234;
        dArray13[41] = 2.2660538449872063;
        dArray12[42] = 2.36523901573795;
        dArray13[43] = 2.4669114995532007;
        dArray12[44] = 2.5710888059345764;
        dArray13[45] = 2.6777882626779785;
        dArray12[46] = 2.7870270208169257;
        dArray13[47] = 2.898822059350997;
        dArray12[48] = 3.0131901897720907;
        dArray13[49] = 3.1301480604002863;
        dArray12[50] = 3.2497121605402226;
        dArray13[51] = 3.3718988244681087;
        dArray12[52] = 3.4967242352587946;
        dArray13[53] = 3.624204428461639;
        dArray12[54] = 3.754355295633311;
        dArray13[55] = 3.887192587735158;
        dArray12[56] = 4.022731918402185;
        dArray13[57] = 4.160988767090289;
        dArray12[58] = 4.301978482107941;
        dArray13[59] = 4.445716283538092;
        dArray12[60] = 4.592217266055746;
        dArray13[61] = 4.741496401646282;
        dArray12[62] = 4.893568542229298;
        dArray13[63] = 5.048448422192488;
        dArray12[64] = 5.20615066083972;
        dArray13[65] = 5.3666897647573375;
        dArray12[66] = 5.5300801301023865;
        dArray13[67] = 5.696336044816294;
        dArray12[68] = 5.865471690767354;
        dArray13[69] = 6.037501145825082;
        dArray12[70] = 6.212438385869475;
        dArray13[71] = 6.390297286737924;
        dArray12[72] = 6.571091626112461;
        dArray13[73] = 6.7548350853498045;
        dArray12[74] = 6.941541251256611;
        dArray13[75] = 7.131223617812143;
        dArray12[76] = 7.323895587840543;
        dArray13[77] = 7.5195704746346665;
        dArray12[78] = 7.7182615035334345;
        dArray13[79] = 7.919981813454504;
        dArray12[80] = 8.124744458384042;
        dArray13[81] = 8.332562408825165;
        dArray12[82] = 8.543448553206703;
        dArray13[83] = 8.757415699253682;
        dArray12[84] = 8.974476575321063;
        dArray13[85] = 9.194643831691977;
        dArray12[86] = 9.417930041841839;
        dArray13[87] = 9.644347703669503;
        dArray12[88] = 9.873909240696694;
        dArray13[89] = 10.106627003236781;
        dArray12[90] = 10.342513269534024;
        dArray13[91] = 10.58158024687427;
        dArray12[92] = 10.8238400726681;
        dArray13[93] = 11.069304815507364;
        dArray12[94] = 11.317986476196008;
        dArray13[95] = 11.569896988756009;
        dArray12[96] = 11.825048221409341;
        dArray13[97] = 12.083451977536606;
        dArray12[98] = 12.345119996613247;
        dArray13[99] = 12.610063955123938;
        dArray12[100] = 12.878295467455942;
        dArray13[101] = 13.149826086772048;
        dArray12[102] = 13.42466730586372;
        dArray13[103] = 13.702830557985108;
        dArray12[104] = 13.984327217668513;
        dArray13[105] = 14.269168601521828;
        dArray12[106] = 14.55736596900856;
        dArray13[107] = 14.848930523210871;
        dArray12[108] = 15.143873411576273;
        dArray13[109] = 15.44220572664832;
        dArray12[110] = 15.743938506781891;
        dArray13[111] = 16.04908273684337;
        dArray12[112] = 16.35764934889634;
        dArray13[113] = 16.66964922287304;
        dArray12[114] = 16.985093187232053;
        dArray13[115] = 17.30399201960269;
        dArray12[116] = 17.62635644741625;
        dArray13[117] = 17.95219714852476;
        dArray12[118] = 18.281524751807332;
        dArray13[119] = 18.614349837764564;
        dArray12[120] = 18.95068293910138;
        dArray13[121] = 19.290534541298456;
        dArray12[122] = 19.633915083172692;
        dArray13[123] = 19.98083495742689;
        dArray12[124] = 20.331304511189067;
        dArray13[125] = 20.685334046541502;
        dArray12[126] = 21.042933821039977;
        dArray13[127] = 21.404114048223256;
        dArray12[128] = 21.76888489811322;
        dArray13[129] = 22.137256497705877;
        dArray12[130] = 22.50923893145328;
        dArray13[131] = 22.884842241736916;
        dArray12[132] = 23.264076429332462;
        dArray13[133] = 23.6469514538663;
        dArray12[134] = 24.033477234264016;
        dArray13[135] = 24.42366364919083;
        dArray12[136] = 24.817520537484558;
        dArray13[137] = 25.21505769858089;
        dArray12[138] = 25.61628489293138;
        dArray13[139] = 26.021211842414342;
        dArray12[140] = 26.429848230738664;
        dArray13[141] = 26.842203703840827;
        dArray12[142] = 27.258287870275353;
        dArray13[143] = 27.678110301598522;
        dArray12[144] = 28.10168053274597;
        dArray13[145] = 28.529008062403893;
        dArray12[146] = 28.96010235337422;
        dArray13[147] = 29.39497283293396;
        dArray12[148] = 29.83362889318845;
        dArray13[149] = 30.276079891419332;
        dArray12[150] = 30.722335150426627;
        dArray13[151] = 31.172403958865512;
        dArray12[152] = 31.62629557157785;
        dArray13[153] = 32.08401920991837;
        dArray12[154] = 32.54558406207592;
        dArray13[155] = 33.010999283389665;
        dArray12[156] = 33.4802739966603;
        dArray13[157] = 33.953417292456834;
        dArray12[158] = 34.430438229418264;
        dArray13[159] = 34.911345834551085;
        dArray12[160] = 35.39614910352207;
        dArray13[161] = 35.88485700094671;
        dArray12[162] = 36.37747846067349;
        dArray13[163] = 36.87402238606382;
        dArray12[164] = 37.37449765026789;
        dArray13[165] = 37.87891309649659;
        dArray12[166] = 38.38727753828926;
        dArray13[167] = 38.89959975977785;
        dArray12[168] = 39.41588851594697;
        dArray13[169] = 39.93615253289054;
        dArray12[170] = 40.460400508064545;
        dArray13[171] = 40.98864111053629;
        dArray12[172] = 41.520882981230194;
        dArray13[173] = 42.05713473317016;
        dArray12[174] = 42.597404951718396;
        dArray13[175] = 43.141702194811224;
        dArray12[176] = 43.6900349931913;
        dArray13[177] = 44.24241185063697;
        dArray12[178] = 44.798841244188324;
        dArray13[179] = 45.35933162437017;
        dArray12[180] = 45.92389141541209;
        dArray13[181] = 46.49252901546552;
        dArray12[182] = 47.065252796817916;
        dArray13[183] = 47.64207110610409;
        dArray12[184] = 48.22299226451468;
        dArray13[185] = 48.808024568002054;
        dArray12[186] = 49.3971762874833;
        dArray13[187] = 49.9904556690408;
        dArray12[188] = 50.587870934119984;
        dArray13[189] = 51.189430279724725;
        dArray12[190] = 51.79514187861014;
        dArray13[191] = 52.40501387947288;
        dArray12[192] = 53.0190544071392;
        dArray13[193] = 53.637271562750364;
        dArray12[194] = 54.259673423945976;
        dArray13[195] = 54.88626804504493;
        dArray12[196] = 55.517063457223934;
        dArray13[197] = 56.15206766869424;
        dArray12[198] = 56.79128866487574;
        dArray13[199] = 57.43473440856916;
        dArray12[200] = 58.08241284012621;
        dArray13[201] = 58.734331877617365;
        dArray12[202] = 59.39049941699807;
        dArray13[203] = 60.05092333227251;
        dArray12[204] = 60.715611475655585;
        dArray13[205] = 61.38457167773311;
        dArray12[206] = 62.057811747619894;
        dArray13[207] = 62.7353394731159;
        dArray12[208] = 63.417162620860914;
        dArray13[209] = 64.10328893648692;
        dArray12[210] = 64.79372614476921;
        dArray13[211] = 65.48848194977529;
        dArray12[212] = 66.18756403501224;
        dArray13[213] = 66.89098006357258;
        dArray12[214] = 67.59873767827808;
        dArray13[215] = 68.31084450182222;
        dArray12[216] = 69.02730813691093;
        dArray13[217] = 69.74813616640164;
        dArray12[218] = 70.47333615344107;
        dArray13[219] = 71.20291564160104;
        dArray12[220] = 71.93688215501312;
        dArray13[221] = 72.67524319850172;
        dArray12[222] = 73.41800625771542;
        dArray13[223] = 74.16517879925733;
        dArray12[224] = 74.9167682708136;
        dArray13[225] = 75.67278210128072;
        dArray12[226] = 76.43322770089146;
        dArray13[227] = 77.1981124613393;
        dArray12[228] = 77.96744375590167;
        dArray13[229] = 78.74122893956174;
        dArray12[230] = 79.51947534912904;
        dArray13[231] = 80.30219030335869;
        dArray12[232] = 81.08938110306934;
        dArray13[233] = 81.88105503125999;
        dArray12[234] = 82.67721935322541;
        dArray13[235] = 83.4778813166706;
        dArray12[236] = 84.28304815182372;
        dArray13[237] = 85.09272707154808;
        dArray12[238] = 85.90692527145302;
        dArray13[239] = 86.72564993000343;
        dArray12[240] = 87.54890820862819;
        dArray13[241] = 88.3767072518277;
        dArray12[242] = 89.2090541872801;
        dArray13[243] = 90.04595612594655;
        dArray12[244] = 90.88742016217518;
        dArray13[245] = 91.73345337380438;
        dArray12[246] = 92.58406282226491;
        dArray13[247] = 93.43925555268066;
        dArray12[248] = 94.29903859396902;
        dArray13[249] = 95.16341895893969;
        dArray12[250] = 96.03240364439274;
        dArray13[251] = 96.9059996312159;
        dArray12[252] = 97.78421388448044;
        dArray13[253] = 98.6670533535366;
        dArray13[254] = 99.55452497210776;
        CRITICAL_PLANES = dArray;
    }

    private HctSolver() {
    }

    public static boolean areInCyclicOrder(double d2, double d5, double d7) {
        double d9 = (d5 = HctSolver.sanitizeRadians(d5 - d2)) - (d2 = HctSolver.sanitizeRadians(d7 -= d2));
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        boolean bl2 = object < 0;
        return bl2;
    }

    public static double[] bisectToLimit(double d2, double d5) {
        int n3;
        Object object = HctSolver.bisectToSegment(d2, d5);
        double[] dArray = object[0];
        double d7 = HctSolver.hueOf(dArray);
        int n4 = 1;
        object = object[n4];
        for (int i3 = 0; i3 < (n3 = 3); ++i3) {
            int n7;
            double d9;
            double d12 = dArray[i3];
            Object object2 = object[i3];
            double d13 = d12 - object2;
            Object object3 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            if (object3 == false) continue;
            object3 = d12 == object2 ? 0 : (d12 < object2 ? -1 : 1);
            if (object3 < 0) {
                d12 = HctSolver.trueDelinearized(d12);
                n3 = HctSolver.criticalPlaneBelow(d12);
                d9 = HctSolver.trueDelinearized((double)object[i3]);
                n7 = HctSolver.criticalPlaneAbove(d9);
            } else {
                d12 = HctSolver.trueDelinearized(d12);
                n3 = HctSolver.criticalPlaneAbove(d12);
                d9 = HctSolver.trueDelinearized((double)object[i3]);
                n7 = HctSolver.criticalPlaneBelow(d9);
            }
            int n8 = n3;
            int n10 = n7;
            for (int i8 = 0; i8 < (n3 = 8) && (n3 = Math.abs(n10 - n8)) > n4; ++i8) {
                object3 = (int)Math.floor((double)(n8 + n10) / 2.0);
                double[] dArray2 = CRITICAL_PLANES;
                d9 = dArray2[object3];
                double[] dArray3 = HctSolver.setCoordinate(dArray, d9, (double[])object, i3);
                double d14 = HctSolver.hueOf(dArray3);
                d12 = d7;
                object2 = d5;
                n3 = (int)(HctSolver.areInCyclicOrder(d7, d5, d14) ? 1 : 0);
                if (n3 != 0) {
                    object = dArray3;
                    n10 = (int)object3;
                    continue;
                }
                dArray = dArray3;
                d7 = d14;
                n8 = (int)object3;
            }
        }
        return HctSolver.midpoint(dArray, (double[])object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double[][] bisectToSegment(double d2, double d5) {
        double d7;
        int n3 = 3;
        double[] dArray = new double[n3];
        dArray[0] = d7 = -1.0;
        int n4 = 1;
        dArray[n4] = d7;
        int n7 = 2;
        dArray[n7] = d7;
        d7 = 0.0;
        double[] dArray2 = dArray;
        double d9 = d7;
        double d12 = d7;
        int n8 = 0;
        boolean bl2 = false;
        boolean bl3 = true;
        while (true) {
            block7: {
                double d13;
                double d14;
                double[] dArray3;
                block9: {
                    int n10;
                    block8: {
                        if (n8 >= (n10 = 12)) {
                            double[][] dArrayArray = new double[n7][];
                            dArrayArray[0] = dArray;
                            dArrayArray[n4] = dArray2;
                            return dArrayArray;
                        }
                        dArray3 = HctSolver.nthVertex(d2, n8);
                        d14 = dArray3[0];
                        double d15 = d14 - d7;
                        Object object = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                        if (object < 0) break block7;
                        d13 = HctSolver.hueOf(dArray3);
                        if (bl2) break block8;
                        dArray = dArray3;
                        dArray2 = dArray3;
                        d9 = d13;
                        d12 = d13;
                        bl2 = true;
                        break block7;
                    }
                    if (bl3) break block9;
                    d14 = d9;
                    n10 = (int)(HctSolver.areInCyclicOrder(d9, d13, d12) ? 1 : 0);
                    if (n10 == 0) break block7;
                }
                d14 = d9;
                bl3 = HctSolver.areInCyclicOrder(d9, d5, d13);
                if (bl3) {
                    dArray2 = dArray3;
                    d12 = d13;
                } else {
                    dArray = dArray3;
                    d9 = d13;
                }
                bl3 = false;
            }
            n8 += n4;
        }
    }

    public static double chromaticAdaptation(double d2) {
        double d5 = Math.pow(Math.abs(d2), 0.42);
        d2 = (double)MathUtils.signum(d2) * 400.0 * d5;
        return d2 / (d5 += 27.13);
    }

    public static int criticalPlaneAbove(double d2) {
        return (int)Math.ceil(d2 - 0.5);
    }

    public static int criticalPlaneBelow(double d2) {
        return (int)Math.floor(d2 - 0.5);
    }

    public static int findResultByJ(double d2, double d5, double d7) {
        int n3;
        Object object;
        double d9 = Math.sqrt(d7);
        double d12 = 11.0;
        d9 *= d12;
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        double d13 = viewingConditions.getN();
        d13 = Math.pow(0.29, d13);
        d13 = Math.pow(1.64 - d13, 0.73);
        double d14 = 1.0;
        d13 = d14 / d13;
        double d15 = 2.0;
        double d16 = (Math.cos(d2 + d15) + 3.8) * 0.25 * 3846.153846153846;
        double d17 = viewingConditions.getNc() * d16;
        d16 = viewingConditions.getNcb() * d17;
        d17 = Math.sin(d2);
        double d18 = Math.cos(d2);
        for (int i3 = 0; i3 < (n3 = 5); i3 += object) {
            double[] dArray;
            reference var53_33;
            double[] dArray2;
            double[] dArray3;
            reference var53_32;
            double d19;
            Object object2;
            double d20;
            double d22;
            double d23 = d9 / 100.0;
            double d24 = 0.0;
            double d25 = d5 - d24;
            Object object3 = d25 == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
            if (object3 != false && (object3 = d9 == d24 ? 0 : (d9 > d24 ? 1 : -1)) != false) {
                d22 = Math.sqrt(d23);
                d22 = d5 / d22;
            } else {
                d22 = d24;
            }
            d12 = d22 * d13;
            d22 = d16;
            d12 = Math.pow(d12, 1.1111111111111112);
            double d26 = viewingConditions.getAw();
            Object object4 = viewingConditions.getC();
            object4 = d14 / object4;
            double d27 = viewingConditions.getZ();
            d14 = object4 / d27;
            d23 = Math.pow(d23, d14) * d26;
            d14 = viewingConditions.getNbb();
            d23 /= d14;
            d14 = 0.305 + d23;
            d26 = 23.0;
            d14 = d14 * d26 * d12;
            double d28 = 11.0;
            object4 = d12 * d28 * d18 + (d16 *= d26);
            d12 = d12 * 108.0 * d17 + object4;
            d14 /= d12;
            d12 = d14 * d18;
            d26 = 451.0 * d12 + (d23 *= 460.0);
            object4 = 288.0 * (d14 *= d17) + d26;
            d26 = 1403.0;
            object4 /= d26;
            d27 = 891.0 * d12;
            d27 = d23 - d27;
            double d29 = 261.0 * d14;
            d27 = (d27 - d29) / d26;
            d29 = 220.0;
            d23 -= (d12 *= d29);
            d23 = (d23 - (d14 *= 6300.0)) / d26;
            d12 = HctSolver.inverseChromaticAdaptation(object4);
            d14 = HctSolver.inverseChromaticAdaptation(d27);
            d23 = HctSolver.inverseChromaticAdaptation(d23);
            n3 = 3;
            double[] dArray4 = new double[n3];
            dArray4[0] = d12;
            int n4 = 1;
            dArray4[n4] = d14;
            int n7 = 2;
            dArray4[n7] = d23;
            Object object5 = LINRGB_FROM_SCALED_DISCOUNT;
            object5 = MathUtils.matrixMultiply(dArray4, object5);
            d14 = (double)object5[0];
            object = d14 == d24 ? 0 : (d14 < d24 ? -1 : 1);
            if (object < 0 || (object = (d20 = (d16 = (double)object5[n4]) - d24) == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1)) < 0 || (object = (object2 = (object4 = (Object)object5[n7]) - d24) == 0.0 ? 0 : (object2 < 0.0 ? -1 : 1)) < 0) break;
            double[] dArray5 = Y_FROM_LINRGB;
            d27 = dArray5[0];
            d29 = dArray5[n4];
            double d30 = dArray5[n7];
            double d32 = (d30 = d30 * object4 + (d29 = d29 * d16 + (d27 *= d14))) - d24;
            object = d32 == 0.0 ? 0 : (d32 < 0.0 ? -1 : 1);
            if (object <= 0) {
                return 0;
            }
            object = 4;
            if (i3 != object && (object = (d19 = (d14 = Math.abs(d12 = d30 - d7)) - (d16 = 0.002)) == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1)) >= 0) {
                d12 *= d9;
                d9 -= (d12 /= (d30 *= 2.0));
                object = true;
                d16 = d22;
                d12 = d28;
                d14 = 1.0;
                continue;
            }
            object = true;
            d9 = (double)object5[0];
            d12 = 100.01;
            double d34 = d9 == d12 ? 0 : (d9 > d12 ? 1 : -1);
            if (d34 > 0 || (var53_32 = (dArray3 = (dArray2 = object5[object]) - d12) == 0 ? 0 : (dArray3 > 0 ? 1 : -1)) > 0 || (var53_33 = (dArray = (dArray2 = object5[object = (Object)2]) - d12) == 0 ? 0 : (dArray > 0 ? 1 : -1)) > 0) break;
            return ColorUtils.argbFromLinrgb((double[])object5);
        }
        return 0;
    }

    public static double hueOf(double[] dArray) {
        double[][] dArray2 = SCALED_DISCOUNT_FROM_LINRGB;
        dArray = MathUtils.matrixMultiply(dArray, dArray2);
        double d2 = HctSolver.chromaticAdaptation(dArray[0]);
        double d5 = HctSolver.chromaticAdaptation(dArray[1]);
        double d7 = HctSolver.chromaticAdaptation(dArray[2]);
        double d9 = 11.0;
        double d12 = d2 * d9;
        double d13 = (-12.0 * d5 + d12 + d7) / d9;
        return Math.atan2(((d2 += d5) - (d7 *= 2.0)) / 9.0, d13);
    }

    public static double intercept(double d2, double d5, double d7) {
        return (d5 -= d2) / (d7 -= d2);
    }

    public static double inverseChromaticAdaptation(double d2) {
        double d5 = Math.abs(d2);
        double d7 = 27.13 * d5;
        double d9 = 400.0 - d5;
        d5 = Math.max(0.0, d7 /= d9);
        d2 = MathUtils.signum(d2);
        return Math.pow(d5, 2.380952380952381) * d2;
    }

    public static boolean isBounded(double d2) {
        double d5;
        double d7 = 0.0;
        double d9 = d7 - d2;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        boolean bl2 = object <= 0 && (object = (d5 = d2 - (d7 = 100.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) <= 0;
        return bl2;
    }

    public static double[] lerpPoint(double[] dArray, double d2, double[] dArray2) {
        double d5 = dArray[0];
        double d7 = (dArray2[0] - d5) * d2 + d5;
        int n3 = 1;
        double d9 = dArray[n3];
        double d12 = (dArray2[n3] - d9) * d2 + d9;
        int n4 = 2;
        d9 = dArray[n4];
        double d13 = (dArray2[n4] - d9) * d2 + d9;
        dArray = new double[3];
        dArray[0] = d7;
        dArray[n3] = d12;
        dArray[n4] = d13;
        return dArray;
    }

    public static double[] midpoint(double[] dArray, double[] dArray2) {
        double d2 = dArray[0];
        double d5 = dArray2[0];
        d2 += d5;
        d5 = 2.0;
        d2 /= d5;
        int n3 = 1;
        double d7 = dArray[n3];
        double d9 = dArray2[n3];
        d7 = (d7 + d9) / d5;
        int n4 = 2;
        double d12 = dArray[n4];
        double d13 = dArray2[n4];
        d12 = (d12 + d13) / d5;
        dArray = new double[3];
        dArray[0] = d2;
        dArray[n3] = d7;
        dArray[n4] = d12;
        return dArray;
    }

    public static double[] nthVertex(double d2, int n3) {
        double[] dArray;
        int n4 = n3;
        int n7 = 3;
        double[] dArray2 = Y_FROM_LINRGB;
        double d5 = dArray2[0];
        int n8 = 1;
        double d7 = dArray2[n8];
        int n10 = 2;
        double d9 = dArray2[n10];
        int n14 = 4;
        int n15 = n3 % 4;
        double d12 = 100.0;
        long l2 = 0L;
        double d13 = 0.0;
        double d14 = n15 <= n8 ? d13 : d12;
        n15 = n4 % 2;
        if (n15 == 0) {
            d12 = d13;
        }
        if (n4 < n14) {
            double[] dArray3;
            d7 *= d14;
            d7 = d2 - d7;
            n4 = (int)(HctSolver.isBounded(d7 = (d7 - (d9 *= d12)) / d5) ? 1 : 0);
            if (n4 != 0) {
                double[] dArray4 = new double[n7];
                dArray4[0] = d7;
                dArray4[n8] = d14;
                dArray4[n10] = d12;
                return dArray4;
            }
            double[] dArray5 = dArray3 = new double[n7];
            dArray3[0] = -1.0;
            dArray5[1] = -1.0;
            dArray5[2] = -1.0;
            return dArray3;
        }
        n14 = 8;
        if (n4 < n14) {
            double[] dArray6;
            d5 *= d12;
            d5 = d2 - d5;
            n4 = (int)(HctSolver.isBounded(d5 = (d5 - (d9 *= d14)) / d7) ? 1 : 0);
            if (n4 != 0) {
                double[] dArray7 = new double[n7];
                dArray7[0] = d12;
                dArray7[n8] = d5;
                dArray7[n10] = d14;
                return dArray7;
            }
            double[] dArray8 = dArray6 = new double[n7];
            dArray6[0] = -1.0;
            dArray8[1] = -1.0;
            dArray8[2] = -1.0;
            return dArray6;
        }
        d5 *= d14;
        d5 = d2 - d5;
        n4 = (int)(HctSolver.isBounded(d5 = (d5 - (d7 *= d12)) / d9) ? 1 : 0);
        if (n4 != 0) {
            double[] dArray9 = new double[n7];
            dArray9[0] = d14;
            dArray9[n8] = d12;
            dArray9[n10] = d5;
            return dArray9;
        }
        double[] dArray10 = dArray = new double[n7];
        dArray[0] = -1.0;
        dArray10[1] = -1.0;
        dArray10[2] = -1.0;
        return dArray;
    }

    public static double sanitizeRadians(double d2) {
        return (d2 + Math.PI * 8) % (Math.PI * 2);
    }

    public static double[] setCoordinate(double[] dArray, double d2, double[] dArray2, int n3) {
        double d5 = dArray[n3];
        double d7 = dArray2[n3];
        d2 = HctSolver.intercept(d5, d2, d7);
        return HctSolver.lerpPoint(dArray, d2, dArray2);
    }

    public static Cam16 solveToCam(double d2, double d5, double d7) {
        return Cam16.fromInt(HctSolver.solveToInt(d2, d5, d7));
    }

    public static int solveToInt(double d2, double d5, double d7) {
        double d9;
        double d12 = 1.0E-4;
        double d13 = d5 - d12;
        Object object = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
        if (object >= 0 && (object = d7 == d12 ? 0 : (d7 < d12 ? -1 : 1)) >= 0 && (object = (d9 = d7 - (d12 = 99.9999)) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) <= 0) {
            d2 = MathUtils.sanitizeDegreesDouble(d2) / 180.0;
            d12 = Math.PI;
            int n3 = HctSolver.findResultByJ(d2 *= d12, d5, d7 = ColorUtils.yFromLstar(d7));
            if (n3 != 0) {
                return n3;
            }
            return ColorUtils.argbFromLinrgb(HctSolver.bisectToLimit(d7, d2));
        }
        return ColorUtils.argbFromLstar(d7);
    }

    public static double trueDelinearized(double d2) {
        double d5 = 0.0031308;
        double d7 = (d2 /= 100.0) - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object <= 0) {
            d5 = 12.92;
            d2 *= d5;
        } else {
            d2 = Math.pow(d2, 0.4166666666666667) * 1.055;
            d5 = 0.055;
            d2 -= d5;
        }
        return d2 * 255.0;
    }
}

