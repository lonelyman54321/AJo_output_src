/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;
import com.google.zxing.oned.rss.expanded.decoders.DecodedChar;
import com.google.zxing.oned.rss.expanded.decoders.DecodedInformation;
import com.google.zxing.oned.rss.expanded.decoders.DecodedNumeric;
import com.google.zxing.oned.rss.expanded.decoders.DecodedObject;
import com.google.zxing.oned.rss.expanded.decoders.FieldParser;

final class GeneralAppIdDecoder {
    private final StringBuilder buffer;
    private final CurrentParsingState current;
    private final BitArray information;

    public GeneralAppIdDecoder(BitArray bitArray) {
        Object object = new CurrentParsingState();
        this.current = object;
        this.buffer = object = new StringBuilder();
        this.information = bitArray;
    }

    private DecodedChar decodeAlphanumeric(int n3) {
        int n4;
        int n7 = 5;
        int n8 = this.extractNumericValueFromBitArray(n3, n7);
        if (n8 == (n4 = 15)) {
            DecodedChar decodedChar = new DecodedChar(n3 += n7, '$');
            return decodedChar;
        }
        if (n8 >= n7 && n8 < n4) {
            n3 += n7;
            n7 = (char)(n8 + 43);
            DecodedChar decodedChar = new DecodedChar(n3, (char)n7);
            return decodedChar;
        }
        n7 = 6;
        n8 = this.extractNumericValueFromBitArray(n3, n7);
        if (n8 >= (n4 = 32) && n8 < (n4 = 58)) {
            n3 += n7;
            n7 = (char)(n8 + 33);
            DecodedChar decodedChar = new DecodedChar(n3, (char)n7);
            return decodedChar;
        }
        switch (n8) {
            default: {
                String string2 = String.valueOf(n8);
                String string3 = "Decoding invalid alphanumeric value: ".concat(string2);
                IllegalStateException illegalStateException = new IllegalStateException(string3);
                throw illegalStateException;
            }
            case 62: {
                n8 = 47;
                break;
            }
            case 61: {
                n8 = 46;
                break;
            }
            case 60: {
                n8 = 45;
                break;
            }
            case 59: {
                n8 = 44;
                break;
            }
            case 58: {
                n8 = 42;
            }
        }
        DecodedChar decodedChar = new DecodedChar(n3 += n7, (char)n8);
        return decodedChar;
    }

    private DecodedChar decodeIsoIec646(int n3) {
        int n4;
        int n7 = 5;
        int n8 = this.extractNumericValueFromBitArray(n3, n7);
        if (n8 == (n4 = 15)) {
            DecodedChar decodedChar = new DecodedChar(n3 += n7, '$');
            return decodedChar;
        }
        char c2 = '+';
        if (n8 >= n7 && n8 < n4) {
            n3 += n7;
            n7 = (char)(n8 + c2);
            DecodedChar decodedChar = new DecodedChar(n3, (char)n7);
            return decodedChar;
        }
        n7 = 7;
        n8 = this.extractNumericValueFromBitArray(n3, n7);
        n4 = 64;
        int n10 = 90;
        if (n8 >= n4 && n8 < n10) {
            n3 += n7;
            n7 = (char)(n8 + 1);
            DecodedChar decodedChar = new DecodedChar(n3, (char)n7);
            return decodedChar;
        }
        if (n8 >= n10 && n8 < (n4 = 116)) {
            n3 += n7;
            n7 = (char)(n8 + n7);
            DecodedChar decodedChar = new DecodedChar(n3, (char)n7);
            return decodedChar;
        }
        n7 = 8;
        n8 = this.extractNumericValueFromBitArray(n3, n7);
        switch (n8) {
            default: {
                throw FormatException.getFormatInstance();
            }
            case 252: {
                c2 = ' ';
                break;
            }
            case 251: {
                c2 = '_';
                break;
            }
            case 250: {
                c2 = '?';
                break;
            }
            case 249: {
                c2 = '>';
                break;
            }
            case 248: {
                c2 = '=';
                break;
            }
            case 247: {
                c2 = '<';
                break;
            }
            case 246: {
                c2 = ';';
                break;
            }
            case 245: {
                c2 = ':';
                break;
            }
            case 244: {
                c2 = '/';
                break;
            }
            case 243: {
                c2 = '.';
                break;
            }
            case 242: {
                c2 = '-';
                break;
            }
            case 241: {
                c2 = ',';
                break;
            }
            case 239: {
                c2 = '*';
                break;
            }
            case 238: {
                c2 = ')';
                break;
            }
            case 237: {
                c2 = '(';
                break;
            }
            case 236: {
                c2 = '\'';
                break;
            }
            case 235: {
                c2 = '&';
                break;
            }
            case 234: {
                c2 = '%';
                break;
            }
            case 233: {
                c2 = '\"';
                break;
            }
            case 232: {
                c2 = '!';
            }
            case 240: 
        }
        DecodedChar decodedChar = new DecodedChar(n3 += n7, c2);
        return decodedChar;
    }

