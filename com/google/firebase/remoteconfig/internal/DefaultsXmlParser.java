/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class DefaultsXmlParser {
    private static final String XML_TAG_ENTRY = "entry";
    private static final String XML_TAG_KEY = "key";
    private static final String XML_TAG_VALUE = "value";

    public static Map getDefaultsFromXml(Context context, int n3) {
        int n4;
        HashMap<String, String> hashMap;
        block16: {
            hashMap = new HashMap<String, String>();
            context = context.getResources();
            if (context != null) break block16;
            return hashMap;
        }
        context = context.getXml(n3);
        n3 = context.getEventType();
        String string2 = null;
        String string3 = null;
        String string4 = null;
        while (n3 != (n4 = 1)) {
            block17: {
                block24: {
                    block22: {
                        block21: {
                            String string5;
                            block20: {
                                int n7;
                                block23: {
                                    block18: {
                                        block19: {
                                            n7 = 2;
                                            if (n3 == n7) {
                                                string2 = context.getName();
                                                break block17;
                                            }
                                            n7 = 3;
                                            if (n3 != n7) break block23;
                                            string5 = context.getName();
                                            string2 = XML_TAG_ENTRY;
                                            n3 = (int)(string5.equals(string2) ? 1 : 0);
                                            if (n3 == 0) break block18;
                                            if (string3 == null || string4 == null) break block19;
                                            hashMap.put(string3, string4);
                                        }
                                        string3 = null;
                                        string4 = null;
                                    }
                                    string2 = null;
                                    break block17;
                                }
                                n7 = 4;
                                if (n3 != n7 || string2 == null) break block17;
                                n3 = string2.hashCode();
                                n7 = 106079;
                                if (n3 == n7) break block20;
                                n7 = 111972721;
                                if (n3 != n7) break block21;
                                string5 = XML_TAG_VALUE;
                                n3 = (int)(string2.equals(string5) ? 1 : 0);
                                if (n3 == 0) break block21;
                                n3 = 1;
                                break block22;
                            }
                            string5 = XML_TAG_KEY;
                            n3 = (int)(string2.equals(string5) ? 1 : 0);
                            if (n3 == 0) break block21;
                            n3 = 0;
                            string5 = null;
                            break block22;
                        }
                        n3 = -1;
                    }
                    if (n3 == 0) break block24;
                    if (n3 != n4) break block17;
                    string4 = context.getText();
                    break block17;
                }
                string3 = context.getText();
            }
            try {
                n3 = context.next();
                continue;
            }
            catch (IOException | XmlPullParserException throwable) {}
            break;
        }
        return hashMap;
    }
}

