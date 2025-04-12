/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.zze;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsonUtils {
    private static final Pattern zza = Pattern.compile("\\\\.");
    private static final Pattern zzb = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean areJsonValuesEquivalent(Object object, Object object2) {
        int n3;
        boolean bl2 = true;
        if (object == null && object2 == null) {
            return bl2;
        }
        if (object == null || object2 == null) return false;
        int n4 = object instanceof JSONObject;
        if (n4 != 0 && (n4 = object2 instanceof JSONObject) != 0) {
            int n7;
            object = (JSONObject)object;
            object2 = (JSONObject)object2;
            n4 = object.length();
            if (n4 != (n7 = object2.length())) {
                return false;
            }
            Iterator iterator = object.keys();
            while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                Object object3 = (String)iterator.next();
                boolean bl3 = object2.has((String)object3);
                if (bl3) {
                    Preconditions.checkNotNull(object3);
                    Object object4 = object.get((String)object3);
                    object3 = object2.get((String)object3);
                    n7 = (int)(JsonUtils.areJsonValuesEquivalent(object4, object3) ? 1 : 0);
                    if (n7 != 0) continue;
                }
                return false;
            }
            return bl2;
        }
        n4 = object instanceof JSONArray;
        if (n4 == 0 || (n4 = object2 instanceof JSONArray) == 0) return object.equals(object2);
        object = (JSONArray)object;
        object2 = (JSONArray)object2;
        n4 = object.length();
        if (n4 != (n3 = object2.length())) return false;
        Object var5_7 = null;
        for (n4 = 0; n4 < (n3 = object.length()); ++n4) {
            Object object5;
            try {
                object5 = object.get(n4);
            }
            catch (JSONException jSONException) {}
            Object object6 = object2.get(n4);
            n3 = (int)(JsonUtils.areJsonValuesEquivalent(object5, object6) ? 1 : 0);
            if (n3 == 0) return false;
            continue;
            return false;
        }
        return bl2;
        catch (JSONException jSONException) {
            return false;
        }
    }

    public static String escapeString(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            int n3;
            Matcher matcher = zzb.matcher(string2);
            StringBuffer stringBuffer = null;
            block5: while ((n3 = matcher.find()) != 0) {
                int n4;
                String string3;
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                if ((n3 = (string3 = matcher.group()).charAt(0)) != (n4 = 12)) {
                    n4 = 13;
                    if (n3 != n4) {
                        n4 = 34;
                        if (n3 != n4) {
                            n4 = 47;
                            if (n3 != n4) {
                                n4 = 92;
                                if (n3 != n4) {
                                    switch (n3) {
                                        default: {
                                            continue block5;
                                        }
                                        case 10: {
                                            string3 = "\\\\n";
                                            matcher.appendReplacement(stringBuffer, string3);
                                            continue block5;
                                        }
                                        case 9: {
                                            string3 = "\\\\t";
                                            matcher.appendReplacement(stringBuffer, string3);
                                            continue block5;
                                        }
                                        case 8: 
                                    }
                                    string3 = "\\\\b";
                                    matcher.appendReplacement(stringBuffer, string3);
                                    continue;
                                }
                                string3 = "\\\\\\\\";
                                matcher.appendReplacement(stringBuffer, string3);
                                continue;
                            }
                            string3 = "\\\\/";
                            matcher.appendReplacement(stringBuffer, string3);
                            continue;
                        }
                        string3 = "\\\\\\\"";
                        matcher.appendReplacement(stringBuffer, string3);
                        continue;
                    }
                    string3 = "\\\\r";
                    matcher.appendReplacement(stringBuffer, string3);
                    continue;
                }
                string3 = "\\\\f";
                matcher.appendReplacement(stringBuffer, string3);
            }
            if (stringBuffer != null) {
                matcher.appendTail(stringBuffer);
                string2 = stringBuffer.toString();
            }
        }
        return string2;
    }

    public static String unescapeString(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            int n3;
            object = zze.zza((String)object);
            Matcher matcher = zza.matcher((CharSequence)object);
            StringBuffer stringBuffer = null;
            while ((n3 = matcher.find()) != 0) {
                int n4;
                String string2;
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                if ((n3 = (string2 = matcher.group()).charAt(1)) != (n4 = 34)) {
                    n4 = 47;
                    if (n3 != n4) {
                        n4 = 92;
                        if (n3 != n4) {
                            n4 = 98;
                            if (n3 != n4) {
                                n4 = 102;
                                if (n3 != n4) {
                                    n4 = 110;
                                    if (n3 != n4) {
                                        n4 = 114;
                                        if (n3 != n4) {
                                            n4 = 116;
                                            if (n3 == n4) {
                                                string2 = "\t";
                                                matcher.appendReplacement(stringBuffer, string2);
                                                continue;
                                            }
                                            object = new IllegalStateException("Found an escaped character that should never be.");
                                            throw object;
                                        }
                                        string2 = "\r";
                                        matcher.appendReplacement(stringBuffer, string2);
                                        continue;
                                    }
                                    string2 = "\n";
                                    matcher.appendReplacement(stringBuffer, string2);
                                    continue;
                                }
                                string2 = "\f";
                                matcher.appendReplacement(stringBuffer, string2);
                                continue;
                            }
                            string2 = "\b";
                            matcher.appendReplacement(stringBuffer, string2);
                            continue;
                        }
                        string2 = "\\\\";
                        matcher.appendReplacement(stringBuffer, string2);
                        continue;
                    }
                    string2 = "/";
                    matcher.appendReplacement(stringBuffer, string2);
                    continue;
                }
                string2 = "\"";
                matcher.appendReplacement(stringBuffer, string2);
            }
            if (stringBuffer == null) {
                return object;
            }
            matcher.appendTail(stringBuffer);
            object = stringBuffer.toString();
        }
        return object;
    }
}

