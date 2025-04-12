/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.Pair;
import com.google.zxing.oned.rss.RSSUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class RSS14Reader
extends AbstractRSSReader {
    private static final int[][] FINDER_PATTERNS;
    private static final int[] INSIDE_GSUM;
    private static final int[] INSIDE_ODD_TOTAL_SUBSET;
    private static final int[] INSIDE_ODD_WIDEST;
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET;
    private static final int[] OUTSIDE_GSUM;
    private static final int[] OUTSIDE_ODD_WIDEST;
    private final List possibleLeftPairs;
    private final List possibleRightPairs;

    static {
        int n3 = 1;
        OUTSIDE_EVEN_TOTAL_SUBSET = new int[]{n3, 10, 34, 70, 126};
        int n4 = 4;
        INSIDE_ODD_TOTAL_SUBSET = new int[]{n4, 20, 48, 81};
        OUTSIDE_GSUM = new int[]{0, 161, 961, 2015, 2715};
        INSIDE_GSUM = new int[]{0, 336, 1036, 1516};
        int n7 = 8;
        int n8 = 6;
        int n10 = 3;
        OUTSIDE_ODD_WIDEST = new int[]{n7, n8, n4, n10, n3};
        int n14 = 2;
        INSIDE_ODD_WIDEST = new int[]{n14, n4, n8, n7};
        int n15 = 9;
        int[][] nArrayArray = new int[n15][];
        int[] nArray = new int[]{n10, n7, n14, n3};
        nArrayArray[0] = nArray;
        int n16 = 5;
        nArray = new int[]{n10, n16, n16, n3};
        nArrayArray[n3] = nArray;
        int n17 = 7;
        int[] nArray2 = new int[]{n10, n10, n17, n3};
        nArrayArray[n14] = nArray2;
        nArray2 = new int[]{n10, n3, n15, n3};
        nArrayArray[n10] = nArray2;
        nArray2 = new int[]{n14, n17, n4, n3};
        nArrayArray[n4] = nArray2;
        int[] nArray3 = new int[]{n14, n16, n8, n3};
        nArrayArray[n16] = nArray3;
        nArray3 = new int[]{n14, n10, n7, n3};
        nArrayArray[n8] = nArray3;
        int[] nArray4 = new int[]{n3, n16, n17, n3};
        nArrayArray[n17] = nArray4;
        nArray4 = new int[]{n3, n10, n15, n3};
        nArrayArray[n7] = nArray4;
        FINDER_PATTERNS = nArrayArray;
    }

    public RSS14Reader() {
        ArrayList arrayList;
        this.possibleLeftPairs = arrayList = new ArrayList();
        this.possibleRightPairs = arrayList = new ArrayList();
    }

    private static void addOrTally(Collection collection, Pair pair) {
        block2: {
            boolean bl2;
            if (pair == null) {
                return;
            }
            Iterator iterator = collection.iterator();
            while (bl2 = iterator.hasNext()) {
                int n3;
                Pair pair2 = (Pair)iterator.next();
                int n4 = pair2.getValue();
                if (n4 != (n3 = pair.getValue())) continue;
                pair2.incrementCount();
                break block2;
            }
            collection.add(pair);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void adjustOddEvenCounts(boolean var1_1, int var2_2) {
        block47: {
            block48: {
                block43: {
                    block44: {
                        block46: {
                            block45: {
                                var3_3 = this.getOddCounts();
                                var4_4 = MathUtils.sum(var3_3);
                                var5_5 = this.getEvenCounts();
                                var6_6 = MathUtils.sum(var5_5);
                                var7_7 = 4;
                                var8_8 = 1;
                                var9_9 = false;
                                if (var1_1 == 0) ** GOTO lbl35
                                var10_10 = 12;
                                if (var4_4 > var10_10) {
                                    var11_11 = 0;
                                    var12_12 = true;
                                } else if (var4_4 < var7_7) {
                                    var11_11 = 1;
lbl16:
                                    // 2 sources

                                    while (true) {
                                        var12_12 = false;
                                        break;
                                    }
                                } else {
                                    var11_11 = 0;
                                    ** continue;
                                }
                                if (var6_6 > var10_10) {
                                    while (true) {
                                        var7_7 = 0;
                                        var10_10 = 1;
                                        break;
                                    }
                                } else if (var6_6 < var7_7) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var7_7 = 1;
lbl29:
                                        // 2 sources

                                        while (true) {
                                            var10_10 = 0;
                                            ** GOTO lbl51
                                            break;
                                        }
                                        break;
                                    }
                                } else {
                                    while (true) {
                                        var7_7 = 0;
                                        ** continue;
                                        break;
                                    }
lbl35:
                                    // 1 sources

                                    var10_10 = 11;
                                    if (var4_4 > var10_10) {
                                        var11_11 = 0;
                                        var12_12 = true;
                                    } else {
                                        var10_10 = 5;
                                        if (var4_4 < var10_10) {
                                            var11_11 = 1;
lbl43:
                                            // 2 sources

                                            while (true) {
                                                var12_12 = false;
                                                break;
                                            }
                                        } else {
                                            var11_11 = 0;
                                            ** continue;
                                        }
                                    }
                                    if (var6_6 > (var10_10 = 10)) ** continue;
                                    if (var6_6 >= var7_7) ** continue;
                                    ** continue;
                                }
lbl51:
                                // 2 sources

                                var13_13 = var4_4 + var6_6 - var2_2;
                                var2_2 = var4_4 & 1;
                                if (var2_2 == var1_1) {
                                    var1_1 = 1;
                                } else {
                                    var1_1 = 0;
                                    var14_14 = null;
                                }
                                var2_2 = var6_6 & 1;
                                if (var2_2 == var8_8) {
                                    var9_9 = true;
                                }
                                if (var13_13 == var8_8) {
                                    if (var1_1 != 0) {
                                        if (!var9_9) {
                                            var8_8 = var11_11;
lbl65:
                                            // 2 sources

                                            while (true) {
                                                var12_12 = true;
                                                break block43;
                                                break;
                                            }
                                        }
                                        throw NotFoundException.getNotFoundInstance();
                                    }
                                    if (var9_9) {
                                        var8_8 = var11_11;
                                        while (true) {
                                            var10_10 = 1;
                                            break block43;
                                            break;
                                        }
                                    }
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                var2_2 = -1;
                                if (var13_13 != var2_2) break block44;
                                if (var1_1 == 0) break block45;
                                if (var9_9) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                break block43;
                            }
                            if (!var9_9) break block46;
                            var8_8 = var11_11;
                            var7_7 = 1;
                            break block43;
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (var13_13 != 0) break block47;
                    if (var1_1 != 0) {
                        if (var9_9) {
                            if (var4_4 < var6_6) ** continue;
                            var8_8 = var11_11;
                            var7_7 = 1;
                            ** continue;
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (var9_9) break block48;
                    var8_8 = var11_11;
                }
                if (var8_8 != 0) {
                    if (!var12_12) {
                        var14_14 = this.getOddCounts();
                        var15_15 = this.getOddRoundingErrors();
                        AbstractRSSReader.increment(var14_14, var15_15);
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                if (var12_12) {
                    var14_14 = this.getOddCounts();
                    var15_15 = this.getOddRoundingErrors();
                    AbstractRSSReader.decrement(var14_14, var15_15);
                }
                if (var7_7 != 0) {
                    if (var10_10 == 0) {
                        var14_14 = this.getEvenCounts();
                        var15_15 = this.getOddRoundingErrors();
                        AbstractRSSReader.increment(var14_14, var15_15);
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                if (var10_10 != 0) {
                    var14_14 = this.getEvenCounts();
                    var15_15 = this.getEvenRoundingErrors();
                    AbstractRSSReader.decrement(var14_14, var15_15);
                }
                return;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static boolean checkChecksum(Pair object, Pair object2) {
        int n3 = ((DataCharacter)object).getChecksumPortion();
        int n4 = (((DataCharacter)object2).getChecksumPortion() * 16 + n3) % 79;
        object = ((Pair)object).getFinderPattern();
        int n7 = ((FinderPattern)object).getValue() * 9;
        int n8 = ((FinderPattern)(object2 = ((Pair)object2).getFinderPattern())).getValue() + n7;
        if (n8 > (n7 = 72)) {
            n8 += -1;
        }
        if (n8 > (n7 = 8)) {
            n8 += -1;
        }
        return n4 == n8;
    }

    private static Result constructResult(Pair object, Pair object2) {
        char c2;
        int n3 = 3;
        int n4 = 1;
        int n7 = object.getValue();
        long l2 = (long)n7 * 4537077L;
        long l3 = object2.getValue();
        Object object3 = String.valueOf(l2 += l3);
        CharSequence charSequence = new StringBuilder(14);
        int n8 = ((String)object3).length();
        int n10 = 13;
        n8 = 13 - n8;
        while (true) {
            c2 = '0';
            if (n8 <= 0) break;
            charSequence.append(c2);
            n8 += -1;
        }
        charSequence.append((String)object3);
        object3 = null;
        n8 = 0;
        ResultPoint resultPoint = null;
        for (n7 = 0; n7 < n10; n7 += n4) {
            int n14 = charSequence.charAt(n7) - c2;
            int n15 = n7 & 1;
            if (n15 == 0) {
                n14 *= 3;
            }
            n8 += n14;
        }
        n7 = 10;
        n8 %= n7;
        if ((n8 = 10 - n8) == n7) {
            n8 = 0;
            resultPoint = null;
        }
        charSequence.append(n8);
        object = object.getFinderPattern().getResultPoints();
        object2 = object2.getFinderPattern().getResultPoints();
        charSequence = charSequence.toString();
        resultPoint = object[0];
        object = object[n4];
        ResultPoint resultPoint2 = object2[0];
        object2 = object2[n4];
        ResultPoint[] resultPointArray = new ResultPoint[4];
        resultPointArray[0] = resultPoint;
        resultPointArray[n4] = object;
        resultPointArray[2] = resultPoint2;
        resultPointArray[n3] = object2;
        object = BarcodeFormat.RSS_14;
        object3 = new Result((String)charSequence, null, resultPointArray, (BarcodeFormat)((Object)object));
        return object3;
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern object, boolean bl2) {
        int n3;
        int n4;
        int n7;
        float f5;
        int n8;
        Object object2;
        int n10;
        int n14;
        int[] nArray = this.getDataCharacterCounters();
        DataCharacter dataCharacter = null;
        for (n14 = 0; n14 < (n10 = nArray.length); ++n14) {
            nArray[n14] = 0;
        }
        n14 = 1;
        if (bl2) {
            object = ((FinderPattern)object).getStartEnd();
            object2 = object[0];
            OneDReader.recordPatternInReverse(bitArray, (int)object2, nArray);
        } else {
            object2 = ((FinderPattern)object).getStartEnd()[n14] + n14;
            OneDReader.recordPattern(bitArray, (int)object2, nArray);
            n8 = nArray.length - n14;
            f5 = 0.0f;
            object = null;
            for (object2 = (Object)false; object2 < n8; ++object2, n8 += -1) {
                int n15;
                n10 = nArray[object2];
                nArray[object2] = n15 = nArray[n8];
                nArray[n8] = n10;
            }
        }
        n8 = bl2 ? 16 : 15;
        object2 = MathUtils.sum(nArray);
        f5 = (float)object2;
        float f6 = n8;
        f5 /= f6;
        int[] nArray2 = this.getOddCounts();
        int[] nArray3 = this.getEvenCounts();
        float[] fArray = this.getOddRoundingErrors();
        float[] fArray2 = this.getEvenRoundingErrors();
        for (n7 = 0; n7 < (n4 = nArray.length); ++n7) {
            int n16;
            n4 = nArray[n7];
            float f7 = (float)n4 / f5;
            float f8 = 0.5f + f7;
            int n17 = (int)f8;
            if (n17 <= 0) {
                n17 = 1;
                f8 = Float.MIN_VALUE;
            } else {
                n16 = 8;
                if (n17 > n16) {
                    n17 = 8;
                    f8 = 1.1E-44f;
                }
            }
            n16 = n7 / 2;
            int n18 = n7 & 1;
            if (n18 == 0) {
                nArray2[n16] = n17;
                f8 = n17;
                fArray[n16] = f7 -= f8;
                continue;
            }
            nArray3[n16] = n17;
            f8 = n17;
            fArray2[n16] = f7 -= f8;
        }
        this.adjustOddEvenCounts(bl2, n8);
        object2 = false;
        f5 = 0.0f;
        object = null;
        int n19 = 0;
        nArray = null;
        for (n8 = nArray2.length - n14; n8 >= 0; n8 += -1) {
            object2 *= 9;
            n3 = nArray2[n8];
            object2 += n3;
            n19 += n3;
        }
        n3 = 0;
        fArray = null;
        int n20 = 0;
        fArray2 = null;
        for (n8 = nArray3.length - n14; n8 >= 0; n8 += -1) {
            n3 *= 9;
            n7 = nArray3[n8];
            n3 += n7;
            n20 += n7;
        }
        n3 = n3 * 3 + object2;
        n8 = 4;
        if (bl2) {
            object2 = n19 & 1;
            if (object2 == false) {
                object2 = 12;
                f5 = 1.7E-44f;
                if (n19 <= object2 && n19 >= n8) {
                    object2 = (object2 - n19) / 2;
                    n8 = OUTSIDE_ODD_WIDEST[object2];
                    int n21 = 9 - n8;
                    n8 = RSSUtils.getRSSvalue(nArray2, n8, false);
                    int n22 = RSSUtils.getRSSvalue(nArray3, n21, n14 != 0);
                    n19 = OUTSIDE_EVEN_TOTAL_SUBSET[object2];
                    object2 = OUTSIDE_GSUM[object2];
                    n8 = a60.a(n8, n19, n22, (int)object2);
                    dataCharacter = new DataCharacter(n8, n3);
                    return dataCharacter;
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
        object2 = n20 & true;
        if (object2 == false) {
            object2 = 10;
            f5 = 1.4E-44f;
            if (n20 <= object2 && n20 >= n8) {
                object2 = (object2 - n20) / 2;
                n8 = INSIDE_ODD_WIDEST[object2];
                int n24 = 9 - n8;
                n8 = RSSUtils.getRSSvalue(nArray2, n8, n14 != 0);
                int n25 = RSSUtils.getRSSvalue(nArray3, n24, false);
                n19 = INSIDE_ODD_TOTAL_SUBSET[object2];
                object2 = INSIDE_GSUM[object2];
                n8 = a60.a(n25, n19, n8, (int)object2);
                dataCharacter = new DataCharacter(n8, n3);
                return dataCharacter;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /*
     * WARNING - void declaration
     */
    private Pair decodePair(BitArray object, boolean bl2, int n3, Map object2) {
        Object object3;
        int n4;
        DecodeHintType decodeHintType;
        int n7;
        Object object4;
        FinderPattern finderPattern;
        void var3_5;
        int[] nArray;
        block23: {
            block22: {
                try {
                    nArray = this.findFinderPattern((BitArray)object, bl2);
                }
                catch (NotFoundException notFoundException) {
                    return null;
                }
                finderPattern = this.parseFoundFinderPattern((BitArray)object, (int)var3_5, bl2, nArray);
                if (object4 != null) break block22;
                n7 = 0;
                object4 = null;
                break block23;
            }
            decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
            object4 = object4.get((Object)decodeHintType);
            object4 = (ResultPointCallback)object4;
        }
        decodeHintType = null;
        int n8 = 1;
        if (object4 != null) {
            int n10 = nArray[0];
            n4 = nArray[n8];
            float f5 = n10 + n4;
            n10 = 0x40000000;
            float f6 = 2.0f;
            f5 /= f6;
            if (bl2) {
                int n14 = ((BitArray)object).getSize() - n8;
                float f7 = n14;
                f5 = f7 - f5;
            }
            float f8 = (float)var3_5;
            object3 = new ResultPoint(f5, f8);
            object4.foundPossibleResultPoint((ResultPoint)object3);
        }
        object3 = this.decodeDataCharacter((BitArray)object, finderPattern, n8 != 0);
        object = this.decodeDataCharacter((BitArray)object, finderPattern, false);
        n7 = ((DataCharacter)object3).getValue() * 1597;
        n4 = ((DataCharacter)object).getValue();
        n7 += n4;
        int n15 = ((DataCharacter)object3).getChecksumPortion();
        int n16 = ((DataCharacter)object).getChecksumPortion() * 4 + n15;
        Pair pair = new Pair(n7, n16, finderPattern);
        return pair;
    }

    private int[] findFinderPattern(BitArray bitArray, boolean n3) {
        int n4;
        int[] nArray = this.getDecodeFinderCounters();
        nArray[0] = 0;
        int n7 = 1;
        nArray[n7] = 0;
        int n8 = 2;
        nArray[n8] = 0;
        int n10 = 3;
        nArray[n10] = 0;
        int n14 = bitArray.getSize();
        int n15 = 0;
        for (n4 = 0; n4 < n14 && n3 != (n15 = bitArray.get(n4) ^ n7); ++n4) {
        }
        n3 = n4;
        int n16 = 0;
        while (n4 < n14) {
            int n17 = bitArray.get(n4);
            if (n17 != n15) {
                nArray[n16] = n17 = nArray[n16] + n7;
            } else {
                if (n16 == n10) {
                    n17 = (int)(AbstractRSSReader.isFinderPattern(nArray) ? 1 : 0);
                    if (n17 != 0) {
                        return new int[]{n3, n4};
                    }
                    n17 = nArray[0];
                    int n18 = nArray[n7];
                    n3 += (n17 += n18);
                    nArray[0] = n17 = nArray[n8];
                    nArray[n7] = n17 = nArray[n10];
                    nArray[n8] = 0;
                    nArray[n10] = 0;
                    n16 += -1;
                } else {
                    ++n16;
                }
                nArray[n16] = n7;
                n15 ^= 1;
            }
            ++n4;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /*
     * WARNING - void declaration
     */
    private FinderPattern parseFoundFinderPattern(BitArray object, int n3, boolean bl2, int[] nArray) {
        int n4;
        int n7;
        boolean bl3;
        void var4_6;
        int n8 = 0;
        int[][] nArray2 = null;
        boolean bl4 = var4_6[0];
        bl4 = ((BitArray)object).get((int)(bl4 ? 1 : 0));
        void var8_10 = var4_6[0];
        int n10 = 1;
        var8_10 -= n10;
        while (var8_10 >= 0 && bl4 != (bl3 = ((BitArray)object).get((int)var8_10))) {
            var8_10 += -1;
        }
        bl4 = var4_6[0] - (var8_10 += n10);
        int[] nArray3 = this.getDecodeFinderCounters();
        int n14 = nArray3.length - n10;
        System.arraycopy(nArray3, 0, nArray3, n10, n14);
        nArray3[0] = (int)(bl4 ? 1 : 0);
        nArray2 = FINDER_PATTERNS;
        int n15 = AbstractRSSReader.parseFinderValue(nArray3, nArray2);
        n8 = var4_6[n10];
        if (bl2) {
            int n16;
            int n17 = ((BitArray)object).getSize() - n10 - var8_10;
            n7 = n16 = ((BitArray)object).getSize() - n10 - n8;
            n4 = n17;
        } else {
            n7 = n8;
            n4 = var8_10;
        }
        void var3_5 = var4_6[n10];
        int[] nArray4 = new int[]{var8_10, var3_5};
        object = new FinderPattern(n15, nArray4, n4, n7, n3);
        return object;
    }

    public Result decodeRow(int n3, BitArray object, Map iterator) {
        boolean bl2;
        Pair pair = this.decodePair((BitArray)object, false, n3, (Map)((Object)iterator));
        Object object2 = this.possibleLeftPairs;
        RSS14Reader.addOrTally((Collection)object2, pair);
        ((BitArray)object).reverse();
        int n4 = 1;
        Object object3 = this.decodePair((BitArray)object, n4 != 0, n3, (Map)((Object)iterator));
        iterator = this.possibleRightPairs;
        RSS14Reader.addOrTally((Collection)((Object)iterator), (Pair)object3);
        ((BitArray)object).reverse();
        object3 = this.possibleLeftPairs.iterator();
        while (bl2 = object3.hasNext()) {
            boolean bl3;
            object = (Pair)object3.next();
            int n7 = ((Pair)object).getCount();
            if (n7 <= n4) continue;
            iterator = this.possibleRightPairs.iterator();
            while (bl3 = iterator.hasNext()) {
                object2 = (Pair)iterator.next();
                int n8 = ((Pair)object2).getCount();
                if (n8 <= n4 || (n8 = (int)(RSS14Reader.checkChecksum((Pair)object, (Pair)object2) ? 1 : 0)) == 0) continue;
                return RSS14Reader.constructResult((Pair)object, (Pair)object2);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }
}

