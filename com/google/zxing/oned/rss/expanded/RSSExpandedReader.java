/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.BitArrayBuilder;
import com.google.zxing.oned.rss.expanded.ExpandedPair;
import com.google.zxing.oned.rss.expanded.ExpandedRow;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class RSSExpandedReader
extends AbstractRSSReader {
    private static final int[] EVEN_TOTAL_SUBSET;
    private static final int[][] FINDER_PATTERNS;
    private static final int[][] FINDER_PATTERN_SEQUENCES;
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int[] GSUM;
    private static final int MAX_PAIRS = 11;
    private static final int[] SYMBOL_WIDEST;
    private static final int[][] WEIGHTS;
    private final List pairs;
    private final List rows;
    private final int[] startEnd;
    private boolean startFromEven;

    static {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5;
        int[] nArray6;
        int[] nArray7;
        Object object;
        int[] nArray8;
        int[] nArray9;
        int[] nArray10;
        int[] nArray11;
        int n3 = 5;
        int n4 = 4;
        int n7 = 3;
        int n8 = 1;
        SYMBOL_WIDEST = new int[]{7, n3, n4, n7, n8};
        EVEN_TOTAL_SUBSET = new int[]{n4, 20, 52, 104, 204};
        GSUM = new int[]{0, 348, 1388, 2948, 3988};
        int n10 = 6;
        Object object2 = new int[n10][];
        int n14 = 8;
        int[] nArray12 = new int[]{n8, n14, n4, n8};
        object2[0] = nArray12;
        nArray12 = new int[]{n7, n10, n4, n8};
        object2[n8] = nArray12;
        nArray12 = new int[]{n7, n4, n10, n8};
        int n15 = 2;
        object2[n15] = nArray12;
        nArray12 = new int[]{n7, n15, n14, n8};
        object2[n7] = nArray12;
        nArray12 = new int[]{n15, n10, n3, n8};
        object2[n4] = nArray12;
        int[] nArray13 = new int[]{n15, n15, 9, n8};
        object2[n3] = nArray13;
        FINDER_PATTERNS = object2;
        Object object3 = object2 = (Object)new int[n14];
        Object object4 = object2;
        object3[0] = (int[])true;
        object4[1] = (int[])3;
        object3[2] = (int[])9;
        object4[3] = (int[])27;
        object3[4] = (int[])81;
        object4[5] = (int[])32;
        object3[6] = (int[])96;
        object4[7] = (int[])77;
        int[] nArray14 = nArray11 = new int[n14];
        int[] nArray15 = nArray11;
        nArray14[0] = 20;
        nArray15[1] = 60;
        nArray14[2] = 180;
        nArray15[3] = 118;
        nArray14[4] = 143;
        nArray15[5] = 7;
        nArray14[6] = 21;
        nArray15[7] = 63;
        int[] nArray16 = nArray10 = new int[n14];
        int[] nArray17 = nArray10;
        nArray16[0] = 189;
        nArray17[1] = 145;
        nArray16[2] = 13;
        nArray17[3] = 39;
        nArray16[4] = 117;
        nArray17[5] = 140;
        nArray16[6] = 209;
        nArray17[7] = 205;
        int[] nArray18 = nArray13 = new int[n14];
        int[] nArray19 = nArray13;
        nArray18[0] = 193;
        nArray19[1] = 157;
        nArray18[2] = 49;
        nArray19[3] = 147;
        nArray18[4] = 19;
        nArray19[5] = 57;
        nArray18[6] = 171;
        nArray19[7] = 91;
        int[] nArray20 = nArray9 = new int[n14];
        int[] nArray21 = nArray9;
        nArray20[0] = 62;
        nArray21[1] = 186;
        nArray20[2] = 136;
        nArray21[3] = 197;
        nArray20[4] = 169;
        nArray21[5] = 85;
        nArray20[6] = 44;
        nArray21[7] = 132;
        int[] nArray22 = nArray8 = new int[n14];
        int[] nArray23 = nArray8;
        nArray22[0] = 185;
        nArray23[1] = 133;
        nArray22[2] = 188;
        nArray23[3] = 142;
        nArray22[4] = 4;
        nArray23[5] = 12;
        nArray22[6] = 36;
        nArray23[7] = 108;
        int[] nArray24 = nArray12 = new int[n14];
        int[] nArray25 = nArray12;
        nArray24[0] = 113;
        nArray25[1] = 128;
        nArray24[2] = 173;
        nArray25[3] = 97;
        nArray24[4] = 80;
        nArray25[5] = 29;
        nArray24[6] = 87;
        nArray25[7] = 50;
        int[] nArray26 = object = new int[n14];
        int[] nArray27 = object;
        nArray26[0] = 150;
        nArray27[1] = 28;
        nArray26[2] = 84;
        nArray27[3] = 41;
        nArray26[4] = 123;
        nArray27[5] = 158;
        nArray26[6] = 52;
        nArray27[7] = 156;
        int[] nArray28 = nArray7 = new int[n14];
        int[] nArray29 = nArray7;
        nArray28[0] = 46;
        nArray29[1] = 138;
        nArray28[2] = 203;
        nArray29[3] = 187;
        nArray28[4] = 139;
        nArray29[5] = 206;
        nArray28[6] = 196;
        nArray29[7] = 166;
        int[] nArray30 = nArray6 = new int[n14];
        int[] nArray31 = nArray6;
        nArray30[0] = 76;
        nArray31[1] = 17;
        nArray30[2] = 51;
        nArray31[3] = 153;
        nArray30[4] = 37;
        nArray31[5] = 111;
        nArray30[6] = 122;
        nArray31[7] = 155;
        int[] nArray32 = nArray5 = new int[n14];
        int[] nArray33 = nArray5;
        nArray32[0] = 43;
        nArray33[1] = 129;
        nArray32[2] = 176;
        nArray33[3] = 106;
        nArray32[4] = 107;
        nArray33[5] = 110;
        nArray32[6] = 119;
        nArray33[7] = 146;
        int[] nArray34 = nArray4 = new int[n14];
        int[] nArray35 = nArray4;
        nArray34[0] = 16;
        nArray35[1] = 48;
        nArray34[2] = 144;
        nArray35[3] = 10;
        nArray34[4] = 30;
        nArray35[5] = 90;
        nArray34[6] = 59;
        nArray35[7] = 177;
        int[] nArray36 = nArray3 = new int[n14];
        int[] nArray37 = nArray3;
        nArray36[0] = 109;
        nArray37[1] = 116;
        nArray36[2] = 137;
        nArray37[3] = 200;
        nArray36[4] = 178;
        nArray37[5] = 112;
        nArray36[6] = 125;
        nArray37[7] = 164;
        int[] nArray38 = nArray2 = new int[n14];
        int[] nArray39 = nArray2;
        nArray38[0] = 70;
        nArray39[1] = 210;
        nArray38[2] = 208;
        nArray39[3] = 202;
        nArray38[4] = 184;
        nArray39[5] = 130;
        nArray38[6] = 179;
        nArray39[7] = 115;
        int[] nArray40 = nArray = new int[n14];
        int[] nArray41 = nArray;
        nArray40[0] = 134;
        nArray41[1] = 191;
        nArray40[2] = 151;
        nArray41[3] = 31;
        nArray40[4] = 93;
        nArray41[5] = 68;
        nArray40[6] = 204;
        nArray41[7] = 190;
        int[] nArray42 = nArray;
        int[] nArray43 = nArray = new int[n14];
        int[] nArray44 = nArray;
        nArray43[0] = 148;
        nArray44[1] = 22;
        nArray43[2] = 66;
        nArray44[3] = 198;
        nArray43[4] = 172;
        nArray44[5] = 94;
        nArray43[6] = 71;
        nArray44[7] = 2;
        int[] nArray45 = nArray;
        int[] nArray46 = nArray = new int[n14];
        int[] nArray47 = nArray;
        nArray46[0] = 6;
        nArray47[1] = 18;
        nArray46[2] = 54;
        nArray47[3] = 162;
        nArray46[4] = 64;
        nArray47[5] = 192;
        nArray46[6] = 154;
        nArray47[7] = 40;
        int[] nArray48 = nArray;
        int[] nArray49 = nArray = new int[n14];
        int[] nArray50 = nArray;
        nArray49[0] = 120;
        nArray50[1] = 149;
        nArray49[2] = 25;
        nArray50[3] = 75;
        nArray49[4] = 14;
        nArray50[5] = 42;
        nArray49[6] = 126;
        nArray50[7] = 167;
        int[] nArray51 = nArray;
        int[] nArray52 = nArray = new int[n14];
        int[] nArray53 = nArray;
        nArray52[0] = 79;
        nArray53[1] = 26;
        nArray52[2] = 78;
        nArray53[3] = 23;
        nArray52[4] = 69;
        nArray53[5] = 207;
        nArray52[6] = 199;
        nArray53[7] = 175;
        int[] nArray54 = nArray;
        int[] nArray55 = nArray = new int[n14];
        int[] nArray56 = nArray;
        nArray55[0] = 103;
        nArray56[1] = 98;
        nArray55[2] = 83;
        nArray56[3] = 38;
        nArray55[4] = 114;
        nArray56[5] = 131;
        nArray55[6] = 182;
        nArray56[7] = 124;
        int[] nArray57 = nArray;
        int[] nArray58 = nArray = new int[n14];
        int[] nArray59 = nArray;
        nArray58[0] = 161;
        nArray59[1] = 61;
        nArray58[2] = 183;
        nArray59[3] = 127;
        nArray58[4] = 170;
        nArray59[5] = 88;
        nArray58[6] = 53;
        nArray59[7] = 159;
        int[] nArray60 = nArray;
        int[] nArray61 = nArray = new int[n14];
        int[] nArray62 = nArray;
        nArray61[0] = 55;
        nArray62[1] = 165;
        nArray61[2] = 73;
        nArray62[3] = 8;
        nArray61[4] = 24;
        nArray62[5] = 72;
        nArray61[6] = 5;
        nArray62[7] = 15;
        int[] nArray63 = nArray;
        int[] nArray64 = nArray = new int[n14];
        int[] nArray65 = nArray;
        nArray64[0] = 45;
        nArray65[1] = 135;
        nArray64[2] = 194;
        nArray65[3] = 160;
        nArray64[4] = 58;
        nArray65[5] = 174;
        nArray64[6] = 100;
        nArray65[7] = 89;
        Object object5 = new int[][]{(int[])object2, nArray11, nArray10, nArray13, nArray9, nArray8, nArray12, object, nArray7, nArray6, nArray5, nArray4, nArray3, nArray2, nArray42, nArray45, nArray48, nArray51, nArray54, nArray57, nArray60, nArray63, nArray};
        WEIGHTS = object5;
        int[] nArray66 = nArray6 = new int[6];
        int[] nArray67 = nArray6;
        nArray66[0] = 0;
        nArray67[1] = 4;
        nArray66[2] = 1;
        nArray67[3] = 3;
        nArray66[4] = 3;
        nArray67[5] = 5;
        int[] nArray68 = nArray5 = new int[7];
        int[] nArray69 = nArray5;
        nArray68[0] = 0;
        nArray69[1] = 4;
        nArray68[2] = 1;
        nArray69[3] = 3;
        nArray68[4] = 4;
        nArray69[5] = 5;
        nArray69[6] = 5;
        int[] nArray70 = nArray4 = new int[8];
        int[] nArray71 = nArray4;
        nArray70[0] = 0;
        nArray71[1] = 0;
        nArray70[2] = 1;
        nArray71[3] = 1;
        nArray70[4] = 2;
        nArray71[5] = 2;
        nArray70[6] = 3;
        nArray71[7] = 3;
        int[] nArray72 = nArray2 = new int[9];
        int[] nArray73 = nArray2;
        nArray72[0] = 0;
        nArray73[1] = 0;
        nArray72[2] = 1;
        nArray73[3] = 1;
        nArray72[4] = 2;
        nArray73[5] = 2;
        nArray72[6] = 3;
        nArray73[7] = 4;
        nArray73[8] = 4;
        int n16 = 10;
        int[] nArray74 = nArray7 = new int[n16];
        int[] nArray75 = nArray7;
        nArray74[0] = 0;
        nArray75[1] = 0;
        nArray74[2] = 1;
        nArray75[3] = 1;
        nArray74[4] = 2;
        nArray75[5] = 2;
        nArray74[6] = 3;
        nArray75[7] = 4;
        nArray74[8] = 5;
        nArray75[9] = 5;
        Object object6 = object2 = (Object)new int[11];
        Object object7 = object2;
        object6[0] = (int[])false;
        object7[1] = (int[])false;
        object6[2] = (int[])true;
        object7[3] = (int[])true;
        object6[4] = (int[])2;
        object7[5] = (int[])3;
        object6[6] = (int[])3;
        object7[7] = (int[])4;
        object6[8] = (int[])4;
        object7[9] = (int[])5;
        object7[10] = (int[])5;
        object = new int[n16][];
        nArray = new int[]{0, 0};
        object[0] = (int)nArray;
        int n17 = 1;
        object5 = new int[]{0, n17, n17};
        object[n17] = (int)object5;
        n14 = 3;
        int n18 = 2;
        nArray3 = new int[]{0, n18, n17, n14};
        object[n18] = (int)nArray3;
        n15 = 4;
        nArray9 = new int[]{0, n15, n17, n14, n18};
        object[n14] = (int)nArray9;
        object[n15] = (int)nArray6;
        object[5] = (int)nArray5;
        object[6] = (int)nArray4;
        object[7] = (int)nArray2;
        object[8] = (int)nArray7;
        object[9] = (int)object2;
        FINDER_PATTERN_SEQUENCES = (int[][])object;
    }

    public RSSExpandedReader() {
        Object object = new ArrayList(11);
        this.pairs = object;
        object = new ArrayList();
        this.rows = object;
        object = new int[2];
        this.startEnd = (int[])object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void adjustOddEvenCounts(int var1_1) {
        block39: {
            block40: {
                block35: {
                    block36: {
                        block38: {
                            block37: {
                                var2_2 /* !! */  = this.getOddCounts();
                                var3_3 = MathUtils.sum(var2_2 /* !! */ );
                                var4_4 = this.getEvenCounts();
                                var5_5 = MathUtils.sum(var4_4);
                                var6_6 = 4;
                                var7_7 = 1;
                                var8_8 = false;
                                var9_9 = 13;
                                if (var3_3 > var9_9) {
                                    var10_10 = 0;
                                    var11_11 = true;
                                } else if (var3_3 < var6_6) {
                                    var10_10 = 1;
lbl15:
                                    // 2 sources

                                    while (true) {
                                        var11_11 = false;
                                        break;
                                    }
                                } else {
                                    var10_10 = 0;
                                    ** continue;
                                }
                                if (var5_5 > var9_9) {
                                    var6_6 = 0;
                                    var9_9 = 1;
                                } else if (var5_5 < var6_6) {
                                    var6_6 = 1;
lbl26:
                                    // 2 sources

                                    while (true) {
                                        var9_9 = 0;
                                        break;
                                    }
                                } else {
                                    var6_6 = 0;
                                    ** continue;
                                }
                                var12_12 = var3_3 + var5_5 - var1_1;
                                var1_1 = var3_3 & 1;
                                if (var1_1 == var7_7) {
                                    var1_1 = 1;
                                } else {
                                    var1_1 = 0;
                                    var13_13 = null;
                                }
                                var14_14 = var5_5 & 1;
                                if (var14_14 == 0) {
                                    var8_8 = true;
                                }
                                if (var12_12 == var7_7) {
                                    if (var1_1 != 0) {
                                        if (!var8_8) {
                                            var7_7 = var10_10;
lbl45:
                                            // 2 sources

                                            while (true) {
                                                var11_11 = true;
                                                break block35;
                                                break;
                                            }
                                        }
                                        throw NotFoundException.getNotFoundInstance();
                                    }
                                    if (var8_8) {
                                        var7_7 = var10_10;
                                        while (true) {
                                            var9_9 = 1;
                                            break block35;
                                            break;
                                        }
                                    }
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                var14_14 = -1;
                                if (var12_12 != var14_14) break block36;
                                if (var1_1 == 0) break block37;
                                if (var8_8) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                break block35;
                            }
                            if (!var8_8) break block38;
                            var7_7 = var10_10;
                            var6_6 = 1;
                            break block35;
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (var12_12 != 0) break block39;
                    if (var1_1 != 0) {
                        if (var8_8) {
                            if (var3_3 < var5_5) ** continue;
                            var7_7 = var10_10;
                            var6_6 = 1;
                            ** continue;
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (var8_8) break block40;
                    var7_7 = var10_10;
                }
                if (var7_7 != 0) {
                    if (!var11_11) {
                        var13_13 = this.getOddCounts();
                        var2_2 /* !! */  = (int[])this.getOddRoundingErrors();
                        AbstractRSSReader.increment(var13_13, var2_2 /* !! */ );
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                if (var11_11) {
                    var13_13 = this.getOddCounts();
                    var2_2 /* !! */  = (int[])this.getOddRoundingErrors();
                    AbstractRSSReader.decrement(var13_13, var2_2 /* !! */ );
                }
                if (var6_6 != 0) {
                    if (var9_9 == 0) {
                        var13_13 = this.getEvenCounts();
                        var2_2 /* !! */  = (int[])this.getOddRoundingErrors();
                        AbstractRSSReader.increment(var13_13, var2_2 /* !! */ );
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                if (var9_9 != 0) {
                    var13_13 = this.getEvenCounts();
                    var2_2 /* !! */  = (int[])this.getEvenRoundingErrors();
                    AbstractRSSReader.decrement(var13_13, var2_2 /* !! */ );
                }
                return;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean checkChecksum() {
        Object object;
        int n3;
        Object object2 = (ExpandedPair)this.pairs.get(0);
        DataCharacter dataCharacter = ((ExpandedPair)object2).getLeftChar();
        if ((object2 = ((ExpandedPair)object2).getRightChar()) == null) {
            return false;
        }
        int n4 = ((DataCharacter)object2).getChecksumPortion();
        int n7 = 2;
        boolean bl2 = true;
        for (int i3 = 1; i3 < (n3 = (object = this.pairs).size()); ++i3) {
            object = (ExpandedPair)this.pairs.get(i3);
            DataCharacter dataCharacter2 = ((ExpandedPair)object).getLeftChar();
            int n8 = dataCharacter2.getChecksumPortion() + n4;
            n4 = n7 + 1;
            if ((object = ((ExpandedPair)object).getRightChar()) != null) {
                n4 = ((DataCharacter)object).getChecksumPortion() + n8;
                n7 += 2;
                continue;
            }
            n7 = n4;
            n4 = n8;
        }
        n4 %= 211;
        if ((n7 = (n7 + -4) * 211 + n4) == (n4 = dataCharacter.getValue())) {
            return bl2;
        }
        return false;
    }

    private List checkRows(List list, int n3) {
        Object object;
        int n4;
        while (n3 < (n4 = (object = this.rows).size())) {
            Object object2;
            boolean bl2;
            object = (ExpandedRow)this.rows.get(n3);
            this.pairs.clear();
            ArrayList<Object> arrayList = list.iterator();
            while (bl2 = arrayList.hasNext()) {
                object2 = (ExpandedRow)arrayList.next();
                List list2 = this.pairs;
                object2 = ((ExpandedRow)object2).getPairs();
                list2.addAll(object2);
            }
            arrayList = this.pairs;
            object2 = ((ExpandedRow)object).getPairs();
            arrayList.addAll((Collection<Object>)object2);
            arrayList = this.pairs;
            boolean bl3 = RSSExpandedReader.isValidSequence(arrayList);
            if (bl3) {
                bl3 = this.checkChecksum();
                if (bl3) {
                    return this.pairs;
                }
                arrayList = new ArrayList<Object>(list);
                arrayList.add(object);
                n4 = n3 + 1;
                try {
                    return this.checkRows(arrayList, n4);
                }
                catch (NotFoundException notFoundException) {}
            }
            ++n3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private List checkRows(boolean bl2) {
        ArrayList arrayList = this.rows;
        int n3 = arrayList.size();
        int n4 = 25;
        List list = null;
        if (n3 > n4) {
            this.rows.clear();
            return null;
        }
        arrayList = this.pairs;
        arrayList.clear();
        if (bl2) {
            arrayList = this.rows;
            Collections.reverse(arrayList);
        }
        try {
            arrayList = new ArrayList();
            n4 = 0;
        }
        catch (NotFoundException notFoundException) {}
        list = this.checkRows(arrayList, 0);
        if (bl2) {
            List list2 = this.rows;
            Collections.reverse(list2);
        }
        return list;
    }

    public static Result constructResult(List object) {
        String string2 = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray((List)object)).parseInformation();
        Object object2 = ((ExpandedPair)object.get(0)).getFinderPattern().getResultPoints();
        int n3 = 1;
        object = ((ExpandedPair)on_2.d(n3, (List)object)).getFinderPattern().getResultPoints();
        ResultPoint resultPoint = object2[0];
        object2 = object2[n3];
        ResultPoint resultPoint2 = object[0];
        object = object[n3];
        ResultPoint[] resultPointArray = new ResultPoint[4];
        resultPointArray[0] = resultPoint;
        resultPointArray[n3] = object2;
        resultPointArray[2] = resultPoint2;
        resultPointArray[3] = object;
        object = BarcodeFormat.RSS_EXPANDED;
        Result result2 = new Result(string2, null, resultPointArray, (BarcodeFormat)((Object)object));
        return result2;
    }

    private void findNextPair(BitArray object, List list, int n3) {
        int n4;
        int[] nArray = this.getDecodeFinderCounters();
        nArray[0] = 0;
        int n7 = 1;
        nArray[n7] = 0;
        int n8 = 2;
        nArray[n8] = 0;
        int n10 = 3;
        nArray[n10] = 0;
        int n14 = ((BitArray)object).getSize();
        if (n3 < 0) {
            int[] nArray2;
            n3 = (int)(list.isEmpty() ? 1 : 0);
            if (n3 != 0) {
                n3 = 0;
                nArray2 = null;
            } else {
                nArray2 = ((ExpandedPair)on_2.d(n7, list)).getFinderPattern().getStartEnd();
                n3 = nArray2[n7];
            }
        }
        if ((n4 = list.size() % n8) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            list = null;
        }
        int n15 = this.startFromEven;
        if (n15 != 0) {
            n4 ^= 1;
        }
        n15 = 0;
        while (n3 < n14 && (n15 = ((BitArray)object).get(n3) ^ n7) != 0) {
            ++n3;
        }
        int n16 = n15;
        int n17 = 0;
        n15 = n3;
        while (n3 < n14) {
            int n18 = ((BitArray)object).get(n3);
            if (n18 != n16) {
                nArray[n17] = n18 = nArray[n17] + n7;
            } else {
                if (n17 == n10) {
                    if (n4 != 0) {
                        RSSExpandedReader.reverseCounters(nArray);
                    }
                    if ((n18 = (int)(AbstractRSSReader.isFinderPattern(nArray) ? 1 : 0)) != 0) {
                        object = this.startEnd;
                        object[0] = n15;
                        object[n7] = n3;
                        return;
                    }
                    if (n4 != 0) {
                        RSSExpandedReader.reverseCounters(nArray);
                    }
                    n18 = nArray[0];
                    int n19 = nArray[n7];
                    n15 += (n18 += n19);
                    nArray[0] = n18 = nArray[n8];
                    nArray[n7] = n18 = nArray[n10];
                    nArray[n8] = 0;
                    nArray[n10] = 0;
                    n17 += -1;
                } else {
                    ++n17;
                }
                nArray[n17] = n7;
                n16 ^= 1;
            }
            ++n3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int n3) {
        int n4;
        boolean bl2 = bitArray.get(n3);
        if (bl2) {
            n3 = bitArray.getNextUnset(n3);
            n4 = bitArray.getNextSet(n3);
        } else {
            n3 = bitArray.getNextSet(n3);
            n4 = bitArray.getNextUnset(n3);
        }
        return n4;
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean bl2, boolean bl3) {
        int n3 = finderPattern.getValue();
        return n3 != 0 || !bl2 || !bl3;
        {
        }
    }

    private static boolean isPartialRow(Iterable iterable, Iterable object) {
        boolean bl2;
        object = object.iterator();
        block0: while (bl2 = object.hasNext()) {
            boolean bl3;
            ExpandedRow expandedRow = (ExpandedRow)object.next();
            Iterator iterator = iterable.iterator();
            block1: while (bl3 = iterator.hasNext()) {
                boolean bl4;
                ExpandedPair expandedPair = (ExpandedPair)iterator.next();
                Iterator iterator2 = expandedRow.getPairs().iterator();
                while (bl4 = iterator2.hasNext()) {
                    ExpandedPair expandedPair2 = (ExpandedPair)iterator2.next();
                    bl4 = expandedPair.equals(expandedPair2);
                    if (!bl4) continue;
                    continue block1;
                }
                continue block0;
            }
            return true;
        }
        return false;
    }

    private static boolean isValidSequence(List list) {
        block0: for (int[] nArray : FINDER_PATTERN_SEQUENCES) {
            int n3;
            int n4 = list.size();
            if (n4 > (n3 = nArray.length)) continue;
            for (n4 = 0; n4 < (n3 = list.size()); ++n4) {
                int n7;
                FinderPattern finderPattern = ((ExpandedPair)list.get(n4)).getFinderPattern();
                n3 = finderPattern.getValue();
                if (n3 != (n7 = nArray[n4])) continue block0;
            }
            return true;
        }
        return false;
    }

    private FinderPattern parseFoundFinderPattern(BitArray object, int n3, boolean object22) {
        Object object3;
        Object object4;
        Object object22;
        Object object5;
        Object object6;
        int n4 = 1;
        if (object22 != 0) {
            Object object7;
            object6 = this.startEnd;
            for (object22 = object6[0] - n4; object22 >= 0 && (object5 = (Object)((BitArray)object).get((int)object22)) == 0; object22 += -1) {
            }
            object = this.startEnd;
            object5 = object[0] - (object22 += n4);
            object4 = object7 = object[n4];
            object3 = object22;
        } else {
            object6 = this.startEnd;
            object5 = object6[0];
            object22 = object6[n4] + n4;
            int n7 = ((BitArray)object).getNextUnset((int)object22);
            object6 = this.startEnd;
            object22 = object6[n4];
            object22 = n7 - object22;
            object4 = n7;
            object3 = object5;
            object5 = object22;
        }
        object = this.getDecodeFinderCounters();
        object22 = ((Object)object).length - n4;
        System.arraycopy(object, 0, object, n4, object22);
        object[0] = object5;
        try {
            object6 = FINDER_PATTERNS;
        }
        catch (NotFoundException notFoundException) {
            return null;
        }
        int n8 = AbstractRSSReader.parseFinderValue((int[])object, (int[][])object6);
        int[] nArray = new int[]{object3, (int)object4};
        object = new FinderPattern(n8, nArray, (int)object3, (int)object4, n3);
        return object;
    }

    private static void removePartialRows(List list, List object) {
        boolean bl2;
        object = object.iterator();
        block0: while (bl2 = object.hasNext()) {
            int n3;
            Object object2 = (ExpandedRow)object.next();
            Object object3 = ((ExpandedRow)object2).getPairs();
            int n4 = object3.size();
            if (n4 == (n3 = list.size())) continue;
            object2 = ((ExpandedRow)object2).getPairs().iterator();
            block1: while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                boolean bl3;
                object3 = (ExpandedPair)object2.next();
                Iterator iterator = list.iterator();
                while (bl3 = iterator.hasNext()) {
                    ExpandedPair expandedPair = (ExpandedPair)iterator.next();
                    bl3 = ((ExpandedPair)object3).equals(expandedPair);
                    if (!bl3) continue;
                    continue block1;
                }
                continue block0;
            }
            object.remove();
        }
    }

    private static void reverseCounters(int[] nArray) {
        int n3;
        int n4 = nArray.length;
        for (int i3 = 0; i3 < (n3 = n4 / 2); ++i3) {
            int n7;
            n3 = nArray[i3];
            int n8 = n4 - i3 + -1;
            nArray[i3] = n7 = nArray[n8];
            nArray[n8] = n3;
        }
    }

    private void storeRow(int n3, boolean bl2) {
        Object object;
        int n4;
        int n7;
        boolean bl3 = false;
        List list = null;
        boolean bl4 = false;
        Object object2 = null;
        for (n7 = 0; n7 < (n4 = (object = this.rows).size()); ++n7) {
            object = (ExpandedRow)this.rows.get(n7);
            int n8 = ((ExpandedRow)object).getRowNumber();
            if (n8 > n3) {
                list = this.pairs;
                bl3 = ((ExpandedRow)object).isEquivalent(list);
                break;
            }
            object2 = this.pairs;
            bl4 = ((ExpandedRow)object).isEquivalent((List)object2);
        }
        if (!bl3 && !bl4) {
            list = this.pairs;
            object2 = this.rows;
            bl3 = RSSExpandedReader.isPartialRow(list, (Iterable)object2);
            if (bl3) {
                return;
            }
            list = this.rows;
            object = this.pairs;
            object2 = new ExpandedRow((List)object, n3, bl2);
            list.add(n7, object2);
            List list2 = this.pairs;
            List list3 = this.rows;
            RSSExpandedReader.removePartialRows(list2, list3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean bl2, boolean bl3) {
        int n3;
        float f5;
        int n4;
        int[] nArray;
        int n7;
        int n8;
        int[] nArray2 = this.getDataCharacterCounters();
        int n10 = 0;
        DataCharacter dataCharacter = null;
        for (n8 = 0; n8 < (n7 = nArray2.length); ++n8) {
            nArray2[n8] = 0;
        }
        n8 = 1;
        if (bl3) {
            nArray = finderPattern.getStartEnd();
            n7 = nArray[0];
            OneDReader.recordPatternInReverse(bitArray, n7, nArray2);
        } else {
            n7 = finderPattern.getStartEnd()[n8];
            OneDReader.recordPattern(bitArray, n7, nArray2);
            n4 = nArray2.length - n8;
            f5 = 0.0f;
            nArray = null;
            for (n7 = 0; n7 < n4; ++n7, n4 += -1) {
                int n14;
                n3 = nArray2[n7];
                nArray2[n7] = n14 = nArray2[n4];
                nArray2[n4] = n3;
            }
        }
        n4 = MathUtils.sum(nArray2);
        float f6 = (float)n4 / 17.0f;
        nArray = finderPattern.getStartEnd();
        n7 = nArray[n8];
        int[] nArray3 = finderPattern.getStartEnd();
        n3 = nArray3[0];
        f5 = (float)(n7 - n3) / 15.0f;
        float f7 = Math.abs(f6 - f5) / f5;
        n7 = 1050253722;
        f5 = 0.3f;
        n3 = (int)(f7 == f5 ? 0 : (f7 > f5 ? 1 : -1));
        if (n3 <= 0) {
            int[] nArray4;
            int n15;
            int n16;
            int n17;
            int n18;
            float f8;
            float f11;
            int n19;
            int n20;
            nArray3 = this.getOddCounts();
            int[] nArray5 = this.getEvenCounts();
            float[] fArray = this.getOddRoundingErrors();
            float[] fArray2 = this.getEvenRoundingErrors();
            for (n20 = 0; n20 < (n19 = nArray2.length); ++n20) {
                n19 = nArray2[n20];
                f11 = (float)n19 * 1.0f / f6;
                f8 = 0.5f + f11;
                n18 = (int)f8;
                if (n18 <= 0) {
                    n18 = (int)(f11 == f5 ? 0 : (f11 < f5 ? -1 : 1));
                    if (n18 < 0) throw NotFoundException.getNotFoundInstance();
                    n18 = 1;
                    f8 = Float.MIN_VALUE;
                } else {
                    n17 = 8;
                    if (n18 > n17) {
                        f8 = 8.7f;
                        float f12 = f11 - f8;
                        n18 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                        if (n18 > 0) throw NotFoundException.getNotFoundInstance();
                        n18 = 8;
                        f8 = 1.1E-44f;
                    }
                }
                n17 = n20 / 2;
                n16 = n20 & 1;
                if (n16 == 0) {
                    nArray3[n17] = n18;
                    f8 = n18;
                    fArray[n17] = f11 -= f8;
                    continue;
                }
                nArray5[n17] = n18;
                f8 = n18;
                fArray2[n17] = f11 -= f8;
            }
            f6 = 2.4E-44f;
            RSSExpandedReader rSSExpandedReader = this;
            this.adjustOddEvenCounts(17);
            n4 = finderPattern.getValue();
            n7 = 4;
            f5 = 5.6E-45f;
            n4 *= 4;
            int n21 = 2;
            if (bl2) {
                n15 = 0;
                fArray2 = null;
            } else {
                n15 = 2;
            }
            n4 += n15;
            n15 = bl3 ^ 1;
            n4 = n4 + n15 - n8;
            n20 = 0;
            n19 = 0;
            f11 = 0.0f;
            for (n15 = nArray3.length - n8; n15 >= 0; n15 += -1) {
                n18 = (int)(RSSExpandedReader.isNotA1left(finderPattern, bl2, bl3) ? 1 : 0);
                if (n18 != 0) {
                    nArray4 = WEIGHTS[n4];
                    n17 = n15 * 2;
                    n18 = nArray4[n17];
                    n17 = nArray3[n15] * n18;
                    n20 += n17;
                }
                n18 = nArray3[n15];
                n19 += n18;
            }
            n18 = 0;
            f8 = 0.0f;
            nArray4 = null;
            for (n15 = nArray5.length - n8; n15 >= 0; n15 += -1) {
                n17 = (int)(RSSExpandedReader.isNotA1left(finderPattern, bl2, bl3) ? 1 : 0);
                if (n17 == 0) continue;
                int[] nArray6 = WEIGHTS[n4];
                n16 = n15 * 2 + n8;
                n17 = nArray6[n16];
                n16 = nArray5[n15] * n17;
                n18 += n16;
            }
            n20 += n18;
            n4 = n19 & 1;
            if (n4 != 0) throw NotFoundException.getNotFoundInstance();
            n4 = 13;
            f6 = 1.8E-44f;
            if (n19 > n4) throw NotFoundException.getNotFoundInstance();
            if (n19 < n7) throw NotFoundException.getNotFoundInstance();
            n4 = (n4 - n19) / n21;
            n7 = SYMBOL_WIDEST[n4];
            n21 = 9 - n7;
            n8 = RSSUtils.getRSSvalue(nArray3, n7, n8 != 0);
            n10 = RSSUtils.getRSSvalue(nArray5, n21, false);
            n7 = EVEN_TOTAL_SUBSET[n4];
            n4 = GSUM[n4];
            n4 = a60.a(n8, n7, n10, n4);
            return new DataCharacter(n4, n20);
        }
        RSSExpandedReader rSSExpandedReader = this;
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int n3, BitArray bitArray, Map object) {
        this.pairs.clear();
        object = null;
        this.startFromEven = false;
        try {
            object = this.decodeRow2pairs(n3, bitArray);
        }
        catch (NotFoundException notFoundException) {
            this.pairs.clear();
            this.startFromEven = true;
            return RSSExpandedReader.constructResult(this.decodeRow2pairs(n3, bitArray));
        }
        return RSSExpandedReader.constructResult((List)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List decodeRow2pairs(int n3, BitArray object) {
        boolean bl2;
        boolean bl3 = false;
        Object var4_4 = null;
        while (true) {
            List list;
            bl2 = true;
            if (bl3) break;
            try {
                list = this.pairs;
                ExpandedPair expandedPair = this.retrieveNextPair((BitArray)object, list, n3);
                list.add(expandedPair);
            }
            catch (NotFoundException notFoundException) {
                list = this.pairs;
                boolean bl4 = list.isEmpty();
                if (bl4) {
                    throw notFoundException;
                }
                bl3 = true;
            }
        }
        boolean bl5 = this.checkChecksum();
        if (bl5) {
            return this.pairs;
        }
        object = this.rows;
        bl5 = object.isEmpty() ^ bl2;
        this.storeRow(n3, false);
        if (bl5) {
            List list = this.checkRows(false);
            if (list != null) {
                return list;
            }
            list = this.checkRows(bl2);
            if (list != null) {
                return list;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public List getRows() {
        return this.rows;
    }

    public void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    /*
     * WARNING - void declaration
     */
    public ExpandedPair retrieveNextPair(BitArray object, List object2, int n3) {
        boolean bl2;
        FinderPattern finderPattern;
        boolean bl3;
        int bl32 = object2.size() % 2;
        boolean bl4 = true;
        if (bl32 == 0) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
        }
        int n4 = this.startFromEven;
        if (n4 != 0) {
            void var4_7;
            bl3 = var4_7 ^ 1;
        }
        n4 = -1;
        boolean bl7 = true;
        do {
            this.findNextPair((BitArray)object, (List)object2, n4);
            finderPattern = this.parseFoundFinderPattern((BitArray)object, n3, bl3);
            if (finderPattern == null) {
                int[] nArray = this.startEnd;
                n4 = nArray[0];
                n4 = RSSExpandedReader.getNextSecondBar((BitArray)object, n4);
                continue;
            }
            bl7 = false;
        } while (bl7);
        DataCharacter dataCharacter = this.decodeDataCharacter((BitArray)object, finderPattern, bl3, bl4);
        n4 = (int)(object2.isEmpty() ? 1 : 0);
        if (n4 == 0 && (bl2 = ((ExpandedPair)(object2 = (ExpandedPair)on_2.d((int)(bl4 ? 1 : 0), (List)object2))).mustBeLast())) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            object = this.decodeDataCharacter((BitArray)object, finderPattern, bl3, false);
        }
        catch (NotFoundException notFoundException) {
            object = null;
        }
        object2 = new ExpandedPair(dataCharacter, (DataCharacter)object, finderPattern, bl4);
        return object2;
    }
}