    private DecodedNumeric decodeNumeric(int n3) {
        int n4 = n3 + 7;
        Object object = this.information;
        int n7 = ((BitArray)object).getSize();
        if (n4 > n7) {
            n3 = this.extractNumericValueFromBitArray(n3, 4);
            n4 = 10;
            if (n3 == 0) {
                n7 = this.information.getSize();
                DecodedNumeric decodedNumeric = new DecodedNumeric(n7, n4, n4);
                return decodedNumeric;
            }
            int n8 = this.information.getSize();
            object = new DecodedNumeric(n8, n3 += -1, n4);
            return object;
        }
        n3 = this.extractNumericValueFromBitArray(n3, 7) + -8;
        n7 = n3 / 11;
        DecodedNumeric decodedNumeric = new DecodedNumeric(n4, n7, n3 %= 11);
        return decodedNumeric;
    }

    public static int extractNumericValueFromBitArray(BitArray bitArray, int n3, int n4) {
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = n3 + i3;
            if ((n8 = (int)(bitArray.get(n8) ? 1 : 0)) == 0) continue;
            n8 = n4 - i3;
            int n10 = 1;
            n8 -= n10;
            n8 = n10 << n8;
            n7 |= n8;
        }
        return n7;
    }

    private boolean isAlphaOr646ToNumericLatch(int n3) {
        int n4 = n3 + 3;
        BitArray bitArray = this.information;
        int n7 = bitArray.getSize();
        if (n4 > n7) {
            return false;
        }
        while (n3 < n4) {
            bitArray = this.information;
            n7 = (int)(bitArray.get(n3) ? 1 : 0);
            if (n7 != 0) {
                return false;
            }
            ++n3;
        }
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int n3) {
        BitArray bitArray;
        int n4;
        int n7 = n3 + 1;
        BitArray bitArray2 = this.information;
        int n8 = bitArray2.getSize();
        if (n7 > n8) {
            return false;
        }
        for (n7 = 0; n7 < (n8 = 5) && (n8 = n7 + n3) < (n4 = (bitArray = this.information).getSize()); ++n7) {
            n4 = 2;
            if (!(n7 == n4 ? (n8 = (int)((bitArray2 = this.information).get(n4 = n3 + 2) ? 1 : 0)) == 0 : (n8 = (int)((bitArray = this.information).get(n8) ? 1 : 0)) != 0)) continue;
            return false;
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int n3) {
        BitArray bitArray;
        int n4;
        int n7 = n3 + 1;
        BitArray bitArray2 = this.information;
        int n8 = bitArray2.getSize();
        if (n7 > n8) {
            return false;
        }
        for (n7 = 0; n7 < (n8 = 4) && (n8 = n7 + n3) < (n4 = (bitArray = this.information).getSize()); ++n7) {
            bitArray = this.information;
            if ((n8 = (int)(bitArray.get(n8) ? 1 : 0)) == 0) continue;
            return false;
        }
        return true;
    }

    private boolean isStillAlpha(int n3) {
        int n4 = n3 + 5;
        BitArray bitArray = this.information;
        int n7 = bitArray.getSize();
        if (n4 > n7) {
            return false;
        }
        n4 = 5;
        n7 = this.extractNumericValueFromBitArray(n3, n4);
        boolean bl2 = true;
        int n8 = 16;
        if (n7 >= n4 && n7 < n8) {
            return bl2;
        }
        n4 = n3 + 6;
        bitArray = this.information;
        n7 = bitArray.getSize();
        if (n4 > n7) {
            return false;
        }
        n4 = 6;
        if ((n3 = this.extractNumericValueFromBitArray(n3, n4)) >= n8 && n3 < (n4 = 63)) {
            return bl2;
        }
        return false;
    }

    private boolean isStillIsoIec646(int n3) {
        int n4 = n3 + 5;
        BitArray bitArray = this.information;
        int n7 = bitArray.getSize();
        if (n4 > n7) {
            return false;
        }
        n4 = 5;
        n7 = this.extractNumericValueFromBitArray(n3, n4);
        boolean bl2 = true;
        if (n7 >= n4 && n7 < (n4 = 16)) {
            return bl2;
        }
        n4 = n3 + 7;
        bitArray = this.information;
        n7 = bitArray.getSize();
        if (n4 > n7) {
            return false;
        }
        n4 = this.extractNumericValueFromBitArray(n3, 7);
        if (n4 >= (n7 = 64) && n4 < (n7 = 116)) {
            return bl2;
        }
        n4 = n3 + 8;
        bitArray = this.information;
        n7 = bitArray.getSize();
        if (n4 > n7) {
            return false;
        }
        if ((n3 = this.extractNumericValueFromBitArray(n3, 8)) >= (n4 = 232) && n3 < (n4 = 253)) {
            return bl2;
        }
        return false;
    }

    private boolean isStillNumeric(int n3) {
        int n4 = n3 + 7;
        BitArray bitArray = this.information;
        int n7 = bitArray.getSize();
        boolean bl2 = true;
        if (n4 > n7) {
            BitArray bitArray2 = this.information;
            n4 = bitArray2.getSize();
            if ((n3 += 4) <= n4) {
                return bl2;
            }
            return false;
        }
        for (n4 = n3; n4 < (n7 = n3 + 3); ++n4) {
            bitArray = this.information;
            n7 = (int)(bitArray.get(n4) ? 1 : 0);
            if (n7 == 0) continue;
            return bl2;
        }
        return this.information.get(n7);
    }

    private BlockParsedResult parseAlphaBlock() {
        int n3;
        int n4;
        Object object;
        int n7;
        Object object2;
        while (true) {
            object2 = this.current;
            n7 = ((CurrentParsingState)object2).getPosition();
            if ((n7 = (int)(this.isStillAlpha(n7) ? 1 : 0)) == 0) break;
            n7 = this.current.getPosition();
            object2 = this.decodeAlphanumeric(n7);
            object = this.current;
            n4 = ((DecodedObject)object2).getNewPosition();
            ((CurrentParsingState)object).setPosition(n4);
            n3 = (int)(((DecodedChar)object2).isFNC1() ? 1 : 0);
            if (n3 != 0) {
                n3 = this.current.getPosition();
                String string2 = this.buffer.toString();
                object2 = new DecodedInformation(n3, string2);
                object = new BlockParsedResult((DecodedInformation)object2, true);
                return object;
            }
            object = this.buffer;
            n7 = ((DecodedChar)object2).getValue();
            ((StringBuilder)object).append((char)n7);
        }
        object2 = this.current;
        n7 = ((CurrentParsingState)object2).getPosition();
        if ((n7 = (int)(this.isAlphaOr646ToNumericLatch(n7) ? 1 : 0)) != 0) {
            object2 = this.current;
            n3 = 3;
            ((CurrentParsingState)object2).incrementPosition(n3);
            object2 = this.current;
            ((CurrentParsingState)object2).setNumeric();
        } else {
            object2 = this.current;
            n7 = ((CurrentParsingState)object2).getPosition();
            if ((n7 = (int)(this.isAlphaTo646ToAlphaLatch(n7) ? 1 : 0)) != 0) {
                object2 = this.current;
                n7 = ((CurrentParsingState)object2).getPosition();
                n3 = 5;
                BitArray bitArray = this.information;
                n4 = bitArray.getSize();
                if ((n7 += n3) < n4) {
                    object2 = this.current;
                    ((CurrentParsingState)object2).incrementPosition(n3);
                } else {
                    object2 = this.current;
                    object = this.information;
                    n3 = ((BitArray)object).getSize();
                    ((CurrentParsingState)object2).setPosition(n3);
                }
                object2 = this.current;
                ((CurrentParsingState)object2).setIsoIec646();
            }
        }
        object2 = new BlockParsedResult(false);
        return object2;
    }

    private DecodedInformation parseBlocks() {
        Object object;
        boolean bl2;
        CurrentParsingState currentParsingState;
        int n3;
        int n4;
        do {
            CurrentParsingState currentParsingState2 = this.current;
            n4 = currentParsingState2.getPosition();
            object = this.current;
            boolean bl3 = ((CurrentParsingState)object).isAlpha();
            if (bl3) {
                object = this.parseAlphaBlock();
                bl2 = ((BlockParsedResult)object).isFinished();
                continue;
            }
            object = this.current;
            bl3 = ((CurrentParsingState)object).isIsoIec646();
            if (bl3) {
                object = this.parseIsoIec646Block();
                bl2 = ((BlockParsedResult)object).isFinished();
                continue;
            }
            object = this.parseNumericBlock();
            bl2 = ((BlockParsedResult)object).isFinished();
        } while ((n4 != (n3 = (currentParsingState = this.current).getPosition()) || bl2) && !bl2);
        return ((BlockParsedResult)object).getDecodedInformation();
    }

    private BlockParsedResult parseIsoIec646Block() {
        int n3;
        int n4;
        Object object;
        int n7;
        Object object2;
        while (true) {
            object2 = this.current;
            n7 = ((CurrentParsingState)object2).getPosition();
            if ((n7 = (int)(this.isStillIsoIec646(n7) ? 1 : 0)) == 0) break;
            n7 = this.current.getPosition();
            object2 = this.decodeIsoIec646(n7);
            object = this.current;
            n4 = ((DecodedObject)object2).getNewPosition();
            ((CurrentParsingState)object).setPosition(n4);
            n3 = (int)(((DecodedChar)object2).isFNC1() ? 1 : 0);
            if (n3 != 0) {
                n3 = this.current.getPosition();
                String string2 = this.buffer.toString();
                object2 = new DecodedInformation(n3, string2);
                object = new BlockParsedResult((DecodedInformation)object2, true);
                return object;
            }
            object = this.buffer;
            n7 = ((DecodedChar)object2).getValue();
            ((StringBuilder)object).append((char)n7);
        }
        object2 = this.current;
        n7 = ((CurrentParsingState)object2).getPosition();
        if ((n7 = (int)(this.isAlphaOr646ToNumericLatch(n7) ? 1 : 0)) != 0) {
            object2 = this.current;
            n3 = 3;
            ((CurrentParsingState)object2).incrementPosition(n3);
            object2 = this.current;
            ((CurrentParsingState)object2).setNumeric();
        } else {
            object2 = this.current;
            n7 = ((CurrentParsingState)object2).getPosition();
            if ((n7 = (int)(this.isAlphaTo646ToAlphaLatch(n7) ? 1 : 0)) != 0) {
                object2 = this.current;
                n7 = ((CurrentParsingState)object2).getPosition();
                n3 = 5;
                BitArray bitArray = this.information;
                n4 = bitArray.getSize();
                if ((n7 += n3) < n4) {
                    object2 = this.current;
                    ((CurrentParsingState)object2).incrementPosition(n3);
                } else {
                    object2 = this.current;
                    object = this.information;
                    n3 = ((BitArray)object).getSize();
                    ((CurrentParsingState)object2).setPosition(n3);
                }
                object2 = this.current;
                ((CurrentParsingState)object2).setAlpha();
            }
        }
        object2 = new BlockParsedResult(false);
        return object2;
    }

    private BlockParsedResult parseNumericBlock() {
        int n4;
        Object object;
        while (true) {
            int n3;
            object = this.current;
            n4 = ((CurrentParsingState)object).getPosition();
            if ((n4 = (int)(this.isStillNumeric(n4) ? 1 : 0)) == 0) break;
            n4 = this.current.getPosition();
            object = this.decodeNumeric(n4);
            Object object2 = this.current;
            boolean bl2 = ((DecodedObject)object).getNewPosition();
            ((CurrentParsingState)object2).setPosition((int)(bl2 ? 1 : 0));
            boolean n32 = ((DecodedNumeric)object).isFirstDigitFNC1();
            bl2 = true;
            if (n32) {
                boolean bl3 = ((DecodedNumeric)object).isSecondDigitFNC1();
                if (bl3) {
                    object2 = this.current;
                    int n7 = ((CurrentParsingState)object2).getPosition();
                    String string2 = this.buffer.toString();
                    object = new DecodedInformation(n7, string2);
                } else {
                    CurrentParsingState currentParsingState = this.current;
                    n3 = currentParsingState.getPosition();
                    String string3 = this.buffer.toString();
                    n4 = ((DecodedNumeric)object).getSecondDigit();
                    object = object2 = new DecodedInformation(n3, string3, n4);
                }
                object2 = new BlockParsedResult((DecodedInformation)object, bl2);
                return object2;
            }
            object2 = this.buffer;
            n3 = ((DecodedNumeric)object).getFirstDigit();
            ((StringBuilder)object2).append(n3);
            n32 = ((DecodedNumeric)object).isSecondDigitFNC1();
            if (n32) {
                int n8 = this.current.getPosition();
                String string4 = this.buffer.toString();
                object = new DecodedInformation(n8, string4);
                object2 = new BlockParsedResult((DecodedInformation)object, bl2);
                return object2;
            }
            object2 = this.buffer;
            n4 = ((DecodedNumeric)object).getSecondDigit();
            ((StringBuilder)object2).append(n4);
        }
        object = this.current;
        n4 = ((CurrentParsingState)object).getPosition();
        if ((n4 = (int)(this.isNumericToAlphaNumericLatch(n4) ? 1 : 0)) != 0) {
            this.current.setAlpha();
            object = this.current;
            int n10 = 4;
            ((CurrentParsingState)object).incrementPosition(n10);
        }
        object = new BlockParsedResult(false);
        return object;
    }

    public String decodeAllCodes(StringBuilder stringBuilder, int n3) {
        Object object = null;
        while (true) {
            int n4;
            String string2;
            if ((string2 = FieldParser.parseFieldsInGeneralPurpose(((DecodedInformation)(object = this.decodeGeneralPurposeField(n3, (String)object))).getNewString())) != null) {
                stringBuilder.append(string2);
            }
            if ((n4 = ((DecodedInformation)object).isRemaining()) != 0) {
                n4 = ((DecodedInformation)object).getRemainingValue();
                string2 = String.valueOf(n4);
            } else {
                n4 = 0;
                string2 = null;
            }
            int n7 = ((DecodedObject)object).getNewPosition();
            if (n3 == n7) break;
            n3 = ((DecodedObject)object).getNewPosition();
            object = string2;
        }
        return stringBuilder.toString();
    }

    public DecodedInformation decodeGeneralPurposeField(int n3, String object) {
        int n4;
        CharSequence charSequence = this.buffer;
        String string2 = null;
        charSequence.setLength(0);
        if (object != null) {
            charSequence = this.buffer;
            charSequence.append((String)object);
        }
        object = this.current;
        ((CurrentParsingState)object).setPosition(n3);
        DecodedInformation decodedInformation = this.parseBlocks();
        if (decodedInformation != null && (n4 = decodedInformation.isRemaining()) != 0) {
            int n7 = this.current.getPosition();
            string2 = this.buffer.toString();
            n3 = decodedInformation.getRemainingValue();
            object = new DecodedInformation(n7, string2, n3);
            return object;
        }
        n4 = this.current.getPosition();
        charSequence = this.buffer.toString();
        decodedInformation = new DecodedInformation(n4, (String)charSequence);
        return decodedInformation;
    }

    public int extractNumericValueFromBitArray(int n3, int n4) {
        return GeneralAppIdDecoder.extractNumericValueFromBitArray(this.information, n3, n4);
    }
}

