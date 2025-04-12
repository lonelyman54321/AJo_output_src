/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI013103decoder;
import com.google.zxing.oned.rss.expanded.decoders.AI01320xDecoder;
import com.google.zxing.oned.rss.expanded.decoders.AI01392xDecoder;
import com.google.zxing.oned.rss.expanded.decoders.AI01393xDecoder;
import com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder;
import com.google.zxing.oned.rss.expanded.decoders.AI01AndOtherAIs;
import com.google.zxing.oned.rss.expanded.decoders.AnyAIDecoder;
import com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder;

public abstract class AbstractExpandedDecoder {
    private final GeneralAppIdDecoder generalDecoder;
    private final BitArray information;

    public AbstractExpandedDecoder(BitArray bitArray) {
        GeneralAppIdDecoder generalAppIdDecoder;
        this.information = bitArray;
        this.generalDecoder = generalAppIdDecoder = new GeneralAppIdDecoder(bitArray);
    }

    public static AbstractExpandedDecoder createDecoder(BitArray object) {
        int n3 = 1;
        boolean n4 = ((BitArray)object).get(n3);
        if (n4) {
            AI01AndOtherAIs aI013x0x1xDecoder = new AI01AndOtherAIs((BitArray)object);
            return aI013x0x1xDecoder;
        }
        boolean bl2 = ((BitArray)object).get(2);
        if (!bl2) {
            AnyAIDecoder aI013x0x1xDecoder = new AnyAIDecoder((BitArray)object);
            return aI013x0x1xDecoder;
        }
        int n7 = 4;
        int n8 = GeneralAppIdDecoder.extractNumericValueFromBitArray((BitArray)object, n3, n7);
        if (n8 != n7) {
            int n10 = 5;
            if (n8 != n10) {
                int n14 = GeneralAppIdDecoder.extractNumericValueFromBitArray((BitArray)object, n3, n10);
                if (n14 != (n8 = 12)) {
                    n8 = 13;
                    if (n14 != n8) {
                        int n15 = 7;
                        n3 = GeneralAppIdDecoder.extractNumericValueFromBitArray((BitArray)object, n3, n15);
                        String string2 = "11";
                        String string3 = "13";
                        String string4 = "15";
                        String string5 = "17";
                        String string6 = "310";
                        String string7 = "320";
                        switch (n3) {
                            default: {
                                object = String.valueOf(object);
                                object = "unknown decoder: ".concat((String)object);
                                IllegalStateException aI013x0x1xDecoder = new IllegalStateException((String)object);
                                throw aI013x0x1xDecoder;
                            }
                            case 63: {
                                AI013x0x1xDecoder aI013x0x1xDecoder = new AI013x0x1xDecoder((BitArray)object, string7, string5);
                                return aI013x0x1xDecoder;
                            }
                            case 62: {
                                AI013x0x1xDecoder aI013x0x1xDecoder = new AI013x0x1xDecoder((BitArray)object, string6, string5);
                                return aI013x0x1xDecoder;
                            }
                            case 61: {
                                AI013x0x1xDecoder aI013x0x1xDecoder = new AI013x0x1xDecoder((BitArray)object, string7, string4);
                                return aI013x0x1xDecoder;
                            }
                            case 60: {
                                AI013x0x1xDecoder aI01393xDecoder = new AI013x0x1xDecoder((BitArray)object, string6, string4);
                                return aI01393xDecoder;
                            }
                            case 59: {
                                AI013x0x1xDecoder aI01392xDecoder = new AI013x0x1xDecoder((BitArray)object, string7, string3);
                                return aI01392xDecoder;
                            }
                            case 58: {
                                AI013x0x1xDecoder aI01320xDecoder = new AI013x0x1xDecoder((BitArray)object, string6, string3);
                                return aI01320xDecoder;
                            }
                            case 57: {
                                AI013x0x1xDecoder aI013103decoder = new AI013x0x1xDecoder((BitArray)object, string7, string2);
                                return aI013103decoder;
                            }
                            case 56: 
                        }
                        AI013x0x1xDecoder aI013x0x1xDecoder = new AI013x0x1xDecoder((BitArray)object, string6, string2);
                        return aI013x0x1xDecoder;
                    }
                    AI01393xDecoder aI01393xDecoder = new AI01393xDecoder((BitArray)object);
                    return aI01393xDecoder;
                }
                AI01392xDecoder aI01392xDecoder = new AI01392xDecoder((BitArray)object);
                return aI01392xDecoder;
            }
            AI01320xDecoder aI01320xDecoder = new AI01320xDecoder((BitArray)object);
            return aI01320xDecoder;
        }
        AI013103decoder aI013103decoder = new AI013103decoder((BitArray)object);
        return aI013103decoder;
    }

    public final GeneralAppIdDecoder getGeneralDecoder() {
        return this.generalDecoder;
    }

    public final BitArray getInformation() {
        return this.information;
    }

    public abstract String parseInformation();
}

