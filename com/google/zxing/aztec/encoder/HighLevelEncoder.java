/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.HighLevelEncoder$1;
import com.google.zxing.aztec.encoder.State;
import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP;
    static final int[][] LATCH_TABLE;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final String[] MODE_NAMES;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER;
    static final int[][] SHIFT_TABLE;
    private final byte[] text;

    static {
        Object object;
        int n3;
        int n4;
        int n7 = 12;
        int n8 = 44;
        int n10 = 13;
        int n14 = 46;
        String string2 = "LOWER";
        String string3 = "DIGIT";
        MODE_NAMES = new String[]{"UPPER", string2, string3, "MIXED", "PUNCT"};
        int n15 = 5;
        Object object2 = new int[n15][];
        int n16 = 327708;
        int n17 = 327710;
        int n18 = 327709;
        int n19 = 656318;
        int[] nArray = new int[]{0, n16, n17, n18, n19};
        object2[0] = nArray;
        nArray = new int[]{590318, 0, n17, n18, n19};
        int n20 = 1;
        object2[n20] = nArray;
        int n21 = 262158;
        Object object3 = new int[]{n21, 590300, 0, 590301, 932798};
        int n22 = 2;
        object2[n22] = object3;
        object3 = new int[]{n18, n16, n19, 0, n17};
        int n24 = 3;
        object2[n24] = object3;
        n17 = 656382;
        n18 = 656381;
        object3 = new int[]{327711, 656380, n17, n18, 0};
        n16 = 4;
        object2[n16] = object3;
        LATCH_TABLE = object2;
        object3 = new int[n22];
        object3[n20] = n4 = 256;
        object3[0] = n15;
        Object object4 = Integer.TYPE;
        object3 = (int[][])Array.newInstance(object4, object3);
        CHAR_MAP = (int[][])object3;
        object3 = object3[0];
        n15 = 32;
        object3[n15] = n20;
        for (n3 = 65; n3 <= (n4 = 90); n3 += n20) {
            object2 = CHAR_MAP[0];
            n17 = n3 + -63;
            object2[n3] = (int[])n17;
        }
        object3 = CHAR_MAP[n20];
        object3[n15] = n20;
        for (n3 = 97; n3 <= (n4 = 122); n3 += n20) {
            object2 = CHAR_MAP[n20];
            n17 = n3 + -95;
            object2[n3] = (int[])n17;
        }
        object3 = CHAR_MAP[n22];
        object3[n15] = n20;
        for (n3 = 48; n3 <= (n15 = 57); n3 += n20) {
            object4 = CHAR_MAP[n22];
            n4 = n3 + -46;
            object4[n3] = n4;
        }
        object3 = CHAR_MAP[n22];
        object3[n8] = n7;
        object3[n14] = n10;
        n3 = 28;
        int[] nArray2 = object = new int[n3];
        int[] nArray3 = object;
        nArray2[0] = 0;
        nArray3[1] = 32;
        nArray2[2] = 1;
        nArray3[3] = 2;
        nArray2[4] = 3;
        nArray3[5] = 4;
        nArray2[6] = 5;
        nArray3[7] = 6;
        nArray2[8] = 7;
        nArray3[9] = 8;
        nArray2[10] = 9;
        nArray3[11] = 10;
        nArray2[12] = 11;
        nArray3[13] = 12;
        nArray2[14] = 13;
        nArray3[15] = 27;
        nArray2[16] = 28;
        nArray3[17] = 29;
        nArray2[18] = 30;
        nArray3[19] = 31;
        nArray2[20] = 64;
        nArray3[21] = 92;
        nArray2[22] = 94;
        nArray3[23] = 95;
        nArray2[24] = 96;
        nArray3[25] = 124;
        nArray2[26] = 126;
        nArray3[27] = 127;
        for (n8 = 0; n8 < n3; n8 += n20) {
            object3 = CHAR_MAP[n24];
            n10 = object[n8];
            object3[n10] = n8;
            n3 = 28;
        }
        n3 = 31;
        int[] nArray4 = object = new int[n3];
        int[] nArray5 = object;
        nArray4[0] = 0;
        nArray5[1] = 13;
        nArray4[2] = 0;
        nArray5[3] = 0;
        nArray4[4] = 0;
        nArray5[5] = 0;
        nArray4[6] = 33;
        nArray5[7] = 39;
        nArray4[8] = 35;
        nArray5[9] = 36;
        nArray4[10] = 37;
        nArray5[11] = 38;
        nArray4[12] = 39;
        nArray5[13] = 40;
        nArray4[14] = 41;
        nArray5[15] = 42;
        nArray4[16] = 43;
        nArray5[17] = 44;
        nArray4[18] = 45;
        nArray5[19] = 46;
        nArray4[20] = 47;
        nArray5[21] = 58;
        nArray4[22] = 59;
        nArray5[23] = 60;
        nArray4[24] = 61;
        nArray5[25] = 62;
        nArray4[26] = 63;
        nArray5[27] = 91;
        nArray4[28] = 93;
        nArray5[29] = 123;
        nArray5[30] = 125;
        for (n8 = 0; n8 < n3; n8 += n20) {
            n10 = object[n8];
            if (n10 <= 0) continue;
            int[] nArray6 = CHAR_MAP[n16];
            nArray6[n10] = n8;
        }
        object3 = new int[n22];
        object3[n20] = n7 = 6;
        object3[0] = n7;
        object = Integer.TYPE;
        object3 = (int[][])Array.newInstance(object, object3);
        SHIFT_TABLE = (int[][])object3;
        n7 = ((int[])object3).length;
        for (n8 = 0; n8 < n7; n8 += n20) {
            int n25 = object3[n8];
            n14 = -1;
            Arrays.fill((int[])n25, n14);
        }
        object3 = SHIFT_TABLE;
        object3[0][n16] = false;
        object = object3[n20];
        object[n16] = 0;
        object[0] = 28;
        object3[n24][n16] = false;
        object3 = object3[n22];
        object3[n16] = 0;
        object3[0] = 15;
    }

    public HighLevelEncoder(byte[] byArray) {
        this.text = byArray;
    }

    private static Collection simplifyStates(Iterable object) {
        boolean bl2;
        LinkedList<State> linkedList = new LinkedList<State>();
        object = object.iterator();
        block0: while (bl2 = object.hasNext()) {
            boolean bl3;
            State state = (State)object.next();
            Iterator iterator = linkedList.iterator();
            while (bl3 = iterator.hasNext()) {
                State state2 = (State)iterator.next();
                boolean bl4 = state2.isBetterThanOrEqualTo(state);
                if (bl4) continue block0;
                bl3 = state.isBetterThanOrEqualTo(state2);
                if (!bl3) continue;
                iterator.remove();
            }
            linkedList.add(state);
        }
        return linkedList;
    }

    private void updateStateForChar(State state, int n3, Collection collection) {
        block12: {
            block11: {
                int n4;
                byte[] byArray = this.text;
                Object object = (char)(byArray[n3] & 0xFF);
                Object object2 = CHAR_MAP;
                int n7 = state.getMode();
                object2 = object2[n7];
                Object object3 = object2[object];
                n7 = 0;
                if (object3 > 0) {
                    object3 = true;
                } else {
                    object3 = false;
                    object2 = null;
                }
                State state2 = null;
                while (n7 <= (n4 = 4)) {
                    Object object4 = CHAR_MAP[n7];
                    n4 = object4[object];
                    if (n4 > 0) {
                        Object object5;
                        Object object6;
                        if (state2 == null) {
                            state2 = state.endBinaryShift(n3);
                        }
                        if (object3 == false || n7 == (object6 = state.getMode()) || n7 == (object6 = 2)) {
                            object5 = state2.latchAndAppend(n7, n4);
                            collection.add(object5);
                        }
                        if (object3 == false) {
                            object5 = SHIFT_TABLE;
                            int n8 = state.getMode();
                            object6 = (object5 = object5[n8])[n7];
                            if (object6 >= 0) {
                                object4 = state2.shiftAndAppend(n7, n4);
                                collection.add(object4);
                            }
                        }
                    }
                    ++n7;
                }
                object3 = state.getBinaryShiftByteCount();
                if (object3 > 0) break block11;
                object2 = CHAR_MAP;
                n7 = state.getMode();
                object = (object2 = (Object)object2[n7])[object];
                if (object != 0) break block12;
            }
            state = state.addBinaryShiftChar(n3);
            collection.add(state);
        }
    }

    private static void updateStateForPair(State state, int n3, int n4, Collection collection) {
        State state2 = state.endBinaryShift(n3);
        int n7 = 4;
        State state3 = state2.latchAndAppend(n7, n4);
        collection.add(state3);
        int n8 = state.getMode();
        if (n8 != n7) {
            state3 = state2.shiftAndAppend(n7, n4);
            collection.add(state3);
        }
        n8 = 3;
        int n10 = 1;
        if (n4 == n8 || n4 == n7) {
            n4 = 16 - n4;
            n7 = 2;
            State state4 = state2.latchAndAppend(n7, n4).latchAndAppend(n7, n10);
            collection.add(state4);
        }
        if ((n4 = state.getBinaryShiftByteCount()) > 0) {
            state = state.addBinaryShiftChar(n3);
            state = state.addBinaryShiftChar(n3 += n10);
            collection.add(state);
        }
    }

    private Collection updateStateListForChar(Iterable object, int n3) {
        boolean bl2;
        LinkedList linkedList = new LinkedList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            State state = (State)object.next();
            this.updateStateForChar(state, n3, linkedList);
        }
        return HighLevelEncoder.simplifyStates(linkedList);
    }

    private static Collection updateStateListForPair(Iterable object, int n3, int n4) {
        boolean bl2;
        LinkedList linkedList = new LinkedList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            State state = (State)object.next();
            HighLevelEncoder.updateStateForPair(state, n3, n4, linkedList);
        }
        return HighLevelEncoder.simplifyStates(linkedList);
    }

    /*
     * Unable to fully structure code
     */
    public BitArray encode() {
        var1_1 = Collections.singletonList(State.INITIAL_STATE);
        var2_2 = null;
        for (var3_3 = 0; var3_3 < (var5_5 = (var4_4 = this.text).length); ++var3_3) {
            block4: {
                block5: {
                    block6: {
                        block7: {
                            var5_5 = var3_3 + 1;
                            var6_6 = var4_4.length;
                            var6_6 = var5_5 < var6_6 ? var4_4[var5_5] : 0;
                            var7_7 = var4_4[var3_3];
                            var8_8 = 13;
                            if (var7_7 == var8_8) break block5;
                            var8_8 = 44;
                            var9_9 = 32;
                            if (var7_7 == var8_8) break block6;
                            var8_8 = 46;
                            if (var7_7 == var8_8) break block7;
                            var8_8 = 58;
                            if (var7_7 != var8_8) lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    var7_7 = 0;
                                    var4_4 = null;
                                    break block4;
                                    break;
                                }
                            }
                            if (var6_6 != var9_9) ** GOTO lbl-1000
                            var7_7 = 5;
                            break block4;
                        }
                        if (var6_6 != var9_9) ** GOTO lbl-1000
                        var7_7 = 3;
                        break block4;
                    }
                    if (var6_6 != var9_9) ** GOTO lbl-1000
                    var7_7 = 4;
                    break block4;
                }
                var7_7 = 10;
                if (var6_6 == var7_7) ** break;
                ** continue;
                var7_7 = 2;
            }
            if (var7_7 > 0) {
                var1_1 = HighLevelEncoder.updateStateListForPair((Iterable)var1_1, var3_3, var7_7);
                var3_3 = var5_5;
                continue;
            }
            var1_1 = this.updateStateListForChar((Iterable)var1_1, var3_3);
        }
        var2_2 = new HighLevelEncoder$1(this);
        var1_1 = Collections.min(var1_1, var2_2);
        var2_2 = this.text;
        return var1_1.toBitArray((byte[])var2_2);
    }
}

